package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"2147483647", "NaN"}, false, 9, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:kez>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:aaa>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, null=kez}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"-2147483548", "39", "<b:true>", "<i:-31>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,java.lang.Object", "<sample:0>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, =true, c=-1, key0=, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, =true, c=-1, key0=a, key1=0, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, =true, c=-1, key0=0, key1=sample, key2=, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, =true, c=-1, key0=sample, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", "int,int", "-2147483648", "-1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<i:-2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", "int,int", "-1073741824", "-1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:b>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", "int,int", "-1073741832", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-2147483648", "-10"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-2130706432", "-10"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2130706432", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-1", "-517"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-518", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"1", "-517"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"1", "-517"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"1", "258"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "2147483647", "0", "<null>", "<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:9>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<s:kfy]>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"12", "NaN"}, false, 9, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", "int,float", "-2147483648", "1.0"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:aaa>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"12", "NaN"}, false, 9, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<s:key>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:aaa>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=key, key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"12", "NaN"}, false, 9, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<s:kez>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:aaa>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=kez, key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:6>", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:6>", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:6>", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 12, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:6>", "1", "<sample:5>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<s:kez>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:61>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:4>", "1", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:61>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, c=-1, key0=sample, key1=a, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:4>", "1", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:61>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, c=-1, key0=sample, key1=, key2=a, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:4>", "1", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:61>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, c=-1, key0=sample, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:4>", "1", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:61>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, c=-1, key0=0, key1=sample, key2=, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", "java.lang.Object,java.lang.Object", "<d:1.5>", "<sample:1>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}}, 3), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.CaseInsensitiveMap", actual.getClass().getName());
  assertEquals("{key0=sample, key1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:5>", "<d:1.5>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:0>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:5>", "-1", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:5>", "<d:1.518>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:5>", "<d:-1.518>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:1>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:1>", "<d:-1.518>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:kez>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}}, 2), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:7>", "-2147483648", "<s:kez>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}}, 1), new String[][]{{"getKey", "", "2"}, {"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:7>", "-2147483648", "<s:kez>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}}, 1), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kez", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>", "1", "<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:a0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", "java.io.ObjectOutputStream", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", "java.io.ObjectOutputStream", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"33554489", "2147483591"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33554432", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"2147483647", "2147483591"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483590", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"2147483647", "1073741823"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741822", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"2147483647", "1073741881"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741880", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<sample:1>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", "int,float", "2147483647", "3.4028235E38"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, true=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, true=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1026>"}, false, 15, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, true=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1026>"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", new String[]{"java.io.ObjectOutputStream"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"-2147483648", "10", "<s:b>", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashMapIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"setValue", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "0"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, =true, c=-1, key0=, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", "int,int", "-29", "-1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, =true, c=-1, key0=sample, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "init", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", "int,int", "-29", "-1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, =true, c=-1, key0=, key1=a, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:key>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", "int,int,java.lang.Object,java.lang.Object", "0", "2147483647", "<i:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=null, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:key>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", "int,int,java.lang.Object,java.lang.Object", "0", "2147483647", "<i:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=null, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"2147483647", "10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"2147483647", "-10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"2147483647", "-10"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"2147483647", "-10"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-2147483647", "-10"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-2147483648", "-10"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,int,java.lang.Object,java.lang.Object", "<sample:1>", "-2147483648", "1", "<sample:0>", "<d:1.5>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,int,java.lang.Object,java.lang.Object", "<sample:1>", "-2147483648", "1", "<sample:0>", "<d:1.5>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,int,java.lang.Object,java.lang.Object", "<sample:1>", "-2147483648", "1", "<sample:0>", "<d:1.5>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,int,java.lang.Object,java.lang.Object", "<sample:1>", "-2147483648", "1", "<sample:0>", "<d:1.5>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,int,java.lang.Object,java.lang.Object", "<sample:1>", "-2147483648", "1", "<sample:0>", "<d:1.5>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,int,java.lang.Object,java.lang.Object", "<sample:1>", "-2147483648", "1", "<sample:0>", "<d:1.5>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,int,java.lang.Object,java.lang.Object", "<sample:1>", "-2147483648", "1", "<sample:0>", "<d:1.5>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<s:kfy]>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:-12>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "init", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"0", "0.75"}, false, 7, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"0", "0.75"}, false, 8, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"-19", "0.75"}, false, 8, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"-19", "1.34"}, false, 8, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"-19", "1.34"}, false, 8, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0, key=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"-2147483648", "1.34"}, false, 8, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0, key=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"-2147483648", "1.34"}, false, 8, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<s:kfy>", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0, kfy=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", new String[]{"int", "float"}, new String[]{"0", "NaN"}, false, 9, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", "int,float", "-2147483648", "1.0"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:aa>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:3>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", "int", "1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 18, new String[][]{}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("key0=0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("key1=sample", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 15, new String[][]{}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("key0=sample", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("key1=a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 17, new String[][]{}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("key1=0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 19, new String[][]{}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("key1=", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}}), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("key0=a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<null>", "2147483647", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:6>", "1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>", "2147483647", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:6>", "1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, 1=b, a=1, key0=sample, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:4>", "2147483647", "<null>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:6>", "1"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:kez>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", "int,int,java.lang.Object,java.lang.Object", "10", "1", "<s:b>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:lke>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:4>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", "int,int,java.lang.Object,java.lang.Object", "10", "1", "<s:/>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{/=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:aE>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", new String[]{"int"}, new String[]{"2097151"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2097152", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", new String[]{"int"}, new String[]{"2097160"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194304", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", new String[]{"java.io.ObjectOutputStream"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", new String[]{"java.io.ObjectOutputStream"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>", "1", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>", "2", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, a=1, key0=, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:7>", "2", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=b, a=1, b=2, key0=, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:6>", "2", "<sample:5>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:2>", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1=1.5, 0=, =true, c=-1, key0=, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:2>", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1=1.5, 0=, =true, c=-1, key0=a, key1=0, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:2>", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1=1.5, 0=, =true, c=-1, key0=0, key1=sample, key2=, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:2>", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1=1.5, 0=, =true, c=-1, key0=sample, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:2>", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySetIterator", actual.getClass().getName());
  assertEquals("Iterator[] {hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1=1.5, 0=, =true, c=-1, key0=, key1=a, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<i:0>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateNewCapacity", "int", "10"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int", "<sample:2>", "2147483608"}}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryValue", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:`d>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>", "-2147483648", "<sample:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:7>", "2147483647", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:kez>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>", "10", "<sample:7>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,java.lang.Object", "<sample:3>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", new String[]{"java.io.ObjectInputStream"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryNext", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{b=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<i:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{b=0, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<s:key>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{b=key, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:c>", "<s:key>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{c=key, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:c>", "<d:3.0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{c=3.0, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"removeAll", "java.util.Collection", "5"}, {"remove", "java.lang.Object", "5"}, {"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", "java.lang.Object", "<b:true>"}}), new String[][]{{"removeAll", "java.util.Collection", "5"}, {"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "convertKey", "java.lang.Object", "<b:true>"}}), new String[][]{{"removeAll", "java.util.Collection", "5"}, {"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "ensureCapacity", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=0, key0=a}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "2147483647", "<s:a>", "<s:aaa>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", actual.getClass().getName());
  assertEquals("a=aaa", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "2147483647", "<s:a>", "<s:aaa>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}}), new String[][]{{"setValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaa", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "2147483647", "<s:a>", "<s:aaa>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}}), new String[][]{{"setValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaa", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "2147483647", "<s:a>", "<s:a`a>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}}), new String[][]{{"setValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a`a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "1073741823", "<s:a>", "<s:a`a>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}}), new String[][]{{"setValue", "java.lang.Object", "0"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"10", "-1", "<s:a>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "getEntry", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"10", "0", "<s:aE>", "<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{aE=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "get", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-38>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:aaa>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:kez>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<sample:1>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-9373363", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-9427424", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1332812432", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-814542320", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<d:-0.75>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-300692367", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1850856689", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<d:0.375>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1928165678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<d:3.75>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "doReadObject", "java.io.ObjectInputStream", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1694324051", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", "int,int,java.lang.Object,java.lang.Object", "1", "0", "<s:>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "-1", "0", "<s:kez>", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:6>", "-1", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:1>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:6>", "-1", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:5>", "<d:1.5>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:5>", "-1", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "size", ""}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:aaa>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:7>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[sample, 0, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[a, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[0, a, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[a, , 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "values", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "get", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$Values", actual.getClass().getName());
  assertEquals("[, sample, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:7>", "-2147483648", "<s:kez>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", ""}}), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kez", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:7>", "-2147483648", "<s:kez>", "<s:key>"}, false), new String[][]{{"getKey", "", "2"}, {"setValue", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:2>", "10", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-1", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-1", "45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"-1", "37"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("36", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hashIndex", new String[]{"int", "int"}, new String[]{"33554431", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33554430", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"1", "-2147483648", "<b:true>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, true=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"1", "-2147483648", "<b:true>", "<i:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, true=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addMapping", new String[]{"int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"1", "-2147483648", "<b:true>", "<s:kez>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "size", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample, true=kez}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "init", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", "int,float", "2147483647", "3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<sample:1>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", "int,float", "2147483647", "3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, true=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:7>", "-1"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:4>", "-2147483648", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryHashCode", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "equals", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "equals", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "equals", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,java.lang.Object", "<sample:5>", "<b:false>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:5>", "-1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:5>", "1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, a=1, c=-1, key0=, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:6>", "1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, 1=b, a=1, key0=, value=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:5>", "-1023"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:3>", "1"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=1.5, 1.5=value, =true, c=-1, key0=sample, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "addEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int"}, new String[]{"<sample:0>", "1"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=, 2=key, =true, key0=sample, key=0, true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<sample:7>", "<i:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<null>", "<s:b>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntrySetIterator", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", ""}}, 2), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "createValuesIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>", "10", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualKey", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeMapping", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<sample:3>", "10", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "1", "1", "<d:1.5>", "<i:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "reuseEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "1", "1", "<d:1.5>", "<i:0>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:kez>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "keySet", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "calculateThreshold", "int,float", "-2147483648", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "destroyEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "hash", new String[]{"java.lang.Object"}, new String[]{"<s:kez>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "entryKey", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>"}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "doWriteObject", "java.io.ObjectOutputStream", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-922202996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "updateEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "java.lang.Object"}, new String[]{"<null>", "<b:true>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>", "0", "<sample:1>"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>", "0", "<sample:1>"}}, 1), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>", "0", "<sample:1>"}}, 1), new String[][]{{"size", "", "3"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>", "0", "<sample:1>"}}, 1), new String[][]{{"size", "", "3"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>", "0", "<sample:1>"}}, 1), new String[][]{{"size", "", "3"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "removeEntry", "org.apache.commons.collections.map.AbstractHashedMap$HashEntry,int,org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "<null>", "2147483647", "<sample:1>"}}, 1), new String[][]{{"size", "", "3"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "values", new String[]{}, new String[]{}, false, 26, new String[][]{}, 1), new String[][]{{"size", "", "3"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=sample, key0=0, key2=}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=sample}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "1", "<i:1>", "<null>"}, false), new String[][]{{"getKey", "", "2"}, {"setValue", "java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createEntry", new String[]{"org.apache.commons.collections.map.AbstractHashedMap$HashEntry", "int", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "-2147483648", "<i:1>", "<i:0>"}, false), new String[][]{{"getKey", "", "2"}, {"setValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "createKeySetIterator", new String[]{}, new String[]{}, false), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=0, key1=sample, key2=]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.AbstractHashedMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:b>"}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "containsKey", "java.lang.Object", "<s:b>"}}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.CaseInsensitiveMap", "org.apache.commons.collections.map.CaseInsensitiveMap", "isEqualValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<s:keHfy>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.CaseInsensitiveMap", "checkCapacity", ""}, {"org.apache.commons.collections.map.CaseInsensitiveMap", "hash", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
