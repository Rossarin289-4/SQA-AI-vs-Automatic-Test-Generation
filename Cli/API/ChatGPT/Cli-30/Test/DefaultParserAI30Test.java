package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DefaultParserAI30Test
{
    @Test
    public void testParseSimpleOption() throws ParseException
    {
        Options options = new Options();
        options.addOption("a", "all", false, "do not hide entries starting with .");

        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[] { "-a" });

        assertNotNull(cmd);
        assertEquals(true, cmd.hasOption("a"));
    }

    @Test
    public void testParseOptionWithArgument() throws ParseException
    {
        Options options = new Options();
        options.addOption("b", "block-size", true, "use SIZE blocks");

        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[] { "-b", "1024" });

        assertNotNull(cmd);
        assertEquals("1024", cmd.getOptionValue("b"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedOptionThrowsException() throws ParseException
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        parser.parse(options, new String[] { "-x" });
    }
}
