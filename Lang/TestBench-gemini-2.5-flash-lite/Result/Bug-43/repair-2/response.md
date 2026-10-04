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
import java.text.FieldPosition; // Added import for FieldPosition

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
        assertNull(formats[0]);
    }

    @Test
    public void testApplyPattern_withFormatAndCustomRegistryButNoFactoryForName() throws Exception {
        Map registry = new HashMap();
        registry.put("another", new MockFormatFactory());
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,custom}", registry);
        assertEquals("Hello {0,custom}", emf.toPattern());
        Format[] formats = emf.getFormats();
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
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {2147483647}");
        assertEquals("Test {2147483647}", emf.toPattern());
        try {
            new ExtendedMessageFormat("Test {2147483648}");
            fail("Expected IllegalArgumentException for number too large");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testApplyPattern_formatDescriptionParseEdgeCases() throws Exception {
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

        // Corrected format method signature to match Format
        @Override
        public StringBuffer format(Object obj, StringBuffer toAppendTo,
                FieldPosition pos) {
            String formattedString = "MockFormat:" + name + "(" + arguments + ")";
            toAppendTo.append(formattedString);
            return toAppendTo;
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
        assertTrue(formats[0] instanceof java.text.NumberFormat);
        assertTrue(formats[1] instanceof MockFormat);
    }
}
```
SOURCE CODE ANALYSIS
The tests focus on the `applyPattern` method, covering its parsing logic for simple patterns, custom formats, escaped quotes, nested elements, and edge cases in number and format description parsing. Tests for `toPattern` and the unsupported `setFormat` methods are also included.

TEST CASE DESIGN
- testApplyPattern_simple: "Hello {0}" -> "Hello {0}" (base MessageFormat behavior)
- testApplyPattern_withFormat: "Hello {0,number}" -> "Hello {0,number}" (standard format)
- testApplyPattern_withFormatAndStyle: "Hello {0,number,integer}" -> "Hello {0,number,integer}" (standard format with style)
- testApplyPattern_withCustomFormat: "Hello {0,custom}" with registry -> "Hello {0,custom}" and MockFormat instance
- testApplyPattern_withCustomFormatAndArgs: "Hello {0,custom,someArgs}" with registry -> "Hello {0,custom,someArgs}" and MockFormat instance
- testApplyPattern_withEscapedQuote: "Hello ''{0}''" -> "Hello ''{0}''" (handling escaped quotes)
- testApplyPattern_withNestedFormatElements: "Message: {0,number}, Nested: {1,choice,0#zero|1#one}" -> pattern with nested elements
- testApplyPattern_withWhitespaceAroundFormat: "Hello { 0 , number , integer }" -> "Hello {0,number,integer}" (whitespace trimming)
- testApplyPattern_emptyPattern: "" -> "" (empty pattern)
- testApplyPattern_onlyQuotes: "''" -> "''" (pattern with only escaped quote)
- testApplyPattern_quotedStartAndEnd: "'{'Hello'{'}" -> "'{'Hello'{'}" (quoted format element start/end)
- testApplyPattern_unclosedQuote: "Hello '{' world" -> throws IllegalArgumentException (unclosed quote)
- testApplyPattern_unclosedFormatElement: "Hello {0" -> throws IllegalArgumentException (unclosed format element)
- testApplyPattern_invalidArgumentIndex: "Hello {abc}" -> throws IllegalArgumentException (invalid argument index)
- testApplyPattern_invalidFormatDescription: "{0,invalid,bad_args}" with registry -> throws IllegalArgumentException (invalid format description)
- testApplyPattern_withFormatAndCustomRegistryButNoMatchingFactory: "Hello {0,nonexistent}" with empty registry -> "Hello {0,nonexistent}" and null format
- testApplyPattern_withFormatAndCustomRegistryButNoFactoryForName: "Hello {0,custom}" with registry for "another" -> "Hello {0,custom}" and null format
- testToPattern_afterApplyPattern: "The date is {0,date,short}. The number is {1,number,0.00}." -> same pattern (toPattern consistency)
- testToPattern_withCustomFormat: "Custom format: {0,custom}" with registry -> same pattern (toPattern with custom format)
- testApplyPattern_integerParseEdgeCases: "{2147483647}" and "{2147483648}" -> valid integer and exception for overflow
- testApplyPattern_formatDescriptionParseEdgeCases: "{0,custom,choice,0#zero|1#{1,number}}" -> pattern with nested format description
- testSetFormat_unsupported: attempts setFormat -> throws UnsupportedOperationException
- testSetFormatByArgumentIndex_unsupported: attempts setFormatByArgumentIndex -> throws UnsupportedOperationException
- testSetFormats_unsupported: attempts setFormats -> throws UnsupportedOperationException
- testSetFormatsByArgumentIndex_unsupported: attempts setFormatsByArgumentIndex -> throws UnsupportedOperationException
- testApplyPattern_multipleCustomFormats: "{0,fmt1}, {1,fmt2}" with registry -> pattern and two MockFormat instances
- testApplyPattern_customFormatWithEmptyArgs: "{0,empty}" with registry -> pattern and MockFormat with empty arguments
- testApplyPattern_complexPatternWithQuotesAndFormats: "This is a ''quoted'' string. Hello {0,number}, and {1,custom,style}." -> pattern and correct format types (NumberFormat, MockFormat)
DEFECT DETECTION STRATEGY
Tests focus on the parsing and application of format patterns, including custom format factories and edge cases like integer overflow and nested descriptions, to catch potential errors in pattern interpretation and format instantiation.
SUMMARY
27 tests.
LIMITATIONS
MockFormat does not implement actual formatting logic, relying on basic string concatenation for its toString representation. The tests do not cover the actual formatting or parsing of messages.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.