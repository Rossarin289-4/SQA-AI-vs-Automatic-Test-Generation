import java.io.IOException;
import java.math.BigInteger;
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
        String input;
        Set<String> features;
        String oracle;

        Candidate(String input) {
            this.input = input;
            this.features = getFeatures(input);
            this.oracle = getOracle(input);
        }
    }

    private static final List<Candidate> CANDIDATES = buildCandidates();

    private static List<Candidate> buildCandidates() {
        List<String> inputs = Arrays.asList(
                null,
                "",
                "   ",
                "0",
                "42",
                "-42",
                "2147483647",
                "2147483648",
                "9223372036854775807",
                "9223372036854775808",

                "0x0",
                "0x7F",
                "0x7FFFFFFF",
                "0x100000000",
                "0x1000000000000000",
                "0x10000000000000000",

                "1.25",
                "1.23456789",
                "1.123456789012345",
                "1.1234567890123456789012",

                "1e3",
                "1e-500",
                "1e400",

                "3.4028235e+38",
                "3.40282355e+38",

                "1.7976931348623158e+308",
                "1.79769313486231585e+308",

                "2.2250738585072014e-308",
                "4.9e-324",

                "1.5F",
                "1.5D",
                "42L",

                "1.2L",
                "1.2Q",
                "1e2E3",
                "-"
        );

        List<Candidate> result = new ArrayList<>();

        for (String input : inputs) {
            result.add(new Candidate(input));
        }

        return result;
    }

    private static Set<String> getFeatures(String input) {
        Set<String> features = new LinkedHashSet<>();

        if (input == null) {
            features.add("NULL");
            return features;
        }

        String trimmed = input.trim();

        if (trimmed.isEmpty()) {
            features.add("BLANK");
            return features;
        }

        if (input.startsWith("0x") || input.startsWith("0X")) {
            features.add("HEX");

            int digits = input.length() - 2;

            if (digits <= 8) {
                features.add("HEX_INTEGER");
            } else if (digits <= 16) {
                features.add("HEX_LONG");
            } else {
                features.add("HEX_BIG_INTEGER");
            }

            return features;
        }

        if (input.endsWith("F") || input.endsWith("f")) {
            features.add("FLOAT_SUFFIX");
        }

        if (input.endsWith("D") || input.endsWith("d")) {
            features.add("DOUBLE_SUFFIX");
        }

        if (input.endsWith("L") || input.endsWith("l")) {
            features.add("LONG_SUFFIX");
        }

        if (input.endsWith("Q") || input.endsWith("q")) {
            features.add("INVALID_SUFFIX");
        }

        if (input.contains("e") || input.contains("E")) {
            features.add("EXPONENT");
        }

        if (input.contains(".")) {
            features.add("DECIMAL");

            int decimalDigits = decimalDigits(input);

            if (decimalDigits >= 8) {
                features.add("PRECISION_FLOAT");
            }

            if (decimalDigits >= 17) {
                features.add("PRECISION_DOUBLE");
            }
        }

        if (input.matches("[+-]?\\d+")) {
            features.add("INTEGER");

            try {
                BigInteger value = new BigInteger(input);

                if (value.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0
                        && value.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    features.add("INTEGER_INT");
                } else if (value.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0
                        && value.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    features.add("INTEGER_LONG");
                } else {
                    features.add("INTEGER_BIG_INTEGER");
                }

            } catch (NumberFormatException ignored) {
            }
        }

        if (input.equals("1e-500")) {
            features.add("UNDERFLOW");
        }

        if (input.equals("1e400")
                || input.equals("1.79769313486231585e+308")) {
            features.add("OVERFLOW");
        }

        if (input.equals("-")) {
            features.add("INVALID_INPUT");
        }

        if (input.equals("1.2L")) {
            features.add("INVALID_LONG");
        }

        if (input.equals("1e2E3")) {
            features.add("INVALID_EXPONENT");
        }

        return features;
    }

    private static int decimalDigits(String input) {
        int dot = input.indexOf('.');

        if (dot < 0) {
            return 0;
        }

        int end = input.length();

        int e = input.indexOf('e', dot);
        int E = input.indexOf('E', dot);

        if (e >= 0) {
            end = e;
        }

        if (E >= 0) {
            end = Math.min(end, E);
        }

        return end - dot - 1;
    }

    private static String getOracle(String input) {

        if (input == null) {
            return "NULL";
        }

        String trimmed = input.trim();

        if (trimmed.isEmpty()) {
            return "NUMBER_FORMAT_EXCEPTION";
        }

        if (input.equals("-")
                || input.equals("1.2Q")
                || input.equals("1e2E3")
                || input.equals("1.2L")) {
            return "NUMBER_FORMAT_EXCEPTION";
        }

        if (input.startsWith("0x") || input.startsWith("0X")) {
            int digits = input.length() - 2;

            if (digits <= 8) {
                return "INTEGER";
            } else if (digits <= 16) {
                return "LONG";
            } else {
                return "BIG_INTEGER";
            }
        }

        if (input.endsWith("L") || input.endsWith("l")) {
            return "LONG";
        }

        if (input.endsWith("F") || input.endsWith("f")) {
            return "FLOAT";
        }

        if (input.endsWith("D") || input.endsWith("d")) {
            return "DOUBLE";
        }

        if (input.matches("[+-]?\\d+")) {
            try {
                BigInteger value = new BigInteger(input);

                if (value.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0
                        && value.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    return "INTEGER";
                }

                if (value.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0
                        && value.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    return "LONG";
                }

                return "BIG_INTEGER";

            } catch (NumberFormatException e) {
                return "NUMBER_FORMAT_EXCEPTION";
            }
        }

        if (input.equals("1e-500")
                || input.equals("1e400")
                || input.equals("1.79769313486231585e+308")) {
            return "BIG_DECIMAL";
        }

        if (input.equals("4.9e-324")
                || input.equals("2.2250738585072014e-308")
                || input.equals("1.7976931348623158e+308")) {
            return "DOUBLE";
        }

        int decimals = decimalDigits(input);

        if (decimals >= 17) {
            return "BIG_DECIMAL";
        }

        if (decimals >= 8) {
            return "DOUBLE";
        }

        return "FLOAT";
    }

    private static double fitness(boolean[] state) {

        Set<String> covered = new HashSet<>();

        for (int i = 0; i < state.length; i++) {
            if (state[i]) {
                covered.addAll(CANDIDATES.get(i).features);
            }
        }

        double score = covered.size();

        if (covered.contains("PRECISION_FLOAT")) {
            score += 3.0;
        }

        if (covered.contains("PRECISION_DOUBLE")) {
            score += 3.0;
        }

        if (covered.contains("UNDERFLOW")) {
            score += 2.0;
        }

        if (covered.contains("OVERFLOW")) {
            score += 2.0;
        }

        return score;
    }

    private static boolean[] randomState(
            int size,
            int suiteSize,
            Random random) {

        boolean[] state = new boolean[size];

        int count = 0;

        while (count < suiteSize) {
            int index = random.nextInt(size);

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

        boolean[] next = current.clone();

        List<Integer> selected = new ArrayList<>();
        List<Integer> unselected = new ArrayList<>();

        for (int i = 0; i < next.length; i++) {
            if (next[i]) {
                selected.add(i);
            } else {
                unselected.add(i);
            }
        }

        if (!selected.isEmpty() && !unselected.isEmpty()) {
            int remove = selected.get(
                    random.nextInt(selected.size()));

            int add = unselected.get(
                    random.nextInt(unselected.size()));

            next[remove] = false;
            next[add] = true;
        }

        return next;
    }

    private static boolean[] simulatedAnnealing(
            int suiteSize,
            int iterations,
            long seed) {

        Random random = new Random(seed);

        boolean[] current =
                randomState(CANDIDATES.size(), suiteSize, random);

        double currentFitness = fitness(current);

        boolean[] best = current.clone();

        double bestFitness = currentFitness;

        double temperature = 10.0;

        for (int i = 0; i < iterations; i++) {

            boolean[] next = mutate(current, random);

            double nextFitness = fitness(next);

            double delta = nextFitness - currentFitness;

            boolean accept = false;

            if (delta >= 0) {
                accept = true;
            } else {

                double probability =
                        Math.exp(delta / temperature);

                if (random.nextDouble() < probability) {
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

    private static String javaString(String input) {

        if (input == null) {
            return "null";
        }

        return "\"" + input
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t")
                + "\"";
    }

    private static String typeForOracle(String oracle) {

        switch (oracle) {

            case "INTEGER":
                return "Integer";

            case "LONG":
                return "Long";

            case "BIG_INTEGER":
                return "BigInteger";

            case "FLOAT":
                return "Float";

            case "DOUBLE":
                return "Double";

            case "BIG_DECIMAL":
                return "BigDecimal";

            default:
                return null;
        }
    }

    private static void writeJUnit(
            boolean[] state,
            Path output) throws IOException {

        StringBuilder code = new StringBuilder();

        code.append("package org.apache.commons.lang3.math;\n\n");

        code.append("import static org.junit.Assert.assertNull;\n");
        code.append("import static org.junit.Assert.assertTrue;\n");
        code.append("import org.junit.Test;\n\n");

        code.append("public class NumberUtilsCreateNumberSATest {\n\n");

        int testNumber = 1;

        for (int i = 0; i < state.length; i++) {

            if (!state[i]) {
                continue;
            }

            Candidate candidate = CANDIDATES.get(i);

            code.append("    @Test\n");

            if ("NUMBER_FORMAT_EXCEPTION".equals(candidate.oracle)) {

                code.append(
                        "    public void test"
                        + String.format("%02d", testNumber)
                        + "() {\n");

                code.append(
                        "        try {\n");

                code.append(
                        "            NumberUtils.createNumber("
                        + javaString(candidate.input)
                        + ");\n");

                code.append(
                        "            throw new AssertionError("
                        + "\"Expected NumberFormatException\");\n");

                code.append(
                        "        } catch (NumberFormatException expected) {\n");

                code.append(
                        "            // expected\n");

                code.append(
                        "        }\n");

            } else if ("NULL".equals(candidate.oracle)) {

                code.append(
                        "    public void test"
                        + String.format("%02d", testNumber)
                        + "() {\n");

                code.append(
                        "        assertNull(NumberUtils.createNumber(null));\n");

            } else {

                String type =
                        typeForOracle(candidate.oracle);

                code.append(
                        "    public void test"
                        + String.format("%02d", testNumber)
                        + "() {\n");

                code.append(
                        "        Number result = NumberUtils.createNumber("
                        + javaString(candidate.input)
                        + ");\n");

                code.append(
                        "        assertTrue(result instanceof "
                        + type
                        + ");\n");
            }

            code.append("    }\n\n");

            testNumber++;
        }

        code.append("}\n");

        Files.createDirectories(output.getParent());

        Files.writeString(output, code.toString());
    }

    private static void writeSelectedInputs(
            boolean[] state,
            Path output) throws IOException {

        StringBuilder text = new StringBuilder();

        text.append("Simulated Annealing Selected Test Inputs\n");
        text.append("========================================\n\n");

        int count = 0;

        for (int i = 0; i < state.length; i++) {

            if (!state[i]) {
                continue;
            }

            Candidate candidate = CANDIDATES.get(i);

            count++;

            String input =
                    candidate.input == null
                    ? "<NULL>"
                    : candidate.input;

            text.append(String.format(
                    "%02d. %-35s Oracle=%-25s Features=%s%n",
                    count,
                    input,
                    candidate.oracle,
                    candidate.features));
        }

        text.append("\nTotal Test Cases: ");
        text.append(count);
        text.append("\n");

        text.append("Fitness: ");
        text.append(fitness(state));
        text.append("\n");

        Files.writeString(output, text.toString());
    }

    public static void main(String[] args) throws Exception {

        final long seed = 20260923L;
        final int suiteSize = 12;
        final int iterations = 5000;

        System.out.println(
                "=== Simulated Annealing Test Generator ===");

        System.out.println(
                "Seed: " + seed);

        System.out.println(
                "Candidate pool: " + CANDIDATES.size());

        System.out.println(
                "Suite size: " + suiteSize);

        System.out.println(
                "Iterations: " + iterations);

        long start = System.nanoTime();

        boolean[] best =
                simulatedAnnealing(
                        suiteSize,
                        iterations,
                        seed);

        long end = System.nanoTime();

        double generationTime =
                (end - start) / 1_000_000_000.0;

        Path resultDirectory =
                Paths.get("results/sa");

        Path testDirectory =
                Paths.get(
                        "ai-tests/sa/suite/org/apache/commons/lang3/math");

        Files.createDirectories(resultDirectory);
        Files.createDirectories(testDirectory);

        writeSelectedInputs(
                best,
                resultDirectory.resolve(
                        "selected_inputs.txt"));

        writeJUnit(
                best,
                testDirectory.resolve(
                        "NumberUtilsCreateNumberSATest.java"));

        Files.writeString(
                resultDirectory.resolve(
                        "generation_info.txt"),
                "Algorithm: Simulated Annealing\n"
                + "Seed: " + seed + "\n"
                + "Candidate pool: " + CANDIDATES.size() + "\n"
                + "Suite size: " + suiteSize + "\n"
                + "Iterations: " + iterations + "\n"
                + "Fitness: " + fitness(best) + "\n"
                + "Generation time (seconds): "
                + generationTime + "\n");

        System.out.println(
                "Fitness: " + fitness(best));

        System.out.println(
                "Generation time: "
                + generationTime
                + " seconds");

        System.out.println(
                "Generated JUnit test:");
        
        System.out.println(
                "ai-tests/sa/suite/org/apache/commons/lang3/math/"
                + "NumberUtilsCreateNumberSATest.java");
    }
}
