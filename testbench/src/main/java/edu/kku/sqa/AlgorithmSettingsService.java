package edu.kku.sqa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/** Catalog and persistent selection for the search algorithms implemented by this application. */
@Service
public class AlgorithmSettingsService {
    private static final Map<String, AlgorithmInfo> CATALOG;
    static {
        Map<String, AlgorithmInfo> values = new LinkedHashMap<>();
        values.put("sa", new AlgorithmInfo("Simulated Annealing (SA)", "ค้นหาคำตอบใกล้เคียงและค่อย ๆ ลดโอกาสยอมรับผลที่แย่ลง"));
        values.put("pso", new AlgorithmInfo("Binary Particle Swarm Optimization (BPSO)", "ให้กลุ่มอนุภาคค้นหาชุดค่าแบบบิต แล้วปรับตำแหน่งตาม best ของตนและกลุ่ม"));
        values.put("ga", new AlgorithmInfo("Genetic Algorithm (GA)", "คัดเลือก candidate ที่มี fitness ดี ผสม candidate และกลายพันธุ์"));
        values.put("random", new AlgorithmInfo("Random Search (RS)", "สุ่ม candidate เป็น baseline สำหรับเปรียบเทียบ"));
        CATALOG = Collections.unmodifiableMap(values);
    }

    private final Path settingsFile;
    private List<String> algorithms = List.of("sa", "pso");

    public AlgorithmSettingsService(
            @Value("${bench.algorithm-a:sa}") String defaultA,
            @Value("${bench.algorithm-b:pso}") String defaultB,
            @Value("${bench.algorithm-settings-file:config/algorithm-settings.txt}") String settingsFile) {
        this.settingsFile = Paths.get(settingsFile).toAbsolutePath().normalize();
        this.algorithms = normalize(List.of(defaultA, defaultB));
        load();
    }

    public synchronized List<String> getAlgorithms() { return List.copyOf(algorithms); }
    public List<Map<String, String>> getCatalog() {
        List<Map<String, String>> result = new ArrayList<>();
        CATALOG.forEach((id, info) -> result.add(Map.of("id", id, "label", info.label, "description", info.description)));
        return result;
    }
    public static String label(String id) { AlgorithmInfo info = CATALOG.get(id); return info == null ? id : info.label; }
    public static boolean supports(String id) { return CATALOG.containsKey(id); }

    public synchronized void save(List<String> selected) throws IOException {
        List<String> normalized = normalize(selected);
        Path parent = settingsFile.getParent();
        if (parent != null) Files.createDirectories(parent);
        Files.writeString(settingsFile, String.join("\n", normalized) + "\n", StandardCharsets.UTF_8);
        algorithms = normalized;
    }

    private void load() {
        try {
            if (!Files.isRegularFile(settingsFile)) return;
            List<String> values = Files.readAllLines(settingsFile, StandardCharsets.UTF_8);
            // Older releases stored exactly one algorithm per line; keep those selections working.
            List<String> loaded = normalize(values);
            if (!loaded.isEmpty()) algorithms = loaded;
        } catch (IOException | IllegalArgumentException ignored) { }
    }

    private static List<String> normalize(List<String> values) {
        if (values == null || values.isEmpty()) throw new IllegalArgumentException("เลือก algorithm อย่างน้อยหนึ่งรายการ");
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for (String value : values) {
            if (value == null || value.isBlank()) continue;
            String id = value.trim().toLowerCase(Locale.ROOT);
            if (!CATALOG.containsKey(id)) throw new IllegalArgumentException("ไม่รู้จัก algorithm: " + id);
            result.add(id);
        }
        if (result.isEmpty()) throw new IllegalArgumentException("เลือก algorithm อย่างน้อยหนึ่งรายการ");
        return List.copyOf(result);
    }

    private static final class AlgorithmInfo {
        final String label, description;
        AlgorithmInfo(String label, String description) { this.label = label; this.description = description; }
    }
}
