package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"int", "java.util.Collection"}, new String[]{"2147483647", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set", "java.util.List"}, new String[]{"<sample:3>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"int", "java.util.Collection"}, new String[]{"-2147483648", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "equals", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<s:ke{{y>"}, {"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set", "java.util.List"}, new String[]{"<empty>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set", "java.util.List"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "-134217723", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set", "java.util.List"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "asList", ""}}), new String[][]{{"hasPrevious", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", "java.lang.Object[]", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"addAll", "int,java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"next", "", "0"}, {"previous", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"retainAll", "java.util.Collection", "0"}, {"clear", "", "5"}, {"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<s:?>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<i:0>"}, {"org.apache.commons.collections.set.ListOrderedSet", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<i:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:-254>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"int", "java.lang.Object"}, new String[]{"-2147483648", "<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "contains", "java.lang.Object", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "clear", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<d:4.800000000000001>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "54"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "int,java.util.Collection", "2147483647", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "0"}, {"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "1025"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"int", "java.util.Collection"}, new String[]{"21", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set", "java.util.List"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<s:ke{{yp>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "size", ""}, {"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set", "java.util.List"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", "java.lang.Object[]", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", "java.lang.Object[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", "java.lang.Object[]", "<sample:6>"}, {"org.apache.commons.collections.set.ListOrderedSet", "toArray", "java.lang.Object[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<b:false>"}, {"org.apache.commons.collections.set.ListOrderedSet", "contains", "java.lang.Object", "<i:-2147483590>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, false]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:20>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "contains", "java.lang.Object", "<b:false>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "contains", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "2147483635"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "int,java.util.Collection", "134217723", "<sample:0>"}, {"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, 2147483647, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "retainAll", "java.util.Collection", "<null>"}, {"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "decorated", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "-134217787", "<s:-e{y>"}, {"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "4"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "0"}, {"org.apache.commons.collections.set.ListOrderedSet", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:ke{y>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "2147483639"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{"java.lang.Object[]"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "retainAll", "java.util.Collection", "<empty>"}, {"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"int", "java.util.Collection"}, new String[]{"2147483647", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<s:ke{y>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[, ke{y]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, ke{y]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "get", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 4, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}}), new String[][]{{"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-2147483648, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"int", "java.util.Collection"}, new String[]{"-13", "<null>"}, false, 4, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "contains", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, 1.5, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}, {"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<s:ke{x>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, ke{x, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"int", "java.util.Collection"}, new String[]{"2147483647", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", "java.lang.Object[]", "<null>"}, {"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "-43"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:ke{>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "-2147483639", "<s:ke{y>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:k=e{y>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "asList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:aW>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "0"}, {"hasNext", "", "0"}, {"remove", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "decorated", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "1048490", "<s:k2{>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<s:pH>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, pH]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"int"}, new String[]{"-21"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "decorated", ""}, {"org.apache.commons.collections.set.ListOrderedSet", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "int,java.util.Collection", "0", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"int", "java.lang.Object"}, new String[]{"-1073741883", "<i:-46>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "contains", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "contains", "java.lang.Object", "<s::ey>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.collections.set.ListOrderedSet", "toArray", "java.lang.Object[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "size", ""}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.UnmodifiableIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "retainAll", "java.util.Collection", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<s:ke{{y\n>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:ke{y>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "4194303"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "containsAll", "java.util.Collection", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "decorated", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "decorated", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<s:ke?x>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, , ke?x]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, ke?x, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "removeAll", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "containsAll", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:ap>"}, false, 6, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:eyL>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "int,java.util.Collection", "-134217723", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "asList", ""}, {"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<s:ke{{y>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("101947775", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, ke{{y]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, true), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<s:ke{9{y>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{"java.lang.Object[]"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "retainAll", "java.util.Collection", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "decorated", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"clone", "", "2"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "134348795"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:-1073741824>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "decorated", ""}, {"org.apache.commons.collections.set.ListOrderedSet", "addAll", "int,java.util.Collection", "0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "retainAll", "java.util.Collection", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "size", ""}, {"org.apache.commons.collections.set.ListOrderedSet", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections.set.ListOrderedSet", "equals", "java.lang.Object", "<s:ke{{y>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, -2147483648]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, -2147483648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "-43"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:d>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "containsAll", "java.util.Collection", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "decorated", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "decorated", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<d:-27.5>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0, -27.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[-27.5, 0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909674949", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106224", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, key]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"int", "java.util.Collection"}, new String[]{"-2147483648", "<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:5>"}, {"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, 1, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, true), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "isEmpty", ""}}), new String[][]{{"previous", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909674949", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "1"}, {"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "67108864"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, null, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("145", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "-511"}, {"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<s::bb>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59019", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, :bb, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "containsAll", "java.util.Collection", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:kefy>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true), new String[][]{{"asList", "", "0"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<s:pex>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "0", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1231", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, true]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[0, sample, , -2147483648]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, -2147483648, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<sample:7>"}, {"org.apache.commons.collections.set.ListOrderedSet", "decorated", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "-2143289344", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "equals", "java.lang.Object", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<s:ke>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<sample:3>"}, true), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet", actual.getClass().getName());
  assertEquals("[, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "decorated", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"int", "java.util.Collection"}, new String[]{"-31", "<sample:4>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "decorated", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toArray", ""}}), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "decorated", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "-1048533"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:8>"}, true, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "-268435458", "<s:>>"}, {"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "int", "0"}}), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675046", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<s:keh{y3>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, keh{y3]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "contains", "java.lang.Object", "<s:bh->"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "retainAll", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.collections.set.ListOrderedSet", "indexOf", "java.lang.Object", "<i:54>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}, {"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample, -2147483648]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-2147483648, 0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "remove", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "addAll", "java.util.Collection", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, , a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"addAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "removeAll", "java.util.Collection", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "decorated", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "contains", "java.lang.Object", "<s:ke|y>"}, {"org.apache.commons.collections.set.ListOrderedSet", "addAll", "int,java.util.Collection", "-134217765", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[, 0, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"asList", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "remove", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.ListOrderedSet$OrderedSetIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "-36", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1.5, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "retainAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:?I>"}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "get", "int", "-1073741824"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[, ?I, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "add", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}, {"org.apache.commons.collections.set.ListOrderedSet", "addAll", "int,java.util.Collection", "-268435455", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, 1, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "contains", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 4, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "-2147483648", "<s:ke{<y>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-807729224", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "addAll", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "listOrderedSet", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, true), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "equals", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "int,java.lang.Object", "2147483647", "<i:-2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.set.ListOrderedSet", "org.apache.commons.collections.set.ListOrderedSet", "asList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.set.ListOrderedSet", "add", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[, a, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, 1, a]", SearchInputFactory_scaffolding.receiverState());
 }
}
