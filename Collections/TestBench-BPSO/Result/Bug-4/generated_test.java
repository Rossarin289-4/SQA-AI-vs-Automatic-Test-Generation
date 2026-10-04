package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<sample:3>", "<empty>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:0{>", "<s:4>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:n>", "<s:k.y>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<d:19.5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}}), new String[][]{{"iterator", "", "7"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:0>"}}), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<sample:1>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<i:-22>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<empty>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"putAll", "java.util.Map", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.collections.FunctorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<null>", "<sample:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<null>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[a, 0, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], null=[a, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:`>"}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:ae>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[`, a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<sample:6>", "<d:1.41>"}, {"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=[1.41], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:_>"}}, 2), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:`>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{`=[a, 0], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<d:1.41>", "<sample:0>"}, {"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<d:1.41>", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<i:-9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "removeMapping", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<d:1.5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:t>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:2ey>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<null>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=[null], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, sample, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"trimToSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, a], key1=[0, 0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<i:0>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:5br>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-16>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"4"}, false, 4, new String[][]{}, 3), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-20>", "<s:`>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-20=[`], key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:68>"}}, 3), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:1a>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:5>", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, sample, -1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{5=[-1], key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}}, 1), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:16.5>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-46>", "<sample:0>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-46=[], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:key>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key=[a, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 2), new String[][]{{"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample, 0], key1=[, sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:14>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<b:false>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:c5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<i:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:14>", "<s:c>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{14=[c], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:je>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:_>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:key>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:>", "<i:-2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:-9>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[1], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<sample:2>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<d:-34.59>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s::5>", "<b:true>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-65568>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-65568=[sample], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288494", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:3.0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{3.0=[a], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<i:0>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:-1073741824>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<s:>"}}, 3), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:6>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<i:47>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{6=[a, 0, sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<s:h7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-27>", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:a>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-27=[, a], key0=[0, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "7"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"clear", "", "1"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:keyy>", "<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], keyy=[0, sample, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<d:1.41>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<d:1.41>", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.41=[b], key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<d:1.5>", "<i:-1>"}, {"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<i:-8>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:keyu>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-900090968", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:-8>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[], key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-32>", "<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:2>", "<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[sample], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "5"}, {"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:kdy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[sample], key1=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:9b>", "<s:>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:keey>"}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:a>", "<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[], a=[a, 0, sample], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<sample:6>", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=[a], key0=[sample, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:ley>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[a, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:7`>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{7`=[0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-1>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<d:0.21499999999999997>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:-8388617>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"60"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<sample:1>"}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:`W>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:23>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:c>", "<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{c=[0, sample, ], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a\n>", "<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<s:keey>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}, {"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:?>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[sample], key2=[], key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "3"}, {"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<d:5.64>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[0, sample, ], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<s:a>"}}), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<i:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[0], key1=[sample], key2=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<d:1.41>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:-32>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{=[-2147483648], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:47>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:`0>", "<d:0.75>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:5>", "<b:true>"}}), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{5=[true], key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a, ], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[sample, , 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 2), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<i:-75>"}, {"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[0]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:-4>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "hashCode", ""}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}), new String[][]{{"remove", "java.lang.Object", "1"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "remove", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:-9>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<s:`>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<i:-2147483648>"}}, 2), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s::>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<sample:3>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:0>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{0=[sample], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<i:0>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<empty>"}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:0>"}}), new String[][]{{"size", "", "0"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ], true=c}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], 0=[0, sample, ], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0=[0, sample, ], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "clear", ""}, {"org.apache.commons.collections.map.MultiValueMap", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key0=[sample, a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<s:^>"}}, 2), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{2=[^], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<s:b>", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<sample:3>"}}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=true, key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:E>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=[E], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<d:4.2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:5B>", "<s:=>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{5B=[=], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<d:0.141>", "<s:>"}, {"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<i:-3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{0.141=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<i:-4194304>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:2>", "<sample:3>"}, {"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-4194304=[a, 0], 2=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:5>"}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:T>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[], null=[T]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<sample:2>", "<s:ey>"}}), new String[][]{{"keySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:k+y>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{b=[2], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=[2], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<sample:2>"}}), new String[][]{{"addAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}}, 1), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:1>", "<sample:0>"}, true), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483603"}, false, 2, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<i:-9>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsKey", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-9>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}}, 1), new String[][]{{"clear", "", "2"}, {"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}, {"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<i:-2147483648>", "<b:true>"}}), new String[][]{{"add", "java.lang.Object", "4"}, {"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:4>", "<s:ma>"}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:D?>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[0], key2=[sample], key0=[a]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:43>", "<s:a>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{43=[a], key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:`>", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{`=[0], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<s:>", "<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[sample], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"-5"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "isEmpty", ""}}, 2), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "get", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:-18>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[-18, key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-18=[a], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "totalSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<null>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[sample, 4, , 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=[4], key0=[0], key1=[sample], key2=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<s:<>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[key0=[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{1=[0, sample, ], key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[0, sample, ], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "createCollection", new String[]{"int"}, new String[]{"93"}, false, 1, new String[][]{}), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<empty>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key0=[sample]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{key1=[a], key0=[]}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[true], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "-30"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:14.1>", "<i:47>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{14.1=[47], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], null=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:2>", "<sample:2>"}, true), new String[][]{{"iterator", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:7>", "<d:7.61>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:ae>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{7=[7.61], ae=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "org.apache.commons.collections.Factory"}, new String[]{"<sample:2>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "equals", "java.lang.Object", "<s:5ei>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<s:51>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("51", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample], key=[51]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<d:1.41>", "<sample:3>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.41=[sample], key0=[sample], key1=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a, ], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "entrySet", ""}, {"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 3), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, ], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "iterator", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>"}, true), new String[][]{{"putAll", "java.util.Map", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<s:>", "<sample:1>"}, {"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}), new String[][]{{"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[a, 0], key0=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-67108864>", "<s:4>"}, false, 6, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.lang.Object,java.util.Collection", "<i:-16383>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-16383=[a, 0], -67108864=[4], key0=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.IteratorChain", actual.getClass().getName());
  assertEquals("{hasNext=true, isLocked=true, size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288494", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "containsValue", "java.lang.Object,java.lang.Object", "<s:b>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<null>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<sample:2>"}, {"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=[b], key0=[, a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "putAll", "java.util.Map", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, ], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "iterator", new String[]{"java.lang.Object"}, new String[]{"<s:5>"}, false, 5, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.iterators.EmptyIterator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "totalSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "putAll", new String[]{"java.lang.Object", "java.util.Collection"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[a, 0], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "getCollection", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "size", "java.lang.Object", "<d:14.1>"}, {"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<i:-73>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=[-73], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"get", "java.lang.Object", "3"}, {"putAll", "java.util.Map", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "get", "java.lang.Object", "<sample:4>"}}), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[], key1=[a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:2.25>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2.25=[], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:3>", "<null>"}, true), new String[][]{{"containsValue", "java.lang.Object,java.lang.Object", "5"}, {"getCollection", "java.lang.Object", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:2>", "<d:0.75>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "createCollection", "int", "33554432"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=[0.75], key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "isEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "getCollection", "java.lang.Object", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map", "java.lang.Class"}, new String[]{"<sample:2>", "<null>"}, true), new String[][]{{"getCollection", "java.lang.Object", "4"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "removeMapping", "java.lang.Object,java.lang.Object", "<i:0>", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<i:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=[2], key0=[a], key1=[0], key2=[sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "put", "java.lang.Object,java.lang.Object", "<sample:4>", "<s:ley>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.map.MultiValueMap$Values", actual.getClass().getName());
  assertEquals("[, ley]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[], key=[ley]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "decorate", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, true), new String[][]{{"keySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-9>", "<s:n>"}, false, 1, new String[][]{{"org.apache.commons.collections.map.MultiValueMap", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-9=[n], key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.map.MultiValueMap", "org.apache.commons.collections.map.MultiValueMap", "containsValue", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:F>", "<sample:1>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a], key1=[0]}", SearchInputFactory_scaffolding.receiverState());
 }
}
