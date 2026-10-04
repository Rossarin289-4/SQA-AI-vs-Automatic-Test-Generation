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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}}), new String[][]{{"previous", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "1547", "<i:-2147483648>"}}), new String[][]{{"set", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:td>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "size", ""}}), new String[][]{{"previousIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "2"}, {"remove", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{}), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"-2147483559", "<i:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{}), new String[][]{{"previous", "", "4"}, {"remove", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null, 0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<b:false>"}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[false, false, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:2147483630>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "1"}}), new String[][]{{"add", "java.lang.Object", "5"}, {"previous", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "1"}, {"add", "java.lang.Object", "2"}, {"nextIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1, b, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<s:ky>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ky, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{}), new String[][]{{"previous", "", "0"}, {"set", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, 2, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<s:X{>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X{", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:1>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, 1, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"2"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<i:-36>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, -36, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2", "<s:ky>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, ky, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:B>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147483622", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:b=>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[b=, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"-20", "<s:Bg>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147483648", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:kex>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"10", "<s:>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"-2147483618"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"521"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<s:_>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "2147483647"}}, 1), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 3), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:td>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 2), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"-1486"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:t>"}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:c>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:B>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<s:a>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-521"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1547"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-1547", "<i:-2147483648>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<null>"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "8388608"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:b=2r>"}}, 1), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:1>"}}, 3), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:t>"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483648"}}, 1), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 1), new String[][]{{"hasPrevious", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2147483647", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:Bd>"}}, 1), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<b:true>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, true, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"1547"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "3094", "<s:V>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:tc>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<sample:4>"}}, 3), new String[][]{{"set", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:ud>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:1>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "43", "<s:A>"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483587"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, 1, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:td>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483647"}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-1073741811"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:-63>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"-521"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-2147483647", "<s:d>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:keEy>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[key, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[false, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"11", "<s:D>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "39"}}, 1), new String[][]{{"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<s:9bB=>"}, {"org.apache.commons.collections.list.TreeList", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[9bB=, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "501", "<s:aa>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}, {"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "31", "<s:b=>"}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:; >"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:csd>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:\n>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"521"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"nextIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-2147483561", "<s:d>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"-260"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"504", "<b:false>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "134218249", "<s:b==>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:BA>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "509", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:b<>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:b=:>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-16>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "521", "<i:45>"}}), new String[][]{{"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "0", "<i:1>"}, {"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:b=r>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:b>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[b, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1", "<s:;>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:kex:>"}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<b:false>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, false, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[1, a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[b, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:b=0>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "134217738"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "-521"}}), new String[][]{{"hasPrevious", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:\rba=>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "-2"}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:2147483647>"}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "-43"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[2147483647, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<i:0>"}}), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "32"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "listIterator", "int", "1495"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<b:false>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[false, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "126"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:B\r>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[B\r, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:6bL=r>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, 6bL=r, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "0", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[false]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:e>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[e]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}), new String[][]{{"hasPrevious", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[b, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "521"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<b:false>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[false]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"previousIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "288"}}), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "73", "<s:CB>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-19>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}, {"org.apache.commons.collections.list.TreeList", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:;>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:tsd>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-2147483637"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}), new String[][]{{"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:-2147483648>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[b]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "11"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:B>"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[B, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:-1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-1, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "10"}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "3094", "<s:!key>"}, {"org.apache.commons.collections.list.TreeList", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "8"}}), new String[][]{{"next", "", "5"}, {"set", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:B>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[B, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "552", "<d:3.0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "-1", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:tb>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[tb, 0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2147483628", "<s:>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<i:-1>"}}, 2), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:=>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:b=>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[b=]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "contains", new String[]{"java.lang.Object"}, new String[]{"<i:-1073741824>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:ud>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:1>"}}), new String[][]{{"previousIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"previous", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"previousIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:b>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[b, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[, false]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "-29"}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:a>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, , a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:aW>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "-51", "<i:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[aW, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}), new String[][]{{"next", "", "1"}, {"nextIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "561"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147475320", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:T>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:b>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"previousIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[key, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<i:-1>"}}, 3), new String[][]{{"previous", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{}), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "-521"}}, 3), new String[][]{{"previousIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "2147483647", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[key, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 2), new String[][]{{"previous", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<d:-48.5>"}}, 3), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[true, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[key, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-2147483570"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "1073741792", "<b:true>"}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483392"}}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:!>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<i:1>"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2147483647", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, 1]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}, {"org.apache.commons.collections.list.TreeList", "remove", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:BB>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<s:b=>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:>"}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:b=r>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[b=r, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "-2147483648"}, {"org.apache.commons.collections.list.TreeList", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:;s>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "add", new String[]{"int", "java.lang.Object"}, new String[]{"2", "<s:=A>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, =A, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:a>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:11>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[11, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "3", "<s:a)<>"}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:B>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a)<]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:b>r>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "get", "int", "-1580"}, {"org.apache.commons.collections.list.TreeList", "listIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"nextIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:-1073741824>"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "toArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-1073741824, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "toArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<s:nm>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.collections.list.TreeList", "remove", "int", "8"}, {"org.apache.commons.collections.list.TreeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, sample]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "2", "<s:A>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, A, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[1, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, 0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "listIterator", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "listIterator", "int", "2147483527"}}), new String[][]{{"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.TreeList$TreeListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, 2]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<d:3.0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[3.0]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.list.TreeList", "indexOf", "java.lang.Object", "<i:-2147483585>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.collections.list.TreeList", "add", "int,java.lang.Object", "-2147483648", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.list.TreeList", "set", "int,java.lang.Object", "-2147483567", "<s:\r>"}}, 2), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "remove", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "get", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:-2147483648>"}, false, 3, new String[][]{{"org.apache.commons.collections.list.TreeList", "iterator", ""}, {"org.apache.commons.collections.list.TreeList", "contains", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[-2147483648]", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.TreeList", "org.apache.commons.collections.list.TreeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.list.TreeList", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0]", SearchInputFactory_scaffolding.receiverState());
 }
}
