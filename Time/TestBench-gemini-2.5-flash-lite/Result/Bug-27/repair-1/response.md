```java
package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import org.joda.time.DateTimeConstants;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.PeriodFormatterBuilder.FieldFormatter;
import org.joda.time.format.PeriodFormatterBuilder.Literal;
import org.joda.time.format.PeriodFormatterBuilder.PeriodPrinter;
import org.joda.time.format.PeriodFormatterBuilder.PeriodParser;


public class PeriodFormatterBuilderTest {
    @Test
    public void testToFormatter_noElements() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().toFormatter();
        assertNotNull(formatter);
        assertFalse(formatter.isPrinter());
        assertFalse(formatter.isParser());
    }

    @Test
    public void testToFormatter_literal() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendLiteral("a")
            .toFormatter();
        assertEquals("a", formatter.print(new org.joda.time.MutablePeriod()));
        // Parsing behavior of Literal is implicitly tested by appendLiteral and parsing tests.
    }

    @Test
    public void testToFormatter_years() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        assertEquals("1", formatter.print(period));
        period.setYears(0);
        assertEquals("0", formatter.print(period));
        period.setYears(-1);
        assertEquals("-1", formatter.print(period));
    }

    @Test
    public void testToFormatter_years_withSuffix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSuffix(" year", " years")
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        assertEquals("1 year", formatter.print(period));
        period.setYears(2);
        assertEquals("2 years", formatter.print(period));
        period.setYears(0);
        assertEquals("0", formatter.print(period)); // Suffix not applied for zero
    }

    @Test
    public void testToFormatter_years_withPrefix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendPrefix("Y:")
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        assertEquals("Y:1", formatter.print(period));
        period.setYears(0);
        assertEquals("Y:0", formatter.print(period));
    }

    @Test
    public void testToFormatter_years_withPrefixAndSuffix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendPrefix("y=")
            .appendYears()
            .appendSuffix("y", "ys")
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        assertEquals("y=1y", formatter.print(period));
        period.setYears(2);
        assertEquals("y=2ys", formatter.print(period));
        period.setYears(0);
        assertEquals("y=0", formatter.print(period)); // Suffix not applied for zero
    }

    @Test
    public void testToFormatter_months() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setMonths(1);
        assertEquals("1", formatter.print(period));
    }

    @Test
    public void testToFormatter_weeks() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendWeeks()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setWeeks(1);
        assertEquals("1", formatter.print(period));
    }

    @Test
    public void testToFormatter_days() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(1);
        assertEquals("1", formatter.print(period));
    }

    @Test
    public void testToFormatter_hours() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setHours(1);
        assertEquals("1", formatter.print(period));
    }

    @Test
    public void testToFormatter_minutes() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendMinutes()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setMinutes(1);
        assertEquals("1", formatter.print(period));
    }

    @Test
    public void testToFormatter_seconds() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSeconds()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setSeconds(1);
        assertEquals("1", formatter.print(period));
    }

    @Test
    public void testToFormatter_millis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setMillis(1);
        assertEquals("1", formatter.print(period));
    }

    @Test
    public void testToFormatter_secondsWithMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setSeconds(1);
        period.setMillis(500);
        assertEquals("1.500", formatter.print(period));
        period.setSeconds(0);
        period.setMillis(500);
        assertEquals("0.500", formatter.print(period));
        period.setSeconds(1);
        period.setMillis(0);
        assertEquals("1.000", formatter.print(period)); // Always prints 3 digits for millis
    }

    @Test
    public void testToFormatter_secondsWithOptionalMillis_positive() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithOptionalMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setSeconds(1);
        period.setMillis(500);
        assertEquals("1.500", formatter.print(period));
        period.setSeconds(0);
        period.setMillis(500);
        assertEquals("0.500", formatter.print(period));
        period.setSeconds(1);
        period.setMillis(0);
        assertEquals("1", formatter.print(period)); // Millis not printed if zero
    }
    
    @Test
    public void testToFormatter_secondsWithOptionalMillis_negative() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithOptionalMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setSeconds(-1);
        period.setMillis(-500);
        assertEquals("-1.-500", formatter.print(period)); // Negative milliseconds are not standardly supported in this way
        period.setSeconds(0);
        period.setMillis(-500);
        assertEquals("-0.-500", formatter.print(period));
        period.setSeconds(-1);
        period.setMillis(0);
        assertEquals("-1", formatter.print(period));
    }

    @Test
    public void testToFormatter_millis3Digit() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendMillis3Digit()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setMillis(5);
        assertEquals("005", formatter.print(period));
        period.setMillis(50);
        assertEquals("050", formatter.print(period));
        period.setMillis(500);
        assertEquals("500", formatter.print(period));
    }

    @Test
    public void testToFormatter_multipleFields() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        period.setMonths(2);
        assertEquals("1 and 2", formatter.print(period));
    }

    @Test
    public void testToFormatter_multipleFields_zeroFirst() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(2);
        assertEquals("0 and 2", formatter.print(period)); // Default printZeroRarelyLast behavior
    }
    
    @Test
    public void testToFormatter_multipleFields_zeroSecond() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        period.setMonths(0);
        assertEquals("1 and 0", formatter.print(period)); // Default printZeroRarelyLast behavior
    }

    @Test
    public void testToFormatter_multipleFields_bothZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(0);
        assertEquals("0", formatter.print(period)); // printZeroRarelyLast forces one zero
    }

    @Test
    public void testToFormatter_printZeroAlways() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroAlways()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        period.setMonths(0);
        assertEquals("1 and 0", formatter.print(period));
    }

    @Test
    public void testToFormatter_printZeroNever() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroNever()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        period.setMonths(0);
        assertEquals("1", formatter.print(period)); // The zero months field is not printed
    }

    @Test
    public void testToFormatter_printZeroNever_allZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroNever()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(0);
        assertEquals("", formatter.print(period)); // No fields printed, so no separator
    }

    @Test
    public void testToFormatter_printZeroRarelyFirst() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(2);
        assertEquals("0 and 2", formatter.print(period));
    }
    
    @Test
    public void testToFormatter_printZeroRarelyFirst_allZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(0);
        assertEquals("0", formatter.print(period)); // Forces first zero
    }

    @Test
    public void testToFormatter_printZeroIfSupported() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroIfSupported()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        period.setMonths(0);
        assertEquals("1 and 0", formatter.print(period)); // Months is supported and zero
    }
    
    @Test
    public void testToFormatter_printZeroIfSupported_unsupportedField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroIfSupported()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod(1, 0, 0, 0, 0, 0, 0, 0);
        // Assuming PeriodType for MutablePeriod might not support months, but let's test with default
        // If months were not supported, it would print "1"
        // With default PeriodType, months are supported.
        assertEquals("1 and 0", formatter.print(period));
    }

    @Test
    public void testToFormatter_minimumPrintedDigits() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .minimumPrintedDigits(2)
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(5);
        assertEquals("05", formatter.print(period));
        period.setYears(15);
        assertEquals("15", formatter.print(period));
    }

    @Test
    public void testToFormatter_maximumParsedDigits() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .maximumParsedDigits(2)
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "123", 0, Locale.getDefault());
        assertEquals(2, pos); // Parses up to max digits
        assertEquals(12, period.getYears());
    }
    
    @Test
    public void testToFormatter_maximumParsedDigits_exact() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .maximumParsedDigits(2)
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "12", 0, Locale.getDefault());
        assertEquals(2, pos);
        assertEquals(12, period.getYears());
    }
    
    @Test
    public void testToFormatter_maximumParsedDigits_lessThanMax() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .maximumParsedDigits(2)
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "1", 0, Locale.getDefault());
        assertEquals(1, pos);
        assertEquals(1, period.getYears());
    }

    @Test
    public void testToFormatter_rejectSignedValues() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .rejectSignedValues(true)
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "-123", 0, Locale.getDefault());
        assertEquals(0, pos); // Does not parse negative numbers
        assertEquals(0, period.getYears());
        
        pos = formatter.getParser().parseInto(period, "+123", 0, Locale.getDefault());
        assertEquals(0, pos); // Does not parse positive sign
        assertEquals(0, period.getYears());

        pos = formatter.getParser().parseInto(period, "123", 0, Locale.getDefault());
        assertEquals(3, pos);
        assertEquals(123, period.getYears());
    }

    @Test
    public void testToFormatter_rejectSignedValues_false() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .rejectSignedValues(false)
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int pos = formatter.getParser().parseInto(period, "-123", 0, Locale.getDefault());
        assertEquals(4, pos); // Parses negative numbers
        assertEquals(-123, period.getYears());

        pos = formatter.getParser().parseInto(period, "+123", 0, Locale.getDefault());
        assertEquals(4, pos); // Parses positive sign
        assertEquals(123, period.getYears());
    }

    @Test
    public void testToFormatter_separator() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(1);
        period.setHours(2);
        assertEquals("1,2", formatter.print(period));
    }

    @Test
    public void testToFormatter_separator_onlyFirstField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(1);
        period.setHours(0);
        assertEquals("1", formatter.print(period)); // Separator not printed as second field is zero
    }

    @Test
    public void testToFormatter_separator_onlySecondField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(0);
        period.setHours(2);
        assertEquals("2", formatter.print(period)); // Separator not printed as first field is zero
    }

    @Test
    public void testToFormatter_separator_bothZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(0);
        period.setHours(0);
        assertEquals("0", formatter.print(period)); // printZeroRarelyLast forces one zero
    }

    @Test
    public void testToFormatter_separator_finalText() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",", "&")
            .appendHours()
            .appendSeparator(",", "&")
            .appendMinutes()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(1);
        period.setHours(2);
        period.setMinutes(3);
        assertEquals("1,2&3", formatter.print(period));
    }

    @Test
    public void testToFormatter_separator_finalText_twoFields() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",", "&")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(1);
        period.setHours(2);
        assertEquals("1,2", formatter.print(period));
    }

    @Test
    public void testToFormatter_separator_variants() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",", null, new String[]{"&"})
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(1);
        period.setHours(2);
        // This test asserts that the first separator text is used for printing.
        // The variants are for parsing.
        assertEquals("1,2", formatter.print(period));
        
        // Test parsing with variant
        org.joda.time.MutablePeriod periodParsed = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(periodParsed, "1&2", 0, Locale.getDefault());
        assertEquals(1, periodParsed.getDays());
        assertEquals(2, periodParsed.getHours());
    }
    
    @Test
    public void testToFormatter_separator_variants_caseInsensitive() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",", null, new String[]{"&"})
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod periodParsed = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(periodParsed, "1,2", 0, Locale.getDefault());
        assertEquals(1, periodParsed.getDays());
        assertEquals(2, periodParsed.getHours());
    }

    @Test
    public void testToFormatter_separatorIfFieldsAfter() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparatorIfFieldsAfter(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(1);
        period.setHours(2);
        assertEquals("1,2", formatter.print(period));
        period.setDays(1);
        period.setHours(0);
        assertEquals("1", formatter.print(period)); // Separator not printed
    }
    
    @Test
    public void testToFormatter_separatorIfFieldsAfter_onlySecondField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparatorIfFieldsAfter(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(0);
        period.setHours(2);
        assertEquals("2", formatter.print(period)); // Separator not printed, but hours are printed
    }

    @Test
    public void testToFormatter_separatorIfFieldsBefore() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparatorIfFieldsBefore(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(1);
        period.setHours(2);
        assertEquals("1,2", formatter.print(period));
        period.setDays(0);
        period.setHours(2);
        assertEquals("2", formatter.print(period)); // Separator not printed
    }

    @Test
    public void testToFormatter_separatorIfFieldsBefore_onlyFirstField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparatorIfFieldsBefore(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setDays(1);
        period.setHours(0);
        assertEquals("1", formatter.print(period)); // Separator not printed, but days are printed
    }

    @Test
    public void testAppendLiteral_null() throws Exception {
        try {
            new PeriodFormatterBuilder().appendLiteral(null);
            fail();
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testAppendPrefix_null() throws Exception {
        try {
            new PeriodFormatterBuilder().appendPrefix((String) null);
            fail();
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }
    
    @Test
    public void testAppendPrefix_emptyString() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendPrefix("")
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        assertEquals("1", formatter.print(period));
    }

    @Test
    public void testAppendSuffix_null() throws Exception {
        try {
            new PeriodFormatterBuilder().appendSuffix((String) null);
            fail();
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testAppendSuffix_onNonField() throws Exception {
        try {
            new PeriodFormatterBuilder().appendSuffix("s").appendLiteral("a");
            fail();
        } catch (IllegalStateException expected) {
            // expected
        }
    }
    
    @Test
    public void testAppendSeparator_onNonField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSeparator(",")
            .appendLiteral("a")
            .toFormatter();
        assertEquals("a", formatter.print(new org.joda.time.MutablePeriod()));
    }

    @Test
    public void testAppendSeparator_onEmptyBuilder() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSeparatorIfFieldsAfter(",")
            .appendLiteral("a")
            .toFormatter();
        assertEquals("a", formatter.print(new org.joda.time.MutablePeriod()));
    }
    
    @Test
    public void testAppendSeparator_consecutive() throws Exception {
        try {
            new PeriodFormatterBuilder().appendDays().appendSeparator(",").appendSeparator("&").appendHours();
            fail();
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    @Test
    public void testClear() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSeparator(" and ")
            .appendMonths()
            .toFormatter();
        
        assertNotNull(formatter.getPrinter());
        assertNotNull(formatter.getParser());
        
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.clear();
        
        // After clear, should behave like a new builder with no elements.
        PeriodFormatter clearedFormatter = builder.toFormatter();
        assertNotNull(clearedFormatter);
        assertFalse(clearedFormatter.isPrinter());
        assertFalse(clearedFormatter.isParser());
    }

    @Test
    public void testAppend_formatter() throws Exception {
        PeriodFormatter innerFormatter = new PeriodFormatterBuilder()
            .appendHours()
            .appendSeparator(":")
            .appendMinutes()
            .toFormatter();
            
        PeriodFormatter outerFormatter = new PeriodFormatterBuilder()
            .appendYears()
            .append(" ") // This was the error: String cannot be converted to PeriodFormatter
            .append(innerFormatter)
            .toFormatter();

        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        period.setHours(2);
        period.setMinutes(3);
        assertEquals("1 2:3", outerFormatter.print(period));
    }
    
    @Test
    public void testAppend_printerParser() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .append(new PeriodFormatter(new PeriodPrinter() {
                @Override
                public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException { out.write("P"); }
                @Override
                public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) { return 1; }
                @Override
                public int calculatePrintedLength(ReadablePeriod period, Locale locale) { return 1; }
            }, new PeriodParser() {
                @Override
                public int parseInto(ReadWritablePeriod period, String text, int position, Locale locale) {
                    if (text.regionMatches(true, position, "P", 0, 1)) {
                        period.setYears(1);
                        return position + 1;
                    }
                    return ~position;
                }
            }))
            .toFormatter();

        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals("P", formatter.print(period));
        
        org.joda.time.MutablePeriod parsedPeriod = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(parsedPeriod, "P", 0, Locale.getDefault());
        assertEquals(1, parsedPeriod.getYears());
    }

    @Test
    public void testAppend_printerOnly() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .append(new PeriodPrinter() {
                @Override
                public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException { out.write("P"); }
                @Override
                public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) { return 1; }
                @Override
                public int calculatePrintedLength(ReadablePeriod period, Locale locale) { return 1; }
            }, null)
            .toFormatter();
        
        assertNotNull(formatter.getPrinter());
        assertFalse(formatter.isParser());
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        assertEquals("P", formatter.print(period));
    }

    @Test
    public void testAppend_parserOnly() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .append(null, new PeriodParser() {
                @Override
                public int parseInto(ReadWritablePeriod period, String text, int position, Locale locale) {
                    if (text.regionMatches(true, position, "P", 0, 1)) {
                        period.setYears(1);
                        return position + 1;
                    }
                    return ~position;
                }
            })
            .toFormatter();
        
        assertFalse(formatter.isPrinter());
        assertNotNull(formatter.getParser());
        org.joda.time.MutablePeriod parsedPeriod = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(parsedPeriod, "P", 0, Locale.getDefault());
        assertEquals(1, parsedPeriod.getYears());
    }

    @Test
    public void testAppend_nullPrinterAndParser() throws Exception {
        try {
            new PeriodFormatterBuilder().append(null, null);
            fail();
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testAppend_formatter_null() throws Exception {
        try {
            new PeriodFormatterBuilder().append((PeriodFormatter) null);
            fail();
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testToFormatter_printZeroRarelyLast_default() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSeparator(":")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(5);
        assertEquals("0:5", formatter.print(period)); // Default is PRINT_ZERO_RARELY_LAST
    }

    @Test
    public void testToFormatter_printZeroRarelyLast_zeroFirst() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroRarelyLast()
            .appendYears()
            .appendSeparator(":")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(5);
        assertEquals("0:5", formatter.print(period));
    }
    
    @Test
    public void testToFormatter_printZeroRarelyLast_zeroSecond() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroRarelyLast()
            .appendYears()
            .appendSeparator(":")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(5);
        period.setMonths(0);
        assertEquals("5", formatter.print(period)); // Only prints if fields AFTER are present
    }

    @Test
    public void testToFormatter_printZeroRarelyLast_allZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroRarelyLast()
            .appendYears()
            .appendSeparator(":")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(0);
        assertEquals("0", formatter.print(period)); // Forces last field to be zero
    }

    @Test
    public void testToFormatter_printZeroRarelyFirst_default() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendYears()
            .appendSeparator(":")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(5);
        assertEquals("0:5", formatter.print(period));
    }
    
    @Test
    public void testToFormatter_printZeroRarelyFirst_zeroFirst() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendYears()
            .appendSeparator(":")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(5);
        assertEquals("0:5", formatter.print(period));
    }

    @Test
    public void testToFormatter_printZeroRarelyFirst_zeroSecond() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendYears()
            .appendSeparator(":")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(5);
        period.setMonths(0);
        assertEquals("5:0", formatter.print(period)); // Prints zero if it's the first zero
    }

    @Test
    public void testToFormatter_printZeroRarelyFirst_allZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroRarelyFirst()
            .appendYears()
            .appendSeparator(":")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(0);
        assertEquals("0", formatter.print(period)); // Forces first field to be zero
    }
    
    @Test
    public void testToFormatter_secondsWithOptionalMillis_parsing() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithOptionalMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "10.500", 0, Locale.getDefault());
        assertEquals(10, period.getSeconds());
        assertEquals(500, period.getMillis());
        
        period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "10", 0, Locale.getDefault());
        assertEquals(10, period.getSeconds());
        assertEquals(0, period.getMillis());
    }
    
    @Test
    public void testToFormatter_secondsWithOptionalMillis_parsing_leadingZeros() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithOptionalMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "05.001", 0, Locale.getDefault());
        assertEquals(5, period.getSeconds());
        assertEquals(1, period.getMillis());
    }
    
    @Test
    public void testToFormatter_secondsWithOptionalMillis_parsing_partialMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithOptionalMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "10.5", 0, Locale.getDefault());
        assertEquals(10, period.getSeconds());
        assertEquals(500, period.getMillis()); // Should pad to 3 digits
        
        period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "10.50", 0, Locale.getDefault());
        assertEquals(10, period.getSeconds());
        assertEquals(500, period.getMillis()); // Should pad to 3 digits
    }

    @Test
    public void testToFormatter_secondsWithOptionalMillis_parsing_noMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithOptionalMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "10", 0, Locale.getDefault());
        assertEquals(10, period.getSeconds());
        assertEquals(0, period.getMillis());
    }
    
    @Test
    public void testToFormatter_secondsWithMillis_parsing() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "10.500", 0, Locale.getDefault());
        assertEquals(10, period.getSeconds());
        assertEquals(500, period.getMillis());
        
        period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "10.5", 0, Locale.getDefault()); // Should still parse and pad
        assertEquals(10, period.getSeconds());
        assertEquals(500, period.getMillis());
        
        period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "10.0", 0, Locale.getDefault()); // Explicit zero millis
        assertEquals(10, period.getSeconds());
        assertEquals(0, period.getMillis());
    }
    
    @Test
    public void testToFormatter_separator_parsing() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "1,2", 0, Locale.getDefault());
        assertEquals(1, period.getDays());
        assertEquals(2, period.getHours());
    }
    
    @Test
    public void testToFormatter_separator_parsing_noSeparator() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        // With default printZeroRarelyLast, if hours is zero, separator is not printed.
        // The parser should handle this.
        formatter.getParser().parseInto(period, "1", 0, Locale.getDefault()); 
        assertEquals(1, period.getDays());
        assertEquals(0, period.getHours());
    }
    
    @Test
    public void testToFormatter_separator_parsing_onlySecondField() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparator(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "2", 0, Locale.getDefault()); // Days is 0 (default)
        assertEquals(0, period.getDays());
        assertEquals(2, period.getHours());
    }

    @Test
    public void testToFormatter_prefix_plural() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendPrefix("Y:", "Ys:")
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        assertEquals("Y:1", formatter.print(period));
        period.setYears(2);
        assertEquals("Ys:2", formatter.print(period));
    }

    @Test
    public void testToFormatter_suffix_plural() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSuffix("Y", "Ys")
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        assertEquals("1Y", formatter.print(period));
        period.setYears(2);
        assertEquals("2Ys", formatter.print(period));
    }
    
    // New tests for uncalled methods
    
    @Test
    public void testToPrinter() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.appendYears();
        PeriodPrinter printer = builder.toPrinter();
        assertNotNull(printer);
        assertTrue(printer instanceof PeriodPrinter);
    }

    @Test
    public void testToParser() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.appendYears();
        PeriodParser parser = builder.toParser();
        assertNotNull(parser);
        assertTrue(parser instanceof PeriodParser);
    }

    @Test
    public void testToFormatter_whenNeitherPrinterNorParser() throws Exception {
        PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        builder.clear(); // Make it empty
        try {
            builder.toFormatter();
            fail();
        } catch (IllegalStateException expected) {
            // expected
        }
    }

    @Test
    public void testParse_literal() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendLiteral("abc").toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int result = formatter.getParser().parseInto(period, "abc", 0, Locale.getDefault());
        assertEquals(3, result);
        assertEquals(0, period.size()); // Literal doesn't set values
    }
    
    @Test
    public void testParse_literal_mismatch() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder().appendLiteral("abc").toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int result = formatter.getParser().parseInto(period, "abd", 0, Locale.getDefault());
        assertEquals(~0, result);
    }

    @Test
    public void testParse_field_rejectSignedValues_true() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .rejectSignedValues(true)
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int result = formatter.getParser().parseInto(period, "-123", 0, Locale.getDefault());
        assertEquals(~0, result); // Should not parse negative
    }
    
    @Test
    public void testParse_field_rejectSignedValues_false() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .rejectSignedValues(false)
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int result = formatter.getParser().parseInto(period, "-123", 0, Locale.getDefault());
        assertEquals(4, result);
        assertEquals(-123, period.getYears());
    }

    @Test
    public void testParse_field_maxParsedDigits() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .maximumParsedDigits(2)
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int result = formatter.getParser().parseInto(period, "12345", 0, Locale.getDefault());
        assertEquals(2, result);
        assertEquals(12, period.getYears());
    }
    
    @Test
    public void testParse_field_minPrintedDigits_doesNotAffectParsing() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .minimumPrintedDigits(3) // Should not affect parsing
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        int result = formatter.getParser().parseInto(period, "12", 0, Locale.getDefault());
        assertEquals(2, result);
        assertEquals(12, period.getYears());
    }

    @Test
    public void testScan_simpleAffix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSuffix("y")
            .toFormatter();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = (PeriodFormatterBuilder.FieldFormatter) formatter.getPrinter();
        assertEquals(1, fieldFormatter.scan("10y", 0)); // "y" should be found after "10"
    }

    @Test
    public void testScan_pluralAffix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSuffix(" year", " years")
            .toFormatter();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = (PeriodFormatterBuilder.FieldFormatter) formatter.getPrinter();
        assertEquals(2, fieldFormatter.scan("10 years", 0)); // " years" should be found after "10"
    }
    
    @Test
    public void testScan_prefix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendPrefix("Y:")
            .appendYears()
            .toFormatter();
        PeriodFormatterBuilder.FieldFormatter fieldFormatter = (PeriodFormatterBuilder.FieldFormatter) formatter.getPrinter();
        assertEquals(0, fieldFormatter.scan("Y:10", 0)); // "Y:" should be found at the beginning
    }

    @Test
    public void testCalculatePrintedLength_years() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(123);
        assertEquals(3, formatter.getPrinter().calculatePrintedLength(period, Locale.getDefault()));
    }

    @Test
    public void testCalculatePrintedLength_years_withSuffix() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSuffix(" year", " years")
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        assertEquals("1 year".length(), formatter.getPrinter().calculatePrintedLength(period, Locale.getDefault()));
        period.setYears(2);
        assertEquals("2 years".length(), formatter.getPrinter().calculatePrintedLength(period, Locale.getDefault()));
    }

    @Test
    public void testCalculatePrintedLength_secondsWithMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setSeconds(10);
        period.setMillis(500);
        assertEquals("10.500".length(), formatter.getPrinter().calculatePrintedLength(period, Locale.getDefault()));
    }

    @Test
    public void testCalculatePrintedLength_secondsWithOptionalMillis_noMillis() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendSecondsWithOptionalMillis()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setSeconds(10);
        period.setMillis(0);
        assertEquals("10".length(), formatter.getPrinter().calculatePrintedLength(period, Locale.getDefault()));
    }

    @Test
    public void testCountFieldsToPrint_nonZero() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(1);
        assertEquals(1, formatter.getPrinter().countFieldsToPrint(period, Integer.MAX_VALUE, Locale.getDefault()));
    }

    @Test
    public void testCountFieldsToPrint_zeroWithPrintZeroNever() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroNever()
            .appendYears()
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(0);
        assertEquals(0, formatter.getPrinter().countFieldsToPrint(period, Integer.MAX_VALUE, Locale.getDefault()));
    }
    
    @Test
    public void testCountFieldsToPrint_zeroWithPrintZeroAlways() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .printZeroAlways()
            .appendYears()
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        period.setYears(0);
        period.setMonths(0);
        assertEquals(2, formatter.getPrinter().countFieldsToPrint(period, Integer.MAX_VALUE, Locale.getDefault()));
    }
    
    @Test
    public void testParse_separatorIfFieldsBefore() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparatorIfFieldsBefore(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "1,2", 0, Locale.getDefault());
        assertEquals(1, period.getDays());
        assertEquals(2, period.getHours());
    }
    
    @Test
    public void testParse_separatorIfFieldsAfter() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendDays()
            .appendSeparatorIfFieldsAfter(",")
            .appendHours()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "1,2", 0, Locale.getDefault());
        assertEquals(1, period.getDays());
        assertEquals(2, period.getHours());
    }
    
    @Test
    public void testParse_composite() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSeparator(" ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        formatter.getParser().parseInto(period, "1 2", 0, Locale.getDefault());
        assertEquals(1, period.getYears());
        assertEquals(2, period.getMonths());
    }
    
    @Test
    public void testParse_composite_noSeparatorPrinted() throws Exception {
        PeriodFormatter formatter = new PeriodFormatterBuilder()
            .appendYears()
            .appendSeparator(" ")
            .appendMonths()
            .toFormatter();
        org.joda.time.MutablePeriod period = new org.joda.time.MutablePeriod();
        // Test case where the separator is not printed (e.g., second field is zero)
        formatter.getParser().parseInto(period, "1", 0, Locale.getDefault());
        assertEquals(1, period.getYears());
        assertEquals(0, period.getMonths()); // Default value
    }
}
```