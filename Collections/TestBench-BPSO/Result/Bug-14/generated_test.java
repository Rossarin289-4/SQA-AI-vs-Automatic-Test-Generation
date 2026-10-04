package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, null=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", new String[]{"java.io.ObjectOutputStream"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", new String[]{"java.lang.Object"}, new String[]{"<d:3.36>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "-2147483647", "<s:key>", "<i:-45>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", ""}}, 3), new String[][]{{"setValue", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<i:-13>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clear", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-2.9000000000000004>", "<i:1>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "remove", "java.lang.Object", "<d:10.254>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:4>", "<i:1>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{4=1, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "get", "java.lang.Object", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clear", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "40", "<d:1.5>", "<s:b>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("1.5=b", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", "java.lang.Object", "<s:D>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:1>"}}, 3), new String[][]{{"entrySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<null>", "<b:true>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", "java.lang.Object,java.lang.Object", "<s:b>", "<s:ey>"}}, 1), new String[][]{{"put", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>", "59", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:1>", "10", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", new String[]{"int"}, new String[]{"-1"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:4>", "2147483647", "<i:2>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,java.lang.Object,java.lang.Object", "<sample:7>", "0", "<s:key>", "<d:1.5>"}}, 2), new String[][]{{"setValue", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"2147483647", "NaN"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", new String[]{"java.io.ObjectInputStream"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "get", "java.lang.Object", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,java.lang.Object,java.lang.Object", "<sample:1>", "2", "<s:>", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "equals", "java.lang.Object", "<s:\rex>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:ke1y>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"0", "0", "<b:false>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{false=null, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", "java.lang.Object", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:4>", "1", "<b:false>", "<s:a>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:5>", "-2147483648", "<sample:5>"}}, 3), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "equals", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<s:r>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:eb>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,java.lang.Object", "<sample:1>", "<i:11>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:0>"}}, 1), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"-2147483648", "-2147483620", "<b:false>", "<s:key>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<d:5.127>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "0", "<i:0>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", "int,int,java.lang.Object,java.lang.Object", "0", "-2147483647", "<d:15.0>", "<s:>"}}, 2), new String[][]{{"getValue", "", "3"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{15.0=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<null>", "<s:key>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "get", "java.lang.Object", "<s:b>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:0>", "2147483647", "<sample:6>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "1", "<sample:0>", "<i:0>"}, false, 0, null, 1), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "8388648", "<s:>", "<i:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", "java.lang.Object,java.lang.Object", "<s:bbb>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("=0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "1", "<b:true>", "<s:5f>"}, false, 0, null, 3), new String[][]{{"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:8>", "-1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:k1y>", "<sample:4>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{k1y=key, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:5.127>", "<b:true>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "toString", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:8>", "-20", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "20", "<b:false>", "<s:bb>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<i:-45>", "<d:5.127>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("false=bb", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-45=5.127, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", "java.lang.Object", "<i:39>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", "java.io.ObjectOutputStream", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=sample, key0=0, key2=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:9>", "25", "2147483647", "<s:>", "<s:keey>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>", "-2147483648", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "get", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "2147483647", "<s:b>", "<s:bb>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("b=bb", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:i8>", "<s:bb>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{i8=bb, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"-1", "-3.4028235E38"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", "int,int,java.lang.Object,java.lang.Object", "2147483647", "-257", "<s:b>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:42>", "<i:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample, key1=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"1073741823", "1.0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<d:5.127>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:W>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<s:ke1y>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Object", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-67108864>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "-19", "<sample:0>", "<s:b>"}, false, 1, new String[][]{}), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6577028", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:10>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", "java.lang.Object", "<i:-24>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", ""}}), new String[][]{{"putAll", "java.util.Map", "2"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<s:bb]>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<d:2.5635>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>", "-2147483647", "<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:7>", "5", "<d:1.5>", "<s:ke1y>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}}), new String[][]{{"getValue", "", "7"}, {"setValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ke1y", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<s:bb>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", new String[]{"java.io.ObjectInputStream"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<i:19>", "<i:-2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", "java.lang.Object,java.lang.Object", "<i:1>", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", new String[]{"int"}, new String[]{"4116"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", "java.lang.Object,java.lang.Object", "<sample:1>", "<d:5.127>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("-1=1.5", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "remove", "java.lang.Object", "<s:kemy>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "remove", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.5=null, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", new String[]{"int"}, new String[]{"20"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<d:-5.127>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-5.127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:6>", "-2147483648", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "size", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"-1", "-1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"-2147483648", "NaN"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-40", "-1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "2147483647", "<b:true>", "<i:-22>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("true=-22", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-579222", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<s:\na>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<i:53>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<null>", "2147483647", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", new String[]{"java.io.ObjectOutputStream"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<null>", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}}), new String[][]{{"get", "java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<d:0.5126999999999999>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("166057533", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-22", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", new String[]{"java.io.ObjectOutputStream"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", "java.lang.Object", "<i:64>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "-1073741859", "<b:false>", "<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("false=1", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:7>", "-1", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", "int", "1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:2>", "2147483647", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:k31>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", "java.lang.Object,java.lang.Object", "<s:b1b>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"2147483647", "-1.4149312E19"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "0", "<i:1>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,java.lang.Object,java.lang.Object", "<sample:6>", "-2147483589", "<i:1>", "<s:alb>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("1=-1", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "remove", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"hasNext", "", "4"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("=true", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<i:-45>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", "int,int", "2147483647", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,java.lang.Object,java.lang.Object", "<sample:4>", "2147483647", "<s:b>", "<s:ley>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", "int,int", "-62", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=null, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<d:10.254>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("=true", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091060", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8130816", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", ""}}), new String[][]{{"next", "", "0"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, null=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:1>"}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"10", "1.0"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "get", "java.lang.Object", "<i:56>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:7>", "-2147483648", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "3"}, {"containsKey", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "remove", "java.lang.Object", "<sample:4>"}}), new String[][]{{"next", "", "3"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "10", "<sample:2>", "<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", ""}}), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:0>", "-2147483647", "<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kTe1y>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:7>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<i:45>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "remove", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-129393", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:l>", "<b:false>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288449", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:6>", "0", "<b:false>", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("false=a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", ""}}), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:rb b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, null=rb b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:-25>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:9.8>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "2147483647", "<s:pbFb>", "<d:1.5>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("pbFb=1.5", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<i:-2097197>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", "int", "-20"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{2=-2097197, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", "java.lang.Object,java.lang.Object", "<b:true>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "init", ""}}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false), new String[][]{{"putAll", "java.util.Map", "3"}, {"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0, key0=a, key2=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:2>", "<s:aa>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:-45>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:0>", "18", "<sample:5>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:3>", "<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "get", "java.lang.Object", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>"}}), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"-41", "-1", "<sample:3>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:9>", "2097162", "<sample:1>", "<i:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("1=0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", ""}}), new String[][]{{"setValue", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:4>", "10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, c=-1, key0=, true=c, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", ""}}), new String[][]{{"setValue", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$ValuesIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:11>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", new String[]{"java.io.ObjectOutputStream"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"0", "-0.54"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("true=c", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", "java.io.ObjectOutputStream", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<null>", "<s:key>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:8>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", new String[]{"java.io.ObjectOutputStream"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:1>", "33"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<d:5.127>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{5.127=null, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", ""}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "remove", "java.lang.Object", "<s:lIa>"}}), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<i:-45>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"9", "Infinity"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:7>", "-10", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", new String[]{"int"}, new String[]{"20"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:6>", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,int,java.lang.Object,java.lang.Object", "<sample:6>", "-2147483648", "0", "<sample:1>", "<i:-57>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", "int", "-50"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:-2147483648>"}}), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:8>", "-2147483633", "<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "-2147483648", "<s:i>", "<i:-64>"}, false, 4, new String[][]{}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<s:b<>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-31910335", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:6>", "<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "-131062", "<s:ke1y>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:2>", "10"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("ke1y=", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1=1.5, 0=, =true, c=-1, key0=, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<s:a>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{2=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,java.lang.Object,java.lang.Object", "<sample:10>", "-34", "<b:true>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-9427424", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288497", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"-32", "3.4028235E38"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-45>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", "int,int,java.lang.Object,java.lang.Object", "1", "8212", "<s:xb>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, xb=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "init", ""}}), new String[][]{{"isEmpty", "", "5"}, {"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "-2147467264", "<i:1>", "<s:kdy>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<sample:3>"}}, 1), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kdy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:+>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<i:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<s:-ke1y>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1274687541", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:6>", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "1073741823", "<i:-28>", "<s:bX>"}, false, 0, null, 1), new String[][]{{"setValue", "java.lang.Object", "3"}, {"setValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:6>"}}, 3), new String[][]{{"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "0", "-15", "<i:1>", "<s:HB>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:5>", "1", "<s:b>", "<i:1>"}, false, 0, null, 3), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 2), new String[][]{{"getValue", "", "7"}, {"setValue", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", "int,int,java.lang.Object,java.lang.Object", "1", "20", "<b:false>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{false=2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-922089969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:3>", "-5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:7>", "0"}}), new String[][]{{"setValue", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=value, 1=b, a=1, b=2, key0=0, key1=sample, key2=, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<d:5.127>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "<s:bx>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", new String[]{"java.lang.Object"}, new String[]{"<s:C>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<d:1.0253999999999999>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"put", "java.lang.Object,java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
