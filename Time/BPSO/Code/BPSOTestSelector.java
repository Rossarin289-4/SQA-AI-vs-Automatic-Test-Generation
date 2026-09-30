import java.io.*;
import java.util.*;

public class BPSOTestSelector {

    static final double INERTIA = 0.729;
    static final double COGNITIVE = 1.49445;
    static final double SOCIAL = 1.49445;

    static class Candidate {
        String id;
        String target;
        double line;
        double condition;
        double executionMs;

        Candidate(String id, String target, double line,
                  double condition, double executionMs) {
            this.id = id;
            this.target = target;
            this.line = line;
            this.condition = condition;
            this.executionMs = executionMs;
        }
    }

    static class Particle {
        boolean[] position;
        boolean[] bestPosition;
        double[] velocity;
        double fitness;
        double bestFitness;

        Particle(int n, int suiteSize, Random random) {
            position = randomPosition(n, suiteSize, random);
            bestPosition = position.clone();
            velocity = new double[n];

            for (int i = 0; i < n; i++) {
                velocity[i] = -1.0 + 2.0 * random.nextDouble();
            }

            fitness = Double.NEGATIVE_INFINITY;
            bestFitness = Double.NEGATIVE_INFINITY;
        }
    }

    static boolean[] randomPosition(int n, int suiteSize, Random random) {
        boolean[] position = new boolean[n];

        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indexes.add(i);
        }

        Collections.shuffle(indexes, random);

        for (int i = 0; i < Math.min(suiteSize, n); i++) {
            position[indexes.get(i)] = true;
        }

        return position;
    }

    static void repair(boolean[] position, int suiteSize, Random random) {
        List<Integer> selected = new ArrayList<>();
        List<Integer> unselected = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            if (position[i]) {
                selected.add(i);
            } else {
                unselected.add(i);
            }
        }

        Collections.shuffle(selected, random);
        Collections.shuffle(unselected, random);

        while (selected.size() > suiteSize) {
            int index = selected.remove(selected.size() - 1);
            position[index] = false;
        }

        while (selected.size() < suiteSize && !unselected.isEmpty()) {
            int index = unselected.remove(unselected.size() - 1);
            position[index] = true;
            selected.add(index);
        }
    }

    static double fitness(boolean[] position, List<Candidate> candidates) {
        double lineScore = 0.0;
        double conditionScore = 0.0;
        double execution = 0.0;
        int count = 0;

        double maxExecutionMs = 0.0;

        for (Candidate c : candidates) {
            maxExecutionMs = Math.max(maxExecutionMs, c.executionMs);
        }

        for (int i = 0; i < candidates.size(); i++) {
            if (position[i]) {
                Candidate c = candidates.get(i);

                lineScore += c.line / 100.0;
                conditionScore += c.condition / 100.0;
                execution += c.executionMs;
                count++;
            }
        }

        if (count == 0) {
            return Double.NEGATIVE_INFINITY;
        }

        lineScore /= count;
        conditionScore /= count;

        double maxSuiteTime = maxExecutionMs * count;
        double timeScore = maxSuiteTime > 0
                ? 1.0 - (execution / maxSuiteTime)
                : 1.0;

        return (0.45 * lineScore)
             + (0.45 * conditionScore)
             + (0.10 * timeScore);
    }

    static String csv(String value) {
        if (value.contains(",") || value.contains("\"")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        }
        return value;
    }

    public static void main(String[] args) throws Exception {

        if (args.length < 3) {
            System.out.println(
                "Usage: java BPSOTestSelector <input.csv> <output.csv> <seed>"
            );
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];
        long seed = Long.parseLong(args[2]);

        int suiteSize = 3;
        int particlesCount = 30;
        int iterations = 200;

        List<Candidate> candidates = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line = br.readLine(); // header

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] p = line.split(",", -1);

                if (p.length < 6) {
                    continue;
                }

                String status = p[5].trim();

                if ("ERROR".equalsIgnoreCase(status)) {
                    continue;
                }

                candidates.add(
                    new Candidate(
                        p[0].trim(),
                        p[1].trim(),
                        Double.parseDouble(p[2].trim()),
                        Double.parseDouble(p[3].trim()),
                        Double.parseDouble(p[4].trim())
                    )
                );
            }
        }

        if (candidates.size() < suiteSize) {
            throw new IllegalStateException(
                "Not enough usable candidates: " + candidates.size()
            );
        }

        Random random = new Random(seed);

        Particle[] particles = new Particle[particlesCount];

        boolean[] globalBestPosition = null;
        double globalBestFitness = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < particlesCount; i++) {

            particles[i] =
                new Particle(candidates.size(), suiteSize, random);

            particles[i].fitness =
                fitness(particles[i].position, candidates);

            particles[i].bestFitness = particles[i].fitness;

            if (particles[i].fitness > globalBestFitness) {
                globalBestFitness = particles[i].fitness;
                globalBestPosition =
                    particles[i].position.clone();
            }
        }

        for (int iteration = 0; iteration < iterations; iteration++) {

            for (Particle particle : particles) {

                for (int i = 0; i < candidates.size(); i++) {

                    double r1 = random.nextDouble();
                    double r2 = random.nextDouble();

                    double cognitive =
                        COGNITIVE * r1 *
                        ((particle.bestPosition[i] ? 1 : 0)
                         - (particle.position[i] ? 1 : 0));

                    double social =
                        SOCIAL * r2 *
                        ((globalBestPosition[i] ? 1 : 0)
                         - (particle.position[i] ? 1 : 0));

                    particle.velocity[i] =
                        INERTIA * particle.velocity[i]
                        + cognitive
                        + social;

                    particle.velocity[i] =
                        Math.max(-6.0,
                        Math.min(6.0, particle.velocity[i]));

                    double probability =
                        1.0 /
                        (1.0 + Math.exp(-particle.velocity[i]));

                    particle.position[i] =
                        random.nextDouble() < probability;
                }

                repair(particle.position, suiteSize, random);

                particle.fitness =
                    fitness(particle.position, candidates);

                if (particle.fitness > particle.bestFitness) {
                    particle.bestFitness = particle.fitness;
                    particle.bestPosition =
                        particle.position.clone();
                }

                if (particle.fitness > globalBestFitness) {
                    globalBestFitness = particle.fitness;
                    globalBestPosition =
                        particle.position.clone();
                }
            }
        }

        List<Candidate> selected = new ArrayList<>();

        for (int i = 0; i < candidates.size(); i++) {
            if (globalBestPosition[i]) {
                selected.add(candidates.get(i));
            }
        }

        try (PrintWriter out =
                 new PrintWriter(new FileWriter(outputFile))) {

            out.println(
                "test_id,test_target,line_pct,condition_pct,execution_ms"
            );

            for (Candidate c : selected) {
                out.println(
                    csv(c.id) + "," +
                    csv(c.target) + "," +
                    c.line + "," +
                    c.condition + "," +
                    c.executionMs
                );
            }
        }

        System.out.println("===== BPSO COMPLETE =====");
        System.out.println("Candidates : " + candidates.size());
        System.out.println("Selected   : " + selected.size());
        System.out.println("Suite size : " + suiteSize);
        System.out.println("Particles  : " + particlesCount);
        System.out.println("Iterations : " + iterations);
        System.out.println("Seed       : " + seed);
        System.out.printf("Fitness    : %.6f%n", globalBestFitness);
        System.out.println("Output     : " + outputFile);

        System.out.println();
        System.out.println("Selected tests:");

        for (Candidate c : selected) {
            System.out.println(
                c.id + " -> " + c.target
            );
        }
    }
}
