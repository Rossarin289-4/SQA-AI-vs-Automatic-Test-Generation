package generators.bpso;

import generators.common.Candidate;
import generators.common.CandidateProvider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BinaryParticleSwarmEngine {

    private final int particles;
    private final int iterations;
    private final int suiteSize;
    private final long seed;

    private static final double W = 0.729;
    private static final double C1 = 1.49445;
    private static final double C2 = 1.49445;

    public BinaryParticleSwarmEngine(
            int particles,
            int iterations,
            int suiteSize,
            long seed) {

        this.particles = particles;
        this.iterations = iterations;
        this.suiteSize = suiteSize;
        this.seed = seed;
    }

    public boolean[] search(
            List<Candidate> candidates,
            CandidateProvider provider) {

        if (suiteSize > candidates.size()) {

            throw new IllegalArgumentException(
                    "Suite size cannot exceed candidate pool size");
        }

        int dimension =
                candidates.size();

        Random random =
                new Random(seed);

        int[][] positions =
                new int[particles][dimension];

        int[][] personalBest =
                new int[particles][dimension];

        double[][] velocities =
                new double[particles][dimension];

        double[] personalBestFitness =
                new double[particles];

        int[] globalBest = null;

        double globalBestFitness =
                Double.NEGATIVE_INFINITY;

        for (int p = 0;
             p < particles;
             p++) {

            positions[p] =
                    randomPosition(
                            dimension,
                            suiteSize,
                            random);

            personalBest[p] =
                    positions[p].clone();

            personalBestFitness[p] =
                    provider.fitness(
                            candidates,
                            toBoolean(
                                    positions[p]));

            if (personalBestFitness[p]
                    > globalBestFitness) {

                globalBestFitness =
                        personalBestFitness[p];

                globalBest =
                        positions[p].clone();
            }
        }

        for (int iteration = 0;
             iteration < iterations;
             iteration++) {

            for (int p = 0;
                 p < particles;
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
                            * (
                                personalBest[p][d]
                                - positions[p][d]
                            )
                            + C2 * r2
                            * (
                                globalBest[d]
                                - positions[p][d]
                            );

                    double probability =
                            sigmoid(
                                    velocities[p][d]);

                    positions[p][d] =
                            random.nextDouble()
                                    < probability
                            ? 1
                            : 0;
                }

                repair(
                        positions[p],
                        suiteSize,
                        random);

                double currentFitness =
                        provider.fitness(
                                candidates,
                                toBoolean(
                                        positions[p]));

                if (currentFitness
                        > personalBestFitness[p]) {

                    personalBestFitness[p] =
                            currentFitness;

                    personalBest[p] =
                            positions[p].clone();
                }

                if (personalBestFitness[p]
                        > globalBestFitness) {

                    globalBestFitness =
                            personalBestFitness[p];

                    globalBest =
                            personalBest[p].clone();
                }
            }
        }

        return toBoolean(globalBest);
    }

    private int[] randomPosition(
            int dimension,
            int suiteSize,
            Random random) {

        int[] position =
                new int[dimension];

        int count = 0;

        while (count < suiteSize) {

            int index =
                    random.nextInt(dimension);

            if (position[index] == 0) {

                position[index] = 1;
                count++;
            }
        }

        return position;
    }

    private void repair(
            int[] position,
            int suiteSize,
            Random random) {

        int count = 0;

        for (int value : position) {

            if (value == 1) {
                count++;
            }
        }

        while (count > suiteSize) {

            int index =
                    random.nextInt(
                            position.length);

            if (position[index] == 1) {

                position[index] = 0;
                count--;
            }
        }

        while (count < suiteSize) {

            int index =
                    random.nextInt(
                            position.length);

            if (position[index] == 0) {

                position[index] = 1;
                count++;
            }
        }
    }

    private double sigmoid(
            double value) {

        return 1.0
                / (
                    1.0
                    + Math.exp(-value)
                );
    }

    private boolean[] toBoolean(
            int[] position) {

        boolean[] result =
                new boolean[position.length];

        for (int i = 0;
             i < position.length;
             i++) {

            result[i] =
                    position[i] == 1;
        }

        return result;
    }
}
