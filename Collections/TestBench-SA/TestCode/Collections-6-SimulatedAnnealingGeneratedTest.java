package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$ValuesIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=1.5, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}), new String[][]{{"getKey", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:47>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"remove", "java.lang.Object", "7"}, {"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}), new String[][]{{"reset", "", "7"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}), new String[][]{{"getValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}}, 1), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}}, 1), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "2"}, {"iterator", "", "6"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}, {"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}), new String[][]{{"contains", "java.lang.Object", "6"}, {"iterator", "", "0"}, {"setValue", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:0>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:;>"}}, 3), new String[][]{{"setValue", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=0, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:;>", "<s:>"}}), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "7"}, {"remove", "java.lang.Object", "7"}, {"remove", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{;=, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}), new String[][]{{"isEmpty", "", "2"}, {"remove", "java.lang.Object", "3"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<d:1.436>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<d:0.718>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<d:0.718>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0, key1=sample, key2=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:0>", "<s:a>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=null, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<d:0.7>"}, false, 15, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:`>", "<s:B;6uq>"}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{`=B;6uq, key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:-1>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:kBy>"}}), new String[][]{{"remove", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, null=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 17, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:1>"}}), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:l1>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:;>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=;, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<s:>"}}), new String[][]{{"containsValue", "java.lang.Object", "5"}, {"keySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[key, key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a, key=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:51>"}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<d:0.718>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:`,>", "<s:key>"}}), new String[][]{{"retainAll", "java.util.Collection", "3"}, {"retainAll", "java.util.Collection", "1"}, {"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<d:-1.436>"}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[-1.436, a, , 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0, key=-1.436}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<d:-0.75>"}, {"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:1.5>", "<b:true>"}, {"org.apache.commons.collections.map.Flat3Map", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("173127738", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=true, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:1.12>", "<s:kBy>"}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:`>"}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}), new String[][]{{"iterator", "", "2"}, {"getValue", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}), new String[][]{{"iterator", "", "2"}, {"getKey", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:nsE>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:51>"}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:bC>"}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:0.7>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0.7=2, 1=a, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<i:2>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{1=2,key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=2, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<d:0.63>"}}, 1), new String[][]{{"next", "", "5"}, {"remove", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "4"}, {"next", "", "5"}, {"setValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=key}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:B;6uq>", "<d:1.436>"}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:D;n6vq>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:B;6uq>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{D;n6vq=a, null=B;6uq}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288448", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=null, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<d:0.1436>"}}), new String[][]{{"next", "", "0"}, {"setValue", "java.lang.Object", "3"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=2, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:B;6uq>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=B;6uq}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:-32>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<b:false>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, null=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:-32>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<b:false>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, null=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<b:false>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, null=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<i:1>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=1, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"next", "", "6"}, {"next", "", "0"}, {"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<d:-0.1436>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=, null=-0.1436}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"iterator", "", "6"}, {"next", "", "5"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:E>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:E>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{E=null, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<d:-0.1436>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=-0.1436, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:b>"}}), new String[][]{{"next", "", "1"}, {"getValue", "", "4"}, {"next", "", "0"}, {"setValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=2, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:kaey>"}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 3), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 2), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "6"}, {"size", "", "7"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=-1, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=sample,key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=0,key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=a,key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091060", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906668005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6577028", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288449", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<b:false>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:47>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, true=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{true=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{false=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-2097150>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-1048575>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:k(ey>", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{k(ey=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}, 1), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}, 1), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}, {"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, true=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<i:-2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=-2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:{>", "<i:-2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, {=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:{>", "<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, {=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:D>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:a>"}}, 3), new String[][]{{"clear", "", "6"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"keySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"keySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"keySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}}, 1), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=0,key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=a,key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=sample,key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$ValuesIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=1.5, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:k(ey>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{k(ey=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}, {"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "7"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.19999999999999996>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample, key1=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=, key1=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=, key1=sample, key2=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=, key1=a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=, key1=0, key2=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:a>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:E>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<i:-2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=-2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}}, 1), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-2>"}}, 1), new String[][]{{"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}}), new String[][]{{"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 3), new String[][]{{"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 3), new String[][]{{"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 3), new String[][]{{"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:2>"}}, 3), new String[][]{{"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{0=2, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:2>"}}, 3), new String[][]{{"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{0=2, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:2>"}}), new String[][]{{"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{0=2, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091060", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906668005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906668005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6577028", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288449", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"next", "", "6"}, {"getKey", "", "6"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"next", "", "6"}, {"getKey", "", "6"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"next", "", "6"}, {"getKey", "", "6"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"next", "", "6"}, {"getKey", "", "6"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "2"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$ValuesIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "2"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$ValuesIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=0,key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=a,key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "7"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<s:a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=a, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=-1, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<d:3.0>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:pI>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}, {"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}, {"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0, key1=sample, key2=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}, {"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}, {"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}, {"entrySet", "", "3"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}, {"entrySet", "", "3"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}, {"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0, key1=sample, key2=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"containsKey", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "7"}, {"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
}
