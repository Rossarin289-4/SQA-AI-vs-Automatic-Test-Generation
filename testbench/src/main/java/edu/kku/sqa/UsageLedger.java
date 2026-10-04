package edu.kku.sqa;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Append-only record of every AI call's tokens and cost (one line of JSON per finished AI row, all rounds summed), kept
 * outside the run folders so that deleting a run from the history never erases what it cost. The usage page reads it first
 * and falls back to run metadata only for runs made before the ledger existed.
 */
@Service
public class UsageLedger {
    private final Path file;
    private final ObjectMapper mapper;

    public UsageLedger(ObjectMapper mapper, @Value("${bench.output-dir:output}") String outputDir) {
        this.mapper = mapper;
        this.file = Paths.get(outputDir).toAbsolutePath().normalize().resolve("usage-ledger.jsonl");
    }

    public synchronized void record(String runId, String project, String bugId, String label, String model, String actualModel,
            long promptTokens, long completionTokens, long cachedTokens, Double cost, long elapsedMs, boolean ok, int calls) {
        Map<String, Object> entry = new LinkedHashMap<>();
        entry.put("at", Instant.now().toString()); entry.put("runId", runId); entry.put("project", project); entry.put("bugId", bugId);
        entry.put("label", label); entry.put("model", model); entry.put("actualModel", actualModel);
        entry.put("promptTokens", promptTokens); entry.put("completionTokens", completionTokens); entry.put("cachedTokens", cachedTokens);
        entry.put("cost", cost); entry.put("elapsedMs", elapsedMs); entry.put("ok", ok); entry.put("calls", calls);
        try {
            Files.createDirectories(file.getParent());
            Files.writeString(file, mapper.writeValueAsString(entry) + "\n", StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ignored) { /* the run metadata still holds the numbers */ }
    }

    /** All entries, oldest first; unreadable lines are skipped. */
    public synchronized List<JsonNode> read() {
        List<JsonNode> out = new ArrayList<>();
        if (!Files.isRegularFile(file)) return out;
        try {
            for (String line : Files.readAllLines(file, StandardCharsets.UTF_8)) {
                if (line.isBlank()) continue;
                try { out.add(mapper.readTree(line)); } catch (IOException ignored) { }
            }
        } catch (IOException ignored) { }
        return out;
    }
}
