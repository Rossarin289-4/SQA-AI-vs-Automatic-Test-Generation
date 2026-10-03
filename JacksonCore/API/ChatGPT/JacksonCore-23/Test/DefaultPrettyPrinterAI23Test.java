package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultPrettyPrinterAI23Test {

    @Test
    public void testCreateInstanceSubclassThrows() {
        DefaultPrettyPrinter subPrinter = new DefaultPrettyPrinter() {
            // anonymous subclass to trigger the check in createInstance()
        };
        try {
            subPrinter.createInstance();
            fail("Expected IllegalStateException for subclass");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("does not override method"));
        }
    }

    @Test
    public void testRootSeparatorConfiguration() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter ppCustom = pp.withRootSeparator("XYZ");
        assertNotSame(pp, ppCustom);

        DefaultPrettyPrinter ppSame = ppCustom.withRootSeparator("XYZ");
        assertSame(ppCustom, ppSame);
    }

    @Test
    public void testIndenterConfiguration() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withArrayIndenter(null);
        assertNotNull(pp2);

        DefaultPrettyPrinter pp3 = pp2.withArrayIndenter(DefaultPrettyPrinter.NopIndenter.instance);
        assertSame(pp2, pp3);
    }
}
