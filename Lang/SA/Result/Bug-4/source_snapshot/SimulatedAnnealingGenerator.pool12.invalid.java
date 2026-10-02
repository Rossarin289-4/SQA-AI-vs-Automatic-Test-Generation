import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SimulatedAnnealingGenerator {

    static class Candidate {
        String name;
        String keyType;
        String inputType;
        String key;
        String input;
        String replacement;
        int index;
        int expectedConsumed;
        String expectedOutput;
        Set<String> features;

        Candidate(
                String name,
                String keyType,
                String inputType,
                String key,
                String input,
                String replacement,
                int index,
                int expectedConsumed,
                String expectedOutput,
                String... featureArray) {

            this.name = name;
            this.keyType = keyType;
            this.inputType = inputType;
            this.key = key;
            this.input = input;
            this.replacement = replacement;
            this.index = index;
            this.expectedConsumed = expectedConsumed;
            this.expectedOutput = expectedOutput;
            this.features =
                    new LinkedHashSet<String>(
                            Arrays.asList(featureArray));
        }
    }

    private static final List<Candidate> CANDIDATES =
            buildCandidates();

    private static List<Candidate> buildCandidates() {

        List<Candidate> result =
                new ArrayList<Candidate>();

        /*
         * Candidate pool is designed around LANG-882.
         *
         * The defect is caused by using CharSequence directly
         * as a HashMap key. StringBuffer and StringBuilder use
         * identity-based equality rather than String content equality.
         *
         * The fixed implementation normalizes both stored keys
         * and lookup subsequences using toString().
         */

        result.add(new Candidate(
                "string_key_string_input",
                "String",
                "String",
                "cat",
                "cat",
                "DOG",
                0,
                3,
                "DOG",
                "STRING_KEY",
                "STRING_INPUT",
                "BASIC_MATCH"));

        result.add(new Candidate(
                "stringbuffer_key_string_input",
                "StringBuffer",
                "String",
                "cat",
                "cat",
                "DOG",
                0,
                3,
                "DOG",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        result.add(new Candidate(
                "stringbuilder_key_string_input",
                "StringBuilder",
                "String",
                "cat",
                "cat",
                "DOG",
                0,
                3,
                "DOG",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        result.add(new Candidate(
                "string_key_stringbuffer_input",
                "String",
                "StringBuffer",
                "cat",
                "cat",
                "DOG",
                0,
                3,
                "DOG",
                "STRING_KEY",
                "STRINGBUFFER_INPUT",
                "SUBSEQUENCE_NORMALIZATION"));

        result.add(new Candidate(
                "string_key_stringbuilder_input",
                "String",
                "StringBuilder",
                "cat",
                "cat",
                "DOG",
                0,
                3,
                "DOG",
                "STRING_KEY",
                "STRINGBUILDER_INPUT",
                "SUBSEQUENCE_NORMALIZATION"));

        result.add(new Candidate(
                "buffer_key_buffer_input",
                "StringBuffer",
                "StringBuffer",
                "red",
                "red",
                "BLUE",
                0,
                3,
                "BLUE",
                "STRINGBUFFER_KEY",
                "STRINGBUFFER_INPUT"));

        result.add(new Candidate(
                "builder_key_builder_input",
                "StringBuilder",
                "StringBuilder",
                "red",
                "red",
                "BLUE",
                0,
                3,
                "BLUE",
                "STRINGBUILDER_KEY",
                "STRINGBUILDER_INPUT"));

        result.add(new Candidate(
                "non_zero_index",
                "StringBuilder",
                "String",
                "cat",
                "xxcat",
                "DOG",
                2,
                3,
                "DOG",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "NON_ZERO_INDEX"));

        result.add(new Candidate(
                "greedy_match",
                "StringBuffer",
                "String",
                "abcd",
                "abcd",
                "LONG",
                0,
                4,
                "LONG",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "GREEDY_MATCH"));

        result.add(new Candidate(
                "greedy_multiple_entries",
                "StringBuilder",
                "String",
                "abcd",
                "abcdef",
                "LONG",
                0,
                4,
                "LONG",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "GREEDY_MATCH",
                "MULTIPLE_LOOKUPS"));

        result.add(new Candidate(
                "multiple_lookup_entries",
                "StringBuffer",
                "String",
                "dog",
                "catdog",
                "ANIMAL",
                3,
                3,
                "ANIMAL",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "MULTIPLE_LOOKUPS",
                "NON_ZERO_INDEX"));

        result.add(new Candidate(
                "unicode_content",
                "StringBuilder",
                "String",
                "é",
                "é",
                "E",
                0,
                1,
                "E",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "UNICODE_CONTENT"));

        return result;
    }

    private static double fitness(boolean[] state) {

        Set<String> covered =
                new HashSet<String>();

        for (int i = 0; i < state.length; i++) {
            if (state[i]) {
                covered.addAll(
                        CANDIDATES.get(i).features);
            }
        }

        double score = covered.size();

        if (covered.contains("STRINGBUFFER_KEY")) {
            score += 4.0;
        }

        if (covered.contains("STRINGBUILDER_KEY")) {
            score += 4.0;
        }

        if (covered.contains("NON_ZERO_INDEX")) {
            score += 3.0;
        }

        if (covered.contains("GREEDY_MATCH")) {
            score += 3.0;
        }

        if (covered.contains("MULTIPLE_LOOKUPS")) {
            score += 2.0;
        }

        if (covered.contains("SUBSEQUENCE_NORMALIZATION")) {
            score += 3.0;
        }

        return score;
    }

    private static boolean[] randomState(
            int size,
            int suiteSize,
            Random random) {

        boolean[] state =
                new boolean[size];

        int count = 0;

        while (count < suiteSize) {

            int index =
                    random.nextInt(size);

            if (!state[index]) {
                state[index] = true;
                count++;
            }
        }

        return state;
    }

    private static boolean[] mutate(
            boolean[] current,
            Random random) {

        boolean[] next =
                current.clone();

        List<Integer> selected =
                new ArrayList<Integer>();

        List<Integer> unselected =
                new ArrayList<Integer>();

        for (int i = 0;
             i < next.length;
             i++) {

            if (next[i]) {
                selected.add(i);
            } else {
                unselected.add(i);
            }
        }

        if (!selected.isEmpty()
                && !unselected.isEmpty()) {

            int remove =
                    selected.get(
                            random.nextInt(
                                    selected.size()));

            int add =
                    unselected.get(
                            random.nextInt(
                                    unselected.size()));

            next[remove] = false;
            next[add] = true;
        }

        return next;
    }

    private static boolean[] simulatedAnnealing(
            int suiteSize,
            int iterations,
            long seed) {

        Random random =
                new Random(seed);

        boolean[] current =
                randomState(
                        CANDIDATES.size(),
                        suiteSize,
                        random);

        double currentFitness =
                fitness(current);

        boolean[] best =
                current.clone();

        double bestFitness =
                currentFitness;

        double temperature = 10.0;

        for (int i = 0;
             i < iterations;
             i++) {

            boolean[] next =
                    mutate(current, random);

            double nextFitness =
                    fitness(next);

            double delta =
                    nextFitness - currentFitness;

            boolean accept = false;

            if (delta >= 0) {
                accept = true;
            } else {

                double probability =
                        Math.exp(
                                delta / temperature);

                if (random.nextDouble()
                        < probability) {

                    accept = true;
                }
            }

            if (accept) {
                current = next;
                currentFitness = nextFitness;
            }

            if (currentFitness > bestFitness) {
                best = current.clone();
                bestFitness = currentFitness;
            }

            temperature *= 0.995;

            if (temperature < 0.0001) {
                temperature = 0.0001;
            }
        }

        return best;
    }

    private static String javaString(
            String value) {

        return "\""
                + value
                    .replace("\\", "\\\\")
                    .replace("\"", "\\\"")
                    .replace("\n", "\\n")
                    .replace("\r", "\\r")
                    .replace("\t", "\\t")
                + "\"";
    }

    private static String charSequenceExpression(
            String type,
            String value) {

        if ("StringBuffer".equals(type)) {
            return "new StringBuffer("
                    + javaString(value)
                    + ")";
        }

        if ("StringBuilder".equals(type)) {
            return "new StringBuilder("
                    + javaString(value)
                    + ")";
        }

        return javaString(value);
    }

    private static String lookupArrayExpression(
            Candidate candidate) {

        return "new CharSequence[][] {"
                + "{"
                + charSequenceExpression(
                        candidate.keyType,
                        candidate.key)
                + ", "
                + javaString(
                        candidate.replacement)
                + "}"
                + "}";
    }

    private static String inputExpression(
            Candidate candidate) {

        return charSequenceExpression(
                candidate.inputType,
                candidate.input);
    }

    private static void writeJUnit(
            boolean[] state,
            Path output)
            throws IOException {

        StringBuilder code =
                new StringBuilder();

        code.append(
                "package org.apache.commons.lang3.text.translate;\n\n");

        code.append(
                "import static org.junit.Assert.assertEquals;\n");

        code.append(
                "import java.io.StringWriter;\n");

        code.append(
                "import org.junit.Test;\n\n");

        code.append(
                "public class LookupTranslatorSATest {\n\n");

        int testNumber = 1;

        for (int i = 0;
             i < state.length;
             i++) {

            if (!state[i]) {
                continue;
            }

            Candidate candidate =
                    CANDIDATES.get(i);

            code.append("    @Test\n");

            code.append(
                    "    public void test"
                    + String.format(
                            "%02d",
                            testNumber)
                    + "_"
                    + candidate.name
                    + "() throws Exception {\n");

            code.append(
                    "        LookupTranslator translator = "
                    + "new LookupTranslator("
                    + lookupArrayExpression(candidate)
                    + ");\n");

            code.append(
                    "        StringWriter writer = "
                    + "new StringWriter();\n");

            code.append(
                    "        CharSequence input = "
                    + inputExpression(candidate)
                    + ";\n");

            code.append(
                    "        int consumed = "
                    + "translator.translate("
                    + "input, "
                    + candidate.index
                    + ", "
                    + "writer);\n");

            code.append(
                    "        assertEquals("
                    + candidate.expectedConsumed
                    + ", consumed);\n");

            code.append(
                    "        assertEquals("
                    + javaString(
                            candidate.expectedOutput)
                    + ", writer.toString());\n");

            code.append(
                    "    }\n\n");

            testNumber++;
        }

        code.append("}\n");

        Files.createDirectories(
                output.getParent());

        Files.write(
                output,
                code.toString().getBytes());
    }

    private static void writeSelectedInputs(
            boolean[] state,
            Path output)
            throws IOException {

        StringBuilder text =
                new StringBuilder();

        text.append(
                "Algorithm: Simulated Annealing\n");

        text.append(
                "Project: Lang\n");

        text.append(
                "Bug: Lang-4\n");

        text.append(
                "Bug Report: LANG-882\n");

        text.append(
                "Seed: 20260923\n");

        text.append(
                "Suite Size: 12\n");

        text.append(
                "Iterations: 5000\n");

        text.append(
                "Candidate pool: "
                + CANDIDATES.size()
                + "\n");

        text.append(
                "Fitness: "
                + fitness(state)
                + "\n\n");

        int number = 1;

        for (int i = 0;
             i < state.length;
             i++) {

            if (!state[i]) {
                continue;
            }

            Candidate c =
                    CANDIDATES.get(i);

            text.append(
                    String.format(
                            "%02d. %s\n",
                            number,
                            c.name));

            text.append(
                    "    keyType="
                    + c.keyType
                    + "\n");

            text.append(
                    "    inputType="
                    + c.inputType
                    + "\n");

            text.append(
                    "    key="
                    + c.key
                    + "\n");

            text.append(
                    "    input="
                    + c.input
                    + "\n");

            text.append(
                    "    index="
                    + c.index
                    + "\n");

            text.append(
                    "    expectedConsumed="
                    + c.expectedConsumed
                    + "\n");

            text.append(
                    "    expectedOutput="
                    + c.expectedOutput
                    + "\n\n");

            number++;
        }

        Files.write(
                output,
                text.toString().getBytes());
    }

    public static void main(
            String[] args)
            throws Exception {

        long seed = 20260923L;

        int suiteSize = 12;

        int iterations = 5000;

        long start =
                System.nanoTime();

        boolean[] best =
                simulatedAnnealing(
                        suiteSize,
                        iterations,
                        seed);

        long end =
                System.nanoTime();

        Path output =
                Paths.get(
                        "ai-tests/sa/suite/"
                        + "org/apache/commons/lang3/"
                        + "text/translate");

        Files.createDirectories(output);

        Path testFile =
                output.resolve(
                        "LookupTranslatorSATest.java");

        Path selectedFile =
                Paths.get(
                        "Lang/SA/Result/Bug-4/"
                        + "selected_candidates.txt");

        Path summaryFile =
                Paths.get(
                        "Lang/SA/Result/Bug-4/"
                        + "generation_summary.txt");

        writeSelectedInputs(
                best,
                selectedFile);

        writeJUnit(
                best,
                testFile);

        String summary =
                "=== Simulated Annealing Test Generator ===\n"
                + "Project: Lang\n"
                + "Bug: Lang-4\n"
                + "Bug Report: LANG-882\n"
                + "Class: org.apache.commons.lang3.text.translate.LookupTranslator\n"
                + "Method: translate\n"
                + "Seed: " + seed + "\n"
                + "Candidate pool: "
                + CANDIDATES.size()
                + "\n"
                + "Suite size: "
                + suiteSize
                + "\n"
                + "Iterations: "
                + iterations
                + "\n"
                + "Fitness: "
                + fitness(best)
                + "\n"
                + "Generation time: "
                + ((end - start) / 1_000_000.0)
                + " ms\n"
                + "Generated JUnit test:\n"
                + testFile
                + "\n";

        Files.write(
                summaryFile,
                summary.getBytes());

        System.out.print(summary);
    }
}
