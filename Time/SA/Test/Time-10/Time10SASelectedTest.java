package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Time10SASelectedTest extends TestCase {

    public Time10SASelectedTest(String name) {
        super(name);
    }

// Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(Time10SASelectedTest.class);
    }



    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-------------------------------------------------------------------------






    //-------------------------------------------------------------------------




    //-----------------------------------------------------------------------






    //-----------------------------------------------------------------------




    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------














    //-----------------------------------------------------------------------

        public void testFactory_monthsBetween_RPartial_MonthDay() {
            MonthDay start = new MonthDay(2, 1);
            MonthDay end1 = new MonthDay(2, 28);
            MonthDay end2 = new MonthDay(2, 29);
            MonthDay end3 = new MonthDay(3, 1);

            assertEquals(0, Months.monthsBetween(start, end1).getMonths());
            assertEquals(0, Months.monthsBetween(start, end2).getMonths());
            assertEquals(1, Months.monthsBetween(start, end3).getMonths());

            assertEquals(0, Months.monthsBetween(end1, start).getMonths());
            assertEquals(0, Months.monthsBetween(end2, start).getMonths());
            assertEquals(-1, Months.monthsBetween(end3, start).getMonths());
        }
}
