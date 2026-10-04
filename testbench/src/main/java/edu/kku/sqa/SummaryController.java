package edu.kku.sqa;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Result table of the start page: one row per Project / Bug / method (AI or algorithm) with the number of tests, how many of
 * them detect the defect (FAIL on buggy and PASS on fixed), FDR = detecting tests / all tests x 100, line coverage on buggy
 * and generation time, averaged over the rounds that were run, plus the per-method means used by the charts.
 */
@Controller
public class SummaryController {
    private static final Pattern ABBREVIATION = Pattern.compile("\\(([A-Za-z]{2,8})\\)\\s*$");
    private final Path runsRoot;
    private final ObjectMapper mapper = new ObjectMapper();

    public SummaryController(@Value("${bench.output-dir:output}") String outputDir) {
        this.runsRoot = Paths.get(outputDir).toAbsolutePath().normalize().resolve("ai-runs");
    }

    /** Sums of the per-run values of one table row or one method; null values are not counted. */
    private static final class Acc {
        int runs, withTests, withDetect, withCoverage, withTime;
        double tests, detect, fdr, coverage, time;
        int fdrCount;
        // the newest run of this row: link target and its verdict
        String latestCreated = "", latestRunId = "", latestDetection = "", latestBuggy = "", latestFixed = "", latestNote = "";
        void latest(String created, String runId, String detection, String buggy, String fixed, String note) {
            if (created.compareTo(latestCreated) < 0) return;
            latestCreated = created; latestRunId = runId; latestDetection = detection; latestBuggy = buggy; latestFixed = fixed; latestNote = note;
        }
        void add(Double testCount, Double detectCount, Double coverage, Double seconds) {
            runs++;
            if (testCount != null) { withTests++; tests += testCount; }
            if (detectCount != null) { withDetect++; detect += detectCount; }
            if (testCount != null && detectCount != null && testCount > 0) { fdr += detectCount * 100.0 / testCount; fdrCount++; }
            if (coverage != null) { withCoverage++; this.coverage += coverage; }
            if (seconds != null) { withTime++; time += seconds; }
        }
        Object mean(double sum, int count) { return count == 0 ? null : sum / count; }
    }

