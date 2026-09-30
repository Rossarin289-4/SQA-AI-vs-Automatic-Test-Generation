package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

public class Time22SASelectedTest extends TestCase {

    public Time22SASelectedTest(String name) {
        super(name);
    }

// Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(Time22SASelectedTest.class);
    }



    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------








    //-----------------------------------------------------------------------








    //-----------------------------------------------------------------------






    //-----------------------------------------------------------------------








    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */


    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */


    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */






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
    /**
     * Test constructor (Object)
     */








    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */








    //-----------------------------------------------------------------------
















    //-----------------------------------------------------------------------

        public void testParse_noFormatter() throws Throwable {
            assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 890), Period.parse("P1Y2M3W4DT5H6M7.890S"));
        }
}
