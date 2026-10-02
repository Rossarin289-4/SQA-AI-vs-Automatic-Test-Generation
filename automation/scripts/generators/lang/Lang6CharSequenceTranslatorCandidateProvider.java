package generators.lang;

import generators.common.Candidate;
import generators.common.CandidateProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Lang6CharSequenceTranslatorCandidateProvider implements CandidateProvider {

    @Override
    public List<Candidate> buildCandidates() {
        List<Candidate> candidates = new ArrayList<Candidate>();

        candidates.add(candidate(
                "bmp_single",
                "testBmpSingle",
                "BMP",
                "BASELINE"));

        candidates.add(candidate(
                "bmp_multiple",
                "testBmpMultiple",
                "BMP",
                "BASELINE"));

        candidates.add(candidate(
                "supplementary_middle",
                "testSupplementaryMiddle",
                "SUPPLEMENTARY",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "supplementary_start",
                "testSupplementaryStart",
                "SUPPLEMENTARY",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "supplementary_end",
                "testSupplementaryEnd",
                "SUPPLEMENTARY",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "two_supplementary",
                "testTwoSupplementary",
                "SUPPLEMENTARY",
                "MULTI_PAIR",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "mixed_bmp_supplementary",
                "testMixedBmpSupplementary",
                "MIXED",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "bmp_before_supplementary",
                "testBmpBeforeSupplementary",
                "MIXED",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "supplementary_before_bmp",
                "testSupplementaryBeforeBmp",
                "MIXED",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "three_codepoints",
                "testThreeCodepoints",
                "MIXED",
                "DEFECT_TARGET"));

        candidates.add(candidate(
                "unicode_bmp",
                "testUnicodeBmp",
                "UNICODE",
                "BASELINE"));

        candidates.add(candidate(
                "empty_input",
                "testEmptyInput",
                "BOUNDARY",
                "BASELINE"));

        return candidates;
    }

    private Candidate candidate(
            String name,
            String methodName,
            String... features) {

        Set<String> featureSet =
                new LinkedHashSet<String>(Arrays.asList(features));

        return new Candidate(
                name,
                buildTestCode(methodName),
                featureSet);
    }

    private String buildTestCode(String methodName) {

        if ("testBmpSingle".equals(methodName)) {
            return
                "@Test\n" +
                "public void testBmpSingle() {\n" +
                "    assertEquals(\"A\", StringEscapeUtils.escapeCsv(\"A\"));\n" +
                "}\n";
        }

        if ("testBmpMultiple".equals(methodName)) {
            return
                "@Test\n" +
                "public void testBmpMultiple() {\n" +
                "    assertEquals(\"ABC\", StringEscapeUtils.escapeCsv(\"ABC\"));\n" +
                "}\n";
        }

        if ("testSupplementaryMiddle".equals(methodName)) {
            return
                "@Test\n" +
                "public void testSupplementaryMiddle() {\n" +
                "    String input = \"A\\uD83D\\uDE00B\";\n" +
                "    assertEquals(input, StringEscapeUtils.escapeCsv(input));\n" +
                "}\n";
        }

        if ("testSupplementaryStart".equals(methodName)) {
            return
                "@Test\n" +
                "public void testSupplementaryStart() {\n" +
                "    String input = \"\\uD83D\\uDE00ABC\";\n" +
                "    assertEquals(input, StringEscapeUtils.escapeCsv(input));\n" +
                "}\n";
        }

        if ("testSupplementaryEnd".equals(methodName)) {
            return
                "@Test\n" +
                "public void testSupplementaryEnd() {\n" +
                "    String input = \"ABC\\uD83D\\uDE00\";\n" +
                "    assertEquals(input, StringEscapeUtils.escapeCsv(input));\n" +
                "}\n";
        }

        if ("testTwoSupplementary".equals(methodName)) {
            return
                "@Test\n" +
                "public void testTwoSupplementary() {\n" +
                "    String input = \"\\uD83D\\uDE00\\uD83C\\uDF0D\";\n" +
                "    assertEquals(input, StringEscapeUtils.escapeCsv(input));\n" +
                "}\n";
        }

        if ("testMixedBmpSupplementary".equals(methodName)) {
            return
                "@Test\n" +
                "public void testMixedBmpSupplementary() {\n" +
                "    String input = \"X\\uD83D\\uDC36Y\";\n" +
                "    assertEquals(input, StringEscapeUtils.escapeCsv(input));\n" +
                "}\n";
        }

        if ("testBmpBeforeSupplementary".equals(methodName)) {
            return
                "@Test\n" +
                "public void testBmpBeforeSupplementary() {\n" +
                "    String input = \"AB\\uD83D\\uDC36\";\n" +
                "    assertEquals(input, StringEscapeUtils.escapeCsv(input));\n" +
                "}\n";
        }

        if ("testSupplementaryBeforeBmp".equals(methodName)) {
            return
                "@Test\n" +
                "public void testSupplementaryBeforeBmp() {\n" +
                "    String input = \"\\uD83D\\uDC36AB\";\n" +
                "    assertEquals(input, StringEscapeUtils.escapeCsv(input));\n" +
                "}\n";
        }

        if ("testThreeCodepoints".equals(methodName)) {
            return
                "@Test\n" +
                "public void testThreeCodepoints() {\n" +
                "    String input = \"A\\uD83D\\uDC36C\";\n" +
                "    assertEquals(input, StringEscapeUtils.escapeCsv(input));\n" +
                "}\n";
        }

        if ("testUnicodeBmp".equals(methodName)) {
            return
                "@Test\n" +
                "public void testUnicodeBmp() {\n" +
                "    String input = \"\\u00E9\\u03A9\\u4E2D\";\n" +
                "    assertEquals(input, StringEscapeUtils.escapeCsv(input));\n" +
                "}\n";
        }

        if ("testEmptyInput".equals(methodName)) {
            return
                "@Test\n" +
                "public void testEmptyInput() {\n" +
                "    assertEquals(\"\", StringEscapeUtils.escapeCsv(\"\"));\n" +
                "}\n";
        }

        throw new IllegalArgumentException(
                "Unknown generated test method: " + methodName);
    }

    @Override
    public double fitness(
            List<Candidate> candidates,
            boolean[] state) {

        double score = 0.0;

        int selectedCount = 0;

        for (int i = 0; i < candidates.size(); i++) {
            if (!state[i]) {
                continue;
            }

            selectedCount++;

            Candidate candidate = candidates.get(i);
            Set<String> features = candidate.getFeatures();

            if (features.contains("DEFECT_TARGET")) {
                score += 6.0;
            }

            if (features.contains("SUPPLEMENTARY")) {
                score += 5.0;
            }

            if (features.contains("MIXED")) {
                score += 3.0;
            }

            if (features.contains("MULTI_PAIR")) {
                score += 3.0;
            }

            if (features.contains("BASELINE")) {
                score += 1.0;
            }
        }

        score -= Math.abs(selectedCount - 12) * 2.0;

        return score;
    }

    @Override
    public String generateTestSuite(
            List<Candidate> candidates,
            boolean[] selected,
            String packageName,
            String className) {

        StringBuilder sb = new StringBuilder();

        sb.append("package ")
          .append(packageName)
          .append(";\n\n");

        sb.append("import static org.junit.Assert.assertEquals;\n");
        sb.append("import org.junit.Test;\n");
        sb.append("import org.apache.commons.lang3.StringEscapeUtils;\n\n");

        sb.append("public class ")
          .append(className)
          .append(" {\n\n");

        for (int i = 0; i < candidates.size(); i++) {
            if (!selected[i]) {
                continue;
            }

            sb.append("    ")
              .append(candidates.get(i).getTestCode()
              .replace("\n", "\n    "))
              .append("\n");
        }

        sb.append("}\n");

        return sb.toString();
    }
}
