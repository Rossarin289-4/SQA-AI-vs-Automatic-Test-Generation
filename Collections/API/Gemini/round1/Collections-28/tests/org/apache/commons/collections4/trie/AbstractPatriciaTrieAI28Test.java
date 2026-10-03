package org.apache.commons.collections4.trie;

import org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

public class AbstractPatriciaTrieAI28Test {

    private static class TestPatriciaTrie<V> extends AbstractPatriciaTrie<String, V> {
        private static final long serialVersionUID = 1L;

        TestPatriciaTrie() {
            super(StringKeyAnalyzer.INSTANCE);
        }

        TestPatriciaTrie(Map<? extends String, ? extends V> map) {
            super(StringKeyAnalyzer.INSTANCE, map);
        }
    }

    @Test
    public void testPutAndGetAndSize() {
        TestPatriciaTrie<Integer> trie = new TestPatriciaTrie<Integer>();
        Assert.assertEquals(0, trie.size());
        Assert.assertNull(trie.get("apple"));

        Assert.assertNull(trie.put("apple", 1));
        Assert.assertNull(trie.put("app", 2));
        Assert.assertEquals(2, trie.size());

        Assert.assertEquals(Integer.valueOf(1), trie.get("apple"));
        Assert.assertEquals(Integer.valueOf(2), trie.get("app"));

        Integer old = trie.put("apple", 3);
        Assert.assertEquals(Integer.valueOf(1), old);
        Assert.assertEquals(Integer.valueOf(3), trie.get("apple"));
        Assert.assertEquals(2, trie.size());
    }

    @Test(expected = NullPointerException.class)
    public void testPutNullKeyThrowsException() {
        TestPatriciaTrie<String> trie = new TestPatriciaTrie<String>();
        trie.put(null, "value");
    }

    @Test
    public void testEmptyKeyHandling() {
        TestPatriciaTrie<String> trie = new TestPatriciaTrie<String>();
        Assert.assertNull(trie.put("", "emptyKey"));
        Assert.assertEquals(1, trie.size());
        Assert.assertEquals("emptyKey", trie.get(""));

        Assert.assertEquals("emptyKey", trie.put("", "replacedEmpty"));
        Assert.assertEquals(1, trie.size());
        Assert.assertEquals("replacedEmpty", trie.get(""));

        Assert.assertEquals("replacedEmpty", trie.remove(""));
        Assert.assertEquals(0, trie.size());
        Assert.assertNull(trie.get(""));
    }

    @Test
    public void testClear() {
        TestPatriciaTrie<String> trie = new TestPatriciaTrie<String>();
        trie.put("one", "1");
        trie.put("two", "2");
        trie.put("three", "3");
        Assert.assertEquals(3, trie.size());

        trie.clear();
        Assert.assertEquals(0, trie.size());
        Assert.assertNull(trie.get("one"));
        Assert.assertNull(trie.get("two"));
        Assert.assertNull(trie.get("three"));
    }

    @Test
    public void testPrefixMapSizeAndContents() {
        TestPatriciaTrie<Integer> trie = new TestPatriciaTrie<Integer>();
        trie.put("apple", 1);
        trie.put("applet", 2);
        trie.put("application", 3);
        trie.put("banana", 4);
        trie.put("apply", 5);

        SortedMap<String, Integer> prefixMap = trie.prefixMap("appl");
        Assert.assertEquals(4, prefixMap.size());
        Assert.assertTrue(prefixMap.containsKey("apple"));
        Assert.assertTrue(prefixMap.containsKey("applet"));
        Assert.assertTrue(prefixMap.containsKey("application"));
        Assert.assertTrue(prefixMap.containsKey("apply"));
        Assert.assertFalse(prefixMap.containsKey("banana"));

        Assert.assertEquals("apple", prefixMap.firstKey());
        Assert.assertEquals("apply", prefixMap.lastKey());
    }

    @Test
    public void testPrefixMapClear() {
        TestPatriciaTrie<Integer> trie = new TestPatriciaTrie<Integer>();
        trie.put("cat", 1);
        trie.put("caterpillar", 2);
        trie.put("dog", 3);

        SortedMap<String, Integer> prefixMap = trie.prefixMap("cat");
        Assert.assertEquals(2, prefixMap.size());

        prefixMap.clear();
        Assert.assertEquals(0, prefixMap.size());
        Assert.assertEquals(1, trie.size());
        Assert.assertNull(trie.get("cat"));
        Assert.assertNull(trie.get("caterpillar"));
        Assert.assertEquals(Integer.valueOf(3), trie.get("dog"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testPrefixMapFirstKeyWhenEmpty() {
        TestPatriciaTrie<Integer> trie = new TestPatriciaTrie<Integer>();
        trie.put("dog", 1);
        SortedMap<String, Integer> prefixMap = trie.prefixMap("cat");
        prefixMap.firstKey();
    }

    @Test(expected = NoSuchElementException.class)
    public void testPrefixMapLastKeyWhenEmpty() {
        TestPatriciaTrie<Integer> trie = new TestPatriciaTrie<Integer>();
        trie.put("dog", 1);
        SortedMap<String, Integer> prefixMap = trie.prefixMap("cat");
        prefixMap.lastKey();
    }

    @Test
    public void testPrefixMapIteratorRemove() {
        TestPatriciaTrie<Integer> trie = new TestPatriciaTrie<Integer>();
        trie.put("alpha", 1);
        trie.put("alphabet", 2);
        trie.put("alpine", 3);
        trie.put("beta", 4);

        SortedMap<String, Integer> prefixMap = trie.prefixMap("alph");
        Iterator<Map.Entry<String, Integer>> iterator = prefixMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if ("alpha".equals(entry.getKey())) {
                iterator.remove();
            }
        }

        Assert.assertEquals(2, prefixMap.size());
        Assert.assertEquals(3, trie.size());
        Assert.assertNull(trie.get("alpha"));
        Assert.assertEquals(Integer.valueOf(2), trie.get("alphabet"));
        Assert.assertEquals(Integer.valueOf(3), trie.get("alpine"));
        Assert.assertEquals(Integer.valueOf(4), trie.get("beta"));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testIteratorConcurrentModification() {
        TestPatriciaTrie<Integer> trie = new TestPatriciaTrie<Integer>();
        trie.put("k1", 1);
        trie.put("k2", 2);

        Iterator<Map.Entry<String, Integer>> it = trie.entrySet().iterator();
        trie.put("k3", 3);
        it.next();
    }

    @Test
    public void testSelectClosestEntry() {
        TestPatriciaTrie<String> trie = new TestPatriciaTrie<String>();
        trie.put("abc", "ABC");
        trie.put("abd", "ABD");

        Map.Entry<String, String> entry = trie.select("abe");
        Assert.assertNotNull(entry);
        Assert.assertTrue("abc".equals(entry.getKey()) || "abd".equals(entry.getKey()));
    }
}
