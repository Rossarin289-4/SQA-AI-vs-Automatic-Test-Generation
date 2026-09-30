import java.util.Arrays;
import java.util.Random;

/**
 * Binary Particle Swarm Optimization for selecting a fixed-size test suite.
 *
 * Each particle is a binary vector:
 *   1 = candidate selected
 *   0 = candidate not selected
 *
 * Unlike the earlier one-vector prototype, this implementation has:
 * - multiple particles
 * - velocity per particle
 * - personal best (pBest)
 * - global best (gBest)
 */
public final class BPSOSelector {

    public interface FitnessFunction {
        double evaluate(boolean[] selection);
    }

    public static final class Result {
        public final boolean[] selection;
        public final double fitness;

        Result(boolean[] selection, double fitness) {
            this.selection = selection;
            this.fitness = fitness;
        }

        public int[] selectedIndexes() {
            int count = 0;
            for (boolean b : selection) if (b) count++;

            int[] out = new int[count];
            int p = 0;
            for (int i = 0; i < selection.length; i++) {
                if (selection[i]) out[p++] = i;
            }
            return out;
        }
    }

    private static final class Particle {
        boolean[] position;
        double[] velocity;
        boolean[] personalBest;
        double personalBestFitness = Double.NEGATIVE_INFINITY;

        Particle(int n) {
            position = new boolean[n];
            velocity = new double[n];
            personalBest = new boolean[n];
        }
    }

    public static Result select(
            int candidateCount,
            int suiteSize,
            long seed,
            int particleCount,
            int iterations,
            double inertia,
            double cognitive,
            double social,
            FitnessFunction fitness) {

        if (candidateCount <= 0) {
            throw new IllegalArgumentException("candidateCount must be > 0");
        }
        int k = Math.min(Math.max(1, suiteSize), candidateCount);
        int swarmSize = Math.max(2, particleCount);

        Random random = new Random(seed);
        Particle[] swarm = new Particle[swarmSize];

        boolean[] globalBest = null;
        double globalBestFitness = Double.NEGATIVE_INFINITY;

        for (int p = 0; p < swarmSize; p++) {
            Particle particle = new Particle(candidateCount);
            randomFixedSizePosition(particle.position, k, random);

            for (int i = 0; i < candidateCount; i++) {
                particle.velocity[i] = random.nextDouble() * 2.0 - 1.0;
            }

            double f = fitness.evaluate(particle.position);
            particle.personalBest = particle.position.clone();
            particle.personalBestFitness = f;

            if (f > globalBestFitness) {
                globalBestFitness = f;
                globalBest = particle.position.clone();
            }
            swarm[p] = particle;
        }

        for (int it = 0; it < iterations; it++) {
            for (Particle particle : swarm) {
                for (int i = 0; i < candidateCount; i++) {
                    double x = particle.position[i] ? 1.0 : 0.0;
                    double pBest = particle.personalBest[i] ? 1.0 : 0.0;
                    double gBest = globalBest[i] ? 1.0 : 0.0;

                    particle.velocity[i] =
                            inertia * particle.velocity[i]
                            + cognitive * random.nextDouble() * (pBest - x)
                            + social * random.nextDouble() * (gBest - x);
                }

                // Convert velocities to probabilities, then enforce exactly k selected tests.
                double[] priority = new double[candidateCount];
                for (int i = 0; i < candidateCount; i++) {
                    double probability = sigmoid(particle.velocity[i]);
                    priority[i] = probability + random.nextDouble() * 1e-12;
                }
                particle.position = topK(priority, k);

                double f = fitness.evaluate(particle.position);

                if (f > particle.personalBestFitness) {
                    particle.personalBestFitness = f;
                    particle.personalBest = particle.position.clone();
                }

                if (f > globalBestFitness) {
                    globalBestFitness = f;
                    globalBest = particle.position.clone();
                }
            }
        }

        return new Result(globalBest, globalBestFitness);
    }

    private static double sigmoid(double value) {
        if (value > 40) return 1.0;
        if (value < -40) return 0.0;
        return 1.0 / (1.0 + Math.exp(-value));
    }

    private static void randomFixedSizePosition(boolean[] position, int k, Random random) {
        Arrays.fill(position, false);
        int selected = 0;
        while (selected < k) {
            int index = random.nextInt(position.length);
            if (!position[index]) {
                position[index] = true;
                selected++;
            }
        }
    }

    private static boolean[] topK(double[] values, int k) {
        Integer[] indexes = new Integer[values.length];
        for (int i = 0; i < values.length; i++) indexes[i] = i;

        Arrays.sort(indexes, (a, b) -> Double.compare(values[b], values[a]));

        boolean[] result = new boolean[values.length];
        for (int i = 0; i < k; i++) result[indexes[i]] = true;
        return result;
    }
}
