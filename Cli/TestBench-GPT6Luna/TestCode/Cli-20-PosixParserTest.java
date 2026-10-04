package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PosixParserTest extends TestCase {
    public void testEmptyArguments() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(0, parser.flatten(new Options(), new String[0], false).length);
    }

    public void testSingleHyphenIsKept() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"-"}, false)));
    }

    public void testDoubleHyphenIsKeptAsLongToken() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"--"}, false)));
    }

    public void testOrdinaryArgumentWithStopDisabled() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("word"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"word"}, false)));
    }

    public void testOrdinaryArgumentWithStopEnabled() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--", "word"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"word"}, true)));
    }

    public void testStopAtNonOptionCopiesRemainingTokens() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "flag");
        String[] actual = parser.flatten(options, new String[] {"-a", "word", "-a"}, true);
        assertEquals(Arrays.asList("-a", "--", "word", "-a"), Arrays.asList(actual));
    }

    public void testShortOptionAtTwoCharacterBoundary() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "flag");
        assertEquals(Arrays.asList("-a"),
                Arrays.asList(parser.flatten(options, new String[] {"-a"}, false)));
    }

    public void testUnknownShortOptionWithStopDisabledIsRetained() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-z"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"-z"}, false)));
    }

    public void testUnknownShortOptionWithStopEnabledCopiesRest() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-z", "tail"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"-z", "tail"}, true)));
    }

    public void testKnownLongOption() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "flag");
        assertEquals(Arrays.asList("--alpha"),
                Arrays.asList(parser.flatten(options, new String[] {"--alpha"}, false)));
    }

    public void testUnknownLongOptionStopDisabled() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--unknown"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"--unknown"}, false)));
    }

    public void testUnknownLongOptionStopEnabled() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--", "--unknown"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"--unknown"}, true)));
    }

    public void testLongOptionEqualsSplitsValue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "value");
        assertEquals(Arrays.asList("--alpha", "v"),
                Arrays.asList(parser.flatten(options, new String[] {"--alpha=v"}, false)));
    }

    public void testLongOptionEqualsWithEmptyValue() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "flag");
        assertEquals(Arrays.asList("--alpha", ""),
                Arrays.asList(parser.flatten(options, new String[] {"--alpha="}, false)));
    }

    public void testLongOptionUnknownWithEqualsAndStopEnabled() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--", "--unknown=v"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"--unknown=v"}, true)));
    }

    public void testBurstKnownFlags() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "flag");
        options.addOption("b", false, "flag");
        assertEquals(Arrays.asList("-a", "-b"),
                Arrays.asList(parser.flatten(options, new String[] {"-ab"}, false)));
    }

    public void testBurstStopsAfterOptionArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "flag");
        options.addOption("b", true, "value");
        assertEquals(Arrays.asList("-a", "-b", "t"),
                Arrays.asList(parser.flatten(options, new String[] {"-abt"}, false)));
    }

    public void testBurstUnknownCharacterWithoutStopKeepsWholeToken() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "flag");
        assertEquals(Arrays.asList("-a", "-a", "-az"),
                Arrays.asList(parser.flatten(options, new String[] {"-a", "-az"}, false)));
    }

    public void testBurstUnknownCharacterWithStopAddsSeparator() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "flag");
        assertEquals(Arrays.asList("--", "z", "tail"),
                Arrays.asList(parser.flatten(options, new String[] {"-az", "tail"}, true)));
    }

    public void testBurstArgumentOptionAtEndHasNoValueToken() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", true, "value");
        assertEquals(Arrays.asList("-a"),
                Arrays.asList(parser.flatten(options, new String[] {"-a"}, false)));
    }

    public void testFlattenResetsStateBetweenCalls() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--", "first"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"first"}, true)));
        Options options = new Options();
        options.addOption("a", false, "flag");
        assertEquals(Arrays.asList("-a", "second"),
                Arrays.asList(parser.flatten(options, new String[] {"-a", "second"}, false)));
    }
}
