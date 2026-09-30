import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Random;

public final class SimulatedAnnealingSelector {

    private SimulatedAnnealingSelector() {
    }

    static double score(
            BitSet selected,
            double[] weights) {

        double score = 0;

        for (int i = selected.nextSetBit(0);
             i >= 0;
             i = selected.nextSetBit(i + 1)) {

            score += weights[i];
        }

        return score;
    }

    public static int[] select(
            double[] weights,
            int suiteSize,
            long seed,
            int iterations,
            double t0,
            double cooling) {

        int n = weights.length;

        int k =
                Math.min(
                        Math.max(1, suiteSize),
                        n
                );

        Random random =
                new Random(seed);

        BitSet current =
                new BitSet(n);

        while (current.cardinality() < k) {
            current.set(
                    random.nextInt(n)
            );
        }

        BitSet best =
                (BitSet) current.clone();

        double currentScore =
                score(current, weights);

        double bestScore =
                currentScore;

        double temperature =
                t0;

        for (int iteration = 0;
             iteration < iterations;
             iteration++) {

            BitSet next =
                    (BitSet) current.clone();

            int removeIndex;

            do {
                removeIndex =
                        random.nextInt(n);
            } while (!next.get(removeIndex));

            int addIndex;

            do {
                addIndex =
                        random.nextInt(n);
            } while (next.get(addIndex));

            next.clear(removeIndex);
            next.set(addIndex);

            double nextScore =
                    score(next, weights);

            double difference =
                    nextScore - currentScore;

            boolean accept =
                    difference >= 0
                    || random.nextDouble()
                    < Math.exp(
                            difference
                            / Math.max(
                                    temperature,
                                    1e-12
                            )
                    );

            if (accept) {

                current = next;
                currentScore = nextScore;

                if (currentScore > bestScore) {

                    best =
                            (BitSet) current.clone();

                    bestScore =
                            currentScore;
                }
            }

            temperature *= cooling;
        }

        return best.stream().toArray();
    }

    private static double calculateScore(
            int[] selected,
            double[] weights) {

        double score = 0;

        for (int index : selected) {
            score += weights[index];
        }

        return score;
    }

    private static String selectedTestsToString(
            int[] selected) {

        StringBuilder result =
                new StringBuilder();

        for (int i = 0;
             i < selected.length;
             i++) {

            if (i > 0) {
                result.append("|");
            }

            result.append(
                    String.format(
                            "T%02d",
                            selected[i] + 1
                    )
            );
        }

        return result.toString();
    }

    private static void saveResults(
            int candidateCount,
            int[] selected,
            double[] weights,
            long seed,
            int iterations,
            double t0,
            double cooling,
            long executionTimeMs)
            throws IOException {

        Path resultDirectory =
                Paths.get("Results");

        Files.createDirectories(
                resultDirectory
        );

        double bestFitness =
                calculateScore(
                        selected,
                        weights
                );

        /*
         * selected_tests.txt
         */
        Path selectedFile =
                resultDirectory.resolve(
                        "selected_tests.txt"
                );

        try (BufferedWriter writer =
                     Files.newBufferedWriter(
                             selectedFile)) {

            writer.write(
                    "Algorithm: Simulated Annealing"
            );
            writer.newLine();

            writer.write(
                    "Candidate Count: "
                    + candidateCount
            );
            writer.newLine();

            writer.write(
                    "Selected Count: "
                    + selected.length
            );
            writer.newLine();

            writer.write(
                    "Seed: "
                    + seed
            );
            writer.newLine();

            writer.write(
                    "Iterations: "
                    + iterations
            );
            writer.newLine();

            writer.write(
                    "Initial Temperature: "
                    + t0
            );
            writer.newLine();

            writer.write(
                    "Cooling Rate: "
                    + cooling
            );
            writer.newLine();

            writer.write(
                    "Best Fitness: "
                    + bestFitness
            );
            writer.newLine();

            writer.write(
                    "Execution Time (ms): "
                    + executionTimeMs
            );
            writer.newLine();

            writer.newLine();

            writer.write(
                    "Selected Tests:"
            );
            writer.newLine();

            for (int index : selected) {

                writer.write(
                        String.format(
                                "T%02d (index=%d)",
                                index + 1,
                                index
                        )
                );

                writer.newLine();
            }
        }

        /*
         * result.csv
         */
        Path csvFile =
                resultDirectory.resolve(
                        "result.csv"
                );

        boolean newFile =
                Files.notExists(csvFile);

        try (BufferedWriter writer =
                     Files.newBufferedWriter(
                             csvFile,
                             StandardOpenOption.CREATE,
                             StandardOpenOption.APPEND)) {

            if (newFile) {

                writer.write(
                    "algorithm,"
                    + "candidate_count,"
                    + "selected_count,"
                    + "selected_tests,"
                    + "best_fitness,"
                    + "seed,"
                    + "iterations,"
                    + "t0,"
                    + "cooling,"
                    + "execution_time_ms"
                );

                writer.newLine();
            }

            writer.write(
                    "SA,"
                    + candidateCount + ","
                    + selected.length + ","
                    + "\""
                    + selectedTestsToString(selected)
                    + "\","
                    + bestFitness + ","
                    + seed + ","
                    + iterations + ","
                    + t0 + ","
                    + cooling + ","
                    + executionTimeMs
            );

            writer.newLine();
        }
    }

    public static void main(String[] args)
            throws IOException {

        if (args.length < 3) {

            System.out.println(
                    "Usage: "
                    + "java SimulatedAnnealingSelector "
                    + "<candidateCount> "
                    + "<suiteSize> "
                    + "<seed>"
            );

            return;
        }

        int n =
                Integer.parseInt(args[0]);

        int k =
                Integer.parseInt(args[1]);

        long seed =
                Long.parseLong(args[2]);

        int iterations = 5000;
        double t0 = 10.0;
        double cooling = 0.995;

        double[] weights =
                new double[n];

        Arrays.fill(
                weights,
                1.0
        );

        long startTime =
                System.nanoTime();

        int[] selected =
                select(
                        weights,
                        k,
                        seed,
                        iterations,
                        t0,
                        cooling
                );

        long endTime =
                System.nanoTime();

        long executionTimeMs =
                (endTime - startTime)
                / 1_000_000;

        System.out.println(
                "===== SA RESULT ====="
        );

        System.out.println(
                "Selected indexes: "
                + Arrays.toString(selected)
        );

        System.out.println(
                "Selected Tests:"
        );

        for (int index : selected) {

            System.out.println(
                    String.format(
                            "T%02d",
                            index + 1
                    )
            );
        }

        saveResults(
                n,
                selected,
                weights,
                seed,
                iterations,
                t0,
                cooling,
                executionTimeMs
        );

        System.out.println(
                "Results saved to Results/"
        );
    }
}