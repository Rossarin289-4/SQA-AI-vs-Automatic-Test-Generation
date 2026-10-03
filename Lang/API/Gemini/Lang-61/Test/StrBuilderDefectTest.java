package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;

public class StrBuilderDefectTest {

    @Test
    public void testIndexOfStringNearEnd() {
        StrBuilder builder = new StrBuilder("abcdefg");
        // "efg" starts at index 4
        int index = builder.indexOf("efg", 3);
        assertEquals(4, index);
        
        // Searching for "fg" starting at index 5
        int index2 = builder.indexOf("fg", 5);
        assertEquals(5, index2);
    }

    @Test
    public void testIndexOfStringAtExactBoundary() {
        StrBuilder builder = new StrBuilder("teststring");
        // "ing" starts at index 7
        int index = builder.indexOf("ing", 7);
        assertEquals(7, index);

        // Searching for the exact last character/string at its exact start index
        int indexLast = builder.indexOf("g", 9);
        assertEquals(9, indexLast);
    }

    @Test
    public void testIndexOfStringWithStartIndexExceedingLength() {
        StrBuilder builder = new StrBuilder("hello");
        // startIndex greater than length should be treated safely (clamped to length or returning -1 depending on search)
        int index = builder.indexOf("lo", 10);
        assertEquals(-1, index);
    }

    @Test
    public void testIndexOfStringMultipleOccurrencesNearEnd() {
        StrBuilder builder = new StrBuilder("banana");
        // "ana" occurs at index 1 and index 3
        int index = builder.indexOf("ana", 2);
        assertEquals(3, index);
    }
}
