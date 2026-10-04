package edu.kku.sqa;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Usage and cost dashboard: sums the AI calls (tokens, cached tokens, cost, time) and the algorithm generation time
 * recorded in every run's metadata.json, for a time range and optionally one Project.
 */
@Controller
public class UsageController {
    private final Path runsRoot;
    private final UsageLedger usageLedger;
    private final ObjectMapper mapper = new ObjectMapper();
    private final double usdToThb;
    private final ZoneId zone;

    public UsageController(@Value("${bench.output-dir:output}") String outputDir,
            @Value("${bench.usd-to-thb:33}") double usdToThb,
            @Value("${bench.timezone:Asia/Bangkok}") String timezone, UsageLedger usageLedger) {
        this.usageLedger = usageLedger;
        this.runsRoot = Paths.get(outputDir).toAbsolutePath().normalize().resolve("ai-runs");
        this.usdToThb = usdToThb;
        this.zone = ZoneId.of(timezone);
    }

    @GetMapping("/usage")
    public String page(Model model) {
        model.addAttribute("usdToThb", usdToThb);
        return "usage";
    }

    /** Totals of one group of rows. */
    private static final class Agg {
        int runs, calls, failed, costMissing, algorithmRuns;
        long aiMs, algorithmMs, tokensIn, tokensOut, tokensCached;
        double cost;
        Map<String, Object> toMap() {
            Map<String, Object> m = new LinkedHashMap<>();
            m.put("runs", runs); m.put("calls", calls); m.put("failed", failed); m.put("costMissing", costMissing);
            m.put("aiMs", aiMs); m.put("tokensIn", tokensIn); m.put("tokensOut", tokensOut); m.put("tokensCached", tokensCached);
            m.put("cost", cost); m.put("algorithmRuns", algorithmRuns); m.put("algorithmMs", algorithmMs);
            return m;
        }
    }

    private static final class Named { String display = ""; Instant seen = Instant.EPOCH; final Agg agg = new Agg(); }
    private static final class ProjectAgg { final Agg agg = new Agg(); final Map<String, Agg> bugs = new TreeMap<>(); }

