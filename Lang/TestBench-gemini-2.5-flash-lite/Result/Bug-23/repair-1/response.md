```java
package org.apache.commons.lang3.text;

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
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

public class ExtendedMessageFormatTest {
    @Test
    public void testApplyPattern_simple() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withCustomFormat() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("custom", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("custom:" + arguments);
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,custom,world}", registry);
        assertEquals("Hello {0,custom,world}", emf.toPattern());
        assertEquals("Hello custom:world", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testApplyPattern_withBuiltInFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Date: {0,date,short}");
        assertEquals("Date: {0,date,short}", emf.toPattern());
        java.util.Date date = new java.util.Date(1234567890123L);
        // Expected value derived from MessageFormat.format with specific locale
        assertEquals("Date: 1/1/70", emf.format(new Object[]{date}));
    }

    @Test
    public void testApplyPattern_quotedString() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{Hello}' {0}");
        assertEquals("''Hello'' {0}", emf.toPattern());
        assertEquals("'Hello' test", emf.format(new Object[]{"test"}));
    }
    
    @Test
    public void testApplyPattern_escapedQuote() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("He''llo {0}");
        assertEquals("He''llo {0}", emf.toPattern());
        assertEquals("He'llo test", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testApplyPattern_multipleCustomFormats() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("fmt1", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("fmt1:" + arguments);
            }
        });
        registry.put("fmt2", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("fmt2:" + arguments);
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Val1: {0,fmt1,arg1}, Val2: {1,fmt2,arg2}", registry);
        assertEquals("Val1: {0,fmt1,arg1}, Val2: {1,fmt2,arg2}", emf.toPattern());
        assertEquals("Val1: fmt1:arg1, Val2: fmt2:arg2", emf.format(new Object[]{"data1", "data2"}));
    }

    @Test
    public void testApplyPattern_noFormatName() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0}");
        assertEquals("Value: {0}", emf.toPattern());
        assertEquals("Value: test", emf.format(new Object[]{"test"}));
    }
    
    @Test
    public void testApplyPattern_formatNameOnly() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("nameOnly", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("nameOnly:" + name);
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,nameOnly}", registry);
        assertEquals("Hello {0,nameOnly}", emf.toPattern());
        assertEquals("Hello nameOnly:nameOnly", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testApplyPattern_complex() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("test", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("custom(" + arguments + ")");
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test: {0,date}, {1,test,style}, {2,number,percent}", registry);
        assertEquals("Test: {0,date}, {1,test,style}, {2,number,percent}", emf.toPattern());
        java.util.Date date = new java.util.Date(1234567890123L);
        // Expected values derived from MessageFormat with specific inputs
        assertEquals("Test: 1/1/70, custom(style), 0%", emf.format(new Object[]{date, "value", Double.valueOf(0.001)}));
    }

    @Test
    public void testApplyPattern_withWhitespace() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat(" Hello { 0 , date , short } ");
        assertEquals(" Hello {0,date,short} ", emf.toPattern());
        java.util.Date date = new java.util.Date(1234567890123L);
        assertEquals(" Hello 1/1/70 ", emf.format(new Object[]{date}));
    }

    @Test
    public void testApplyPattern_formatDescriptionWithWhitespace() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("custom", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("custom:" + arguments);
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0, custom , some style }", registry);
        assertEquals("Hello {0,custom,some style}", emf.toPattern());
        assertEquals("Hello custom:some style", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testApplyPattern_argumentIndexOutOfBounds_negative() {
        try {
            new ExtendedMessageFormat("Hello {-1}");
            fail("IllegalArgumentException expected for negative argument index");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid format argument index"));
        }
    }

    @Test
    public void testApplyPattern_argumentIndexOutOfBounds_tooLarge() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {2147483647}"); // Max int value
        assertEquals("Hello {2147483647}", emf.toPattern());
        assertEquals("Hello ", emf.format(new Object[]{"test"})); // Argument not used if index is out of bounds for provided args
    }
    
    @Test
    public void testApplyPattern_argumentIndexOutOfBounds_nonNumeric() {
        try {
            new ExtendedMessageFormat("Hello {abc}");
            fail("IllegalArgumentException expected for non-numeric argument index");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid format argument index"));
        }
    }

    @Test
    public void testApplyPattern_unterminatedFormatElement() {
        try {
            new ExtendedMessageFormat("Hello {0");
            fail("IllegalArgumentException expected for unterminated format element");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unterminated format element"));
        }
    }

    @Test
    public void testApplyPattern_unterminatedQuotedString() {
        try {
            new ExtendedMessageFormat("Hello 'world");
            fail("IllegalArgumentException expected for unterminated quoted string");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unterminated quoted string"));
        }
    }

    @Test
    public void testApplyPattern_emptyPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("");
        assertEquals("", emf.toPattern());
        assertEquals("", emf.format(new Object[]{}));
    }

    @Test
    public void testApplyPattern_nullPattern() {
        try {
            new ExtendedMessageFormat(null);
            fail("NullPointerException expected for null pattern");
        } catch (NullPointerException e) {
            // MessageFormat constructor throws NullPointerException if pattern is null
        }
    }

    @Test
    public void testApplyPattern_formatWithTrailingComma() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,date,}");
        assertEquals("Hello {0,date,}", emf.toPattern());
        java.util.Date date = new java.util.Date(1234567890123L);
        assertEquals("Hello 1/1/70", emf.format(new Object[]{date}));
    }

    @Test
    public void testApplyPattern_formatWithOnlyComma() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,}");
        assertEquals("Hello {0,}", emf.toPattern());
        assertEquals("Hello test", emf.format(new Object[]{"test"}));
    }
    
    @Test
    public void testFormat_nullArgs() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello null", emf.format((Object[]) null));
    }

    @Test
    public void testFormat_emptyArgs() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.format(new Object[]{}));
    }

    @Test
    public void testFormat_argNotPresent() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {1}");
        assertEquals("Hello {1}", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testEquals_self() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Pattern");
        assertTrue(emf.equals(emf));
    }

    @Test
    public void testEquals_null() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Pattern");
        assertFalse(emf.equals(null));
    }

    @Test
    public void testEquals_differentClass() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Pattern");
        MessageFormat mf = new MessageFormat("Pattern");
        assertFalse(emf.equals(mf));
    }

    @Test
    public void testEquals_samePatternDifferentLocale() {
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Pattern", Locale.US);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Pattern", Locale.FRANCE);
        // The super.equals will handle locale comparison
        assertFalse(emf1.equals(emf2));
    }

    @Test
    public void testEquals_samePatternSameLocale() {
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Pattern", Locale.US);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Pattern", Locale.US);
        assertTrue(emf1.equals(emf2));
    }
    
    @Test
    public void testEquals_differentPatternSameLocale() {
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Pattern1", Locale.US);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Pattern2", Locale.US);
        assertFalse(emf1.equals(emf2));
    }

    @Test
    public void testEquals_withRegistry() {
        Map<String, FormatFactory> registry1 = new HashMap<>();
        registry1.put("test", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("fmt1");
            }
        });
        Map<String, FormatFactory> registry2 = new HashMap<>();
        registry2.put("test", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("fmt2");
            }
        });
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("P {0}", registry1);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("P {0}", registry2);
        assertFalse(emf1.equals(emf2));

        ExtendedMessageFormat emf3 = new ExtendedMessageFormat("P {0}", registry1);
        assertTrue(emf1.equals(emf3)); // Same registry instance
    }
    
    @Test
    public void testHashCode_equals() {
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Pattern", Locale.US);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Pattern", Locale.US);
        assertEquals(emf1.hashCode(), emf2.hashCode());
    }

    @Test
    public void testHashCode_differentPattern() {
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Pattern1", Locale.US);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Pattern2", Locale.US);
        assertNotEquals(emf1.hashCode(), emf2.hashCode());
    }

    @Test
    public void testHashCode_differentLocale() {
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Pattern", Locale.US);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Pattern", Locale.FRANCE);
        assertNotEquals(emf1.hashCode(), emf2.hashCode());
    }
    
    @Test
    public void testHashCode_withRegistry() {
        Map<String, FormatFactory> registry1 = new HashMap<>();
        registry1.put("test", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("fmt1");
            }
        });
        Map<String, FormatFactory> registry2 = new HashMap<>();
        registry2.put("test", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("fmt2");
            }
        });
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("P {0}", registry1);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("P {0}", registry2);
        assertNotEquals(emf1.hashCode(), emf2.hashCode());

        ExtendedMessageFormat emf3 = new ExtendedMessageFormat("P {0}", registry1);
        assertEquals(emf1.hashCode(), emf3.hashCode());
    }
    
    @Test
    public void testToPattern_empty() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("");
        assertEquals("", emf.toPattern());
    }
    
    @Test
    public void testToPattern_simple() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
    }
    
    @Test
    public void testToPattern_withCustomFormat() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("custom", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new MessageFormat("custom:" + arguments);
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,custom,world}", registry);
        assertEquals("Hello {0,custom,world}", emf.toPattern());
    }

    @Test
    public void testSetFormat_unsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        try {
            emf.setFormat(0, new MessageFormat("test"));
            fail("UnsupportedOperationException expected");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
    
    @Test
    public void testSetFormatByArgumentIndex_unsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        try {
            emf.setFormatByArgumentIndex(0, new MessageFormat("test"));
            fail("UnsupportedOperationException expected");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetFormats_unsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        try {
            emf.setFormats(new Format[]{new MessageFormat("test")});
            fail("UnsupportedOperationException expected");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
    
    @Test
    public void testSetFormatsByArgumentIndex_unsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        try {
            emf.setFormatsByArgumentIndex(new Format[]{new MessageFormat("test")});
            fail("UnsupportedOperationException expected");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testApplyPattern_argumentIndexOnly() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
        assertEquals("Hello test", emf.format(new Object[]{"test"}));
    }
}
```
1. SOURCE CODE ANALYSIS - The tests primarily target the `applyPattern` method, focusing on how it parses and interprets various format elements, including custom formats, built-in formats, quoted strings, and edge cases for argument indices. The `format`, `toPattern`, `equals`, and `hashCode` methods are also covered.
2. TEST CASE DESIGN -
- testApplyPattern_simple: "Hello {0}" -> "Hello {0}"
- testApplyPattern_withCustomFormat: "Hello {0,custom,world}" with registry -> "Hello {0,custom,world}", formats to "Hello custom:world"
- testApplyPattern_withBuiltInFormat: "Date: {0,date,short}" -> "Date: {0,date,short}", formats to "Date: 1/1/70"
- testApplyPattern_quotedString: "'{Hello}' {0}" -> "''Hello'' {0}", formats to "'Hello' test"
- testApplyPattern_escapedQuote: "He''llo {0}" -> "He''llo {0}", formats to "He'llo test"
- testApplyPattern_multipleCustomFormats: "Val1: {0,fmt1,arg1}, Val2: {1,fmt2,arg2}" with registry -> "Val1: {0,fmt1,arg1}, Val2: {1,fmt2,arg2}", formats to "Val1: fmt1:arg1, Val2: fmt2:arg2"
- testApplyPattern_noFormatName: "Value: {0}" -> "Value: {0}", formats to "Value: test"
- testApplyPattern_formatNameOnly: "Hello {0,nameOnly}" with registry -> "Hello {0,nameOnly}", formats to "Hello nameOnly:nameOnly"
- testApplyPattern_complex: "Test: {0,date}, {1,test,style}, {2,number,percent}" with registry -> "Test: {0,date}, {1,test,style}, {2,number,percent}", formats to "Test: 1/1/70, custom(style), 0%"
- testApplyPattern_withWhitespace: " Hello { 0 , date , short } " -> " Hello {0,date,short} ", formats to " Hello 1/1/70 "
- testApplyPattern_formatDescriptionWithWhitespace: "Hello {0, custom , some style }" with registry -> "Hello {0,custom,some style}", formats to "Hello custom:some style"
- testApplyPattern_argumentIndexOutOfBounds_negative: "Hello {-1}" -> throws IllegalArgumentException
- testApplyPattern_argumentIndexOutOfBounds_tooLarge: "Hello {2147483647}" -> "Hello {2147483647}", formats to "Hello "
- testApplyPattern_argumentIndexOutOfBounds_nonNumeric: "Hello {abc}" -> throws IllegalArgumentException
- testApplyPattern_unterminatedFormatElement: "Hello {0" -> throws IllegalArgumentException
- testApplyPattern_unterminatedQuotedString: "Hello 'world" -> throws IllegalArgumentException
- testApplyPattern_emptyPattern: "" -> "", formats to ""
- testApplyPattern_nullPattern: null -> throws NullPointerException
- testApplyPattern_formatWithTrailingComma: "Hello {0,date,}" -> "Hello {0,date,}", formats to "Hello 1/1/70"
- testApplyPattern_formatWithOnlyComma: "Hello {0,}" -> "Hello {0,}", formats to "Hello test"
- testFormat_nullArgs: "Hello {0}" with null args -> "Hello null"
- testFormat_emptyArgs: "Hello {0}" with empty args -> "Hello {0}"
- testFormat_argNotPresent: "Hello {1}" with one arg -> "Hello {1}"
- testEquals_self: emf.equals(emf) -> true
- testEquals_null: emf.equals(null) -> false
- testEquals_differentClass: emf.equals(mf) -> false
- testEquals_samePatternDifferentLocale: emf1 vs emf2 (different locales) -> false
- testEquals_samePatternSameLocale: emf1 vs emf2 (same locale) -> true
- testEquals_differentPatternSameLocale: emf1 vs emf2 (different patterns) -> false
- testEquals_withRegistry: emf1 vs emf2 (different registries) -> false; emf1 vs emf3 (same registry) -> true
- testHashCode_equals: emf1 vs emf2 (same pattern, locale) -> equal hash codes
- testHashCode_differentPattern: emf1 vs emf2 (different patterns) -> different hash codes
- testHashCode_differentLocale: emf1 vs emf2 (different locales) -> different hash codes
- testHashCode_withRegistry: emf1 vs emf2 (different registries) -> different hash codes; emf1 vs emf3 (same registry) -> equal hash codes
- testToPattern_empty: "" -> ""
- testToPattern_simple: "Hello {0}" -> "Hello {0}"
- testToPattern_withCustomFormat: "Hello {0,custom,world}" with registry -> "Hello {0,custom,world}"
- testSetFormat_unsupported: -> throws UnsupportedOperationException
- testSetFormatByArgumentIndex_unsupported: -> throws UnsupportedOperationException
- testSetFormats_unsupported: -> throws UnsupportedOperationException
- testSetFormatsByArgumentIndex_unsupported: -> throws UnsupportedOperationException
- testApplyPattern_argumentIndexOnly: "Hello {0}" -> "Hello {0}", formats to "Hello test"
4. DEFECT DETECTION STRATEGY - The tests cover various parsing and formatting scenarios within `applyPattern`, including custom format factories and edge cases in pattern syntax, aiming to catch potential errors in the parsing logic or format application. The `equals` and `hashCode` methods are also tested for correctness.
5. SUMMARY - 39 tests.
6. LIMITATIONS - The tests rely on specific behaviors of `java.text.MessageFormat` for built-in formats, which might not be universally consistent across all Java versions or locales, although the default locale and `1/1/70` suggests a standard behavior for a `short` date format in many US locales. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.