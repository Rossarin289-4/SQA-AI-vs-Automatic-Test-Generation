package org.joda.time.field;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Time15SASelectedTest extends TestCase {

    public Time15SASelectedTest(String name) {
        super(name);
    }

public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(Time15SASelectedTest.class);
    }









    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------

        public void testSafeAddLong() {
            assertEquals(0L, FieldUtils.safeAdd(0L, 0L));

            assertEquals(5L, FieldUtils.safeAdd(2L, 3L));
            assertEquals(-1L, FieldUtils.safeAdd(2L, -3L));
            assertEquals(1L, FieldUtils.safeAdd(-2L, 3L));
            assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L));

            assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeAdd(Long.MAX_VALUE, -1L));
            assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeAdd(Long.MIN_VALUE, 1L));

            assertEquals(-1, FieldUtils.safeAdd(Long.MIN_VALUE, Long.MAX_VALUE));
            assertEquals(-1, FieldUtils.safeAdd(Long.MAX_VALUE, Long.MIN_VALUE));

            try {
                FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
                fail();
            } catch (ArithmeticException e) {
            }

            try {
                FieldUtils.safeAdd(Long.MAX_VALUE, 100L);
                fail();
            } catch (ArithmeticException e) {
            }

            try {
                FieldUtils.safeAdd(Long.MAX_VALUE, Long.MAX_VALUE);
                fail();
            } catch (ArithmeticException e) {
            }

            try {
                FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
                fail();
            } catch (ArithmeticException e) {
            }

            try {
                FieldUtils.safeAdd(Long.MIN_VALUE, -100L);
                fail();
            } catch (ArithmeticException e) {
            }

            try {
                FieldUtils.safeAdd(Long.MIN_VALUE, Long.MIN_VALUE);
                fail();
            } catch (ArithmeticException e) {
            }
        }
}
