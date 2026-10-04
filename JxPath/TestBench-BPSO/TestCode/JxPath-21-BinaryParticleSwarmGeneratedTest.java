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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:4>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "escape", "java.lang.String", "1.25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:1>", "<null>", "-60", "<i:61>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<null>", "<null>", "2007"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:2>", "<null>", "12", "<i:0>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:6>", "<sample:5>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:0>", "<sample:4>", "1999"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<s:aa>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample {getIndex=1999, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=0:sample, getPropertyNames=!NullPointerException, isActual=false, isAt...#293#747769224", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "15"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:4>", "<sample:1>", "2007", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "handle", new String[]{"java.lang.Throwable"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", "1.5dHello, World"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/1.5dHello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/1.5dHello, World {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=1.5dHello, World, getPropertyNames=!NullPointe...#325#1328371889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:0>", "<i:14>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=tr...#230#-707018179", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"tr>ue"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/tr>ue {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=tr>ue, getPropertyN...#341#815701961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "false", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:6>"}}, 3), new String[][]{{"compareTo", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:12>", "<s:a>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "false", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "-0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "printPointerChain", ""}}, 3), new String[][]{{"isAttribute", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setAttribute", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/@* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!N...#333#-889187548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=t...#231#221204614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:0>"}}, 3), new String[][]{{"getPrefix", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("* {getName=*, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:9>", "4a", "<b:true>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:2>", "<sample:6>", "2147483647", "<sample:3>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBean", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<i:-39>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:4>", "abc", "<s:key>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getIndex", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getRootNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:fkf>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/1.5 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=1.5, getPropertyNames...#337#-2060139847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateNode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "` ", "0"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:1>", "-1", "<i:-30>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyNames", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[null, null, null], isA...#310#-930438513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:1>", "0x123456789i", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLength", ""}}, 3), new String[][]{{"handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLength", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:6>", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isAttribute", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceResolver", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespacePointer", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/a b {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a b, getPropertyNames=!NullPointerException, isActual=false, isAttri...#290#-587196828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"1F-5"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:6>", "<sample:4>", "16", "<s:key>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByID", "org.apache.commons.jxpath.JXPathContext,java.lang.String", "<sample:7>", "t\t"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/1F-5 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=1F-5, getPropertyNam...#339#-1255560601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getName", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespacePointer", "java.lang.String", "--1\u00e9"}}, 2), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:4>", "tru=e", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:6>", "<sample:6>", "-2147483647"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateParentPointer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getValuePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isCollection", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:0>", "true", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:2>", "<sample:2>", "-2147483615"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"PT2H"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getName", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<s:kBy>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'kBy' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNod...#220#548423753", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "{\"a#:1}", "\0101.12345678901234567"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "<sample:5>"}}, 3), new String[][]{{"getValuePointer", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createAttribute", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:6>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "true", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "-0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int"}, new String[]{"<sample:9>", "<sample:7>", "47"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isLeaf", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:4>", "<sample:3>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareTo", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#721459475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:3>", "<i:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("2 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#2058684483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "handle", new String[]{"java.lang.Throwable", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:1>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setExceptionHandler", new String[]{"org.apache.commons.jxpath.ExceptionHandler"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateValuePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "true0x123456789", "1E-5"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("* {getName=*, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespacePointer", "java.lang.String", "0x1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:10>", "<sample:4>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"setValue", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isLeaf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:0>", "", "<i:-1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespacePointer", new String[]{"java.lang.String"}, new String[]{"httpe://example.com/a?b=c"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"91.5"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<null>", "true", "<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isCollection", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<null>"}}), new String[][]{{"getNamespaceURI", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLocale", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=1, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerE...#323#-130395874", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "+;"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLanguage", new String[]{"java.lang.String"}, new String[]{"{.12345678901234567"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=1, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, is...#276#-2039708129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setNamespaceResolver", new String[]{"org.apache.commons.jxpath.ri.NamespaceResolver"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:6>", "true", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setIndex", new String[]{"int"}, new String[]{"-10"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-10, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointe...#325#194281187", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateValuePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLength", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false), new String[][]{{"compareTo", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropert...#391#-586427961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<null>", "<sample:1>", "-2147483648", "<s:>"}}), new String[][]{{"isAttribute", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLocale", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:9>", "<sample:5>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByID", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String"}, new String[]{"<sample:8>", "-1.5"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1adb"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:8>", "true", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:5>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"47"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", "Facory: "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=47, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=...#304#-1404443279", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:7>", "false", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"a,b,c0xFFFFFFFF<"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:3>", "<sample:1>"}}), new String[][]{{"getName", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:4>", "<s:ke>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDec...#264#-129025237", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isContainer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:1>", "<sample:5>", "51", "<s:kf>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false), new String[][]{{"setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:5>", "2147483647", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setValue", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable", "<sample:2>"}}), new String[][]{{"getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", "1.25a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/1.25a b {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=1.25a b, getPrope...#345#213968483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateParentPointer", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0xFFFFFFFF {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=0xFFFFFFFF, getPropertyNames=!NullPointerException, isActual=...#304#-111986788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getBaseValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false), new String[][]{{"isNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:5>", "<sample:4>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyNames", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2, getPropertyName=*, getPropertyNames=[null, null, null], isActual=fal...#301#-1351355030", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:7>", "<null>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "536870913"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=536870913, getPropertyName=*, getPropertyNames=!NullPointerException, is...#311#2015512819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareTo", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<null>", "a+,c", "<i:-59>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#-1059086898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBean", ""}}), new String[][]{{"setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "0"}, {"isNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "printPointerChain", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/a {getIndex=-2147483648, getLength=!NullPointerException, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActua...#333#1928072936", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-1, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, i...#277#2049964234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"1E-5true"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:7>", "<sample:10>", "2147483624"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:2>", "<s:0>", "<null>"}, true), new String[][]{{"compareTo", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "escape", "java.lang.String", "5.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setAttribute", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getName", new String[]{}, new String[]{}, false), new String[][]{{"getPrefix", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:0>", "<sample:3>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#-1059086898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:7>", "<s:c>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'c' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#-1612829238", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=2, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#-491114675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:0>", "<empty>"}, true), new String[][]{{"createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890\t"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int", "<sample:5>", "<sample:2>", "12"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"isContainer", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:1>", "true", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getValuePointer", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupport...#249#1966521574", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateParentPointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#-1059086898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/a {getIndex=1, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, is...#276#905778801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"nulm"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nulm", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/1.1234567 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=1.1234567, getP...#349#-429463941", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=1, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#76857548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}}), new String[][]{{"createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isLeaf", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setAttribute", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActual", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:0>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceResolver", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:4>", "false", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"{Fa\":1}"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{Fa&quot;:1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{".5e30"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/.5e30 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=.5e30, getPropertyN...#341#-1097416781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isCollection", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isLanguage", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/a", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=...#285#-829828281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "namespaceIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "handle", new String[]{"java.lang.Throwable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"PT1H "}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "printPointerChain", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H ", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isActual", ""}}), new String[][]{{"compareTo", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBaseValue", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLength", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.QName", actual.getClass().getName());
  assertEquals("* {getName=*, getPrefix=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"1.123467890123456"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123467890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "escape", "java.lang.String", "mull"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceResolver", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", actual.getClass().getName());
  assertEquals("{getPosition=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setValue", "java.lang.Object", "<i:3>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=...#285#-829828281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "handle", new String[]{"java.lang.Throwable"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setNamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/a {getIndex=-2147483648, getLength=!NullPointerException, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActua...#333#1928072936", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespaceIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false), new String[][]{{"isAttribute", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "hashCode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareTo", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateValuePointer", new String[]{}, new String[]{}, false), new String[][]{{"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<null>", "true", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:5>", "<s:\rey>", "<sample:1>"}, true), new String[][]{{"isDynamicPropertyDeclarationSupported", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "1"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isLanguage", "java.lang.String", "1Labc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=1, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerE...#323#-130395874", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "namespaceIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=3, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[null, null, null], isA...#310#-930438513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getImmediateNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isCollection", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getRootNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBean", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceResolver", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:6>", "P1H", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/a {getIndex=-2147483648, getLength=!NullPointerException, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActua...#333#1928072936", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isAttribute", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:0>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", "TITME"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/TITME {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=TITME, getPropertyN...#341#-387278405", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:7>", "<s:a>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"isCollection", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newNodePointer", new String[]{"org.apache.commons.jxpath.ri.QName", "java.lang.Object", "java.util.Locale"}, new String[]{"<sample:6>", "<s:of>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'of' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode...#219#-2059808020", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getBaseValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", "-2147483648y"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/-2147483648y {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=-2147483648y...#355#1480359719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getIndex", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"\tnull1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyName", "java.lang.String", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/ {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=, getPropertyNames=!Null...#331#-151768569", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:6>", "null\r", "<d:-15.0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=...#285#-829828281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isCollection", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isRoot", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyNames", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:5>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=[null, null], isActual=false, isAttribute=false, i...#277#1294440780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "-134217727", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "isLanguage", "java.lang.String", "urue"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable", "<null>"}}, 3), new String[][]{{"setExceptionHandler", "org.apache.commons.jxpath.ExceptionHandler", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext,java.lang.Object", "<sample:7>", "<i:1>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNamespaceURI", ""}}), new String[][]{{"getPosition", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "newChildNodePointer", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.QName", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:2>", "<s:`>"}, true), new String[][]{{"isRoot", "", "7"}, {"getIndex", "", "7"}, {"compareTo", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "escape", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, is...#295#-2013600277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/1L {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=1L, getPropertyNames=!...#335#-1984621017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable", "<empty>"}}, 2), new String[][]{{"getPosition", "", "2"}, {"getNodePointer", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:10>"}, false, 0, null, 3), new String[][]{{"getNodePointer", "", "5"}, {"getNodePointer", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "attributeIterator", new String[]{"org.apache.commons.jxpath.ri.QName"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable,org.apache.commons.jxpath.ri.model.NodePointer", "<null>", "<sample:4>"}}), new String[][]{{"setPosition", "int", "4"}, {"getNodePointer", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/*/* {getIndex=-2147483648, getLength=0, getNamespaceURI=null, isActual=false, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSuppo...#251#1376694251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPointerByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "1.5f", ""}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPropertyName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isAttribute", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNodeSetByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.Object", "<sample:2>", "+1", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=...#285#-829828281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=...#246#787018635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getDefaultNamespaceURI", ""}}, 3), new String[][]{{"compareChildNodePointers", "org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer", "1"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", actual.getClass().getName());
  assertEquals("'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{"java.lang.String"}, new String[]{"null"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setPropertyIndex", "int", "1006632959"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=1006632959, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute=...#285#94852723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createPath", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.Object"}, new String[]{"<sample:7>", "<i:67>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getBaseValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidAccessException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/*", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:6>", "true", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, ...#313#644829771", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNodeSetByKey", new String[]{"org.apache.commons.jxpath.JXPathContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:0>", "1.5f<a>b</a>", "<i:-3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:6>", "<sample:0>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createAttribute", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName", "<sample:1>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getImmediateParentPointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "childIterator", "org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer", "<sample:2>", "false", "<sample:7>"}}), new String[][]{{"setIndex", "int", "7"}, {"testNode", "org.apache.commons.jxpath.ri.compiler.NodeTest", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareTo", "java.lang.Object", "<s:kf>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createChild", "org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object", "<sample:7>", "<sample:1>", "2007", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyIndex", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=1, getPropertyIndex=2, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=f...#303#518256676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "testNode", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "attributeIterator", "org.apache.commons.jxpath.ri.QName", "<sample:9>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getAbstractFactory", "org.apache.commons.jxpath.JXPathContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getNamespaceURI", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getNode", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setValue", "java.lang.Object", "<i:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "escape", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/a {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=true, isAttribute=...#285#-829828281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isActualProperty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "handle", "java.lang.Throwable", "<sample:1>"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "createPath", "org.apache.commons.jxpath.JXPathContext", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getPropertyCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareTo", "java.lang.Object", "<s:kfY>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "compareChildNodePointers", new String[]{"org.apache.commons.jxpath.ri.model.NodePointer", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getName", ""}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "-60"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-60, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointe...#325#2027642856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "setPropertyName", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "escape", "java.lang.String", "00 "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/--1 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=--1, getPropertyNames...#337#-2063267769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "childIterator", new String[]{"org.apache.commons.jxpath.ri.compiler.NodeTest", "boolean", "org.apache.commons.jxpath.ri.model.NodePointer"}, new String[]{"<sample:1>", "false", "<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "printPointerChain", ""}}), new String[][]{{"isRoot", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointerException, isActual=false, isAttribute...#286#628383446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getDefaultNamespaceURI", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "-60"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareTo", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-60, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!NullPointe...#325#2027642856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "isDefaultNamespace", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=b"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/0:sample/0:sample/0:sample/* {getIndex=-2147483648, getLength=1, getNamespaceURI=null, getPropertyCount=!NullPointerException, getPropertyIndex=-2147483648, getPropertyName=*, getPropertyNames=!Nu...#333#-562271723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "asPath", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "setIndex", "int", "-26"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'b'/a", String.valueOf(actual));
  assertEquals("receiver state after the call", "'b'/a {getIndex=-26, getLength=1, getNamespaceURI=null, getPropertyCount=0, getPropertyIndex=-2147483648, getPropertyName=a, getPropertyNames=!NullPointerException, isActual=false, isAttribute=false, ...#278#705432945", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "getAbstractFactory", new String[]{"org.apache.commons.jxpath.JXPathContext"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "createChild", new String[]{"org.apache.commons.jxpath.JXPathContext", "org.apache.commons.jxpath.ri.QName", "int", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "1003", "<i:30>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "getPointerByKey", "org.apache.commons.jxpath.JXPathContext,java.lang.String,java.lang.String", "<sample:3>", "-1.5I", "1234577890123456789012345,7890"}, {"org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "compareTo", "java.lang.Object", "<i:-2147483587>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
}
