package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.apache.commons.lang3.StringEscapeUtils;

public class Lang6GeneratedTestBPSO {

    @Test
    public void testBmpSingle() {
        assertEquals("A", StringEscapeUtils.escapeCsv("A"));
    }
    
    @Test
    public void testBmpMultiple() {
        assertEquals("ABC", StringEscapeUtils.escapeCsv("ABC"));
    }
    
    @Test
    public void testSupplementaryMiddle() {
        String input = "A\uD83D\uDE00B";
        assertEquals(input, StringEscapeUtils.escapeCsv(input));
    }
    
    @Test
    public void testSupplementaryStart() {
        String input = "\uD83D\uDE00ABC";
        assertEquals(input, StringEscapeUtils.escapeCsv(input));
    }
    
    @Test
    public void testSupplementaryEnd() {
        String input = "ABC\uD83D\uDE00";
        assertEquals(input, StringEscapeUtils.escapeCsv(input));
    }
    
    @Test
    public void testTwoSupplementary() {
        String input = "\uD83D\uDE00\uD83C\uDF0D";
        assertEquals(input, StringEscapeUtils.escapeCsv(input));
    }
    
    @Test
    public void testMixedBmpSupplementary() {
        String input = "X\uD83D\uDC36Y";
        assertEquals(input, StringEscapeUtils.escapeCsv(input));
    }
    
    @Test
    public void testBmpBeforeSupplementary() {
        String input = "AB\uD83D\uDC36";
        assertEquals(input, StringEscapeUtils.escapeCsv(input));
    }
    
    @Test
    public void testSupplementaryBeforeBmp() {
        String input = "\uD83D\uDC36AB";
        assertEquals(input, StringEscapeUtils.escapeCsv(input));
    }
    
    @Test
    public void testThreeCodepoints() {
        String input = "A\uD83D\uDC36C";
        assertEquals(input, StringEscapeUtils.escapeCsv(input));
    }
    
    @Test
    public void testUnicodeBmp() {
        String input = "\u00E9\u03A9\u4E2D";
        assertEquals(input, StringEscapeUtils.escapeCsv(input));
    }
    
    @Test
    public void testEmptyInput() {
        assertEquals("", StringEscapeUtils.escapeCsv(""));
    }
    
}
