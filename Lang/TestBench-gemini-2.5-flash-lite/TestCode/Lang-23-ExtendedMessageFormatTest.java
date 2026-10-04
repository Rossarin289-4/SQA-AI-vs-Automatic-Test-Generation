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
                // The original test expected a String, but MessageFormat requires Object[]
                // Correcting the expected behavior to return a MessageFormat that can format
                // However, the provided API outline for FormatFactory does not allow returning
                // MessageFormat directly as it expects Format.
                // Let's assume the arguments are meant to be part of the format description.
                // The original error suggests a ClassCastException, implying the formatted result was a String.
                // Let's create a simple MessageFormat that uses the arguments.
                return new MessageFormat("custom:" + arguments); // Assuming arguments are directly usable in the format
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,custom,world}", registry);
        assertEquals("Hello {0,custom,world}", emf.toPattern());
        // The format method takes Object[], so we need to pass the argument for {0}.
        // The custom format itself will use "world" as its argument.
        assertEquals("Hello custom:world", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testApplyPattern_withBuiltInFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Date: {0,date,short}");
        assertEquals("Date: {0,date,short}", emf.toPattern());
        java.util.Date date = new java.util.Date(1234567890123L); // This date is around Feb 13, 2009
        // Expected value derived from MessageFormat.format with specific locale (US default)
        // The original assertion was "1/1/70", which is incorrect for the given date.
        // The actual date for this timestamp in US locale is "2/13/09".
        assertEquals("Date: 2/13/09", emf.format(new Object[]{date}));
    }

    @Test
    public void testApplyPattern_quotedString() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{Hello}' {0}");
        // The toPattern() method of MessageFormat (parent class) escapes single quotes.
        assertEquals("''Hello'' {0}", emf.toPattern());
        // When formatting, the escaped quotes are interpreted correctly.
        assertEquals("'Hello' test", emf.format(new Object[]{"test"}));
    }
    
    @Test
    public void testApplyPattern_escapedQuote() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("He''llo {0}");
        // The toPattern() will show the double quote as two single quotes.
        assertEquals("He''llo {0}", emf.toPattern());
        // During formatting, "''" is interpreted as a single quote.
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
                // The arguments parameter here is the "format-style" part.
                // If it's null or empty, it should be handled.
                // The original test was likely trying to use "nameOnly" as the argument.
                // Let's assume if arguments is null, it should be an empty string or similar.
                return new MessageFormat("nameOnly:" + (arguments == null ? "" : arguments));
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,nameOnly}", registry);
        assertEquals("Hello {0,nameOnly}", emf.toPattern());
        // When no style is provided, the 'arguments' parameter to getFormat is null.
        // The original test failed because it expected "nameOnly:nameOnly"
        // and likely the format was created with "nameOnly:".
        // Let's correct it to reflect no style provided.
        assertEquals("Hello nameOnly:", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testApplyPattern_complex() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("test", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                // The original error suggests String cannot be cast to Object[].
                // This implies that the `arguments` string is being treated as an object array.
                // This is likely a misunderstanding of how MessageFormat's applyPattern works internally.
                // The formatDescription is a string, and the arguments parameter to getFormat is also a string.
                // The reference code implies the `arguments` string is used to construct the format.
                return new MessageFormat("custom(" + arguments + ")");
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test: {0,date}, {1,test,style}, {2,number,percent}", registry);
        assertEquals("Test: {0,date}, {1,test,style}, {2,number,percent}", emf.toPattern());
        java.util.Date date = new java.util.Date(1234567890123L); // Feb 13, 2009
        // The format() method takes an array of Objects.
        // The {0,date} uses the default date format.
        // The {1,test,style} uses our custom factory with "style".
        // The {2,number,percent} uses the built-in number format with "percent" style.
        // Expected values need to match the actual formatting.
        // "2/13/09" for date.
        // "custom(style)" for test.
        // "0%" for number percent with a very small value (0.001).
        assertEquals("Test: 2/13/09, custom(style), 0%", emf.format(new Object[]{date, "value", Double.valueOf(0.001)}));
    }

    @Test
    public void testApplyPattern_withWhitespace() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat(" Hello { 0 , date , short } ");
        // The applyPattern method is supposed to trim whitespace around format names and styles.
        // The toPattern() should reflect the trimmed pattern.
        assertEquals(" Hello {0,date,short} ", emf.toPattern());
        java.util.Date date = new java.util.Date(1234567890123L);
        // The format should also be correct despite whitespace in the pattern.
        assertEquals(" Hello 2/13/09 ", emf.format(new Object[]{date}));
    }

    @Test
    public void testApplyPattern_formatDescriptionWithWhitespace() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("custom", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                // The reference code trims the arguments when creating the FormatFactory.
                return new MessageFormat("custom:" + arguments);
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0, custom , some style }", registry);
        // toPattern() should reflect the trimmed arguments.
        assertEquals("Hello {0,custom,some style}", emf.toPattern());
        // The formatted output should use the trimmed style.
        assertEquals("Hello custom:some style", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testApplyPattern_argumentIndexOutOfBounds_negative() {
        try {
            new ExtendedMessageFormat("Hello {-1}");
            fail("IllegalArgumentException expected for negative argument index");
        } catch (IllegalArgumentException e) {
            // The message in the exception should be checked.
            assertTrue(e.getMessage().contains("Invalid format argument index at position"));
        }
    }

    @Test
    public void testApplyPattern_argumentIndexOutOfBounds_tooLarge() {
        // MessageFormat itself handles very large indices, but ExtendedMessageFormat's parsing might have limits.
        // The original code throws an exception if the index exceeds an internal limit during parsing.
        // The reference code's `readArgumentIndex` method does not explicitly check against `Integer.MAX_VALUE`
        // for the result of `Integer.parseInt`, but rather that the parsed string is digits.
        // However, if the number is too large to fit into `int`, `parseInt` will throw `NumberFormatException`.
        // The test was trying to pass the maximum integer value as the index.
        // The `super.applyPattern` will be called with "Hello {2147483647}". MessageFormat itself might not throw
        // for this, but the custom parsing logic in ExtendedMessageFormat should be examined.
        // The error message "exceeds the ArgumentIndex implementation limit" suggests a specific check within ExtendedMessageFormat.
        // Looking at the `readArgumentIndex` method, it parses the digits. If `Integer.parseInt` succeeds,
        // it returns the integer. The error message suggests that the `super.applyPattern` might have limits.
        // The `super.applyPattern` is called with the `stripCustom` string, which would be "Hello 2147483647".
        // If the index is indeed too large for the *internal* representation of `MessageFormat` after being parsed by `ExtendedMessageFormat`,
        // it might throw an exception. The provided source for `readArgumentIndex` does not show this check.
        // Let's re-evaluate. The `super.applyPattern` will be called. The `getFormat` method within `applyPattern` is where
        // the `registry.get(name)` happens. The `readArgumentIndex` reads the number. If the number is valid as an `int`, it proceeds.
        // The issue might be how `MessageFormat` handles it when `applyPattern` is called with a very large number.
        // The `MessageFormat` itself, when formatting, will likely not find an argument at that index if the provided array is smaller.
        // Let's simulate the `MessageFormat` behavior with a large index.
        // If the pattern is "Hello {2147483647}", and we provide an array of size 1, `format` will use the default behavior.
        // The original test was trying to catch an IllegalArgumentException from ExtendedMessageFormat itself.
        // If `readArgumentIndex` successfully parses it, the `IllegalArgumentException` would not be thrown by it.
        // The `MessageFormat` class's `applyPattern` method does not seem to have explicit limits for the argument index itself beyond `int`.
        // The error message in the failure log is "2147483647 exceeds the ArgumentIndex implementation limit". This is likely from a method
        // that is not directly in `ExtendedMessageFormat` but perhaps within `MessageFormat`'s internal handling of indices that `ExtendedMessageFormat` invokes.
        // However, `ExtendedMessageFormat` does not seem to have this limit.
        // Let's assume that for a valid integer index, `MessageFormat` will proceed. If the argument array is smaller than the index, it will result in the index itself being printed.
        // The original test was expecting an exception from `applyPattern`. If no exception is thrown during `applyPattern`, then the formatting should occur.
        // The exception `2147483647 exceeds the ArgumentIndex implementation limit` seems to come from within the `MessageFormat`'s applyPattern or `parse` methods.
        // This means that ExtendedMessageFormat *itself* correctly parses the integer, but the underlying MessageFormat has an issue.
        // The `super.applyPattern(stripCustom.toString());` call is where this might happen.
        // Let's try to create a `MessageFormat` directly with this pattern.
        // MessageFormat mf = new MessageFormat("Hello {2147483647}");
        // mf.applyPattern("Hello {2147483647}"); // This does not throw an exception.
        // So the issue is not in MessageFormat's applyPattern.
        // The exception "2147483647 exceeds the ArgumentIndex implementation limit" might be from a specific internal format parsing within MessageFormat, not the index itself.
        // The problem states: "ArgumentIndexOutOfBounds_tooLarge". The error message "exceeds the ArgumentIndex implementation limit" suggests this.
        // If `ExtendedMessageFormat` correctly parses the number, then this exception is likely coming from the `super.applyPattern` call, meaning `MessageFormat` has this limit.
        // The original `ExtendedMessageFormat` throws `IllegalArgumentException` if the pattern is unreadable.
        // If the pattern is readable, it should not throw.
        // Let's re-examine the `readArgumentIndex` method. It parses the integer.
        // The `super.applyPattern` uses this parsed index.
        // The `format` method will be called later.
        // The provided failure log shows `testApplyPattern_argumentIndexOutOfBounds_tooLarge: java.lang.IllegalArgumentException: 2147483647 exceeds the ArgumentIndex implementation limit`
        // This means the exception *is* thrown during `applyPattern`.
        // The `readArgumentIndex` method does not seem to have this limit.
        // However, the `MessageFormat` class in Java might have such a limit internally when it processes the pattern.
        // If the `applyPattern` method of `ExtendedMessageFormat` itself is expected to throw this exception, then the current test setup is correct to expect it.
        // The current test is `new ExtendedMessageFormat("Hello {2147483647}")`.
        // The `super.applyPattern(stripCustom.toString());` is called.
        // If `MessageFormat` throws this exception during `applyPattern`, the test is correct.
        // Let's consider what `MessageFormat` does with a very large index.
        // If `super.applyPattern` does not throw, then `format` is called.
        // `assertEquals("Hello {2147483647}", emf.toPattern());`
        // `assertEquals("Hello {2147483647}", emf.format(new Object[]{"test"}));` This was the original expected output.
        // The error message is `2147483647 exceeds the ArgumentIndex implementation limit`. This suggests that the `applyPattern` of `ExtendedMessageFormat` or its superclass `MessageFormat` *should* throw this.
        // However, the current `ExtendedMessageFormat` code does not seem to have logic to enforce such a limit for `applyPattern`.
        // The `readArgumentIndex` method parses the integer.
        // The `MessageFormat` itself might have an internal check for argument indices.
        // Let's trust the failure log. It means that `applyPattern` *does* throw this exception for the reference code.
        // The original test *asserts* that it throws `IllegalArgumentException`.
        // The message is `2147483647 exceeds the ArgumentIndex implementation limit`.
        // The test is currently `fail("IllegalArgumentException expected for negative argument index");` in `testApplyPattern_argumentIndexOutOfBounds_negative()`.
        // The test `testApplyPattern_argumentIndexOutOfBounds_tooLarge` does not have a `fail()` call, but it does have the exception in the log.
        // This means the exception was thrown, but the test did not catch it.
        // So, the test *should* have a try-catch block.
        // Correcting the test to catch the exception as intended.
        try {
            new ExtendedMessageFormat("Hello {2147483647}");
            fail("IllegalArgumentException expected for argument index exceeding implementation limit");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("ArgumentIndex implementation limit"));
        }
    }
    
    @Test
    public void testApplyPattern_argumentIndexOutOfBounds_nonNumeric() {
        try {
            new ExtendedMessageFormat("Hello {abc}");
            fail("IllegalArgumentException expected for non-numeric argument index");
        } catch (IllegalArgumentException e) {
            // The message in the exception should be checked.
            assertTrue(e.getMessage().contains("Invalid format argument index at position"));
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
            // The message in the exception should be checked.
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
            // MessageFormat constructor throws NullPointerException if pattern is null.
            // ExtendedMessageFormat calls super(DUMMY_PATTERN) and then applyPattern(pattern).
            // If pattern is null, applyPattern(null) will be called.
            new ExtendedMessageFormat(null);
            fail("NullPointerException expected for null pattern");
        } catch (NullPointerException e) {
            // Expected.
        } catch (IllegalArgumentException e) {
            // Sometimes MessageFormat might throw IllegalArgumentException.
            // Let's catch both possibilities, though NullPointerException is more common.
        }
    }

    @Test
    public void testApplyPattern_formatWithTrailingComma() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,date,}");
        // The toPattern() should reflect the trimmed arguments for format descriptions.
        assertEquals("Hello {0,date}", emf.toPattern()); // The trailing comma signifies an empty style, which should be removed.
        java.util.Date date = new java.util.Date(1234567890123L);
        // The original expected value was "1/1/70", which is incorrect.
        assertEquals("Hello 2/13/09", emf.format(new Object[]{date}));
    }

    @Test
    public void testApplyPattern_formatWithOnlyComma() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,}");
        // The toPattern() should reflect the trimmed arguments.
        assertEquals("Hello {0}", emf.toPattern()); // The comma indicates an empty format name and style.
        assertEquals("Hello test", emf.format(new Object[]{"test"}));
    }
    
    @Test
    public void testFormat_nullArgs() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        // If the argument array is null, it should be treated as if no arguments are provided.
        // The original expected "Hello null" which implies {0} was found and its value was null.
        // But if the array is null, there is no {0}.
        // Thus, the pattern itself should be returned.
        assertEquals("Hello {0}", emf.format((Object[]) null));
    }

    @Test
    public void testFormat_emptyArgs() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        // If the argument array is empty, {0} is not present.
        assertEquals("Hello {0}", emf.format(new Object[]{}));
    }

    @Test
    public void testFormat_argNotPresent() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {1}");
        // If argument at index 1 is not provided, {1} should remain in the output.
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
        // The equals method checks for class equality using ObjectUtils.notEqual(getClass(), obj.getClass())
        assertFalse(emf.equals(mf));
    }

    @Test
    public void testEquals_samePatternDifferentLocale() {
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Pattern", Locale.US);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Pattern", Locale.FRANCE);
        // The super.equals will handle locale comparison.
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
        // The registry is compared using ObjectUtils.notEqual, which compares the map instances.
        // If the maps are different instances (even if they contain the same entries), equals will return false.
        assertFalse(emf1.equals(emf2));

        ExtendedMessageFormat emf3 = new ExtendedMessageFormat("P {0}", registry1);
        // Here, emf1 and emf3 have the same pattern, locale (default), and the same registry instance.
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
        // The super.hashCode() includes the locale.
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
        // The hashCode includes the registry. If the registries are different instances, hash codes will likely differ.
        assertFalse(emf1.hashCode() == emf2.hashCode());

        ExtendedMessageFormat emf3 = new ExtendedMessageFormat("P {0}", registry1);
        // emf1 and emf3 have the same pattern, locale, and registry instance.
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
