package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class GnuParserAI12Test {

    @Test
    public void testLongOptionWithEquals() {
        Options options = new Options();
        options.addOption("f", "foo", true, "foo option");
        GnuParser parser = new GnuParser();
        String[] args = new String[] { "--foo=bar" };
        String[] flattened = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo", "bar" }, flattened);
    }

    @Test
    public void testSingleHyphenAndDoubleHyphen() {
        Options options = new Options();
        GnuParser parser = new GnuParser();
        String[] args = new String[] { "--", "-" };
        String[] flattened = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--", "-" }, flattened);
    }

    @Test
    public void testStopAtNonOption() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        GnuParser parser = new GnuParser();
        String[] args = new String[] { "-a", "non-option", "-a" };
        String[] flattened = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "-a", "non-option", "-a" }, flattened);
    }
}
