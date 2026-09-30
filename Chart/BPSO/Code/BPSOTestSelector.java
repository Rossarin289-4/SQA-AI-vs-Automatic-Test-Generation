import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * BPSO selector for measured Defects4J developer tests.
 *
 * Input:
 * test_id,test_target,line_pct,condition_pct,execution_ms,status
 *
 * Fitness:
 *   45% Line Coverage
 * + 45% Condition Coverage
 * + 10% Execution-time efficiency
 *
 * The particle always contains exactly suiteSize selected tests.
 */
public class BPSOTestSelector {

    private static final double INERTIA = 0.729;
    private static final double COGNITIVE = 1.49445;
    private static final double SOCIAL = 1.49445;

    private static final class Candidate {
        final String id;
        final String target;
        final double line;
        final double condition;
        final long executionMs;

        Candidate(
                String id,
                String target,
                double line,
                double condition,
                long executionMs) {

            this.id = id;
            this.target = target;
            this.line = line;
            this.condition = condition;
            this.executionMs = executionMs;
        }
    }

    private static List<Candidate> readCandidates(Path file)
            throws IOException {

        List<String> lines =
                Files.readAllLines(file, StandardCharsets.UTF_8);

        if (lines.isEmpty()) {
            throw new IllegalArgumentException("Empty CSV: " + file);
        }

        List<Candidate> result = new ArrayList<>();

        for (int i = 1; i < lines.size(); i++) {

            String line = lines.get(i).trim();

            if (line.isEmpty()) {
                continue;
            }

            String[] f = line.split(",", -1);

            if (f.length < 6) {
                throw new IllegalArgumentException(
                        "Invalid CSV line " + (i + 1) + ": " + line);
            }

            if (!"OK".equalsIgnoreCase(f[5].trim())) {
                continue;
            }

            result.add(
                    new Candidate(
                            f[0].trim(),
                            f[1].trim(),
                            Double.parseDouble(f[2].trim()),
                            Double.parseDouble(f[3].trim()),
                            Long.parseLong(f[4].trim())
                    )
            );
        }

        if (result.isEmpty()) {
            throw new IllegalArgumentException(
                    "No usable candidates in " + file);
        }

        return result;
    }

    /**
     * Fitness of a selected suite.
     *
     * Coverage values are normalized from 0..100 to 0..1.
     * Runtime is normalized relative to the slowest candidate.
     */
    private static double fitness(
            boolean[] bits,
            List<Candidate> candidates,
            long maxExecutionMs) {

        double line = 0.0;
        double condition = 0.0;
        long execution = 0;

        for (int i = 0; i < bits.length; i++) {
            if (bits[i]) {
                Candidate c = candidates.get(i);

                /*
                 * Candidate-level surrogate.
                 * Sum individual measured coverage values.
                 */
                line += c.line;
                condition += c.condition;
                execution += c.executionMs;
            }
        }

        double lineScore = line / 100.0;
        double conditionScore = condition / 100.0;

        double worstSuiteTime =
                (double) maxExecutionMs * countSelected(bits);

        double timeScore = worstSuiteTime <= 0
                ? 0
                : Math.max(
                        0,
                        1.0 - (execution / worstSuiteTime)
                );

        return (0.45 * lineScore)
                + (0.45 * conditionScore)
                + (0.10 * timeScore);
    }

    private static int countSelected(boolean[] bits) {
        int count = 0;

        for (boolean b : bits) {
            if (b) {
                count++;
            }
        }

        return count;
    }

    /**
     * Repair particle so exactly suiteSize tests are selected.
     */
    private static void repair(
            boolean[] bits,
            double[] velocities,
            int suiteSize) {

        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < bits.length; i++) {
            indexes.add(i);
        }

        int selected = countSelected(bits);

