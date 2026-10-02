package generators.lang;

import generators.common.Candidate;
import generators.common.CandidateProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lang7NumberUtilsCandidateProvider implements CandidateProvider {

    @Override
    public List<Candidate> buildCandidates() {
        List<Candidate> candidates = new ArrayList<Candidate>();

        candidates.add(candidate(
                "double_minus_integer_1",
                "expectNumberFormatException(\"--1\");",
                "DEFECT_TARGET",
                "DOUBLE_MINUS",
                "INTEGER_FORM"));

        candidates.add(candidate(
                "double_minus_integer_large",
                "expectNumberFormatException(\"--123456789\");",
                "DEFECT_TARGET",
                "DOUBLE_MINUS",
                "INTEGER_FORM"));

        candidates.add(candidate(
                "double_minus_zero",
                "expectNumberFormatException(\"--0\");",
                "DEFECT_TARGET",
                "DOUBLE_MINUS",
                "ZERO_BOUNDARY"));

        candidates.add(candidate(
                "double_minus_decimal",
                "expectNumberFormatException(\"--0.5\");",
                "DEFECT_TARGET",
                "DOUBLE_MINUS",
                "DECIMAL_FORM"));

        candidates.add(candidate(
                "double_minus_decimal_large",
                "expectNumberFormatException(\"--12345.6789\");",
                "DEFECT_TARGET",
                "DOUBLE_MINUS",
                "DECIMAL_FORM"));

        candidates.add(candidate(
                "double_minus_exponent",
                "expectNumberFormatException(\"--1e3\");",
                "DEFECT_TARGET",
                "DOUBLE_MINUS",
                "EXPONENT_FORM"));

        candidates.add(candidate(
                "double_minus_negative_decimal",
                "expectNumberFormatException(\"--999.25\");",
                "DEFECT_TARGET",
                "DOUBLE_MINUS",
                "DECIMAL_FORM"));

        candidates.add(candidate(
                "double_minus_whitespace",
                "expectNumberFormatException(\"  --42  \");",
                "DEFECT_TARGET",
                "DOUBLE_MINUS",
                "WHITESPACE"));

        candidates.add(candidate(
                "baseline_integer",
                "assertTrue(NumberUtils.createNumber(\"1\") instanceof Integer);",
                "BASELINE",
                "VALID_INTEGER"));

        candidates.add(candidate(
                "baseline_negative_integer",
                "assertTrue(NumberUtils.createNumber(\"-1\") instanceof Integer);",
                "BASELINE",
                "VALID_INTEGER"));

        candidates.add(candidate(
                "baseline_decimal",
                "assertNotNull(NumberUtils.createNumber(\"1.5\"));",
                "BASELINE",
                "VALID_DECIMAL"));

        candidates.add(candidate(
                "baseline_hex",
                "assertNotNull(NumberUtils.createNumber(\"0x10\"));",
                "BASELINE",
                "VALID_HEX"));

        return candidates;
    }

    private Candidate candidate(
            String name,
            String testCode,
            String... features) {

        return new Candidate(
                name,
                testCode,
                new HashSet<String>(Arrays.asList(features)));
    }

    @Override
    public double fitness(
            List<Candidate> candidates,
            boolean[] state) {

        Set<String> covered = new HashSet<String>();
        int selectedCount = 0;

        for (int i = 0; i < state.length; i++) {
            if (!state[i]) {
                continue;
            }

            selectedCount++;
            covered.addAll(
                    candidates.get(i).getFeatures());
        }

        double score = covered.size();

        if (covered.contains("DEFECT_TARGET")) {
            score += 8.0;
        }

        if (covered.contains("DOUBLE_MINUS")) {
            score += 6.0;
        }

        if (covered.contains("INTEGER_FORM")) {
            score += 2.0;
        }

        if (covered.contains("DECIMAL_FORM")) {
            score += 2.0;
        }

        if (covered.contains("EXPONENT_FORM")) {
            score += 2.0;
        }

        if (covered.contains("ZERO_BOUNDARY")) {
            score += 2.0;
        }

        if (covered.contains("WHITESPACE")) {
            score += 2.0;
        }

        score -= Math.abs(selectedCount - 12) * 2.0;

        return score;
    }

    @Override
    public String generateTestSuite(
            List<Candidate> candidates,
            boolean[] state,
            String packageName,
            String className) {

        StringBuilder code = new StringBuilder();

        code.append("package ")
            .append(packageName)
            .append(";\n\n");

        code.append(
                "import static org.junit.Assert.assertNotNull;\n");

        code.append(
                "import static org.junit.Assert.assertTrue;\n");

        code.append(
                "import static org.junit.Assert.fail;\n");

        code.append(
                "import org.apache.commons.lang3.math.NumberUtils;\n");

        code.append(
                "import org.junit.Test;\n\n");

        code.append("public class ")
            .append(className)
            .append(" {\n\n");

        int testNumber = 1;

        for (int i = 0; i < state.length; i++) {

            if (!state[i]) {
                continue;
            }

            Candidate candidate = candidates.get(i);

            code.append("    @Test\n");

            code.append("    public void test");

            if (testNumber < 10) {
                code.append("0");
            }

            code.append(testNumber)
                .append("_")
                .append(candidate.getName())
                .append("() {\n");

            code.append("        ")
                .append(candidate.getTestCode())
                .append("\n");

            code.append("    }\n\n");

            testNumber++;
        }

        code.append(
                "    private void expectNumberFormatException(" +
                "String value) {\n");

        code.append("        try {\n");

        code.append(
                "            NumberUtils.createNumber(value);\n");

        code.append(
                "            fail(\"Expected NumberFormatException for: \" " +
                "+ value);\n");

        code.append(
                "        } catch (NumberFormatException expected) {\n");

        code.append(
                "            // expected\n");

        code.append("        }\n");

        code.append("    }\n");

        code.append("}\n");

        return code.toString();
    }
}
