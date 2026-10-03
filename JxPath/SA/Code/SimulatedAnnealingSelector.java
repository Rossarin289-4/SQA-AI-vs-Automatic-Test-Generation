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

        for (int bugId = 1; bugId <= 22; bugId++) {


            List<Candidate> choices = byBug.get(bugId);

            if (choices == null || choices.isEmpty()) {
                System.out.println(
                        "No candidates for JxPath-" + bugId
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
                        score(bugId, target);

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

    private static double score(int bugId, String target) {
    String lower = target.toLowerCase(Locale.ROOT);
    String method = target.substring(target.indexOf("::") + 2)
            .toLowerCase(Locale.ROOT);

    double value = 10.0 + Math.min(method.length(), 40) * 0.10;

    // Generic test relevance.
    if (method.contains("test")) value += 1.0;
    if (lower.contains("dom")) value += 1.0;
    if (lower.contains("jdom")) value += 1.0;
    if (lower.contains("xml")) value += 1.0;

    // Bug-specific relevance based on the modified production class.
    switch (bugId) {
        case 1:
        case 4:
        case 12:
        case 16:
        case 19:
            if (lower.contains("dom")) value += 5.0;
            if (lower.contains("node")) value += 5.0;
            if (lower.contains("pointer")) value += 5.0;
            if (method.contains("iterate")) value += 2.0;
            break;

        case 2:
            if (lower.contains("expression")) value += 8.0;
            if (lower.contains("compiled")) value += 6.0;
            break;

        case 3:
            if (lower.contains("null")) value += 8.0;
            if (lower.contains("property")) value += 6.0;
            break;

        case 5:
            if (lower.contains("node")) value += 7.0;
            if (lower.contains("pointer")) value += 7.0;
            break;

        case 6:
        case 9:
            if (lower.contains("compare")) value += 8.0;
            if (lower.contains("equal")) value += 6.0;
            if (lower.contains("operation")) value += 3.0;
            break;

        case 7:
        case 8:
        case 10:
        case 20:
            if (lower.contains("relational")) value += 8.0;
            if (lower.contains("greater")) value += 5.0;
            if (lower.contains("less")) value += 5.0;
            if (lower.contains("compare")) value += 4.0;
            break;

        case 11:
        case 17:
            if (lower.contains("attribute")) value += 8.0;
            if (lower.contains("iterator")) value += 6.0;
            if (lower.contains("dom")) value += 4.0;
            break;

        case 13:
            if (lower.contains("namespace")) value += 8.0;
            if (lower.contains("dom")) value += 5.0;
            if (lower.contains("attribute")) value += 4.0;
            break;

        case 14:
            if (lower.contains("function")) value += 9.0;
            if (lower.contains("corefunction")) value += 10.0;
            break;

        case 15:
            if (lower.contains("union")) value += 9.0;
            if (lower.contains("context")) value += 5.0;
            break;

        case 18:
            if (lower.contains("attribute")) value += 8.0;
            if (lower.contains("context")) value += 7.0;
            break;

        case 21:
            if (lower.contains("property")) value += 8.0;
            if (lower.contains("pointer")) value += 5.0;
            if (lower.contains("null")) value += 4.0;
            break;

        case 22:
            if (lower.contains("namespace")) value += 9.0;
            if (lower.contains("attribute")) value += 7.0;
            if (lower.contains("dom")) value += 6.0;
            if (lower.contains("xml")) value += 3.0;
            break;

        default:
            break;
    }

    // Never allow generated/official tests into the SA pool.
    if (lower.contains("geminitest")
            || lower.contains("chatgpttest")
            || lower.contains("satest")
            || lower.contains("bpso")
            || lower.contains("jxpath154test")) {
        return -1000000.0;
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
                            "JxPath/SA/Configuration/candidates.csv"
                    );

            Path output =
                    Paths.get(
                            "JxPath/SA/Result_Round1/sa_selection.csv"
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
