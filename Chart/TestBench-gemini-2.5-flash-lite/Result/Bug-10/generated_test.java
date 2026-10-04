package org.jfree.chart.imagemap;

import org.junit.Test;
import static org.junit.Assert.*;

public class StandardToolTipTagFragmentGeneratorTest {
    @Test
    public void testGenerateToolTipFragment_NullInput() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // According to ImageMapUtilities.htmlEscape, null input results in an IllegalArgumentException.
        try {
            generator.generateToolTipFragment(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException expected) {
            // This is the expected behavior.
        }
    }

    @Test
    public void testGenerateToolTipFragment_EmptyString() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // htmlEscape("") should return "".
        assertEquals(" title=\"\" alt=\"\"", generator.generateToolTipFragment(""));
    }

    @Test
    public void testGenerateToolTipFragment_BasicString() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Basic string without special HTML characters.
        assertEquals(" title=\"This is a tooltip\" alt=\"\"", generator.generateToolTipFragment("This is a tooltip"));
    }

    @Test
    public void testGenerateToolTipFragment_Apostrophe() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Apostrophe should be escaped as &#39;
        assertEquals(" title=\"It&#39;s a test\" alt=\"\"", generator.generateToolTipFragment("It's a test"));
    }

    @Test
    public void testGenerateToolTipFragment_Quote() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Quote should be escaped as &quot;
        assertEquals(" title=\"He said &quot;Hello&quot;\" alt=\"\"", generator.generateToolTipFragment("He said \"Hello\""));
    }

    @Test
    public void testGenerateToolTipFragment_Ampersand() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Ampersand should be escaped as &amp;
        assertEquals(" title=\"A &amp; B\" alt=\"\"", generator.generateToolTipFragment("A & B"));
    }

    @Test
    public void testGenerateToolTipFragment_LessThan() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Less than sign should be escaped as &lt;
        assertEquals(" title=\"x &lt; 5\" alt=\"\"", generator.generateToolTipFragment("x < 5"));
    }

    @Test
    public void testGenerateToolTipFragment_GreaterThan() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Greater than sign should be escaped as &gt;
        assertEquals(" title=\"y &gt; 3\" alt=\"\"", generator.generateToolTipFragment("y > 3"));
    }

    @Test
    public void testGenerateToolTipFragment_AllSpecialChars() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // A string with all common special HTML characters.
        assertEquals(" title=\"&lt;&amp;&#39;&quot;&quot;&gt;\" alt=\"\"", generator.generateToolTipFragment("<'&\"\">"));
    }
    
    @Test
    public void testGenerateToolTipFragment_LongString() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Test with a longer string to ensure no truncation or unexpected behavior.
        String longText = "This is a very long tooltip string that should be handled correctly by the htmlEscape method and the fragment generator.";
        assertEquals(" title=\"" + ImageMapUtilities.htmlEscape(longText) + "\" alt=\"\"", generator.generateToolTipFragment(longText));
    }

    @Test
    public void testGenerateToolTipFragment_StringWithSpaces() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Test string with multiple spaces.
        assertEquals(" title=\"  Extra   Spaces  \" alt=\"\"", generator.generateToolTipFragment("  Extra   Spaces  "));
    }

    @Test
    public void testGenerateToolTipFragment_StringWithNewlines() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Newline characters should be escaped as &#10;
        assertEquals(" title=\"Line 1&#10;Line 2\" alt=\"\"", generator.generateToolTipFragment("Line 1\nLine 2"));
    }
    
    @Test
    public void testGenerateToolTipFragment_StringWithCarriageReturn() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Carriage return characters should be escaped as &#13;
        assertEquals(" title=\"Line 1&#13;Line 2\" alt=\"\"", generator.generateToolTipFragment("Line 1\rLine 2"));
    }
    
    @Test
    public void testGenerateToolTipFragment_StringWithBothCRLF() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Both CR and LF.
        assertEquals(" title=\"Line 1&#13;&#10;Line 2\" alt=\"\"", generator.generateToolTipFragment("Line 1\r\nLine 2"));
    }

    @Test
    public void testGenerateToolTipFragment_MixedSpecialCharacters() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Mix of different special characters.
        assertEquals(" title=\"&lt;a href=&quot;#&quot;&gt;Link&lt;/a&gt; &amp; more\" alt=\"\"", generator.generateToolTipFragment("<a href=\"#\">Link</a> & more"));
    }
    
    @Test
    public void testGenerateToolTipFragment_UnicodeCharacters() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Test with some unicode characters. Common ones are escaped.
        assertEquals(" title=\"Copyright &copy; 2023\" alt=\"\"", generator.generateToolTipFragment("Copyright © 2023"));
    }
    
    @Test
    public void testGenerateToolTipFragment_OnlyAltText() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // The method always appends " alt=\"\"". This test checks that part.
        assertEquals(" title=\"Any text\" alt=\"\"", generator.generateToolTipFragment("Any text"));
    }

    @Test
    public void testGenerateToolTipFragment_StringWithControlCharacters() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Test with control characters like backspace. htmlEscape encodes them.
        assertEquals(" title=\"Text\bwith\bbackspace\" alt=\"\"", generator.generateToolTipFragment("Text\bwith\bbackspace"));
    }
    
    @Test
    public void testGenerateToolTipFragment_EmptyStringWithSpaces() throws Exception {
        StandardToolTipTagFragmentGenerator generator = new StandardToolTipTagFragmentGenerator();
        // Empty string but with spaces, which is not empty.
        assertEquals(" title=\"   \" alt=\"\"", generator.generateToolTipFragment("   "));
    }
}
