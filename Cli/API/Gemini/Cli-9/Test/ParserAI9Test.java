package org.apache.commons.cli;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Properties;
import org.junit.Test;

public class ParserAI9Test {

    private static class ConcreteParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments;
        }
    }

    @Test
    public void testParseNullArguments() throws Exception {
        Parser parser = new ConcreteParser();
        Options options = new Options();
        CommandLine cl = parser.parse(options, (String[]) null);
        assertNotNull(cl);
    }

    @Test
    public void testProcessPropertiesNull() throws Exception {
        Parser parser = new ConcreteParser();
        Options options = new Options();
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.processProperties(null);
        assertTrue(parser.cmd.getOptions().length == 0);
    }

    @Test(expected = MissingOptionException.class)
    public void testCheckRequiredOptionsThrowsException() throws Exception {
        Parser parser = new ConcreteParser();
        Options options = new Options();
        options.addOption(OptionBuilder.isRequired().create("a"));
        parser.setOptions(options);
        parser.cmd = new CommandLine();
        parser.checkRequiredOptions();
    }
}
