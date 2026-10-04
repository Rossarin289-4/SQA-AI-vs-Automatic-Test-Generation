package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PosixParserTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testLongOptionWithEqualsIsSplit() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"--name", "sam"},
                parser.flatten(options, new String[] {"--name=sam"}, false)));
    }

    public void testLongOptionWithoutEqualsIsKept() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"--name"},
                parser.flatten(options, new String[] {"--name"}, false)));
    }

    public void testDoubleDashWithoutEqualsIsKept() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"--"},
                parser.flatten(options, new String[] {"--"}, false)));
    }

    public void testSingleHyphenIsKept() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"-"},
                parser.flatten(options, new String[] {"-"}, false)));
    }

    public void testKnownShortOptionIsKept() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options().addOption("a", false, "flag");
        assertTrue(Arrays.equals(new String[] {"-a"},
                parser.flatten(options, new String[] {"-a"}, false)));
    }

    public void testUnknownShortOptionIsKeptWhenNotStopping() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"-z"},
                parser.flatten(options, new String[] {"-z"}, false)));
    }

    public void testUnknownShortOptionStopsFurtherProcessing() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"-z", "word", "-a"},
                parser.flatten(options, new String[] {"-z", "word", "-a"}, true)));
    }

    public void testOrdinaryArgumentIsKeptWhenNotStopping() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"word", "-a"},
                parser.flatten(options, new String[] {"word", "-a"}, false)));
    }

    public void testOrdinaryArgumentAddsTerminatorAndRemainderWhenStopping() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"--", "word", "-a"},
                parser.flatten(options, new String[] {"word", "-a"}, true)));
    }

    public void testKnownFlagCanBeBurst() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options().addOption("a", false, "flag");
        assertTrue(Arrays.equals(new String[] {"-a"},
                parser.flatten(options, new String[] {"-a"}, false)));
    }

    public void testKnownFlagBurstWithUnknownCharacterKeepsWholeToken() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options().addOption("a", false, "flag");
        assertTrue(Arrays.equals(new String[] {"-a", "-ax"},
                parser.flatten(options, new String[] {"-a", "-ax"}, false)));
    }

    public void testUnknownCharacterInBurstIsTerminatedWhenStopping() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options().addOption("a", false, "flag");
        assertTrue(Arrays.equals(new String[] {"-a", "--", "x", "-b"},
                parser.flatten(options, new String[] {"-ax", "-b"}, true)));
    }

    public void testKnownArgumentOptionConsumesRemainingBurstCharacters() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options().addOption("o", true, "value");
        assertTrue(Arrays.equals(new String[] {"-o", "value"},
                parser.flatten(options, new String[] {"-ovalue"}, false)));
    }

    public void testKnownArgumentOptionConsumesNextArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options().addOption("o", true, "value");
        assertTrue(Arrays.equals(new String[] {"-o", "value"},
                parser.flatten(options, new String[] {"-o", "value"}, false)));
    }

    public void testKnownFlagBurstContinuesAcrossCharacters() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options()
                .addOption("a", false, "first")
                .addOption("b", false, "second");
        assertTrue(Arrays.equals(new String[] {"-a", "-b"},
                parser.flatten(options, new String[] {"-ab"}, false)));
    }

    public void testLongOptionEqualsWithEmptyValueKeepsEmptyToken() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] actual = parser.flatten(options, new String[] {"--name="}, false);
        assertEquals(2, actual.length);
        assertEquals("--name", actual[0]);
        assertEquals("", actual[1]);
    }

    public void testLongOptionEqualsSplitsAtFirstEquals() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"--name", "a=b"},
                parser.flatten(options, new String[] {"--name=a=b"}, false)));
    }

    public void testParserResetsStateBetweenCalls() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        assertTrue(Arrays.equals(new String[] {"--", "word"},
                parser.flatten(options, new String[] {"word"}, true)));
        assertTrue(Arrays.equals(new String[] {"-a"},
                parser.flatten(options, new String[] {"-a"}, false)));
    }
}
