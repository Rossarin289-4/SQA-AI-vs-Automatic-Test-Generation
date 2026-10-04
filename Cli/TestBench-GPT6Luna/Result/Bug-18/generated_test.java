package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PosixParserTest extends TestCase {
    public void testLongOptionWithEquals() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha");
        assertTrue(Arrays.equals(new String[] {"--alpha", "value"},
                new PosixParser().flatten(options, new String[] {"--alpha=value"}, false)));
    }

    public void testLongOptionWithoutEquals() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha");
        assertTrue(Arrays.equals(new String[] {"--alpha"},
                new PosixParser().flatten(options, new String[] {"--alpha"}, false)));
    }

    public void testEmptyLongOptionValueAfterEquals() throws Exception {
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"--x", ""},
                new PosixParser().flatten(options, new String[] {"--x="}, false)));
    }

    public void testSingleHyphenIsPreserved() throws Exception {
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"-"},
                new PosixParser().flatten(options, new String[] {"-"}, false)));
    }

    public void testDoubleHyphenIsPreserved() throws Exception {
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"--"},
                new PosixParser().flatten(options, new String[] {"--"}, false)));
    }

    public void testRecognizedShortOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        assertTrue(Arrays.equals(new String[] {"-a"},
                new PosixParser().flatten(options, new String[] {"-a"}, false)));
    }

    public void testUnknownShortOptionIgnoredWhenNotStopping() throws Exception {
        Options options = new Options();
        assertTrue(Arrays.equals(new String[0],
                new PosixParser().flatten(options, new String[] {"-z"}, false)));
    }

    public void testUnknownShortOptionBeginsRemainderWhenStopping() throws Exception {
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"-z", "tail"},
                new PosixParser().flatten(options, new String[] {"-z", "tail"}, true)));
    }

    public void testNonOptionIsPreservedWhenNotStopping() throws Exception {
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"word", "-a"},
                new PosixParser().flatten(options, new String[] {"word", "-a"}, false)));
    }

    public void testNonOptionAddsTerminatorAndRemainingArgumentsWhenStopping() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        assertTrue(Arrays.equals(new String[] {"--", "word", "-a"},
                new PosixParser().flatten(options, new String[] {"word", "-a"}, true)));
    }

    public void testShortOptionArgumentConsumesFollowingWord() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "a");
        assertTrue(Arrays.equals(new String[] {"-a", "value"},
                new PosixParser().flatten(options, new String[] {"-a", "value"}, false)));
    }

    public void testShortOptionArgumentAttachedToBurstToken() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "a");
        assertTrue(Arrays.equals(new String[] {"-a", "value"},
                new PosixParser().flatten(options, new String[] {"-avalue"}, false)));
    }

    public void testBurstRecognizedFlags() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        options.addOption("b", false, "b");
        assertTrue(Arrays.equals(new String[] {"-a", "-b"},
                new PosixParser().flatten(options, new String[] {"-ab"}, false)));
    }

    public void testBurstUnknownCharacterPreservesWholeTokenWhenNotStopping() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        assertTrue(Arrays.equals(new String[] {"-ax"},
                new PosixParser().flatten(options, new String[] {"-ax"}, false)));
    }

    public void testBurstUnknownCharacterStopsAndAddsRemainder() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        assertTrue(Arrays.equals(new String[] {"-a", "--", "x", "tail"},
                new PosixParser().flatten(options, new String[] {"-ax", "tail"}, true)));
    }

    public void testBurstArgumentConsumesRemainingCharacters() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "a");
        assertTrue(Arrays.equals(new String[] {"-a", "bc"},
                new PosixParser().flatten(options, new String[] {"-abc"}, false)));
    }

    public void testRecognizedLongNamedHyphenTokenIsPreserved() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha");
        assertTrue(Arrays.equals(new String[] {"-alpha"},
                new PosixParser().flatten(options, new String[] {"-alpha"}, false)));
    }

    public void testLongOptionSplitsAtFirstEqualsOnly() throws Exception {
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"--x", "a=b"},
                new PosixParser().flatten(options, new String[] {"--x=a=b"}, false)));
    }
}
