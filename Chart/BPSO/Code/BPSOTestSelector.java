import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

/** Selects candidate JUnit tests with binary particle swarm optimization. */
public class BPSOTestSelector {
    private static final double INERTIA = 0.7;
    private static final double COGNITIVE = 1.4;
    private static final double SOCIAL = 1.4;

    private static final class Candidate {
        final String id;
        final Set<String> labels;

        Candidate(String id, String labels) {
            this.id = id;
            this.labels = new HashSet<>();
            for (String label : labels.split(";")) {
                if (!label.trim().isEmpty()) this.labels.add(label.trim());
            }
        }
    }

    private static List<Candidate> readCandidates(Path file) throws IOException {
        List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
        if (lines.isEmpty() || !lines.get(0).trim().equals("test_id,labels")) {
            throw new IllegalArgumentException("CSV header must be test_id,labels");
        }
        List<Candidate> candidates = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        for (int i = 1; i < lines.size(); i++) {
            if (lines.get(i).isBlank()) continue;
            String[] fields = lines.get(i).split(",", -1);
            if (fields.length != 2 || fields[0].trim().isEmpty()
                    || !seen.add(fields[0].trim())) {
                throw new IllegalArgumentException("Invalid or duplicate candidate at line " + (i + 1));
            }
            candidates.add(new Candidate(fields[0].trim(), fields[1]));
        }
        if (candidates.isEmpty()) throw new IllegalArgumentException("No candidates in " + file);
        return candidates;
    }

    private static double fitness(boolean[] bits, List<Candidate> candidates, double penalty) {
        Set<String> labels = new HashSet<>();
        int selected = 0;
        for (int j = 0; j < bits.length; j++) {
            if (bits[j]) {
                selected++;
                labels.addAll(candidates.get(j).labels);
            }
        }
        return labels.size() - penalty * selected;
    }

    private static String jsonString(String value) {
        return "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"")
                .replace("\n", "\\n").replace("\r", "\\r") + "\"";
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 2 || args.length > 5) {
            System.err.println("Usage: java BPSOTestSelector <candidates.csv> <output.json>"
                    + " [seed=20260928] [particles=30] [iterations=200]");
            System.exit(2);
        }
        Path input = Path.of(args[0]);
        Path output = Path.of(args[1]);
        long seed = args.length > 2 ? Long.parseLong(args[2]) : 20260928L;
        int particles = args.length > 3 ? Integer.parseInt(args[3]) : 30;
        int iterations = args.length > 4 ? Integer.parseInt(args[4]) : 200;
        if (particles < 1 || iterations < 0) throw new IllegalArgumentException("Invalid BPSO settings");
        long started = System.nanoTime();
        List<Candidate> candidates = readCandidates(input);
        int n = candidates.size();
        Random random = new Random(seed);
        boolean[][] positions = new boolean[particles][n];
        boolean[][] personal = new boolean[particles][n];
        double[][] velocities = new double[particles][n];
        double[] personalScores = new double[particles];
        boolean[] global = null;
        double globalScore = Double.NEGATIVE_INFINITY;
        double penalty = 0.25;

        for (int i = 0; i < particles; i++) {
            for (int j = 0; j < n; j++) {
                positions[i][j] = random.nextBoolean();
                velocities[i][j] = random.nextDouble() * 2 - 1;
            }
            personal[i] = positions[i].clone();
            personalScores[i] = fitness(positions[i], candidates, penalty);
            if (personalScores[i] > globalScore) {
                globalScore = personalScores[i];
                global = positions[i].clone();
            }
        }
        for (int step = 0; step < iterations; step++) {
            for (int i = 0; i < particles; i++) {
                for (int j = 0; j < n; j++) {
                    double v = INERTIA * velocities[i][j]
                            + COGNITIVE * random.nextDouble() * ((personal[i][j] ? 1 : 0) - (positions[i][j] ? 1 : 0))
                            + SOCIAL * random.nextDouble() * ((global[j] ? 1 : 0) - (positions[i][j] ? 1 : 0));
                    velocities[i][j] = Math.max(-6, Math.min(6, v));
                    positions[i][j] = random.nextDouble() < 1.0 / (1.0 + Math.exp(-velocities[i][j]));
                }
                double score = fitness(positions[i], candidates, penalty);
                if (score > personalScores[i]) {
                    personalScores[i] = score;
                    personal[i] = positions[i].clone();
                    if (score > globalScore) {
                        globalScore = score;
                        global = positions[i].clone();
                    }
                }
            }
        }
        List<String> selected = new ArrayList<>();
        for (int j = 0; j < n; j++) if (global[j]) selected.add(candidates.get(j).id);
        double elapsed = (System.nanoTime() - started) / 1e9;
        List<String> quoted = new ArrayList<>();
        for (String id : selected) quoted.add(jsonString(id));
        String json = "{\n  \"candidate_file\": " + jsonString(input.toString())
                + ",\n  \"seed\": " + seed + ",\n  \"particles\": " + particles
                + ",\n  \"iterations\": " + iterations
                + ",\n  \"size_penalty\": 0.25"
                + ",\n  \"surrogate_fitness\": " + String.format(Locale.ROOT, "%.6f", globalScore)
                + ",\n  \"selected_test_ids\": [" + String.join(", ", quoted) + "]"
                + ",\n  \"generation_seconds\": " + String.format(Locale.ROOT, "%.6f", elapsed)
                + ",\n  \"measured_coverage\": null,\n  \"fault_detected\": null\n}\n";
        if (output.getParent() != null) Files.createDirectories(output.getParent());
        Files.writeString(output, json, StandardCharsets.UTF_8);
        System.out.println("Selected " + selected.size() + "/" + n
                + " tests; surrogate fitness " + String.format(Locale.ROOT, "%.3f", globalScore));
        System.out.println("Saved " + output);
    }
}
