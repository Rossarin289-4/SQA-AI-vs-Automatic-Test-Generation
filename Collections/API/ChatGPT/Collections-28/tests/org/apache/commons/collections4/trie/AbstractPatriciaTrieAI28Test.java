package org.apache.commons.collections4.trie;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.ConcurrentModificationException;

import org.junit.Assert;
import org.junit.Test;

public class AbstractPatriciaTrieAI28Test {

    @Test
    public void putGetAndContainsKeyMaintainMappings() {
        PatriciaTrie<Integer> trie = new PatriciaTrie<Integer>();

        Assert.assertNull(trie.put("alpha", Integer.valueOf(1)));
        Assert.assertNull(trie.put("beta", Integer.valueOf(2)));

        Assert.assertEquals(2, trie.size());
        Assert.assertEquals(Integer.valueOf(1), trie.get("alpha"));
        Assert.assertEquals(Integer.valueOf(2), trie.get("beta"));
        Assert.assertTrue(trie.containsKey("alpha"));
        Assert.assertFalse(trie.containsKey("gamma"));
        Assert.assertNull(trie.get("gamma"));
    }

    @Test
    public void replacingExistingKeyReturnsOldValueWithoutChangingSize() {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("key", "old");

        String previous = trie.put("key", "new");

        Assert.assertEquals("old", previous);
        Assert.assertEquals(1, trie.size());
        Assert.assertEquals("new", trie.get("key"));
    }

    @Test
    public void emptyStringIsStoredAndRemovedAsARegularKey() {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();

        Assert.assertNull(trie.put("", "root"));
        Assert.assertTrue(trie.containsKey(""));
        Assert.assertEquals("root", trie.get(""));
        Assert.assertEquals("root", trie.remove(""));
        Assert.assertFalse(trie.containsKey(""));
        Assert.assertEquals(0, trie.size());
    }

    @Test(expected = NullPointerException.class)
    public void putRejectsNullKeys() {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put(null, "value");
    }

    @Test
    public void nullValuesAreDistinguishedFromMissingKeys() {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("present", null);

        Assert.assertTrue(trie.containsKey("present"));
        Assert.assertTrue(trie.containsValue(null));
        Assert.assertNull(trie.get("present"));
        Assert.assertNull(trie.get("missing"));
        Assert.assertFalse(trie.containsKey("missing"));
    }

    @Test
    public void keySetIteratorRemoveUpdatesTrie() {
        PatriciaTrie<Integer> trie = new PatriciaTrie<Integer>();
        trie.put("ant", Integer.valueOf(1));
        trie.put("bee", Integer.valueOf(2));

        Iterator<String> iterator = trie.keySet().iterator();
        String removedKey = iterator.next();
        iterator.remove();

        Assert.assertFalse(trie.containsKey(removedKey));
        Assert.assertEquals(1, trie.size());
        Assert.assertEquals(1, trie.keySet().size());
    }

    @Test
    public void entrySetEntriesCanUpdateMappedValue() {
        PatriciaTrie<String> trie = new PatriciaTrie<String>();
        trie.put("change", "before");

        Map.Entry<String, String> entry = trie.entrySet().iterator().next();
        String oldValue = entry.setValue("after");

        Assert.assertEquals("before", oldValue);
        Assert.assertEquals("after", trie.get("change"));
        Assert.assertEquals(1, trie.size());
    }

    @Test
    public void prefixMapContainsOnlyMatchingKeysAndIsLive() {
        PatriciaTrie<Integer> trie = new PatriciaTrie<Integer>();
        trie.put("app", Integer.valueOf(1));
        trie.put("apple", Integer.valueOf(2));
        trie.put("application", Integer.valueOf(3));
        trie.put("apt", Integer.valueOf(4));

        SortedMap<String, Integer> prefix = trie.prefixMap("app");

        Assert.assertEquals(3, prefix.size());
        Assert.assertTrue(prefix.containsKey("app"));
        Assert.assertTrue(prefix.containsKey("apple"));
        Assert.assertTrue(prefix.containsKey("application"));
        Assert.assertFalse(prefix.containsKey("apt"));

        trie.put("append", Integer.valueOf(5));

        Assert.assertEquals(Integer.valueOf(5), prefix.get("append"));
        Assert.assertEquals(4, prefix.size());
    }

    @Test
    public void clearingPrefixMapRemovesOnlyPrefixEntries() {
        PatriciaTrie<Integer> trie = new PatriciaTrie<Integer>();
        trie.put("car", Integer.valueOf(1));
        trie.put("cart", Integer.valueOf(2));
        trie.put("cat", Integer.valueOf(3));
        trie.put("dog", Integer.valueOf(4));

        trie.prefixMap("car").clear();

        Assert.assertFalse(trie.containsKey("car"));
        Assert.assertFalse(trie.containsKey("cart"));
        Assert.assertTrue(trie.containsKey("cat"));
        Assert.assertTrue(trie.containsKey("dog"));
        Assert.assertEquals(2, trie.size());
    }

    @Test(expected = ConcurrentModificationException.class)
    public void iteratorIsFailFastAfterStructuralModification() {
        PatriciaTrie<Integer> trie = new PatriciaTrie<Integer>();
        trie.put("one", Integer.valueOf(1));
        trie.put("two", Integer.valueOf(2));

        Iterator<Map.Entry<String, Integer>> iterator = trie.entrySet().iterator();
        trie.put("three", Integer.valueOf(3));

        iterator.next();
    }
}
