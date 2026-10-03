package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.junit.Test;

public class ExtendedMessageFormatTestCustom {

    @Test
    public void testExtendedMessageFormatEquality() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        String pattern = "The value is {0, unsupportedFormat}";

        ExtendedMessageFormat emf1 = new ExtendedMessageFormat(pattern, Locale.US, registry);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat(pattern, Locale.US, registry);

        assertTrue("Identical ExtendedMessageFormat instances should be equal", emf1.equals(emf2));
        assertTrue("Symmetric equality check", emf2.equals(emf1));
        assertEquals("Equal objects must have matching hash codes", emf1.hashCode(), emf2.hashCode());
    }

    @Test
    public void testExtendedMessageFormatInequalityByPattern() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();

        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Pattern A: {0}", Locale.US, registry);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Pattern B: {0}", Locale.US, registry);

        assertFalse("ExtendedMessageFormat instances with different patterns should not be equal", emf1.equals(emf2));
    }

    @Test
    public void testExtendedMessageFormatInequalityByRegistry() {
        Map<String, FormatFactory> registry1 = new HashMap<String, FormatFactory>();
        Map<String, FormatFactory> registry2 = new HashMap<String, FormatFactory>();
        registry2.put("test", null);

        String pattern = "Value: {0, test}";

        ExtendedMessageFormat emf1 = new ExtendedMessageFormat(pattern, Locale.US, registry1);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat(pattern, Locale.US, registry2);

        assertFalse("ExtendedMessageFormat instances with different registries should not be equal", emf1.equals(emf2));
    }

    @Test
    public void testExtendedMessageFormatEqualsEdgeCases() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}", Locale.US, registry);

        assertTrue("An object must be equal to itself", emf.equals(emf));
        assertFalse("An object cannot be equal to null", emf.equals(null));
        assertFalse("An object cannot be equal to an instance of a different class", emf.equals("Test {0}"));
    }
}
