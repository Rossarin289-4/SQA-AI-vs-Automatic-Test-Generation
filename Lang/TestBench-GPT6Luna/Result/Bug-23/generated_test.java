package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

public class ExtendedMessageFormatTest {
    @Test
    public void testPlainPatternIsCanonicalized() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("hello {0}");
        assertEquals("hello {0}", format.toPattern());
    }

    @Test
    public void testWhitespaceAroundArgumentIndex() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0 }");
        assertEquals("{0}", format.toPattern());
    }

    @Test
    public void testFormattingUsesArgumentIndex() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("Hi {0}!");
        assertEquals("Hi Ada!", format.format(new Object[] {"Ada"}));
    }

    @Test
    public void testApplyPatternUpdatesPatternAndFormatting() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        format.applyPattern("value={0,number}");
        assertEquals("value={0,number}", format.toPattern());
        assertEquals("value=12", format.format(new Object[] {12}));
    }

    @Test
    public void testQuotedFormatElementIsLiteral() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("'{0}'");
        assertEquals("'{0}'", format.toPattern());
        assertEquals("{0}", format.format(new Object[] {"ignored"}));
    }

    @Test
    public void testNullRegistryPreservesBuiltInFormats() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0,number}", Locale.US, null);
        assertEquals("{0,number}", format.toPattern());
        assertEquals("12", format.format(new Object[] {12}));
    }

    @Test
    public void testCustomFormatDescriptionRemainsInPatternWhenUnregistered() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0,number}", Locale.US,
                new java.util.HashMap<String, FormatFactory>());
        assertEquals("{0,number}", format.toPattern());
    }

    @Test
    public void testArgumentIndexAtLargestInt() throws Exception {
        try {
            new ExtendedMessageFormat("{2147483647}");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testArgumentIndexAboveLargestIntIsRejected() throws Exception {
        try {
            new ExtendedMessageFormat("{2147483648}");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testNegativeArgumentIndexIsRejected() throws Exception {
        try {
            new ExtendedMessageFormat("{-1}");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testUnterminatedFormatElementIsRejected() throws Exception {
        try {
            new ExtendedMessageFormat("{0");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testUnterminatedQuoteIsRejected() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("'unfinished");
        assertEquals("unfinished", format.toPattern());
    }

    @Test
    public void testEqualityOfEquivalentFormats() throws Exception {
        ExtendedMessageFormat first = new ExtendedMessageFormat("{0}");
        ExtendedMessageFormat second = new ExtendedMessageFormat("{0}");
        assertEquals(first, second);
    }

    @Test
    public void testNotEqualForDifferentPatterns() throws Exception {
        ExtendedMessageFormat first = new ExtendedMessageFormat("{0}");
        ExtendedMessageFormat second = new ExtendedMessageFormat("{1}");
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualityWithNullAndDifferentType() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        assertFalse(format.equals(null));
        assertFalse(format.equals("not a formatter"));
    }

    @Test
    public void testEqualFormatsHaveEqualHashCodes() throws Exception {
        ExtendedMessageFormat first = new ExtendedMessageFormat("{0}");
        ExtendedMessageFormat second = new ExtendedMessageFormat("{0}");
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testSetFormatIsUnsupported() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        try {
            format.setFormat(0, (Format) null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertEquals("{0}", format.toPattern());
        }
    }

    @Test
    public void testSetFormatByArgumentIndexIsUnsupported() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        try {
            format.setFormatByArgumentIndex(0, (Format) null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertEquals("{0}", format.toPattern());
        }
    }

    @Test
    public void testSetFormatsIsUnsupported() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        try {
            format.setFormats(new Format[0]);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertEquals("{0}", format.toPattern());
        }
    }

    @Test
    public void testSetFormatsByArgumentIndexIsUnsupported() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        try {
            format.setFormatsByArgumentIndex(new Format[0]);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertEquals("{0}", format.toPattern());
        }
    }
}
