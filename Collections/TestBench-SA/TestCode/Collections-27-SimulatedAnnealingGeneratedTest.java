package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<s:`eeyDr>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<s:8>"}, {"org.apache.commons.collections4.map.MultiValueMap", "equals", "java.lang.Object", "<s:8>"}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:a>", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`eeDr>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`eer>", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:wf>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a, ], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:eY>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "org.apache.commons.collections4.Factory"}, new String[]{"<sample:0>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "org.apache.commons.collections4.Factory"}, new String[]{"<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}}), new String[][]{{"next", "", "4"}, {"setValue", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:`eey>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:`eeyDr>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:2>", "<sample:0>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "3"}, {"clear", "", "1"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:1>", "<sample:1>"}}), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"clear", "", "1"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:a`a>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:1>", "<sample:1>"}, {"org.apache.commons.collections4.map.MultiValueMap", "iterator", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{1=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<empty>", "<sample:1>"}, true), new String[][]{{"putAll", "java.util.Map", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections4.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:ve>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:key>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:key>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key=[a], ve=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0, 0], key1=[sample, sample], key2=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:err>"}, {"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "iterator", "java.lang.Object", "<s:>"}}), new String[][]{{"next", "", "4"}, {"getValue", "", "5"}, {"getKey", "", "2"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "clear", ""}}), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:key>"}, {"org.apache.commons.collections4.map.MultiValueMap", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[key, 0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:8>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:`eeyDr>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}, {"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:>", "<s:`efr>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[, key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=[`eeyDr], key0=[, a], key1=[a, 0], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:`eeyDr>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:a`a>"}, {"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:`eeyDr>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<s:>"}, false, 10, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[0, sample], key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[a], key1=[0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[0], key1=[sample], key2=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[sample]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<s:`eey>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<s:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<s:`eey>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<s:8>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-1>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[0, sample, ], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:u>"}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`eeDr>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[a], `eeDr=[], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:wf>"}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`eeDr>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[a], `eeDr=[], key0=[sample, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:wf}>"}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`eeDr>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`eeDr=[], key0=[sample, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\">"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`eeDr>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`eeDr=[], key0=[, 0], key1=[a, sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:e>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:wf>"}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<sample:0>", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a, sample], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:d>"}, false, 12, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:Iwf>"}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<sample:0>", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:d>"}, false, 12, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:aT>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:c.>"}, false, 12, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:aT>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:aT>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 10, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:aT>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\u00e9>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:af>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "iterator", "java.lang.Object", "<s:`eey>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:`eey>", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 8, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<s:`edr>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:aa.>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "equals", "java.lang.Object", "<s:`eeyDq>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:a>", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<b:true>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], true=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:df>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{df=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:dX>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{dX=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:dX>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{dX=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"8388609"}, false, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-84"}, false, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}, {"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<s:`eer>"}, {"org.apache.commons.collections4.map.MultiValueMap", "createCollection", "int", "0"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}, {"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:ex>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "remove", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "remove", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.map.MultiValueMap", "remove", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=b, key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=b, key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=b, key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=b, key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=b, key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:wf>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "getCollection", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:`eey>", "<s:wf>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"entrySet", "", "5"}, {"retainAll", "java.util.Collection", "4"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"1048567"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "equals", "java.lang.Object", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"1048567"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "equals", "java.lang.Object", "<s:key>"}}, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"clear", "", "7"}, {"entrySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:CTB>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<i:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:CTB>"}, false, 9, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<i:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s: Tm>"}, false, 8, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<i:-62>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<s:8>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1066992574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "createCollection", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a, 0], key1=[0, sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:`ee2lr>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "createCollection", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:`ed2lr>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "createCollection", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "iterator", "java.lang.Object", "<s:`eeDr>"}, {"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}}, 3), new String[][]{{"getValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}}, 2), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}}, 2), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "iterator", ""}}, 2), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "iterator", ""}}, 2), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:-1>", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<s:_ey>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<s:`eey>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<s:>"}, false, 9, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<s:8>"}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:a>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`eey>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-8388558>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`eeyDr>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`eeyDr=[], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:8388589>"}, false, 5, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`eeDr>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`eeDr=[], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:8388589>"}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`eeDr>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`eeDr=[], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:l>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`eeDr>", "<sample:0>"}, {"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`eeDr=[], key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:`eey>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "remove", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:`eey>"}, false, 8, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "remove", "java.lang.Object", "<i:-9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:`eer>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`eer=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:b>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, sample], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:2>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[0, sample, ], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-2=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-2>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-2=[a, 0, sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:5di>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<i:-2147483648>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:8>", "<i:2147483647>"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-136"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "createCollection", "int", "26"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}, {"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "equals", "java.lang.Object", "<s:8>"}, {"org.apache.commons.collections4.map.MultiValueMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample, a], key1=[, 0], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:8>", "<i:2>"}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:9>", "<i:2>"}, false, 4, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:`eey>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:`ee6D;r>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:`eey\n>"}, {"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-2147483648>", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-2147483648=[true], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "org.apache.commons.collections4.Factory"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "org.apache.commons.collections4.Factory"}, new String[]{"<sample:2>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "org.apache.commons.collections4.Factory"}, new String[]{"<empty>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "org.apache.commons.collections4.Factory"}, new String[]{"<empty>", "<sample:5>"}, true), new String[][]{{"mapIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "org.apache.commons.collections4.Factory"}, new String[]{"<sample:2>", "<sample:2>"}, true), new String[][]{{"mapIterator", "", "6"}, {"reset", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[sample], key2=[], key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[a], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key2=[sample], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[], key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[a], key2=[0], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, true), new String[][]{{"entrySet", "", "5"}, {"retainAll", "java.util.Collection", "4"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:wf>", "<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], null=[-1]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], null=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:`eeEy>", "<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`eeEy=[0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:eeEy>", "<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{eeEy=[0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:eeEy>", "<i:-30>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{eeEy=[-30], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<empty>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, true), new String[][]{{"clear", "", "7"}, {"entrySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:2>", "<sample:1>"}, {"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:a>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900090843", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-906667912", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1070281151", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-157036375", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1063704207", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-160324665", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1066992658", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-160324745", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-157036297", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false), new String[][]{{"entrySet", "", "7"}, {"removeAll", "java.util.Collection", "1"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1063704082", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-153747803", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-160324870", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=[sample], key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:`eey>", "<s:`eer>"}}), new String[][]{{"getValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}}), new String[][]{{"next", "", "4"}, {"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "iterator", ""}}, 2), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:`eeDr>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[`eeDr]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=[`eeDr], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:arn>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:`eeDr>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=[`eeDr], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:rn>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:`eeDr>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=[`eeDr], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:r>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<empty>"}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<empty>"}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<empty>"}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[sample, , 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=[], key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<sample:0>"}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[], key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:0>", "<sample:0>"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[], key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:`eey>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:/>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:`eeo>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:`eeDr>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:/>"}, false, 7, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:`eeo>"}, {"org.apache.commons.collections4.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:`eeDr>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>>"}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:`edo>"}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:`edDr>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:D>"}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:`edi>"}, {"org.apache.commons.collections4.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:`edDr>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<s:8>"}, {"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], true=[8]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<s:8>"}, {"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], true=[8]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<s:8>"}, {"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a], true=[8]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "totalSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "3"}, {"clear", "", "1"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:1>", "<sample:1>"}}), new String[][]{{"retainAll", "java.util.Collection", "2"}, {"clear", "", "1"}, {"size", "", "6"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:eY>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "size", "java.lang.Object", "<s:`eeyDr>"}, {"org.apache.commons.collections4.map.MultiValueMap", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:`eeD,r>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:_eeDA,>"}, false, 15, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:`eeyDr>", "<s:`eeDr>"}, {"org.apache.commons.collections4.map.MultiValueMap", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{`eeyDr=[`eeDr], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key2=[sample], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "iterator", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[], key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "iterator", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[a], key2=[0], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], key2=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "iterator", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.map.MultiValueMap", "decorated", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "containsKey", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=[b], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b<>", "<s:b;>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b<=[b;], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:<>", "<s:b;>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{<=[b;], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:<>", "<s:b6;>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b6;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{<=[b6;], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:<>", "<s:b6;>"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b6;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{<=[b6;], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:<>", "<s:b6<>"}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b6<", String.valueOf(actual));
  assertEquals("receiver state after the call", "{<=[b6<], key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:p<>", "<s:b6<u>"}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b6<u", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a], p<=[b6<u]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "isEmpty", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "values", ""}}, 2), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[sample], key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:-2147483605>"}, false, 14, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:-2147483605>"}, false, 14, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:-2147483605>"}, false, 13, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"listIterator", "", "3"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1073741824>", "<i:-2147483605>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections4.map.MultiValueMap", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>"}, true), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "multiValueMap", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:8>", "<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:a>", "<s:key>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<b:true>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], true=[a, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:8>", "<b:true>"}, false, 15, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:a>", "<s:key>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<b:true>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], true=[a, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:8>", "<b:true>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:1>", "<s:key>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<b:true>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], true=[a, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:8>", "<b:true>"}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:1>", "<s:key>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<b:true>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], true=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:8>", "<s:>"}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:1>", "<s:key>"}, {"org.apache.commons.collections4.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<b:true>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a], true=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:eY>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:eY>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:eY>"}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<sample:0>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"remove", "java.lang.Object", "7"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:`eer>"}, {"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<sample:0>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"remove", "java.lang.Object", "7"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:`eer>"}, {"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object", "<sample:0>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"remove", "java.lang.Object", "7"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}, {"clear", "", "4"}, {"remove", "java.lang.Object", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 1), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 1), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 1), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 1), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], key2=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 1), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 1), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<null>"}, {"org.apache.commons.collections4.map.MultiValueMap", "mapIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "get", "java.lang.Object", "<s:>"}}, 2), new String[][]{{"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.map.MultiValueMap", "org.apache.commons.collections4.map.MultiValueMap", "decorated", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:a>", "<d:1.5>"}, {"org.apache.commons.collections4.map.MultiValueMap", "values", ""}}), new String[][]{{"keySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
}
