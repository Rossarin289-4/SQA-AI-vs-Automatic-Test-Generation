package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsReplaceEachTest {

    @Test(timeout = 2000)
    public void testReplaceEachCascadingReplacement() {
        String text = "a";
        String[] searchList = new String[] {"a", "b"};
        String[] replacementList = new String[] {"b", "c"};
        
        // In buggy version, 'a' becomes 'b', and then 'b' becomes 'c' (cascading infinite or unintended chain),
        // or causes incorrect behavior. Fixed version handles each search term pass correctly without cascading.
        String result = StringUtils.replaceEach(text, searchList, replacementList);
        assertEquals("b", result);
    }

    @Test(timeout = 2000)
    public void testReplaceEachSelfReferentialReplacement() {
        String text = "foo";
        String[] searchList = new String[] {"foo"};
        String[] replacementList = new String[] {"foobar"};
        
        // Prevents infinite loop where replacement "foobar" matches "foo" again.
        String result = StringUtils.replaceEach(text, searchList, replacementList);
        assertEquals("foobar", result);
    }

    @Test(timeout = 2000)
    public void testReplaceEachInterlockingTokens() {
        String text = "the quick brown fox";
        String[] searchList = new String[] {"quick", "brown"};
        String[] replacementList = new String[] {"brown", "slow"};
        
        // "quick" -> "brown", but "brown" shouldn't re-trigger another replacement in the same execution cycle.
        String result = StringUtils.replaceEach(text, searchList, replacementList);
        assertEquals("the brown slow fox", result);
    }
}
