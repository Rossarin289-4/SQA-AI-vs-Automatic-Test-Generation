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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "lastKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "int,java.util.Map", "-2147483647", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "remove", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "nextKey", "java.lang.Object", "<s:kLey>"}}, 1), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}}), new String[][]{{"removeAll", "java.util.Collection", "3"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:bu6>", "<d:1.0899999999999999>"}}), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$KeySetView", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:6>"}}), new String[][]{{"set", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=0, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "nextKey", "java.lang.Object", "<b:true>"}}), new String[][]{{"setValue", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "java.lang.Object", "<d:-1.9500000000000002>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "remove", "java.lang.Object", "<s:bu6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<i:45>", "<d:3.9000000000000004>"}}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"contains", "java.lang.Object", "2"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{45=3.9000000000000004, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:la>", "<i:-29>"}}), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"lastKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "firstKey", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "int", "2147483617"}}), new String[][]{{"getKey", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"remove", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "asList", ""}}), new String[][]{{"getValue", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:8>"}}), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "setValue", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:key>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keySet", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "remove", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=key, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"retainAll", "java.util.Collection", "0"}, {"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"next", "", "3"}, {"previous", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "previousKey", "java.lang.Object", "<s:_b>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "int,java.lang.Object,java.lang.Object", "1", "<sample:1>", "<s:}bu6>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=}bu6, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "decorated", ""}}), new String[][]{{"next", "", "1"}, {"getKey", "", "5"}, {"reset", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "size", ""}}), new String[][]{{"next", "", "7"}, {"remove", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"1", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "toString", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<s:hb>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=hb, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "int,java.lang.Object,java.lang.Object", "0", "<s:>", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=1.5, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "1"}, {"setValue", "java.lang.Object", "0"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "indexOf", "java.lang.Object", "<s:>"}}), new String[][]{{"iterator", "", "2"}, {"next", "", "0"}, {"setValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=2, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "size", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "firstKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"2147483647", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"-2147483648", "<b:true>", "<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "int", "-2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:ke9y>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "getValue", "int", "-1073741824"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "setValue", "int,java.lang.Object", "2147483647", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"2147483647", "<i:2>", "<i:4>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "int", "2147483622"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "valueList", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsKey", "java.lang.Object", "<s:a>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "asList", ""}}, 2), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "remove", "int", "2147483647"}}, 3), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "valueList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$KeySetView", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "int,java.util.Map", "2147483611", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key1=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "decorated", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "int", "20"}, {"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}}, 1), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"0", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "values", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<s:y>"}}, 1), new String[][]{{"size", "", "4"}, {"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:kLey>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "previousKey", "java.lang.Object", "<d:0.75>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<i:-2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"int"}, new String[]{"-64"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsKey", "java.lang.Object", "<s:<a>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "previousKey", "java.lang.Object", "<i:-2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$KeySetView", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<d:0.39>", "<d:3.9000000000000004>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.39=3.9000000000000004, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:]>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"2147483647", "<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "setValue", "int,java.lang.Object", "-2147483647", "<b:false>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "entrySet", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "lastKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "remove", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "int,java.util.Map", "134217727", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "firstKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<i:60>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "toString", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "asList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keyList", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "containsKey", "java.lang.Object", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:3.9000000000000004>", "<s:Tkey>"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keySet", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{3.9000000000000004=Tkey, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "setValue", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<s:`>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<d:1.0899999999999999>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "int,java.util.Map", "-52", "<sample:6>"}}, 1), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "nextKey", "java.lang.Object", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"0", "<s:bt6>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{bt6=key, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "valueList", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:``>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "remove", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"10", "<sample:5>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "getValue", new String[]{"int"}, new String[]{"-32"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "asList", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"indexOf", "java.lang.Object", "1"}, {"removeAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"46", "<i:0>", "<d:0.5449999999999999>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "nextKey", "java.lang.Object", "<i:-1073741824>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key0=sample, key1=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "nextKey", "java.lang.Object", "<d:-15.0>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "indexOf", "java.lang.Object", "<b:false>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "decorated", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:5>", "<i:-16431>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "remove", "int", "-128"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=-16431, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:kL:ey>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{kL:ey=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsKey", "java.lang.Object", "<d:-1.0899999999999999>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "get", new String[]{"java.lang.Object"}, new String[]{"<d:1.0899999999999999>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "int,java.lang.Object,java.lang.Object", "-32", "<d:1.5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "lastKey", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keyList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "get", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "firstKey", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"0", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "java.lang.Object", "<d:3.9000000000000004>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "get", new String[]{"int"}, new String[]{"-5"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "indexOf", "java.lang.Object", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<s:-a>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "getValue", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$KeySetView", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<d:1.9500000000000002>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$KeySetView", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "get", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "setValue", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"2147483647", "<s:a>", "<i:-48>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "valueList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<d:1.9500000000000002>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, true=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "getValue", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "getValue", "int", "-2147483648"}, {"org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "lastKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906668005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "getValue", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:0>"}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<s:yey>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"int"}, new String[]{"-11"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "previousKey", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "asList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:keyy>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:ob>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=, ob=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "remove", "java.lang.Object", "<d:3.9000000000000004>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "decorated", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "get", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "int,java.util.Map", "1024", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "int,java.util.Map", "-41", "<sample:3>"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "decorated", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<i:-4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "decorated", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "firstKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsKey", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:`c>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "lastKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"-2147483648", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "valueList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"1", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<s:`>"}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "indexOf", "java.lang.Object", "<s: ey>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "firstKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "1"}, {"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:key5>", "<d:1.9500000000000002>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, key5=1.9500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "setValue", "int,java.lang.Object", "54", "<s:ke.y>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "firstKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "previousKey", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "int,java.lang.Object,java.lang.Object", "0", "<d:1.9500000000000002>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.9500000000000002=, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "setValue", "int,java.lang.Object", "2147483647", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "getValue", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"2147483647", "<sample:5>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "values", ""}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:X>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsKey", "java.lang.Object", "<s:+>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "getValue", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "java.lang.Object", "<s:kFLey>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288449", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "remove", "int", "-8192"}}), new String[][]{{"addAll", "int,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"1", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "getValue", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "entrySet", ""}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<i:0>"}}), new String[][]{{"retainAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "nextKey", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "lastKey", ""}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"previous", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "entrySet", ""}}), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"1", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<d:-1.5>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{false=-1.5, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:5>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "valueList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<i:0>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<s:`>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[key0, key1, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=0, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$KeySetView", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "asList", ""}}), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<d:5.5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keyList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=5.5, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, true), new String[][]{{"entrySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key0=a, key1=0, key2=sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"0", "<s:a>", "<i:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=2, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:`>", "<s:E>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "int,java.lang.Object,java.lang.Object", "1", "<sample:3>", "<s:bBu6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{2=bBu6, `=E, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "getValue", "int", "-34"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key0=a, key1=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:A>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<d:3.9000000000000004>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsKey", "java.lang.Object", "<i:0>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "get", "int", "-78"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "lastKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "setValue", "int,java.lang.Object", "-2147483628", "<s:-6>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<b:false>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample, key1=, false=1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{false=1, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:`y`>", "<s:kex>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "lastKey", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[a, 0, kex]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{`y`=kex, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$KeySetView", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"0", "<i:-2>", "<s:l`>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "nextKey", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-2=l`, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "lastKey", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, true), new String[][]{{"setValue", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "int,java.lang.Object,java.lang.Object", "2147483589", "<i:0>", "<i:2>"}}), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:bu6>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, true), new String[][]{{"put", "java.lang.Object,java.lang.Object", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true), new String[][]{{"keyList", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"0", "<i:-1>", "<i:2>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=2, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "java.lang.Object", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keyList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<i:1>"}}), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keyList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-2147483648=1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "decorated", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "previousKey", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"int", "java.util.Map"}, new String[]{"0", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=0, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true), new String[][]{{"containsKey", "java.lang.Object", "2"}, {"containsValue", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "isEmpty", ""}, {"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=, true=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6577028", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "int,java.util.Map", "150", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "remove", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "setValue", "int,java.lang.Object", "16777216", "<s:al>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false), new String[][]{{"values", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keySet", ""}}), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "setValue", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:bu6>"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "getValue", "int", "53"}, {"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<s:`>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=bu6, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$KeySetView", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "nextKey", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key0=, key1=a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "firstKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "valueList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"1", "<sample:5>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "asList", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:1>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "keyList", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.list.UnmodifiableList", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "int,java.lang.Object,java.lang.Object", "1", "<i:-39>", "<i:0>"}}), new String[][]{{"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-39=0, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<s: p>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ValuesView", actual.getClass().getName());
  assertEquals("[,  p]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{b= p, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "keyList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "int,java.util.Map", "-32", "<sample:5>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "size", ""}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "toString", ""}}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "valueList", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<i:-7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{-7=a, key0=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-7=a, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "remove", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.map.ListOrderedMap", "keySet", ""}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ListOrderedIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "listOrderedMap", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "get", "int", "32"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.UnmodifiableListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "asList", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key0=0, key1=sample, key2=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:(>", "<s:Ley>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[(=Ley, key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{(=Ley, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "containsValue", "java.lang.Object", "<i:-51>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key0=a, key1=0, key2=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"keySet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[key0=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 6, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "equals", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "asList", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "put", new String[]{"int", "java.lang.Object", "java.lang.Object"}, new String[]{"1", "<s:>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "getValue", "int", "-44"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=0, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "firstKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "get", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:7>"}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "asList", new String[]{}, new String[]{}, false), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "putAll", "java.util.Map", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "asList", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.ListOrderedMap", "put", "java.lang.Object,java.lang.Object", "<s:kMez>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView", actual.getClass().getName());
  assertEquals("[kMez=true, key0=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{kMez=true, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.ListOrderedMap", "org.apache.commons.collections4.map.ListOrderedMap", "decorated", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
}
