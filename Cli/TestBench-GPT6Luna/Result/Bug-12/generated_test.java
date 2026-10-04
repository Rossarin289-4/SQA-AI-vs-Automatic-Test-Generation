package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

public class GnuParserTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testLongOptionNameRemainsOneToken() throws Exception {
        Options options = new Options();
        options.addOption("a", "all", false, "all");
        String[] actual = new GnuParser().flatten(options,
                new String[] {"--all"}, false);
        assertEquals(1, actual.length);
        assertEquals("--all", actual[0]);
    }

    public void testShortOptionNameRemainsOneToken() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        String[] actual = new GnuParser().flatten(options,
                new String[] {"-a"}, false);
        assertEquals(1, actual.length);
        assertEquals("-a", actual[0]);
    }

    public void testOptionWithEqualsSplitsAtFirstEquals() throws Exception {
        Options options = new Options();
        options.addOption("o", "output", true, "output");
        String[] actual = new GnuParser().flatten(options,
                new String[] {"--output=one=two"}, false);
        assertEquals(2, actual.length);
        assertEquals("--output", actual[0]);
        assertEquals("one=two", actual[1]);
    }

    public void testEqualsWithEmptyValue() throws Exception {
        Options options = new Options();
        options.addOption("o", "output", true, "output");
        String[] actual = new GnuParser().flatten(options,
                new String[] {"--output="}, false);
        assertEquals(2, actual.length);
        assertEquals("--output", actual[0]);
        assertEquals("", actual[1]);
    }

    public void testSingleDashIsPreserved() throws Exception {
        String[] actual = new GnuParser().flatten(new Options(),
                new String[] {"-"}, false);
        assertEquals(1, actual.length);
        assertEquals("-", actual[0]);
    }

    public void testDoubleDashPreservesFollowingTokensWhenNotStopping() throws Exception {
        String[] actual = new GnuParser().flatten(new Options(),
                new String[] {"--", "-x", "tail"}, false);
        assertEquals(3, actual.length);
        assertEquals("--", actual[0]);
        assertEquals("-x", actual[1]);
        assertEquals("tail", actual[2]);
    }

    public void testDoubleDashPreservesFollowingTokensWhenStopping() throws Exception {
        String[] actual = new GnuParser().flatten(new Options(),
                new String[] {"--", "-x", "tail"}, true);
        assertEquals(3, actual.length);
        assertEquals("--", actual[0]);
        assertEquals("-x", actual[1]);
        assertEquals("tail", actual[2]);
    }

    public void testUnknownOptionStopsAtFollowingArgumentsWhenConfigured() throws Exception {
        String[] actual = new GnuParser().flatten(new Options(),
                new String[] {"-x", "-y", "tail"}, true);
        assertEquals(3, actual.length);
        assertEquals("-x", actual[0]);
        assertEquals("-y", actual[1]);
        assertEquals("tail", actual[2]);
    }

    public void testUnknownOptionDoesNotStopWhenNotConfigured() throws Exception {
        String[] actual = new GnuParser().flatten(new Options(),
                new String[] {"-x", "tail", "-y"}, false);
        assertEquals(3, actual.length);
        assertEquals("-x", actual[0]);
        assertEquals("tail", actual[1]);
        assertEquals("-y", actual[2]);
    }

    public void testRegisteredShortOptionSplitsCombinedArgument() throws Exception {
        Options options = new Options();
        options.addOption("D", false, "define");
        String[] actual = new GnuParser().flatten(options,
                new String[] {"-Dkey=value"}, false);
        assertEquals(2, actual.length);
        assertEquals("-D", actual[0]);
        assertEquals("key=value", actual[1]);
    }

    public void testUnknownShortPrefixDoesNotSplitCombinedArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        String[] actual = new GnuParser().flatten(options,
                new String[] {"-Dkey=value"}, false);
        assertEquals(1, actual.length);
        assertEquals("-Dkey=value", actual[0]);
    }

    public void testRecognizedOptionEqualsBranchPrecedesShortPrefixBranch() throws Exception {
        Options options = new Options();
        options.addOption("D", false, "define");
        options.addOption("Dkey", true, "key");
        String[] actual = new GnuParser().flatten(options,
                new String[] {"-Dkey=value"}, false);
        assertEquals(2, actual.length);
        assertEquals("-Dkey", actual[0]);
        assertEquals("value", actual[1]);
    }

    public void testNonOptionIsPreserved() throws Exception {
        String[] actual = new GnuParser().flatten(new Options(),
                new String[] {"plain"}, false);
        assertEquals(1, actual.length);
        assertEquals("plain", actual[0]);
    }

    public void testEmptyInputProducesEmptyOutput() throws Exception {
        String[] actual = new GnuParser().flatten(new Options(),
                new String[0], false);
        assertEquals(0, actual.length);
    }
}
