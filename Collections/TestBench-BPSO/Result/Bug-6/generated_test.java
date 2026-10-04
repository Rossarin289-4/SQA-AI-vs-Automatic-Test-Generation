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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:3>"}}), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:bb>", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{bb=0, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"getKey", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"isEmpty", "", "7"}, {"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<empty>"}}), new String[][]{{"iterator", "", "7"}, {"setValue", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:0.0375>", "<s:,>"}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<b:true>"}}, 1), new String[][]{{"setValue", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:bbM>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}, 2), new String[][]{{"size", "", "1"}, {"contains", "java.lang.Object", "2"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:aa>"}}), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=aa, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:3.0>", "<s:p>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{3.0=p, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"iterator", "", "4"}, {"getValue", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:1\rc>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:baP>", "<i:2147483647>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{baP=2147483647, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:4>"}}, 1), new String[][]{{"clear", "", "1"}, {"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "1"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"reset", "", "7"}, {"getValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"size", "", "1"}, {"retainAll", "java.util.Collection", "5"}, {"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<d:3.0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:=,>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<d:0.0375>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:cba>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:1_c>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1_c=2, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:iey]>", "<s:1\r>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0, iey]=1\r, key0=a, key2=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{iey]=1\r, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 2), new String[][]{{"iterator", "", "2"}, {"getKey", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:aa>"}}, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<d:0.7385>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:0.3>", "<b:true>"}, {"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-684083173", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.3=true, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:4>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{null=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:ba>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906664870", String.valueOf(actual));
  assertEquals("receiver state after the call", "{ba=null, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:;a>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:ie>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=, null=;a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:ie>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{ie=1, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "6"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:aa>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:<>"}}), new String[][]{{"next", "", "2"}, {"remove", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:iey>"}}, 2), new String[][]{{"next", "", "4"}, {"setValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=key, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<s:bb>"}, {"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=, key=bb}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:1>"}}), new String[][]{{"containsKey", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=1, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 3), new String[][]{{"next", "", "2"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:C>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<d:48.0375>"}}, 1), new String[][]{{"put", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=48.0375, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<d:15.0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, null=15.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<null>"}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<d:0.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=0.5, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:H>"}}), new String[][]{{"values", "", "1"}, {"retainAll", "java.util.Collection", "2"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, null=H}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-262140>", "<null>"}, {"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-262140=null, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}), new String[][]{{"iterator", "", "2"}, {"next", "", "5"}, {"setValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=2, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<d:1.999>"}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:aa=\n>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aa=\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=aa=\n, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<s:>"}, {"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:0>"}}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}, {"remove", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:cba>"}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<i:-536870913>"}}), new String[][]{{"next", "", "0"}, {"next", "", "0"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<s:0_crr>"}}), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:u>"}}), new String[][]{{"size", "", "2"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=u}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}, {"org.apache.commons.collections.map.Flat3Map", "clone", ""}}), new String[][]{{"clear", "", "1"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"next", "", "2"}, {"next", "", "5"}, {"setValue", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=true, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:0=d>"}, {"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0=d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, null=0=d}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:-2147483648>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-2147483648=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:C>"}, {"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<b:false>", "<i:2>"}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<b:false>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:0.1442>", "<d:-1.5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0.1442=-1.5, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:bb>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=bb, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<b:false>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<d:3.0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:70>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"keySet", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0, key1=sample, key2=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:bc>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:Dm>", "<s:aa>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{Dm=aa, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}, 2), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:6>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Mbb>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"size", "", "7"}, {"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2147483647>", "<i:-1>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{2147483647=-1, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:,>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:bb>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:`>"}, {"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<d:0.0375>"}}, 3), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-903379507", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<i:131070>"}, {"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<s:s>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:bba>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-903379507", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091060", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.033999999999999996>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"size", "", "5"}, {"retainAll", "java.util.Collection", "1"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:bba>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:bFb>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<d:-0.15>"}}, 3), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}, 2), new String[][]{{"clear", "", "1"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<d:1.995>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091060", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=sample,key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"mapIterator", "", "6"}, {"setValue", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:2=a>", "<i:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{2=a=2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6577028", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:obP>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:kz>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288449", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:bca>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=sample,key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<i:93>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=93, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<s:key>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=key, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:-9>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, true=-9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<s:o>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{b=o, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{2=a, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:0.075>", "<i:2147483647>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0.075=2147483647, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<s:\rb>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6577028", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:-262140>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<d:1.995>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091060", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}}), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=,key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.075>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<d:-3.99>"}, {"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false), new String[][]{{"values", "", "7"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:4>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:cb{>"}, {"org.apache.commons.collections.map.Flat3Map", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-262140>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"size", "", "0"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:C>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<d:0.9975>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.9975>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<i:-35>"}}), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<b:true>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=true, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<d:3.99>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}, {"org.apache.commons.collections.map.Flat3Map", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:4.29>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:57>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-8388606>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906668005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:2147483647>", "<s:bba>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{2147483647=bba, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0, key2=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<d:0.0375>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-689327252", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=0.0375, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}}), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isEmpty", "", "4"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091029", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<b:true>"}, {"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900089799", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=true, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:1073741823>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-903379507", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288449", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<d:0.0375>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"getValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"clear", "", "5"}, {"keySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "get", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}), new String[][]{{"size", "", "1"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}}), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false), new String[][]{{"mapIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyMapIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<s:iey>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<d:-0.075>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=-0.075, false=iey, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<sample:0>"}}), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "5"}, {"entrySet", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<d:7.98>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1594523528", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key=7.98}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:Ab>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-262140>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsKey", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<d:1.995>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "createDelegateMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}}), new String[][]{{"putAll", "java.util.Map", "5"}, {"entrySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0, key2=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$ValuesIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:\n>", "<i:-1073872894>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1973963917", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\n=-1073872894, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:iey>", "<i:0>"}}), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:`aP>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=,key1=sample,key0=0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"values", "", "4"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"values", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:c]a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{key0=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "entrySet", ""}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "keySet", ""}, {"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "createDelegateMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<s:+`>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.HashedMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key2=sample,key1=0,key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}, {"org.apache.commons.collections.map.Flat3Map", "equals", "java.lang.Object", "<s:bb>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clone", ""}}), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<d:3.99>", "<s:bL>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{3.99=bL,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{3.99=bL, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "putAll", "java.util.Map", "<sample:2>"}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "containsValue", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "values", ""}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$EntrySetIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "3"}, {"mapIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "remove", "java.lang.Object", "<s:if>"}}), new String[][]{{"reset", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$FlatMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:hf>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{hf=a,key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hf=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:bFb>", "<i:1>"}}), new String[][]{{"contains", "java.lang.Object", "1"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$ValuesIterator", actual.getClass().getName());
  assertEquals(" {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{bFb=1, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:bbl>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:{4>", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, {4=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.Flat3Map$Values", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "get", new String[]{"java.lang.Object"}, new String[]{"<s:1\016b>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "put", "java.lang.Object,java.lang.Object", "<s:tp>", "<s:baP>"}}), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, tp=baP}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.Flat3Map", "isEmpty", ""}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.Flat3Map", "org.apache.commons.collections.map.Flat3Map", "values", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"size", "", "2"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
}
