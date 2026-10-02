package generators.lang;

import generators.common.Candidate;
import generators.common.CandidateProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Lang4LookupTranslatorCandidateProvider
        implements CandidateProvider {

    private static Candidate candidate(
            String name,
            String testCode,
            String... features) {

        return new Candidate(
                name,
                testCode,
                new LinkedHashSet<String>(
                        Arrays.asList(features)));
    }

    @Override
    public List<Candidate> buildCandidates() {

        List<Candidate> candidates =
                new ArrayList<Candidate>();

        /*
         * LANG-882 defect-oriented candidates.
         *
         * The buggy implementation keeps CharSequence keys as
         * CharSequence objects and performs lookup using subSeq.
         *
         * The fixed implementation converts both lookup keys and
         * the input subsequence to String.
         *
         * StringBuilder and StringBuffer deliberately exercise
         * non-String CharSequence implementations.
         */

        candidates.add(candidate(
                "string_key_baseline",
                "assertTranslation(new CharSequence[] {\"abc\", \"X\"}, \"abc\", 3, \"X\");",
                "STRING_KEY",
                "BASELINE",
                "MULTI_CHAR"));

        candidates.add(candidate(
                "string_builder_key",
                "assertTranslation(new CharSequence[] {new StringBuilder(\"abc\"), \"X\"}, \"abc\", 3, \"X\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUILDER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "MULTI_CHAR"));

        candidates.add(candidate(
                "string_buffer_key",
                "assertTranslation(new CharSequence[] {new StringBuffer(\"abc\"), \"X\"}, \"abc\", 3, \"X\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUFFER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "MULTI_CHAR"));

        candidates.add(candidate(
                "string_builder_single_char",
                "assertTranslation(new CharSequence[] {new StringBuilder(\"a\"), \"X\"}, \"a\", 1, \"X\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUILDER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "SINGLE_CHAR"));

        candidates.add(candidate(
                "string_buffer_single_char",
                "assertTranslation(new CharSequence[] {new StringBuffer(\"z\"), \"Y\"}, \"z\", 1, \"Y\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUFFER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "SINGLE_CHAR"));

        candidates.add(candidate(
                "builder_long_key",
                "assertTranslation(new CharSequence[] {new StringBuilder(\"abcdef\"), \"VALUE\"}, \"abcdef\", 6, \"VALUE\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUILDER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "MULTI_CHAR",
                "LONG_KEY"));

        candidates.add(candidate(
                "buffer_long_key",
                "assertTranslation(new CharSequence[] {new StringBuffer(\"wxyz\"), \"VALUE\"}, \"wxyz\", 4, \"VALUE\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUFFER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "MULTI_CHAR",
                "LONG_KEY"));

        candidates.add(candidate(
                "builder_overlap_longest",
                "assertTranslation(new CharSequence[] {new StringBuilder(\"ab\"), \"SHORT\", new StringBuilder(\"abc\"), \"LONG\"}, \"abc\", 3, \"LONG\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUILDER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "OVERLAP",
                "LONGEST_MATCH"));

        candidates.add(candidate(
                "buffer_overlap_longest",
                "assertTranslation(new CharSequence[] {new StringBuffer(\"xy\"), \"SHORT\", new StringBuffer(\"xyz\"), \"LONG\"}, \"xyz\", 3, \"LONG\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUFFER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "OVERLAP",
                "LONGEST_MATCH"));

        /*
         * Use Unicode escapes rather than literal non-ASCII characters.
         * This keeps the Java source ASCII-compatible with the current
         * JDK compilation environment.
         */
        candidates.add(candidate(
                "unicode_builder_key",
                "assertTranslation(new CharSequence[] {new StringBuilder(\"\\u0E01\\u0E02\"), \"TH\"}, \"\\u0E01\\u0E02\", 2, \"TH\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUILDER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "UNICODE"));

        candidates.add(candidate(
                "unicode_buffer_key",
                "assertTranslation(new CharSequence[] {new StringBuffer(\"\\u03B1\\u03B2\"), \"GREEK\"}, \"\\u03B1\\u03B2\", 2, \"GREEK\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUFFER",
                "NON_STRING_KEY",
                "TO_STRING_EQUIVALENCE",
                "DEFECT_TARGET",
                "UNICODE"));

        candidates.add(candidate(
                "unmatched_baseline",
                "assertTranslation(new CharSequence[] {new StringBuilder(\"abc\"), \"X\"}, \"abd\", 0, \"\");",
                "CHAR_SEQUENCE_KEY",
                "STRING_BUILDER",
                "NON_STRING_KEY",
                "UNMATCHED",
                "BOUNDARY"));

        return candidates;
    }

    @Override
    public double fitness(
            List<Candidate> candidates,
            boolean[] state) {

        double score = 0.0;

        Set<String> covered =
                new LinkedHashSet<String>();

        int selected = 0;

        for (int i = 0; i < candidates.size(); i++) {

            if (!state[i]) {
                continue;
            }

            selected++;

            Candidate candidate =
                    candidates.get(i);

            for (String feature :
                    candidate.getFeatures()) {

                if (covered.add(feature)) {
                    score += 1.0;
                }
            }

            if (candidate.getFeatures()
                    .contains("DEFECT_TARGET")) {
                score += 6.0;
            }

            if (candidate.getFeatures()
                    .contains("NON_STRING_KEY")) {
                score += 4.0;
            }

            if (candidate.getFeatures()
                    .contains("TO_STRING_EQUIVALENCE")) {
                score += 4.0;
            }

            if (candidate.getFeatures()
                    .contains("STRING_BUILDER")) {
                score += 2.0;
            }

            if (candidate.getFeatures()
                    .contains("STRING_BUFFER")) {
                score += 2.0;
            }

            if (candidate.getFeatures()
                    .contains("LONGEST_MATCH")) {
                score += 2.0;
            }
        }

        score -= Math.abs(selected - 12) * 2.0;

        return score;
    }

    @Override
    public String generateTestSuite(
            List<Candidate> candidates,
            boolean[] state,
            String packageName,
            String className) {

        StringBuilder out =
                new StringBuilder();

        out.append("package ")
                .append(packageName)
                .append(";\n\n");

        out.append(
                "import static org.junit.Assert.assertEquals;\n");

        out.append(
                "import java.io.StringWriter;\n");

        out.append(
                "import org.apache.commons.lang3.text.translate.LookupTranslator;\n");

        out.append(
                "import org.junit.Test;\n\n");

        out.append("public class ")
                .append(className)
                .append(" {\n\n");

        int testNumber = 1;

        for (int i = 0;
             i < state.length;
             i++) {

            if (!state[i]) {
                continue;
            }

            Candidate candidate =
                    candidates.get(i);

            out.append("    @Test\n");

            out.append(
                    "    public void test"
                    + String.format("%02d", testNumber)
                    + "_"
                    + candidate.getName()
                    + "() throws Exception {\n");

            out.append(
                    "        "
                    + candidate.getTestCode()
                    + "\n");

            out.append("    }\n\n");

            testNumber++;
        }

        out.append(
                "    private void assertTranslation("
                + "CharSequence[] lookup, "
                + "String input, "
                + "int expectedConsumed, "
                + "String expectedOutput) throws Exception {\n");

        out.append(
                "        CharSequence[][] table = "
                + "new CharSequence[lookup.length / 2][2];\n");

        out.append(
                "        for (int i = 0; i < lookup.length; i += 2) {\n");

        out.append(
                "            table[i / 2][0] = lookup[i];\n");

        out.append(
                "            table[i / 2][1] = lookup[i + 1];\n");

        out.append(
                "        }\n");

        out.append(
                "        LookupTranslator translator = "
                + "new LookupTranslator(table);\n");

        out.append(
                "        StringWriter writer = new StringWriter();\n");

        out.append(
                "        int consumed = translator.translate("
                + "input, 0, writer);\n");

        out.append(
                "        assertEquals(expectedConsumed, consumed);\n");

        out.append(
                "        assertEquals(expectedOutput, writer.toString());\n");

        out.append(
                "    }\n\n");

        out.append("}\n");

        return out.toString();
    }
}
