package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[0, sample, , 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 1.5]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"hasNext", "", "2"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, -2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-27>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-27]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:ke2y>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, ke2y]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, 3.0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 1), new String[][]{{"hasNext", "", "2"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:1>"}}), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 2), new String[][]{{"hasNext", "", "0"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, false]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 1), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-61>"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample, -61]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[true]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<i:-131070>"}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , -131070]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 2), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , , 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[15.0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , key]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:fb>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, fb]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, -1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"next", "", "7"}, {"next", "", "6"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<b:false>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , false, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , 4]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:`>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, `]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 2), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-2>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[0, -2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, -1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"hasNext", "", "2"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-27>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-27]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:c>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, c]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 2), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<b:false>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[false]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , , -1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[, b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:\u00e9b>"}}), new String[][]{{"next", "", "1"}, {"remove", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[sample, , \u00e9b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , 15]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:\u00e9b>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, \u00e9b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<b:true>"}}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , true]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, -1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:1>"}}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-2147483648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:key>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 1.5]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-67108862>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:kex>"}}, 1), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, -67108862, kex]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-49>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, -49]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1), new String[][]{{"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:=key>"}}), new String[][]{{"next", "", "2"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=key", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, =key]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 1), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-3>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 1), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-2147483648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, -1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:keLy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("keLy", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3), new String[][]{{"next", "", "3"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2), new String[][]{{"hasNext", "", "1"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-27>"}}, 1), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-27", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-27]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:`>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[`]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[a, -1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3), new String[][]{{"hasNext", "", "5"}, {"hasNext", "", "1"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:2>"}}, 3), new String[][]{{"hasNext", "", "1"}, {"hasNext", "", "6"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"next", "", "6"}, {"next", "", "3"}, {"remove", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"next", "", "3"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:2>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:c>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, c]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:32>"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[0, sample, , 32]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 2), new String[][]{{"next", "", "0"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 3), new String[][]{{"hasNext", "", "5"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"next", "", "3"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<d:0.3999999999999999>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , 0.3999999999999999]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-63>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, -63]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:\u00e9c>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, \u00e9c]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:mey>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mey", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}), new String[][]{{"next", "", "6"}, {"next", "", "3"}, {"remove", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[sample, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:\u00e9b0>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9b0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[\u00e9b0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.BufferUnderflowException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:ke.>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ke.", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ke.]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:bF>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , bF]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<b:false>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[false]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:2>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , b, -2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:6a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[6a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:A7ey>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[A7ey]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , -2147483648, -8]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:0>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-32799>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, -32799]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-27", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-27]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1.5]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "[b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-2>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "get", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:\u00e9b<>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9b<", String.valueOf(actual));
  assertEquals("receiver state after the call", "[\u00e9b<]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:50>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, -27, 50]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, 1, 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-1073741824>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:X>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.buffer.UnboundedFifoBuffer", "org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "remove", ""}, {"org.apache.commons.collections.buffer.UnboundedFifoBuffer", "add", "java.lang.Object", "<s:b>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
}
