package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "get", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "comparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<sample:3>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<null>"}, false), new String[][]{{"headMap", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:;;>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:;>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<null>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>"}}), new String[][]{{"isEmpty", "", "1"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isValidUplink", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:ak1gd=y>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "get", "java.lang.Object", "<s:D>"}}), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "2"}, {"put", "java.lang.Object,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:0>", "<sample:1>", "<sample:4>"}}), new String[][]{{"hasPrevious", "", "6"}, {"getKey", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<i:26>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}}), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<i:-268435456>"}}, 2), new String[][]{{"next", "", "6"}, {"hasNext", "", "2"}, {"remove", "", "7"}, {"setValue", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<i:-1073741824>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<s:;;>"}}, 2), new String[][]{{"next", "", "6"}, {"hasNext", "", "2"}, {"remove", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "get", "java.lang.Object", "<i:-58>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<d:2.83>"}}, 3), new String[][]{{"isEmpty", "", "7"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followLeft", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:4>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<s:kkey>", "10", "-18"}}), new String[][]{{"remove", "java.lang.Object", "4"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "tailMap", "java.lang.Object", "<i:-107>"}}, 3), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "get", new String[]{"java.lang.Object"}, new String[]{"<s:kaeey>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "containsKey", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "5"}, {"setValue", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:ley>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<i:-107>", "<s: =>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<d:2.83>", "-18", "-2147483648"}}), new String[][]{{"firstKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followLeft", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:2>"}}), new String[][]{{"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:cx4>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followRight", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<d:3.0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<s:kfy>"}}), new String[][]{{"firstKey", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<s:;L->", "-1", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:.G,u\nf>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}}, 1), new String[][]{{"headMap", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:o>"}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}}, 3), new String[][]{{"lastKey", "", "4"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=1, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s:kkezs>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getKeyAnalyzer", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:3>", "10"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<null>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key=0, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:>", "-1073741824"}, false, 9, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s:/kez>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:`Fj2gdk=y>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=key0 [9], right=null, predecessor=key0 [9]) {isEmpty=true, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<s:04n>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "containsKey", "java.lang.Object", "<s:kfy>"}}), new String[][]{{"size", "", "0"}, {"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:k1gd=y>"}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", ""}}, 3), new String[][]{{"clear", "", "3"}, {"containsKey", "java.lang.Object", "0"}, {"tailMap", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:.dB\rAu`/>"}, false, 12, new String[][]{}), new String[][]{{"getToKey", "", "1"}, {"isEmpty", "", "0"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "0"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:<3gg!!>"}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "get", "java.lang.Object", "<sample:2>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<s:004!n>"}}, 3), new String[][]{{"put", "java.lang.Object,java.lang.Object", "2"}, {"isToInclusive", "", "4"}, {"keySet", "", "6"}, {"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<s:k1gd=8a>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<i:154>"}}), new String[][]{{"clear", "", "4"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "0"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"entrySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntrySet", actual.getClass().getName());
  assertEquals("[RootEntry(key= [-1], value=true, parent=null, left=ROOT, right=null, predecessor=ROOT)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:49m(1\013>"}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "get", "java.lang.Object", "<s:Sbg\n>"}}, 2), new String[][]{{"clear", "", "4"}, {"put", "java.lang.Object,java.lang.Object", "4"}, {"getToKey", "", "7"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<null>"}}), new String[][]{{"get", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:;L->"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitsPerElement", ""}}), new String[][]{{"headMap", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"previous", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:\tB>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "incrementSize", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}}, 1), new String[][]{{"subMap", "java.lang.Object,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:\0165>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastEntry", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<s:Cg>"}}), new String[][]{{"lastKey", "", "6"}, {"firstKey", "", "0"}, {"entrySet", "", "7"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "6"}, {"iterator", "", "6"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:1k.>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:xg6D>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s:Qg;3>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<s:i-\"i\n/>"}}), new String[][]{{"firstKey", "", "3"}, {"isEmpty", "", "5"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "keySet", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "2"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:;>ccggj\">"}, false, 10, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<s:ak1gd=y>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:c.>"}}, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}, {"remove", "java.lang.Object", "0"}, {"clear", "", "2"}, {"lastKey", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:;>"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:9>", "<sample:4>"}}), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "2"}, {"size", "", "5"}, {"getToKey", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s::A<>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<s:b>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:j5ed11--d>"}}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}, {"containsKey", "java.lang.Object", "0"}, {"clear", "", "5"}, {"firstKey", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "higherEntry", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:1>", "0"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "tailMap", "java.lang.Object", "<s:ak1gd=y>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}}, 1), new String[][]{{"getKey", "", "1"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=2, key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<s:04n>"}}, 2), new String[][]{{"getValue", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:2>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}}), new String[][]{{"hasPrevious", "", "7"}, {"next", "", "4"}, {"getKey", "", "5"}, {"previous", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>g>", "<s:AK4>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>", "<sample:9>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "entrySet", ""}}, 2), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "6"}, {"putAll", "java.util.Map", "6"}, {"putAll", "java.util.Map", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.PatriciaTrie", actual.getClass().getName());
  assertEquals("{key0=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:.G,u\nf>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<s:C\tk>"}}), new String[][]{{"remove", "java.lang.Object", "2"}, {"lastKey", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<s:h>"}, false, 10, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:c>", "<s:>8xKLK>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "incrementSize", ""}}), new String[][]{{"isEmpty", "", "4"}, {"isEmpty", "", "3"}, {"isInternalNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{c=>8xKLK, key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 10, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:c>", "<s:>8xKLK>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "incrementSize", ""}}), new String[][]{{"isEmpty", "", "4"}, {"isEmpty", "", "3"}, {"isInternalNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{c=>8xKLK, key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<null>", "<sample:4>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<s::F=1>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 10, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<d:-39.143800000000006>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}}), new String[][]{{"clear", "", "3"}, {"isEmpty", "", "4"}, {"firstKey", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:<M>"}, false, 12, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:tk.>", "<s:;Lx>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<null>"}}), new String[][]{{"isEmpty", "", "6"}, {"tailMap", "java.lang.Object", "0"}, {"clear", "", "5"}, {"comparator", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:c4->"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:7>", "-1"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:\n>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "prefixMap", "java.lang.Object", "<s:QB>"}}, 3), new String[][]{{"containsValue", "java.lang.Object", "7"}, {"replace", "java.lang.Object,java.lang.Object", "0"}, {"clear", "", "4"}, {"lastKey", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "remove", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "incrementSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "6"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:2>", "<s:r0R>"}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:1>", "-1"}}, 3), new String[][]{{"containsValue", "java.lang.Object", "5"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{b=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:(>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<s:kez>"}}, 2), new String[][]{{"entrySet", "", "3"}, {"remove", "java.lang.Object", "7"}, {"iterator", "", "5"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:ak>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<d:3.7>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<s:kez>"}}, 2), new String[][]{{"entrySet", "", "3"}, {"remove", "java.lang.Object", "7"}, {"size", "", "0"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:yytyo>"}}, 2), new String[][]{{"entrySet", "", "5"}, {"size", "", "2"}, {"contains", "java.lang.Object", "6"}, {"retainAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 15, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<s:k1gd=y>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "tailMap", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:-56>"}}, 3), new String[][]{{"lastKey", "", "7"}, {"firstKey", "", "0"}, {"entrySet", "", "6"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeEntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=-56}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<s:ak1gd=y>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastEntry", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:m>", "<i:-1073741822>"}}, 3), new String[][]{{"lastKey", "", "1"}, {"firstKey", "", "1"}, {"entrySet", "", "1"}, {"clear", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<s:xg6D>", "2", "1"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:<p>"}}), new String[][]{{"lastKey", "", "6"}, {"firstKey", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:wx5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<s:i-\"i\n/>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<s:Dg>", "10", "2147483647"}}), new String[][]{{"firstKey", "", "7"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=wx5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:Ko>", "<i:-268435456>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:X>", "<s:wx5>"}}, 3), new String[][]{{"firstKey", "", "4"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{Ko=-268435456, X=wx5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:key0>"}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<s:;>ccggj!>"}}), new String[][]{{"firstKey", "", "0"}, {"clear", "", "5"}, {"putAll", "java.util.Map", "3"}, {"entrySet", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeEntrySet", actual.getClass().getName());
  assertEquals("[Entry(key=key0 [63], value=sample, parent=key2 [62], left=key0 [63], right=key1 [9], predecessor=key0 [63])]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:1>", "8"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:\ndc\"\">"}}, 3), new String[][]{{"containsValue", "java.lang.Object", "3"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "4"}, {"isEmpty", "", "0"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ndc\"\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=2, =true, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:+\0166S>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<s:key0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<s:cx4>"}}, 2), new String[][]{{"firstKey", "", "0"}, {"clear", "", "5"}, {"lastKey", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:D>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:)dn>"}}, 3), new String[][]{{"firstKey", "", "5"}, {"headMap", "java.lang.Object", "4"}, {"remove", "java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=D, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:)e>"}}), new String[][]{{"firstKey", "", "5"}, {"headMap", "java.lang.Object", "4"}, {"size", "", "2"}, {"get", "java.lang.Object", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:^^>", "<s:by<B``>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<s:ddo\"\">"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:/!!a?DI900>"}}, 3), new String[][]{{"firstKey", "", "3"}, {"headMap", "java.lang.Object", "4"}, {"containsValue", "java.lang.Object", "7"}, {"firstKey", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:-2147483576>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:<p>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s:>"}}, 2), new String[][]{{"lastKey", "", "2"}, {"headMap", "java.lang.Object", "4"}, {"size", "", "5"}, {"lastKey", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "selectValue", new String[]{"java.lang.Object"}, new String[]{"<s:;L->"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitsPerElement", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<s:kkezs>", "<s:=>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<s:key0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}, 3), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "remove", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.451>", "<d:3.0>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:3.7>", "<d:3.0>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:-1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:2.902>", "<d:3.0>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:-1>"}}, 3), new String[][]{{"putAll", "java.util.Map", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:2.902>", "<d:3.0>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:-1>"}}, 3), new String[][]{{"entrySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntrySet", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:2.902>", "<d:3.0>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<sample:0>"}}, 3), new String[][]{{"entrySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntrySet", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:2.902>", "<d:3.0>"}, false, 12, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<sample:0>"}}, 3), new String[][]{{"entrySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntrySet", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:2.902>", "<d:3.0>"}, false, 10, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<sample:0>"}}, 3), new String[][]{{"entrySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntrySet", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:2.902>", "<b:false>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:1>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:\n>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:0>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:1>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:\t>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<s:key>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<d:-15.657520000000002>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:5>", "10"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:r>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "remove", new String[]{"java.lang.Object"}, new String[]{"<d:-39.143800000000006>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "containsKey", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "remove", new String[]{"java.lang.Object"}, new String[]{"<d:-39.143800000000006>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<d:-19.579900000000002>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<d:-39.143800000000006>", "<sample:0>"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<d:-39.143800000000006>", "<sample:0>"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<d:-39.143800000000006>", "<sample:0>"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<d:-39.143800000000006>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet", actual.getClass().getName());
  assertEquals("[Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key2 [62], predecessor=key1 [63]), Entry(key=key1 [63], value=a, parent=key2 [62], left=key0 [9], right=key1 [63], predecessor=key1 [63]), En...#301#-1181073778", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:9k>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<s:key>", "-2147483648", "-2147483648"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitsPerElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<d:-1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=-1.5, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<d:-39.143800000000006>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<d:3.7>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<sample:2>", "<null>"}}, 2), new String[][]{{"thenComparing", "java.util.function.Function,java.util.Comparator", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<d:-39.143800000000006>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<d:3.7>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<sample:2>", "<null>"}}, 2), new String[][]{{"thenComparing", "java.util.function.Function,java.util.Comparator", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<d:-39.143800000000006>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<d:3.7>"}}, 2), new String[][]{{"thenComparing", "java.util.function.Function,java.util.Comparator", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<d:-39.143800000000006>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<d:3.7>"}}, 2), new String[][]{{"thenComparing", "java.util.function.Function,java.util.Comparator", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<d:-39.143800000000006>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<d:3.7>"}}, 2), new String[][]{{"thenComparing", "java.util.function.Function,java.util.Comparator", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "tailMap", "java.lang.Object", "<d:3.7>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<d:-39.143800000000006>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<d:3.7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "tailMap", "java.lang.Object", "<d:3.7>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<d:-39.143800000000006>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<d:3.7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s: ;=>"}}, 2), new String[][]{{"thenComparing", "java.util.Comparator", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s: =>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:\t>"}}, 2), new String[][]{{"thenComparing", "java.util.Comparator", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s: =>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:\t>"}}, 2), new String[][]{{"thenComparing", "java.util.Comparator", "3"}, {"reversed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s:=e>"}}, 1), new String[][]{{"thenComparing", "java.util.Comparator", "3"}, {"reversed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s:=e_>"}}, 1), new String[][]{{"thenComparing", "java.util.Comparator", "3"}, {"reversed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s:=e>"}}, 1), new String[][]{{"thenComparing", "java.util.Comparator", "3"}, {"reversed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s:=e>"}}, 1), new String[][]{{"thenComparing", "java.util.Comparator", "3"}, {"reversed", "", "0"}, {"compare", "java.lang.Object,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:;>", "10"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=key0 [9], right=null, predecessor=key0 [9]) {isEmpty=true, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:;>", "10"}, false, 0, null, 3), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:g>", "10"}, false, 0, null, 3), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<i:-1>", "2147483647", "-2147483648"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:1>", "8"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<sample:1>", "4", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:1>", "7"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followRight", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>", "<sample:2>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>", "<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}, 3), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>", "<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=1.5 [9], value=value, parent=null, left=1.5 [9], right=null, predecessor=1.5 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key [3], value=0, parent=null, left=key [3], right=null, predecessor=key [3]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"setKeyValue", "java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"getKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subtree", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<d:-1.5>", "18", "0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subtree", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<d:-5.155>", "-2147483648", "2147483647"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<i:-2147483648>", "-18", "1"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followRight", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getNearestEntryForKey", "java.lang.Object,int", "<s:;;>", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s: ;=>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:9>", "0"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<d:11.644>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:9>", "0"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<d:2.902>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s:;>"}, false, 15, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:9>", "0"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<d:2.902>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2), new String[][]{{"hasPrevious", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitIndex", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-39.143800000000006>", "<i:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}}, 2), new String[][]{{"isInternalNode", "", "1"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}}, 2), new String[][]{{"isInternalNode", "", "1"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<d:-1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=a, parent=ROOT, left=ROOT, right=key1 [63], predecessor=key1 [63]) {isEmpty=false, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=0, parent=ROOT, left=ROOT, right=key2 [62], predecessor=key1 [63]) {isEmpty=false, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitsPerElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<d:3.0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<d:3.0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<d:3.0>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:3.7>", "<d:3.0>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:0>", "<sample:7>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=1 [1], value=b, parent=null, left=1 [1], right=null, predecessor=1 [1]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<d:1.5>", "<i:2>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<d:2.902>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-39.2638>", "<d:3.7>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:b>"}}), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-39.143800000000006>", "<null>"}, false, 11, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:b>"}}), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "keySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$KeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "compareKeys", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<d:-39.143800000000006>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "removeEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<d:3.7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "containsKey", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<s:key>", "-2147483648", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<null>", "1"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=key0 [9], right=null, predecessor=key0 [9]) {isEmpty=true, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<d:-1.5>", "1"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "remove", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "compare", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-39.2638>", "<d:3.0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "remove", new String[]{"java.lang.Object"}, new String[]{"<d:-39.143800000000006>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<d:-19.579900000000002>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet", actual.getClass().getName());
  assertEquals("[Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9])]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet", actual.getClass().getName());
  assertEquals("[Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9])]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<sample:3>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<sample:3>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<sample:3>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<sample:3>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<sample:3>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:;;>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s: ;=>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isValidUplink", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:0>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<sample:0>", "-1", "1"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<sample:1>", "-1", "-1"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<sample:0>", "-1", "2"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<sample:1>", "-1", "-1"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<b:true>", "-1", "2"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<sample:1>", "-1", "-1"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<d:-45.143800000000006>", "-1", "4"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "mapIterator", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<sample:1>", "-1", "-1"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "select", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getNearestEntryForKey", "java.lang.Object,int", "<d:-39.143800000000006>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<s:b>", "1", "-1073741892"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:4>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "mapIterator", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "entrySet", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followLeft", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key1 [63], predecessor=key1 [63]) {isEmpty=false, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<d:2.902>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:7>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<d:5.804>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:7>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}), new String[][]{{"getFromKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.804", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<d:11.608>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:7>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}), new String[][]{{"comparator", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<d:11.608>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:7>"}}), new String[][]{{"clear", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.PatriciaTrie", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<s:;>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<s:;>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key1 [63], value=0, parent=key0 [9], left=key0 [9], right=key1 [63], predecessor=key1 [63]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<s:;>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key2 [62], value=, parent=key0 [9], left=key1 [63], right=key2 [62], predecessor=key2 [62]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isExternalNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isExternalNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isExternalNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<d:1.5>", "2147483647", "0"}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lengthInBits", new String[]{"java.lang.Object"}, new String[]{"<d:-39.2638>"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<i:-2147483648>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=1 [1], value=b, parent=null, left=1 [1], right=null, predecessor=1 [1]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=2 [2], value=key, parent=null, left=2 [2], right=null, predecessor=2 [2]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=true [6], value=c, parent=null, left=true [6], right=null, predecessor=true [6]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key= [5], value=true, parent=null, left= [5], right=null, predecessor= [5]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=c [7], value=-1, parent=null, left=c [7], right=null, predecessor=c [7]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=1.5 [9], value=value, parent=null, left=1.5 [9], right=null, predecessor=1.5 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<s:;>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=1.5 [9], value=value, parent=null, left=1.5 [9], right=null, predecessor=1.5 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>"}, false, 13, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<s:;>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=1.5 [9], value=value, parent=null, left=1.5 [9], right=null, predecessor=1.5 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>"}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<s:;>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=1.5 [9], value=value, parent=null, left=1.5 [9], right=null, predecessor=1.5 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:10>"}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<s:;>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=value [10], value=a, parent=null, left=value [10], right=null, predecessor=value [10]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<s:;>"}}), new String[][]{{"isExternalNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<d:-3.0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<d:-2.728>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:b(>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b(", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:b(>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b(", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:b(>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b(", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:b(4>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b(4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:b(5>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b(5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:oc(5>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("oc(5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<d:-39.143800000000006>"}}), new String[][]{{"thenComparing", "java.util.function.Function,java.util.Comparator", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:3>", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s: =>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:\t>"}}), new String[][]{{"thenComparing", "java.util.Comparator", "3"}, {"reversed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s: =>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:\t>"}}), new String[][]{{"thenComparing", "java.util.Comparator", "3"}, {"reversed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s: =>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:\t>"}}), new String[][]{{"thenComparing", "java.util.Comparator", "3"}, {"reversed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<i:1>", "-2147483648", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:7>", "<sample:5>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=c [7], value=-1, parent=null, left=c [7], right=null, predecessor=c [7]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subtree", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<d:-39.2638>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subtree", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<i:2>", "-2147483648", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:2>", "<sample:6>", "<sample:5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<d:-39.2638>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "comparator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$Values", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "comparator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$Values", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isValidUplink", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "higherEntry", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:6>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:4>", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "selectKey", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "removeEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<null>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:6>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:4>", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:4>", "<sample:2>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=0 [4], value=, parent=null, left=0 [4], right=null, predecessor=0 [4]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key [3], value=0, parent=null, left=key [3], right=null, predecessor=key [3]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false), new String[][]{{"isExternalNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>", "<sample:9>", "<sample:1>"}, false), new String[][]{{"getKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:7>", "<sample:9>", "<sample:1>"}, false), new String[][]{{"getKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:7>", "<sample:9>", "<sample:2>"}, false, 7, new String[][]{}), new String[][]{{"getKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<null>", "<sample:3>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:2>", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>", "<sample:3>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:2>", "-18"}}), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>", "<sample:3>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:2>", "-18"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "prefixMap", "java.lang.Object", "<s:;>"}}), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<d:11.608>", "<d:-45.143800000000006>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<d:11.608>", "<d:-45.143800000000006>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:1>", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{b=2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "compare", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<s:a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<d:11.608>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<s:;>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<d:-11.608>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}}), new String[][]{{"keySet", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<d:-11.608>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<d:-116.08000000000001>"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getKeyAnalyzer", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getKeyAnalyzer", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getKeyAnalyzer", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getKeyAnalyzer", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<d:2.902>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "select", new String[]{"java.lang.Object"}, new String[]{"<s:;;>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "select", new String[]{"java.lang.Object"}, new String[]{"<s:;>"}, false), new String[][]{{"isExternalNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "incrementSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<d:-45.143800000000006>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "incrementSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followRight", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "incrementSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followRight", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
}
