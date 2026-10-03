package org.apache.commons.lang3.text;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class ExtendedMessageFormatLang23Test {

    @Test
    public void testEquivalentFormatsRemainEqual() {
        ExtendedMessageFormat first =
                new ExtendedMessageFormat("Record: {0}");
        ExtendedMessageFormat second =
                new ExtendedMessageFormat("Record: {0}");

        assertTrue(first.equals(second));
        assertTrue(second.equals(first));
    }

    @Test
    public void testDifferentRegistryStateMakesFormatsUnequal() {
        ExtendedMessageFormat withoutRegistry =
                new ExtendedMessageFormat("Record: {0}");

        Map<String, FormatFactory> registry =
                Collections.singletonMap(
                        "unused",
                        new FormatFactory() {
                            @Override
                            public java.text.Format getFormat(
                                    String name,
                                    String arguments,
                                    java.util.Locale locale) {
                                return null;
                            }
                        });

        ExtendedMessageFormat withRegistry =
                new ExtendedMessageFormat("Record: {0}", registry);

        assertFalse(withoutRegistry.equals(withRegistry));
        assertFalse(withRegistry.equals(withoutRegistry));
    }

    @Test
    public void testDifferentRegistryStateIsRespectedByHashSet() {
        ExtendedMessageFormat withoutRegistry =
                new ExtendedMessageFormat("Entry: {0}");

        Map<String, FormatFactory> registry =
                Collections.singletonMap(
                        "notUsed",
                        new FormatFactory() {
                            @Override
                            public java.text.Format getFormat(
                                    String name,
                                    String arguments,
                                    java.util.Locale locale) {
                                return null;
                            }
                        });

        ExtendedMessageFormat withRegistry =
                new ExtendedMessageFormat("Entry: {0}", registry);

        Set<ExtendedMessageFormat> formats =
                new HashSet<ExtendedMessageFormat>();

        formats.add(withoutRegistry);

        assertFalse(formats.contains(withRegistry));
    }
}
