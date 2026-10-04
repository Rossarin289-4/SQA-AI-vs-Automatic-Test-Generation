package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PosixParserTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testFlattenEmptyArguments() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(0, flattened.length);
    }

    public void testFlattenNullArguments() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] flattened = parser.flatten(options, null, false);
        assertEquals(0, flattened.length);
    }

    public void testFlattenSingleHyphen() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"-"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(1, flattened.length);
        assertEquals("-", flattened[0]);
    }

    public void testFlattenDoubleHyphen() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"--"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(1, flattened.length);
        assertEquals("--", flattened[0]);
    }

    public void testFlattenSimpleOptionNoArg() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "An option");
        String[] arguments = {"-a"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(1, flattened.length);
        assertEquals("-a", flattened[0]);
    }

    public void testFlattenSimpleOptionWithArg() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "An option");
        String[] arguments = {"-avalue"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("value", flattened[1]);
    }
    
    public void testFlattenSimpleOptionWithEqualsArg() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "An option");
        String[] arguments = {"-a=value"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("value", flattened[1]);
    }

    public void testFlattenOptionWithMultipleArgs() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "An option");
        options.getOption("a").setArgs(2);
        String[] arguments = {"-avalue1", "value2"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("value1", flattened[1]);
        assertEquals("value2", flattened[2]);
    }

    public void testFlattenOptionWithUnlimitedArgs() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "An option");
        options.getOption("a").setArgs(Option.UNLIMITED_VALUES);
        String[] arguments = {"-avalue1", "value2", "value3"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(4, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("value1", flattened[1]);
        assertEquals("value2", flattened[2]);
        assertEquals("value3", flattened[3]);
    }

    public void testFlattenBurstOption() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", false, "Option B");
        options.addOption("c", true, "Option C");
        String[] arguments = {"-abc", "value"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(4, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("-c", flattened[2]);
        assertEquals("value", flattened[3]);
    }
    
    public void testFlattenBurstOptionWithArg() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", true, "Option B");
        String[] arguments = {"-abvalue"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("value", flattened[2]);
    }

    public void testFlattenBurstOptionWithArgAndNextToken() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", true, "Option B");
        String[] arguments = {"-ab", "value"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("value", flattened[2]);
    }

    public void testFlattenStopAtNonOption() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] arguments = {"-a", "arg1", "arg2"};
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals(3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
        assertEquals("arg2", flattened[2]);
    }

    public void testFlattenStopAtNonOptionWithHyphen() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] arguments = {"-a", "-", "arg2"};
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals(3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-", flattened[1]);
        assertEquals("arg2", flattened[2]);
    }

    public void testFlattenStopAtNonOptionWithDoubleHyphen() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] arguments = {"-a", "--", "arg2"};
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals(3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("--", flattened[1]);
        assertEquals("arg2", flattened[2]);
    }

    public void testFlattenNonOptionWhenStopAtNonOptionIsFalse() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] arguments = {"-a", "arg1", "arg2"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
        assertEquals("arg2", flattened[2]);
    }
    
    public void testFlattenUnknownOptionWithStopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"-x", "arg1"};
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals(2, flattened.length);
        assertEquals("--", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }
    
    public void testFlattenUnknownOptionWithStopAtNonOptionFalse() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"-x", "arg1"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(2, flattened.length);
        assertEquals("-x", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlattenUnknownOptionWithStopAtNonOptionFalseAndBurst() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] arguments = {"-xa", "arg1"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(3, flattened.length);
        assertEquals("-x", flattened[0]); // The unknown option itself is added
        assertEquals("-a", flattened[1]);
        assertEquals("arg1", flattened[2]);
    }

    public void testFlattenUnknownOptionWithStopAtNonOptionTrueAndBurst() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] arguments = {"-xa", "arg1"};
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals(3, flattened.length);
        assertEquals("--", flattened[0]); // The unknown option is treated as a non-option
        assertEquals("xa", flattened[1]); // The rest of the token is considered part of the non-option argument
        assertEquals("arg1", flattened[2]);
    }

    public void testFlattenOptionWithArgumentAndEqualSign() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("f", true, "File option");
        String[] arguments = {"-f=file.txt"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(2, flattened.length);
        assertEquals("-f", flattened[0]);
        assertEquals("file.txt", flattened[1]);
    }

    public void testFlattenLongOption() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longa", false, "Long option A");
        String[] arguments = {"--longa"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(1, flattened.length);
        assertEquals("--longa", flattened[0]);
    }
    
    public void testFlattenLongOptionWithEqualSign() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longa", true, "Long option A");
        String[] arguments = {"--longa=value"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(2, flattened.length);
        assertEquals("--longa", flattened[0]);
        assertEquals("value", flattened[1]);
    }

    public void testFlattenLongOptionWithValue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longa", true, "Long option A");
        String[] arguments = {"--longa", "value"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(2, flattened.length);
        assertEquals("--longa", flattened[0]);
        assertEquals("value", flattened[1]);
    }
    
    public void testFlattenMixedOptions() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", true, "Option B");
        options.addOption("c", false, "Option C");
        String[] arguments = {"-a", "-bvalue", "--", "-c", "unexpected"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(5, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("value", flattened[2]);
        assertEquals("--", flattened[3]);
        assertEquals("-c", flattened[4]);
    }

    public void testFlattenOptionFollowedByDoubleHyphen() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] arguments = {"-a", "--", "value1", "value2"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(4, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("--", flattened[1]);
        assertEquals("value1", flattened[2]);
        assertEquals("value2", flattened[3]);
    }

    public void testFlattenArgumentAfterDoubleHyphen() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"--", "arg1", "arg2"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(3, flattened.length);
        assertEquals("--", flattened[0]);
        assertEquals("arg1", flattened[1]);
        assertEquals("arg2", flattened[2]);
    }

    public void testFlattenSingleArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"arg1"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(1, flattened.length);
        assertEquals("arg1", flattened[0]);
    }

    public void testFlattenMultipleArguments() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"arg1", "arg2", "arg3"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(3, flattened.length);
        assertEquals("arg1", flattened[0]);
        assertEquals("arg2", flattened[1]);
        assertEquals("arg3", flattened[2]);
    }
    
    public void testFlattenOptionWithShortAndLongName() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("o", "option", true, "An option");
        String[] arguments = {"-o", "value"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(2, flattened.length);
        assertEquals("-o", flattened[0]);
        assertEquals("value", flattened[1]);
    }
    
    public void testFlattenOptionWithShortAndLongNameAndEquals() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("o", "option", true, "An option");
        String[] arguments = {"--option=value"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(2, flattened.length);
        assertEquals("--option", flattened[0]);
        assertEquals("value", flattened[1]);
    }

    public void testFlattenStopAtNonOptionHandlesHyphenCorrectly() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] arguments = {"-a", "-"};
        String[] flattened = parser.flatten(options, arguments, true);
        assertEquals(2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-", flattened[1]);
    }

    public void testFlattenBurstOptionWithArgumentAtEnd() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", true, "Option B");
        String[] arguments = {"-ab"};
        String[] flattened = parser.flatten(options, arguments, false);
        assertEquals(3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("b", flattened[2]); // The 'b' from '-ab' is considered the argument to '-b'
    }
}
