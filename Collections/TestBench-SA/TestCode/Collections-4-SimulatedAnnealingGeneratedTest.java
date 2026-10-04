package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:a>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:b>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<i:-48>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:-1>"}}, 1), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:-16>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$ValuesIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1=[b], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:1fXY>", "<s:Ea>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<empty>"}, {"org.apache.commons.collections.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections.map.MultiValueMap", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:a>", "<s::>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", ""}}), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[0, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<null>"}, true), new String[][]{{"put", "java.lang.Object,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<null>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[null, sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:>", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[0, sample, ], key0=[sample, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s::>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s::>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{:=[0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:1>", "<s:b>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:1>", "<s:b>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:1>", "<s:b>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:key>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:key>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 12, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.map.MultiValueMap", "values", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 15, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 15, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 15, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample, a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, sample], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "-1"}, {"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s::>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483647>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:1073709081>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:65536>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[, a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:1073741823>"}, false, 12, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:;>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"iterator", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:+>"}, {"org.apache.commons.collections.map.MultiValueMap", "clear", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0, 0], key1=[sample, sample], key2=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:\r>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0, sample], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:eXY>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0, 0], key1=[sample, sample], key2=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:eXY>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0, sample], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:eXX>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[], key1=[a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[a], key1=[0], key2=[sample]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[sample], key1=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[], key1=[a], key2=[0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:2>"}}, 1), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<s:a>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:X?ctu:>", "<s:Ni>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<s:Ni>"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<i:48>"}, false, 12, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<i:48>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[0, sample, ], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<i:48>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[0, sample, ], key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 24, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 25, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 26, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<b:true>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key=[true]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ey>", "<b:true>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:A>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{ey=[true], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ey>", "<b:true>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:A>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{ey=[true], key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ey>", "<b:false>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:A>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{ey=[false], key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ey>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:A>"}, {"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{ey=[1], key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ey>", "<sample:1>"}, false, 12, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:A>"}, {"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{ey=[1], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:dy>", "<sample:1>"}, false, 12, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:A?>"}, {"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{dy=[1], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=[b], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:aP>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{aP=[b], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288494", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}, {"org.apache.commons.collections.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}}), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}}), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}}), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}}), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "7"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:0>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:aP>"}, {"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true), new String[][]{{"containsKey", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"10"}, false), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"10"}, false, 8, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a, a], key1=[0, 0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[sample, , 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:3>", "<sample:5>"}, true), new String[][]{{"containsValue", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[], key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[], key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[], key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s::>"}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-1>", "<sample:3>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:key>", "<s:a>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<b:true>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[sample], key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576942", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900090843", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906667912", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6576864", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900090968", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<empty>", "<sample:4>"}, true), new String[][]{{"get", "java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:2>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:a>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:a>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:b>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:XX>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{XX=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:eXX>", "<sample:0>"}, false, 8, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{eXX=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:eXY>", "<sample:0>"}, false, 8, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{eXY=[], key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<empty>"}, true), new String[][]{{"putAll", "java.util.Map", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:<t8>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<i:-48>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[a, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<i:48>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, sample, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[a, 0, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"iterator", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, true), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:4>"}, true), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:86.4>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:86.4>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:,>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:86.45400000000001>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:+>"}, {"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:\r>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0, sample], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:\r>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[sample]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[], key1=[a]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, true), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, true), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[a], key1=[0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[], key1=[a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 13, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ceu,>", "<s:P>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ceu,>", "<s:P>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[0, sample, ], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ceu,>", "<s:Px>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:4>", "<s:/>>>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<b:true>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[true], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<b:true>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[true], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<b:true>"}, {"org.apache.commons.collections.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<empty>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "toString", ""}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "0"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=[true], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:ke4y>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=[true], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[1.5], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[1], a=[1.5], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<d:0.96>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.96", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[0.96], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a]>", "<d:0.96>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.96", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a]=[0.96], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[2], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=[2], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<i:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[4], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<i:47>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[47], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<i:47>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[47], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<b:true>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key=[true]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[sample], key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:eXY>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 24, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 25, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "3"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "7"}, {"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s::>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:b>"}}, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:b>"}}, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:r->"}, false, 13, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:kez>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-903379419", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9865436", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288369", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-903379335", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900091048", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, true), new String[][]{{"isEmpty", "", "5"}, {"get", "java.lang.Object", "6"}, {"putAll", "java.util.Map", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-1048575>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1048575=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-1048548>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1048548=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-1048548>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}, {"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1048548=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 2), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "7"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[a], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<s:o>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "2147483647"}, {"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[o], key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:c>", "<s:8>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{c=[8], key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[sample], key2=[], key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[a], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key2=[sample], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[], key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[a], key2=[0], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s::>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{:=[0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s::>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{:=[0], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s::>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[sample, , 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{:=[0], key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[sample], key2=[], key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[a], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key2=[sample], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<d:13.9>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<s::>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 2), new String[][]{{"clone", "", "3"}, {"keySet", "", "0"}, {"addAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<d:1.5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:a>"}, {"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:a>"}, {"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:a>"}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 14, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-7>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<sample:1>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-7>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<sample:1>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
}