    @GetMapping("/summary-data")
    @ResponseBody
    public Map<String, Object> data(@RequestParam(value = "project", defaultValue = "") String project) throws IOException {
        Map<String, Acc> rows = new TreeMap<>();        // key: project \t bug(padded) \t method order \t method
        Map<String, Acc> methods = new LinkedHashMap<>();
        Map<String, Integer> methodOrder = new HashMap<>();
        Set<String> projects = new TreeSet<>();
        if (Files.isDirectory(runsRoot)) {
            List<Path> files;
            try (Stream<Path> walk = Files.walk(runsRoot, 3)) {
                files = walk.filter(p -> p.getFileName().toString().equals("metadata.json")).collect(Collectors.toList());
            }
            for (Path file : files) {
                JsonNode meta;
                try { meta = mapper.readTree(file.toFile()); } catch (IOException e) { continue; }
                String projectName = meta.path("project").asText(""), bug = meta.path("bugId").asText("");
                if (projectName.isEmpty() || bug.isEmpty()) continue;
                projects.add(projectName);
                if (!project.isEmpty() && !project.equals(projectName)) continue;
                boolean fixedOracle = "fixed".equals(meta.path("algorithmOracle").asText("buggy"));
                String created = meta.path("createdAt").asText(""), runId = meta.path("runId").asText("");
                for (JsonNode row : meta.path("results")) {
                    String mode = row.path("mode").asText("");
                    boolean algorithm = mode.equals("algorithm"), ai = mode.equals("direct") || mode.equals("batch");
                    if (!algorithm && !ai) continue;
                    String method = methodName(row.path("label").asText(""), algorithm, fixedOracle);
                    int order = algorithm ? (fixedOracle ? 3 : 2) : 1;
                    methodOrder.putIfAbsent(method, order);
                    JsonNode benchmark = row.path("benchmark");
                    // Tests that failed on the reference version were removed before the evaluation (Defects4J fix_test_suite).
                    Double tests = number(benchmark.path("validTests"));
                    if (tests == null) tests = number(benchmark.path("uniqueTests"));
                    boolean judged = !benchmark.path("detection").asText("NOT_DETERMINED").equals("NOT_DETERMINED")
                            && !benchmark.path("detection").asText("").isEmpty();
                    Double detect = judged && benchmark.path("detectedTests").isArray() ? (double) benchmark.path("detectedTests").size() : null;
                    // Coverage is reported on the version the suite was generated from (Defects4J run_coverage does the same).
                    boolean fixedReference = algorithm ? fixedOracle : "fixed".equals(meta.path("aiSourceVersion").asText(""));
                    Double coverage = judged ? number(benchmark.path("versions").path(fixedReference ? "f" : "b").path("coverage").path("lineCoveragePercent")) : null;
                    Double seconds = number(benchmark.path("generationElapsedMs"));
                    if (seconds != null) seconds /= 1000.0; else if (row.hasNonNull("elapsedMs")) seconds = row.path("elapsedMs").asDouble() / 1000.0;
                    String key = projectName + "\t" + String.format("%06d", parse(bug)) + "\t" + order + "\t" + method;
                    Acc acc = rows.computeIfAbsent(key, k -> new Acc());
                    boolean pending = row.path("pending").asBoolean(false);
                    String detection = pending ? "RUNNING" : benchmark.path("detection").asText(benchmark.isMissingNode() ? "NO_SUITE" : "NOT_DETERMINED");
                    String note = pending ? "" : row.path("error").asText(benchmark.path("error").asText(""));
                    acc.latest(created, runId, detection, benchmark.path("versions").path("b").path("testStatus").asText(""),
                            benchmark.path("versions").path("f").path("testStatus").asText(""), note.length() > 240 ? note.substring(0, 240) + "…" : note);
                    if (pending) continue;   // a running row is shown (with its link) but not averaged yet
                    acc.add(tests, detect, coverage, seconds);
                    methods.computeIfAbsent(method, k -> new Acc()).add(tests, detect, coverage, seconds);
                }
            }
        }
        List<Map<String, Object>> tableRows = new ArrayList<>();
        for (Map.Entry<String, Acc> entry : rows.entrySet()) {
            String[] parts = entry.getKey().split("\t", 4);
            Acc a = entry.getValue();
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("project", parts[0]); m.put("bug", parse(parts[1])); m.put("method", parts[3]); m.put("rounds", a.runs);
            m.put("tests", a.mean(a.tests, a.withTests)); m.put("detect", a.mean(a.detect, a.withDetect));
            m.put("fdr", a.mean(a.fdr, a.fdrCount)); m.put("coverage", a.mean(a.coverage, a.withCoverage));
            m.put("seconds", a.mean(a.time, a.withTime));
            m.put("runId", a.latestRunId); m.put("detection", a.latestDetection); m.put("buggy", a.latestBuggy);
            m.put("fixed", a.latestFixed); m.put("note", a.latestNote);
            tableRows.add(m);
        }
        List<Map<String, Object>> methodRows = new ArrayList<>();
        methods.entrySet().stream().sorted(Comparator.<Map.Entry<String, Acc>>comparingInt(e -> methodOrder.getOrDefault(e.getKey(), 9))
                .thenComparing(Map.Entry::getKey)).forEach(entry -> {
            Acc a = entry.getValue();
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("method", entry.getKey()); m.put("runs", a.runs); m.put("kind", methodOrder.getOrDefault(entry.getKey(), 9) == 1 ? "AI" : "algorithm");
            m.put("fdr", a.mean(a.fdr, a.fdrCount)); m.put("coverage", a.mean(a.coverage, a.withCoverage));
            m.put("seconds", a.mean(a.time, a.withTime)); m.put("tests", a.mean(a.tests, a.withTests));
            methodRows.add(m);
        });
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("ok", true); out.put("project", project); out.put("projects", new ArrayList<>(projects));
        out.put("rows", tableRows); out.put("methods", methodRows);
        return out;
    }

    private static String methodName(String label, boolean algorithm, boolean fixedOracle) {
        if (!algorithm) return label.isEmpty() ? "AI" : label;
        Matcher abbreviation = ABBREVIATION.matcher(label);
        String name = abbreviation.find() ? abbreviation.group(1) : label.replaceFirst("^Algorithm · ", "");
        return fixedOracle ? name + " (fixed oracle)" : name;
    }

    private static Double number(JsonNode node) {
        return node != null && node.isNumber() && !Double.isNaN(node.asDouble()) ? node.asDouble() : null;
    }

    private static int parse(String text) {
        try { return Integer.parseInt(text); } catch (NumberFormatException e) { return Integer.MAX_VALUE; }
    }
}
