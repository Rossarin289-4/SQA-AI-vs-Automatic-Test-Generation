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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "33554442"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=0, getPosition=2, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 3), new String[][]{{"isChildOrderingRequired", "", "3"}, {"getPosition", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 3), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=0, getPosition=2, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<empty>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483596"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483596"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 1), new String[][]{{"getNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}}, 2), new String[][]{{"getNodeSet", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 2), new String[][]{{"getJXPathContext", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1), new String[][]{{"setVariables", "org.apache.commons.jxpath.Variables", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1), new String[][]{{"setVariables", "org.apache.commons.jxpath.Variables", "0"}, {"setFactory", "org.apache.commons.jxpath.AbstractFactory", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=1, getPosition=2, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=0, getPosition=2, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=0, getPosition=2, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=0, getPosition=2, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, false, 11, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=0, getPosition=2, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "33554442"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=1, getPosition=2, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "33554442"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=0, getPosition=2, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<empty>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<empty>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<empty>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<null>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483646"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483646"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}), new String[][]{{"getNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"33554442"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.axes.RootContext", actual.getClass().getName());
  assertEquals("Expression context [0] 'b':'b' {getCurrentPosition=!UnsupportedOperationException, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"add", "org.apache.commons.jxpath.Pointer", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("['b']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.axes.RootContext", actual.getClass().getName());
  assertEquals("Expression context [0] 'b':'b' {getCurrentPosition=!UnsupportedOperationException, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 2), new String[][]{{"getPosition", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-2147483647"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 22, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 24, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}), new String[][]{{"getNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}), new String[][]{{"addAll", "java.util.Collection", "3"}, {"size", "", "1"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "3"}, {"size", "", "1"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "3"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "3"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "3"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}), new String[][]{{"addAll", "java.util.Collection", "3"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "6"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}), new String[][]{{"iterator", "", "6"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}, 3), new String[][]{{"iterator", "", "6"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 1), new String[][]{{"getContextPointer", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("2 {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=tr...#216#2058684483", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 22, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}), new String[][]{{"getContextNodeList", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "33554442"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getNodes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "33554442"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}), new String[][]{{"getNodes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getKeyManager", "", "3"}, {"getPointerByKey", "java.lang.String,java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "19"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"33554442"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"1073741853"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"10"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-16777206"}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"67108682"}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 22, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3), new String[][]{{"isLenient", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:3>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:3>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:3>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:3>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
