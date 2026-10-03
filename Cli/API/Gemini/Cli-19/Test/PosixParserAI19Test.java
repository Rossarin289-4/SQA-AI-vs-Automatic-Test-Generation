package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PosixParserAI19Test {

    @Test
    public void testLongOptionWithEquals() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("f", "file", true, "file");

        String[] args = new String[] { "--file=test.txt" };
        String[] flattened = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "--file", "test.txt" }, flattened);
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
    public void testBurstingWithArgument() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha");
        options.addOption("b", "beta", true, "beta");

        String[] args = new String[] { "-abvalue" };
        String[] flattened = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-a", "-b", "value" }, flattened);
    }
}
