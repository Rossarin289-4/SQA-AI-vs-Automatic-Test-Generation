import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

public final class MockitoSASelector {

    private MockitoSASelector() {
    }

    public static void main(String[] args) throws Exception {
        Settings settings = Settings.parse(args);

        Map<Integer, List<String>> modifiedSources =
                readModifiedSources(settings.modifiedSources);

        List<String> lines = new ArrayList<String>();
        lines.add("bug_id,test_target,fitness,seed,iterations,temperature,cooling_rate");

        for (int bugId = 1; bugId <= 38; bugId++) {
            Path candidateFile =
                    settings.candidatesRoot.resolve("Mockito-" + bugId + ".txt");

            List<Candidate> candidates = readCandidates(candidateFile);

            List<String> sources = modifiedSources.get(bugId);

            if (candidates.isEmpty()) {
                System.err.println("No valid candidates for Mockito-" + bugId);
                continue;
            }

            if (sources == null || sources.isEmpty()) {
                throw new IllegalStateException(
                        "No modified source for Mockito-" + bugId);
            }

            for (Candidate candidate : candidates) {
                candidate.fitness = score(candidate.target, sources);
            }

            Candidate selected = anneal(candidates, settings, bugId);

            lines.add(
                    bugId + ","
                            + selected.target + ","
                            + String.format(Locale.ROOT, "%.6f", selected.fitness)
                            + ","
                            + settings.seed + ","
                            + settings.iterations + ","
                            + settings.initialTemperature + ","
                            + settings.coolingRate);

            System.out.println(
                    "Mockito-" + bugId
                            + ": candidates=" + candidates.size()
                            + ", selected=" + selected.target);
        }

        Files.createDirectories(settings.output.getParent());

        Files.write(
                settings.output,
                lines,
                StandardCharsets.UTF_8);

        System.out.println();
        System.out.println("SA selection written: " + settings.output);
        System.out.println("Selected scenarios: " + (lines.size() - 1));
    }

    private static Map<Integer, List<String>> readModifiedSources(Path file)
            throws IOException {

        Map<Integer, List<String>> result =
                new HashMap<Integer, List<String>>();

        for (String line :
                Files.readAllLines(file, StandardCharsets.UTF_8)) {

            line = line.trim();

            if (line.isEmpty() || line.startsWith("bug_id,")) {
                continue;
            }

            String[] parts = line.split(",", 2);

            if (parts.length != 2) {
                continue;
            }

            int bugId = Integer.parseInt(parts[0].trim());
            String source = parts[1].trim();

            List<String> sources = result.get(bugId);

            if (sources == null) {
                sources = new ArrayList<String>();
                result.put(bugId, sources);
            }

            sources.add(source);
        }

        return result;
    }

    private static List<Candidate> readCandidates(Path file)
            throws IOException {

        List<Candidate> result =
                new ArrayList<Candidate>();

        if (!Files.exists(file)) {
            return result;
        }

        for (String line :
                Files.readAllLines(file, StandardCharsets.UTF_8)) {

            String target = line.trim();

            if (target.isEmpty()) {
                continue;
            }

            if (isNonEmptyTestMethod(target)) {
                result.add(new Candidate(target));
            }
        }

        return result;
    }

    /*
     * Exclude Defects4J placeholder methods such as:
     *
     * public void should_capture_varargs_as_vararg() {}
     *
     * The real flaky implementation may be commented out below it.
     */
    private static boolean isNonEmptyTestMethod(String target) {

        int separator = target.indexOf("::");

        if (separator < 0) {
            return false;
        }

        String className = target.substring(0, separator);
        String methodName = target.substring(separator + 2);

        Path source =
                Paths.get("/tmp/Mockito-SA-pool/test")
                        .resolve(className.replace('.', '/') + ".java");

        if (!Files.exists(source)) {
            return false;
        }

        try {
            String text =
                    new String(
                            Files.readAllBytes(source),
                            StandardCharsets.UTF_8);

            /*
             * Exact empty method:
             * method(...) {}
             *
             * Supports whitespace/newlines inside the parentheses/body.
             */
            Pattern emptyMethod =
                    Pattern.compile(
                            "\\b"
                                    + Pattern.quote(methodName)
                                    + "\\s*\\([^)]*\\)"
                                    + "\\s*\\{\\s*\\}",
                            Pattern.DOTALL);

            if (emptyMethod.matcher(text).find()) {
                return false;
            }

            return true;

        } catch (IOException e) {
            return false;
        }
    }

