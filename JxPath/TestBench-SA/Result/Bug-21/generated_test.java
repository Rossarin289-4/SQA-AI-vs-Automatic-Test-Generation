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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<s:n>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<null>", "<sample:6>", "-1073741823"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getParent", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:0>", "<sample:5>", "-2147483647", "<i:-1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:4>", "<sample:7>", "-2147483648"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:4>", "2147483647", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:7>", "1.12345678", "aadaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=:a, getPropertyNames=!NullPointerException, isActual=true, isAttribut...#287#1498158643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:2>", "<null>", "2147483647", "<i:48>"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<null>", "TITLE", "<s:tn>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:5>", "<null>", "-2147483648"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:3>", "<sample:0>", "0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "clone", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getRootNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isAttribute", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getValuePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "-2u14748364X8", "1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/@* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual...#304#986717130", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{".."}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/.. {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=.., getPropertyNames=!NullPointerException, isActua...#306#20140397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"./"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/./ {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=./, getPropertyNames=!NullPointerException, isActua...#306#-1960874227", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/@* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual...#304#986717130", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/@* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=...#284#-1639588908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyName", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/@a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=t...#283#1855612065", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyName", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/@* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribut...#286#1192792249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyName", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"134567890123456789012345668901"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:2>", "<sample:3>", "2147483647", "<s:jey>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "<null>", "2020-01-01"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:0>", "<sample:2>", "2147483647", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "<null>", "2020-01-01"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:0>", "<sample:2>", "2147483647", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "<null>", "2020-01-01"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:0>", "<sample:2>", "2147483647", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#1595746376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "<null>", "2020-01-01"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:0>", "<sample:2>", "2147483647", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/ {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#-1448526500", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"  \u00e8\n"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2147483647, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#377282355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"0.5+1L\t"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-1073741823"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-1073741823, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#-1239937017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"0.5+1L\t"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483647, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2081199024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActualProperty", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareTo", "java.lang.Object", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActualProperty", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "+1", "Hello, World"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", "[1,2]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", "0x123456789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/0x123456789 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=0x123456789, getPropertyNames=!NullPointer...#324#-1969883083", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=1, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#1522997362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "<sample:6>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:5>", "1.12345678901234567", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActualProperty", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "escape", "java.lang.String", ".6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=sample, getPropertyNames=!NullPointerException, isActual=true, is...#295#869219923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isDefaultNamespace", "java.lang.String", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#387052916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isContainer", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setAttribute", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/@* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=...#284#-1639588908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:4>", "1.12345678", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isLeaf", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=1, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, is...#276#-2039708129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\n>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateParentPointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:6>", "<sample:1>", "-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyNames", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:0>", "<sample:1>", "-6"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"5.."}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483647, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2081199024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"5..,"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483647, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#618612885", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:4>", "<sample:0>", "-2147483648"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:4>", "2147483647", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:7>", "1.12345678", "aadaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=...#285#-829828281", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:6>", "<sample:7>", "-2147483648"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:4>", "2147483647", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:1>", "1.12345678", "aadaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 3), new String[][]{{"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespacePointer", "java.lang.String", "1.1234567890123456"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:6>", "<null>", "2147483647"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:4>", "2147483647", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:1>", "<null>", "aadaaaaaaaaabaaaaaaaaaaaaaaaaa"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/sample {getIndex=2147483647, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=sample, getPropertyNames=!NullPointerException, isActual=false, is...#295#-1640873856", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:3>", "<sample:0>", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "true", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "true", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActualProperty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBean", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/--1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=--1, getPropertyNames=!NullPointerException, isAct...#308#112479725", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isDefaultNamespace", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#-60366492", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false), new String[][]{{"isNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isContainer", ""}}), new String[][]{{"isNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "-2147483648", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isDefaultNamespace", "java.lang.String", "5."}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isContainer", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<null>", ".5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/@* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual...#304#986717130", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/1.5f {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=1.5f, getPropertyNames=!NullPointerException, isA...#310#1221617133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{".5f"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/.5f {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=.5f, getPropertyNames=!NullPointerException, isAct...#308#-787792495", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"/5f"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1//5f {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=/5f, getPropertyNames=!NullPointerException, isAct...#308#-1480147121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"."}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/. {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=., getPropertyNames=!NullPointerException, isActual=...#304#324241075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{".."}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/.. {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=.., getPropertyNames=!NullPointerException, isActua...#306#20140397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:5>", "Title", "<s:b>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[null], isActual=false, isAttribute=false, isColle...#271#498805713", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getValuePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:3>", "<sample:4>", "2147483647", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespaceIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "escape", "java.lang.String", ".5"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setValue", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "escape", "java.lang.String", ".5"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setValue", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("* {getName=*, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("* {getName=*, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}}), new String[][]{{"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("* {getName=*, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483647, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#442811356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-1073741823"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-1073741823, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#-559140472", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=2147483647, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=f...#303#2063118709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "clone", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-1, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-465232131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "clone", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActualProperty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "<null>", "2020-01-01"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:0>", "<sample:2>", "2147483647", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "<null>", "2020-01-01"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:0>", "<sample:2>", "2147483647", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "<null>", "2020-01-01"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:0>", "<sample:2>", "2147483647", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "<null>", "2020-01-01"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:0>", "<sample:2>", "2147483647", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setExceptionHandler", new String[]{"org.apache.commons.jxpath.ExceptionHandler"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:1>", "true", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:1>", "true", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "2020a02-30T25:61:61.1234567890123456", "1.123467"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActualProperty", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActualProperty", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "escape", "java.lang.String", ".5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=sample, getPropertyNames=!NullPointerException, isActual=true, is...#295#869219923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=2147483647, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=...#285#-156105646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "2147450879"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=2147450879, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=...#285#-2045636909", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "2147450879"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=2147450879, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=fa...#283#1188131928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "2147450879"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=2147450879, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttr...#291#2066155967", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBaseValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActual", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:5>", "1", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=fa...#283#-1891026740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "handle", new String[]{"java.lang.Throwable", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "handle", new String[]{"java.lang.Throwable", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:5>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("1/0:sample {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true,...#227#-66355002", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<null>", "<sample:5>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("null() {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isN...#222#550737049", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<null>", "<sample:4>", "<s:key>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'key' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNod...#220#-154309242", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:4>", "<s:key>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, ...#226#-937974074", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:10>", "<sample:5>", "<s:k:ey>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("$0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLea...#234#-696531073", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:7>", "<s:k:Hey>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1/:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode...#220#-723263623", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:7>", "<s:k9Hey4>"}, true), new String[][]{{"setAttribute", "boolean", "4"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=1, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, is...#276#-2039708129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "-49"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-49, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, ...#278#604913534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "-49"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/a {getIndex=-49, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, ...#278#-2014856816", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:4>", "1E-5"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isRoot", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespaceIterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "-1"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-1, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, isC...#275#585468723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "-1"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-1, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-465232131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[null, null, null], isActual=false, isAttribute=fals...#281#1231150249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:5>", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:5>", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "-2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483647, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#745215378", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:6>", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("1/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode...#220#2029601932", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<null>", "<sample:1>", "-6"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<null>", "<sample:1>", "-6"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:2>", "<null>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"5."}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483647, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2081199024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483647, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#618612885", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.123456789012t456"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "1.12345678901234567", "1e10"}}), new String[][]{{"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:4>", "12:30:45", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:5>", "<sample:3>", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:1>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:1>", "<sample:4>", "-2147483647", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:2>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#-60366492", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "false", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:4>", "\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:6>", "<sample:7>", "-2147483648"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:4>", "2147483647", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "<sample:2>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:7>", "1.12345678", "aadaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=:a, getPropertyNames=!NullPointerException, isActual=true, isAttribut...#287#1498158643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBean", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:6>", "<null>", "2147483647"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:9>", "2147483647", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:1>", "I", "aadaaaaaaaaabaaaaaaaaaaaaaaaaa"}}, 3), new String[][]{{"namespacePointer", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/sample {getIndex=-2147483648, getLength=!NullPointerException, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=sample, getPropertyNames=!NullPointerExceptio...#343#-585732058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:2>", "<sample:1>", "2147483636"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:9>", "2147483647", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:1>", "I", "aadaaaaaaaaabaaaaaaaaaaaaaaaaa"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample {getIndex=2147483636, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=0:sample, getPropertyNames=!NullPointerException, isActual=false...#299#-258510324", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:2>", "<sample:0>", "2147483592"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:9>", "2147483647", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:1>", "II", "aadaaaaaaaaabaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/a {getIndex=2147483592, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=false, isAttribute=...#285#-1461826607", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:1>", "<sample:7>", "2147483592"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:9>", "2147483647", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:1>", "II", "aadaaaaaaaaabaaaaaaa`aaaaaaaaa"}}, 3), new String[][]{{"isNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-6"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-6, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, isC...#275#104875953", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:2>", "<null>", "1073741820"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isDefaultNamespace", "java.lang.String", "\u00e9"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}}), new String[][]{{"getImmediateNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"-11e10"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=2, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#955025139", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceResolver", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<null>", "1.1234567", "5."}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<null>", "1.1234567", "5."}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=1, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, isCo...#274#977160331", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespaceIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespaceIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespacePointer", "java.lang.String", "-0.E00"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespacePointer", "java.lang.String", "-0.E00"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=sample, getPropertyNames=!NullPointerException, isActual=true, isAt...#293#-416988776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 23, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:0>", "J"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "handle", new String[]{"java.lang.Throwable"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyName", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceResolver", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "handle", new String[]{"java.lang.Throwable"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyName", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceResolver", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:5>", "false", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "asPath", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<null>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:5>", "<sample:6>", "-1", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:5>", "<sample:6>", "-2147483648", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:5>", "<sample:6>", "-2147483648", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:5>", "<sample:6>", "-2147483648", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:5>", "<sample:6>", "-2147483648", "<s:m>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:5>", "<sample:6>", "-2147483648", "<s:m>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAtt...#292#-755056278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:7>", "<sample:1>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#-60366492", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/a {getIndex=-2147483648, getLength=!NullPointerException, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=...#331#636122733", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<null>", "<sample:7>", "2147483614", "<s:o>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespacePointer", "java.lang.String", "2020-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=fa...#283#-1891026740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<null>", "<sample:7>", "2147483614", "<s:o>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 53, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<null>", "<sample:8>", "1073741823", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=fa...#283#-1891026740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-1, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, isC...#275#901493583", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-67108865"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-67108865, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=fal...#282#-657376925", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-33554432"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-33554432, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=fal...#282#844799203", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-33554432"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBean", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-33554432, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=fal...#282#844799203", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:3>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:5>", "1", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "false", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:7>", "-2147483648", "<i:-48>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:7>", "2147483647", "<i:96>"}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<null>", "<sample:8>", "2147483632", "<sample:2>"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceResolver", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceResolver", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "false", "<sample:5>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "false", "<sample:5>"}, false, 8, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:1>", "false", "<sample:5>"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:3>", "<sample:3>", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "false", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:3>", "<sample:3>", "2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<null>", "false", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:3>", "<sample:3>", "2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "false", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:2>", "<sample:3>", "2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:7>", "0x123456789", "<d:1.5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=sample, getPropertyNames=!NullPointerException, isActual=true, is...#295#869219923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "false", "<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:2>", "<sample:3>", "2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:7>", "0x123456789", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=sample, getPropertyNames=!NullPointerException, isActual=true, is...#295#869219923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "false", "<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:2>", "<sample:3>", "2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:7>", "0x123456789", "<d:1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:8>", "false", "<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:2>", "<sample:3>", "2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:7>", "0x123456789", "<d:1.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=sample, getPropertyNames=!NullPointerException, isActual=true, is...#295#869219923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=0, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, isCo...#274#967389770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "<empty>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("1/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode...#220#2029601932", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "true", "<null>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:2>", "<sample:3>", "2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateValuePointer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isCollection", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1/.5 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=.5, getPropertyNames=!NullPointerException, isActua...#306#-962060083", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<s:aa>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:2>", "<null>", "<d:1.5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1/null {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNo...#222#-1110733287", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:3>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:5>", "<i:48>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("48 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#-995707471", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:W>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:1>", "<sample:5>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:W6Ce>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:0>", "<sample:2>", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#1313632955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:5>", "<sample:2>", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=f...#284#2090969585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ey>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:5>", "<sample:1>", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
}
