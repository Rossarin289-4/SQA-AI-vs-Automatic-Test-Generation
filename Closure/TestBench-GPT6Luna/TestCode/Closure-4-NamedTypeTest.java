package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import java.util.List;

public class NamedTypeTest {
    @Test
    public void testReferenceName() throws Exception {
        NamedType type = new NamedType(null, "Alpha", null, 0, 0);
        assertEquals("Alpha", type.getReferenceName());
    }

    @Test
    public void testEmptyReferenceName() throws Exception {
        NamedType type = new NamedType(null, "", null, 0, 0);
        assertEquals("", type.getReferenceName());
    }

    @Test
    public void testDottedReferenceName() throws Exception {
        NamedType type = new NamedType(null, "Alpha.Beta", null, 0, 0);
        assertEquals("Alpha.Beta", type.getReferenceName());
    }

    @Test
    public void testHasReferenceName() throws Exception {
        NamedType type = new NamedType(null, "Alpha", null, 0, 0);
        assertTrue(type.hasReferenceName());
    }

    @Test
    public void testNominalType() throws Exception {
        NamedType type = new NamedType(null, "Alpha", null, 0, 0);
        assertTrue(type.isNominalType());
    }

    @Test
    public void testHashCodeMatchesReference() throws Exception {
        NamedType type = new NamedType(null, "Alpha", null, 0, 0);
        assertEquals("Alpha".hashCode(), type.hashCode());
    }

    @Test
    public void testHashCodeForEmptyReference() throws Exception {
        NamedType type = new NamedType(null, "", null, 0, 0);
        assertEquals("".hashCode(), type.hashCode());
    }

    @Test
    public void testHashCodeForDottedReference() throws Exception {
        NamedType type = new NamedType(null, "A.B", null, 0, 0);
        assertEquals("A.B".hashCode(), type.hashCode());
    }

    @Test
    public void testHashCodeIgnoresSourceLocation() throws Exception {
        NamedType first = new NamedType(null, "Alpha", "one", 1, 2);
        NamedType second = new NamedType(null, "Alpha", "two", 9, 8);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testHashCodeChangesWithReference() throws Exception {
        NamedType first = new NamedType(null, "Alpha", null, 0, 0);
        NamedType second = new NamedType(null, "Beta", null, 0, 0);
        assertFalse(first.hashCode() == second.hashCode());
    }

    @Test
    public void testValidatorCanBeSet() throws Exception {
        NamedType type = new NamedType(null, "Alpha", null, 0, 0);
        Predicate<JSType> validator = new Predicate<JSType>() {
            @Override
            public boolean apply(JSType value) {
                return true;
            }
        };
        assertTrue(type.setValidator(validator));
    }

    @Test
    public void testValidatorCanBeReplacedBeforeResolution() throws Exception {
        NamedType type = new NamedType(null, "Alpha", null, 0, 0);
        Predicate<JSType> first = new Predicate<JSType>() {
            @Override
            public boolean apply(JSType value) {
                return true;
            }
        };
        Predicate<JSType> second = new Predicate<JSType>() {
            @Override
            public boolean apply(JSType value) {
                return false;
            }
        };
        assertTrue(type.setValidator(first));
        assertTrue(type.setValidator(second));
    }

    @Test
    public void testNullValidatorCanBeSetBeforeResolution() throws Exception {
        NamedType type = new NamedType(null, "Alpha", null, 0, 0);
        assertTrue(type.setValidator(null));
    }

    @Test
    public void testUnresolvedReferenceIsUnknown() throws Exception {
        NamedType type = new NamedType(null, "Alpha", null, 0, 0);
        assertNull(type.getReferencedType());
    }

    @Test
    public void testUnresolvedReferencesStartWithSameType() throws Exception {
        NamedType first = new NamedType(null, "Alpha", null, 0, 0);
        NamedType second = new NamedType(null, "Beta", null, 0, 0);
        assertNull(first.getReferencedType());
        assertNull(second.getReferencedType());
    }
}