    @GetMapping("/usage-data")
    @ResponseBody
    public Map<String, Object> data(@RequestParam(value = "range", defaultValue = "7d") String range,
            @RequestParam(value = "project", defaultValue = "") String project) throws IOException {
        Instant now = Instant.now();
        ZonedDateTime today = now.atZone(zone).toLocalDate().atStartOfDay(zone);
        Instant since;
        if (range.equals("today")) since = today.toInstant();
        else if (range.equals("30d")) since = now.minusSeconds(30L * 86400);
        else if (range.equals("all")) since = Instant.EPOCH;
        else since = now.minusSeconds(7L * 86400);
        Agg total = new Agg();
        Map<String, Named> byAi = new LinkedHashMap<>();
        Map<String, Named> byAlgorithm = new LinkedHashMap<>();
        Map<String, ProjectAgg> byProject = new TreeMap<>();
        Set<String> allProjects = new TreeSet<>();
        // Ledger first: it survives the deletion of runs. Runs present in it contribute their AI rows from the ledger only.
        Set<String> ledgerRuns = new java.util.HashSet<>();
        for (JsonNode e : usageLedger.read()) {
            Instant at;
            try { at = Instant.parse(e.path("at").asText("")); } catch (Exception ex) { continue; }
            String runId = e.path("runId").asText(""), projectName = e.path("project").asText(""), bug = e.path("bugId").asText("");
            ledgerRuns.add(runId);
            if (at.isBefore(since) || projectName.isEmpty()) continue;
            allProjects.add(projectName);
            if (!project.isEmpty() && !project.equals(projectName)) continue;
            ProjectAgg projectAgg = byProject.computeIfAbsent(projectName, k -> new ProjectAgg());
            Agg bugAgg = projectAgg.bugs.computeIfAbsent(bug, k -> new Agg());
            String actual = e.path("actualModel").asText(""), model = e.path("model").asText(""), label = e.path("label").asText("");
            String key = !actual.isEmpty() ? actual : (!model.isEmpty() ? model : (label.isEmpty() ? "AI" : label));
            Named named = byAi.computeIfAbsent(key, k -> new Named());
            if (named.display.isEmpty() || (at.isAfter(named.seen) && !label.isEmpty())) { named.display = label.isEmpty() ? "AI" : label; named.seen = at; }
            long in = Math.max(0, e.path("promptTokens").asLong(0)), out = Math.max(0, e.path("completionTokens").asLong(0));
            long cached = Math.max(0, e.path("cachedTokens").asLong(0)), elapsed = Math.max(0, e.path("elapsedMs").asLong(0));
            boolean hasCost = e.hasNonNull("cost") && e.path("cost").isNumber();
            double cost = hasCost ? Math.max(0, e.path("cost").asDouble(0)) : 0;
            boolean failed = !e.path("ok").asBoolean(true);
            for (Agg agg : new Agg[]{total, projectAgg.agg, bugAgg, named.agg}) {
                agg.calls++; if (failed) agg.failed++;
                agg.aiMs += elapsed; agg.tokensIn += in; agg.tokensOut += out; agg.tokensCached += cached; agg.cost += cost;
                if (!hasCost && in + out > 0) agg.costMissing++;
            }
        }
        if (Files.isDirectory(runsRoot)) {
            List<Path> files;
            try (Stream<Path> walk = Files.walk(runsRoot, 3)) {
                files = walk.filter(p -> p.getFileName().toString().equals("metadata.json")).collect(Collectors.toList());
            }
            for (Path file : files) {
                JsonNode meta;
                try { meta = mapper.readTree(file.toFile()); } catch (IOException e) { continue; }
                Instant created;
                try { created = Instant.parse(meta.path("createdAt").asText("")); } catch (Exception e) { continue; }
                if (created.isBefore(since)) continue;
                String projectName = meta.path("project").asText("");
                String bug = meta.path("bugId").asText("");
                if (projectName.isEmpty()) continue;
                allProjects.add(projectName);
                if (!project.isEmpty() && !project.equals(projectName)) continue;
                ProjectAgg projectAgg = byProject.computeIfAbsent(projectName, k -> new ProjectAgg());
                Agg bugAgg = projectAgg.bugs.computeIfAbsent(bug, k -> new Agg());
                boolean counted = false;
                for (JsonNode row : meta.path("results")) {
                    if (row.path("pending").asBoolean(false)) continue;
                    String mode = row.path("mode").asText("");
                    boolean ai = mode.equals("direct") || mode.equals("batch");
                    boolean algorithm = mode.equals("algorithm");
                    if (!ai && !algorithm) continue;
                    if (ai && ledgerRuns.contains(meta.path("runId").asText(""))) { counted = true; continue; }   // already counted from the ledger
                    counted = true;
                    long elapsed = Math.max(0, row.path("elapsedMs").asLong(0));
                    if (algorithm) {
                        String label = row.path("label").asText("Algorithm");
                        Named named = byAlgorithm.computeIfAbsent(label, k -> new Named());
                        named.display = label;
                        for (Agg agg : new Agg[]{total, projectAgg.agg, bugAgg, named.agg}) { agg.algorithmRuns++; agg.algorithmMs += elapsed; }
                        continue;
                    }
                    String actual = row.path("actualModel").asText("");
                    String model = row.path("model").asText("");
                    String key = !actual.isEmpty() ? actual : (!model.isEmpty() ? model : row.path("label").asText("AI"));
                    String label = row.path("label").asText("");
                    Named named = byAi.computeIfAbsent(key, k -> new Named());
                    if (named.display.isEmpty() || (created.isAfter(named.seen) && !label.matches("AI [0-9]+") && !label.isEmpty())) {
                        named.display = label.isEmpty() ? "AI" : label;   // never the real model id: only the name the user set
                        named.seen = created;
                    }
                    long in = Math.max(0, row.path("promptTokens").asLong(0)), out = Math.max(0, row.path("completionTokens").asLong(0));
                    long cached = Math.max(0, row.path("cachedTokens").asLong(0));
                    boolean hasCost = row.hasNonNull("cost") && row.path("cost").isNumber();
                    double cost = hasCost ? Math.max(0, row.path("cost").asDouble(0)) : 0;
                    boolean failed = !row.path("ok").asBoolean(false);
                    for (Agg agg : new Agg[]{total, projectAgg.agg, bugAgg, named.agg}) {
                        agg.calls++; if (failed) agg.failed++;
                        agg.aiMs += elapsed; agg.tokensIn += in; agg.tokensOut += out; agg.tokensCached += cached; agg.cost += cost;
                        if (!hasCost && in + out > 0) agg.costMissing++;
                    }
                }
                if (counted) { total.runs++; projectAgg.agg.runs++; bugAgg.runs++; }
            }
        }
        List<Map<String, Object>> aiRows = new ArrayList<>();
        byAi.values().stream().sorted((a, b) -> a.agg.cost != b.agg.cost ? Double.compare(b.agg.cost, a.agg.cost) : Integer.compare(b.agg.calls, a.agg.calls))
                .forEach(n -> { Map<String, Object> m = n.agg.toMap(); m.put("name", n.display); aiRows.add(m); });
        List<Map<String, Object>> algorithmRows = new ArrayList<>();
        byAlgorithm.values().stream().sorted((a, b) -> Long.compare(b.agg.algorithmMs, a.agg.algorithmMs))
                .forEach(n -> { Map<String, Object> m = n.agg.toMap(); m.put("name", n.display); algorithmRows.add(m); });
        List<Map<String, Object>> projectRows = new ArrayList<>();
        for (Map.Entry<String, ProjectAgg> entry : byProject.entrySet()) {
            Map<String, Object> m = entry.getValue().agg.toMap();
            m.put("name", entry.getKey());
            List<Map<String, Object>> bugs = new ArrayList<>();
            entry.getValue().bugs.entrySet().stream().filter(b -> b.getValue().runs > 0)
                    .sorted(Comparator.comparingInt(b -> { try { return Integer.parseInt(b.getKey()); } catch (NumberFormatException e) { return Integer.MAX_VALUE; } }))
                    .forEach(b -> { Map<String, Object> bm = b.getValue().toMap(); bm.put("name", entry.getKey() + "-" + b.getKey()); bugs.add(bm); });
            m.put("bugs", bugs);
            projectRows.add(m);
        }
        projectRows.sort((a, b) -> Double.compare(((Number) b.get("cost")).doubleValue(), ((Number) a.get("cost")).doubleValue()) != 0
                ? Double.compare(((Number) b.get("cost")).doubleValue(), ((Number) a.get("cost")).doubleValue())
                : Long.compare(((Number) b.get("aiMs")).longValue() + ((Number) b.get("algorithmMs")).longValue(),
                        ((Number) a.get("aiMs")).longValue() + ((Number) a.get("algorithmMs")).longValue()));
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("ok", true); out.put("range", range); out.put("project", project); out.put("usdToThb", usdToThb);
        out.put("projects", new ArrayList<>(allProjects));
        out.put("total", total.toMap()); out.put("byAi", aiRows); out.put("byAlgorithm", algorithmRows); out.put("byProject", projectRows);
        return out;
    }
}
