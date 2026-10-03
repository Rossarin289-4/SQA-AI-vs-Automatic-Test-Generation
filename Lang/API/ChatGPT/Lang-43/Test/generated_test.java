package org.apache.commons.lang.text;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lang43ExtendedMessageFormatTest {

    @Test(timeout = 2000)
    public void testQuotedLiteralAtBeginningMakesProgress() {
        Map registry = new HashMap();

        ExtendedMessageFormat format =
                new ExtendedMessageFormat("'hello'", registry);

        assertEquals("'hello'", format.toPattern());
    }

    @Test(timeout = 2000)
    public void testQuotedLiteralAfterOrdinaryTextMakesProgress() {
        Map registry = new HashMap();

        ExtendedMessageFormat format =
                new ExtendedMessageFormat("prefix 'hello' suffix", registry);

        assertEquals("prefix 'hello' suffix", format.toPattern());
    }

    @Test(timeout = 2000)
    public void testEmptyQuotedLiteralMakesProgress() {
        Map registry = new HashMap();

        ExtendedMessageFormat format =
                new ExtendedMessageFormat("before''after", registry);

        assertEquals("before''after", format.toPattern());
    }

    @Test(timeout = 2000)
    public void testPatternWithoutQuotesStillWorksWithRegistry() {
        Map registry = new HashMap();

        ExtendedMessageFormat format =
                new ExtendedMessageFormat("value {0}", registry);

        assertEquals("value {0}", format.toPattern());
    }
}
