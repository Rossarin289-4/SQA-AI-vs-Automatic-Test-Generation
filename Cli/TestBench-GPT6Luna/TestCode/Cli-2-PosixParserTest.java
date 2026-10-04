package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PosixParserTest extends TestCase {
    public void testSeparatesLongOptionEquals() throws Exception {
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(new Options(), new String[] {"--mode=fast"}, false);
        assertTrue(Arrays.equals(new String[] {"--mode", "fast"}, result));
    }

    public void testLongOptionWithoutEqualsStaysWhole() throws Exception {
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(new Options(), new String[] {"--mode"}, false);
        assertTrue(Arrays.equals(new String[] {"--mode"}, result));
    }

    public void testLongOptionWithEmptyValue() throws Exception {
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(new Options(), new String[] {"--mode="}, false);
        assertTrue(Arrays.equals(new String[] {"--mode", ""}, result));
    }

    public void testSingleHyphenIsPreserved() throws Exception {
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(new Options(), new String[] {"-"}, false);
        assertTrue(Arrays.equals(new String[] {"-"}, result));
    }

    public void testKnownShortOptionIsPreserved() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, new String[] {"-a"}, false);
        assertTrue(Arrays.equals(new String[] {"-a"}, result));
    }

    public void testUnknownShortOptionIgnoredWhenNotStopping() throws Exception {
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(new Options(), new String[] {"-z", "word"}, false);
        assertTrue(Arrays.equals(new String[] {"word"}, result));
    }

    public void testUnknownShortOptionStopsAndKeepsRest() throws Exception {
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(new Options(), new String[] {"-z", "word"}, true);
        assertTrue(Arrays.equals(new String[] {"word"}, result));
    }

    public void testKnownShortOptionAndItsArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "value");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, new String[] {"-a", "value"}, false);
        assertTrue(Arrays.equals(new String[] {"-a", "value"}, result));
    }

    public void testNonOptionStopsWithMarker() throws Exception {
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(new Options(), new String[] {"word", "next"}, true);
        assertTrue(Arrays.equals(new String[] {"--", "word", "next"}, result));
    }

    public void testNonOptionIsKeptWithoutMarkerWhenNotStopping() throws Exception {
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(new Options(), new String[] {"word", "next"}, false);
        assertTrue(Arrays.equals(new String[] {"word", "next"}, result));
    }

    public void testKnownShortFlagsBurst() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "first");
        options.addOption("b", false, "second");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, new String[] {"-ab"}, false);
        assertTrue(Arrays.equals(new String[] {"-a", "-b"}, result));
    }

    public void testUnknownBurstIsPreservedWhenNotStopping() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "first");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, new String[] {"-az"}, false);
        assertTrue(Arrays.equals(new String[] {"-az"}, result));
    }

    public void testUnknownBurstStopsWithRemainingCharacters() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "first");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, new String[] {"-az", "tail"}, true);
        assertTrue(Arrays.equals(new String[] {"-a", "--", "z", "tail"}, result));
    }

    public void testBurstArgumentConsumesRemainingCharacters() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "value");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, new String[] {"-avalue"}, false);
        assertTrue(Arrays.equals(new String[] {"-a", "value"}, result));
    }

    public void testBurstArgumentWithoutRemainderIsFollowedByNextToken() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "value");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, new String[] {"-a", "value"}, false);
        assertTrue(Arrays.equals(new String[] {"-a", "value"}, result));
    }

    public void testRecognizedLongOptionTokenIsPreserved() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "flag");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, new String[] {"--alpha"}, false);
        assertTrue(Arrays.equals(new String[] {"--alpha"}, result));
    }

    public void testUnknownLongOptionTokenIsBurst() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "first");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, new String[] {"-ab"}, false);
        assertTrue(Arrays.equals(new String[] {"-a", "-ab"}, result));
    }

    public void testFlattenResetsStateBetweenCalls() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        parser.flatten(options, new String[] {"word"}, true);
        String[] result = parser.flatten(options, new String[] {"-a"}, false);
        assertTrue(Arrays.equals(new String[] {"-a"}, result));
    }
}
