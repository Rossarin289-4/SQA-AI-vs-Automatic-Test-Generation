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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"getKey", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}), new String[][]{{"reset", "", "0"}, {"setValue", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:aa3>", "<s:kaeys>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:aX>", "<s:kfy>"}}, 2), new String[][]{{"reset", "", "7"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-33554431>", "<s:y>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-33554431=y, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-67>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:0>", "<s:bc>"}}), new String[][]{{"contains", "java.lang.Object", "3"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=bc, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:0>"}}), new String[][]{{"clear", "", "5"}, {"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"mapIterator", "", "6"}, {"getValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<null>"}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<b:true>"}}), new String[][]{{"containsAll", "java.util.Collection", "5"}, {"size", "", "2"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}}), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:)>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:y>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"iterator", "", "6"}, {"getValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "5"}, {"iterator", "", "7"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:bb>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{bb=-1, key0=, key1=a, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<s:)>"}, {"org.apache.commons.collections.map.Flat3Map", "clone", ""}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, true=)}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:-2147483648>"}}), new String[][]{{"iterator", "", "5"}, {"next", "", "3"}, {"setValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:aX>"}}), new String[][]{{"remove", "java.lang.Object", "6"}, {"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:>"}}), new String[][]{{"remove", "java.lang.Object", "0"}, {"removeAll", "java.util.Collection", "7"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}), new String[][]{{"removeAll", "java.util.Collection", "4"}, {"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:1b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 3), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}), new String[][]{{"next", "", "7"}, {"setValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:/>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=3, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}, {"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-2147483648>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:y>", "<i:62>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0, key0=a, y=62, key2=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, y=62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:/>", "<i:-67>"}}), new String[][]{{"next", "", "6"}, {"remove", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{/=-67}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:Akaey>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<null>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:+aezs=>"}}), new String[][]{{"iterator", "", "7"}, {"getKey", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<s:>"}}), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, true=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:k1fBz>"}}), new String[][]{{"iterator", "", "6"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=k1fBz, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "5"}, {"iterator", "", "4"}, {"setValue", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:l0>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:)>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-25>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:)>", "<s:44>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{)=44, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<i:-2147483648>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{null=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<s:7m>"}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:+aezs=>", "<i:62>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:6>", "<s:9m>"}}), new String[][]{{"remove", "java.lang.Object", "5"}, {"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-8388568>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:81>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900089275", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=, null=81}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:c9m>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{=c9m,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=c9m, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:kfy>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:kfy>", "<s:8)>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, kfy=8)}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<s:key>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:-1>"}}, 2), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=-1, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<s:+afzs>>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, true=+afzs>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "3"}, {"replace", "java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<s:key2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:44>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3290161", String.valueOf(actual));
  assertEquals("receiver state after the call", "{44=null, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"iterator", "", "2"}, {"next", "", "2"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}, 3), new String[][]{{"next", "", "4"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "5"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:fy>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:44>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=fy, key0=sample, key1=, null=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "5"}, {"remove", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<i:-134217658>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<sample:6>", "<s:8)>"}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:Pl0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=-134217658, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:aa3>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:c9>"}}), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}, {"put", "java.lang.Object,java.lang.Object", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:_3>"}}), new String[][]{{"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-2147483648>"}}), new String[][]{{"next", "", "5"}, {"next", "", "7"}, {"setValue", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=true, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}, {"replace", "java.lang.Object,java.lang.Object", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<b:true>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<s:kaey>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=, 2=kaey, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:)>", "<i:-52>"}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{)=-52, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-33>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-57>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:_>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=, key1=a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"addAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:11>", "<i:-67108862>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, value=-67108862}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<b:false>"}}, 2), new String[][]{{"clear", "", "4"}, {"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:aX>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<sample:0>"}}, 2), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "6"}, {"containsValue", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:)>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:kady>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-52>"}}, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:1]b>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=sample,key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"putAll", "java.util.Map", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:`X>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"reset", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:kffy>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:key,>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:p)f>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6577028", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<i:-67108866>"}}, 1), new String[][]{{"entrySet", "", "6"}, {"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 3), new String[][]{{"mapIterator", "", "2"}, {"setValue", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-67108853>", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-67108853=false, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "size", ""}}, 1), new String[][]{{"mapIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:38>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}, 3), new String[][]{{"entrySet", "", "0"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<b:true>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:Dfyy>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:>"}}, 3), new String[][]{{"keySet", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}, 3), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-33554423>", "<sample:0>"}}, 1), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{-33554423=a, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-33554423=a, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:)>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:aX>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:y>", "<d:1.5>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, y=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"containsKey", "java.lang.Object", "4"}, {"remove", "java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:1.5>", "<i:-52>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=-52, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<d:0.15>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=0.15, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"containsKey", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"keySet", "", "2"}, {"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:aa3>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-33>", "<i:-67108862>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-33=-67108862, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:kfy>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:62>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<i:-101>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=-101, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:fy>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:k>", "<s:>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{k=, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:kaey>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:aX>", "<sample:5>"}}), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{aX=0, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:1b>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0, key2=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:kaeys>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:kaex>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=, key1=a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906668005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:bbbb>", "<s:kk>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{bbbb=kk, key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{bbbb=kk, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:ka+ys>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-83>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=sample,key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-52>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$ValuesIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "1"}, {"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:Tkpaeys>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-903379507", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-33>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"values", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:am>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:5>", "<s:kgy>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=kgy}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "0"}, {"isEmpty", "", "2"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:a}>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<i:-33554431>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=-33554431}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"remove", "java.lang.Object", "2"}, {"mapIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<sample:1>"}}), new String[][]{{"isEmpty", "", "4"}, {"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:aX>"}, {"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:y>"}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091060", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"entrySet", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:o)>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6580510", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, null=o)}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:*>"}}), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}}), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:y>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:aa3>", "<s:fy>"}}), new String[][]{{"remove", "java.lang.Object", "1"}, {"values", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[, fy]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{aa3=fy, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:5>"}}), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:,`X>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6577028", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:aXX>"}}), new String[][]{{"remove", "java.lang.Object", "0"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:}y>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:-67108866>"}}), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:aa3>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:aa3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}, {"org.apache.commons.collections.map.Flat3Map", "clone", ""}}), new String[][]{{"next", "", "2"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:-52>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "0"}, {"remove", "java.lang.Object", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:ta>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:a>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:kaey>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}), new String[][]{{"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:kaey>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:o)>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:67>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<d:15.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:foy>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:kfy>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-1>"}}), new String[][]{{"clone", "", "5"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-33>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:kaeys>", "<s:kaezs>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{kaeys=kaezs, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:-16777249>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2), new String[][]{{"reset", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false), new String[][]{{"mapIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:aa3>"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:key>"}}, 1), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:62>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0, key2=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<sample:3>"}}, 2), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}, {"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 1), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
}
