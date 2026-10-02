import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BinaryParticleSwarmGenerator {

    private static final long SEED = 20260923L;
    private static final int PARTICLES = 20;
    private static final int ITERATIONS = 5000;
    private static final int SUITE_SIZE = 12;

    private static final double W = 0.729;
    private static final double C1 = 1.49445;
    private static final double C2 = 1.49445;

    private static final String OUTPUT_DIR =
            "Lang/BPSO/TestCode";

    private static final String TEST_OUTPUT =
            OUTPUT_DIR +
            "/LookupTranslatorBPSOTest.java";

    private static final String INPUT_OUTPUT =
            OUTPUT_DIR +
            "/selected_candidates.txt";

    private static final String INFO_OUTPUT =
            OUTPUT_DIR +
            "/generation_info.txt";

    private static class Candidate {

        final String name;
        final String keyCode;
        final String inputCode;
        final int index;
        final int expectedConsumed;
        final String expectedOutput;
        final Set<String> features;

        Candidate(
                String name,
                String keyCode,
                String inputCode,
                int index,
                int expectedConsumed,
                String expectedOutput,
                String... features) {

            this.name = name;
            this.keyCode = keyCode;
            this.inputCode = inputCode;
            this.index = index;
            this.expectedConsumed = expectedConsumed;
            this.expectedOutput = expectedOutput;

            this.features =
                    new HashSet<String>(
                            Arrays.asList(features));
        }
    }

    private static Candidate candidate(
            String name,
            String keyCode,
            String inputCode,
            int index,
            int expectedConsumed,
            String expectedOutput,
            String... features) {

        return new Candidate(
                name,
                keyCode,
                inputCode,
                index,
                expectedConsumed,
                expectedOutput,
                features);
    }

    /*
     * Lang-4 / LANG-882 candidate pool.
     *
     * Original trigger values are intentionally excluded:
     * "one" and "two".
     *
     * The candidates focus on the CharSequence equality defect:
     * StringBuffer/StringBuilder keys must be normalized to String
     * so that content-based lookup succeeds.
     */
    private static List<Candidate> buildCandidates() {

        List<Candidate> c =
                new ArrayList<Candidate>();

        c.add(candidate(
                "string_key_string_input",
                "\"cat\"",
                "\"cat\"",
                0,
                3,
                "DOG",
                "STRING_KEY",
                "STRING_INPUT",
                "STRING_STRING",
                "BASIC_LOOKUP"));

        c.add(candidate(
                "stringbuffer_key_string_input",
                "new StringBuffer(\"cat\")",
                "\"cat\"",
                0,
                3,
                "DOG",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "NON_STRING_KEY",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "stringbuilder_key_string_input",
                "new StringBuilder(\"red\")",
                "\"red\"",
                0,
                3,
                "BLUE",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "NON_STRING_KEY",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "string_key_stringbuffer_input",
                "\"fish\"",
                "new StringBuffer(\"fish\")",
                0,
                4,
                "SEA",
                "STRING_KEY",
                "STRINGBUFFER_INPUT",
                "NON_STRING_INPUT"));

        c.add(candidate(
                "string_key_stringbuilder_input",
                "\"bird\"",
                "new StringBuilder(\"bird\")",
                0,
                4,
                "WING",
                "STRING_KEY",
                "STRINGBUILDER_INPUT",
                "NON_STRING_INPUT"));

        c.add(candidate(
                "buffer_key_buffer_input",
                "new StringBuffer(\"moon\")",
                "new StringBuffer(\"moon\")",
                0,
                4,
                "NIGHT",
                "STRINGBUFFER_KEY",
                "STRINGBUFFER_INPUT",
                "KEY_NORMALIZATION",
                "INPUT_NON_STRING"));

        c.add(candidate(
                "builder_key_builder_input",
                "new StringBuilder(\"sun\")",
                "new StringBuilder(\"sun\")",
                0,
                3,
                "DAY",
                "STRINGBUILDER_KEY",
                "STRINGBUILDER_INPUT",
                "KEY_NORMALIZATION",
                "INPUT_NON_STRING"));

        c.add(candidate(
                "non_zero_index_buffer",
                "new StringBuffer(\"dog\")",
                "\"xxdog\"",
                2,
                3,
                "ANIMAL",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "NON_ZERO_INDEX",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "non_zero_index_builder",
                "new StringBuilder(\"cat\")",
                "\"xxcat\"",
                2,
                3,
                "ANIMAL",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "NON_ZERO_INDEX",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "greedy_buffer",
                "new StringBuffer(\"abcd\")",
                "\"abcd\"",
                0,
                4,
                "LONG",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "GREEDY",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "greedy_builder",
                "new StringBuilder(\"abc\")",
                "\"abcdef\"",
                0,
                3,
                "SHORT",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "GREEDY",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "buffer_key_string_input_hello",
                "new StringBuffer(\"hello\")",
                "\"hello\"",
                0,
                5,
                "HI",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "builder_key_string_input_world",
                "new StringBuilder(\"world\")",
                "\"world\"",
                0,
                5,
                "EARTH",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "buffer_key_string_input_xyz",
                "new StringBuffer(\"xyz\")",
                "\"--xyz\"",
                2,
                3,
                "XYZ",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "NON_ZERO_INDEX",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "builder_key_string_input_pqrs",
                "new StringBuilder(\"pqrs\")",
                "\"00pqrs\"",
                2,
                4,
                "PQRS",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "NON_ZERO_INDEX",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "buffer_key_string_input_long",
                "new StringBuffer(\"long\")",
                "\"long\"",
                0,
                4,
                "L",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "builder_key_string_input_short",
                "new StringBuilder(\"short\")",
                "\"short\"",
                0,
                5,
                "S",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "buffer_key_buffer_input_green",
                "new StringBuffer(\"green\")",
                "new StringBuffer(\"green\")",
                0,
                5,
                "G",
                "STRINGBUFFER_KEY",
                "STRINGBUFFER_INPUT",
                "KEY_NORMALIZATION",
                "INPUT_NON_STRING"));

        c.add(candidate(
                "builder_key_builder_input_blue",
                "new StringBuilder(\"blue\")",
                "new StringBuilder(\"blue\")",
                0,
                4,
                "B",
                "STRINGBUILDER_KEY",
                "STRINGBUILDER_INPUT",
                "KEY_NORMALIZATION",
                "INPUT_NON_STRING"));

        c.add(candidate(
                "buffer_key_string_input_code",
                "new StringBuffer(\"code\")",
                "\"code\"",
                0,
                4,
                "JAVA",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "builder_key_string_input_java",
                "new StringBuilder(\"java\")",
                "\"java\"",
                0,
                4,
                "CODE",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "greedy_buffer_prefix",
                "new StringBuffer(\"abcd\")",
                "\"xabcd\"",
                1,
                4,
                "LONG",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "NON_ZERO_INDEX",
                "GREEDY",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "greedy_builder_prefix",
                "new StringBuilder(\"abc\")",
                "\"00abcdef\"",
                2,
                3,
                "SHORT",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "NON_ZERO_INDEX",
                "GREEDY",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "buffer_key_string_input_blue",
                "new StringBuffer(\"blue\")",
                "\"blue\"",
                0,
                4,
                "B",
                "STRINGBUFFER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        c.add(candidate(
                "builder_key_string_input_green",
                "new StringBuilder(\"green\")",
                "\"green\"",
                0,
                5,
                "G",
                "STRINGBUILDER_KEY",
                "STRING_INPUT",
                "KEY_NORMALIZATION"));

        return c;
    }

    private static double fitness(
            List<Candidate> candidates,
            int[] position) {

        Set<String> covered =
                new HashSet<String>();

        double score = 0.0;

        for (int i = 0;
             i < candidates.size();
             i++) {

            if (position[i] == 1) {
                covered.addAll(
                        candidates.get(i).features);
            }
        }

        score += covered.size();

        /*
         * Stronger weight for defect-relevant features.
         */
        if (covered.contains("KEY_NORMALIZATION")) {
            score += 5.0;
        }

        if (covered.contains("STRINGBUFFER_KEY")) {
            score += 3.0;
        }

        if (covered.contains("STRINGBUILDER_KEY")) {
            score += 3.0;
        }

        if (covered.contains("NON_ZERO_INDEX")) {
            score += 2.0;
        }

        if (covered.contains("GREEDY")) {
            score += 2.0;
        }

        if (covered.contains("INPUT_NON_STRING")) {
            score += 2.0;
        }

        /*
         * Encourage implementation diversity.
         */
        if (covered.contains("STRING_KEY")
                && covered.contains("STRINGBUFFER_KEY")
                && covered.contains("STRINGBUILDER_KEY")) {
            score += 5.0;
        }

        /*
         * Encourage input diversity.
         */
        if (covered.contains("STRING_INPUT")
                && covered.contains("STRINGBUFFER_INPUT")
                && covered.contains("STRINGBUILDER_INPUT")) {
            score += 5.0;
        }

        return score;
    }

    private static int countSelected(
            int[] position) {

        int count = 0;

        for (int x : position) {
            if (x == 1) {
                count++;
            }
        }

        return count;
    }

    private static void repair(
            int[] position,
            Random random) {

        while (countSelected(position)
                > SUITE_SIZE) {

            int index =
                    random.nextInt(
                            position.length);

            if (position[index] == 1) {
                position[index] = 0;
            }
        }

        while (countSelected(position)
                < SUITE_SIZE) {

            int index =
                    random.nextInt(
                            position.length);

            if (position[index] == 0) {
                position[index] = 1;
            }
        }
    }

    private static int[] randomPosition(
            int size,
            Random random) {

        int[] position =
                new int[size];

        while (countSelected(position)
                < SUITE_SIZE) {

            int index =
                    random.nextInt(size);

            position[index] = 1;
        }

        return position;
    }

    private static int[] zeroVector(
            int size) {

        return new int[size];
    }

    private static int[] copy(
            int[] source) {

        return Arrays.copyOf(
                source,
                source.length);
    }

    private static double sigmoid(
            double value) {

        if (value > 20.0) {
            return 1.0;
        }

        if (value < -20.0) {
            return 0.0;
        }

        return 1.0
                / (1.0 + Math.exp(-value));
    }

    private static void writeJUnit(
            List<Candidate> candidates,
            int[] position)
            throws IOException {

        File directory =
                new File(OUTPUT_DIR);

        if (!directory.exists()) {
            directory.mkdirs();
        }

        BufferedWriter out =
                new BufferedWriter(
                        new FileWriter(TEST_OUTPUT));

        out.write(
                "package org.apache.commons.lang3.text.translate;");
        out.newLine();
        out.newLine();

        out.write(
                "import static org.junit.Assert.assertEquals;");
        out.newLine();
        out.write(
                "import java.io.StringWriter;");
        out.newLine();
        out.write(
                "import org.junit.Test;");
        out.newLine();
        out.newLine();

        out.write(
                "public class LookupTranslatorBPSOTest {");
        out.newLine();
        out.newLine();

        int testNumber = 1;

        for (int i = 0;
             i < candidates.size();
             i++) {

            if (position[i] != 1) {
                continue;
            }

            Candidate c =
                    candidates.get(i);

            out.write("    @Test");
            out.newLine();

            out.write(
                    "    public void test"
                    + String.format(
                            "%02d",
                            testNumber)
                    + "_"
                    + c.name
                    + "() throws Exception {");
            out.newLine();

            out.write(
                    "        LookupTranslator translator = "
                    + "new LookupTranslator("
                    + "new CharSequence[][] {{"
                    + c.keyCode
                    + ", \""
                    + c.expectedOutput
                    + "\"}});");
            out.newLine();

            out.write(
                    "        StringWriter writer = "
                    + "new StringWriter();");
            out.newLine();

            out.write(
                    "        CharSequence input = "
                    + c.inputCode
                    + ";");
            out.newLine();

            out.write(
                    "        int consumed = "
                    + "translator.translate("
                    + "input, "
                    + c.index
                    + ", writer);");
            out.newLine();

            out.write(
                    "        assertEquals("
                    + c.expectedConsumed
                    + ", consumed);");
            out.newLine();

            out.write(
                    "        assertEquals(\""
                    + c.expectedOutput
                    + "\", writer.toString());");
            out.newLine();

            out.write("    }");
            out.newLine();
            out.newLine();

            testNumber++;
        }

        out.write("}");
        out.newLine();

        out.close();
    }

    private static void writeSelectedCandidates(
            List<Candidate> candidates,
            int[] position,
            double fitness)
            throws IOException {

        BufferedWriter out =
                new BufferedWriter(
                        new FileWriter(INPUT_OUTPUT));

        out.write(
                "Algorithm=Binary Particle Swarm Optimization");
        out.newLine();

        out.write("Seed=" + SEED);
        out.newLine();

        out.write(
                "CandidatePool="
                + candidates.size());
        out.newLine();

        out.write(
                "SuiteSize="
                + countSelected(position));
        out.newLine();

        out.write(
                "Fitness="
                + fitness);
        out.newLine();

        out.newLine();

        int number = 1;

        for (int i = 0;
             i < candidates.size();
             i++) {

            if (position[i] != 1) {
                continue;
            }

            Candidate c =
                    candidates.get(i);

            out.write(
                    number
                    + ". "
                    + c.name);

            out.newLine();

            out.write(
                    "   key="
                    + c.keyCode);

            out.newLine();

            out.write(
                    "   input="
                    + c.inputCode);

            out.newLine();

            out.write(
                    "   index="
                    + c.index);

            out.newLine();

            out.write(
                    "   expectedConsumed="
                    + c.expectedConsumed);

            out.newLine();

            out.write(
                    "   expectedOutput="
                    + c.expectedOutput);

            out.newLine();

            out.write(
                    "   features="
                    + c.features);

            out.newLine();

            out.newLine();

            number++;
        }

        out.close();
    }

    private static void writeGenerationInfo(
            List<Candidate> candidates,
            double fitness,
            long elapsed)
            throws IOException {

        BufferedWriter out =
                new BufferedWriter(
                        new FileWriter(INFO_OUTPUT));

        out.write(
                "Algorithm: Binary Particle Swarm Optimization");
        out.newLine();

        out.write(
                "Project: Lang");
        out.newLine();

        out.write(
                "Bug: Lang-4");
        out.newLine();

        out.write(
                "Bug Report: LANG-882");
        out.newLine();

        out.write(
                "Class: org.apache.commons.lang3.text.translate.LookupTranslator");
        out.newLine();

        out.write(
                "Method: translate(CharSequence input, int index, Writer out)");
        out.newLine();

        out.write(
                "Seed: "
                + SEED);
        out.newLine();

        out.write(
                "Candidate pool: "
                + candidates.size());
        out.newLine();

        out.write(
                "Particles: "
                + PARTICLES);
        out.newLine();

        out.write(
                "Suite size: "
                + SUITE_SIZE);
        out.newLine();

        out.write(
                "Iterations: "
                + ITERATIONS);
        out.newLine();

        out.write(
                "Fitness: "
                + fitness);
        out.newLine();

        out.write(
                "Generation time: "
                + (elapsed / 1_000_000_000.0)
                + " seconds");
        out.newLine();

        out.write(
                "Original trigger values excluded: one, two");
        out.newLine();

        out.close();
    }

    public static void main(
            String[] args)
            throws Exception {

        List<Candidate> candidates =
                buildCandidates();

        int dimension =
                candidates.size();

        Random random =
                new Random(SEED);

        int[][] positions =
                new int[PARTICLES][dimension];

        int[][] personalBest =
                new int[PARTICLES][dimension];

        double[][] velocities =
                new double[PARTICLES][dimension];

        double[] personalBestFitness =
                new double[PARTICLES];

        int[] globalBest =
                null;

        double globalBestFitness =
                Double.NEGATIVE_INFINITY;

        long start =
                System.nanoTime();

        for (int p = 0;
             p < PARTICLES;
             p++) {

            positions[p] =
                    randomPosition(
                            dimension,
                            random);

            velocities[p] =
                    new double[dimension];

            personalBest[p] =
                    copy(positions[p]);

            personalBestFitness[p] =
                    fitness(
                            candidates,
                            positions[p]);

            if (personalBestFitness[p]
                    > globalBestFitness) {

                globalBestFitness =
                        personalBestFitness[p];

                globalBest =
                        copy(positions[p]);
            }
        }

        for (int iteration = 0;
             iteration < ITERATIONS;
             iteration++) {

            for (int p = 0;
                 p < PARTICLES;
                 p++) {

                for (int d = 0;
                     d < dimension;
                     d++) {

                    double r1 =
                            random.nextDouble();

                    double r2 =
                            random.nextDouble();

                    velocities[p][d] =
                            W * velocities[p][d]
                            + C1 * r1
                            * (personalBest[p][d]
                            - positions[p][d])
                            + C2 * r2
                            * (globalBest[d]
                            - positions[p][d]);

                    double probability =
                            sigmoid(
                                    velocities[p][d]);

                    if (random.nextDouble()
                            < probability) {

                        positions[p][d] = 1;

                    } else {

                        positions[p][d] = 0;
                    }
                }

                repair(
                        positions[p],
                        random);

                double currentFitness =
                        fitness(
                                candidates,
                                positions[p]);

                if (currentFitness
                        > personalBestFitness[p]) {

                    personalBestFitness[p] =
                            currentFitness;

                    personalBest[p] =
                            copy(positions[p]);
                }

                if (personalBestFitness[p]
                        > globalBestFitness) {

                    globalBestFitness =
                            personalBestFitness[p];

                    globalBest =
                            copy(personalBest[p]);
                }
            }
        }

        long end =
                System.nanoTime();

        writeJUnit(
                candidates,
                globalBest);

        writeSelectedCandidates(
                candidates,
                globalBest,
                globalBestFitness);

        writeGenerationInfo(
                candidates,
                globalBestFitness,
                end - start);

        System.out.println(
                "=== Binary Particle Swarm Optimization Test Generator ===");

        System.out.println(
                "Project: Lang");

        System.out.println(
                "Bug: Lang-4");

        System.out.println(
                "Bug Report: LANG-882");

        System.out.println(
                "Seed: "
                + SEED);

        System.out.println(
                "Candidate pool: "
                + candidates.size());

        System.out.println(
                "Particles: "
                + PARTICLES);

        System.out.println(
                "Suite size: "
                + SUITE_SIZE);

        System.out.println(
                "Iterations: "
                + ITERATIONS);

        System.out.println(
                "Fitness: "
                + globalBestFitness);

        System.out.println(
                "Generation time: "
                + ((end - start)
                / 1_000_000_000.0)
                + " seconds");

        System.out.println(
                "Generated JUnit test:");

        System.out.println(
                TEST_OUTPUT);
    }
}
