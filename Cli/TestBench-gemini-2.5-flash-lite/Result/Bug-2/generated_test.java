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
        // The logic splits "-a=arg1" into "-a" and "arg1"
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
        // The logic bursts "-abc", sees 'a' as an option, 'b' as an option with an argument,
        // and takes "arg1" as the argument for 'b'. 'c' is then processed as a separate token.
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
        // When stopAtNonOption is true, and an option is followed by a non-option,
        // the non-option is added as a token.
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
        // When stopAtNonOption is true, and a non-option is encountered,
        // "--" is added, then the non-option, and subsequent tokens are not processed as options.
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
        // When stopAtNonOption is false, non-options are treated as regular tokens.
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
        // If an option is not found and stopAtNonOption is false, it's added as is.
        assertEquals("flattened array should contain '-b'", 1, flattened.length);
        assertEquals("-b", flattened[0]);
    }
    
    public void testFlatten_singleCharacterOptionNotFound_stopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-b", "rest"};
        String[] flattened = parser.flatten(options, args, true);
        // When stopAtNonOption is true and an unknown option is found, it's treated as a non-option.
        // Thus, "--" is added, followed by the token and the rest of the arguments.
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
        // 'a' is an option with an argument, so "arg1rest" is taken as its argument.
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
        // "-ab" bursts into "-a" and "-b". "-b" has an argument, so "arg1" is consumed by it.
        assertEquals("flattened array should contain '-a', '-b', 'arg1'", 3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("arg1", flattened[2]);
    }
    
    public void testFlatten_burstToken_optionHasNoArgButRemainingChars() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A"); // Option 'a' does not take an argument
        String[] args = {"-axyz"};
        String[] flattened = parser.flatten(options, args, false);
        // 'a' is an option. The remaining characters 'xyz' are not part of 'a',
        // and since 'a' doesn't take an argument, 'x', 'y', and 'z' are treated as new options.
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
        // '-a' is processed. 'x' is not a valid option.
        // Since stopAtNonOption is true, 'xyz' is treated as a non-option,
        // prepended with '--', and then 'rest' is appended.
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
        options.addOption("a", true, "Option A"); // This option has an argument
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
        // When a token is not an option and stopAtNonOption is false, it's added,
        // and the eatTheRest flag is set, meaning all subsequent tokens are added.
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
        // When an option is not found and stopAtNonOption is true, the token is ignored.
        // The `processOptionToken` method, when `!options.hasOption(token)` and `stopAtNonOption`,
        // sets `eatTheRest = true` but does not add the token.
        // The loop continues, but since `eatTheRest` is true, the next `gobble` call would add remaining tokens.
        // However, there are no more tokens.
        assertEquals("flattened array should be empty for unmatched option and stopAtNonOption true", 0, flattened.length);
    }
    
    public void testFlatten_processOptionToken_optionNotExists_stopAtNonOptionFalse() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-b"};
        String[] flattened = parser.flatten(options, args, false);
        // When an option is not found and stopAtNonOption is false, the token is added as is.
        assertEquals("flattened array should contain '-b'", 1, flattened.length);
        assertEquals("-b", flattened[0]);
    }

    public void testBurstToken_optionNotFoundAndStopAtNonOptionTrue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        String[] args = {"-bxyz", "rest"};
        String[] flattened = parser.flatten(options, args, true);
        // "-bxyz" is a token. 'b' is not an option.
        // Since stopAtNonOption is true, the rest of the token "xyz" is appended to "--",
        // and "rest" is added as a subsequent token.
        assertEquals("flattened should contain '--', 'bxyz', 'rest'", 3, flattened.length);
        assertEquals("--", flattened[0]);
        assertEquals("bxyz", flattened[1]);
        assertEquals("rest", flattened[2]);
    }

    
    public void testFlatten_doubleHyphenWithEquals() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "Option A");
        String[] args = {"--a=value"};
        String[] flattened = parser.flatten(options, args, false);
        // "--a=value" is parsed into "--a" and "value".
        assertEquals("flattened array should contain '--a' and 'value'", 2, flattened.length);
        assertEquals("--a", flattened[0]);
        assertEquals("value", flattened[1]);
    }
    
    public void testFlatten_longOptionNotRecognized() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"--longopt"};
        String[] flattened = parser.flatten(options, args, false);
        // Tokens starting with "--" are added as is, unless they contain "=", and are not recognized as options.
        assertEquals("flattened array should contain '--longopt'", 1, flattened.length);
        assertEquals("--longopt", flattened[0]);
    }

    public void testFlatten_longOptionWithEqualsNotRecognized() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"--longopt=value"};
        String[] flattened = parser.flatten(options, args, false);
        // Tokens starting with "--" and containing "=" are split at "=".
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
        // "-s" is a short option. "--longopt" is a token. "arg" is its argument. The last "-s" is another token.
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
        // When an option that requires an argument is provided without one, it's still added.
        // The parsing of the argument would fail later, but flatten just collects tokens.
        assertEquals("flattened array should contain '-a'", 1, flattened.length);
        assertEquals("-a", flattened[0]);
    }
    
    public void testFlatten_multipleHyphensPrefix() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] args = {"---a", "--", "-b"}; 
        String[] flattened = parser.flatten(options, args, false);
        // "---a" is not a recognized option format and is treated as a regular token.
        // "--" is a special token. "-b" is a regular token.
        assertEquals("flattened array should contain '---a', '--', '-b'", 3, flattened.length);
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
        // If an option takes an argument and the next token is null, null is added as the argument.
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
        // "-a" is an option. "arg1" is its argument. "non-option" is encountered next.
        // Since stopAtNonOption is true, "non-option" is added as a regular token.
        assertEquals("flattened array should contain '-a', 'arg1', 'non-option'", 3, flattened.length);
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
        assertEquals("non-option", flattened[2]);
    }
}
