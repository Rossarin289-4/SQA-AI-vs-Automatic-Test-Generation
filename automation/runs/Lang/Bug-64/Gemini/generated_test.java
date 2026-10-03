package org.apache.commons.lang.enums;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValuedEnumCustomTest {

    private static final class DummyEnumA extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        protected DummyEnumA(String name, int value) {
            super(name, value);
        }

        public static final DummyEnumA INSTANCE_A1 = new DummyEnumA("A1", 1);
        public static final DummyEnumA INSTANCE_A2 = new DummyEnumA("A2", 2);
    }

    private static final class DummyEnumB extends ValuedEnum {
        private static final long serialVersionUID = 1L;

        protected DummyEnumB(String name, int value) {
            super(name, value);
        }

        public static final DummyEnumB INSTANCE_B1 = new DummyEnumB("B1", 1);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareToDifferentEnumSubclasses() {
        DummyEnumA a = DummyEnumA.INSTANCE_A1;
        DummyEnumB b = DummyEnumB.INSTANCE_B1;
        // Comparing different enum subclasses should throw ClassCastException in fixed version
        a.compareTo(b);
    }

    @Test
    public void testCompareToSameEnumSubclass() {
        DummyEnumA a1 = DummyEnumA.INSTANCE_A1;
        DummyEnumA a2 = DummyEnumA.INSTANCE_A2;

        assertTrue(a1.compareTo(a2) < 0);
        assertTrue(a2.compareTo(a1) > 0);
        assertEquals(0, a1.compareTo(a1));
    }

    @Test
    public void testCompareToSelf() {
        DummyEnumA a1 = DummyEnumA.INSTANCE_A1;
        assertEquals(0, a1.compareTo(a1));
    }
}
