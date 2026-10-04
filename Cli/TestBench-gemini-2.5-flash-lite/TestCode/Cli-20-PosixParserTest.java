package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PosixParserTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testFlattenStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "arg1", "arg2"};
        String[] flattened = parser.flatten(options, args, true);
        // When stopAtNonOption is true, "arg1" and "arg2" should be treated as non-options.
        // The implementation of flatten when stopAtNonOption is true, encounters a non-option token after an option,
        // calls process(token). process(token) then sets eatTheRest to true and adds "--" and the token.
        assertEquals("-a", flattened[0]);
        assertEquals("--", flattened[1]);
        assertEquals("arg1", flattened[2]);
        assertEquals("arg2", flattened[3]);
    }

    public void testFlattenWithDoubleDash() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "--", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        // "--" should be treated as a literal argument.
        assertEquals("-a", flattened[0]);
        assertEquals("--", flattened[1]);
        assertEquals("arg1", flattened[2]);
    }

    public void testFlattenWithSingleDash() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "-", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        // "-" should be treated as a literal argument.
        assertEquals("-a", flattened[0]);
        assertEquals("-", flattened[1]);
        assertEquals("arg1", flattened[2]);
    }

    public void testFlattenWithTwoCharOptionThatDoesNotExist() throws Exception {
        Options options = new Options();
        // No option "a" defined.

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        // When stopAtNonOption is false, an unknown two-character option starting with '-' is treated as a non-option and added as is.
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlattenWithTwoCharOptionThatDoesNotExistAndStopAtNonOption() throws Exception {
        Options options = new Options();
        // No option "a" defined.

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "arg1"};
        String[] flattened = parser.flatten(options, args, true);
        // When stopAtNonOption is true and an unknown two-character option is encountered,
        // the 'process' method is called with the full token.
        // process sees currentOption is null, sets eatTheRest to true, adds "--", and adds "-a".
        assertEquals("--", flattened[0]);
        assertEquals("-a", flattened[1]);
        assertEquals("arg1", flattened[2]);
    }

    public void testFlattenWithMultiCharOptionThatDoesNotExist() throws Exception {
        Options options = new Options();
        // No option "abc" defined.

        PosixParser parser = new PosixParser();
        String[] args = {"-abc", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        // The implementation calls burstToken. In burstToken, if an option char is not found AND stopAtNonOption is false,
        // the entire token is added.
        assertEquals("-abc", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlattenWithMultiCharOptionThatDoesNotExistAndStopAtNonOption() throws Exception {
        Options options = new Options();
        // No option "abc" defined.

        PosixParser parser = new PosixParser();
        String[] args = {"-abc", "arg1"};
        String[] flattened = parser.flatten(options, args, true);
        // The implementation calls burstToken. For "-abc", it checks 'a'. If not an option and stopAtNonOption is true,
        // it calls process(token.substring(i)), which is process("-bc").
        // process("-bc") sees currentOption is null, sets eatTheRest to true, adds "--", and adds "-bc".
        assertEquals("--", flattened[0]);
        assertEquals("-bc", flattened[1]);
        assertEquals("arg1", flattened[2]);
    }

    public void testFlattenWithValidOptionAndArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        // The argument should be correctly associated with the option.
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlattenWithValidOptionAndArgumentSpelledOut() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", true, "desc a");

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        // The argument should be correctly associated with the option.
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlattenWithValidOptionAndArgumentEmbedded() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");

        PosixParser parser = new PosixParser();
        String[] args = {"-aarg1"}; // This is handled by burstToken
        String[] flattened = parser.flatten(options, args, false);
        // The argument should be extracted from the option token.
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlattenWithMultipleOptionsInOneToken() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc a");
        options.addOption("b", false, "desc b");
        options.addOption("c", false, "desc c");

        PosixParser parser = new PosixParser();
        String[] args = {"-abc"}; // This is handled by burstToken
        String[] flattened = parser.flatten(options, args, false);
        // Each character should be treated as a separate option.
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("-c", flattened[2]);
    }

    public void testFlattenWithMultipleOptionsOneWithArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc a");
        options.addOption("b", true, "desc b");
        options.addOption("c", false, "desc c");

        PosixParser parser = new PosixParser();
        String[] args = {"-abarg1c"}; // Bursting should handle this
        String[] flattened = parser.flatten(options, args, false);
        // The argument "arg1" should be associated with option "b". "c" should be a separate option.
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("arg1", flattened[2]);
        assertEquals("-c", flattened[3]);
    }

    public void testFlattenWithMultipleOptionsOneWithArgumentAndMoreTokens() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc a");
        options.addOption("b", true, "desc b");
        options.addOption("c", false, "desc c");

        PosixParser parser = new PosixParser();
        String[] args = {"-abarg1", "nextarg"};
        String[] flattened = parser.flatten(options, args, false);
        // "-a" is processed. Then "-b" is encountered. It has an argument "arg1".
        // The next token is "nextarg". It's not an option, so it's added as a token.
        // This test seems to be set up expecting "-c" to be present, but it's not in the args.
        // Based on the args provided, it should be:
        assertEquals("-a", flattened[0]);
        assertEquals("-b", flattened[1]);
        assertEquals("arg1", flattened[2]);
        assertEquals("nextarg", flattened[3]); // This is the actual behavior for the given args.
    }

    public void testFlattenWithLongOptionWithoutArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", false, "desc a");

        PosixParser parser = new PosixParser();
        String[] args = {"--apple"};
        String[] flattened = parser.flatten(options, args, false);
        // Long option should be added.
        assertEquals("--apple", flattened[0]);
    }

    public void testFlattenWithLongOptionWithArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", true, "desc a");

        PosixParser parser = new PosixParser();
        String[] args = {"--apple=arg1"};
        String[] flattened = parser.flatten(options, args, false);
        // Long option and its argument should be parsed.
        assertEquals("--apple", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlattenWithLongOptionWithArgumentSeparate() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", true, "desc a");

        PosixParser parser = new PosixParser();
        String[] args = {"--apple", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        // Long option and its argument should be parsed.
        assertEquals("--apple", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlattenWithUnknownLongOption() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", false, "desc a");

        PosixParser parser = new PosixParser();
        String[] args = {"--banana", "arg1"};
        String[] flattened = parser.flatten(options, args, false);
        // If stopAtNonOption is false, unknown long options are added as tokens.
        assertEquals("--banana", flattened[0]);
        assertEquals("arg1", flattened[1]);
    }

    public void testFlattenWithUnknownLongOptionAndStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", false, "desc a");

        PosixParser parser = new PosixParser();
        String[] args = {"--banana", "arg1"};
        String[] flattened = parser.flatten(options, args, true);
        // If stopAtNonOption is true, the unknown long option "--banana" is treated as a non-option.
        // The process method is called.
        // process("--banana") sees currentOption is null, sets eatTheRest to true, adds "--", and adds "--banana".
        assertEquals("--", flattened[0]);
        assertEquals("--banana", flattened[1]);
        assertEquals("arg1", flattened[2]);
    }

    public void testFlattenWithEmptyArguments() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");

        PosixParser parser = new PosixParser();
        String[] args = {};
        String[] flattened = parser.flatten(options, args, false);
        // Empty arguments should result in an empty flattened array.
        assertEquals(0, flattened.length);
    }

    public void testFlattenWithNullArguments() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");

        PosixParser parser = new PosixParser();
        String[] args = null;
        // The flatten method internally uses Arrays.asList(arguments), which will throw NullPointerException if args is null.
        // Based on the source, it will throw NPE.
        try {
            parser.flatten(options, args, false);
            fail("Expected NullPointerException for null arguments");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    public void testFlattenWithOptionRequiringArgumentButNoneProvided() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");

        PosixParser parser = new PosixParser();
        String[] args = {"-a"};
        String[] flattened = parser.flatten(options, args, false);
        // The current implementation adds the option "-a". The 'flatten' method does not validate if an argument was provided.
        assertEquals("-a", flattened[0]);
    }

    public void testFlattenWithBurstTokenAndStopAtNonOptionWhereNonOptionIsFirst() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc a");
        options.addOption("b", true, "desc b");

        PosixParser parser = new PosixParser();
        String[] args = {"-x", "-a", "-bvalue", "rest"}; // -x is not an option
        String[] flattened = parser.flatten(options, args, true);
        // When stopAtNonOption is true, the first non-option terminates processing.
        // For "-x", 'x' is not an option, stopAtNonOption is true, so process(token) is called with "-x".
        // process("-x") sees currentOption is null, sets eatTheRest to true, adds "--", and adds "-x".
        assertEquals("--", flattened[0]);
        assertEquals("-x", flattened[1]);
        assertEquals("-a", flattened[2]);
        assertEquals("-bvalue", flattened[3]);
        assertEquals("rest", flattened[4]);
    }

    public void testFlattenWithBurstTokenAndStopAtNonOptionWhereNonOptionIsLater() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc a");
        options.addOption("b", true, "desc b");

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "-xb", "value", "rest"}; // -x is not an option
        String[] flattened = parser.flatten(options, args, true);
        // Option 'a' is processed. Then "-xb" is encountered. 'x' is not an option, stopAtNonOption is true.
        // This triggers process("-xb").
        // process("-xb") sees currentOption is null, sets eatTheRest to true, adds "--", adds "-xb".
        assertEquals("-a", flattened[0]);
        assertEquals("--", flattened[1]);
        assertEquals("-xb", flattened[2]);
        assertEquals("value", flattened[3]);
        assertEquals("rest", flattened[4]);
    }

    public void testFlattenLongOptionWithHyphenInValue() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", true, "desc a");

        PosixParser parser = new PosixParser();
        String[] args = {"--apple=value-with-hyphen"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("--apple", flattened[0]);
        assertEquals("value-with-hyphen", flattened[1]);
    }

    public void testFlattenMultipleOptionsWithArguments() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc a");
        options.addOption("b", true, "desc b");

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "aval", "-b", "bval"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("-a", flattened[0]);
        assertEquals("aval", flattened[1]);
        assertEquals("-b", flattened[2]);
        assertEquals("bval", flattened[3]);
    }

    public void testFlattenMultipleOptionsWithArgumentsEmbedded() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc a");
        options.addOption("b", true, "desc b");

        PosixParser parser = new PosixParser();
        String[] args = {"-aaval", "-bbval"};
        String[] flattened = parser.flatten(options, args, false);
        // For "-aaval", burstToken: 'a' is an option, has arg, token.length() != i+1. Adds token.substring(i+1) i.e. "aval".
        assertEquals("-a", flattened[0]);
        assertEquals("aval", flattened[1]);
        // For "-bbval", 'b' is an option, has arg, token.length() != i+1. Adds token.substring(i+1) i.e. "bval".
        assertEquals("-b", flattened[2]);
        assertEquals("bval", flattened[3]);
    }

    public void testFlattenWithOptionAndThenNonOptionAndStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc a");

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "non-option", "another"};
        String[] flattened = parser.flatten(options, args, true);
        // "-a" is processed. Then "non-option" is encountered. Since stopAtNonOption is true,
        // process("non-option") is called.
        // process("non-option") sees currentOption is null, sets eatTheRest to true, adds "--", adds "non-option".
        assertEquals("-a", flattened[0]);
        assertEquals("--", flattened[1]);
        assertEquals("non-option", flattened[2]);
        assertEquals("another", flattened[3]);
    }

    public void testFlattenWithOptionWithArgumentAndThenNonOptionAndStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc a");

        PosixParser parser = new PosixParser();
        String[] args = {"-a", "arg1", "non-option", "another"};
        String[] flattened = parser.flatten(options, args, true);
        // "-a" is processed, "arg1" is its argument. Then "non-option" is encountered.
        // Since stopAtNonOption is true, process("non-option") is called.
        // process("non-option") sees currentOption is null, sets eatTheRest to true, adds "--", adds "non-option".
        assertEquals("-a", flattened[0]);
        assertEquals("arg1", flattened[1]);
        assertEquals("--", flattened[2]);
        assertEquals("non-option", flattened[3]);
        assertEquals("another", flattened[4]);
    }
}
