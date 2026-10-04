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
        assertEquals("Expected empty array for empty arguments", 0, flattened.length);
    }

    public void testFlattenNullArguments() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] flattened = parser.flatten(options, null, false);
        assertEquals("Expected empty array for null arguments", 0, flattened.length);
    }

    public void testFlattenStopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "desc");
        String[] arguments = {"-a", "arg1", "arg2"};
        String[] flattened = parser.flatten(options, arguments, true);
        String[] expected = {"-a", "arg1", "arg2"};
        assertTrue("Expected tokens to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenStopAtNonOptionFalse() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "desc");
        String[] arguments = {"-a", "arg1", "arg2"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-a", "arg1", "arg2"};
        assertTrue("Expected tokens to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenDoubleDash() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"--", "-a", "arg1"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--", "-a", "arg1"};
        assertTrue("Expected '--' to be treated as a token", Arrays.equals(expected, flattened));
    }

    public void testFlattenSingleDash() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"-", "-a", "arg1"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-", "-a", "arg1"};
        assertTrue("Expected '-' to be treated as a token", Arrays.equals(expected, flattened));
    }

    public void testFlattenShortOptionWithoutArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "desc");
        String[] arguments = {"-a"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-a"};
        assertTrue("Expected short option to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenShortOptionWithArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "desc");
        String[] arguments = {"-a", "arg"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-a", "arg"};
        assertTrue("Expected short option with argument to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenShortOptionWithArgumentAttached() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "desc");
        String[] arguments = {"-aarg"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-a", "arg"};
        assertTrue("Expected short option with attached argument to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenShortOptionWithArgumentAttachedAndMoreOptions() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "desc");
        options.addOption("b", false, "desc");
        String[] arguments = {"-ab"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-a", "b"};
        assertTrue("Expected short option with attached argument and more options to be processed", Arrays.equals(expected, flattened));
    }
    
    public void testFlattenShortOptionWithArgumentAttachedAndMoreOptionsComplex() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "desc");
        options.addOption("b", false, "desc");
        options.addOption("c", true, "desc");
        String[] arguments = {"-abc"};
        String[] flattened = parser.flatten(options, arguments, false);
        // The behavior here is that '-a' takes 'bc' as its argument.
        String[] expected = {"-a", "bc"};
        assertTrue("Expected short option with attached argument and more options to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenMultipleShortOptions() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "desc");
        options.addOption("b", false, "desc");
        String[] arguments = {"-ab"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-a", "-b"};
        assertTrue("Expected multiple short options to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenUnknownOptionWhenStopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"-x", "arg1"};
        String[] flattened = parser.flatten(options, arguments, true);
        String[] expected = {"--", "-x", "arg1"};
        assertTrue("Expected unknown option with stopAtNonOption=true to be processed as non-option", Arrays.equals(expected, flattened));
    }

    public void testFlattenUnknownOptionWhenStopAtNonOptionFalse() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"-x", "arg1"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-x", "arg1"}; // -x is ignored if not an option and stopAtNonOption is false, but it gets added to tokens because of the burstToken logic that falls through.
        assertTrue("Expected unknown option with stopAtNonOption=false to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenOptionWithLongName() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longa", false, "desc");
        String[] arguments = {"--longa"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--longa"};
        assertTrue("Expected long option to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenOptionWithLongNameAndArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longa", true, "desc");
        String[] arguments = {"--longa", "arg"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--longa", "arg"};
        assertTrue("Expected long option with argument to be processed", Arrays.equals(expected, flattened));
    }
    
    public void testFlattenOptionWithLongNameAndArgumentAttached() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longa", true, "desc");
        String[] arguments = {"--longa=arg"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--longa", "arg"};
        assertTrue("Expected long option with attached argument to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenOptionWithLongNameAndArgumentAttachedNoValue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longa", true, "desc");
        String[] arguments = {"--longa="};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--longa", ""};
        assertTrue("Expected long option with attached empty argument to be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenRemainingTokensWhenStopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "desc");
        String[] arguments = {"-a", "arg1", "arg2", "arg3"};
        parser.flatten(options, arguments, true); 
        String[] flattened = parser.flatten(options, arguments, true); 
        String[] expected = {"-a", "arg1", "arg2", "arg3"};
        assertTrue("Multiple non-options after an option should be preserved when stopAtNonOption is true", Arrays.equals(expected, flattened));
    }

    public void testFlattenBurstTokenWithArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "desc");
        String[] arguments = {"-aarg"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-a", "arg"};
        assertTrue("Burst token with argument should split correctly", Arrays.equals(expected, flattened));
    }

    public void testFlattenBurstTokenWithMultipleOptionsAndArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "desc");
        options.addOption("b", true, "desc");
        options.addOption("c", false, "desc");
        String[] arguments = {"-abc"};
        String[] flattened = parser.flatten(options, arguments, false);
        // -a is processed, then -b takes 'c' as its argument.
        String[] expected = {"-a", "-b", "c"};
        assertTrue("Burst token with multiple options and argument should split correctly", Arrays.equals(expected, flattened));
    }

    public void testFlattenBurstTokenUnknownOptionStopTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"-xarg"};
        String[] flattened = parser.flatten(options, arguments, true);
        // -x is unknown. With stopAtNonOption=true, it should be treated as a non-option.
        // The substring from 'x' onwards should be passed to process.
        String[] expected = {"--", "-xarg"};
        assertTrue("Burst token with unknown option and stopAtNonOption=true should be handled as non-option", Arrays.equals(expected, flattened));
    }

    public void testFlattenBurstTokenUnknownOptionStopFalse() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"-xarg"};
        String[] flattened = parser.flatten(options, arguments, false);
        // -x is unknown. With stopAtNonOption=false, it should be treated as a non-option.
        // The whole token "-xarg" should be added to the tokens list.
        String[] expected = {"-xarg"};
        assertTrue("Burst token with unknown option and stopAtNonOption=false should be handled as a single token", Arrays.equals(expected, flattened));
    }

    public void testFlattenOptionWithLongOptAndEquals() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("f", "file", true, "desc");
        String[] arguments = {"--file=myfile.txt"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--file", "myfile.txt"};
        assertTrue("Option with longOpt and equals should be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenOptionWithLongOptAndEqualsNoValue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("f", "file", true, "desc");
        String[] arguments = {"--file="};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--file", ""};
        assertTrue("Option with longOpt and equals with no value should be processed", Arrays.equals(expected, flattened));
    }
    
    public void testFlattenOptionWithLongOptAndSpace() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("f", "file", true, "desc");
        String[] arguments = {"--file", "myfile.txt"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--file", "myfile.txt"};
        assertTrue("Option with longOpt and space should be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenTwoByteOptionShort() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("ab", false, "two byte option");
        String[] arguments = {"-ab"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-ab"};
        assertTrue("Two byte option should be processed as one", Arrays.equals(expected, flattened));
    }

    public void testFlattenTwoByteOptionShortWithArg() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("ab", true, "two byte option with arg");
        String[] arguments = {"-ab", "value"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-ab", "value"};
        assertTrue("Two byte option with arg should be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenTwoByteOptionShortWithArgAttached() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("ab", true, "two byte option with arg attached");
        String[] arguments = {"-abvalue"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-ab", "value"};
        assertTrue("Two byte option with attached arg should be processed", Arrays.equals(expected, flattened));
    }

    public void testFlattenStopAtNonOptionWithMultipleNonOptions() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "desc");
        String[] arguments = {"-a", "non1", "non2", "non3"};
        String[] flattened = parser.flatten(options, arguments, true);
        String[] expected = {"-a", "non1", "non2", "non3"};
        assertTrue("Multiple non-options after an option should be preserved when stopAtNonOption is true", Arrays.equals(expected, flattened));
    }
    
    public void testFlattenNonOptionFirstWithStopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"non1", "non2"};
        String[] flattened = parser.flatten(options, arguments, true);
        String[] expected = {"--", "non1", "non2"};
        assertTrue("Non-options at the beginning should be handled correctly when stopAtNonOption is true", Arrays.equals(expected, flattened));
    }

    public void testFlattenBurstTokenWithMultipleOptionsNoArgAttached() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "desc");
        options.addOption("b", false, "desc");
        options.addOption("c", false, "desc");
        String[] arguments = {"-abc"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"-a", "-b", "-c"};
        assertTrue("Burst token with multiple options and no argument should split correctly", Arrays.equals(expected, flattened));
    }
    
    public void testFlattenOptionWithHyphenInLongOpt() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "long-opt", true, "desc");
        String[] arguments = {"--long-opt", "value"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--long-opt", "value"};
        assertTrue("Long option with hyphen should be processed", Arrays.equals(expected, flattened));
    }
    
    public void testFlattenLongOptionWithHyphenAndEquals() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "long-opt", true, "desc");
        String[] arguments = {"--long-opt=value"};
        String[] flattened = parser.flatten(options, arguments, false);
        String[] expected = {"--long-opt", "value"};
        assertTrue("Long option with hyphen and equals should be processed", Arrays.equals(expected, flattened));
    }
}
