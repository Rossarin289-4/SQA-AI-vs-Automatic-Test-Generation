package org.joda.time.chrono;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

public class Time6SASelectedTest extends TestCase {

    public Time6SASelectedTest(String name) {
        super(name);
    }

public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(Time6SASelectedTest.class);
    }



    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    private static final Chronology GJ_CHRONOLOGY = GJChronology.getInstanceUTC();

    //-----------------------------------------------------------------------






    //-----------------------------------------------------------------------






    //-----------------------------------------------------------------------








    //-----------------------------------------------------------------------




    //-----------------------------------------------------------------------

        public void test_plusYears_positiveToZero_crossCutover() {
            LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY);
            LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY);
            assertEquals(expected, date.plusYears(-2003));
        }
}