        if (selected > suiteSize) {

            indexes.sort(
                    Comparator.comparingDouble(i -> velocities[i])
            );

            for (int index : indexes) {

                if (selected <= suiteSize) {
                    break;
                }

                if (bits[index]) {
                    bits[index] = false;
                    selected--;
                }
            }

        } else if (selected < suiteSize) {

            indexes.sort(
                    (a, b) ->
                            Double.compare(
                                    velocities[b],
                                    velocities[a])
            );

            for (int index : indexes) {

                if (selected >= suiteSize) {
                    break;
                }

                if (!bits[index]) {
                    bits[index] = true;
                    selected++;
                }
            }
        }
    }

    private static boolean[] randomPosition(
            int n,
            int suiteSize,
            Random random) {

        boolean[] result = new boolean[n];

        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            indexes.add(i);
        }

        Collections.shuffle(indexes, random);

        for (int i = 0; i < suiteSize; i++) {
            result[indexes.get(i)] = true;
        }

        return result;
    }

    public static void main(String[] args)
            throws IOException {

        if (args.length < 2 || args.length > 6) {

            System.err.println(
                    "Usage: java BPSOTestSelector "
                    + "<measured.csv> <selected.csv> "
                    + "[suiteSize=3] [seed=20260929] "
                    + "[particles=30] [iterations=200]"
            );

            System.exit(2);
        }

        Path input = Path.of(args[0]);
        Path output = Path.of(args[1]);

        int suiteSize =
                args.length > 2
                        ? Integer.parseInt(args[2])
                        : 3;

        long seed =
                args.length > 3
                        ? Long.parseLong(args[3])
                        : 20260929L;

        int particles =
                args.length > 4
                        ? Integer.parseInt(args[4])
                        : 30;

        int iterations =
                args.length > 5
                        ? Integer.parseInt(args[5])
                        : 200;

        List<Candidate> candidates =
                readCandidates(input);

        if (suiteSize < 1 || suiteSize > candidates.size()) {
            throw new IllegalArgumentException(
                    "suiteSize must be between 1 and "
                    + candidates.size());
        }

        long maxExecutionMs = 1;

        for (Candidate c : candidates) {
            maxExecutionMs =
                    Math.max(maxExecutionMs, c.executionMs);
        }

        int n = candidates.size();

        Random random = new Random(seed);

        boolean[][] positions =
                new boolean[particles][n];

        boolean[][] personalBest =
                new boolean[particles][n];

        double[][] velocities =
                new double[particles][n];

        double[] personalScore =
                new double[particles];

        boolean[] globalBest = null;

        double globalScore =
                Double.NEGATIVE_INFINITY;

        long start = System.nanoTime();

        // Initialize swarm
        for (int p = 0; p < particles; p++) {

            positions[p] =
                    randomPosition(n, suiteSize, random);

            for (int j = 0; j < n; j++) {
                velocities[p][j] =
                        random.nextDouble() * 2.0 - 1.0;
            }

            personalBest[p] =
                    positions[p].clone();

            personalScore[p] =
                    fitness(
                            positions[p],
                            candidates,
                            maxExecutionMs);

            if (personalScore[p] > globalScore) {

                globalScore =
                        personalScore[p];

                globalBest =
                        positions[p].clone();
            }
        }

        // BPSO
        for (int iteration = 0;
             iteration < iterations;
             iteration++) {

            for (int p = 0; p < particles; p++) {

                for (int j = 0; j < n; j++) {

                    int x =
                            positions[p][j] ? 1 : 0;

                    int pBest =
                            personalBest[p][j] ? 1 : 0;

                    int gBest =
                            globalBest[j] ? 1 : 0;

                    double velocity =
                            INERTIA * velocities[p][j]
                            + COGNITIVE
                            * random.nextDouble()
                            * (pBest - x)
                            + SOCIAL
                            * random.nextDouble()
                            * (gBest - x);

                    velocity =
                            Math.max(
                                    -6.0,
                                    Math.min(6.0, velocity));

                    velocities[p][j] =
                            velocity;

                    double probability =
                            1.0
                            / (1.0
                            + Math.exp(-velocity));

                    positions[p][j] =
                            random.nextDouble()
                            < probability;
                }

                repair(
                        positions[p],
                        velocities[p],
                        suiteSize);

                double score =
                        fitness(
                                positions[p],
                                candidates,
                                maxExecutionMs);

                if (score > personalScore[p]) {

                    personalScore[p] = score;

                    personalBest[p] =
                            positions[p].clone();

                    if (score > globalScore) {

                        globalScore = score;

                        globalBest =
                                positions[p].clone();
                    }
                }
            }
        }

        double seconds =
                (System.nanoTime() - start)
                / 1_000_000_000.0;

        List<String> outputLines =
                new ArrayList<>();

        outputLines.add(
                "test_id,test_target,"
                + "line_pct,condition_pct,"
                + "execution_ms");

        System.out.println();
        System.out.println(
                "===== BPSO SELECTED TESTS =====");

        for (int i = 0; i < n; i++) {

            if (!globalBest[i]) {
                continue;
            }

            Candidate c =
                    candidates.get(i);

            outputLines.add(
                    c.id + ","
                    + c.target + ","
                    + c.line + ","
                    + c.condition + ","
                    + c.executionMs
            );

            System.out.printf(
                    Locale.ROOT,
                    "%s  %s  line=%.1f%%  condition=%.1f%%%n",
                    c.id,
                    c.target,
                    c.line,
                    c.condition
            );
        }

        if (output.getParent() != null) {
            Files.createDirectories(
                    output.getParent());
        }

        Files.write(
                output,
                outputLines,
                StandardCharsets.UTF_8);

        System.out.println();
        System.out.println(
                "Candidates : " + candidates.size());

        System.out.println(
                "Selected   : "
                + countSelected(globalBest));

        System.out.println(
                "Seed       : " + seed);

        System.out.println(
                "Particles  : " + particles);

        System.out.println(
                "Iterations : " + iterations);

        System.out.printf(
                Locale.ROOT,
                "Fitness    : %.6f%n",
                globalScore);

        System.out.printf(
                Locale.ROOT,
                "BPSO time  : %.6f seconds%n",
                seconds);

        System.out.println(
                "Saved      : " + output);
    }
}
