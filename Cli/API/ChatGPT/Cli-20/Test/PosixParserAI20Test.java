package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PosixParserAI20Test {

    @Test
    public void testFlattenSingleHyphen() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = new String[] { "-" };
        String[] expected = new String[] { "-" };

        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlattenLongOptionWithEquals() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("f", "foo", false, "foo option");
        String[] args = new String[] { "--foo=bar" };
        String[] expected = new String[] { "--foo", "bar" };

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlattenBurstingWithOptions() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha");
        options.addOption("b", "beta", false, "beta");
        String[] args = new String[] { "-ab" };
        String[] expected = new String[] { "-a", "-b" };

        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(expected, result);
    }
}
