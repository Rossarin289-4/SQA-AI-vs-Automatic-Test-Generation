```java
package org.apache.commons.collections4.trie;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.Unmodifiable;
import org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator;

public class UnmodifiableTrieTest {
    @Test
    public void testConstructorRejectsNull() throws Exception {
        try {
            new UnmodifiableTrie<String, Integer>(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testFactoryRejectsNull() throws Exception {
        try {
            UnmodifiableTrie.unmodifiableTrie(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
```