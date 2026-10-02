package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Properties;
import org.junit.Test;

public class ParserAI28Test
{
    private static class DummyParser extends Parser
    {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) throws ParseException
        {
            return arguments;
        }
    }

    @Test
    public void testParseNullArguments() throws Exception
    {
        Parser parser = new DummyParser();
        Options options = new Options();
        CommandLine cl = parser.parse(options, null);
        assertNotNull(cl);
    }

    @Test
    public void testUnrecognizedOptionThrowsException()
    {
        Parser parser = new DummyParser();
        Options options = new Options();
        try
        {
            parser.parse(options, new String[] { "-unknown" });
            fail("Expected UnrecognizedOptionException");
        }
        catch (UnrecognizedOptionException e)
        {
            assertEquals("-unknown", e.getOption());
        }
        catch (ParseException e)
        {
            fail("Expected UnrecognizedOptionException, got " + e.getClass());
        }
    }

    @Test
    public void testProcessProperties() throws Exception
    {
        Parser parser = new DummyParser();
        Options options = new Options();
        options.addOption(OptionBuilder.withLongOpt("propOpt").hasArg().create('p'));

        Properties props = new Properties();
        props.setProperty("p", "val");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertEquals("val", cl.getOptionValue("p"));
    }
}