    private static Candidate anneal(
            List<Candidate> choices,
            Settings settings,
            int bugId) {

        Random random =
                new Random(settings.seed + 31L * bugId);

        Candidate current =
                choices.get(random.nextInt(choices.size()));

        Candidate best = current;

        double temperature = settings.initialTemperature;

        for (int iteration = 0;
                iteration < settings.iterations;
                iteration++) {

            Candidate neighbour =
                    choices.get(random.nextInt(choices.size()));

            double delta =
                    neighbour.fitness - current.fitness;

            if (delta >= 0.0
                    || random.nextDouble()
                    < Math.exp(delta / temperature)) {

                current = neighbour;
            }

            if (current.fitness > best.fitness) {
                best = current;
            }

            temperature =
                    Math.max(
                            0.000001,
                            temperature * settings.coolingRate);
        }

        return best;
    }

    private static double score(
            String target,
            List<String> modifiedSources) {

        String targetLower =
                target.toLowerCase(Locale.ROOT);

        double value = 10.0;

        for (String source : modifiedSources) {

            String sourceLower =
                    source.toLowerCase(Locale.ROOT);

            int lastDot =
                    sourceLower.lastIndexOf('.');

            String className =
                    lastDot >= 0
                            ? sourceLower.substring(lastDot + 1)
                            : sourceLower;

            String simpleName =
                    className.replace("$", "");

            if (targetLower.contains(simpleName)) {
                value += 50.0;
            }

            String[] parts =
                    sourceLower.split("\\.");

            for (String part : parts) {
                if (part.length() >= 5
                        && targetLower.contains(part)) {
                    value += 3.0;
                }
            }
        }

        if (targetLower.contains("test")) {
            value += 1.0;
        }

        if (targetLower.contains("null")) {
            value += 2.0;
        }

        if (targetLower.contains("exception")
                || targetLower.contains("error")
                || targetLower.contains("invalid")) {
            value += 2.0;
        }

        if (targetLower.contains("verify")
                || targetLower.contains("verification")) {
            value += 2.0;
        }

        if (targetLower.contains("mock")
                || targetLower.contains("stub")
                || targetLower.contains("stubbing")) {
            value += 2.0;
        }

        if (targetLower.contains("argument")
                || targetLower.contains("matcher")) {
            value += 2.0;
        }

        if (targetLower.contains("generic")
                || targetLower.contains("type")) {
            value += 2.0;
        }

        return value;
    }

    private static final class Candidate {

        private final String target;
        private double fitness;

        private Candidate(String target) {
            this.target = target;
        }
    }

    private static final class Settings {

        private final Path candidatesRoot;
        private final Path modifiedSources;
        private final Path output;
        private final long seed;
        private final int iterations;
        private final double initialTemperature;
        private final double coolingRate;

        private Settings(
                Path candidatesRoot,
                Path modifiedSources,
                Path output,
                long seed,
                int iterations,
                double initialTemperature,
                double coolingRate) {

            this.candidatesRoot = candidatesRoot;
            this.modifiedSources = modifiedSources;
            this.output = output;
            this.seed = seed;
            this.iterations = iterations;
            this.initialTemperature = initialTemperature;
            this.coolingRate = coolingRate;
        }

        private static Settings parse(String[] args) {

            Path candidates = null;
            Path modifiedSources = null;
            Path output = null;

            long seed = 20260923L;
            int iterations = 5000;
            double temperature = 10.0;
            double cooling = 0.995;

            for (int i = 0; i < args.length; i += 2) {

                if (i + 1 >= args.length) {
                    throw new IllegalArgumentException(
                            "Missing value for " + args[i]);
                }

                String option = args[i];
                String value = args[i + 1];

                if ("--candidates".equals(option)) {
                    candidates = Paths.get(value);

                } else if ("--modified-sources".equals(option)) {
                    modifiedSources = Paths.get(value);

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
                            "Unknown option: " + option);
                }
            }

            if (candidates == null
                    || modifiedSources == null
                    || output == null) {

                throw new IllegalArgumentException(
                        "Required: "
                                + "--candidates <dir> "
                                + "--modified-sources <file> "
                                + "--output <file>");
            }

            return new Settings(
                    candidates,
                    modifiedSources,
                    output,
                    seed,
                    iterations,
                    temperature,
                    cooling);
        }
    }
}
