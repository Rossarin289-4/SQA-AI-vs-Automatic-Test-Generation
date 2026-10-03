package org.apache.commons.cli;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Properties;
import org.junit.Test;

public class ParserAI4Test {

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

    @Test(expected = MissingOptionException.class)
    public void testParseMissingRequiredOption() throws Exception {
        Parser parser = new ConcreteParser();
        Options options = new Options();
        Option reqOpt = new Option("a", "alpha", true, "description");
        reqOpt.setRequired(true);
        options.addOption(reqOpt);

        parser.parse(options, new String[0]);
    }

    @Test
    public void testParseWithProperties() throws Exception {
        Parser parser = new ConcreteParser();
        Options options = new Options();
        Option opt = new Option("b", "beta", false, "description");
        options.addOption(opt);

        Properties props = new Properties();
        props.setProperty("b", "true");

        CommandLine cl = parser.parse(options, new String[0], props);
        assertTrue(cl.hasOption("b"));
    }
}
