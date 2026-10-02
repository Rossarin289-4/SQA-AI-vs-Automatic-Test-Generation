package generators.lang;

import generators.common.Candidate;
import generators.common.CandidateProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Lang3NumberUtilsCandidateProvider
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
         * Lang-3 / LANG-693
         *
         * Method:
         * NumberUtils.createNumber(String)
         *
         * Defect:
         * The buggy implementation always attempts Float before
         * Double for decimal/exponent values.
         *
         * The fixed implementation uses the number of digits
         * after the decimal point:
         *
         *   <= 7  -> Float
         *   8-16  -> Double
         *   > 16  -> BigDecimal
         *
         * Original trigger values are intentionally excluded.
         */

        /*
         * 7 decimal digits:
         * Float is still the expected representation.
         */
        candidates.add(candidate(
                "seven_decimal_digits",
                "assertEquals(Float.class, NumberUtils.createNumber(\"12345.1234567\").getClass());",
                "DECIMAL",
                "DECIMAL_DIGITS_7",
                "FLOAT_EXPECTED"));

        candidates.add(candidate(
                "seven_decimal_digits_small",
                "assertEquals(Float.class, NumberUtils.createNumber(\"1.2345678\").getClass());",
                "DECIMAL",
                "DECIMAL_DIGITS_7",
                "FLOAT_EXPECTED"));

        /*
         * 8-16 decimal digits:
         * These are the main defect-targeting cases.
         * Buggy version may return Float.
         * Fixed version returns Double.
         */
        candidates.add(candidate(
                "eight_decimal_digits",
                "assertEquals(Double.class, NumberUtils.createNumber(\"12345.12345678\").getClass());",
                "DECIMAL",
                "DECIMAL_DIGITS_8",
                "DOUBLE_EXPECTED",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "eight_decimal_digits_small",
                "assertEquals(Double.class, NumberUtils.createNumber(\"1.23456789\").getClass());",
                "DECIMAL",
                "DECIMAL_DIGITS_8",
                "DOUBLE_EXPECTED",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "twelve_decimal_digits",
                "assertEquals(Double.class, NumberUtils.createNumber(\"1234567.890123456789\").getClass());",
                "DECIMAL",
                "DECIMAL_DIGITS_12",
                "DOUBLE_EXPECTED",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "sixteen_decimal_digits",
                "assertEquals(Double.class, NumberUtils.createNumber(\"1234567.8901234567890123\").getClass());",
                "DECIMAL",
                "DECIMAL_DIGITS_16",
                "DOUBLE_EXPECTED",
                "DEFECT_TARGET"));

        /*
         * Exponent notation with 8-16 digits after the decimal point.
         */
        candidates.add(candidate(
                "exponent_eight_decimal_digits",
                "assertEquals(Double.class, NumberUtils.createNumber(\"1.23456789e10\").getClass());",
                "EXPONENT",
                "DECIMAL_DIGITS_8",
                "DOUBLE_EXPECTED",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "exponent_twelve_decimal_digits",
                "assertEquals(Double.class, NumberUtils.createNumber(\"1.234567890123e10\").getClass());",
                "EXPONENT",
                "DECIMAL_DIGITS_12",
                "DOUBLE_EXPECTED",
                "DEFECT_TARGET"));

        /*
         * More than 16 decimal digits:
         * Fixed implementation reaches BigDecimal.
         */
        candidates.add(candidate(
                "seventeen_decimal_digits",
                "assertEquals(java.math.BigDecimal.class, NumberUtils.createNumber(\"1234567.89012345678901234\").getClass());",
                "DECIMAL",
                "DECIMAL_DIGITS_GT_16",
                "BIG_DECIMAL_EXPECTED",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "long_precision_decimal",
                "assertEquals(java.math.BigDecimal.class, NumberUtils.createNumber(\"0.123456789012345678901\").getClass());",
                "DECIMAL",
                "DECIMAL_DIGITS_GT_16",
                "BIG_DECIMAL_EXPECTED",
                "DEFECT_TARGET"));

        /*
         * Boundary/non-target cases.
         */
        candidates.add(candidate(
                "integer_without_decimal",
                "assertEquals(Integer.class, NumberUtils.createNumber(\"1234567\").getClass());",
                "INTEGER",
                "BASELINE"));

        candidates.add(candidate(
                "simple_decimal",
                "assertEquals(Float.class, NumberUtils.createNumber(\"12.34567\").getClass());",
                "DECIMAL",
                "DECIMAL_DIGITS_5",
                "FLOAT_EXPECTED",
                "BASELINE"));

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

            Candidate candidate = candidates.get(i);

            for (String feature : candidate.getFeatures()) {
                if (covered.add(feature)) {
                    score += 1.0;
                }
            }

            /*
             * Strongly prioritize the actual LANG-693
             * Float-vs-Double precision boundary.
             */
            if (candidate.getFeatures().contains("DEFECT_TARGET")) {
                score += 4.0;
            }

            if (candidate.getFeatures().contains("DOUBLE_EXPECTED")) {
                score += 2.0;
            }

            if (candidate.getFeatures().contains("BIG_DECIMAL_EXPECTED")) {
                score += 2.0;
            }

            if (candidate.getFeatures().contains("EXPONENT")) {
                score += 1.0;
            }
        }

        /*
         * Keep the generated suite comparable with the existing
         * SA/BPSO experiment configuration.
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

        StringBuilder out =
                new StringBuilder();

        out.append("package ")
                .append(packageName)
                .append(";\n\n");

        out.append(
                "import static org.junit.Assert.assertEquals;\n");
        out.append(
                "import org.apache.commons.lang3.math.NumberUtils;\n");
        out.append(
                "import org.junit.Test;\n\n");

        out.append("public class ")
                .append(className)
                .append(" {\n\n");

        int testNumber = 1;

        for (int i = 0; i < candidates.size(); i++) {

            if (!state[i]) {
                continue;
            }

            Candidate candidate =
                    candidates.get(i);

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
