```java
package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.Validate;

public class ExtendedMessageFormatTest {

    @Test
    public void testApplyPattern_simple() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withFormat() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,number}");
        assertEquals("Hello {0,number}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withFormatAndStyle() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,number,integer}");
        assertEquals("Hello {0,number,integer}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withCustomFormat() throws Exception {
        Map registry = new HashMap();
        registry.put("custom", new MockFormatFactory());
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,custom}", registry);
        assertEquals("Hello {0,custom}", emf.toPattern());
        Format[] formats = emf.getFormats();
        assertTrue(formats[0] instanceof MockFormat);
    }

    @Test
    public void testApplyPattern_withCustomFormatAndArgs() throws Exception {
        Map registry = new HashMap();
        registry.put("custom", new MockFormatFactory());
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,custom,someArgs}", registry);
        assertEquals("Hello {0,custom,someArgs}", emf.toPattern());
        Format[] formats = emf.getFormats();
        assertTrue(formats[0] instanceof MockFormat);
    }

    @Test
    public void testApplyPattern_withEscapedQuote() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello ''{0}''");
        assertEquals("Hello ''{0}''", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withNestedFormatElements() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Message: {0,number}, Nested: {1,choice,0#zero|1#one}");
        assertEquals("Message: {0,number}, Nested: {1,choice,0#zero|1#one}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withWhitespaceAroundFormat() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello { 0 , number , integer }");
        assertEquals("Hello {0,number,integer}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_emptyPattern() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("");
        assertEquals("", emf.toPattern());
    }

    @Test
    public void testApplyPattern_onlyQuotes() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("''");
        assertEquals("''", emf.toPattern());
    }

    @Test
    public void testApplyPattern_quotedStartAndEnd() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{'Hello'{'}");
        assertEquals("'{'Hello'{'}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_unclosedQuote() throws Exception {
        try {
            new ExtendedMessageFormat("Hello '{' world");
            fail("Expected IllegalArgumentException for unclosed quote");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testApplyPattern_unclosedFormatElement() throws Exception {
        try {
            new ExtendedMessageFormat("Hello {0");
            fail("Expected IllegalArgumentException for unclosed format element");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testApplyPattern_invalidArgumentIndex() throws Exception {
        try {
            new ExtendedMessageFormat("Hello {abc}");
            fail("Expected IllegalArgumentException for invalid argument index");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testApplyPattern_invalidFormatDescription() throws Exception {
        Map registry = new HashMap();
        registry.put("invalid", new MockFormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                if ("invalid".equals(name) && "bad_args".equals(arguments)) {
                    throw new IllegalArgumentException("Bad arguments");
                }
                return super.getFormat(name, arguments, locale);
            }
        });
        try {
            new ExtendedMessageFormat("{0,invalid,bad_args}", registry);
            fail("Expected IllegalArgumentException for invalid format description");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testApplyPattern_withFormatAndCustomRegistryButNoMatchingFactory() throws Exception {
        Map registry = new HashMap();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,nonexistent}", registry);
        assertEquals("Hello {0,nonexistent}", emf.toPattern());
        Format[] formats = emf.getFormats();
        // The default MessageFormat should handle "nonexistent" as a literal if no factory is found
        // However, ExtendedMessageFormat's applyPattern directly uses super.applyPattern with stripCustom.
        // If getFormat returns null, it appends the description.
        // super.applyPattern will then treat "number" as a format.
        // For "nonexistent", since there's no factory, getFormat returns null, and it's appended as is.
        // The base MessageFormat does not have a 'nonexistent' format.
        // This will result in the format element being treated as a literal string if it cannot be parsed by base MessageFormat.
        // Let's assert the pattern is correct and the format is null as no custom format was applied.
        assertNull(formats[0]);
    }

    @Test
    public void testApplyPattern_withFormatAndCustomRegistryButNoFactoryForName() throws Exception {
        Map registry = new HashMap();
        registry.put("another", new MockFormatFactory());
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,custom}", registry);
        assertEquals("Hello {0,custom}", emf.toPattern());
        Format[] formats = emf.getFormats();
        // Since no factory for 'custom', getFormat returns null, stripCustom appends "{0,custom}".
        // super.applyPattern is called with that, and insertFormats reinserts "{0,custom}".
        // The format obtained for this element will be null.
        assertNull(formats[0]);
    }


    @Test
    public void testToPattern_afterApplyPattern() throws Exception {
        String pattern = "The date is {0,date,short}. The number is {1,number,0.00}.";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern);
        assertEquals(pattern, emf.toPattern());
    }

    @Test
    public void testToPattern_withCustomFormat() throws Exception {
        Map registry = new HashMap();
        registry.put("custom", new MockFormatFactory());
        String pattern = "Custom format: {0,custom}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        assertEquals(pattern, emf.toPattern());
    }

    @Test
    public void testApplyPattern_integerParseEdgeCases() throws Exception {
        // A valid large number within Integer range.
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {2147483647}");
        assertEquals("Test {2147483647}", emf.toPattern());
        // A number that would overflow Integer.MAX_VALUE. This should throw IllegalArgumentException.
        try {
            new ExtendedMessageFormat("Test {2147483648}");
            fail("Expected IllegalArgumentException for number too large");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testApplyPattern_formatDescriptionParseEdgeCases() throws Exception {
        // Test with a format description containing nested curly braces.
        // The parser should correctly handle the nesting.
        String nestedDesc = "choice,0#zero|1#{1,number}";
        Map registry = new HashMap();
        registry.put("custom", new MockFormatFactory());
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0,custom," + nestedDesc + "}", registry);
        assertEquals("Value: {0,custom," + nestedDesc + "}", emf.toPattern());
    }

    // Mock implementation of FormatFactory and Format for testing custom formats
    private static class MockFormatFactory implements FormatFactory {
        @Override
        public Format getFormat(String name, String arguments, Locale locale) {
            return new MockFormat(name, arguments, locale);
        }
    }

    private static class MockFormat extends Format {
        private static final long serialVersionUID = 1L;
        private String name;
        private String arguments;
        private Locale locale;

        public MockFormat(String name, String arguments, Locale locale) {
            this.name = name;
            this.arguments = arguments;
            this.locale = locale;
        }

        @Override
        public Object parseObject(String source, ParsePosition pos) {
            return null; // Not needed for these tests
        }

        // Corrected format method to return String and accept correct parameters
        @Override
        public String format(Object obj, StringBuffer toAppendTo,
                java.text.FieldPosition pos) {
            // Simulate some formatting behavior or just return a placeholder
            String formattedString = "MockFormat:" + name + "(" + arguments + ")";
            toAppendTo.append(formattedString);
            return formattedString;
        }

        @Override
        public String toString() {
            return "MockFormat(" + name + ", " + arguments + ", " + locale + ")";
        }
    }

    @Test
    public void testSetFormat_unsupported() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        try {
            emf.setFormat(0, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testSetFormatByArgumentIndex_unsupported() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        try {
            emf.setFormatByArgumentIndex(0, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testSetFormats_unsupported() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        try {
            emf.setFormats(new Format[1]);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testSetFormatsByArgumentIndex_unsupported() throws Exception {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        try {
            emf.setFormatsByArgumentIndex(new Format[1]);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testApplyPattern_multipleCustomFormats() throws Exception {
        Map registry = new HashMap();
        registry.put("fmt1", new MockFormatFactory());
        registry.put("fmt2", new MockFormatFactory());
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,fmt1}, {1,fmt2}", registry);
        assertEquals("{0,fmt1}, {1,fmt2}", emf.toPattern());
        Format[] formats = emf.getFormats();
        assertTrue(formats[0] instanceof MockFormat);
        assertTrue(formats[1] instanceof MockFormat);
    }

    @Test
    public void testApplyPattern_customFormatWithEmptyArgs() throws Exception {
        Map registry = new HashMap();
        registry.put("empty", new MockFormatFactory());
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,empty}", registry);
        assertEquals("{0,empty}", emf.toPattern());
        Format[] formats = emf.getFormats();
        assertTrue(formats[0] instanceof MockFormat);
        MockFormat fmt = (MockFormat) formats[0];
        assertEquals("", fmt.arguments); // Empty arguments string
    }

    @Test
    public void testApplyPattern_complexPatternWithQuotesAndFormats() throws Exception {
        Map registry = new HashMap();
        registry.put("custom", new MockFormatFactory());
        String pattern = "This is a ''quoted'' string. Hello {0,number}, and {1,custom,style}.";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        assertEquals("This is a ''quoted'' string. Hello {0,number}, and {1,custom,style}.", emf.toPattern());
        Format[] formats = emf.getFormats();
        // For "number", getFormat returns null, so it's appended as is.
        // super.applyPattern is called with the stripped pattern.
        // The base MessageFormat handles "number" as a standard format.
        // However, in ExtendedMessageFormat, if getFormat returns null, it doesn't try to parse with MessageFormat.
        // The insertFormats method reinserts the original custom format description if it was found.
        // If getFormat returns null for a format description, it means no custom factory was found for it.
        // The test case "testApplyPattern_withFormatAndCustomRegistryButNoMatchingFactory" already covers this.
        // In this specific case, 'number' is a standard format, so MessageFormat will create a NumberFormat.
        // However, the ExtendedMessageFormat applies its own logic.
        // When getFormat returns null, the formatDescription is appended to stripCustom.
        // Then super.applyPattern is called. MessageFormat.applyPattern will parse "number" and create a NumberFormat.
        // The getFormats() will then reflect what MessageFormat has created.
        // Let's check if it's a NumberFormat or a MessageFormat.Field.
        // Based on ExtendedMessageFormat's applyPattern, if getFormat returns null, it appends the description.
        // So, the super.applyPattern receives "{0,number}". MessageFormat handles this.
        // The `formats` array from `getFormats()` should contain the actual format object created by MessageFormat.
        // For a standard format like 'number', MessageFormat.getField will create a NumberFormat.
        assertTrue(formats[0] instanceof java.text.NumberFormat);
        assertTrue(formats[1] instanceof MockFormat);
    }
}
```

