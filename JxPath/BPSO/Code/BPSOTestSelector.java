import java.io.*;
import java.util.*;

public class BPSOTestSelector {

    static final double W = 0.729;
    static final double C1 = 1.49445;
    static final double C2 = 1.49445;

    static class Candidate {
        int id;
        String target;
        double line;
        double condition;
        double time;

        Candidate(int id, String target, double line,
                  double condition, double time) {
            this.id = id;
            this.target = target;
            this.line = line;
            this.condition = condition;
            this.time = time;
        }
    }

    static class Particle {
        double[] position;
        double[] velocity;
        double[] bestPosition;
        double fitness = Double.NEGATIVE_INFINITY;
        double bestFitness = Double.NEGATIVE_INFINITY;

        Particle(int n, Random rand) {
            position = new double[n];
            velocity = new double[n];
            bestPosition = new double[n];

            for (int i = 0; i < n; i++) {
                position[i] = rand.nextDouble();
                velocity[i] = rand.nextDouble() - 0.5;
            }

            System.arraycopy(position, 0, bestPosition, 0, n);
        }
    }

    static final int SUITE_SIZE = 3;
    static final int PARTICLES = 30;
    static final int ITERATIONS = 200;

    static List<Candidate> candidates;
    static double maxTime;

    static double fitness(double[] position) {
        Integer[] indexes = new Integer[position.length];

        for (int i = 0; i < position.length; i++) {
            indexes[i] = i;
        }

        Arrays.sort(indexes, (a, b) ->
            Double.compare(position[b], position[a]));

        double line = 0;
        double condition = 0;
        double time = 0;

        for (int i = 0; i < SUITE_SIZE; i++) {
            Candidate c = candidates.get(indexes[i]);

            line += c.line / 100.0;
            condition += c.condition / 100.0;

            if (maxTime > 0) {
                time += 1.0 - (c.time / maxTime);
            }
        }

        line /= SUITE_SIZE;
        condition /= SUITE_SIZE;
        time /= SUITE_SIZE;

        return 0.45 * line
             + 0.45 * condition
             + 0.10 * time;
    }

    static int[] bestIndexes(double[] position) {
        Integer[] indexes = new Integer[position.length];

        for (int i = 0; i < position.length; i++) {
            indexes[i] = i;
        }

        Arrays.sort(indexes, (a, b) ->
            Double.compare(position[b], position[a]));

        int[] result = new int[SUITE_SIZE];

        for (int i = 0; i < SUITE_SIZE; i++) {
            result[i] = indexes[i];
        }

        return result;
    }

    static List<Candidate> readCandidates(String file)
            throws Exception {

        List<Candidate> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(
            new FileReader(file));

        String line = br.readLine();

        while ((line = br.readLine()) != null) {

            if (line.trim().isEmpty()) {
                continue;
            }

            String[] p = line.split(",", 6);

            if (p.length < 6) {
                continue;
            }

            String status = p[5].trim();

            if (!status.equals("OK")) {
                continue;
            }

            int id = Integer.parseInt(p[0].trim());
            String target = p[1].trim();

            double linePct = Double.parseDouble(p[2].trim());
            double conditionPct = Double.parseDouble(p[3].trim());
            double executionMs = Double.parseDouble(p[4].trim());

            list.add(new Candidate(
                id,
                target,
                linePct,
                conditionPct,
                executionMs
            ));
        }

        br.close();

        return list;
    }

    static void writeSelection(
            String file,
            List<Candidate> list,
            int[] indexes,
            double fitness) throws Exception {

        PrintWriter out = new PrintWriter(
            new FileWriter(file));

        out.println(
            "test_id,test_target,line_pct,condition_pct,execution_ms");

        for (int index : indexes) {
            Candidate c = list.get(index);

            out.printf(
                Locale.US,
                "%d,%s,%.2f,%.2f,%.0f%n",
                c.id,
                c.target,
                c.line,
                c.condition,
                c.time
            );
        }

        out.close();

        System.out.printf(
            Locale.US,
            "Best fitness = %.6f%n",
            fitness
        );
    }

    public static void main(String[] args) throws Exception {

        if (args.length != 3) {
            System.err.println(
                "Usage: java BPSOTestSelector " +
                "<input.csv> <output.csv> <seed>"
            );
            System.exit(1);
        }

        String input = args[0];
        String output = args[1];
        long seed = Long.parseLong(args[2]);

        candidates = readCandidates(input);

        if (candidates.size() < SUITE_SIZE) {
            throw new IllegalArgumentException(
                "Not enough OK candidates: " +
                candidates.size()
            );
        }

        maxTime = 0;

        for (Candidate c : candidates) {
            maxTime = Math.max(maxTime, c.time);
        }

        Random rand = new Random(seed);

        List<Particle> swarm = new ArrayList<>();

        double[] globalBest = null;
        double globalBestFitness = Double.NEGATIVE_INFINITY;

        for (int p = 0; p < PARTICLES; p++) {

            Particle particle =
                new Particle(candidates.size(), rand);

            particle.fitness =
                fitness(particle.position);

            particle.bestFitness =
                particle.fitness;

            System.arraycopy(
                particle.position,
                0,
                particle.bestPosition,
                0,
                particle.position.length
            );

            swarm.add(particle);

            if (particle.fitness > globalBestFitness) {
                globalBestFitness = particle.fitness;
                globalBest =
                    particle.position.clone();
            }
        }

        for (int iteration = 0;
             iteration < ITERATIONS;
             iteration++) {

            for (Particle particle : swarm) {

                for (int i = 0;
                     i < particle.position.length;
                     i++) {

                    double r1 = rand.nextDouble();
                    double r2 = rand.nextDouble();

                    particle.velocity[i] =
                        W * particle.velocity[i]
                        + C1 * r1 *
                          (particle.bestPosition[i]
                           - particle.position[i])
                        + C2 * r2 *
                          (globalBest[i]
                           - particle.position[i]);

                    particle.position[i] +=
                        particle.velocity[i];

                    if (particle.position[i] < 0) {
                        particle.position[i] = 0;
                    }

                    if (particle.position[i] > 1) {
                        particle.position[i] = 1;
                    }
                }

                particle.fitness =
                    fitness(particle.position);

                if (particle.fitness >
                    particle.bestFitness) {

                    particle.bestFitness =
                        particle.fitness;

                    System.arraycopy(
                        particle.position,
                        0,
                        particle.bestPosition,
                        0,
                        particle.position.length
                    );
                }

                if (particle.fitness >
                    globalBestFitness) {

                    globalBestFitness =
                        particle.fitness;

                    globalBest =
                        particle.position.clone();
                }
            }
        }

        int[] selected =
            bestIndexes(globalBest);

        writeSelection(
            output,
            candidates,
            selected,
            globalBestFitness
        );

        System.out.println(
            "Selected tests:"
        );

        for (int index : selected) {
            System.out.println(
                candidates.get(index).target
            );
        }
    }
}
