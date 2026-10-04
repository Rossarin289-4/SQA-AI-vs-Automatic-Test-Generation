package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "false", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "1.5d"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:3>", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/1.5d {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.5d, getPropertyNames=[], isActual=fals...#300#263105454", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<null>", "<sample:4>", "1"}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<null>", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<s:>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", ""}}, 1), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", "int", "2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<s:3>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", ""}}, 2), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "1 345679012334567890123455p890"}}), new String[][]{{"setIndex", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'[@name='1 345679012334567890123455p890'][3] {getIndex=2, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1 345679012334567890123455p890, getProp...#326#337223488", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'[@name='1 345679012334567890123455p890'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1 345679012334567890123455p890, ...#334#-277747510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:0>", "<i:-2147483648>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "{\"a\":1}"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:6>", "<sample:7>", "-2147483622"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<s:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", "java.lang.String", "Factory "}}, 2), new String[][]{{"getImmediateValuePointer", "", "5"}, {"getValuePointer", "", "0"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#219#-1701199011", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "&Bmuo;']1.1235678"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<s:key>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&Bmuo;']1.1235678", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'[@name='&Bmuo;&apos;]1.1235678'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=&Bmuo;']1.1235678, getPropertyNames=[], ...#313#-1955107117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<i:1>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#-60366492", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<i:0>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("0 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#2115549829", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<i:38>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("38 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=t...#217#2033189040", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:3>", "0x1F", "1L"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:3>", "0x1F", "1L"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "0x1F", "1L"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", "int", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample[@name='1.1234567'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.1234567, getPropertyNames=[], isActual=fal...#301#374010125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1.1234567-2147483648"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample[@name='1.1234567-2147483648'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.1234567-2147483648, getProperty...#323#-365480833", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1.1234567-2147483648"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1.1234567-2147483648'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.1234567-21474...#341#1158107359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1.1234567-21473836481.12345678901234567"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1.1234567-21473836481.12345678901234567'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyN...#379#-520388049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='/a/b'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=/a/b, getPropertyNames=[], isAc...#309#330396575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-8>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "1.123456678"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-8>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "1.123456678"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("de_DE {getCountry=DE, getDisplayCountry=Germany, getDisplayLanguage=German, getDisplayName=German (Germany), getDisplayScript=, getDisplayVariant=, getISO3Country=DEU, getISO3Language=deu, getLanguage...#250#1922296568", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:5>", "II"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"10"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[11] {getIndex=10, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttrib...#288#1988619460", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:2>", "<s:ke>>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", "java.lang.String", "`bc0xFFFFFFFF"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", "java.lang.String", "0xFFFFFFFF"}}, 3), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "0\n1F", "\n"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "[1t,2;]", "Z1,]0"}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<s:b>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "20l0-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='20l0-01-01'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=20l0-01-01, getPropertyNa...#321#721263999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "20l0-01-01"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'[@name='20l0-01-01'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=20l0-01-01, getPropertyNames=[], isActual=false, isA...#294#190770954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "20l0-01,01"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='20l0-01,01'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=20l0-01,01, getPropertyNa...#321#414057567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "20l0-01,01"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'[@name='20l0-01,01'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=20l0-01,01, getPropertyNames=[], isActual=false, isA...#294#-116435478", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "20l0-01,00"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'[@name='20l0-01,00'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=20l0-01,00, getPropertyNames=[], isActual=false, isA...#294#191624394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/http://example.com/a?b=c {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=http://example.com/a...#340#-465987858", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c "}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/http://example.com/a?b=c  {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=http://example.com/...#342#-1497723658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b==c "}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/http://example.com/a?b==c  {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=http://example.com...#344#-865892082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"http://exam'ple.com/a?b==c "}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/http://exam'ple.com/a?b==c  {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=http://exam'ple.c...#346#-464709326", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"http://exam'ple.com/b?b==c "}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/http://exam'ple.com/b?b==c  {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=http://exam'ple.c...#346#-1256568140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", "java.lang.String", "a b"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", "java.lang.String", "an b"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"=Title"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:7>", "<i:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=t...#231#1763306355", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:7>", "<i:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/0:sample/:a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarati...#258#-1712856162", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"-1/5http://exampleccom/a?b=c"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:3>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/-1/5http://exampleccom/a?b=c {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=-1/5http://examp...#348#942605454", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"-'/5http://exampleccom/a?b=c"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:3>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/-'/5http://exampleccom/a?b=c {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=-'/5http://examp...#348#1041691982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"a,b,"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:2>", "<sample:1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/a,b, {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a,b,, getPropertyNames=[], isActual=fals...#300#-515699506", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"ayb,"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:2>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/ayb, {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=ayb,, getPropertyNames=[], isActual=fals...#300#-644522386", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"ay,,"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:2>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/ay,, {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=ay,,, getPropertyNames=[], isActual=fals...#300#-1280365266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "remove", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<i:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#-60366492", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "true", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:0>", "true", "<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", "java.lang.String", "http://example.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1.1234567'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.1234567, getPropertyName...#319#85235053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1.12345671e10"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1.12345671e10'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.12345671e10, getProp...#327#-1341915053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample[@name='1.1234567'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.1234567, getPropertyNames=[], isActual=fal...#301#374010125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1, getPropertyNames=[], isActual=f...#303#-503333919", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:0>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "1.123456678"}}), new String[][]{{"isActual", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:0>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "1.123456678"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:0>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "1.123456678"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", actual.getClass().getName());
  assertEquals("$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-1073741824"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[-1073741823] {getIndex=-1073741824, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActu...#306#671043476", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:4>", "<i:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", "java.lang.String", "5."}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "false", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:7>", "<i:10>"}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:1>", "/a.b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}}), new String[][]{{"getExtension", "char", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}}), new String[][]{{"asPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}}), new String[][]{{"asPath", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", "int", "-1"}}), new String[][]{{"createNodeIterator", "java.lang.String,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true...#228#-1010695189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:7>", "<sample:3>", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:7>", "<sample:4>", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='i'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=i, getPropertyNames=[], isActual=f...#303#129879121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'[@name='i'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=i, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#-685507940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:6>", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", ""}}), new String[][]{{"getNodeValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:5>", "I"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/1.25 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.25, getPropertyNames=[], isActual=fals...#300#-1334617554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<null>", "a,b,c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[0] {getIndex=-1, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribu...#287#1772174017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-65"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[-64] {getIndex=-65, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttr...#290#-1100824748", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"130"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[131] {getIndex=130, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttr...#290#-676431850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"128"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[129] {getIndex=128, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttr...#290#-1978004682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", "java.lang.String", "abc"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:7>", "<sample:0>", "-1073741824"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", new String[]{"java.lang.String"}, new String[]{"1.123456"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1.123456'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.123456, getPropertyNames=...#317#-998995265", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:7>", "0x1F", "\t"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "0x1F", "\n"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='2020-01-01'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=2020-01-01, getPropertyNa...#321#1426687679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "20l0-01-01"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='20l0-01-01'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=20l0-01-01, getPropertyNa...#321#721263999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "20l0-01-01"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'[@name='20l0-01-01'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=20l0-01-01, getPropertyNames=[], isActual=false, isA...#294#190770954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3506402", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"hstp://exam'ple.com/b?b=c "}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/hstp://exam'ple.com/b?b=c  {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=hstp://exam'ple.co...#344#786191630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/2020-02-30T25:61:61 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=2020-02-30T25:61:61, getP...#330#-650494590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"2010-02-30T25:61:61"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/2010-02-30T25:61:61 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=2010-02-30T25:61:61, getP...#330#1767699840", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"2010-01-30T25:61:61"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/2010-01-30T25:61:61 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=2010-01-30T25:61:61, getP...#330#1126653054", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:6>", "<sample:0>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:6>", "<sample:0>", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:5>", "false", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:5>", "false", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=true, isCollectio...#267#1915211896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNo...#222#644194673", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=t...#231#221204614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", "java.lang.String", "010"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"-2147484648 "}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"**u"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"**u"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:7>", "<i:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("0 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#2115549829", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyName", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/1 {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#-1627002951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:0>", "1.5", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:7>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/*[-2147483648] {getIndex=2147483647, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActua...#305#1309253199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1.5f'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.5f, getPropertyNames=[], isAc...#309#-396526849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'[@name='1.5f'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.5f, getPropertyNames=[], isActual=false, isAttribute=fal...#282#-245594870", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "1.50"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='1.50'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.50, getPropertyNames=[], isAc...#309#-1541157185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "toString", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "1.50"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample[@name='1.50'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.50, getPropertyNames=[], isActual=false, isAttr...#291#1288319583", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "a,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='a,b,c'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a,b,c, getPropertyNames=[], is...#311#-778578149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "a,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'[@name='a,b,c'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a,b,c, getPropertyNames=[], isActual=false, isAttribute=f...#284#-1761834394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "a,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample[@name='a,b,c'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a,b,c, getPropertyNames=[], isActual=false, isAt...#293#-365702469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "a,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample[@name='a,b,c'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a,b,c, getPropertyNames=[], isActual=false, isAttri...#290#-1490648582", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "a,b,d"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample[@name='a,b,d'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a,b,d, getPropertyNames=[], isActual=false, isAttri...#290#1382729596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:7>", "true", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"E45"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareTo", "java.lang.Object", "<s:key >"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateValuePointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<sample:0>"}}), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<i:2>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"clone", "", "7"}, {"namespacePointer", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<i:2>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"clone", "", "7"}, {"namespacePointer", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "printPointerChain", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<i:2>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"clone", "", "7"}, {"namespacePointer", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample[@name='-2147483648'] {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=-2147483648, getProperty...#323#1228735411", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<i:2>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"clone", "", "7"}, {"namespacePointer", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<i:2>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<sample:0>"}}), new String[][]{{"clone", "", "7"}, {"namespacePointer", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setValue", "java.lang.Object", "<i:2>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<null>", "<sample:3>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<null>", "<sample:1>", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isLeaf", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getImmediateParentPointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollection=f...#263#606527050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=true, isCollectio...#267#1915211896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setAttribute", "boolean", "true"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isActualProperty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, is...#294#-494252253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getLength", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}}, 1), new String[][]{{"getNamespaceURI", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}}, 1), new String[][]{{"getNamespaceURI", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getName", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getRootNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true...#228#-1010695189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<null>", "<sample:6>", "-2147483648", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:6>", "-2147483648", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "setNameAttributeValue", "java.lang.String", "2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "clone", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:1>", "1.5e300", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:0>", "1.5e300", "-1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBean", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isRoot", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, is...#276#277798646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<i:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("2 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#2058684483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<i:2>", "<sample:0>"}, true), new String[][]{{"isContainer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<i:4>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true...#228#709796869", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCol...#273#-16142889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getPropertyIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<i:-1020>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}}), new String[][]{{"compareTo", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:2>", "<i:-1020>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}}), new String[][]{{"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:5>", "<i:-1020>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}}), new String[][]{{"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "6"}, {"getLocale", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:5>", "<i:-1020>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}}, 3), new String[][]{{"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:5>", "<i:-1020>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}}, 3), new String[][]{{"childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:5>", "<i:-1020>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isA...#294#-2072244586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:5>", "<i:-1020>"}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "getBaseValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNo...#222#644194673", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[], isActual=false, isAttribute=false, isCollectio...#267#337219563", SearchInputFactory_scaffolding.receiverState());
 }
}
