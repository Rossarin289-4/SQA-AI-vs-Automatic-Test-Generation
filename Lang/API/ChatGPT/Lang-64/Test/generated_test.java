package org.apache.commons.lang.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ValuedEnumLang64Test {

    private static final class FirstEnum extends ValuedEnum {

        private FirstEnum(String name, int value) {
            super(name, value);
        }

        private static final FirstEnum LOW =
                new FirstEnum("LOW", 10);

        private static final FirstEnum HIGH =
                new FirstEnum("HIGH", 30);
    }

    private static final class SecondEnum extends ValuedEnum {

        private SecondEnum(String name, int value) {
            super(name, value);
        }

        private static final SecondEnum OTHER =
                new SecondEnum("OTHER", 20);

        private static final SecondEnum SAME_VALUE =
                new SecondEnum("SAME_VALUE", 10);
    }

    @Test
    public void testCompareToDifferentEnumTypesWithDifferentValues() {
        try {
            FirstEnum.LOW.compareTo(SecondEnum.OTHER);
            fail("Comparing different ValuedEnum types should throw ClassCastException");
        } catch (ClassCastException expected) {
            // Expected on the fixed implementation.
        }
    }

    @Test
    public void testCompareToDifferentEnumTypesWithEqualValues() {
        try {
            FirstEnum.LOW.compareTo(SecondEnum.SAME_VALUE);
            fail("Comparing different ValuedEnum types should throw ClassCastException");
        } catch (ClassCastException expected) {
            // Expected on the fixed implementation.
        }
    }

    @Test
    public void testCompareToSameEnumTypeUsesNumericOrdering() {
        assertEquals(-20, FirstEnum.LOW.compareTo(FirstEnum.HIGH));
    }

    @Test
    public void testCompareToItselfReturnsZero() {
        assertEquals(0, FirstEnum.LOW.compareTo(FirstEnum.LOW));
    }
}
