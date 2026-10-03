package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;

public class StrBuilderDefectDetectionTest {

    @Test
    public void testContainsAfterShrinking() {
        StrBuilder sb = new StrBuilder("ABCDEF");
        // Shrink logical size down to 3 ("ABC")
        sb.setLength(3);
        
        // 'D', 'E', 'F' are no longer part of the logical string, 
        // but still exist in the underlying buffer.
        assertFalse("Should not contain 'D' after shrinking size", sb.contains('D'));
        assertFalse("Should not contain 'EF' after shrinking size", sb.contains("EF"));
        assertTrue("Should still contain 'B'", sb.contains('B'));
    }

    @Test
    public void testContainsWithLargeInitialCapacity() {
        // Create builder with large capacity but small initial content
        StrBuilder sb = new StrBuilder(64);
        sb.append("XYZ");
        
        // Characters beyond index 3 should not be found even if buffer has space
        assertFalse("Should not find characters in unwritten capacity buffer", sb.contains('A'));
        assertFalse("Should not find strings in unwritten capacity buffer", sb.contains("XYZABC"));
        assertTrue("Should contain valid content", sb.contains("YZ"));
    }

    @Test
    public void testIndexOfExceedingLogicalSize() {
        StrBuilder sb = new StrBuilder("Hello World");
        sb.setLength(5); // Now just "Hello"
        
        // Searching for 'W' or "World" which were cut off by setLength
        assertEquals("IndexOf should not search beyond logical size", -1, sb.indexOf('W'));
        assertEquals("IndexOf should not search beyond logical size", -1, sb.indexOf("World"));
        assertEquals("IndexOf should find within logical size", 1, sb.indexOf('e'));
    }
}
