package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.axes.RootContext", actual.getClass().getName());
  assertEquals("Expression context [0] 'b':'b' {getCurrentPosition=!UnsupportedOperationException, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 2), new String[][]{{"isChildOrderingRequired", "", "0"}, {"getRegisteredValue", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"remove", "org.apache.commons.jxpath.Pointer", "2"}, {"add", "org.apache.commons.jxpath.NodeSet", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}}, 3), new String[][]{{"getPointers", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}}, 3), new String[][]{{"getPointers", "", "4"}, {"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "50"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}}, 2), new String[][]{{"getPointers", "", "4"}, {"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "reset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 3), new String[][]{{"getValue", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "2"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"add", "org.apache.commons.jxpath.Pointer", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("['b']", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "remove", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "remove", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getCurrentPosition", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:1>"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "reset", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 1), new String[][]{{"getValues", "", "0"}, {"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 1), new String[][]{{"getValues", "", "0"}, {"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.axes.RootContext", actual.getClass().getName());
  assertEquals("Expression context [0] 'b':'b' {getCurrentPosition=!UnsupportedOperationException, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}), new String[][]{{"isChildOrderingRequired", "", "0"}, {"getRegisteredValue", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 16, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}}), new String[][]{{"getPointers", "", "4"}, {"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:6>"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "2"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "2"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:1>"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "remove", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false), new String[][]{{"add", "org.apache.commons.jxpath.Pointer", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("['b']", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "2147483647"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:1>"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "reset", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "reset", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getFactory", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}), new String[][]{{"add", "org.apache.commons.jxpath.Pointer", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[GeneratedTestInputProxy]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:0>"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getNamespaceContextPointer", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}}), new String[][]{{"removePath", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"isEmpty", "", "4"}, {"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"isEmpty", "", "4"}, {"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"isEmpty", "", "4"}, {"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"isEmpty", "", "4"}, {"lastIndexOf", "java.lang.Object", "3"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "reset", ""}}), new String[][]{{"getValues", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", actual.getClass().getName());
  assertEquals("{isLenient=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}}), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}}), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "4"}, {"getPointers", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "4"}, {"getNodes", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}}, 1), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "4"}, {"getNodes", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}}, 1), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}), new String[][]{{"getValues", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2), new String[][]{{"getNodes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}}, 2), new String[][]{{"getContextPointer", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 2), new String[][]{{"getContextPointer", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.model.beans.BeanPointer", actual.getClass().getName());
  assertEquals("'b' {getIndex=-2147483648, getLength=1, getNamespaceURI=null, isActual=true, isAttribute=false, isCollection=false, isContainer=false, isDynamicPropertyDeclarationSupported=false, isLeaf=true, isNode=...#218#1416067273", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 2), new String[][]{{"removePath", "java.lang.String,org.apache.commons.jxpath.ri.compiler.Expression", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.axes.RootContext", actual.getClass().getName());
  assertEquals("Expression context [0] 'b'/0:sample:'b'/0:sample {getCurrentPosition=!UnsupportedOperationException, getDocumentOrder=0, getPosition=0, hasNext=!UnsupportedOperationException, isChildOrderingRequired=...#206#-459941481", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}), new String[][]{{"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<empty>"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getValues", "", "5"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getValues", "", "5"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", ""}}, 2), new String[][]{{"getValues", "", "5"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextSet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getContextBean", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3), new String[][]{{"getContextBean", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"iteratePointers", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.axes.ChildContext", actual.getClass().getName());
  assertEquals("Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}), new String[][]{{"setFunctions", "org.apache.commons.jxpath.Functions", "4"}, {"getPointer", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}}, 2), new String[][]{{"add", "org.apache.commons.jxpath.Pointer", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[GeneratedTestInputProxy]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 2), new String[][]{{"add", "org.apache.commons.jxpath.Pointer", "7"}, {"getValues", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:3>"}}), new String[][]{{"add", "org.apache.commons.jxpath.Pointer", "7"}, {"getValues", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "next", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:0>"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"-1072693248"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<null>"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "reset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"selectSingleNode", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getConstantContext", "java.lang.Object", "7"}, {"getCurrentNodePointer", "", "2"}, {"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"getConstantContext", "java.lang.Object", "7"}, {"getCurrentNodePointer", "", "2"}, {"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", ""}}, 2), new String[][]{{"add", "org.apache.commons.jxpath.NodeSet", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"add", "org.apache.commons.jxpath.Pointer", "3"}, {"remove", "org.apache.commons.jxpath.Pointer", "4"}, {"getNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}}, 1), new String[][]{{"add", "org.apache.commons.jxpath.Pointer", "7"}, {"remove", "org.apache.commons.jxpath.Pointer", "4"}, {"add", "org.apache.commons.jxpath.NodeSet", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[GeneratedTestInputProxy, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", "java.util.List", "<sample:2>"}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "remove", ""}}, 2), new String[][]{{"remove", "org.apache.commons.jxpath.Pointer", "1"}, {"remove", "org.apache.commons.jxpath.Pointer", "1"}, {"getPointers", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Empty expression context", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "reset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "remove", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "setPosition", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getDocumentOrder", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 29, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "toString", new String[]{}, new String[]{}, false, 33, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getSingleNodePointer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodeList", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "hasNext", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "reset", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getSingleNodePointer", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "toString", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getJXPathContext", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 3), new String[][]{{"remove", "org.apache.commons.jxpath.Pointer", "0"}, {"getValues", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}}, 3), new String[][]{{"remove", "org.apache.commons.jxpath.Pointer", "0"}, {"getValues", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getContextNodePointer", ""}}, 3), new String[][]{{"remove", "org.apache.commons.jxpath.Pointer", "0"}, {"getValues", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", ""}}, 3), new String[][]{{"getValues", "", "0"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "isChildOrderingRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "next", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getRootContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.BasicNodeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getNodeSet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getNodes", "", "4"}, {"size", "", "3"}, {"iterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "reset", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}}, 1), new String[][]{{"remove", "org.apache.commons.jxpath.Pointer", "0"}, {"getValues", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=0, getPosition=1, hasNext=false, isChildOrderingRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "getValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentNodePointer", ""}}, 1), new String[][]{{"remove", "org.apache.commons.jxpath.Pointer", "0"}, {"getValues", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.axes.UnionContext", "org.apache.commons.jxpath.ri.axes.UnionContext", "sortPointers", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.axes.UnionContext", "getCurrentPosition", ""}, {"org.apache.commons.jxpath.ri.axes.UnionContext", "nextNode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Empty expression context {getCurrentPosition=1, getDocumentOrder=1, getPosition=1, hasNext=false, isChildOrderingRequired=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
