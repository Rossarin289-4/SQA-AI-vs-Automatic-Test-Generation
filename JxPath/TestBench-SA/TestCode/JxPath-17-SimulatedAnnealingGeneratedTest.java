package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-10"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-262143"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-262143}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-262143"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-262143}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-262144"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-262144}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"262143"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-122"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-122}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-244"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-244}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "-262143"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "-2147483608"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "10"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "1073741796"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-1073741805"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1073741805}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-131071"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-131071}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483600"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483600}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483617"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483617}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483642"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-53"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483642}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483603"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-262143"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483603}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-10"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-262143"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-14"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "10"}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-262143"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262143", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-262143}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "20"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "20"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-20"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-262144"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262144", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-262144}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "262144"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262144", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=262144}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483519"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483519", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2147483519}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-262143"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262143", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-262143}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-262108"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262108", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-262108}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-7"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
}
