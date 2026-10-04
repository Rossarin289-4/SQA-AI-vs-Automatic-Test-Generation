package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PosixParserTest extends TestCase {
    public void testBareHyphenIsPreserved() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"-"}, false)));
    }

    public void testDoubleHyphenIsPreserved() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"--"}, false)));
    }

    public void testOrdinaryArgumentIsPreserved() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("word"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"word"}, false)));
    }

    public void testShortOptionWithNoArgumentIsPreserved() throws Exception {
        Options options = new Options().addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-a"),
                Arrays.asList(parser.flatten(options, new String[] {"-a"}, false)));
    }

    public void testUnknownShortOptionIsPreservedWhenNotStopping() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-x"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"-x"}, false)));
    }

    public void testUnknownShortOptionAndRestPreservedWhenStopping() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-x", "tail"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"-x", "tail"}, true)));
    }

    public void testNonOptionStopsAndAddsMarker() throws Exception {
        Options options = new Options().addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-a", "--", "word", "-a"),
                Arrays.asList(parser.flatten(options, new String[] {"-a", "word", "-a"}, true)));
    }

    public void testNonOptionDoesNotStopWhenStoppingDisabled() throws Exception {
        Options options = new Options().addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("word", "-a"),
                Arrays.asList(parser.flatten(options, new String[] {"word", "-a"}, false)));
    }

    public void testLongOptionIsEmitted() throws Exception {
        Options options = new Options().addOption("a", "alpha", false, "flag");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--alpha"),
                Arrays.asList(parser.flatten(options, new String[] {"--alpha"}, false)));
    }

    public void testLongOptionAttachedValueIsSeparated() throws Exception {
        Options options = new Options().addOption("a", "alpha", true, "value");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--alpha", "x"),
                Arrays.asList(parser.flatten(options, new String[] {"--alpha=x"}, false)));
    }

    public void testUnknownLongOptionIsPreservedWhenNotStopping() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--unknown"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"--unknown"}, false)));
    }

    public void testUnknownLongOptionAndRestPreservedWhenStopping() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--", "--unknown", "tail"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"--unknown", "tail"}, true)));
    }

    public void testBurstExpandsSeveralKnownFlags() throws Exception {
        Options options = new Options().addOption("a", false, "first")
                .addOption("b", false, "second");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-a", "-b"),
                Arrays.asList(parser.flatten(options, new String[] {"-ab"}, false)));
    }

    public void testBurstArgumentConsumesRemainingCharacters() throws Exception {
        Options options = new Options().addOption("a", true, "value")
                .addOption("b", false, "flag");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-a", "bc"),
                Arrays.asList(parser.flatten(options, new String[] {"-abc"}, false)));
    }

    public void testBurstUnknownTokenIsPreservedWhenNotStopping() throws Exception {
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-xyz"),
                Arrays.asList(parser.flatten(new Options(), new String[] {"-xyz"}, false)));
    }

    public void testBurstUnknownCharacterStopsAndPreservesRemainder() throws Exception {
        Options options = new Options().addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-a", "--", "xy", "tail"),
                Arrays.asList(parser.flatten(options, new String[] {"-axy", "tail"}, true)));
    }

    public void testKnownLongOptionWithEmptyAttachedValue() throws Exception {
        Options options = new Options().addOption("a", "alpha", true, "value");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--alpha", ""),
                Arrays.asList(parser.flatten(options, new String[] {"--alpha="}, false)));
    }

    public void testLongOptionUsesFirstEqualsAsSeparator() throws Exception {
        Options options = new Options().addOption("a", "alpha", true, "value");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("--alpha", "x=y"),
                Arrays.asList(parser.flatten(options, new String[] {"--alpha=x=y"}, false)));
    }

    public void testStopAtNonOptionDoesNotStopAfterArgumentOption() throws Exception {
        Options options = new Options().addOption("a", true, "value");
        PosixParser parser = new PosixParser();
        assertEquals(Arrays.asList("-a", "word", "-a"),
                Arrays.asList(parser.flatten(options, new String[] {"-a", "word", "-a"}, true)));
    }

    public void testFlattenResetsStopStateBetweenCalls() throws Exception {
        PosixParser parser = new PosixParser();
        parser.flatten(new Options(), new String[] {"word"}, true);
        assertEquals(Arrays.asList("-a"),
                Arrays.asList(parser.flatten(
                        new Options().addOption("a", false, "flag"),
                        new String[] {"-a"}, false)));
    }
}
