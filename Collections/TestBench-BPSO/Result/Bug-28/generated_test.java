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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:5key>", "-1073741826"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=key0 [9], right=null, predecessor=key0 [9]) {isEmpty=true, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "keySet", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$KeySet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "addEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "int"}, new String[]{"<sample:5>", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s:6key+>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "removeEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:1>", "0"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "removeEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Trie[1]={\n  Entry(key=b [2147483647], value=2, parent=key0 [9], left=b [2147483647], right=ROOT, predecessor=b [2147483647])\n  Entry(key=key0 [9], value=, parent=ROOT, left=b [2147483647], right=key0 ...#229#1792149482", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{b=2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>", "<sample:5>"}}), new String[][]{{"previous", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "keySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<s:ky;[>", "2147483647", "0"}}), new String[][]{{"contains", "java.lang.Object", "2"}, {"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastEntry", ""}}), new String[][]{{"getValue", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<s:x.key>", "<s:*>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:0>", "1073741826"}}), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "keySet", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "2"}, {"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "comparator", ""}}), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<s:>"}}), new String[][]{{"contains", "java.lang.Object", "3"}, {"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitsPerElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<s:4xkeey>", "<i:-24>"}}), new String[][]{{"clear", "", "1"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:A>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "comparator", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}), new String[][]{{"comparator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:6Ikey>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<s:>"}}), new String[][]{{"lastKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "selectKey", new String[]{"java.lang.Object"}, new String[]{"<s:key;[>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastEntry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:dkey>"}, false), new String[][]{{"entrySet", "", "2"}, {"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:key[>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<i:-155>", "<s:]al,`>"}}), new String[][]{{"tailMap", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<sample:8>"}, false), new String[][]{{"subMap", "java.lang.Object,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:kyy>"}, false, 5, new String[][]{}), new String[][]{{"firstKey", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:key;[>"}, false), new String[][]{{"clear", "", "4"}, {"remove", "java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false), new String[][]{{"setValue", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:kx;7[>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:6ey+>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:8>", "<sample:2>", "<sample:7>"}}), new String[][]{{"getToKey", "", "1"}, {"put", "java.lang.Object,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<s:xkLeeey>"}}), new String[][]{{"contains", "java.lang.Object", "2"}, {"iterator", "", "0"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "6"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<i:19>", "1", "-2147483648"}}), new String[][]{{"retainAll", "java.util.Collection", "0"}, {"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:l>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<s:5_>", "-10", "-10"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:6>", "<null>", "<null>"}}), new String[][]{{"isFromInclusive", "", "4"}, {"remove", "java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{}, 2), new String[][]{{"isToInclusive", "", "4"}, {"firstKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:6kOy,>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:x.key>"}}), new String[][]{{"firstKey", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:<oxkey>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "mapIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getEntry", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitsPerElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "containsKey", "java.lang.Object", "<s:xkLLeey>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "mapIterator", ""}}, 1), new String[][]{{"tailMap", "java.lang.Object", "4"}, {"replace", "java.lang.Object,java.lang.Object", "6"}, {"getToKey", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:=lb>"}, false, 0, null, 2), new String[][]{{"isEmpty", "", "2"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}}, 3), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$Values$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "higherEntry", new String[]{"java.lang.Object"}, new String[]{"<s:4Ixkeey>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:hfy<>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:<<xkey>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<s:ke>"}}), new String[][]{{"headMap", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:ke>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}), new String[][]{{"getFromKey", "", "3"}, {"putAll", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap", actual.getClass().getName());
  assertEquals("{key0=sample, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:6ke1>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<sample:0>"}}), new String[][]{{"lastKey", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:ke>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lowerEntry", "java.lang.Object", "<s:keyu>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "selectValue", new String[]{"java.lang.Object"}, new String[]{"<s:x.ke>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<s:f<<xkey>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isValidUplink", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<null>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<s:key[A0>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:la>"}, false), new String[][]{{"isEmpty", "", "0"}, {"firstKey", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "prefixMap", "java.lang.Object", "<s:y]aa>"}}), new String[][]{{"getKey", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<s:[>", "<s:bA>"}}), new String[][]{{"next", "", "1"}, {"hasNext", "", "6"}, {"setValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=key, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:C>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}}), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:b]>", "4057"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=ROOT, right=null, predecessor=ROOT) {isEmpty=true, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:6key+>", "<s:a_>"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}}, 2), new String[][]{{"lastKey", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:bsA>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<i:2>", "1073758167", "-3"}}), new String[][]{{"isEmpty", "", "7"}, {"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:EB<xkey>"}, false, 2, new String[][]{}), new String[][]{{"entrySet", "", "7"}, {"remove", "java.lang.Object", "1"}, {"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:xkLeey>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>"}}), new String[][]{{"firstKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"isEmpty", "", "7"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:kC>"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}, 3), new String[][]{{"entrySet", "", "3"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:xk>Leeey>"}, false), new String[][]{{"entrySet", "", "7"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<s:aa`>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:CC>", "<s:xklLeey>"}}), new String[][]{{"setValue", "java.lang.Object", "2"}, {"setValue", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{CC=true, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:12>"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"next", "", "3"}, {"getValue", "", "0"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:ke>"}, false), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<s:\nkyf6y>"}}), new String[][]{{"firstKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"next", "", "2"}, {"previous", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "mapIterator", ""}}), new String[][]{{"next", "", "2"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:ix.kyey>"}, false, 2, new String[][]{}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "2"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryInSubtree", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<null>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:5ke>"}}, 3), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:_>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}}), new String[][]{{"lastKey", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"next", "", "5"}, {"getKey", "", "6"}, {"remove", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "keySet", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:7>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<s:5_ey>"}}, 2), new String[][]{{"remove", "java.lang.Object", "2"}, {"size", "", "4"}, {"contains", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitIndex", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:y.ike>", "<s:7key*>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<s:xley>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:5>", "-32768"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=true, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "entrySet", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=true, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:la>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "removeEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}, {"tailMap", "java.lang.Object", "0"}, {"putAll", "java.util.Map", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{a=1, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=1, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitIndex", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:xklLfey>", "<s:ke>"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:(>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "get", "java.lang.Object", "<s:keyuF>"}}), new String[][]{{"keySet", "", "6"}, {"iterator", "", "3"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:7Oey+>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousKey", "java.lang.Object", "<s:EX6Ikey>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:6ky+>", "<s:4xkeey>"}}), new String[][]{{"clear", "", "7"}, {"lastKey", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:kC>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}}), new String[][]{{"firstKey", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:ke>"}, false, 0, null, 1), new String[][]{{"lastKey", "", "0"}, {"remove", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false), new String[][]{{"headMap", "java.lang.Object", "0"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:4_ey>"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:xleyy>"}}, 3), new String[][]{{"put", "java.lang.Object,java.lang.Object", "6"}, {"put", "java.lang.Object,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:6IkeyR>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:5>", "0"}}), new String[][]{{"putAll", "java.util.Map", "4"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:bAA>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"lastKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<i:-96>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "removeEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:9>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet", actual.getClass().getName());
  assertEquals("[Entry(key=key0 [9], value=a, parent=ROOT, left=ROOT, right=key2 [62], predecessor=key1 [63]), Entry(key=key1 [63], value=0, parent=key2 [62], left=key0 [9], right=key1 [63], predecessor=key1 [63]), E...#307#1591104358", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followRight", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:C>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followLeft", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:4>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<i:0>", "<s:kyy>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "addEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "int"}, new String[]{"<sample:4>", "-1073741826"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "isBitSet", "java.lang.Object,int,int", "<i:-11>", "0", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:jyyT>", "0"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "compareKeys", "java.lang.Object,java.lang.Object", "<s:a>", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=key0 [9], right=null, predecessor=key0 [9]) {isEmpty=true, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key1 [63], predecessor=key1 [63]) {isEmpty=false, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<s:xkLeey>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "compareKeys", "java.lang.Object,java.lang.Object", "<s:>", "<s:ky>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "decrementSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "incrementSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstEntry", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:6key>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subtree", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<s:b>", "2147483631", "33"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "compareKeys", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:xkLeey>", "<s:xkLeey>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "decrementSize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:b]>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getNearestEntryForKey", "java.lang.Object,int", "<sample:1>", "-2147483648"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:6key+>"}}, 3), new String[][]{{"isToInclusive", "", "6"}, {"entrySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeEntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "mapIterator", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getNearestEntryForKey", "java.lang.Object,int", "<s:(>", "10"}}, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "removeEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:13>"}}, 2), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:bAA>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"bitsPerElement", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<s:)v>", "<s:key>"}}, 3), new String[][]{{"lengthInBits", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("96", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<s:>", "2147483643", "1073739832"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryInSubtree", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:8>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:b]>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:a_>", "1073741826"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<i:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:6kOy+>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:key[>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:2>", "<sample:9>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "selectValue", new String[]{"java.lang.Object"}, new String[]{"<s:)))>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Trie[1]={\n  Entry(key=key0 [9], value=0, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9])\n}\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<s:key>", "2147483647", "-1610612736"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<i:48>", "<s:bsAA>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<i:-48>", "0"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<sample:3>", "<d:-3.0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s:69key>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<s:TA1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:a_y>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "comparator", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}}, 3), new String[][]{{"isEmpty", "", "0"}, {"setValue", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=1, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:6key+>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<s:xkey>"}}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:ky6y>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<null>", "<sample:5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "entrySet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<s:)))>"}}, 3), new String[][]{{"setValue", "java.lang.Object", "1"}, {"isEmpty", "", "5"}, {"isInternalNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 3, new String[][]{}, 3), new String[][]{{"containsKey", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<s:bAA>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<s:`>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<s:l)>", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followRight", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getToKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "addEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "int"}, new String[]{"<sample:9>", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitsPerElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "containsKey", "java.lang.Object", "<s:kx[>"}}, 1), new String[][]{{"setKeyValue", "java.lang.Object,java.lang.Object", "3"}, {"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "incrementSize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "selectValue", new String[]{"java.lang.Object"}, new String[]{"<s:a]>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<i:-24>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:ky;[>", "1"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<i:27>"}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "addEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "int"}, new String[]{"<sample:1>", "-10"}, false, 0, null, 3), new String[][]{{"setKeyValue", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=b, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "clear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<s:bTAA>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<s:bAA>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followLeft", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:4>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", ""}}, 1), new String[][]{{"isEmpty", "", "4"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getEntry", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Trie[2]={\n  Entry(key=key0 [9], value=a, parent=ROOT, left=ROOT, right=key1 [63], predecessor=key1 [63])\n  Entry(key=key1 [63], value=0, parent=key0 [9], left=key0 [9], right=key1 [63], predecessor=ke...#211#-1474892483", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followLeft", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s:xkLesey>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:iCC>", "<s:5yy>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:3>", "524288"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{iCC=5yy, key=0, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-8388639>", "<s:b]>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:14>", "<sample:14>", "<sample:13>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstEntry", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=2 [32], value=key, parent=null, left=2 [32], right=null, predecessor=2 [32]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "compare", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<b:false>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<b:true>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitIndex", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-0.75>", "<i:10>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:ky=y>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "get", "java.lang.Object", "<s:>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<s:b_v>"}}, 3), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<b:false>", "0"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "tailMap", "java.lang.Object", "<i:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followRight", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:13>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "containsKey", "java.lang.Object", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:y.key>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:`_7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:bAA>", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<s:6key+>", "<s:;yyy>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("RootEntry(key=null [-1], value=null, parent=null, left=key0 [9], right=null, predecessor=key0 [9]) {isEmpty=true, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryInSubtree", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:6>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subMap", "java.lang.Object,java.lang.Object", "<i:-57>", "<s:]>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<s:CC>", "<s:7key+>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<i:-1>", "1073741826", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followRight", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:8>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "removeEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getNearestEntryForKey", "java.lang.Object,int", "<i:-48>", "2147483647"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "tailMap", "java.lang.Object", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "removeEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isValidUplink", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:6>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<i:1>", "0", "-22"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<i:-27>", "-2147483648", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "removeEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "select", "java.lang.Object", "<s:a_>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "incrementSize", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getKeyAnalyzer", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "incrementSize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<i:-57>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet", actual.getClass().getName());
  assertEquals("[Entry(key=key0 [9], value=sample, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9])]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=a, parent=ROOT, left=ROOT, right=key2 [62], predecessor=key1 [63]) {isEmpty=false, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<s:6key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "higherEntry", new String[]{"java.lang.Object"}, new String[]{"<s:A>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:1>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=0, parent=ROOT, left=b [2147483647], right=key2 [62], predecessor=key1 [63]) {isEmpty=false, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{b=2, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s:A>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "addEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "int"}, new String[]{"<sample:3>", "-10"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "compareKeys", "java.lang.Object,java.lang.Object", "<s:A>", "<s:A>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key [3], value=0, parent=ROOT, left=key [3], right=key0 [9], predecessor=key [3]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key=0, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitIndex", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<b:true>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitsPerElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastKey", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "addEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "int"}, new String[]{"<sample:8>", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:3>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<s:key[>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key1 [63], value=0, parent=key0 [9], left=key0 [9], right=key1 [63], predecessor=key1 [63]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lowerEntry", new String[]{"java.lang.Object"}, new String[]{"<s:xkey>"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=sample, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<s:5key>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<i:-1>", "2147483647", "-1073741826"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:9>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followRight", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "incrementSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followLeft", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:key[>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "entrySet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:C>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followRight", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "compareKeys", "java.lang.Object,java.lang.Object", "<s:a>", "<s:ca>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "containsKey", new String[]{"java.lang.Object"}, new String[]{"<s:xkLeey>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:a_>"}, false), new String[][]{{"isExternalNode", "", "3"}, {"isEmpty", "", "0"}, {"setKeyValue", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:8>", "<sample:9>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:bAA>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=-1 [8], value=1.5, parent=null, left=-1 [8], right=null, predecessor=-1 [8]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "decrementSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<s:5ke>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followRight", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstEntry", ""}}), new String[][]{{"isExternalNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitIndex", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "incrementSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "addEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,int", "<sample:1>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{b=2, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:6>", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key1 [63], value=, parent=key0 [9], left=key0 [9], right=key1 [63], predecessor=key1 [63]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:key>", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}}), new String[][]{{"isInternalNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "tailMap", "java.lang.Object", "<s:bA>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "compareKeys", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:4key>", "<s:A>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:A>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<i:-48>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false), new String[][]{{"headMap", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "castKey", "java.lang.Object", "<s:bAAA>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<i:11>", "<b:false>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "get", "java.lang.Object", "<s:)>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<i:11>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:xkeyD>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextKey", "java.lang.Object", "<s:xkez>"}}), new String[][]{{"getToKey", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "decrementSize", ""}}), new String[][]{{"setKeyValue", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "get", new String[]{"java.lang.Object"}, new String[]{"<i:24>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<i:34>", "10"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<s:aAA>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "entrySet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<s:)n>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstEntry", ""}}), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:a_>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:7>", "<sample:9>"}}), new String[][]{{"reversed", "", "4"}, {"thenComparing", "java.util.Comparator", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryInSubtree", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:9>", "<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastEntry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lengthInBits", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "compare", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:jyy>", "<s:xkey>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<i:11>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:key[>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key[", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "higherEntry", new String[]{"java.lang.Object"}, new String[]{"<i:-2097153>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "selectValue", new String[]{"java.lang.Object"}, new String[]{"<i:-21>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "headMap", "java.lang.Object", "<i:-64>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}}), new String[][]{{"getKey", "", "3"}, {"setValue", "java.lang.Object", "1"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousKey", new String[]{"java.lang.Object"}, new String[]{"<s:blAA>"}, false, 2, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "values", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstKey", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<s:60Oy+>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "firstKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastKey", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:key;[>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}}), new String[][]{{"getToKey", "", "2"}, {"replace", "java.lang.Object,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "followRight", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:bAA>"}, false, 4, new String[][]{}), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lastKey", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "tailMap", new String[]{"java.lang.Object"}, new String[]{"<s:khy;[>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getNearestEntryForKey", new String[]{"java.lang.Object", "int"}, new String[]{"<s:key;[>", "170"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key2 [62], value=sample, parent=key0 [9], left=key1 [63], right=key2 [62], predecessor=key2 [62]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "higherEntry", new String[]{"java.lang.Object"}, new String[]{"<s:Ba>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "removeEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>"}}), new String[][]{{"isInternalNode", "", "2"}, {"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "containsKey", "java.lang.Object", "<s:6key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "select", new String[]{"java.lang.Object"}, new String[]{"<s:xkey>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<i:1>", "<s:aAA>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "addEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "int"}, new String[]{"<sample:5>", "1"}, false), new String[][]{{"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitIndex", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key/>", "<s:>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitIndex", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:x:Leey>", "<s:xj8Leey>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getKeyAnalyzer", ""}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "get", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lengthInBits", new String[]{"java.lang.Object"}, new String[]{"<s:)g>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "prefixMap", "java.lang.Object", "<s:ke5[>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:5kCey>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "tailMap", "java.lang.Object", "<s:k8ex[>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<i:9>"}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "prefixMap", new String[]{"java.lang.Object"}, new String[]{"<s:6key>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:7>", "<sample:9>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:6key>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryInSubtree", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>", "<sample:5>"}}), new String[][]{{"getKey", "", "5"}, {"setValue", "java.lang.Object", "3"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=2, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "followLeft", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:8>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=-1 [8], value=1.5, parent=null, left=-1 [8], right=null, predecessor=-1 [8]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitIndex", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:)>", "<s:6keey>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "subtree", "java.lang.Object,int,int", "<s:b[bAA>", "2147483647", "16"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryInSubtree", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:13>", "<sample:16>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<s:A>", "84", "1048575"}, false, 3, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:by>", "<s:+2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "subMap", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:`_>", "<i:0>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "nextEntryImpl", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:1>", "<sample:4>", "<null>"}, false), new String[][]{{"isInternalNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}}), new String[][]{{"thenComparing", "java.util.Comparator", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "comparator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastEntry", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getEntry", new String[]{"java.lang.Object"}, new String[]{"<s:(key*>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "incrementSize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "incrementSize", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "compareKeys", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:]d>", "<s:a_>"}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "incrementSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "mapIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Trie[1]={\n  Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9])\n}\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "compareKeys", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:-6kOy+>", "<s:ta>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:\r>", "<i:22>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\r=22, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "values", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:keyy[>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lengthInBits", "java.lang.Object", "<s:key;[>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("keyy[", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:)>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "lastKey", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "getKeyAnalyzer", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectValue", "java.lang.Object", "<s:kyy>"}}), new String[][]{{"thenComparing", "java.util.function.Function,java.util.Comparator", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "get", new String[]{"java.lang.Object"}, new String[]{"<s:6keyc>"}, false, 1, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "remove", "java.lang.Object", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<s:*>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "mapIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "lengthInBits", new String[]{"java.lang.Object"}, new String[]{"<s:6ky+>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "comparator", ""}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "bitsPerElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<s:C9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "firstEntry", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "ceilingEntry", "java.lang.Object", "<s:kyB;E[>"}}), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "selectValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:)>"}, false), new String[][]{{"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:+key>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "selectKey", "java.lang.Object", "<s:xbkLfey>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "put", "java.lang.Object,java.lang.Object", "<s:ke((y>", "<s:kyyy>"}}), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kyyy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{ke((y=kyyy, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:kex[>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key1 [63], predecessor=key1 [63]) {isEmpty=false, isExternalNode=false, isInternalNode=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "isBitSet", new String[]{"java.lang.Object", "int", "int"}, new String[]{"<s:6kOy+>", "-11", "44"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<s:b^>"}, false, 5, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "previousEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:5>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "containsKey", "java.lang.Object", "<s:CC>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "higherEntry", new String[]{"java.lang.Object"}, new String[]{"<s:]>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "higherEntry", "java.lang.Object", "<s:kyy>"}}), new String[][]{{"isEmpty", "", "1"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "previousEntry", new String[]{"org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "entrySet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<s:>", "<i:14>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet", actual.getClass().getName());
  assertEquals("[Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9])]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "higherEntry", new String[]{"java.lang.Object"}, new String[]{"<s:r-5key>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntryImpl", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry,org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:12>", "<sample:3>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "headMap", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "keySet", ""}}), new String[][]{{"isToInclusive", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "castKey", new String[]{"java.lang.Object"}, new String[]{"<s:xkL\ney>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "getEntry", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xkL\ney", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "floorEntry", new String[]{"java.lang.Object"}, new String[]{"<s:key[>>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "floorEntry", "java.lang.Object", "<i:-2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", actual.getClass().getName());
  assertEquals("Entry(key=key0 [9], value=, parent=ROOT, left=ROOT, right=key0 [9], predecessor=key0 [9]) {isEmpty=false, isExternalNode=true, isInternalNode=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "selectValue", new String[]{"java.lang.Object"}, new String[]{"<s:)>"}, false, 7, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "removeEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:1>"}, {"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "bitIndex", "java.lang.Object,java.lang.Object", "<s:hky6>", "<s:kOOy+>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:DvC>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "nextEntry", "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry", "<sample:2>"}}), new String[][]{{"isInternalNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections4.trie.AbstractPatriciaTrie", "org.apache.commons.collections4.trie.PatriciaTrie", "ceilingEntry", new String[]{"java.lang.Object"}, new String[]{"<s:key;[>"}, false, 0, new String[][]{{"org.apache.commons.collections4.trie.AbstractPatriciaTrie", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{}", SearchInputFactory_scaffolding.receiverState());
 }
}
