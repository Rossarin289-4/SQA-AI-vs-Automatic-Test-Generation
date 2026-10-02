package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PosixParserAI17Test {

    @Test
    public void testFlattenLongOptionWithEquals() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption(OptionBuilder.withLongOpt("foo").hasArg().create());

        String[] args = new String[] { "--foo=bar" };
        String[] flattened = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "--foo", "bar" }, flattened);
    }

    @Test
    public void testFlattenSingleHyphen() {
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] args = new String[] { "-" };
        String[] flattened = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-" }, flattened);
    }

    @Test
    public void testBurstTokenWithArg() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption(OptionBuilder.withShortOpt("a").hasArg().create());

        String[] args = new String[] { "-ab" };
        String[] flattened = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-a", "b" }, flattened);
    }
}