```text
1. SOURCE CODE ANALYSIS - The tests cover the `applyPattern` method, focusing on parsing various format elements, including custom formats, escaped quotes, and nested structures. They also test the `toPattern` method and the unsupported `setFormat` methods.
2. TEST CASE DESIGN -
   - testApplyPattern_simple: "Hello {0}" -> "Hello {0}" (Literal pattern)
   - testApplyPattern_withFormat: "Hello {0,number}" -> "Hello {0,number}" (Standard format)
   - testApplyPattern_withFormatAndStyle: "Hello {0,number,integer}" -> "Hello {0,number,integer}" (Standard format with style)
   - testApplyPattern_withCustomFormat: "Hello {0,custom}" with registry -> "Hello {0,custom}" (Custom format, checks instance)
   - testApplyPattern_withCustomFormatAndArgs: "Hello {0,custom,someArgs}" with registry -> "Hello {0,custom,someArgs}" (Custom format with arguments, checks instance)
   - testApplyPattern_withEscapedQuote: "Hello ''{0}''" -> "Hello ''{0}''" (Escaped quotes)
   - testApplyPattern_withNestedFormatElements: "Message: {0,number}, Nested: {1,choice,0#zero|1#one}" -> "Message: {0,number}, Nested: {1,choice,0#zero|1#one}" (Nested elements)
   - testApplyPattern_withWhitespaceAroundFormat: "Hello { 0 , number , integer }" -> "Hello {0,number,integer}" (Whitespace handling)
   - testApplyPattern_emptyPattern: "" -> "" (Empty pattern)
   - testApplyPattern_onlyQuotes: "''" -> "''" (Only escaped quote)
   - testApplyPattern_quotedStartAndEnd: "'{'Hello'{'" -> "'{'Hello'{'" (Quoted start and end)
   - testApplyPattern_unclosedQuote: "Hello '{' world" -> throws IllegalArgumentException (Unclosed quote)
   - testApplyPattern_unclosedFormatElement: "Hello {0" -> throws IllegalArgumentException (Unclosed format element)
   - testApplyPattern_invalidArgumentIndex: "Hello {abc}" -> throws IllegalArgumentException (Invalid argument index)
   - testApplyPattern_invalidFormatDescription: "{0,invalid,bad_args}" with custom factory throwing exception -> throws IllegalArgumentException (Invalid format description)
   - testApplyPattern_withFormatAndCustomRegistryButNoMatchingFactory: "Hello {0,nonexistent}" with empty registry -> "Hello {0,nonexistent}" (No matching custom factory, falls back)
   - testApplyPattern_withFormatAndCustomRegistryButNoFactoryForName: "Hello {0,custom}" with registry for "another" -> "Hello {0,custom}" (No factory for specific custom name, format null)
   - testToPattern_afterApplyPattern: "The date is {0,date,short}. The number is {1,number,0.00}." -> returns original pattern (toPattern method)
   - testToPattern_withCustomFormat: "Custom format: {0,custom}" with registry -> returns original pattern (toPattern with custom)
   - testApplyPattern_integerParseEdgeCases: "{2147483647}" -> "{2147483647}" (Max int); "{2147483648}" -> throws IllegalArgumentException (Overflow int)
   - testApplyPattern_formatDescriptionParseEdgeCases: "{0,custom,choice,0#zero|1#{1,number}}" with registry -> "{0,custom,choice,0#zero|1#{1,number}}" (Nested format description)
   - testSetFormat_unsupported: calls setFormat -> throws UnsupportedOperationException
   - testSetFormatByArgumentIndex_unsupported: calls setFormatByArgumentIndex -> throws UnsupportedOperationException
   - testSetFormats_unsupported: calls setFormats -> throws UnsupportedOperationException
   - testSetFormatsByArgumentIndex_unsupported: calls setFormatsByArgumentIndex -> throws UnsupportedOperationException
   - testApplyPattern_multipleCustomFormats: "{0,fmt1}, {1,fmt2}" with registry -> "{0,fmt1}, {1,fmt2}" (Multiple custom formats)
   - testApplyPattern_customFormatWithEmptyArgs: "{0,empty}" with registry -> "{0,empty}" (Custom format with no arguments)
   - testApplyPattern_complexPatternWithQuotesAndFormats: "This is a ''quoted'' string. Hello {0,number}, and {1,custom,style}." with registry -> pattern is preserved, checks format types (quoted, standard, custom)
4. DEFECT DETECTION STRATEGY - Tests verify correct parsing and re-serialization of patterns, handling of standard and custom formats, and error conditions for malformed patterns. The focus is on the `applyPattern` logic's ability to correctly interpret and store format elements, especially when interacting with a registry and handling edge cases in parsing.
5. SUMMARY - 27 tests.
6. LIMITATIONS - The tests rely on mock implementations for custom formats and do not test the actual formatting or parsing logic of these mock formats, only that they are correctly instantiated and used by ExtendedMessageFormat. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.
```