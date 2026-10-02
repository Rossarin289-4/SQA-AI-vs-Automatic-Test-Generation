package org.apache.commons.cli;

import java.util.Properties;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class DefaultParserAI38Test
{
    @Test
    public void testParseEmptyArguments() throws Exception
    {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testHandlePropertiesUnrecognizedOption() throws Exception
    {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        Properties props = new Properties();
        props.setProperty("nonexistent", "value");
        parser.parse(options, new String[0], props);
    }

    @Test
    public void testParseNullArguments() throws Exception
    {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        CommandLine cmd = parser.parse(options, (String[]) null);
        assertNotNull(cmd);
    }
}
