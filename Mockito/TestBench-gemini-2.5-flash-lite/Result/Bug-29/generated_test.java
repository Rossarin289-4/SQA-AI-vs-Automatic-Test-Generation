package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.Description;
import org.mockito.ArgumentMatcher;
import java.io.Serializable;

public class SameTest {

    // Mock Description implementation for testing describeTo method.
    // This is a simplified version to capture appended text.


    @Test
    public void testMatchesWhenBothNull() throws Exception {
        Same sameMatcher = new Same(null);
        assertTrue(sameMatcher.matches(null));
    }

    @Test
    public void testMatchesWhenWantedIsNotNullAndActualIsNull() throws Exception {
        Same sameMatcher = new Same("someString");
        assertFalse(sameMatcher.matches(null));
    }

    @Test
    public void testMatchesWhenWantedIsNullAndActualIsNotNull() throws Exception {
        Same sameMatcher = new Same(null);
        assertFalse(sameMatcher.matches("someString"));
    }

    @Test
    public void testMatchesWhenSameInstance() throws Exception {
        Object obj = new Object();
        Same sameMatcher = new Same(obj);
        assertTrue(sameMatcher.matches(obj));
    }

    @Test
    public void testMatchesWhenDifferentInstances() throws Exception {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Same sameMatcher = new Same(obj1);
        assertFalse(sameMatcher.matches(obj2));
    }

    @Test
    public void testMatchesWhenWantedIsStringAndActualIsSameStringInstance() throws Exception {
        String str = "testString";
        Same sameMatcher = new Same(str);
        assertTrue(sameMatcher.matches(str));
    }

    @Test
    public void testMatchesWhenWantedIsStringAndActualIsEqualStringButDifferentInstance() throws Exception {
        String str1 = "testString";
        String str2 = new String("testString"); // Creates a new instance with the same content
        Same sameMatcher = new Same(str1);
        assertFalse(sameMatcher.matches(str2));
    }

    @Test
    public void testMatchesWhenWantedIsCharacterAndActualIsSameCharacterInstance() throws Exception {
        Character ch = 'a'; // Autoboxing creates a Character instance
        Same sameMatcher = new Same(ch);
        assertTrue(sameMatcher.matches(ch));
    }

    @Test
    public void testMatchesWhenWantedIsCharacterAndActualIsEqualCharacterButDifferentInstance() throws Exception {
        Character ch1 = 'a';
        // Creating a Character object explicitly to ensure it's a different instance
        Character ch2 = Character.valueOf('a');
        Same sameMatcher = new Same(ch1);
        assertFalse(sameMatcher.matches(ch2));
    }






    @Test
    public void testMatchesWithDifferentTypesButSameIdentity() throws Exception {
        Integer i = Integer.valueOf(5);
        Same sameMatcher = new Same(i);
        assertFalse(sameMatcher.matches(Long.valueOf(5)));
    }

    @Test
    public void testMatchesWithDifferentObjectTypes() throws Exception {
        Object obj1 = new Object();
        Object obj2 = new String("object"); // String is an Object, but a different type/instance
        Same sameMatcher = new Same(obj1);
        assertFalse(sameMatcher.matches(obj2));
    }



    @Test
    public void testMatchesWhenWantedIsBooleanTrueAndActualIsSameBooleanInstance() throws Exception {
        Boolean boolTrue = Boolean.TRUE;
        Same sameMatcher = new Same(boolTrue);
        assertTrue(sameMatcher.matches(boolTrue));
    }

    @Test
    public void testMatchesWhenWantedIsBooleanFalseAndActualIsSameBooleanInstance() throws Exception {
        Boolean boolFalse = Boolean.FALSE;
        Same sameMatcher = new Same(boolFalse);
        assertTrue(sameMatcher.matches(boolFalse));
    }

    @Test
    public void testMatchesWhenWantedIsBooleanTrueAndActualIsDifferentBooleanInstance() throws Exception {
        Boolean boolTrue1 = Boolean.TRUE;
        Boolean boolTrue2 = new Boolean(true); // Deprecated, but creates a distinct instance
        Same sameMatcher = new Same(boolTrue1);
        assertFalse(sameMatcher.matches(boolTrue2));
    }


}


