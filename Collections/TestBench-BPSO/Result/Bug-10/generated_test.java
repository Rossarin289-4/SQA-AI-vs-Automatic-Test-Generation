package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:b>", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, sample, , ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{b=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<empty>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:.>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:aa>", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 2), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:]->"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:4>"}, true), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "4"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:jey>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<sample:1>"}}), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:1>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:bWT>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[bWT, a, 0], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-1>", "<sample:3>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:-1>", "<i:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[-1, key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1=[sample], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:key1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[sample, , 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-0.3>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:key1>"}, {"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:6\u00e9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}, {"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:key1>", "<s:72>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[sample], key2=[], key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "values", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<b:true>", "<s:62>"}, {"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:key1>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:3>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[0, sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<d:0.15>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<i:1>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-2147483648=[1], key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<d:-1.488>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<i:18>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<d:39.15>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:aa>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-1>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:b>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:0.75>", "<sample:0>"}}, 2), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:aaa>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:I>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<sample:0>", "<d:0.15>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"contains", "java.lang.Object", "2"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:0.081>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:20>", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{20=[a, 0, sample], key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}}, 2), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:aa>"}}, 1), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:b3T>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b3T=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:1>", "<s:aa>"}}, 1), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[aa]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:-26>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[-26], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:cT>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:`a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[sample], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}}, 3), new String[][]{{"isEmpty", "", "1"}, {"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-262145"}, false, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:..\t>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-14>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-14=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<sample:0>", "<s:\013>"}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:aWW>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{aWW=[a], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:4>", "<i:-1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:x>"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:P>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<i:9>", "<s:D>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:a,,>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<i:1>", "<s:}a,>"}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:aa>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"clear", "", "1"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=false, isLocked=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:,>", "<i:0>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:ker8y>", "<s:key>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[a, 0], ker8y=[key], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<sample:1>"}}, 3), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1=[1], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:622>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:>", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<b:true>"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "3"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:2>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"containsValue", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:`a>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}}, 3), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:b>"}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1.5=[b], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:aa>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{aa=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-4>", "<b:true>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:14>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{14=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<d:48.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<d:3.0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<s:662>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:je\u00e9>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-5"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<d:0.15>", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, a, sample, a, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a, ], key1=[0, a], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:62>", "<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{62=[sample], key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906667912", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:bP>", "<i:-1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{bP=[-1], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:.>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}), new String[][]{{"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:a,>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:aa>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:0a>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[0, sample, ], key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:62>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "4"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:c>", "<s:a+>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:a,>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:1>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=[a, 0, sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-10>", "<i:-2147483648>"}, {"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-10=[-2147483648], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<s:b>"}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<d:4.65>", "<i:1>"}}), new String[][]{{"clear", "", "1"}, {"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:2a>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2a=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}), new String[][]{{"contains", "java.lang.Object", "6"}, {"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<d:0.15>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<d:3.0>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.15=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:F.>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[sample], key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "3"}, {"put", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=, key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}, {"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{0=[2], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[2], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-1.5>", "<s:\010>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:aXa>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:b>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:bT>"}, {"org.apache.commons.collections.map.MultiValueMap", "values", ""}}), new String[][]{{"iterator", "", "3"}, {"setIterator", "int,java.util.Iterator", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}}), new String[][]{{"clear", "", "7"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<s:LT>"}}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key=[LT]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[sample], key2=[], key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:aa>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:ikey>", "<s:aax>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<s:bT>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<b:true>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample], true=[a, 0, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:.>", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:62>", "<s:C,>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<s:k}\ny>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("k}\ny", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[k}\ny], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<b:true>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-2147483648=[true], key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:62>", "<d:-0.015>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{62=[-0.015], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:4>", "<s:aa->"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:/.>", "<s:bS>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{/.=[bS], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[0], key1=[sample], key2=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:a,>"}}), new String[][]{{"iterator", "", "1"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:ke}y>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:key>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[a], key1=[0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:aa>", "<sample:6>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:58>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{aa=[0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288494", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:>", "<b:true>"}}), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:bT>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}}), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}, {"org.apache.commons.collections.map.MultiValueMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:02>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{02=[a, 0, sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:62->"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-2147483648>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-2147483648=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:key>", "<b:true>"}, {"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, a], key1=[0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}), new String[][]{{"iterator", "", "1"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>"}, true), new String[][]{{"entrySet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntrySet", actual.getClass().getName());
  assertEquals("[key0=a, key1=0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>"}, true), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:cT>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:a>", "<sample:5>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=[a, 0, sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:,>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:62>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<i:0>"}}), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, sample, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:b>", "<sample:0>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<sample:1>"}}), new String[][]{{"clear", "", "4"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:>"}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=1, key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, true), new String[][]{{"getCollection", "java.lang.Object", "1"}, {"containsValue", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}), new String[][]{{"clear", "", "0"}, {"iterator", "", "3"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, true), new String[][]{{"iterator", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<i:0>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-2147483648>", "<s:a+>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-2147483648=[a+], key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<sample:1>"}}), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{-1=[b], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[b], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:31>", "<s:jey>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:jey>", "<s:I>"}, {"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{jey=[I], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:key>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key2=[sample], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:jey>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:32>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{jey=[a], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:2c>", "<s:x2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{2c=[x2], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:ke>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:a`>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-1>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<s:->"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[-], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:a,>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, 0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a,=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:62>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:0.15>"}}), new String[][]{{"isEmpty", "", "5"}, {"put", "java.lang.Object,java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:aaa>"}}, 2), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "2"}}, 3), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "2147483647"}}, 2), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:al,>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a,>", "<s:E3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:`>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a,=[E3], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:3.0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[a], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<i:-1>"}}, 3), new String[][]{{"isEmpty", "", "0"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:2>", "<sample:6>"}, true), new String[][]{{"containsKey", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<null>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:5>", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:jey>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{5=[0, sample, ], key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`aa>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[1], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:Fke.>", "<s:aa>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<null>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample], null=[0, sample, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:aa>", "<sample:3>"}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<s:.>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[.], aa=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>"}, true), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "5"}, {"replace", "java.lang.Object,java.lang.Object", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:.>", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{.=[a], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:/>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900090968", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:aaF>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:aa>"}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-2>", "<s:.>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-2=[.], aaF=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:-2>", "<s:b>"}}, 2), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<i:-2147483648>", "<i:0>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:;>"}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<i:-524287>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key2=[sample], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:15>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:<p>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{<p=[2], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:52>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{52=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key2=[sample], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<d:0.015>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<d:0.15>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.015=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<sample:0>", "<d:-1.5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a,>", "<s:\u00e9>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<sample:3>", "<s:a>"}, {"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<d:0.075>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ar,>", "<s:t2>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[true], ar,=[t2], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:S>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[S], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<s:bT>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<b:false>"}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[-1], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:b>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=[], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:cT>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}, 3), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:a,>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:jey>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:jeB>", "<s:bT>"}}), new String[][]{{"iterator", "", "4"}, {"next", "", "0"}, {"remove", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:jFey>"}}, 2), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:?>"}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=[?], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"4194304"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:aa>"}}), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:62>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:62?>", "<sample:0>"}}, 3), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{62?=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<sample:3>", "<i:1>"}}, 1), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[1], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:bT>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<d:0.15>", "<s:..e>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:key>", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0.15=[..e], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:a,>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:T>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{T=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:64>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"size", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:-bTD>", "<i:-18>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-bTD=[-18], key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "2"}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}), new String[][]{{"get", "java.lang.Object", "0"}, {"entrySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key=[false]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=[1], key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:0>", "<empty>"}, true), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:.>"}}, 1), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<s:>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<d:0.65>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:aa\t>"}}, 1), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, sample, b, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1=[b], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
}
