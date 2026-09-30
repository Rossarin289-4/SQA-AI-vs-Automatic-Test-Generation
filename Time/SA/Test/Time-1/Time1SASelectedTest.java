package org.joda.time;

import java.util.Arrays;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

public class Time1SASelectedTest extends TestCase {

    public Time1SASelectedTest(String name) {
        super(name);
    }

private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(Time1SASelectedTest.class);
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
    /**
     * Test constructor
     */


    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */


    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */


    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */


    /**
     * Test constructor
     */


    //-----------------------------------------------------------------------
    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str  the string to check
     */
    private void assertMessageContains(Exception ex, String str) {
        assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }

    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str1  the string to check
     * @param str2  the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {
        assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
            ex.getMessage().indexOf(str1) >= 0 &&
            ex.getMessage().indexOf(str2) >= 0 &&
            ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }

        public void testConstructor_TypeArray_intArray_Chrono() throws Throwable {
            DateTimeFieldType[] types = new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.dayOfYear()
            };
            int[] values = new int[] {2005, 33};
            Partial test = new Partial(types, values, GREGORIAN_PARIS);
            assertEquals(GREGORIAN_UTC, test.getChronology());
            assertEquals(2, test.size());
            assertEquals(2005, test.getValue(0));
            assertEquals(2005, test.get(DateTimeFieldType.year()));
            assertEquals(true, test.isSupported(DateTimeFieldType.year()));
            assertEquals(33, test.getValue(1));
            assertEquals(33, test.get(DateTimeFieldType.dayOfYear()));
            assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
            assertEquals(true, Arrays.equals(test.getFieldTypes(), types));
            assertEquals(true, Arrays.equals(test.getValues(), values));
        }
}
