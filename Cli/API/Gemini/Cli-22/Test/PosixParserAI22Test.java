package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PosixParserAI22Test
{
    @Test
    public void testFlattenSingleHyphen()
    {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = new String[] { "-" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "-" }, result);
    }

    @Test
    public void testFlattenLongOptionWithEquals()
    {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("f", "foo", true, "foo option");
        String[] args = new String[] { "--foo=bar" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    @Test
    public void testFlattenBurstTokenWithArg()
    {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        String[] args = new String[] { "-abundle" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "bundle" }, result);
    }
}
