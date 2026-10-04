package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:c>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:a>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}, {"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"set", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "1", "<s:>"}}), new String[][]{{"nextIndex", "", "3"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false), new String[][]{{"previous", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"7"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<sample:0>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[key, 0, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147483648", "<i:-1>"}}, 3), new String[][]{{"next", "", "3"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:r>"}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147483647", "<d:0.75>"}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<s:c>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[r, c, 0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-1>"}, {"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "get", "int", "61"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-1, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2", "<null>"}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<d:7.5>"}, {"org.apache.commons.collections.list.TreeList", "size", ""}}), new String[][]{{"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, null]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "0", "<d:7.7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[7.7, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"next", "", "5"}, {"remove", "", "2"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2", "<d:1.5>"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, 1.5, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, 1.5, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "1"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "2"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 2), new String[][]{{"previous", "", "0"}, {"set", "java.lang.Object", "7"}, {"nextIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[true]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "10", "<s:d>"}, {"org.apache.commons.collections.list.TreeList", "size", ""}}), new String[][]{{"previous", "", "0"}, {"set", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, true, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<s:key>"}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:c>"}, {"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2", "<null>"}, {"org.apache.commons.collections.list.TreeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, null]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 2), new String[][]{{"hasPrevious", "", "2"}, {"add", "java.lang.Object", "0"}, {"previous", "", "2"}, {"remove", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<sample:1>"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "2147483629"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, 1, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"2113863679", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"2113863935", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "-1", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"2113863935", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "14"}, {"org.apache.commons.collections.list.TreeList", "listIterator", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "7"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "-4"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "7"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "-4"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483639"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483639"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483639"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "2147483647"}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 2), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[b, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 2), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[b, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 2), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[b, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}, {"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}, {"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}, {"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, , a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}, {"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:c>"}}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}, {"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:49>"}}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:49>"}}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, 0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:49>"}}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[key, 1, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"previous", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, , a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"2147483639"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "2113863935"}, {"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "-2147483648", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "10", "<i:0>"}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[true, 0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[true, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<sample:0>"}}, 3), new String[][]{{"add", "java.lang.Object", "7"}, {"previousIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[true, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"-10"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"2"}, false, 11, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483647"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "1", "<s:C>"}}, 2), new String[][]{{"nextIndex", "", "3"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "1", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, true]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "1", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<b:true>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "clear", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<b:true>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, true, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:key>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, key, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}}, 2), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}}, 3), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2), new String[][]{{"previousIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "-2147483648", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "-2147483648", "<i:64>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "-2147483648", "<i:64>"}}, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2147483647", "<s:>"}}, 2), new String[][]{{"add", "java.lang.Object", "5"}, {"previous", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2147483647", "<s:>"}}, 2), new String[][]{{"add", "java.lang.Object", "5"}, {"previous", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2147483647", "<s:>"}}, 2), new String[][]{{"add", "java.lang.Object", "5"}, {"previous", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, 0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "7", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "1"}, {"org.apache.commons.collections.list.TreeList", "listIterator", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-29"}, {"org.apache.commons.collections.list.TreeList", "listIterator", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-2147483648", "<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"53", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "7"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "2147483639"}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483639"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483639"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483639"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "56", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "-2147483648"}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"53"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "2147483647"}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "2147483647"}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:1>"}}), new String[][]{{"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:1>"}}), new String[][]{{"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:1>"}}), new String[][]{{"hasPrevious", "", "4"}, {"previousIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:1>"}}), new String[][]{{"hasPrevious", "", "4"}, {"previousIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[b, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:5>"}}), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[key, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:5>"}}), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[key, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:5>"}}), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[key, 0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:5>"}}), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[key, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<d:1.5>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[1.5, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:7>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:key>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:key>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:key>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:c>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:2key>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}, {"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:c>"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:2>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:a>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"next", "", "1"}, {"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, a, 2, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2113863935", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}), new String[][]{{"nextIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}), new String[][]{{"nextIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "53"}, {"org.apache.commons.collections.list.TreeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "53"}, {"org.apache.commons.collections.list.TreeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "2113863935"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:c>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[, c]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:c>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, c, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:c>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[c, sample, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:c>"}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[c, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2113863935", "<null>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2113863935", "<null>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<d:1.5>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1.5, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<d:1.5>"}, false, 10, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1.5, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:2>"}, false, 10, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[2, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "6"}, {"nextIndex", "", "3"}, {"nextIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "53", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:(>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "53", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "26", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}}), new String[][]{{"add", "java.lang.Object", "5"}, {"previous", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483647"}, {"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2080374783"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "53", "<s:b>"}}, 1), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "53", "<s:b>"}}, 1), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[true, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[true, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[true, sample, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[true, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[true, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:a>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:-2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "2147483639"}, {"org.apache.commons.collections.list.TreeList", "clear", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "7"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2113863935", "<sample:0>"}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<i:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[2, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:2>"}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2113863935", "<sample:0>"}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<i:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[2, 0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "get", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"previousIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"previousIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"previousIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "53"}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-55>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "53"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "53"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}}, 3), new String[][]{{"previousIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 3), new String[][]{{"previous", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-512>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:),,(>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483639", "<s:lc>"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483639", "<s:lc>"}, {"org.apache.commons.collections.list.TreeList", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "1"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483639", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}), new String[][]{{"nextIndex", "", "4"}, {"set", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "59", "<s:c>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "59", "<s:c>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "59", "<s:c>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "59", "<s:c>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "53"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<d:1.5>"}}), new String[][]{{"hasPrevious", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 1.5]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-2147483647"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147483648", "<i:0>"}}), new String[][]{{"next", "", "7"}, {"set", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2113863935"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483639", "<d:1.5>"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2147483647", "<d:1.5>"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, 1, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, -2, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, -2, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "-2147483647", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"-2147483646"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<d:1.525>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 1), new String[][]{{"hasPrevious", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"hasPrevious", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "clear", ""}}, 3), new String[][]{{"nextIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "2113863935"}, {"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "53"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "53"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "53"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-1", "<sample:0>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"add", "java.lang.Object", "5"}, {"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, 0, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "10", "<s:>"}}, 1), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "10", "<s:>"}}, 1), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}}), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-1"}}), new String[][]{{"previousIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[true, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1.5, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:c>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 14, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147483647", "<s:a>"}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 12, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:N>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:N>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "38", "<i:1>"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "7"}}, 2), new String[][]{{"previous", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}), new String[][]{{"previous", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "1"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-1>"}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, -1, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "1"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-1>"}}, 3), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, -1, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-1>"}}, 3), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, -1, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-1>"}}, 3), new String[][]{{"next", "", "3"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, -1, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147483648", "<i:-1>"}}, 3), new String[][]{{"next", "", "3"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147483648", "<i:-1>"}}), new String[][]{{"next", "", "3"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"next", "", "3"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"next", "", "3"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:,a>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:,a>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "-2013265920"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "-2147483648"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"set", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:c>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[c]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:;>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[;]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "10"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
}
