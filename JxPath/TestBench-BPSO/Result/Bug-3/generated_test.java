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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:-128>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<s:`>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<s:k6dz>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:7>", "50", "<s:>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/a b {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a b, getPropertyNames=[], isActual=false,...#298#1985881096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-42"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "']"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='&apos;]'][-41] {getIndex=-42, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName='], getPropertyNames=[], isActu...#306#384908552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNo...#222#644194673", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:6>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=true, is...#276#1855790979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"-2147483648\u00e9"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "{\"`\"D:1}"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:4>", "<sample:0>", "-56"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='{&quot;`&quot;D:1}'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName={\"`\"D:1}, getProp...#327#350348003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[-2147483648] {getIndex=2147483647, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActua...#305#1309253199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"*"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='*'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=f...#303#-582485549", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"-0.0L"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:0>", "<sample:8>", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<null>", ""}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:9>", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "0x1F"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", "java.lang.String", "\n"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "<i:-16777214>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDec...#264#-129025237", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:5>", "<i:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:5>", "false", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "2020-"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='2020-'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=2020-, getPropertyNames=[], is...#311#1482232161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:8>", "<sample:8>"}}, 1), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:4>", "<s:l[ez>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDec...#264#-129025237", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:fb>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "false"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:6>", "<sample:8>", "-536871936"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"/aa.b"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "uurue"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/uurue {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=uurue, getPropertyNames=[], isActual=fa...#302#-40137210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:4>", "true", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}}, 1), new String[][]{{"getImmediateValuePointer", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=t...#231#221204614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", ""}}, 1), new String[][]{{"isActual", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaa,aaaaa`aaaaaaaaaa"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "false"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:0>", "<d:1.5>"}, true, 0, null, 1), new String[][]{{"isAttribute", "", "5"}, {"isLeaf", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}}, 3), new String[][]{{"getPosition", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:1>", "true", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "'appos;"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<null>", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/'appos; {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName='appos;, getPropertyNames=[], isActua...#306#-639241284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "4']"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='4&apos;]'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=4'], getPropertyNames=[], i...#312#-25692270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", "java.lang.String", "Cannot set prop"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<i:1>", "<empty>"}, true, 0, null, 1), new String[][]{{"getNamespaceResolver", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "42"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[43] {getIndex=42, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttrib...#288#-277333370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", ""}}, 2), new String[][]{{"getNodePointer", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<s:a>"}}, 1), new String[][]{{"isAttribute", "", "2"}, {"isContainer", "", "2"}, {"getNamespaceResolver", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<s:bbb>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:0>", "<sample:8>", "-5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"b1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"-0\u00e90"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:1>"}}, 1), new String[][]{{"reset", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<i:-1>"}}, 1), new String[][]{{"getNodePointer", "", "4"}, {"getPosition", "", "6"}, {"getNodePointer", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:3>", "<null>", "-1073741824"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:4>", "<sample:6>", "74"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:6>"}}, 3), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", "java.lang.String", "D0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "010", "2020-02-30T25:61:61"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.1234577890123456"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:5>", "<i:-1048576>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDec...#264#-129025237", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("* {getName=*, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-42"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", "int", "-1073743872"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:5>", "<sample:7>", "-2147483648", "<s:kez>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:0>", "<sample:4>", "1"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890\u00e9"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "6."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='123456789012345678901234567890\u00e9'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1234...#363#-1800567825", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<null>", "<sample:6>", "-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "\n1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:5>", "1.1234567", "Factory "}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:6>", "false", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:0>", "<i:70>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "\t&apos;"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<null>", "<sample:6>", "<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'a' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#149996488", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='0x1F'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=0x1F, getPropertyNames=[], isAc...#309#256631967", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:2>", "<i:70>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLe...#235#-503665482", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "true", "<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='PT1H'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=PT1H, getPropertyNames=[], isAc...#309#969040863", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "&apos;\t"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}}), new String[][]{{"printPointerChain", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true...#228#-1010695189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/&apos;\t {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=&apos;\t, getPropertyNames=[], isActual=false, isAttribu...#288#54438896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "12p:30:4", "&apos;"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:4>", "true", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"1E,5"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<i:35>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "1.1234567890123A56"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/1.1234567890123A56 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.1234567890123A56, getPro...#328#11597486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1.123456789X1234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1.123456789X1234567'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.123456789X1234...#339#-1816676313", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"//b"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "0x1F"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/0x1F {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=0x1F, getPropertyNames=[], isActual=fals...#300#1730196942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:3>", "<s:>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=t...#231#1763306355", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<s:0>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'0' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#-1757929833", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:7>", "<sample:0>", "2147483605"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "'ttp://"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/'ttp:// {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName='ttp://, getPropertyNames=[], isActua...#306#-1826593052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:0>", "123456789012345678901234567890\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=aaaaaaaaaaaaaa...#352#83166894", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"*u"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*u {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*u, getPropertyNames=[], isActual=false, i...#296#147307086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"130988"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:1>", "<sample:0>", "-2147483639", "<s:`>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "true", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:2>", "<d:0.3>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("0.3 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#710134560", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>", "<sample:8>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", "java.lang.String", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"2147483648PT1H"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='2147483648PT1H'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=2147483648PT1H, getPr...#329#148741439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "-1", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:3>", "<null>", "<sample:0>"}, true), new String[][]{{"getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "1.c5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'[@name='1.c5'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.c5, getPropertyNames=[], isActual=false, isAttribute=fal...#282#1025191274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false), new String[][]{{"getImmediateNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<null>", "true", "<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "\u00ea\u00ea"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/\u00ea\u00ea {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=\u00ea\u00ea, getPropertyNames=[], isActual=false, isAttribute=false, ...#278#-306931698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<null>", "<sample:1>", "<s:bd>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'bd' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode...#219#577599575", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[1] {getIndex=0, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribut...#286#425460310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:1>", "true", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<s:kez>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:1>", "ITLE", "tru"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNo...#222#644194673", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "0"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "\u00e9-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/\u00e9-1.5[1] {getIndex=0, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=\u00e9-1.5, getPropertyNames=[], isActual=false, is...#294#-64087274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "20220-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:1>", "<null>", "1", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[1] {getIndex=0, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribut...#286#425460310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[-2147483648] {getIndex=2147483647, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActua...#305#1309253199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:0>", "-2147483648", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"attributeIterator", "org.apache.commons.jxpath.ri.QName", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012D34567890\u00e9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/1234567890123456789012D34567890\u00e9 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=123456789012...#356#1348305006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:5>", "<s:bn>", "<sample:3>"}, true), new String[][]{{"isLanguage", "java.lang.String", "2"}, {"setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'bn' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode...#219#353405537", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:7>", "http://example.com/a?b=c", "l"}}), new String[][]{{"setPosition", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", "java.lang.String", "http://example.com/a?bq=c"}}), new String[][]{{"getNamespaceURI", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1.25'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.25, getPropertyNames=[], isAc...#309#-2133897793", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"/100xFFFFFFFF"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:3>", "/a/b+1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}}), new String[][]{{"isCollection", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[-2147483646] {getIndex=-2147483647, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActu...#306#-2012079116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"http://exanple.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/http://exanple.com/a?b=c {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=http://exanple.com/a...#340#1797107790", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/\t {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=\t, getPropertyNames=[], isActual=false, isA...#294#-788706284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "\n\n1"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample[@name='\n\n1'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclara...#260#1275544354", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='\n\n1'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=\n\n1, getPropertyNames=[], isActu...#307#636752289", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", ""}}), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='a,b,c'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a,b,c, getPropertyNames=[], is...#311#-778578149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:5>", "<sample:3>", "1073711104", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "12;30:451.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='12;30:451.12345678901234567'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=12;30:45...#354#-517928870", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", ",1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name=',1'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=,1, getPropertyNames=[], isActual...#305#1988526559", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "1"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[2] {getIndex=1, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribut...#286#1674790070", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:5>", "a,b,c2020-02-30T25:61:61", "&apos;\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false), new String[][]{{"attributeIterator", "org.apache.commons.jxpath.ri.QName", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'a' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#149996488", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:4>"}, false), new String[][]{{"getPosition", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<s:key>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'key' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNod...#220#-154309242", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<b:true>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "Sitle1e10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/Sitle1e10 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=Sitle1e10, getPropertyNames=[], isActual=false, isAttribute=fa...#283#1388781291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:1>", "<i:2>", "<sample:3>"}, true), new String[][]{{"getNamespaceURI", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-42"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/*[-41] {getIndex=-42, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=t...#263#-103316215", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<null>", "<sample:4>"}}), new String[][]{{"getNamespaceURI", "java.lang.String", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", ""}}), new String[][]{{"getPropertyPointer", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/*/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, ...#278#107542545", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"1073743872"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "false"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "*-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='*-0.0'][1073743873] {getIndex=1073743872, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*-0.0, getPropertyN...#321#-1755323409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false), new String[][]{{"setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "4"}, {"asPath", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-1073743872"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[-1073743871] {getIndex=-1073743872, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActu...#306#-988586636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"{\"a\":0}"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/{\"a\":0} {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName={\"a\":0}, getPropertyNames=[], isActua...#306#-1556100480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", "java.lang.String", "a,b,cFactory "}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "2:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/2:30:45 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=2:30:45, getPropertyNames=[], isActual=false, isAttribute=false,...#279#-993489405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "<a>b</a>1.5a"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='<a>b</a>1.5a'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=<a>b</a>1.5a, getProper...#325#-122238337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}}), new String[][]{{"createNodeIterator", "java.lang.String,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:2>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:6>", "<i:1>"}, true), new String[][]{{"namespaceIterator", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:5>", "true", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<s:a2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'a2' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode...#219#1105081094", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "12:30-:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/12:30-:45 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=12:30-:45, getPropertyNames=[], isA...#310#1856258890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"TitLe"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<null>", "<null>", "<i:140>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("140 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#-1752072280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"isDynamicPropertyDeclarationSupported", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<b:true>"}}), new String[][]{{"namespaceIterator", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<i:-262144>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("-262144 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isN...#222#-1445125371", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[-2147483646] {getIndex=-2147483647, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActu...#306#-2012079116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:1>", "<sample:6>", "2147483647"}}), new String[][]{{"getValuePointer", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:3>", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/ {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=, getPropertyNames=[], isActual=false, isAtt...#292#-815580882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1L'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1L, getPropertyNames=[], isActual...#304#1498903210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "20"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[21] {getIndex=20, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttrib...#288#1701305094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:1>", "<sample:3>", "-2147483648", "<s:j>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", ""}}, 1), new String[][]{{"getPrefix", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:2>", "<sample:1>", "-2147483647", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "false", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='a'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=[], isActual=f...#303#1880120385", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "0xcFFFFFFFF"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/0xcFFFFFFFF {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=0xcFFFFFFFF, getPropertyNames=[],...#314#-1959058312", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getImmediateParentPointer", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("* {getName=*, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"2.5f1.5d"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:5>", "6.x"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:3>"}}, 1), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("5. {getName=5., getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='5.'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=5., getPropertyNames=[], isActual...#305#-15637409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2147483648 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2...#345#1986224099", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/*[11] {getIndex=10, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=tru...#261#-446541351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}}), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:4>", "<sample:0>", "2147483647", "<s:keFz>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "0xx1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='0xx1F'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=0xx1F, getPropertyNames=[], is...#311#260576457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", "java.lang.String", ""}}), new String[][]{{"getNodePointer", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:3>", "--1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:5>", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
}
