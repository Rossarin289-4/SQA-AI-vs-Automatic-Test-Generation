package org.apache.commons.lang.text;

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
import org.apache.commons.lang.Validate;

public class ExtendedMessageFormatTest {
    @Test
    public void testPlainPattern() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", format.toPattern());
        assertEquals("Hello Ada", format.format(new Object[] {"Ada"}));
    }

    @Test
    public void testEmptyPattern() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("");
        assertEquals("", format.toPattern());
        assertEquals("", format.format(new Object[0]));
    }

    @Test
    public void testReapplyPattern() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("old");
        format.applyPattern("new {0}");
        assertEquals("new {0}", format.toPattern());
        assertEquals("new value", format.format(new Object[] {"value"}));
    }

    @Test
    public void testLiteralBracesInsideQuotedPattern() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("'{'{0}}");
        assertEquals("'{'{0}}", format.toPattern());
        assertEquals("{x}", format.format(new Object[] {"x"}));
    }

    @Test
    public void testDoubledQuote() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("a''b {0}");
        assertEquals("a''b {0}", format.toPattern());
        assertEquals("a'b x", format.format(new Object[] {"x"}));
    }

    @Test
    public void testAdjacentArguments() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}{1}");
        assertEquals("{0}{1}", format.toPattern());
        assertEquals("ab", format.format(new Object[] {"a", "b"}));
    }

    @Test
    public void testArgumentIndexZero() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        assertEquals("zero", format.format(new Object[] {"zero"}));
    }

    @Test
    public void testArgumentIndexAtLargestInt() throws Exception {
        try {
            new ExtendedMessageFormat("{2147483647}");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testArgumentIndexBeyondLargestInt() throws Exception {
        try {
            new ExtendedMessageFormat("{2147483648}");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNegativeArgumentIndexRejected() throws Exception {
        try {
            new ExtendedMessageFormat("{-1}");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWhitespaceAroundArgumentIndex() throws Exception {
        try {
            new ExtendedMessageFormat("{ 0 }");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testInvalidArgumentIndexTextRejected() throws Exception {
        try {
            new ExtendedMessageFormat("{x}");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testUnterminatedFormatElementRejected() throws Exception {
        try {
            new ExtendedMessageFormat("{0");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testUnterminatedQuotedStringAcceptedByMessageFormat() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("'unfinished");
        assertEquals("unfinished", format.format(new Object[0]));
    }

    @Test
    public void testCustomFormatDescriptionRetainedWhenNoFactory() throws Exception {
        Map registry = new java.util.HashMap();
        try {
            new ExtendedMessageFormat("{0,unknown}", Locale.US, registry);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCustomStyleDescriptionRetainedWhenNoFactory() throws Exception {
        Map registry = new java.util.HashMap();
        try {
            new ExtendedMessageFormat("{0,unknown, style}", Locale.US, registry);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testNullRegistryUsesBasePatternHandling() throws Exception {
        ExtendedMessageFormat format =
                new ExtendedMessageFormat("{0,number}", Locale.US, null);
        assertEquals("{0,number}", format.toPattern());
        assertEquals("12", format.format(new Object[] {Integer.valueOf(12)}));
    }

    @Test
    public void testSetFormatThrows() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        try {
            format.setFormat(0, null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals("{0}", format.toPattern());
    }

    @Test
    public void testSetFormatByArgumentIndexThrows() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        try {
            format.setFormatByArgumentIndex(0, null);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals("{0}", format.toPattern());
    }

    @Test
    public void testSetFormatsThrows() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        try {
            format.setFormats(new Format[0]);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals("{0}", format.toPattern());
    }

    @Test
    public void testSetFormatsByArgumentIndexThrows() throws Exception {
        ExtendedMessageFormat format = new ExtendedMessageFormat("{0}");
        try {
            format.setFormatsByArgumentIndex(new Format[0]);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals("{0}", format.toPattern());
    }
}
