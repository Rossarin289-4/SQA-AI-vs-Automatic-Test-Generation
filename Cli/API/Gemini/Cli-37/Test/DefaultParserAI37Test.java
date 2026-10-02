package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Properties;
import org.junit.Test;

public class DefaultParserAI37Test
{
    @Test
    public void testParseSimpleOption() throws Exception
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");

        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[] { "-a" });

        assertNotNull(cmd);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParseWithOptionsAndProperties() throws Exception
    {
        Options options = new Options();
        options.addOption("b", "beta", true, "beta option");

        Properties props = new Properties();
        props.setProperty("b", "propertyValue");

        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[0], props);

        assertNotNull(cmd);
        assertTrue(cmd.hasOption("b"));
        assertEquals("propertyValue", cmd.getOptionValue("b"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedOptionThrowsException() throws Exception
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        parser.parse(options, new String[] { "-unknown" });
    }
}
