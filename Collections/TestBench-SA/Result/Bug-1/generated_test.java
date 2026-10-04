package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:1>"}}), new String[][]{{"contains", "java.lang.Object", "2"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:24>", "<b:true>"}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{24=true, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:key>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 1), new String[][]{{"getValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:key>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"next", "", "6"}, {"setValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"next", "", "6"}, {"setValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"iterator", "", "3"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-27>", "<s:b>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-27=b, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[=1.5, key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=1.5, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-4>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, null=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:-54>"}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}}), new String[][]{{"setValue", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:27>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-27>", "<i:-1>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:24>", "<s:key>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:24>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"getKey", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "5"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:key>"}}), new String[][]{{"size", "", "3"}, {"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}), new String[][]{{"iterator", "", "5"}, {"getValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}), new String[][]{{"reset", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "7"}, {"hasNext", "", "1"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "1"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 3), new String[][]{{"values", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-37>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=1, key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:`>", "<d:1.5>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-54>"}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}, {"containsKey", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`=1.5, key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-108>"}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<i:24>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900089790", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, true=24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:-270>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}, 2), new String[][]{{"hasNext", "", "6"}, {"next", "", "2"}, {"getValue", "", "5"}, {"getKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3), new String[][]{{"remove", "java.lang.Object", "3"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "1"}, {"containsAll", "java.util.Collection", "2"}, {"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-108>", "<s:>"}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-108=, key0=, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:27>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<b:true>"}}, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "3"}, {"containsKey", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 1), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 1), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 3), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"clear", "", "2"}, {"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<s:a>"}}), new String[][]{{"contains", "java.lang.Object", "7"}, {"iterator", "", "5"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}, 3), new String[][]{{"iterator", "", "2"}, {"setValue", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{null=key}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "size", ""}}), new String[][]{{"iterator", "", "5"}, {"getKey", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"next", "", "7"}, {"remove", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:a>"}}), new String[][]{{"retainAll", "java.util.Collection", "6"}, {"iterator", "", "6"}, {"next", "", "5"}, {"setValue", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key2=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<sample:1>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<sample:1>"}}), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<sample:4>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"size", "", "1"}, {"clear", "", "2"}, {"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:b>"}}), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"size", "", "1"}, {"clear", "", "2"}, {"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288498", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=null, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576979", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=null, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-4>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-4=1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-54>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:keay>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{keay=b, key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:`>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, null=`}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:`>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, null=`}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-54>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=0, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:1>"}}, 1), new String[][]{{"remove", "java.lang.Object", "6"}, {"iterator", "", "6"}, {"next", "", "1"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}, {"replace", "java.lang.Object,java.lang.Object", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<i:2>"}, false, 12, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:27>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=2, =a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:1.5>", "<i:-37>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:-37>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=-2147483648, 1.5=-37, key0=, null=-37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:-2147483648>"}}, 3), new String[][]{{"contains", "java.lang.Object", "6"}, {"clear", "", "3"}, {"retainAll", "java.util.Collection", "3"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:27>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:0>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:37>"}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, null=37}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, null=key}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 23, new String[][]{}, 2), new String[][]{{"mapIterator", "", "0"}, {"next", "", "7"}, {"next", "", "6"}, {"setValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<sample:1>"}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:k<>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=1, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a2>", "<s:a>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-108>", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-108=null, a2=a, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<s:8a2>"}}), new String[][]{{"next", "", "2"}, {"next", "", "1"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=8a2, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}}), new String[][]{{"iterator", "", "6"}, {"next", "", "7"}, {"next", "", "0"}, {"setValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}, {"remove", "java.lang.Object,java.lang.Object", "6"}, {"remove", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}}, 1), new String[][]{{"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-2147483648>", "<i:28>"}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:>"}}, 3), new String[][]{{"remove", "java.lang.Object", "0"}, {"removeAll", "java.util.Collection", "2"}, {"removeAll", "java.util.Collection", "6"}, {"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=true, key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=true, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=key, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=key, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=key, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=key, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:[>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 24, new String[][]{}, 3), new String[][]{{"clear", "", "6"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 24, new String[][]{}, 3), new String[][]{{"clear", "", "6"}, {"clone", "", "5"}, {"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 25, new String[][]{}, 3), new String[][]{{"clear", "", "6"}, {"clone", "", "5"}, {"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}, 3), new String[][]{{"clear", "", "6"}, {"clone", "", "5"}, {"entrySet", "", "3"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 3), new String[][]{{"clear", "", "6"}, {"clone", "", "5"}, {"entrySet", "", "3"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"clear", "", "3"}, {"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"iterator", "", "3"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"iterator", "", "3"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"iterator", "", "3"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"iterator", "", "3"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:1>"}}, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample, key1=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:kbPe dy>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:24>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:key>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:24>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:key>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:24>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:key>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:24>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:key>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:24>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=sample,key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:b>"}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:b>"}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:24>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0, key1=sample, key2=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0, key1=sample, key2=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=null, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=true, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=true, key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=true, key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}), new String[][]{{"containsKey", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}), new String[][]{{"containsKey", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}), new String[][]{{"containsKey", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-27>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-27>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-27>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-27>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-27>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-27>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-27>"}}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-27>"}, {"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:1>"}}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 18, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 19, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 20, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 21, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 22, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 23, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 26, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:24>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:24>", "<b:true>"}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{24=true, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:41>", "<b:true>"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{41=true, key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 35, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:41>", "<b:true>"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{41=true, key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:41>", "<b:true>"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{41=true, key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:key>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<i:-27>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=-27, b=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:35>", "<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{35=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<s:key>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=key, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<s:key>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=key, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"next", "", "6"}, {"setValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"next", "", "6"}, {"setValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"next", "", "6"}, {"setValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"next", "", "6"}, {"setValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}), new String[][]{{"clear", "", "6"}, {"clone", "", "5"}, {"entrySet", "", "3"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"get", "java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"get", "java.lang.Object", "7"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[a=1.5, key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=1.5, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091060", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906668005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6577028", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288449", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-903379507", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:M>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9865479", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288528", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-903379559", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<i:2>"}}), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<s:a>"}, {"org.apache.commons.collections.map.Flat3Map", "size", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:L>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1=null, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288495", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"containsKey", "java.lang.Object", "7"}, {"replace", "java.lang.Object,java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-2>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-4>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-4>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-4>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-4>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=sample,key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=0,key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
}
