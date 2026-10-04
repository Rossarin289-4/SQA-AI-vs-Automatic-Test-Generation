The compiler errors indicate that `assertNotEquals` is not found. This method is part of JUnit 4.4 and later, but the default for this problem is JUnit 4.12. If `assertNotEquals` is not available, it means it's not imported or not part of the JUnit version being used.

Looking at the provided API Outline and the original imports, `assertNotEquals` is indeed not available by default. We should use `assertFalse(emf1.hashCode() == emf2.hashCode())` instead.

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
        assertFalse(emf1.hashCode() == emf2.hashCode());
    }

    @Test
    public void testHashCode_differentLocale() {
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Pattern", Locale.US);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Pattern", Locale.FRANCE);
        assertFalse(emf1.hashCode() == emf2.hashCode());
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
        assertFalse(emf1.hashCode() == emf2.hashCode());

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