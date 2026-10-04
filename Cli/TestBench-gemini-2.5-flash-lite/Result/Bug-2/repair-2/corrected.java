package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PosixParserTest extends TestCase {

    public void testFlatten_emptyArguments() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should be empty", 0, flattened.length);
    }

    public void testFlatten_singleHyphenArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"-"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-'", 1, flattened.length);
        assertEquals("-", flattened[0]);
    }

    public void testFlatten_doubleHyphenArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"--"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '--'", 1, flattened.length);
        assertEquals("--", flattened[0]);
    }

    public void testFlatten_optionWithArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"-a", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a' and 'arg1'", 2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlatten_optionWithArgumentAttached() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"-aarg1"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a' and 'arg1'", 2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }
    
    public void testFlatten_optionWithEqualsArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"-a=arg1"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a' and 'arg1'", 2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlatten_multipleShortOptions() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", false, "Option B");
        options.addOption("c", false, "Option C");
        String[] args = {"-abc"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a', '-b', '-c'", 3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("-c", flattened[2]);
    }

    public void testFlatten_multipleShortOptionsWithArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", true, "Option B");
        options.addOption("c", false, "Option C");
        String[] args = {"-abc", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a', '-b', 'arg1', '-c'", 4, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("arg1", flattened[2]);
        assertEquals("-c", flattened[3]);
    }

    public void testFlatten_stopAtNonOptionTrue_optionFollowedByNonOption() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-a", "non-option"};
        String[] flattened = parser.flatten(options, args, true);
        assertEquals("flattened array should contain '-a' and 'non-option'", 2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("non-option", flattened[1]);
    }

    public void testFlatten_stopAtNonOptionTrue_nonOptionFollowedByOption() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"non-option", "-a"};
        String[] flattened = parser.flatten(options, args, true);
        assertEquals("flattened array should contain '--', 'non-option', '-a'", 3, flattened.length);
        assertEquals("--", flattened[0]);
        assertEquals("non-option", flattened[1]);
        assertEquals("-a", flattened[2]);
    }

    public void testFlatten_stopAtNonOptionFalse_nonOptionFollowedByOption() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"non-option", "-a"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain 'non-option' and '-a'", 2, flattened.length);
        assertEquals("non-option", flattened[0]);
        assertEquals("-a", flattened[1]);
    }

    public void testFlatten_singleCharacterOptionNotFound() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-b"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-b'", 1, flattened.length);
        assertEquals("-b", flattened[0]);
    }
    
    public void testFlatten_singleCharacterOptionNotFound_stopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-b", "rest"};
        String[] flattened = parser.flatten(options, args, true);
        assertEquals("flattened array should contain '--', '-b', 'rest'", 3, flattened.length);
        assertEquals("--", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("rest", flattened[2]);
    }

    public void testFlatten_burstToken_optionWithArgumentAndRemaining() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"-aarg1rest"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a' and 'arg1rest'", 2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("arg1rest", flattened[1]);
    }
    
    public void testFlatten_burstToken_multipleOptionsWithLastHavingArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", true, "Option B");
        String[] args = {"-ab", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a', '-b', 'arg1'", 3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("arg1", flattened[2]);
    }
    
    public void testFlatten_burstToken_optionHasNoArgButRemainingChars() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-axyz"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a', '-x', '-y', '-z'", 4, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-x", flattened[1]);
        assertEquals("-y", flattened[2]);
        assertEquals("-z", flattened[3]);
    }

    public void testFlatten_burstToken_stopAtNonOptionTrue_nonOptionEncountered() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-axyz", "rest"};
        String[] flattened = parser.flatten(options, args, true);
        assertEquals("flattened array should contain '-a', '--', 'xyz', 'rest'", 4, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("--", flattened[1]);
        assertEquals("xyz", flattened[2]);
        assertEquals("rest", flattened[3]);
    }
    
    public void testFlatten_process_optionWithArgAlreadySet() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"-a", "value"};
        String[] flattened = parser.flatten(options, args, false);
        
        assertEquals("flattened array should contain '-a' and 'value'", 2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("value", flattened[1]);
    }

    public void testFlatten_process_optionHasNoArgButHasArgs() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A"); 
        String[] args = {"-a", "value"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a' and 'value'", 2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("value", flattened[1]);
    }

    public void testFlatten_process_noCurrentOption_eatTheRest() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"non-option", "rest"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain 'non-option' and 'rest'", 2, flattened.length);
        assertEquals("non-option", flattened[0]);
        assertEquals("rest", flattened[1]);
    }
    
    public void testFlatten_processSingleHyphen() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"-"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-'", 1, flattened.length);
        assertEquals("-", flattened[0]);
    }

    public void testFlatten_processOptionToken_optionExists() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-a"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a'", 1, flattened.length);
        assertEquals("-a", flattened[0]);
    }

    public void testFlatten_processOptionToken_optionNotExists_stopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-b"};
        String[] flattened = parser.flatten(options, args, true);
        assertEquals("flattened array should be empty for unmatched option and stopAtNonOption true", 0, flattened.length);
    }
    
    public void testFlatten_processOptionToken_optionNotExists_stopAtNonOptionFalse() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-b"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-b'", 1, flattened.length);
        assertEquals("-b", flattened[0]);
    }

    public void testFlatten_gobble_eatTheRestTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        parser.eatTheRest = true; // Accessing private field directly, assuming this is for testing setup
        
        Iterator iter = Arrays.asList(new String[]{"token1", "token2"}).iterator();
        parser.tokens.add("initial"); // Accessing private field directly
        
        parser.gobble(iter); // Calling private method
        
        assertEquals("tokens list should contain initial, token1, token2", 3, parser.tokens.size());
        assertEquals("initial", parser.tokens.get(0));
        assertEquals("token1", parser.tokens.get(1));
        assertEquals("token2", parser.tokens.get(2));
    }

    public void testFlatten_gobble_eatTheRestFalse() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        parser.eatTheRest = false; // Accessing private field directly
        
        Iterator iter = Arrays.asList(new String[]{"token1", "token2"}).iterator();
        parser.tokens.add("initial"); // Accessing private field directly
        
        parser.gobble(iter); // Calling private method
        
        assertEquals("tokens list should only contain initial", 1, parser.tokens.size());
        assertEquals("initial", parser.tokens.get(0));
    }

    public void testBurstToken_singleOptionCharWithRemaining() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"-a123"};
        parser.flatten(options, args, false); 
        
        // Accessing private field directly, assuming this is for testing setup
        List<String> tokens = parser.tokens; 
        assertEquals("tokens should have '-a' and '123'", 2, tokens.size());
        assertEquals("-a", tokens.get(0));
        assertEquals("123", tokens.get(1));
    }

    public void testBurstToken_multipleOptionsWithOneRequiringArg() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", true, "Option B");
        options.addOption("c", false, "Option C");
        String[] args = {"-abc", "value"};
        parser.flatten(options, args, false);
        
        // Accessing private field directly
        List<String> tokens = parser.tokens;
        assertEquals("tokens should have '-a', '-b', 'value', '-c'", 4, tokens.size());
        assertEquals("-a", tokens.get(0));
        assertEquals("-b", tokens.get(1));
        assertEquals("value", tokens.get(2));
        assertEquals("-c", tokens.get(3));
    }

    public void testBurstToken_optionNotFoundAndStopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-bxyz", "rest"};
        String[] flattened = parser.flatten(options, args, true);
        
        assertEquals("flattened should contain '--', 'bxyz', 'rest'", 3, flattened.length);
        assertEquals("--", flattened[0]);
        assertEquals("bxyz", flattened[1]);
        assertEquals("rest", flattened[2]);
    }

    public void testBurstToken_optionWithNoArgAndMoreChars() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-axyz"};
        parser.flatten(options, args, false);
        
        // Accessing private field directly
        List<String> tokens = parser.tokens;
        assertEquals("tokens should have '-a', '-x', '-y', '-z'", 4, tokens.size());
        assertEquals("-a", tokens.get(0));
        assertEquals("-x", tokens.get(1));
        assertEquals("-y", tokens.get(2));
        assertEquals("-z", tokens.get(3));
    }
    
    public void testFlatten_doubleHyphenWithEquals() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"--a=value"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '--a' and 'value'", 2, flattened.length);
        assertEquals("--a", flattened[0]);
        assertEquals("value", flattened[1]);
    }
    
    public void testFlatten_longOptionNotRecognized() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"--longopt"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '--longopt'", 1, flattened.length);
        assertEquals("--longopt", flattened[0]);
    }

    public void testFlatten_longOptionWithEqualsNotRecognized() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"--longopt=value"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '--longopt' and 'value'", 2, flattened.length);
        assertEquals("--longopt", flattened[0]);
        assertEquals("value", flattened[1]);
    }
    
    public void testFlatten_mixOfShortAndLongOptions() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("s", false, "Short option");
        options.addOption("l", true, "Long option");
        String[] args = {"-s", "--longopt", "arg", "-s"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-s', '--longopt', 'arg', '-s'", 4, flattened.length);
        assertEquals("-s", flattened[0]);
        assertEquals("--longopt", flattened[1]);
        assertEquals("arg", flattened[2]);
        assertEquals("-s", flattened[3]);
    }
    
    public void testFlatten_optionWithRequiredArgNotProvided() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A"); // Required argument
        String[] args = {"-a"}; // Argument missing
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a'", 1, flattened.length);
        assertEquals("-a", flattened[0]);
    }
    
    public void testFlatten_multipleHyphensPrefix() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"---a", "--", "-b"}; 
        String[] flattened = parser.flatten(options, args, false);
        assertEquals(3, flattened.length);
        assertEquals("---a", flattened[0]);
        assertEquals("--", flattened[1]);
        assertEquals("-b", flattened[2]);
    }

    public void testFlatten_optionWithNullValue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"-a", null}; 
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("flattened array should contain '-a' and null", 2, flattened.length);
        assertEquals("-a", flattened[0]);
        assertNull(flattened[1]);
    }
    
    public void testFlatten_optionWithArgumentAndThenNonOption() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"-a", "arg1", "non-option"};
        String[] flattened = parser.flatten(options, args, true); 
        assertEquals("flattened array should contain '-a', 'arg1', 'non-option'", 3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
        assertEquals("non-option", flattened[2]);
    }
}
