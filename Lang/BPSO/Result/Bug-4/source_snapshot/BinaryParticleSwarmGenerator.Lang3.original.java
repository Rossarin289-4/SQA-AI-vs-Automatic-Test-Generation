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
            "Lang/BPSO/Test";

    private static final String TEST_OUTPUT =
            OUTPUT_DIR +
            "/NumberUtilsCreateNumberBPSOTest.java";

    private static final String INPUT_OUTPUT =
            OUTPUT_DIR +
            "/selected_inputs.txt";

    private static final String INFO_OUTPUT =
            OUTPUT_DIR +
            "/generation_info.txt";

    private static class Candidate {
        final String input;
        final String oracle;
        final Set<String> features;

        Candidate(String input, String oracle, String... features) {
            this.input = input;
            this.oracle = oracle;
            this.features = new HashSet<String>(
                    Arrays.asList(features));
        }
    }

    private static Candidate candidate(
            String input,
            String oracle,
            String... features) {
        return new Candidate(input, oracle, features);
    }

    /*
     * Candidate pool intentionally excludes the three original
     * LANG-693 trigger values:
     *
     * 1.23
     * 3.40282354e+38
     * 1.797693134862315759e+308
     */
    private static List<Candidate> buildCandidates() {

        List<Candidate> c = new ArrayList<Candidate>();

        c.add(candidate(
                null, "NULL",
                "NULL"));

        c.add(candidate(
                "", "NUMBER_FORMAT_EXCEPTION",
                "BLANK"));

        c.add(candidate(
                "   ", "NUMBER_FORMAT_EXCEPTION",
                "BLANK"));

        c.add(candidate(
                "0", "INTEGER",
                "INTEGER", "INTEGER_INT"));

        c.add(candidate(
                "42", "INTEGER",
                "INTEGER", "INTEGER_INT"));

        c.add(candidate(
                "-42", "INTEGER",
                "INTEGER", "INTEGER_INT", "NEGATIVE"));

        c.add(candidate(
                "2147483647", "INTEGER",
                "INTEGER", "INTEGER_INT"));

        c.add(candidate(
                "2147483648", "LONG",
                "INTEGER", "INTEGER_LONG"));

        c.add(candidate(
                "9223372036854775807", "LONG",
                "INTEGER", "INTEGER_LONG"));

        c.add(candidate(
                "9223372036854775808", "BIG_INTEGER",
                "INTEGER", "INTEGER_BIG_INTEGER"));

        c.add(candidate(
                "0x0", "INTEGER",
                "HEX", "HEX_INTEGER"));

        c.add(candidate(
                "0x7F", "INTEGER",
                "HEX", "HEX_INTEGER"));

        c.add(candidate(
                "0x7FFFFFFF", "INTEGER",
                "HEX", "HEX_INTEGER"));

        c.add(candidate(
                "0x100000000", "LONG",
                "HEX", "HEX_LONG"));

        c.add(candidate(
                "0x1000000000000000", "LONG",
                "HEX", "HEX_LONG"));

        c.add(candidate(
                "0x10000000000000000", "BIG_INTEGER",
                "HEX", "HEX_BIG_INTEGER"));

        c.add(candidate(
                "1.25", "FLOAT",
                "DECIMAL", "PRECISION_LOW"));

        c.add(candidate(
                "1.2345678", "FLOAT",
                "DECIMAL", "PRECISION_FLOAT"));

        c.add(candidate(
                "1.23456789", "DOUBLE",
                "DECIMAL", "PRECISION_FLOAT",
                "PRECISION_DOUBLE"));

        c.add(candidate(
                "123456789.12345678", "DOUBLE",
                "DECIMAL", "PRECISION_FLOAT",
                "PRECISION_DOUBLE"));

        c.add(candidate(
                "1.123456789012345", "DOUBLE",
                "DECIMAL", "PRECISION_FLOAT"));

        c.add(candidate(
                "1.1234567890123456789012", "BIG_DECIMAL",
                "DECIMAL", "PRECISION_DOUBLE",
                "BIG_DECIMAL"));

        c.add(candidate(
                "1e3", "FLOAT",
                "EXPONENT", "FLOAT_EXPONENT"));

        c.add(candidate(
                "1e-500", "BIG_DECIMAL",
                "EXPONENT", "UNDERFLOW", "BIG_DECIMAL"));

        c.add(candidate(
                "1e400", "BIG_DECIMAL",
                "EXPONENT", "OVERFLOW", "BIG_DECIMAL"));

        c.add(candidate(
                "3.4028235e+38", "FLOAT",
                "DECIMAL", "EXPONENT",
                "FLOAT_BOUNDARY"));

        c.add(candidate(
                "3.40282355e+38", "DOUBLE",
                "DECIMAL", "EXPONENT",
                "PRECISION_FLOAT",
                "FLOAT_BOUNDARY"));

        c.add(candidate(
                "1.7976931348623158e+308", "DOUBLE",
                "DECIMAL", "EXPONENT",
                "DOUBLE_BOUNDARY"));

        c.add(candidate(
                "1.79769313486231585e+308", "BIG_DECIMAL",
                "DECIMAL", "EXPONENT",
                "PRECISION_DOUBLE",
                "OVERFLOW",
                "BIG_DECIMAL"));

        c.add(candidate(
                "2.2250738585072014e-308", "DOUBLE",
                "DECIMAL", "EXPONENT",
                "UNDERFLOW",
                "DOUBLE_BOUNDARY"));

        c.add(candidate(
                "4.9e-324", "DOUBLE",
                "DECIMAL", "EXPONENT",
                "UNDERFLOW",
                "DOUBLE_BOUNDARY"));

        c.add(candidate(
                "1.5F", "FLOAT",
                "DECIMAL", "FLOAT_SUFFIX"));

        c.add(candidate(
                "1.5D", "DOUBLE",
                "DECIMAL", "DOUBLE_SUFFIX"));

        c.add(candidate(
                "42L", "LONG",
                "LONG_SUFFIX"));

        c.add(candidate(
                "1.2L", "NUMBER_FORMAT_EXCEPTION",
                "DECIMAL", "LONG_SUFFIX",
                "INVALID_LONG"));

        c.add(candidate(
                "1.2Q", "NUMBER_FORMAT_EXCEPTION",
                "DECIMAL", "INVALID_SUFFIX"));

        c.add(candidate(
                "1e2E3", "NUMBER_FORMAT_EXCEPTION",
                "EXPONENT", "INVALID_INPUT"));

        c.add(candidate(
                "-", "NUMBER_FORMAT_EXCEPTION",
                "INVALID_INPUT"));

        return c;
    }

    private static double fitness(
            List<Candidate> candidates,
            int[] position) {

        Set<String> covered = new HashSet<String>();

        double score = 0.0;

        for (int i = 0; i < candidates.size(); i++) {
            if (position[i] == 1) {
                covered.addAll(candidates.get(i).features);
            }
        }

        score += covered.size();

        /*
         * Defect-oriented weighting.
         *
         * The real LANG-693 defect concerns decimal precision
         * and Float/Double selection.
         */
        if (covered.contains("PRECISION_FLOAT")) {
            score += 3.0;
        }

        if (covered.contains("PRECISION_DOUBLE")) {
            score += 3.0;
        }

        if (covered.contains("FLOAT_BOUNDARY")) {
            score += 2.0;
        }

        if (covered.contains("DOUBLE_BOUNDARY")) {
            score += 2.0;
        }

        if (covered.contains("UNDERFLOW")) {
            score += 2.0;
        }

        if (covered.contains("OVERFLOW")) {
            score += 2.0;
        }

        return score;
    }

    private static int countSelected(int[] position) {
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

        while (countSelected(position) > SUITE_SIZE) {

            int index = random.nextInt(position.length);

            if (position[index] == 1) {
                position[index] = 0;
            }
        }

        while (countSelected(position) < SUITE_SIZE) {

            int index = random.nextInt(position.length);

            if (position[index] == 0) {
                position[index] = 1;
            }
        }
    }

    private static int[] randomPosition(
            int size,
            Random random) {

        int[] position = new int[size];

        int selected = 0;

        while (selected < SUITE_SIZE) {

            int index = random.nextInt(size);

            if (position[index] == 0) {
                position[index] = 1;
                selected++;
            }
        }

        return position;
    }

    private static double[] zeroVelocity(int size) {
        return new double[size];
    }

    private static int[] copy(int[] source) {
        return Arrays.copyOf(source, source.length);
    }

    private static double sigmoid(double x) {

        if (x > 20.0) {
            return 1.0;
        }

        if (x < -20.0) {
            return 0.0;
        }

        return 1.0 / (1.0 + Math.exp(-x));
    }

    private static String javaString(String value) {

        if (value == null) {
            return "null";
        }

        return "\"" +
                value
                        .replace("\\", "\\\\")
                        .replace("\"", "\\\"") +
                "\"";
    }

    private static String typeForOracle(String oracle) {

        if ("INTEGER".equals(oracle)) {
            return "Integer.class";
        }

        if ("LONG".equals(oracle)) {
            return "Long.class";
        }

        if ("BIG_INTEGER".equals(oracle)) {
            return "BigInteger.class";
        }

        if ("FLOAT".equals(oracle)) {
            return "Float.class";
        }

        if ("DOUBLE".equals(oracle)) {
            return "Double.class";
        }

        if ("BIG_DECIMAL".equals(oracle)) {
            return "BigDecimal.class";
        }

        return null;
    }

    private static void writeJUnit(
            List<Candidate> candidates,
            int[] bestPosition)
            throws IOException {

        File file = new File(TEST_OUTPUT);

        File parent = file.getParentFile();

        if (parent != null) {
            parent.mkdirs();
        }

        BufferedWriter out =
                new BufferedWriter(
                        new FileWriter(file));

        out.write(
                "package org.apache.commons.lang3.math;");
        out.newLine();
        out.newLine();

        out.write("import static org.junit.Assert.assertEquals;");
        out.newLine();
        out.write("import static org.junit.Assert.assertNull;");
        out.newLine();
        out.newLine();

        out.write("import java.math.BigDecimal;");
        out.newLine();
        out.write("import java.math.BigInteger;");
        out.newLine();
        out.write("import java.math.BigInteger;");
        out.newLine();
        out.newLine();

        out.write("import org.junit.Test;");
        out.newLine();
        out.newLine();

        out.write("public class NumberUtilsCreateNumberBPSOTest {");
        out.newLine();
        out.newLine();

        int testNumber = 1;

        for (int i = 0;
             i < candidates.size();
             i++) {

            if (bestPosition[i] != 1) {
                continue;
            }

            Candidate c = candidates.get(i);

            String method =
                    "test" +
                    String.format("%02d", testNumber);

            out.write("    @Test");
            out.newLine();

            if ("NULL".equals(c.oracle)) {

                out.write(
                        "    public void " +
                        method +
                        "() {");
                out.newLine();

                out.write(
                        "        assertNull(" +
                        "NumberUtils.createNumber(null));");
                out.newLine();

            } else if (
                    "NUMBER_FORMAT_EXCEPTION"
                            .equals(c.oracle)) {

                out.write(
                        "    public void " +
                        method +
                        "() {");
                out.newLine();

                out.write(
                        "        try {");
                out.newLine();

                out.write(
                        "            NumberUtils.createNumber(" +
                        javaString(c.input) +
                        ");");
                out.newLine();

                out.write(
                        "            org.junit.Assert.fail(" +
                        "\"Expected NumberFormatException\");");
                out.newLine();

                out.write(
                        "        } catch (NumberFormatException " +
                        "expected) {");
                out.newLine();

                out.write("        }");
                out.newLine();

            } else {

                String expected =
                        typeForOracle(c.oracle);

                out.write(
                        "    public void " +
                        method +
                        "() {");
                out.newLine();

                out.write(
                        "        Number result = " +
                        "NumberUtils.createNumber(" +
                        javaString(c.input) +
                        ");");
                out.newLine();

                out.write(
                        "        assertEquals(" +
                        expected +
                        ", result.getClass());");
                out.newLine();
            }

            out.write("    }");
            out.newLine();
            out.newLine();

            testNumber++;
        }

        out.write("}");
        out.newLine();

        out.close();
    }

    private static void writeSelectedInputs(
            List<Candidate> candidates,
            int[] position,
            double bestFitness)
            throws IOException {

        File file = new File(INPUT_OUTPUT);

        File parent = file.getParentFile();

        if (parent != null) {
            parent.mkdirs();
        }

        BufferedWriter out =
                new BufferedWriter(
                        new FileWriter(file));

        out.write(
                "Binary Particle Swarm Optimization " +
                "Selected Test Inputs");
        out.newLine();

        out.write(
                "============================================");
        out.newLine();

        int number = 1;

        for (int i = 0;
             i < candidates.size();
             i++) {

            if (position[i] != 1) {
                continue;
            }

            Candidate c = candidates.get(i);

            String input =
                    c.input == null
                            ? "<NULL>"
                            : c.input;

            out.write(
                    String.format(
                            "%02d. %-35s Oracle=%-25s Features=%s",
                            number,
                            input,
                            c.oracle,
                            c.features));

            out.newLine();

            number++;
        }

        out.newLine();

        out.write(
                "Total Test Cases: " +
                countSelected(position));

        out.newLine();

        out.write(
                "Fitness: " +
                bestFitness);

        out.newLine();

        out.close();
    }

    private static void writeGenerationInfo(
            List<Candidate> candidates,
            double bestFitness,
            long generationTimeNanos)
            throws IOException {

        File file = new File(INFO_OUTPUT);

        File parent = file.getParentFile();

        if (parent != null) {
            parent.mkdirs();
        }

        BufferedWriter out =
                new BufferedWriter(
                        new FileWriter(file));

        out.write(
                "Algorithm: Binary Particle Swarm Optimization");
        out.newLine();

        out.write(
                "Seed: " + SEED);
        out.newLine();

        out.write(
                "Candidate pool: " +
                candidates.size());
        out.newLine();

        out.write(
                "Particles: " +
                PARTICLES);
        out.newLine();

        out.write(
                "Suite size: " +
                SUITE_SIZE);
        out.newLine();

        out.write(
                "Iterations: " +
                ITERATIONS);
        out.newLine();

        out.write(
                "Inertia weight: " +
                W);
        out.newLine();

        out.write(
                "Cognitive coefficient: " +
                C1);
        out.newLine();

        out.write(
                "Social coefficient: " +
                C2);
        out.newLine();

        out.write(
                "Fitness: " +
                bestFitness);
        out.newLine();

        out.write(
                "Generation time (seconds): " +
                (generationTimeNanos / 1_000_000_000.0));
        out.newLine();

        out.close();
    }

    public static void main(String[] args)
            throws Exception {

        List<Candidate> candidates =
                buildCandidates();

        Random random =
                new Random(SEED);

        int dimension = candidates.size();

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
                    zeroVelocity(
                            dimension);

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

        writeSelectedInputs(
                candidates,
                globalBest,
                globalBestFitness);

        writeGenerationInfo(
                candidates,
                globalBestFitness,
                end - start);

        System.out.println(
                "=== Binary Particle Swarm Optimization " +
                "Test Generator ===");

        System.out.println(
                "Seed: " + SEED);

        System.out.println(
                "Candidate pool: " +
                candidates.size());

        System.out.println(
                "Particles: " +
                PARTICLES);

        System.out.println(
                "Suite size: " +
                SUITE_SIZE);

        System.out.println(
                "Iterations: " +
                ITERATIONS);

        System.out.println(
                "Fitness: " +
                globalBestFitness);

        System.out.println(
                "Generation time: " +
                ((end - start)
                / 1_000_000_000.0) +
                " seconds");

        System.out.println(
                "Generated JUnit test:");

        System.out.println(
                TEST_OUTPUT);
    }
}
