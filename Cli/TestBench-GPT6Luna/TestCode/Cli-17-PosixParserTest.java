package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PosixParserTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testLongOptionWithEquals() throws Exception {
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(new Options(), new String[] {"--name=value"}, false);
        assertTrue(Arrays.equals(new String[] {"--name", "value"}, actual));
    }

    public void testLongOptionWithEmptyValue() throws Exception {
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(new Options(), new String[] {"--name="}, false);
        assertTrue(Arrays.equals(new String[] {"--name", ""}, actual));
    }

    public void testLongOptionWithoutEquals() throws Exception {
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(new Options(), new String[] {"--name"}, false);
        assertTrue(Arrays.equals(new String[] {"--name"}, actual));
    }

    public void testDoubleHyphenAlone() throws Exception {
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(new Options(), new String[] {"--"}, false);
        assertTrue(Arrays.equals(new String[] {"--"}, actual));
    }

    public void testSingleHyphenAlone() throws Exception {
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(new Options(), new String[] {"-"}, false);
        assertTrue(Arrays.equals(new String[] {"-"}, actual));
    }

    public void testKnownShortOption() throws Exception {
        Options options = new Options().addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(options, new String[] {"-a"}, false);
        assertTrue(Arrays.equals(new String[] {"-a"}, actual));
    }

    public void testUnknownShortOptionIgnoredWhenContinuing() throws Exception {
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(new Options(), new String[] {"-x", "tail"}, false);
        assertTrue(Arrays.equals(new String[] {"tail"}, actual));
    }

    public void testUnknownShortOptionStopsWhenRequested() throws Exception {
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(new Options(), new String[] {"-x", "tail"}, true);
        assertTrue(Arrays.equals(new String[] {"tail"}, actual));
    }

    public void testExactTwoCharacterToken() throws Exception {
        Options options = new Options().addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(options, new String[] {"-a"}, false);
        assertEquals(1, actual.length);
        assertEquals("-a", actual[0]);
    }

    public void testBurstKnownFlags() throws Exception {
        Options options = new Options()
                .addOption("a", false, "flag")
                .addOption("b", false, "flag");
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(options, new String[] {"-ab"}, false);
        assertTrue(Arrays.equals(new String[] {"-a", "-b"}, actual));
    }

    public void testBurstArgumentConsumesRemainder() throws Exception {
        Options options = new Options().addOption("a", true, "argument");
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(options, new String[] {"-avalue"}, false);
        assertTrue(Arrays.equals(new String[] {"-a", "value"}, actual));
    }

    public void testBurstArgumentWithNoRemainder() throws Exception {
        Options options = new Options().addOption("a", true, "argument");
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(options, new String[] {"-a"}, false);
        assertTrue(Arrays.equals(new String[] {"-a"}, actual));
    }

    public void testUnknownBurstContinuesAsWholeToken() throws Exception {
        Options options = new Options().addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(options, new String[] {"-ax"}, false);
        assertTrue(Arrays.equals(new String[] {"-a", "-ax"}, actual));
    }

    public void testUnknownBurstWithStopAddsMarkerAndRemainder() throws Exception {
        Options options = new Options().addOption("a", false, "flag");
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(options, new String[] {"-az", "tail"}, true);
        assertTrue(Arrays.equals(new String[] {"-a", "--", "z", "tail"}, actual));
    }

    public void testNonOptionPassesThroughWhenNotStopping() throws Exception {
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(new Options(), new String[] {"word", "-"}, false);
        assertTrue(Arrays.equals(new String[] {"word", "-"}, actual));
    }

    public void testNonOptionAddsStopMarkerWhenStopping() throws Exception {
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(new Options(), new String[] {"word", "-x"}, true);
        assertTrue(Arrays.equals(new String[] {"--", "word", "-x"}, actual));
    }

    public void testArgumentOptionConsumesFollowingValue() throws Exception {
        Options options = new Options().addOption("a", true, "argument");
        PosixParser parser = new PosixParser();
        String[] actual = parser.flatten(options, new String[] {"-a", "value"}, false);
        assertTrue(Arrays.equals(new String[] {"-a", "value"}, actual));
    }

    public void testRepeatedCallsResetParserState() throws Exception {
        Options options = new Options().addOption("a", true, "argument");
        PosixParser parser = new PosixParser();
        assertTrue(Arrays.equals(new String[] {"-a", "first"},
                parser.flatten(options, new String[] {"-a", "first"}, false)));
        String[] actual = parser.flatten(options, new String[] {"word"}, false);
        assertTrue(Arrays.equals(new String[] {"word"}, actual));
    }
}
