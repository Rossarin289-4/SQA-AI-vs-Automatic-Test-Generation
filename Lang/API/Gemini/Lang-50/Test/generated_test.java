package org.apache.commons.lang.time;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class FastDateFormat_Lang50Test {

    private Locale originalLocale;
    private TimeZone originalTimeZone;

    @Before
    public void setUp() {
        originalLocale = Locale.getDefault();
        originalTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
    }

    @After
    public void tearDown() {
        Locale.setDefault(originalLocale);
        TimeZone.setDefault(originalTimeZone);
    }

    @Test
    public void testDateInstanceLocaleDefaultCaching() {
        // Set default locale to US
        Locale.setDefault(Locale.US);
        FastdateFormat usInstance = FastDateFormat.getDateInstance(FastDateFormat.SHORT, (Locale) null);
        assertNotNull(usInstance);

        // Set default locale to GERMANY
        Locale.setDefault(Locale.GERMANY);
        FastDateFormat germanInstance = FastDateFormat.getDateInstance(FastDateFormat.SHORT, (Locale) null);
        assertNotNull(germanInstance);

        // In the buggy version, germanInstance retrieves the cached US instance because locale was null when key was created.
        // Therefore, usInstance and germanInstance would be the exact same cached object reference or format patterns.
        assertNotEquals("Cached date instance should not ignore default locale change when locale is null",
                usInstance, germanInstance);
    }

    @Test
    public void testDateInstanceWithNullLocaleAndDifferentDefaults() {
        Date date = new Date(1000000000000L); // Fixed point in time

        Locale.setDefault(Locale.US);
        FastDateFormat formatterUS = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, null, null);
        String formattedUS = formatterUS.format(date);

        Locale.setDefault(Locale.UK);
        FastDateFormat formatterUK = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM, null, null);
        String formattedUK = formatterUK.format(date);

        // UK and US medium date formats or locales may differ or at least the cached instances
        // must not erroneously return the US formatter when UK is the new default.
        assertNotEquals("Formatters retrieved with null locale under different default locales must differ",
                formatterUS, formatterUK);
    }
}
