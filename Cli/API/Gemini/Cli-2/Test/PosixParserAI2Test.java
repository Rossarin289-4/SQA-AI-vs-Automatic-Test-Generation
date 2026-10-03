package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class PosixParserAI2Test {

    @Test
    public void testLongOptionWithEquals() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = new String[] { "--foo=bar" };
        String[] flattened = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo", "bar" }, flattened);
    }

    @Test
    public void testSingleHyphen() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = new String[] { "-" };
        String[] flattened = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-" }, flattened);
    }

    @Test
    public void testStopAtNonOption() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = new String[] { "nonoption", "-f" };
        String[] flattened = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "--", "nonoption", "-f" }, flattened);
    }
}
