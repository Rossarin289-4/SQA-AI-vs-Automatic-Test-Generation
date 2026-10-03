package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.StringWriter;
import java.io.IOException;

public class NumericEntityUnescaper_CustomTest {

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testUnfinishedDecimalEntityWithoutSemicolon_BuggyThrowsException() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        String input = "&#72";
        StringWriter writer = new StringWriter();
        
        // The buggy version throws StringIndexOutOfBoundsException due to missing bounds check in while loop.
        // The fixed version safely handles this and returns the input untranslated or parses if supported.
        unescaper.translate(input, 0, writer);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testUnfinishedHexEntityWithoutSemicolon_BuggyThrowsException() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        String input = "&#x48";
        StringWriter writer = new StringWriter();
        
        // The buggy version attempts to read past the end of the string looking for ';'
        unescaper.translate(input, 0, writer);
    }

    @Test
    public void testUnfinishedEntitySafeParsing() throws IOException {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();
        // Test a sequence where the entity is at the very end without semicolon
        String input = "Test&#72";
        StringWriter writer = new StringWriter();
        
        String result = unescaper.translate(input);
        // On fixed version, it should either translate or return gracefully.
        // On buggy version, it throws StringIndexOutOfBoundsException.
        assertEquals("TestH", result);
    }
}
