package generators.lang;

import generators.common.Candidate;
import generators.common.CandidateProvider;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Lang1NumberUtilsCandidateProvider
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
         * 8 significant hex digits:
         *
         * First significant digit <= 7
         * -> Integer
         */
        candidates.add(candidate(
                "hex8_integer_lower",
                "assertEquals(Integer.valueOf(\"1234ABCD\", 16), "
                        + "NumberUtils.createNumber(\"0x1234ABCD\"));",
                "HEX",
                "HEX_8",
                "SIGNIFICANT_DIGIT_LE_7",
                "INTEGER"));

        candidates.add(candidate(
                "hex8_integer_lower_2",
                "assertEquals(Integer.valueOf(\"3456BCDE\", 16), "
                        + "NumberUtils.createNumber(\"0x3456BCDE\"));",
                "HEX",
                "HEX_8",
                "SIGNIFICANT_DIGIT_LE_7",
                "INTEGER"));

        /*
         * 8 significant hex digits:
         *
         * First significant digit > 7
         * -> Long
         *
         * These are defect-targeting candidates.
         */
        candidates.add(candidate(
                "hex8_long_upper",
                "assertEquals(Long.valueOf(\"A1234567\", 16), "
                        + "NumberUtils.createNumber(\"0xA1234567\"));",
                "HEX",
                "HEX_8",
                "SIGNIFICANT_DIGIT_GT_7",
                "LONG",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "hex8_long_upper_2",
                "assertEquals(Long.valueOf(\"C7654321\", 16), "
                        + "NumberUtils.createNumber(\"0xC7654321\"));",
                "HEX",
                "HEX_8",
                "SIGNIFICANT_DIGIT_GT_7",
                "LONG",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "hex8_long_upper_3",
                "assertEquals(Long.valueOf(\"F1234ABC\", 16), "
                        + "NumberUtils.createNumber(\"0xF1234ABC\"));",
                "HEX",
                "HEX_8",
                "SIGNIFICANT_DIGIT_GT_7",
                "LONG",
                "DEFECT_TARGET"));

        /*
         * 8 significant digits with leading zeros.
         *
         * The leading zeros must not change the significant
         * digit count or the resulting numeric type.
         */
        candidates.add(candidate(
                "hex8_leading_zero_integer",
                "assertEquals(Integer.valueOf(\"1234ABCD\", 16), "
                        + "NumberUtils.createNumber(\"0x001234ABCD\"));",
                "HEX",
                "HEX_8",
                "LEADING_ZERO",
                "SIGNIFICANT_DIGIT_LE_7",
                "INTEGER"));

        candidates.add(candidate(
                "hex8_leading_zero_long",
                "assertEquals(Long.valueOf(\"A1234567\", 16), "
                        + "NumberUtils.createNumber(\"0x000A1234567\"));",
                "HEX",
                "HEX_8",
                "LEADING_ZERO",
                "SIGNIFICANT_DIGIT_GT_7",
                "LONG",
                "DEFECT_TARGET"));

        /*
         * 16 significant hex digits:
         *
         * First significant digit <= 7
         * -> Long
         */
        candidates.add(candidate(
                "hex16_long_lower",
                "assertEquals(Long.valueOf(\"1234567890ABCDEF\", 16), "
                        + "NumberUtils.createNumber(\"0x1234567890ABCDEF\"));",
                "HEX",
                "HEX_16",
                "SIGNIFICANT_DIGIT_LE_7",
                "LONG"));

        candidates.add(candidate(
                "hex16_long_lower_2",
                "assertEquals(Long.valueOf(\"7ABCDEF012345678\", 16), "
                        + "NumberUtils.createNumber(\"0x7ABCDEF012345678\"));",
                "HEX",
                "HEX_16",
                "SIGNIFICANT_DIGIT_LE_7",
                "LONG"));

        /*
         * 16 significant hex digits:
         *
         * First significant digit > 7
         * -> BigInteger
         *
         * These directly target the second defect boundary.
         */
        candidates.add(candidate(
                "hex16_big_integer_upper",
                "assertEquals(new BigInteger(\"9ABCDEF012345678\", 16), "
                        + "NumberUtils.createNumber(\"0x9ABCDEF012345678\"));",
                "HEX",
                "HEX_16",
                "SIGNIFICANT_DIGIT_GT_7",
                "BIG_INTEGER",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "hex16_big_integer_upper_2",
                "assertEquals(new BigInteger(\"A123456789ABCDEF\", 16), "
                        + "NumberUtils.createNumber(\"0xA123456789ABCDEF\"));",
                "HEX",
                "HEX_16",
                "SIGNIFICANT_DIGIT_GT_7",
                "BIG_INTEGER",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "hex16_big_integer_upper_3",
                "assertEquals(new BigInteger(\"FEDCBA9876543210\", 16), "
                        + "NumberUtils.createNumber(\"0xFEDCBA9876543210\"));",
                "HEX",
                "HEX_16",
                "SIGNIFICANT_DIGIT_GT_7",
                "BIG_INTEGER",
                "DEFECT_TARGET"));

        /*
         * 16 significant digits with leading zeros.
         */
        candidates.add(candidate(
                "hex16_leading_zero_long",
                "assertEquals(Long.valueOf(\"1234567890ABCDEF\", 16), "
                        + "NumberUtils.createNumber(\"0x0001234567890ABCDEF\"));",
                "HEX",
                "HEX_16",
                "LEADING_ZERO",
                "SIGNIFICANT_DIGIT_LE_7",
                "LONG"));

        candidates.add(candidate(
                "hex16_leading_zero_big_integer",
                "assertEquals(new BigInteger(\"9ABCDEF012345678\", 16), "
                        + "NumberUtils.createNumber(\"0x00009ABCDEF012345678\"));",
                "HEX",
                "HEX_16",
                "LEADING_ZERO",
                "SIGNIFICANT_DIGIT_GT_7",
                "BIG_INTEGER",
                "DEFECT_TARGET"));

        /*
         * Alternative hexadecimal prefix (#).
         */
        candidates.add(candidate(
                "hash_hex8_long",
                "assertEquals(Long.valueOf(\"B2345678\", 16), "
                        + "NumberUtils.createNumber(\"#B2345678\"));",
                "HEX",
                "HEX_8",
                "SIGNIFICANT_DIGIT_GT_7",
                "LONG",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "hash_hex16_big_integer",
                "assertEquals(new BigInteger(\"C1234567890ABCDE\", 16), "
                        + "NumberUtils.createNumber(\"#C1234567890ABCDE\"));",
                "HEX",
                "HEX_16",
                "SIGNIFICANT_DIGIT_GT_7",
                "BIG_INTEGER",
                "DEFECT_TARGET"));

        /*
         * Additional non-defect boundary candidates.
         */
        candidates.add(candidate(
                "hex7_integer",
                "assertEquals(Integer.valueOf(\"1234567\", 16), "
                        + "NumberUtils.createNumber(\"0x1234567\"));",
                "HEX",
                "HEX_7",
                "INTEGER"));

        candidates.add(candidate(
                "hex9_long",
                "assertEquals(Long.valueOf(\"123456789\", 16), "
                        + "NumberUtils.createNumber(\"0x123456789\"));",
                "HEX",
                "HEX_9",
                "LONG"));

        candidates.add(candidate(
                "hex15_long",
                "assertEquals(Long.valueOf(\"1234567890ABCDE\", 16), "
                        + "NumberUtils.createNumber(\"0x1234567890ABCDE\"));",
                "HEX",
                "HEX_15",
                "LONG"));

        candidates.add(candidate(
                "hex17_big_integer",
                "assertEquals(new BigInteger(\"1234567890ABCDEF0\", 16), "
                        + "NumberUtils.createNumber(\"0x1234567890ABCDEF0\"));",
                "HEX",
                "HEX_17",
                "BIG_INTEGER"));

        return candidates;
    }

    @Override
    public double fitness(
            List<Candidate> candidates,
            boolean[] state) {

        double score = 0.0;
        Set<String> covered = new LinkedHashSet<String>();
        int selected = 0;

        for (int i = 0; i < candidates.size(); i++) {
            if (!state[i]) {
                continue;
            }

            selected++;

            Candidate candidate = candidates.get(i);

            for (String feature : candidate.getFeatures()) {
                if (covered.add(feature)) {
                    score += 1.0;
                }
            }

            /*
             * Strongly prioritize candidates that exercise
             * the actual Lang-747 boundary conditions.
             */
            if (candidate.getFeatures().contains("DEFECT_TARGET")) {
                score += 4.0;
            }

            if (candidate.getFeatures().contains("LEADING_ZERO")) {
                score += 1.5;
            }

            if (candidate.getFeatures().contains("SIGNIFICANT_DIGIT_GT_7")) {
                score += 2.0;
            }

            if (candidate.getFeatures().contains("HEX_8")
                    || candidate.getFeatures().contains("HEX_16")) {
                score += 1.0;
            }
        }

        /*
         * Prefer a suite of exactly 12 tests.
         */
        score -= Math.abs(selected - 12) * 2.0;

        return score;
    }

    @Override
    public String generateTestSuite(
            List<Candidate> candidates,
            boolean[] state,
            String packageName,
            String className) {

        StringBuilder out = new StringBuilder();

        out.append("package ")
                .append(packageName)
                .append(";\n\n");

        out.append("import static org.junit.Assert.assertEquals;\n");
        out.append("import org.apache.commons.lang3.math.NumberUtils;\n");
        out.append("import java.math.BigInteger;\n");
        out.append("import org.junit.Test;\n\n");

        out.append("public class ")
                .append(className)
                .append(" {\n\n");

        int testNumber = 1;

        for (int i = 0; i < candidates.size(); i++) {
            if (!state[i]) {
                continue;
            }

            Candidate candidate = candidates.get(i);

            out.append("    @Test\n");
            out.append("    public void test")
                    .append(String.format("%02d", testNumber))
                    .append("_")
                    .append(candidate.getName())
                    .append("() {\n");

            out.append("        ")
                    .append(candidate.getTestCode())
                    .append("\n");

            out.append("    }\n\n");

            testNumber++;
        }

        out.append("}\n");

        return out.toString();
    }
}
