
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Selects one JUnit scenario per Defects4J Chart bug by simulated annealing.
 */
public final class SimulatedAnnealingSelector {

    private static final Pattern PACKAGE = Pattern.compile(
            "(?m)^\\s*package\\s+([^;]+);"
    );

    private static final Pattern CLASS = Pattern.compile(
            "(?m)^\\s*public\\s+(?:final\\s+)?class\\s+([A-Za-z_][A-Za-z0-9_]*)"
    );

    private static final Pattern TEST_METHOD = Pattern.compile(
            "public\\s+void\\s+(test[A-Za-z0-9_]*)\\s*\\("
    );

    private SimulatedAnnealingSelector() {
    }

    public static void main(String[] args) throws Exception {
        Settings settings = Settings.parse(args);

        List<Candidate> candidates = readCandidates(settings.candidatesRoot);

        if (candidates.isEmpty()) {
            throw new IllegalArgumentException(
                    "No JUnit test methods found in " + settings.candidatesRoot
            );
        }

        Files.createDirectories(settings.output.getParent());

        List<String> lines = new ArrayList<String>();
        lines.add(
                "bug_id,test_target,fitness,seed,iterations,"
                        + "temperature,cooling_rate"
        );

        for (int bugId = 1; bugId <= 26; bugId++) {
            List<Candidate> perBug = new ArrayList<Candidate>();

            for (Candidate candidate : candidates) {
                if (candidate.bugId == bugId) {
                    perBug.add(candidate);
                }
            }

            if (perBug.isEmpty()) {
                continue;
            }

            Candidate selected = anneal(perBug, settings, bugId);

            lines.add(
                    bugId + ","
                            + selected.target + ","
                            + String.format(Locale.ROOT, "%.6f", selected.fitness) + ","
                            + settings.seed + ","
                            + settings.iterations + ","
                            + settings.initialTemperature + ","
                            + settings.coolingRate
            );
        }

        Files.write(settings.output, lines, StandardCharsets.UTF_8);

        System.out.println("SA selection written: " + settings.output);
        System.out.println("Selected scenarios: " + (lines.size() - 1));
    }

    private static Candidate anneal(
            List<Candidate> choices,
            Settings settings,
            int bugId
    ) {
        Random random = new Random(settings.seed + 31L * bugId);

        Candidate current = choices.get(random.nextInt(choices.size()));
        Candidate best = current;
        double temperature = settings.initialTemperature;

        for (int iteration = 0; iteration < settings.iterations; iteration++) {
            Candidate neighbour = choices.get(random.nextInt(choices.size()));

            double delta = neighbour.fitness - current.fitness;

            if (delta >= 0.0
                    || random.nextDouble() < Math.exp(delta / temperature)) {
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

    private static List<Candidate> readCandidates(Path root)
            throws IOException {

        List<Candidate> result = new ArrayList<Candidate>();

        try (Stream<Path> paths = Files.walk(root)) {
            paths.filter(path -> path.toString().endsWith(".java"))
                    .sorted(Comparator.comparing(Path::toString))
                    .forEach(path -> addCandidates(path, result));
        }

        return result;
    }

    private static void addCandidates(
            Path sourceFile,
            List<Candidate> result
    ) {
        try {
            String source = new String(
                    Files.readAllBytes(sourceFile),
                    StandardCharsets.UTF_8
            );

            String packageName = find(PACKAGE, source);
            String className = find(CLASS, source);
            int bugId = bugIdFromPath(sourceFile);

            if (packageName == null || className == null || bugId < 1) {
                return;
            }

            Matcher methods = TEST_METHOD.matcher(source);

            while (methods.find()) {
                String method = methods.group(1);
                String target = packageName + "."
                        + className + "::" + method;

                result.add(
                        new Candidate(
                                bugId,
                                target,
                                score(method, source)
                        )
                );
            }
        } catch (IOException exception) {
            throw new IllegalStateException(
                    "Cannot read " + sourceFile,
                    exception
            );
        }
    }

    private static String find(Pattern pattern, String source) {
        Matcher matcher = pattern.matcher(source);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return null;
    }

    private static int bugIdFromPath(Path sourceFile) {
        for (Path part : sourceFile) {
            String value = part.toString();

            if (value.matches("Chart-[0-9]+")) {
                return Integer.parseInt(
                        value.substring("Chart-".length())
                );
            }
        }

        return -1;
    }

    /**
     * Deterministic surrogate fitness based on the fixed candidate pool.
     */
    private static double score(String method, String source) {
        String name = method.toLowerCase(Locale.ROOT);

        double value = 10.0 + Math.min(method.length(), 40) * 0.10;
        value += count(source, "assert") * 0.15;

        if (name.contains("empty")) {
            value -= 30.0;
        }

        if (name.contains("null")) {
            value += 5.0;
        }

        if (name.contains("range") || name.contains("bound")) {
            value += 4.0;
        }

        if (name.contains("series") || name.contains("dataset")) {
            value += 3.0;
        }

        if (name.contains("exception") || name.contains("invalid")) {
            value += 3.0;
        }

        return value;
    }

    private static int count(String text, String token) {
        int result = 0;
        int position = 0;

        while ((position = text.indexOf(token, position)) >= 0) {
            result++;
            position += token.length();
        }

        return result;
    }

    private static final class Candidate {
        private final int bugId;
        private final String target;
        private final double fitness;

        private Candidate(int bugId, String target, double fitness) {
            this.bugId = bugId;
            this.target = target;
            this.fitness = fitness;
        }
    }

    private static final class Settings {
        private final Path candidatesRoot;
        private final Path output;
        private final long seed;
        private final int iterations;
        private final double initialTemperature;
        private final double coolingRate;

        private Settings(
                Path candidatesRoot,
                Path output,
                long seed,
                int iterations,
                double initialTemperature,
                double coolingRate
        ) {
            this.candidatesRoot = candidatesRoot;
            this.output = output;
            this.seed = seed;
            this.iterations = iterations;
            this.initialTemperature = initialTemperature;
            this.coolingRate = coolingRate;
        }

        private static Settings parse(String[] args) {
            Path candidates = null;
            Path output = null;

            long seed = 20260923L;
            int iterations = 5000;
            double temperature = 10.0;
            double cooling = 0.995;

            for (int index = 0; index < args.length; index += 2) {
                if (index + 1 >= args.length) {
                    throw new IllegalArgumentException(
                            "Missing value for " + args[index]
                    );
                }

                String option = args[index];
                String value = args[index + 1];

                if ("--candidates".equals(option)) {
                    candidates = Paths.get(value);
                } else if ("--output".equals(option)) {
                    output = Paths.get(value);
                } else if ("--seed".equals(option)) {
                    seed = Long.parseLong(value);
                } else if ("--iterations".equals(option)) {
                    iterations = Integer.parseInt(value);
                } else if ("--temperature".equals(option)) {
                    temperature = Double.parseDouble(value);
                } else if ("--cooling".equals(option)) {
                    cooling = Double.parseDouble(value);
                } else {
                    throw new IllegalArgumentException(
                            "Unknown option: " + option
                    );
                }
            }

            if (candidates == null || output == null) {
                throw new IllegalArgumentException(
                        "Required: --candidates <dir> --output <file>"
                );
            }

            return new Settings(
                    candidates,
                    output,
                    seed,
                    iterations,
                    temperature,
                    cooling
            );
        }
    }
}