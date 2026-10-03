package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class PosixParserAI18Test {

    @Test
    public void testLongOptionWithEquals() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("f", "file", true, "file option");

        String[] args = new String[] { "--file=test.txt" };
        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "--file", "test.txt" }, result);
    }

    @Test
    public void testSingleHyphen() {
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] args = new String[] { "-" };
        String[] result = parser.flatten(options, args, false);

        assertArrayEquals(new String[] { "-" }, result);
    }

    @Test
    public void testStopAtNonOption() {
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] args = new String[] { "non-option", "-a" };
        String[] result = parser.flatten(options, args, true);

        assertArrayEquals(new String[] { "--", "non-option", "-a" }, result);
    }
}
