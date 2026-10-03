package org.apache.commons.lang.text;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExtendedMessageFormatDefectTest {

    @Test
    public void testExtendedMessageFormatWithSingleQuoteLiteral() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("dummy", new FormatFactory() {
            public java.text.Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });

        // This pattern exercises appendQuotedString with escapingOn = true at start/middle positions
        String pattern = "The 'message' has {0} item{1}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        assertEquals("The 'message' has {0} item{1}", emf.toPattern());
    }

    @Test
    public void testExtendedMessageFormatLeadingSingleQuote() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("fmt", new FormatFactory() {
            public java.text.Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });

        // Pattern starting with a quote which triggers the missing next(pos) in appendQuotedString
        String pattern = "'Single quote pattern' {0,fmt}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        assertNotNull(emf);
    }

    @Test
    public void testExtendedMessageFormatMultipleQuotesAndCustomFormat() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("custom", new FormatFactory() {
            public java.text.Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });

        String pattern = "User ''{0}'' logged in at {1,custom}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        assertEquals("User ''{0}'' logged in at {1,custom}", emf.toPattern());
    }
}
