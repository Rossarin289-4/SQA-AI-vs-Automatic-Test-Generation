package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

public class GnuParserTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testFlattenStopAtNonOptionTrue() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "default")
               .addOption("b", false, "default")
               .addOption("c", false, "default");

        String[] arguments = {"-a", "-b", "c", "-d", "-e"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals("a,-b,c,-d,-e", join(flattened));
    }

    public void testFlattenStopAtNonOptionFalse() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "default")
               .addOption("b", false, "default")
               .addOption("c", false, "default");

        String[] arguments = {"-a", "-b", "c", "-d", "-e"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("a,-b,c,-d,-e", join(flattened));
    }

    public void testFlattenWithDoubleHyphen() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "default");

        String[] arguments = {"-a", "--", "-b", "-c"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals("a,--,-b,-c", join(flattened));
    }

    public void testFlattenWithSingleHyphen() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "default");

        String[] arguments = {"-a", "-", "-b", "-c"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals("a,-,-b,-c", join(flattened));
    }

    public void testFlattenOptionHasArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "requires an argument");

        String[] arguments = {"-a", "arg", "-b"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("a,arg,-b", join(flattened));
    }

    public void testFlattenOptionConcatenatedArguments() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "default");
        options.addOption("b", false, "default");

        String[] arguments = {"-ab", "-c"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("a,-b,-c", join(flattened));
    }
    
    public void testFlattenOptionConcatenatedArgumentsWithArg() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "requires an argument");
        options.addOption("b", false, "default");

        String[] arguments = {"-ab", "arg", "-c"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("a,arg,-b,-c", join(flattened));
    }

    public void testFlattenOptionWithEqual() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "requires an argument");

        String[] arguments = {"-a=value", "-b"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("a,value,-b", join(flattened));
    }
    
    public void testFlattenUnknownOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "default");

        String[] arguments = {"-b", "-a"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals("-b,a", join(flattened));
    }
    
    public void testFlattenUnknownOptionButHyphenated() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "default");

        String[] arguments = {"-b", "-a"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("-b,a", join(flattened));
    }
    
    public void testFlattenHyphenatedOptionHasArgument() throws Exception {
        Options options = new Options();
        options.addOption("D", true, "property");
        
        String[] arguments = {"-D", "key=value"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("-D,key=value", join(flattened));
    }

    public void testFlattenLongOptionWithEqual() throws Exception {
        Options options = new Options();
        options.addOption("D", true, "property");
        
        String[] arguments = {"--property=value"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("--property,value", join(flattened));
    }

    public void testFlattenLongOptionWithoutEqual() throws Exception {
        Options options = new Options();
        options.addOption("D", true, "property");
        
        String[] arguments = {"--property", "value"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("--property,value", join(flattened));
    }
    
    public void testFlattenLongOptionNotPresent() throws Exception {
        Options options = new Options();
        options.addOption("D", true, "property");
        
        String[] arguments = {"--unknown", "value"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals("--unknown,value", join(flattened));
    }

    public void testFlattenLongOptionNotPresentStopAtNonOptionFalse() throws Exception {
        Options options = new Options();
        options.addOption("D", true, "property");
        
        String[] arguments = {"--unknown", "value"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("--unknown,value", join(flattened));
    }

    public void testFlattenMixedOptions() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "default");
        options.addOption("b", true, "requires arg");
        options.addOption("c", false, "default");

        String[] arguments = {"-a", "-bvalue", "-c"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("a,-b,value,-c", join(flattened));
    }
    
    public void testFlattenWithNumericArgs() throws Exception {
        Options options = new Options();
        options.addOption("n", true, "numeric arg");

        String[] arguments = {"-n", "12345"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("-n,12345", join(flattened));
    }

    public void testFlattenWithSpecialCharsArg() throws Exception {
        Options options = new Options();
        options.addOption("s", true, "string arg");

        String[] arguments = {"-s", "!@#$%^"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("-s,!@#$%^", join(flattened));
    }

    public void testFlattenEmptyArguments() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "default");

        String[] arguments = {};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("", join(flattened));
    }

    public void testFlattenOptionHasArgumentEmptyString() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "requires an argument");

        String[] arguments = {"-a", ""};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("a,", join(flattened));
    }
    
    public void testFlattenOptionHasArgumentNullString() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "requires an argument");

        String[] arguments = {"-a", null};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("a,null", join(flattened));
    }

    public void testFlattenHyphenatedOptionWithEqualSignAsArg() throws Exception {
        Options options = new Options();
        options.addOption("D", true, "property");
        
        String[] arguments = {"-D=key=value"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("-D,key=value", join(flattened));
    }

    public void testFlattenLongOptionWithEqualSignAsArg() throws Exception {
        Options options = new Options();
        options.addOption("D", true, "property");
        
        String[] arguments = {"--property=key=value"};
        GnuParser parser = new GnuParser();
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals("--property,key=value", join(flattened));
    }

    // Helper method to join strings for assertion
    private String join(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
            if (i < strings.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
