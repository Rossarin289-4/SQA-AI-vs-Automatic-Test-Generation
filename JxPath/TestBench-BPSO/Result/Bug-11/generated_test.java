package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483630"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483630", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483630}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", "int", "-37"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"7"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "8388608"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8388608", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=8388608}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483630"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147467264"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147467264}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147481600"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147481600}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "27"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-8193"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-8193}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-131071"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-131071}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483648"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483618"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483618", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483618}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483594"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483594", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2147483594}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483648"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483629"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483629", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483629}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "32767"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=32767}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483630"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483630}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "536870914"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-15"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "12"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483630"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483630", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483630}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-266"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-266}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483624"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483624}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-8388608"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8388608", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-8388608}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-33554432"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483599"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-33554432}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-10"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", new String[]{"int"}, new String[]{"-1073741823"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-66"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-66}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483630"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483630", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483630}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483630"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483630", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483630}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483615"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483615", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483615}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "47"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "29"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-40"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-1024"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1024", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-1024}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "48"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=48}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-1"}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483586"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483586", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483586}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "21"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-2147483620"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483620", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-2147483620}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "-7"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getPosition", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "getNodePointer", ""}, {"org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "setPosition", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPosition=2}", SearchInputFactory_scaffolding.receiverState());
 }
}
