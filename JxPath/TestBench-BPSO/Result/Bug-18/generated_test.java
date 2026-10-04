package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "17"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 2), new String[][]{{"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-14"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-1"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"listIterator", "", "3"}, {"previousIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-17"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 3), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"12"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "129"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.axes.RootContext", actual.getClass().getName());
  assertEquals("Expression context [0] 'b':'b' {getCurrentPosition=!UnsupportedOperationException, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}), new String[][]{{"getNamespaceResolver", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", actual.getClass().getName());
  assertEquals("{isSealed=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"1073741823"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-2147483593"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}), new String[][]{{"getLocale", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("en_US {getCountry=US, getDisplayCountry=United States, getDisplayLanguage=English, getDisplayName=English (United States), getDisplayScript=, getDisplayVariant=, getISO3Country=USA, getISO3Language=en...#264#-890449215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483629"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<null>"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"65"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "1073741858"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getPointers", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"29"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"40"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:1>"}}, 1), new String[][]{{"remove", "java.lang.Object", "3"}, {"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-2147483648"}}), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "134217728"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=0, getPosition=2, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=1, getPosition=2, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"selectSingleNode", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483585"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}), new String[][]{{"getContextNodeList", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "4194314"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getContextNodeList", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"38"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"64"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "7"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 3), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}}, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "-14"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "1073742858"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "1073741823"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 3), new String[][]{{"getCurrentNodePointer", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"add", "java.lang.Object", "3"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "63"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "524287"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=2, getDocumentOrder=0, getPosition=2, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "3"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getAbsoluteRootContext", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.axes.InitialContext", actual.getClass().getName());
  assertEquals("Expression context [0] 'b' {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=true, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-10"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "4095"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"1073741814"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "1073741837"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"24"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.axes.RootContext", actual.getClass().getName());
  assertEquals("Expression context [0] 'b':'b' {getCurrentPosition=!UnsupportedOperationException, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"setLocale", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getCurrentPosition", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "129"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "java.util.Collection", "7"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "1073741823"}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 3), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentNodePointer", ""}}, 2), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getJXPathContext", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}), new String[][]{{"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!ClassCastException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"iterator", "", "5"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextSet", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "nextNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "setPosition", "int", "131082"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "3"}, {"getPointers", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=0, getPosition=0, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "reset", ""}}, 2), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "hasNext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.AttributeContext", "org.apache.commons.jxpath.ri.axes.AttributeContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.AttributeContext", "sortPointers", "java.util.List", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=0, getDocumentOrder=1, getPosition=0, hasNext=!NullPointerException, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
