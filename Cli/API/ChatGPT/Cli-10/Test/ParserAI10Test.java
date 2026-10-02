package org.apache.commons.cli;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Properties;
import org.junit.Test;

public class ParserAI10Test {

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
        CommandLine cl = parser.parse(options, null);
        assertNotNull(cl);
    }

    @Test
    public void testProcessProperties() {
        Parser parser = new ConcreteParser();
        Options options = new Options();
        Option opt = new Option("b", "beta", false, "beta option");
        options.addOption(opt);
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("b", "true");

        parser.processProperties(props);
        assertTrue(parser.cmd.hasOption("b"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOptionUnrecognized() throws Exception {
        Parser parser = new ConcreteParser();
        Options options = new Options();
        parser.setOptions(options);
        parser.cmd = new CommandLine();

        parser.processOption("-unknown", null);
    }
}
