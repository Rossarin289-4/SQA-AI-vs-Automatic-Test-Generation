package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.Description;
import org.mockito.ArgumentMatcher;
import java.io.Serializable;

public class SameTest {
    @Test
    public void testMatchesSameReference() throws Exception {
        Object wanted = new Object();
        Same matcher = new Same(wanted);
        assertTrue(matcher.matches(wanted));
    }

    @Test
    public void testDoesNotMatchEqualButDistinctObjects() throws Exception {
        String wanted = new String("value");
        String actual = new String("value");
        Same matcher = new Same(wanted);
        assertFalse(matcher.matches(actual));
    }

    @Test
    public void testDoesNotMatchNullAgainstNonNull() throws Exception {
        Same matcher = new Same(new Object());
        assertFalse(matcher.matches(null));
    }

    @Test
    public void testMatchesNullAgainstNull() throws Exception {
        Same matcher = new Same(null);
        assertTrue(matcher.matches(null));
    }

    @Test
    public void testDescribesNull() throws Exception {
        Same matcher = new Same(null);
        Description description = new org.hamcrest.StringDescription();
        matcher.describeTo(description);
        assertEquals("same(null)", description.toString());
    }

    @Test
    public void testDescribesStringWithQuotes() throws Exception {
        Same matcher = new Same("hi");
        Description description = new org.hamcrest.StringDescription();
        matcher.describeTo(description);
        assertEquals("same(\"hi\")", description.toString());
    }

    @Test
    public void testDescribesCharacterWithSingleQuotes() throws Exception {
        Same matcher = new Same(Character.valueOf('x'));
        Description description = new org.hamcrest.StringDescription();
        matcher.describeTo(description);
        assertEquals("same('x')", description.toString());
    }

    @Test
    public void testDescribesOtherObjectWithoutAddedQuotes() throws Exception {
        Object wanted = new Object() {
            @Override
            public String toString() {
                return "item";
            }
        };
        Same matcher = new Same(wanted);
        Description description = new org.hamcrest.StringDescription();
        matcher.describeTo(description);
        assertEquals("same(item)", description.toString());
    }

    @Test
    public void testStringMatchingUsesIdentityEvenForSameContents() throws Exception {
        String wanted = new String("edge");
        Same matcher = new Same(wanted);
        assertTrue(matcher.matches(wanted));
    }

    @Test
    public void testCharacterMatchingUsesIdentity() throws Exception {
        Character wanted = new Character('q');
        Same matcher = new Same(wanted);
        assertTrue(matcher.matches(wanted));
    }

    @Test
    public void testDoesNotMatchDifferentCharacterObject() throws Exception {
        Character wanted = new Character('q');
        Character actual = new Character('q');
        Same matcher = new Same(wanted);
        assertFalse(matcher.matches(actual));
    }

    @Test
    public void testNumberMatchingUsesIdentity() throws Exception {
        Integer wanted = new Integer(2147483647);
        Same matcher = new Same(wanted);
        assertTrue(matcher.matches(wanted));
    }

    @Test
    public void testDescriptionUsesWantedStringValue() throws Exception {
        Same matcher = new Same(new String("a\"b"));
        Description description = new org.hamcrest.StringDescription();
        matcher.describeTo(description);
        assertEquals("same(\"a\"b\")", description.toString());
    }

    @Test
    public void testDescriptionUsesWantedCharacterValue() throws Exception {
        Same matcher = new Same(Character.valueOf('\n'));
        Description description = new org.hamcrest.StringDescription();
        matcher.describeTo(description);
        assertEquals("same('\n')", description.toString());
    }
}
