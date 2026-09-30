package org.joda.time;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.DateTimeZoneBuilder;

public class Time26SASelectedTest extends TestCase {

    public Time26SASelectedTest(String name) {
        super(name);
    }

public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(Time26SASelectedTest.class);
    }



    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    // The behaviour of getOffsetFromLocal is defined in its javadoc
    // However, this definition doesn't work for all DateTimeField operations
    
    /** Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01 */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    //-----------------------------------------------------------------------




    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {
        DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        assertEquals(res.toString(), expected, res.toString());
    }





































    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------




    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {
        DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        assertEquals(res.toString(), expected, res.toString());
    }







































    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /** America/New_York cutover from 01:59 to 03:00 on 2007-03-11 */
    private static long CUTOVER_NEW_YORK_SPRING = 1173596400000L;  // 2007-03-11T03:00:00.000-04:00
    private static final DateTimeZone ZONE_NEW_YORK = DateTimeZone.forID("America/New_York");
//  DateTime x = new DateTime(2007, 1, 1, 0, 0, 0, 0, ZONE_NEW_YORK);
//  System.out.println(ZONE_NEW_YORK.nextTransition(x.getMillis()));
//  DateTime y = new DateTime(ZONE_NEW_YORK.nextTransition(x.getMillis()), ZONE_NEW_YORK);
//  System.out.println(y);

    //-----------------------------------------------------------------------










    //-----------------------------------------------------------------------












    //-----------------------------------------------------------------------












    //-----------------------------------------------------------------------
    /** America/New_York cutover from 01:59 to 01:00 on 2007-11-04 */
    private static long CUTOVER_NEW_YORK_AUTUMN = 1194156000000L;  // 2007-11-04T01:00:00.000-05:00

    //-----------------------------------------------------------------------








    //-----------------------------------------------------------------------
















    //-----------------------------------------------------------------------
















    //-----------------------------------------------------------------------
    /** Europe/Moscow cutover from 01:59 to 03:00 on 2007-03-25 */
    private static long CUTOVER_MOSCOW_SPRING = 1174777200000L;  // 2007-03-25T03:00:00.000+04:00
    private static final DateTimeZone ZONE_MOSCOW = DateTimeZone.forID("Europe/Moscow");

    //-----------------------------------------------------------------------










    //-----------------------------------------------------------------------
    /** America/New_York cutover from 02:59 to 02:00 on 2007-10-28 */
    private static long CUTOVER_MOSCOW_AUTUMN = 1193526000000L;  // 2007-10-28T02:00:00.000+03:00

    //-----------------------------------------------------------------------


    // broken, and getOffsetFromLocal has no obvious way to determine which is correct
//    public void test_getOffsetFromLocal_Moscow_Autumn() {
//        doTest_getOffsetFromLocal(10, 28, 0, 0, "2007-10-28T00:00:00.000+04:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 0,30, "2007-10-28T00:30:00.000+04:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 1, 0, "2007-10-28T01:00:00.000+04:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 1,30, "2007-10-28T01:30:00.000+04:00", ZONE_MOSCOW);
//        
//        doTest_getOffsetFromLocal(10, 28, 2, 0, "2007-10-28T02:00:00.000+04:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 2,30, "2007-10-28T02:30:00.000+04:00", ZONE_MOSCOW);
//        
//        doTest_getOffsetFromLocal(10, 28, 3, 0, "2007-10-28T03:00:00.000+03:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 3,30, "2007-10-28T03:30:00.000+03:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 4, 0, "2007-10-28T04:00:00.000+03:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 5, 0, "2007-10-28T05:00:00.000+03:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 6, 0, "2007-10-28T06:00:00.000+03:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 7, 0, "2007-10-28T07:00:00.000+03:00", ZONE_MOSCOW);
//        doTest_getOffsetFromLocal(10, 28, 8, 0, "2007-10-28T08:00:00.000+03:00", ZONE_MOSCOW);
//    }





    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /** America/Guatemala cutover from 23:59 to 23:00 on 2006-09-30 */
    private static long CUTOVER_GUATEMALA_AUTUMN = 1159678800000L; // 2006-09-30T23:00:00.000-06:00
    private static final DateTimeZone ZONE_GUATEMALA = DateTimeZone.forID("America/Guatemala");

    //-----------------------------------------------------------------------








    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------



//    public void test_toDateMidnight_SaoPaolo() {
//        // RFE: 1684259
//        DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo");
//        LocalDate baseDate = new LocalDate(2006, 11, 5);
//        DateMidnight dm = baseDate.toDateMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dm.toString());
//        DateTime dt = baseDate.toDateTimeAtMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dt.toString());
//    }

    //-----------------------------------------------------------------------
    private static final DateTimeZone ZONE_PARIS = DateTimeZone.forID("Europe/Paris");



























    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min,
                                           String expected, DateTimeZone zone)
    {
        doTest_getOffsetFromLocal(2007, month, day, hour, min, expected, zone);
    }

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min,
                                           String expected, DateTimeZone zone)
    {
        DateTime dt = new DateTime(year, month, day, hour, min, 0, 0, DateTimeZone.UTC);
        int offset = zone.getOffsetFromLocal(dt.getMillis());
        DateTime res = new DateTime(dt.getMillis() - offset, zone);
        assertEquals(res.toString(), expected, res.toString());
    }

        public void test_DateTime_minusHour_Guatemata_Autumn() {
            DateTime dt = new DateTime(2006, 10, 1, 2, 0, 0, 0, ZONE_GUATEMALA);
            assertEquals("2006-10-01T02:00:00.000-06:00", dt.toString());

            DateTime minus1 = dt.minusHours(1);
            assertEquals("2006-10-01T01:00:00.000-06:00", minus1.toString());
            DateTime minus2 = dt.minusHours(2);
            assertEquals("2006-10-01T00:00:00.000-06:00", minus2.toString());
            DateTime minus3 = dt.minusHours(3);
            assertEquals("2006-09-30T23:00:00.000-06:00", minus3.toString());
            DateTime minus4 = dt.minusHours(4);
            assertEquals("2006-09-30T23:00:00.000-05:00", minus4.toString());
            DateTime minus5 = dt.minusHours(5);
            assertEquals("2006-09-30T22:00:00.000-05:00", minus5.toString());
            DateTime minus6 = dt.minusHours(6);
            assertEquals("2006-09-30T21:00:00.000-05:00", minus6.toString());
            DateTime minus7 = dt.minusHours(7);
            assertEquals("2006-09-30T20:00:00.000-05:00", minus7.toString());
        }
}
