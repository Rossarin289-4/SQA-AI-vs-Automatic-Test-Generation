package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import static org.junit.Assert.*;

public class ByteQuadsCanonicalizerAI11Test {

    @Test
    public void testCreateRoot() {
        ByteQuadsCanonicalizer canonicalizer = ByteQuadsCanonicalizer.createRoot();
        assertNotNull(canonicalizer);
        assertEquals(0, canonicalizer.size());
    }

    @Test
    public void testCalcTertiaryShift() {
        assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(16));
        assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(64));
        assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(256));
    }

    @Test
    public void testMakeChild() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        ByteQuadsCanonicalizer child = root.makeChild(1);
        assertNotNull(child);
        assertEquals(0, child.size());
    }
}
