package generators.lang;

import generators.common.Candidate;
import generators.common.CandidateProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lang5LocaleUtilsCandidateProvider
        implements CandidateProvider {

    @Override
    public List<Candidate> buildCandidates() {

        List<Candidate> candidates =
                new ArrayList<Candidate>();

        /*
         * Lang-5 / LANG-865
         *
         * Method:
         * LocaleUtils.toLocale(String)
         *
         * Defect-relevant behavior:
         *
         * 1. Language-only locale
         * 2. Language + country locale
         * 3. Language + country + variant
         * 4. Country-only locale beginning with "_"
         * 5. Invalid language format
         * 6. Invalid country format
         * 7. Invalid separator
         * 8. Boundary lengths
         *
         * Original trigger values are intentionally excluded.
         */

        candidates.add(candidate(
                "language_only_en",
                "assertEquals(\"en\", LocaleUtils.toLocale(\"en\").getLanguage());",
                "LANGUAGE_ONLY"));

        candidates.add(candidate(
                "language_only_th",
                "assertEquals(\"th\", LocaleUtils.toLocale(\"th\").getLanguage());",
                "LANGUAGE_ONLY"));

        candidates.add(candidate(
                "language_country_en_us",
                "assertEquals(\"US\", LocaleUtils.toLocale(\"en_US\").getCountry());",
                "LANGUAGE_COUNTRY"));

        candidates.add(candidate(
                "language_country_fr_ca",
                "assertEquals(\"CA\", LocaleUtils.toLocale(\"fr_CA\").getCountry());",
                "LANGUAGE_COUNTRY"));

        candidates.add(candidate(
                "language_country_variant",
                "assertEquals(\"POSIX\", LocaleUtils.toLocale(\"en_US_POSIX\").getVariant());",
                "LANGUAGE_COUNTRY_VARIANT"));

        candidates.add(candidate(
                "country_only_de",
                "assertEquals(\"DE\", LocaleUtils.toLocale(\"_DE\").getCountry());",
                "COUNTRY_ONLY"));

        candidates.add(candidate(
                "country_only_jp",
                "assertEquals(\"JP\", LocaleUtils.toLocale(\"_JP\").getCountry());",
                "COUNTRY_ONLY"));

        candidates.add(candidate(
                "country_only_with_variant",
                "assertEquals(\"X\", LocaleUtils.toLocale(\"_DE_X\").getVariant());",
                "COUNTRY_ONLY_VARIANT"));

        candidates.add(candidate(
                "invalid_upper_language",
                "expectIllegalArgument(\"EN_US\");",
                "INVALID_LANGUAGE"));

        candidates.add(candidate(
                "invalid_mixed_language",
                "expectIllegalArgument(\"eN_US\");",
                "INVALID_LANGUAGE"));

        candidates.add(candidate(
                "invalid_lower_country",
                "expectIllegalArgument(\"en_us\");",
                "INVALID_COUNTRY"));

        candidates.add(candidate(
                "invalid_single_character",
                "expectIllegalArgument(\"e\");",
                "INVALID_LENGTH"));

        candidates.add(candidate(
                "invalid_missing_separator",
                "expectIllegalArgument(\"enUS\");",
                "INVALID_SEPARATOR"));

        candidates.add(candidate(
                "invalid_short_country",
                "expectIllegalArgument(\"_D\");",
                "COUNTRY_ONLY_BOUNDARY"));

        candidates.add(candidate(
                "invalid_lower_country_only",
                "expectIllegalArgument(\"_de\");",
                "COUNTRY_ONLY_CASE"));

        candidates.add(candidate(
                "invalid_empty_country_only",
                "expectIllegalArgument(\"_\");",
                "COUNTRY_ONLY_BOUNDARY"));

        return candidates;
    }

    private Candidate candidate(
            String name,
            String testCode,
            String... features) {

        return new Candidate(
                name,
                testCode,
                new HashSet<String>(
                        Arrays.asList(features)));
    }

    @Override
    public double fitness(
            List<Candidate> candidates,
            boolean[] state) {

        Set<String> covered =
                new HashSet<String>();

        for (int i = 0;
             i < state.length;
             i++) {

            if (state[i]) {

                covered.addAll(
                        candidates
                                .get(i)
                                .getFeatures());
            }
        }

        double score =
                covered.size();

        /*
         * Extra weight for the defect-relevant
         * COUNTRY_ONLY behavior.
         *
         * The fixed implementation introduces
         * a dedicated branch for inputs beginning
         * with "_".
         */
        if (covered.contains("COUNTRY_ONLY")) {
            score += 5.0;
        }

        if (covered.contains(
                "COUNTRY_ONLY_VARIANT")) {
            score += 2.0;
        }

        if (covered.contains(
                "COUNTRY_ONLY_BOUNDARY")) {
            score += 2.0;
        }

        if (covered.contains(
                "COUNTRY_ONLY_CASE")) {
            score += 2.0;
        }

        return score;
    }

    @Override
    public String generateTestSuite(
            List<Candidate> candidates,
            boolean[] state,
            String packageName,
            String className) {

        StringBuilder code =
                new StringBuilder();

        code.append(
                "package "
                + packageName
                + ";\n\n");

        code.append(
                "import static org.junit.Assert.assertEquals;\n");

        code.append(
                "import static org.junit.Assert.fail;\n");

        code.append(
                "import org.junit.Test;\n\n");

        code.append(
                "public class "
                + className
                + " {\n\n");

        int testNumber = 1;

        for (int i = 0;
             i < state.length;
             i++) {

            if (!state[i]) {
                continue;
            }

            Candidate candidate =
                    candidates.get(i);

            code.append(
                    "    @Test\n");

            code.append(
                    "    public void test"
                    + String.format(
                            "%02d",
                            testNumber)
                    + "_"
                    + candidate.getName()
                    + "() {\n");

            code.append(
                    "        "
                    + candidate.getTestCode()
                    + "\n");

            code.append(
                    "    }\n\n");

            testNumber++;
        }

        code.append(
                "    private void expectIllegalArgument("
                + "String value) {\n");

        code.append(
                "        try {\n");

        code.append(
                "            LocaleUtils.toLocale(value);\n");

        code.append(
                "            fail(\"Expected IllegalArgumentException for: \" + value);\n");

        code.append(
                "        } catch (IllegalArgumentException expected) {\n");

        code.append(
                "            // expected\n");

        code.append(
                "        }\n");

        code.append(
                "    }\n");

        code.append(
                "}\n");

        return code.toString();
    }
}
