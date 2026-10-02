package generators.sa;

import generators.common.Candidate;
import generators.common.CandidateProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulatedAnnealingEngine {

    private final int suiteSize;
    private final int iterations;
    private final long seed;

    public SimulatedAnnealingEngine(
            int suiteSize,
            int iterations,
            long seed) {

        this.suiteSize = suiteSize;
        this.iterations = iterations;
        this.seed = seed;
    }

    public boolean[] search(
            List<Candidate> candidates,
            CandidateProvider provider) {

        if (suiteSize > candidates.size()) {

            throw new IllegalArgumentException(
                    "Suite size cannot exceed candidate pool size");
        }

        Random random =
                new Random(seed);

        boolean[] current =
                randomState(
                        candidates.size(),
                        suiteSize,
                        random);

        double currentFitness =
                provider.fitness(
                        candidates,
                        current);

        boolean[] best =
                current.clone();

        double bestFitness =
                currentFitness;

        double temperature = 10.0;

        for (int iteration = 0;
             iteration < iterations;
             iteration++) {

            boolean[] next =
                    mutate(
                            current,
                            random);

            double nextFitness =
                    provider.fitness(
                            candidates,
                            next);

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
                currentFitness =
                        nextFitness;
            }

            if (currentFitness
                    > bestFitness) {

                best =
                        current.clone();

                bestFitness =
                        currentFitness;
            }

            temperature *= 0.995;

            if (temperature < 0.0001) {
                temperature = 0.0001;
            }
        }

        return best;
    }

    private boolean[] randomState(
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

    private boolean[] mutate(
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
}