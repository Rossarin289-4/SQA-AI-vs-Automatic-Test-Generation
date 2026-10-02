package org.apache.commons.cli;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Properties;
import org.junit.Test;

public class ParserAI30Test
{
    private static class DummyParser extends Parser
    {
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption)
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

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessPropertiesUnrecognizedOption() throws Exception
    {
        Parser parser = new DummyParser();
        Options options = new Options();
        Properties props = new Properties();
        props.setProperty("unknown", "value");
        parser.parse(options, new String[0], props);
    }

    @Test
    public void testCheckRequiredOptionsMissing()
    {
        Parser parser = new DummyParser();
        Options options = new Options();
        Option opt = new Option("r", true, "required");
        opt.setRequired(true);
        options.addOption(opt);
        try
        {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        }
        catch (MissingOptionException e)
        {
            assertNotNull(e.getMissingOptions());
        }
        catch (ParseException e)
        {
            fail("Unexpected ParseException: " + e.getMessage());
        }
    }
}
