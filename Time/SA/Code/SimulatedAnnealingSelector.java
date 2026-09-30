import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public final class SimulatedAnnealingSelector {

    private SimulatedAnnealingSelector() {
    }

    public static void main(String[] args) throws Exception {
        Settings settings = Settings.parse(args);

        List<Candidate> candidates = readCandidates(settings.candidates);

        if (candidates.isEmpty()) {
            throw new IllegalArgumentException(
                    "No candidates found: " + settings.candidates
            );
        }

        Map<Integer, List<Candidate>> byBug =
                new HashMap<Integer, List<Candidate>>();

        for (Candidate candidate : candidates) {
            if (!byBug.containsKey(candidate.bugId)) {
                byBug.put(
                        candidate.bugId,
                        new ArrayList<Candidate>()
                );
            }
            byBug.get(candidate.bugId).add(candidate);
        }

        Files.createDirectories(settings.output.getParent());

        List<String> lines = new ArrayList<String>();
        lines.add(
                "bug_id,test_target,fitness,seed,iterations,"
                        + "temperature,cooling_rate"
        );

        int selectedCount = 0;

        for (int bugId = 1; bugId <= 27; bugId++) {

            if (bugId == 21) {
                continue;
            }

            List<Candidate> choices = byBug.get(bugId);

            if (choices == null || choices.isEmpty()) {
                System.out.println(
                        "No candidates for Time-" + bugId
                );
                continue;
            }

            Candidate selected =
                    anneal(choices, settings, bugId);

            lines.add(
                    bugId + ","
                            + selected.target + ","
                            + String.format(
                                    Locale.ROOT,
                                    "%.6f",
                                    selected.fitness
                            ) + ","
                            + settings.seed + ","
                            + settings.iterations + ","
                            + settings.temperature + ","
                            + settings.coolingRate
            );

            selectedCount++;
        }

        Files.write(
                settings.output,
                lines,
                StandardCharsets.UTF_8
        );

        System.out.println(
                "SA selection written: " + settings.output
        );

        System.out.println(
                "Selected scenarios: " + selectedCount
        );
    }

    private static Candidate anneal(
            List<Candidate> choices,
            Settings settings,
            int bugId
    ) {
        Random random =
                new Random(settings.seed + 31L * bugId);

        Candidate current =
                choices.get(
                        random.nextInt(choices.size())
                );

        Candidate best = current;

        double temperature =
                settings.temperature;

        for (int i = 0;
             i < settings.iterations;
             i++) {

            Candidate neighbour =
                    choices.get(
                            random.nextInt(choices.size())
                    );

            double delta =
                    neighbour.fitness
                            - current.fitness;

            if (delta >= 0.0
                    || random.nextDouble()
                    < Math.exp(
                            delta / temperature
                    )) {

                current = neighbour;
            }

            if (current.fitness > best.fitness) {
                best = current;
            }

            temperature = Math.max(
                    0.000001,
                    temperature * settings.coolingRate
            );
        }

        return best;
    }

    private static List<Candidate> readCandidates(
            Path path
    ) throws IOException {

        List<Candidate> result =
                new ArrayList<Candidate>();

        try (BufferedReader reader =
                     Files.newBufferedReader(
                             path,
                             StandardCharsets.UTF_8
                     )) {

            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",", 2);

                if (parts.length != 2) {
                    continue;
                }

                int bugId =
                        Integer.parseInt(parts[0].trim());

                String target =
                        parts[1].trim();

                double fitness =
                        score(target);

                result.add(
                        new Candidate(
                                bugId,
                                target,
                                fitness
                        )
                );
            }
        }

        return result;
    }

    private static double score(String target) {

        String method =
                target.substring(
                        target.indexOf("::") + 2
                );

        String name =
                method.toLowerCase(Locale.ROOT);

        double value =
                10.0
                + Math.min(method.length(), 40)
                * 0.10;

        if (name.contains("null")) {
            value += 5.0;
        }

        if (name.contains("constructor")) {
            value += 4.0;
        }

        if (name.contains("parse")) {
            value += 3.0;
        }

        if (name.contains("format")) {
            value += 3.0;
        }

        if (name.contains("add")
                || name.contains("minus")
                || name.contains("plus")) {
            value += 3.0;
        }

        if (name.contains("between")
                || name.contains("compare")) {
            value += 3.0;
        }

        if (name.contains("exception")
                || name.contains("invalid")) {
            value += 3.0;
        }

        return value;
    }

    private static final class Candidate {

        private final int bugId;
        private final String target;
        private final double fitness;

        private Candidate(
                int bugId,
                String target,
                double fitness
        ) {
            this.bugId = bugId;
            this.target = target;
            this.fitness = fitness;
        }
    }

    private static final class Settings {

        private final Path candidates;
        private final Path output;
        private final long seed;
        private final int iterations;
        private final double temperature;
        private final double coolingRate;

        private Settings(
                Path candidates,
                Path output,
                long seed,
                int iterations,
                double temperature,
                double coolingRate
        ) {
            this.candidates = candidates;
            this.output = output;
            this.seed = seed;
            this.iterations = iterations;
            this.temperature = temperature;
            this.coolingRate = coolingRate;
        }

        private static Settings parse(
                String[] args
        ) {

            Path candidates =
                    Paths.get(
                            "Time/SA/Test/candidates.csv"
                    );

            Path output =
                    Paths.get(
                            "Time/SA/Result/Round1/sa_selection.csv"
                    );

            long seed = 20260923L;
            int iterations = 5000;
            double temperature = 10.0;
            double coolingRate = 0.995;

            for (int i = 0;
                 i < args.length;
                 i++) {

                switch (args[i]) {

                    case "--candidates":
                        candidates =
                                Paths.get(args[++i]);
                        break;

                    case "--output":
                        output =
                                Paths.get(args[++i]);
                        break;

                    case "--seed":
                        seed =
                                Long.parseLong(args[++i]);
                        break;

                    case "--iterations":
                        iterations =
                                Integer.parseInt(args[++i]);
                        break;

                    case "--temperature":
                        temperature =
                                Double.parseDouble(args[++i]);
                        break;

                    case "--cooling":
                        coolingRate =
                                Double.parseDouble(args[++i]);
                        break;

                    default:
                        throw new IllegalArgumentException(
                                "Unknown argument: "
                                        + args[i]
                        );
                }
            }

            return new Settings(
                    candidates,
                    output,
                    seed,
                    iterations,
                    temperature,
                    coolingRate
            );
        }
    }
}
