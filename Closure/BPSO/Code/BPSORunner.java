import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Runs BPSO test-suite selection using measured Closure candidates.
 *
 * Input CSV:
 * TestID,TestClass,TestMethod,LineCoverage,ConditionCoverage,ExecutionTimeMs
 */
public class BPSORunner {

    private static class Candidate {
        String id;
        String testClass;
        String testMethod;
        double lineCoverage;
        double conditionCoverage;
        double executionTime;

        Candidate(
                String id,
                String testClass,
                String testMethod,
                double lineCoverage,
                double conditionCoverage,
                double executionTime) {

            this.id = id;
            this.testClass = testClass;
            this.testMethod = testMethod;
            this.lineCoverage = lineCoverage;
            this.conditionCoverage = conditionCoverage;
            this.executionTime = executionTime;
        }
    }

    public static void main(String[] args) throws Exception {

        if (args.length < 4) {
            System.out.println(
                "Usage: java BPSORunner <measured.csv> <output-dir> <suite-size> <seed>"
            );
            return;
        }

        Path input = Paths.get(args[0]);
        Path outputDir = Paths.get(args[1]);

        int suiteSize = Integer.parseInt(args[2]);
        long seed = Long.parseLong(args[3]);

        Files.createDirectories(outputDir);

        List<Candidate> candidates = readCandidates(input);

        if (candidates.isEmpty()) {
            throw new IllegalArgumentException("No candidates found.");
        }

        suiteSize = Math.min(suiteSize, candidates.size());

        double maxLine = 0;
        double maxCondition = 0;
        double maxTime = 0;

        for (Candidate c : candidates) {
            maxLine = Math.max(maxLine, c.lineCoverage);
            maxCondition = Math.max(maxCondition, c.conditionCoverage);
            maxTime = Math.max(maxTime, c.executionTime);
        }

        final double lineMax = maxLine == 0 ? 1 : maxLine;
        final double conditionMax = maxCondition == 0 ? 1 : maxCondition;
        final double timeMax = maxTime == 0 ? 1 : maxTime;

        /*
         * Fitness per candidate:
         *
         * 45% Line Coverage
         * 45% Condition Coverage
         * 10% Execution-time efficiency
         *
         * Higher = better.
         */
        final double[] weights = new double[candidates.size()];

        for (int i = 0; i < candidates.size(); i++) {

            Candidate c = candidates.get(i);

            double lineScore =
                    c.lineCoverage / lineMax;

            double conditionScore =
                    c.conditionCoverage / conditionMax;

            double timeScore =
                    1.0 - (c.executionTime / timeMax);

            weights[i] =
                    (0.45 * lineScore)
                    + (0.45 * conditionScore)
                    + (0.10 * timeScore);
        }

        BPSOSelector.FitnessFunction fitness =
                selection -> {

                    double score = 0;

                    for (int i = 0; i < selection.length; i++) {
                        if (selection[i]) {
                            score += weights[i];
                        }
                    }

                    return score;
                };

        BPSOSelector selector = new BPSOSelector();

BPSOSelector.Result result =
        selector.select(
                candidates.size(), // จำนวน candidates
                suiteSize,         // จำนวน test ที่ต้องการเลือก
                seed,              // random seed
                30,                // particles
                200,               // iterations
                0.729,             // inertia
                1.49445,           // cognitive
                1.49445,           // social
                fitness            // fitness function
        );

        writeSelected(
                outputDir.resolve("selected_tests.csv"),
                candidates,
                result.selection,
                weights
        );

        writeResult(
                outputDir.resolve("result.csv"),
                candidates.size(),
                suiteSize,
                seed,
                result.fitness
        );

        System.out.println();
        System.out.println("======================================");
        System.out.println("BPSO COMPLETED");
        System.out.println("Candidates : " + candidates.size());
        System.out.println("Selected   : " + suiteSize);
        System.out.println("Seed       : " + seed);
        System.out.println("Fitness    : " + result.fitness);
        System.out.println(
                "Output     : " + outputDir.toAbsolutePath()
        );
        System.out.println("======================================");
    }

    private static List<Candidate> readCandidates(Path input)
            throws IOException {

        List<String> lines =
                Files.readAllLines(input);

        List<Candidate> candidates =
                new ArrayList<>();

        for (int i = 1; i < lines.size(); i++) {

            String line = lines.get(i).trim();

            if (line.isEmpty()) {
                continue;
            }

            String[] p = line.split(",");

            if (p.length < 6) {
                continue;
            }

            candidates.add(
                    new Candidate(
                            p[0],
                            p[1],
                            p[2],
                            Double.parseDouble(p[3]),
                            Double.parseDouble(p[4]),
                            Double.parseDouble(p[5])
                    )
            );
        }

        return candidates;
    }

    private static void writeSelected(
            Path output,
            List<Candidate> candidates,
            boolean[] selected,
            double[] weights)
            throws IOException {

        try (PrintWriter out =
                     new PrintWriter(
                             Files.newBufferedWriter(output))) {

            out.println(
                "TestID,TestClass,TestMethod,"
                + "LineCoverage,ConditionCoverage,"
                + "ExecutionTimeMs,FitnessScore"
            );

            for (int i = 0; i < candidates.size(); i++) {

                if (!selected[i]) {
                    continue;
                }

                Candidate c = candidates.get(i);

                out.printf(
                        Locale.US,
                        "%s,%s,%s,%.2f,%.2f,%.0f,%.6f%n",
                        c.id,
                        c.testClass,
                        c.testMethod,
                        c.lineCoverage,
                        c.conditionCoverage,
                        c.executionTime,
                        weights[i]
                );
            }
        }
    }

    private static void writeResult(
            Path output,
            int candidateCount,
            int suiteSize,
            long seed,
            double fitness)
            throws IOException {

        try (PrintWriter out =
                     new PrintWriter(
                             Files.newBufferedWriter(output))) {

            out.println(
                    "CandidateCount,SelectedCount,Seed,Fitness"
            );

            out.printf(
                    Locale.US,
                    "%d,%d,%d,%.6f%n",
                    candidateCount,
                    suiteSize,
                    seed,
                    fitness
            );
        }
    }
}