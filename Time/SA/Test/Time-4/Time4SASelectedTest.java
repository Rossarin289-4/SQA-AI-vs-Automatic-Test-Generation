package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Time4SASelectedTest extends TestCase {

    public Time4SASelectedTest(String name) {
        super(name);
    }

private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(Time4SASelectedTest.class);
    }



    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------

    
    //-----------------------------------------------------------------------

    
    //-----------------------------------------------------------------------

    
    //-----------------------------------------------------------------------






    //-----------------------------------------------------------------------












        

        

        



    //-----------------------------------------------------------------------










    //-----------------------------------------------------------------------








    //-----------------------------------------------------------------------
















    //-----------------------------------------------------------------------
















    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------




    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------






    //-----------------------------------------------------------------------










    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------
    private Partial createHourMinPartial() {
        return createHourMinPartial(ISO_UTC);
    }

    private Partial createHourMinPartial(Chronology chrono) {
        return createHourMinPartial(10, 20, chrono);
    }

    private Partial createHourMinPartial2(Chronology chrono) {
        return createHourMinPartial(15, 20, chrono);
    }

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {
        return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }

    private Partial createTODPartial(Chronology chrono) {
        return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }

    private void check(Partial test, int hour, int min) {
        assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }

        public void testWithChronologyRetainFields_nullChrono() {
            Partial base = createHourMinPartial(COPTIC_PARIS);
            Partial test = base.withChronologyRetainFields(null);
            check(base, 10, 20);
            assertEquals(COPTIC_UTC, base.getChronology());
            check(test, 10, 20);
            assertEquals(ISO_UTC, test.getChronology());
        }
}
