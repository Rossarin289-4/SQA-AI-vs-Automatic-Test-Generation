package edu.kku.sqa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.Duration;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GenerationController {
    private static final Pattern JAVA_BLOCK = Pattern.compile("```(?:java)?\\s*([\\s\\S]*?)```");
    private static final Pattern PACKAGE = Pattern.compile("(?m)^\\s*package\\s+([A-Za-z0-9_.]+)\\s*;");
    private static final Pattern PROMPT_PLACEHOLDER = Pattern.compile("\\{\\{([^{}]+)}}");
    private static final Set<String> REQUIRED_PROMPT_PLACEHOLDERS = Set.of("PROJECT_ID", "BUG_ID");
    private static final Set<String> SUPPORTED_PROMPT_PLACEHOLDERS = Set.of("PROJECT_ID", "BUG_ID", "BUGGY_SOURCE", "SOURCE_CODE",
            "TARGET_CLASS", "TARGET_METHOD", "BUG_REPORT_ID", "FRAMEWORK_NOTE", "CONCRETE_SUBCLASSES", "API_OUTLINE", "TEST_HEADER", "PUBLIC_METHODS");
    /** Follow-up request of a compile-repair round: prompts/Repair_Prompt.md, appended to the original composed prompt. */
    private final Path repairTemplate = Paths.get("prompts/Repair_Prompt.md").toAbsolutePath().normalize();

    private String repairPromptVersion() {
        try {
            Path file = Paths.get("prompts/repair-prompt-version.txt").toAbsolutePath().normalize();
            if (Files.isRegularFile(file)) return Files.readString(file, StandardCharsets.UTF_8).trim();
        } catch (IOException ignored) { }
        return "unversioned";
    }

    /** The original prompt followed by the repair template with the previous class and javac's errors filled in. */
    private final Path untestedTemplate = Paths.get("prompts/Untested_Methods_Prompt.md").toAbsolutePath().normalize();

    private String composeUntestedPrompt(String prompt, String javaText, String untested) throws IOException {
        String template = Files.readString(untestedTemplate, StandardCharsets.UTF_8);
        if (!template.contains("{{PREVIOUS_ANSWER}}") || !template.contains("{{UNTESTED_METHODS}}"))
            throw new IOException("prompts/Untested_Methods_Prompt.md ต้องมี {{PREVIOUS_ANSWER}} และ {{UNTESTED_METHODS}}");
        int answer = template.indexOf("{{PREVIOUS_ANSWER}}");
        template = template.substring(0, answer) + javaText.trim() + template.substring(answer + "{{PREVIOUS_ANSWER}}".length());
        int list = template.indexOf("{{UNTESTED_METHODS}}");
        template = template.substring(0, list) + untested + template.substring(list + "{{UNTESTED_METHODS}}".length());
        return prompt + OpenRouterService.CACHE_BREAK + template;
    }

    private static final Pattern PUBLIC_METHOD = Pattern.compile(
            "(?m)^[ \\t]*public\\s+(?!class\\b|interface\\b|enum\\b)((?:static\\s+|final\\s+|synchronized\\s+|abstract\\s+|native\\s+)*[\\w<>\\[\\],.?& ]+?\\s+(\\w+)\\s*\\([^)]*\\))");

    static final int UNTESTED_ROUND_THRESHOLD = 3;

    /** "- signature" lines of the public methods declared in a (reference) source text, for the {{PUBLIC_METHODS}} placeholder. */
    static String publicMethodList(String source) {
        LinkedHashMap<String, String> found = new LinkedHashMap<>();
        Matcher m = PUBLIC_METHOD.matcher(source);
        while (m.find() && found.size() < 60) {
            String name = m.group(2);
            if (name.equals("main") || found.containsKey(name)) continue;
            String signature = m.group(1).replaceAll("\\s+", " ").trim();
            if (signature.length() > 160) signature = signature.substring(0, 160) + "...";
            found.put(name, signature);
        }
        if (found.isEmpty()) return "NONE";
        StringBuilder out = new StringBuilder();
        for (String sig : found.values()) out.append("- ").append(sig).append('\n');
        return out.toString().trim();
    }

    /** Drops a leading license/copyright comment block and collapses runs of blank lines: fewer tokens, same information. */
    static String trimSource(String source) {
        String out = source;
        Matcher m = Pattern.compile("^\\s*/\\*[\\s\\S]*?\\*/\\s*").matcher(out);
        if (m.find() && m.group().toLowerCase().matches("(?s).*(license|copyright|apache|gnu|mit license).*")) out = out.substring(m.end());
        return out.replaceAll("(?m)^[ \\t]+$", "").replaceAll("\\n{3,}", "\n\n");
    }

    /** Public methods declared in the REFERENCE SOURCE CODE of the composed prompt whose name never appears as a call in the test class. */
    static List<String> untestedPublicMethods(String composedPrompt, String testClass) {
        int start = composedPrompt.indexOf("===== REFERENCE SOURCE CODE ====="), end = composedPrompt.indexOf("===== END REFERENCE SOURCE CODE =====");
        if (start < 0 || end < start) return List.of();
        String source = composedPrompt.substring(start, end);
        String code = Defects4jRunner.stripCommentsAndStrings(testClass);
        LinkedHashMap<String, String> found = new LinkedHashMap<>();
        Matcher m = PUBLIC_METHOD.matcher(source);
        while (m.find() && found.size() < 60) {
            String name = m.group(2);
            if (name.equals("main") || found.containsKey(name)) continue;
            String signature = m.group(1).replaceAll("\\s+", " ").trim();
            if (signature.length() > 160) signature = signature.substring(0, 160) + "...";
            found.put(name, signature);
        }
        List<String> untested = new ArrayList<>();
        for (Map.Entry<String, String> e : found.entrySet())
            if (!Pattern.compile("\\b" + Pattern.quote(e.getKey()) + "\\s*\\(").matcher(code).find()) untested.add(e.getValue());
        return untested.size() > 40 ? untested.subList(0, 40) : untested;
    }

    private final Path referenceRepairTemplate = Paths.get("prompts/Reference_Repair_Prompt.md").toAbsolutePath().normalize();

    /** Same shape as the compile-repair request: the composed prompt, then the class and the failing tests on the reference version. */
    private String composeReferenceRepairPrompt(String prompt, String javaText, String failures) throws IOException {
        String template = Files.readString(referenceRepairTemplate, StandardCharsets.UTF_8);
        if (!template.contains("{{PREVIOUS_ANSWER}}") || !template.contains("{{TEST_FAILURES}}"))
            throw new IOException("prompts/Reference_Repair_Prompt.md ต้องมี {{PREVIOUS_ANSWER}} และ {{TEST_FAILURES}}");
        int answer = template.indexOf("{{PREVIOUS_ANSWER}}");
        template = template.substring(0, answer) + javaText.trim() + template.substring(answer + "{{PREVIOUS_ANSWER}}".length());
        int fails = template.indexOf("{{TEST_FAILURES}}");
        template = template.substring(0, fails) + failures + template.substring(fails + "{{TEST_FAILURES}}".length());
        return prompt + OpenRouterService.CACHE_BREAK + template;
    }

    private String composeRepairPrompt(String prompt, String javaText, String errors) throws IOException {
        String template = Files.readString(repairTemplate, StandardCharsets.UTF_8);
        if (!template.contains("{{PREVIOUS_ANSWER}}") || !template.contains("{{COMPILER_ERRORS}}"))
            throw new IOException("prompts/Repair_Prompt.md ต้องมี {{PREVIOUS_ANSWER}} และ {{COMPILER_ERRORS}}");
        int answer = template.indexOf("{{PREVIOUS_ANSWER}}");
        template = template.substring(0, answer) + javaText.trim() + template.substring(answer + "{{PREVIOUS_ANSWER}}".length());
        int at = template.indexOf("{{COMPILER_ERRORS}}");
        return prompt + OpenRouterService.CACHE_BREAK + template.substring(0, at) + errors + template.substring(at + "{{COMPILER_ERRORS}}".length());
    }

    private static final Pattern TEST_ANNOTATION = Pattern.compile("@(?:org\\.junit\\.)?Test\\b");
    private static final Pattern JUNIT3_TEST_METHOD = Pattern.compile("\\bpublic\\s+void\\s+test\\w*\\s*\\(");
    private static final String JUNIT3_NOTE = "FRAMEWORK OVERRIDE FOR THIS PROJECT (takes precedence over every JUnit 4 instruction in this prompt): "
            + "this project's test classpath has no hamcrest, so JUnit 4 classes cannot start. Write a JUnit 3 style class instead: "
            + "`import junit.framework.TestCase;`, `public class XxxTest extends TestCase`, and test methods declared as "
            + "`public void testSomething() throws Exception` (the name must start with \"test\"). Do not import org.junit.*, do not use "
            + "@Test, @Before, @Rule, expected= or timeout=, and do not use hamcrest or assertThat. Use only the inherited "
            + "assertEquals/assertTrue/assertFalse/assertNull/assertNotNull/assertSame/fail methods and try/catch with fail() to check "
            + "exceptions. Wherever this prompt says \"@Test method\", read \"test method\" (same count and rules).";
    @Value("${bench.junit3-projects:Cli}")
    private String junit3ProjectList;
    private boolean isJunit3(String project) {
        for (String name : junit3ProjectList.split("\\s*,\\s*")) if (name.equals(project)) return true;
        return false;
    }
    /** Number of test methods in a suite: JUnit 4 @Test annotations, or JUnit 3 test* methods of a TestCase subclass. */
    static int countTests(String java) {
        int count = 0;
        Matcher annotated = TEST_ANNOTATION.matcher(java);
        while (annotated.find()) count++;
        if (count == 0 && java.contains("TestCase")) {
            Matcher methods = JUNIT3_TEST_METHOD.matcher(java);
            while (methods.find()) count++;
        }
        return count;
    }
    private static final Pattern AI_REPORT_HEADING = Pattern.compile("(?m)^\\s*(?:#{1,6}\\s*)?([12456])\\.\\s+(SOURCE CODE ANALYSIS|TEST CASE DESIGN|DEFECT DETECTION STRATEGY|SUMMARY|LIMITATIONS)\\s*$", Pattern.CASE_INSENSITIVE);

    private final OpenRouterService openRouter;
    private final ObjectMapper mapper;
    private final Path outputRoot;
    private final AiProviderService aiProviders;
    private final UsageLedger usageLedger;
    private final Defects4jRunner defects4jRunner;
    private final AlgorithmSettingsService algorithmSettings;
    private final Path promptTemplate;
    // One AI row holds its thread for the whole pipeline (request, compile rounds, evaluation), so a campaign with
    // `parallelism` workers and two AIs needs 2 x parallelism threads here or requests queue behind other rows' compiles.
    private final ExecutorService generationPool;
    private final int parallelism;
    private final ExecutorService algorithmPool;
    // Up to three campaigns run side by side (e.g. an AI campaign next to an algorithm campaign); each has its own workers and
    // pause/resume, and they share the Defects4J evaluation slots (bench.parallelism).
    private final ExecutorService campaignPool = Executors.newFixedThreadPool(3, runnable -> {
        Thread thread = new Thread(runnable, "defects4j-campaign");
        thread.setDaemon(true);
        return thread;
    });
    private final ConcurrentMap<String, RunState> activeRuns = new ConcurrentHashMap<>();
    private final ConcurrentMap<String, CampaignState> campaigns = new ConcurrentHashMap<>();

    public GenerationController(OpenRouterService openRouter, ObjectMapper mapper,
            @Value("${bench.output-dir:output}") String outputDir,
            AiProviderService aiProviders,
            UsageLedger usageLedger,
            Defects4jRunner defects4jRunner,
            AlgorithmSettingsService algorithmSettings,
            @Value("${bench.prompt-template:prompts/Master_Prompt.md}") String promptTemplate,
            @Value("${bench.parallelism:1}") int parallelism) {
        this.parallelism = Math.max(1, Math.min(32, parallelism));
        this.generationPool = Executors.newFixedThreadPool(Math.max(6, 2 * this.parallelism), runnable -> {
            Thread thread = new Thread(runnable, "testbench-generation");
            thread.setDaemon(true);
            return thread;
        });
        this.algorithmPool = Executors.newFixedThreadPool(this.parallelism, runnable -> {
            Thread thread = new Thread(runnable, "defects4j-algorithms");
            thread.setDaemon(true);
            return thread;
        });
        this.openRouter = openRouter; this.mapper = mapper;
        this.outputRoot = Paths.get(outputDir).toAbsolutePath().normalize();
        this.aiProviders = aiProviders; this.usageLedger = usageLedger;
        this.defects4jRunner = defects4jRunner;
        this.algorithmSettings = algorithmSettings;
        this.promptTemplate = Paths.get(promptTemplate).toAbsolutePath().normalize();
        restoreRuns();
        restoreCampaigns();
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("algorithmOnly", false); model.addAttribute("aiOnly", false);
        model.addAttribute("aiModels", aiProviders.safeList());
        model.addAttribute("selectedAiCount", aiProviders.selected().size());
        addAlgorithmSelectionAttributes(model, algorithmSettings.getAlgorithms());
        model.addAttribute("hasBatchModel", aiProviders.isBatchSelected());
        model.addAttribute("apiReady", aiProviders.isReady());
        try { model.addAttribute("prompt", Files.readString(promptTemplate, StandardCharsets.UTF_8)); }
        catch (IOException e) { model.addAttribute("prompt", "ใส่ prompt สำหรับสร้าง JUnit test ที่นี่"); }
        model.addAttribute("project", "Lang"); model.addAttribute("bugId", "3"); model.addAttribute("buggySource", "");
        model.addAttribute("runHistory", recentRunHistory());
        return "index";
    }

    @GetMapping("/catalog/projects")
    @ResponseBody
    public Map<String,Object> projectCatalog() {
        try { return Map.of("ok", true, "projects", defects4jRunner.listProjects()); }
        catch (Exception e) { return Map.of("ok", false, "error", e.getMessage() == null ? "อ่านรายการ Defects4J ไม่สำเร็จ" : e.getMessage()); }
    }

    @GetMapping("/catalog/bugs")
    @ResponseBody
    public Map<String,Object> bugCatalog(@RequestParam("project") String project) {
        try { return Map.of("ok", true, "bugs", defects4jRunner.listBugs(project)); }
        catch (Exception e) { return Map.of("ok", false, "error", e.getMessage() == null ? "อ่านรายการ Bug ID ไม่สำเร็จ" : e.getMessage()); }
    }

    /**
     * The exact prompt the AI would get for one Project/Bug with the current Master Prompt (same composition as a run), so it
     * can be used elsewhere, e.g. pasted into a chat AI that has no API. format=txt downloads system instruction + prompt.
     */
    @GetMapping("/prompt-export")
    public org.springframework.http.ResponseEntity<byte[]> promptExport(@RequestParam("project") String project, @RequestParam("bugId") String bugId,
            @RequestParam(value = "format", defaultValue = "json") String format) {
        Path dir = null;
        try {
            if (project == null || !project.matches("[A-Za-z][A-Za-z0-9]*") || bugId == null || !bugId.matches("[0-9]+"))
                throw new IllegalArgumentException("Project ID หรือ Bug ID ไม่ถูกต้อง");
            dir = Files.createTempDirectory("testbench-prompt-export-");
            String[] parts = exportPrompt(project, bugId, dir);
            String system = parts[0], prompt = parts[1], version = parts[2];
            if ("txt".equals(format)) {
                String text = exportText(project, bugId, parts);
                return org.springframework.http.ResponseEntity.ok().header("Content-Type", "text/plain; charset=UTF-8")
                        .header("Content-Disposition", "attachment; filename=\"prompt-" + project + "-" + bugId + "-" + version + ".txt\"")
                        .body(text.getBytes(StandardCharsets.UTF_8));
            }
            Map<String,Object> out = new LinkedHashMap<>();
            out.put("ok", true); out.put("project", project); out.put("bugId", bugId); out.put("version", version);
            out.put("system", system); out.put("prompt", prompt);
            return org.springframework.http.ResponseEntity.ok().header("Content-Type", "application/json; charset=UTF-8").body(mapper.writeValueAsBytes(out));
        } catch (Exception e) {
            byte[] body;
            try { body = mapper.writeValueAsBytes(Map.of("ok", false, "error", e.getMessage() == null ? "สร้าง prompt ไม่สำเร็จ" : e.getMessage())); }
            catch (IOException io) { body = new byte[0]; }
            return org.springframework.http.ResponseEntity.ok().header("Content-Type", "application/json; charset=UTF-8").body(body);
        } finally {
            if (dir != null) try { deleteTree(dir); } catch (IOException ignored) { }
        }
    }

    /** [system instruction, prompt, version] for one bug with the current Master Prompt (checkout into workDir). */
    private String[] exportPrompt(String project, String bugId, Path workDir) throws Exception {
        String template = Files.readString(promptTemplate, StandardCharsets.UTF_8);
        String source = defects4jRunner.extractSourceNow(project, bugId, sourceVersion(template), workDir);
        String prompt = composePrompt(template, source, project, bugId);
        return new String[]{openRouter.getSystemInstruction(), prompt, promptVersionOf(template)};
    }

    private static String exportText(String project, String bugId, String[] parts) {
        return "===== SYSTEM INSTRUCTION (prompt " + parts[2] + ") =====\n" + parts[0]
                + "\n\n===== PROMPT · " + project + "-" + bugId + " =====\n" + parts[1] + "\n";
    }

    /** A background job writing the prompt of every bug (of one Project or all) to text files, then one ZIP to download. */
    private static final class PromptBundle {
        final String id, scope; final Path dir;
        volatile int done, failed, total; volatile String status = "running", error = "", current = "";
        PromptBundle(String id, String scope, Path dir) { this.id = id; this.scope = scope; this.dir = dir; }
        Map<String,Object> view() {
            Map<String,Object> m = new LinkedHashMap<>();
            m.put("ok", true); m.put("id", id); m.put("scope", scope); m.put("status", status); m.put("done", done);
            m.put("failed", failed); m.put("total", total); m.put("current", current); m.put("error", error);
            return m;
        }
    }
    private final Map<String, PromptBundle> promptBundles = new ConcurrentHashMap<>();
    private volatile PromptBundle latestBundle;
    private final ExecutorService promptBundlePool = Executors.newSingleThreadExecutor(r -> { Thread t = new Thread(r, "prompt-bundle"); t.setDaemon(true); return t; });

    @PostMapping("/prompt-bundle")
    @ResponseBody
    public Map<String,Object> startPromptBundle(@RequestParam(value = "project", defaultValue = "") String project) {
        PromptBundle running = latestBundle;
        if (running != null && "running".equals(running.status)) return running.view();
        try {
            List<String> projects = project.isBlank() ? defects4jRunner.listProjects() : List.of(project);
            if (!project.isBlank() && !defects4jRunner.listProjects().contains(project)) throw new IllegalArgumentException("ไม่มี Project นี้ใน Defects4J");
            String id = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss").withZone(ZoneOffset.UTC).format(Instant.now());
            Path dir = outputRoot.resolve("prompt-exports").resolve("prompts-" + (project.isBlank() ? "all" : project) + "-" + id).normalize();
            Files.createDirectories(dir);
            PromptBundle bundle = new PromptBundle(id, project.isBlank() ? "ทุก Project" : project, dir);
            promptBundles.put(id, bundle); latestBundle = bundle;
            promptBundlePool.submit(() -> buildPromptBundle(bundle, projects));
            return bundle.view();
        } catch (Exception e) {
            return Map.of("ok", false, "error", e.getMessage() == null ? "เริ่มสร้าง prompt ไม่สำเร็จ" : e.getMessage());
        }
    }

    private void buildPromptBundle(PromptBundle bundle, List<String> projects) {
        try {
            Map<String, List<String>> bugs = new LinkedHashMap<>();
            for (String project : projects) bugs.put(project, defects4jRunner.listBugs(project));
            bundle.total = bugs.values().stream().mapToInt(List::size).sum();
            StringBuilder errors = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : bugs.entrySet()) {
                for (String bug : entry.getValue()) {
                    String project = entry.getKey();
                    bundle.current = project + "-" + bug;
                    Path work = null;
                    try {
                        work = Files.createTempDirectory("testbench-prompt-bundle-");
                        String text = exportText(project, bug, exportPrompt(project, bug, work));
                        Path file = bundle.dir.resolve(project).resolve(project + "-" + bug + ".txt");
                        Files.createDirectories(file.getParent());
                        Files.writeString(file, text, StandardCharsets.UTF_8);
                    } catch (Exception e) {
                        bundle.failed++;
                        errors.append(project).append('-').append(bug).append(": ").append(e.getMessage()).append('\n');
                    } finally {
                        if (work != null) try { deleteTree(work); } catch (IOException ignored) { }
                        bundle.done++;
                    }
                }
            }
            if (errors.length() > 0) Files.writeString(bundle.dir.resolve("errors.txt"), errors.toString(), StandardCharsets.UTF_8);
            Path zip = bundle.dir.resolveSibling(bundle.dir.getFileName() + ".zip");
            try (java.util.zip.ZipOutputStream out = new java.util.zip.ZipOutputStream(Files.newOutputStream(zip));
                 java.util.stream.Stream<Path> files = Files.walk(bundle.dir)) {
                for (Path file : (Iterable<Path>) files.filter(Files::isRegularFile).sorted()::iterator) {
                    out.putNextEntry(new java.util.zip.ZipEntry(bundle.dir.getFileName() + "/" + bundle.dir.relativize(file).toString().replace('\\', '/')));
                    Files.copy(file, out);
                    out.closeEntry();
                }
            }
            bundle.current = ""; bundle.status = "done";
        } catch (Exception e) {
            bundle.status = "error"; bundle.error = e.getMessage() == null ? e.toString() : e.getMessage();
        }
    }

    @GetMapping("/prompt-bundle-status")
    @ResponseBody
    public Map<String,Object> promptBundleStatus(@RequestParam(value = "id", defaultValue = "") String id) {
        PromptBundle bundle = id.isBlank() ? latestBundle : promptBundles.get(id);
        return bundle == null ? Map.of("ok", false) : bundle.view();
    }

    @GetMapping("/prompt-bundle-download")
    public org.springframework.http.ResponseEntity<byte[]> promptBundleDownload(@RequestParam("id") String id) throws IOException {
        PromptBundle bundle = promptBundles.get(id);
        if (bundle == null || !"done".equals(bundle.status)) return org.springframework.http.ResponseEntity.notFound().build();
        Path zip = bundle.dir.resolveSibling(bundle.dir.getFileName() + ".zip");
        return org.springframework.http.ResponseEntity.ok().header("Content-Type", "application/zip")
                .header("Content-Disposition", "attachment; filename=\"" + zip.getFileName() + "\"").body(Files.readAllBytes(zip));
    }

    @GetMapping("/catalog/buggy-source")
    @ResponseBody
    public Map<String,Object> buggySourcePreview(@RequestParam("project") String project,
            @RequestParam("bugId") String bugId) {
        Path previewDir = null;
        try {
            if (project == null || !project.matches("[A-Za-z][A-Za-z0-9]*")
                    || bugId == null || !bugId.matches("[0-9]+"))
                throw new IllegalArgumentException("Project ID หรือ Bug ID ไม่ถูกต้อง");
            previewDir = Files.createTempDirectory("testbench-source-preview-");
            String source = defects4jRunner.extractBuggySource(project, bugId, previewDir, ignored -> { });
            return Map.of("ok", true, "project", project, "bugId", bugId, "source", source);
        } catch (Exception e) {
            return Map.of("ok", false, "error", e.getMessage() == null
                    ? "ดึง buggy source จาก Defects4J ไม่สำเร็จ" : e.getMessage());
        } finally {
            if (previewDir != null) {
                try (var paths = Files.walk(previewDir)) {
                    paths.sorted(Comparator.reverseOrder()).forEach(path -> {
                        try { Files.deleteIfExists(path); } catch (IOException ignored) { }
                    });
                } catch (IOException ignored) { }
            }
        }
    }

    @GetMapping("/run")
    public String showRun(@RequestParam("runId") String runId, Model model) throws IOException {
        RunState run = activeRuns.get(runId);
        if (run == null) return "redirect:/";
        List<Map<String,Object>> runResults = resultsWithDefectLinks(run);
        boolean algorithmOnly = run.models.isEmpty() || (runResults.size()>run.models.size() && "skipped".equals(runResults.get(0).get("mode"))
                && !Boolean.TRUE.equals(runResults.get(0).get("alreadyDone")));
        model.addAttribute("aiModels", aiProviders.safeList()); model.addAttribute("selectedAiCount", run.models.size());
        addAlgorithmSelectionAttributes(model, run.algorithms);
        model.addAttribute("hasBatchModel", !algorithmOnly && run.models.stream().anyMatch(aiProviders::isBatch));
        model.addAttribute("apiReady", aiProviders.isReady());
        Path promptFile = run.runDir.resolve("user-prompt.txt");
        model.addAttribute("prompt", Files.isRegularFile(promptFile) ? Files.readString(promptFile, StandardCharsets.UTF_8) : "");
        Path actualSource = sourceShownFile(run.runDir);
        Path sourceInput = run.runDir.resolve("buggy-source-input.txt");
        Path sourceToShow = Files.isRegularFile(actualSource) ? actualSource : sourceInput;
        model.addAttribute("buggySource", Files.isRegularFile(sourceToShow) ? Files.readString(sourceToShow, StandardCharsets.UTF_8) : "");
        model.addAttribute("project", run.project); model.addAttribute("bugId", run.bugId);
        model.addAttribute("runId", run.runId); model.addAttribute("results", runResults); model.addAttribute("paused", run.isPaused());
        model.addAttribute("runPending", run.isPending());
        model.addAttribute("canDeleteRun", !isCampaignRun(run.runId));
        model.addAttribute("algorithmOnly", algorithmOnly); model.addAttribute("aiOnly", run.algorithms.isEmpty());
        Path promptUsed = run.runDir.resolve("prompt-used.txt");
        if (Files.isRegularFile(promptUsed)) model.addAttribute("promptUrl", "/artifact?path=" + encode(outputRoot.relativize(promptUsed).toString()));
        model.addAttribute("runHistory", recentRunHistory());
        return "index";
    }

    @GetMapping("/history")
    public String showRunHistory(Model model) {
        model.addAttribute("runHistory", singleRunHistory());
        model.addAttribute("campaignHistory", campaignHistory());
        return "history";
    }

    @GetMapping("/defect-details")
    public String defectDetails(@RequestParam("runId") String runId,
            @RequestParam("methodFolder") String methodFolder, Model model) {
        RunState run = activeRuns.get(runId);
        if (run == null || methodFolder == null
                || !methodFolder.matches("(?:algorithm-[a-z]+|model-[0-9]+-[A-Za-z0-9._-]+)"))
            return "redirect:/";
        Path methodDir = run.runDir.resolve(methodFolder).normalize();
        if (!methodDir.startsWith(run.runDir)) return "redirect:/";
        model.addAttribute("runId", run.runId);
        model.addAttribute("project", run.project);
        model.addAttribute("bugId", run.bugId);
        model.addAttribute("methodLabel", methodLabel(run, methodFolder));
        model.addAttribute("backUrl", "/run?runId=" + encode(run.runId));
        try {
            Map<String, Object> analysis = defects4jRunner.createDefectAnalysis(run.project, run.bugId, methodDir);
            model.addAttribute("analysis", analysis);
            model.addAttribute("failureSummaryB", summarizeFailures(analysis, "b"));
            model.addAttribute("failureSummaryF", summarizeFailures(analysis, "f"));
            model.addAttribute("bothFail", "FAIL".equals(versionValue(analysis, "b", "testStatus"))
                    && "FAIL".equals(versionValue(analysis, "f", "testStatus")));
            Object patchPath = analysis.get("patchFile");
            Path patch = patchPath == null ? null : methodDir.resolve(patchPath.toString()).normalize();
            if (patch != null && patch.startsWith(methodDir) && Files.isRegularFile(patch)) {
                model.addAttribute("patchText", Files.readString(patch, StandardCharsets.UTF_8));
                model.addAttribute("patchUrl", "/artifact?path="
                        + encode(outputRoot.relativize(patch).toString()));
            }
        } catch (Exception e) {
            model.addAttribute("analysisError", e.getMessage() == null
                    ? "ยังอ่าน patch จาก checkout ของ Defects4J ไม่ได้" : e.getMessage());
        }
        return "defect-details";
    }

    @GetMapping("/settings")
    public String settings(@RequestParam(value = "saved", required = false) String saved,
            @RequestParam(value = "cleared", required = false) String cleared,
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "algorithmsSaved", required = false) String algorithmsSaved,
            @RequestParam(value = "algorithmError", required = false) String algorithmError,
            @RequestParam(value = "promptSaved", required = false) String promptSaved,
            @RequestParam(value = "promptError", required = false) String promptError,
            @RequestParam(value = "aiSaved", required = false) String aiSaved,
            @RequestParam(value = "aiDeleted", required = false) String aiDeleted,
            @RequestParam(value = "aiError", required = false) String aiError, Model model) {
        model.addAttribute("apiReady", aiProviders.isReady());
        model.addAttribute("aiModels", aiProviders.safeList());
        model.addAttribute("selectedAiIds", aiProviders.selectedModelIds());
        model.addAttribute("selectedAiCount", aiProviders.selected().size());
        model.addAttribute("aiSaved", "1".equals(aiSaved)); model.addAttribute("aiDeleted", "1".equals(aiDeleted));
        model.addAttribute("aiError", aiError);
        model.addAttribute("saved", "1".equals(saved));
        model.addAttribute("cleared", "1".equals(cleared));
        model.addAttribute("saveError", "save".equals(error));
        model.addAttribute("algorithmsSaved", "1".equals(algorithmsSaved));
        model.addAttribute("algorithmError", "1".equals(algorithmError));
        model.addAttribute("promptSaved", promptSaved != null && !promptSaved.isBlank());
        model.addAttribute("promptActivated", promptSaved != null && promptSaved.matches("v[0-9]+") ? promptSaved : null);
        model.addAttribute("promptError", promptError);
        addAlgorithmSelectionAttributes(model, algorithmSettings.getAlgorithms());
        addMasterPromptAttributes(model);
        return "settings";
    }

    private void addMasterPromptAttributes(Model model) {
        String text;
        try { text = Files.readString(promptTemplate, StandardCharsets.UTF_8); }
        catch (IOException e) { text = ""; }
        model.addAttribute("masterPrompt", text);
        model.addAttribute("activePromptVersion", promptVersionOf(text));
        model.addAttribute("promptVersions", promptVersionChoices());
    }

    /** Saved versions newest first, each with its CHANGELOG heading as a short note. */
    private List<Map<String, String>> promptVersionChoices() {
        Map<String, String> notes = new java.util.HashMap<>();
        try {
            Path changelog = Paths.get("prompts/CHANGELOG.md").toAbsolutePath().normalize();
            if (Files.isRegularFile(changelog)) for (String line : Files.readAllLines(changelog, StandardCharsets.UTF_8)) {
                Matcher m = Pattern.compile("^## (v[0-9]+)\\s*(.*)$").matcher(line);
                if (m.matches()) notes.put(m.group(1), m.group(2).replaceFirst("^\\([^)]*\\)\\s*-?\\s*", "").trim());
            }
        } catch (IOException ignored) { }
        List<Map<String, String>> out = new ArrayList<>();
        for (int n : savedPromptVersionNumbers()) {
            Map<String, String> item = new LinkedHashMap<>();
            item.put("version", "v" + n);
            item.put("note", notes.getOrDefault("v" + n, ""));
            out.add(item);
        }
        return out;
    }

    private List<Integer> savedPromptVersionNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Path versions = Paths.get("prompts/versions").toAbsolutePath().normalize();
        if (Files.isDirectory(versions)) try (java.util.stream.Stream<Path> files = Files.list(versions)) {
            for (Path file : (Iterable<Path>) files::iterator) {
                Matcher m = Pattern.compile("Master_Prompt\\.v([0-9]+)\\.md").matcher(file.getFileName().toString());
                if (m.matches()) numbers.add(Integer.parseInt(m.group(1)));
            }
        } catch (IOException ignored) { }
        numbers.sort(java.util.Comparator.reverseOrder());
        return numbers;
    }

    /** Makes a saved version the Master Prompt for new runs (copies its text and records its version). */
    @PostMapping("/settings/prompt/activate")
    public String activatePromptVersion(@RequestParam("version") String version) {
        try {
            if (!version.matches("v[0-9]+")) throw new IllegalArgumentException("เวอร์ชันไม่ถูกต้อง");
            Path file = Paths.get("prompts/versions/Master_Prompt." + version + ".md").toAbsolutePath().normalize();
            if (!Files.isRegularFile(file)) throw new IllegalArgumentException("ไม่พบ Master Prompt " + version);
            String text = Files.readString(file, StandardCharsets.UTF_8);
            validatePromptTemplate(text);
            Files.writeString(promptTemplate, text, StandardCharsets.UTF_8);
            Files.writeString(Paths.get("prompts/prompt-version.txt").toAbsolutePath().normalize(), version + "\n", StandardCharsets.UTF_8);
            return "redirect:/settings?promptSaved=" + encode(version) + "#master-prompt";
        } catch (IllegalArgumentException e) {
            return "redirect:/settings?promptError=" + encode(e.getMessage()) + "#master-prompt";
        } catch (IOException e) {
            return "redirect:/settings?promptError=" + encode("เปลี่ยน Master Prompt ไม่สำเร็จ") + "#master-prompt";
        }
    }

    @PostMapping("/settings/prompt")
    public String saveMasterPrompt(@RequestParam("masterPrompt") String masterPrompt) {
        try {
            validatePromptTemplate(masterPrompt);
            Files.writeString(promptTemplate, masterPrompt, StandardCharsets.UTF_8);
            // Text equal to a saved version keeps that version; any other edit is labelled "custom".
            String version = savedVersionOf(masterPrompt);
            Files.writeString(Paths.get("prompts/prompt-version.txt").toAbsolutePath().normalize(), (version == null ? "custom" : version) + "\n", StandardCharsets.UTF_8);
            return "redirect:/settings?promptSaved=1";
        } catch (IllegalArgumentException e) {
            return "redirect:/settings?promptError=" + encode(e.getMessage());
        } catch (IOException e) {
            return "redirect:/settings?promptError=" + encode("บันทึก Master Prompt ไม่สำเร็จ");
        }
    }


    @PostMapping("/settings/ai/save")
    public String saveAiProvider(@RequestParam(value="id",defaultValue="") String id,
            @RequestParam("provider") String provider, @RequestParam(value="address",defaultValue="") String address,
            @RequestParam(value="apiKey",defaultValue="") String apiKey, @RequestParam("model") String modelId,
            @RequestParam("name") String name, @RequestParam(value="inputPrice",defaultValue="0") String inputPrice,
            @RequestParam(value="cachedInputPrice",defaultValue="0") String cachedInputPrice,
            @RequestParam(value="outputPrice",defaultValue="0") String outputPrice,
            @RequestParam(value="reasoningEffort",defaultValue="medium") String reasoningEffort) {
        try { aiProviders.save(id,provider,address,apiKey,modelId,name,inputPrice,cachedInputPrice,outputPrice,reasoningEffort); return "redirect:/settings?aiSaved=1"; }
        catch(Exception e){return "redirect:/settings?aiError="+encode(e.getMessage()==null?"บันทึก AI ไม่สำเร็จ":e.getMessage());}
    }

    @PostMapping("/settings/ai/selection")
    public String saveAiSelection(@RequestParam(value="providerIds",required=false) List<String> ids) {
        try { aiProviders.setSelected(ids); return "redirect:/settings?aiSaved=1"; }
        catch(Exception e){return "redirect:/settings?aiError="+encode("บันทึกรายการเปรียบเทียบไม่สำเร็จ");}
    }

    @PostMapping("/settings/ai/delete")
    public String deleteAiProvider(@RequestParam("id") String id) {
        for(RunState run:activeRuns.values()) if(run.isPending()&&run.models.contains(id))
            return "redirect:/settings?aiError="+encode("ลบไม่ได้ เพราะ AI นี้อยู่ใน run ที่กำลังทำงาน");
        for(CampaignState campaign:campaigns.values()) if(!campaign.isFinished()&&campaign.models.contains(id))
            return "redirect:/settings?aiError="+encode("ลบไม่ได้ เพราะ AI นี้อยู่ใน campaign ที่กำลังทำงาน");
        try { aiProviders.remove(id); return "redirect:/settings?aiDeleted=1"; }
        catch(Exception e){return "redirect:/settings?aiError="+encode("ลบ AI ไม่สำเร็จ");}
    }

    @PostMapping("/settings/ai/models")
    @ResponseBody
    public Map<String,Object> listAiModels(@RequestParam("provider") String provider,
            @RequestParam(value="address",defaultValue="") String address,@RequestParam("apiKey") String apiKey) {
        try{return Map.of("ok",true,"models",aiProviders.listModels(provider,address,apiKey));}
        catch(Exception e){return Map.of("ok",false,"error",e.getMessage()==null?"โหลด Model list ไม่สำเร็จ":e.getMessage());}
    }

    @PostMapping("/settings/ai/test")
    @ResponseBody
    public Map<String,Object> testAiProvider(@RequestParam("provider") String provider,
            @RequestParam(value="id",defaultValue="") String id,@RequestParam(value="address",defaultValue="") String address,
            @RequestParam(value="apiKey",defaultValue="") String apiKey,
            @RequestParam("model") String modelId,@RequestParam(value="inputPrice",defaultValue="0") String inputPrice,
            @RequestParam(value="outputPrice",defaultValue="0") String outputPrice,
            @RequestParam(value="reasoningEffort",defaultValue="medium") String reasoningEffort) {
        try {AiProviderService.ProviderResult r=!id.isBlank()&&apiKey.isBlank()&&aiProviders.sameModel(id,modelId)?aiProviders.test(id):aiProviders.test(id,provider,address,apiKey,modelId,inputPrice,outputPrice,reasoningEffort);
            return Map.of("ok",true,"model",r.actualModel,"elapsedMs",r.elapsedMs,"inputTokens",r.promptTokens,
                    "outputTokens",r.completionTokens,"cost",Double.isNaN(r.cost)?0:r.cost,"batchAccepted",r.batchAccepted);}
        catch(Exception e){return Map.of("ok",false,"error",e.getMessage()==null?"ทดสอบไม่สำเร็จ":e.getMessage());}
    }

    @PostMapping("/settings/algorithms")
    public String saveAlgorithms(@RequestParam(value="algorithms", required=false) List<String> algorithms) {
        try {
            algorithmSettings.save(algorithms);
            return "redirect:/settings?algorithmsSaved=1";
        } catch (IllegalArgumentException | IOException e) {
            return "redirect:/settings?algorithmError=1";
        }
    }

    @PostMapping("/settings/openrouter")
    public String saveOpenRouterKey(@RequestParam("apiKey") String apiKey) {
        try {
            openRouter.saveApiKey(apiKey);
            return "redirect:/settings?saved=1";
        } catch (IllegalArgumentException e) {
            return "redirect:/settings?error=save";
        } catch (IOException e) {
            return "redirect:/settings?error=save";
        }
    }

    @PostMapping("/settings/openrouter/clear")
    public String clearOpenRouterKey() {
        try {
            openRouter.clearApiKey();
            return "redirect:/settings?cleared=1";
        } catch (IOException e) {
            return "redirect:/settings?error=save";
        }
    }

    private volatile long bugTotalCache = -1, bugTotalAt;
    private long totalBugCount() throws Exception {
        if (bugTotalCache >= 0 && System.currentTimeMillis() - bugTotalAt < 600_000) return bugTotalCache;
        long total = 0;
        for (String project : defects4jRunner.listProjects()) total += defects4jRunner.listBugs(project).size();
        bugTotalCache = total; bugTotalAt = System.currentTimeMillis();
        return total;
    }

    private static double numberOrNegative(Object value) { return value instanceof Number ? ((Number) value).doubleValue() : -1; }

    /** Mean input/output tokens of this AI over its recent runs, the share of input served from cache, and the run count. */
    private double[] averageUsage(String modelId) {
        List<RunState> runs = new ArrayList<>(activeRuns.values());
        runs.sort(Comparator.comparing((RunState run) -> run.runId).reversed());
        double in = 0, out = 0, cached = 0, cachedBase = 0; int n = 0;
        for (RunState run : runs.subList(0, Math.min(60, runs.size()))) {
            int index = run.models.indexOf(modelId);
            if (index < 0) continue;
            Map<String,Object> row = run.snapshot().get(index);
            double prompt = numberOrNegative(row.get("promptTokens")), completion = numberOrNegative(row.get("completionTokens"));
            if (prompt < 0 || completion < 0) continue;
            in += prompt; out += completion; n++;
            double hit = numberOrNegative(row.get("cachedTokens"));
            if (hit >= 0) { cached += hit; cachedBase += prompt; }
        }
        return n == 0 ? new double[]{0, 0, 0, 0} : new double[]{in / n, out / n, cachedBase == 0 ? 0 : cached / cachedBase, n};
    }

    /** Cost estimate shown on the start form: requests = bugs x repetitions per selected AI. */
    @GetMapping("/estimate")
    @ResponseBody
    public Map<String,Object> estimate(@RequestParam(value = "generationMode", defaultValue = "ai-comparison") String generationMode,
            @RequestParam(value = "targetMode", defaultValue = "auto") String targetMode,
            @RequestParam(value = "bugIds", defaultValue = "") String bugIds,
            @RequestParam(value = "repetitions", defaultValue = "1") int repetitions) {
        Map<String,Object> out = new LinkedHashMap<>();
        int reps = Math.max(1, Math.min(50, repetitions));
        long bugs;
        try {
            bugs = "auto".equals(targetMode) ? totalBugCount()
                    : Math.max(1, bugIds.isBlank() ? 1 : bugIds.split(",").length);
        } catch (Exception e) {
            bugs = 1; out.put("note", "นับจำนวน bug ทั้ง dataset ไม่ได้ จึงประเมินจาก 1 bug");
        }
        List<Map<String,Object>> models = new ArrayList<>();
        double total = 0; boolean cloud = false; long requests = bugs * reps;
        if (!"algorithms-only".equals(generationMode)) for (Map<String,Object> model : aiProviders.safeList()) {
            if (!Boolean.TRUE.equals(model.get("selected"))) continue;
            String id = String.valueOf(model.get("id"));
            boolean local = aiProviders.isLocalModel(id);
            double[] usage = averageUsage(id);
            boolean measured = usage[3] > 0;
            double in = measured ? usage[0] : 4000, completion = measured ? usage[1] : 1500, cachedShare = usage[2];
            double inputPrice = numberOrNegative(model.get("inputPrice")), cachedPrice = numberOrNegative(model.get("cachedInputPrice")),
                    outputPrice = numberOrNegative(model.get("outputPrice"));
            if (cachedPrice <= 0) cachedPrice = inputPrice;
            double perRequest = local ? 0 : (in * (1 - cachedShare) * inputPrice + in * cachedShare * cachedPrice + completion * outputPrice) / 1_000_000.0;
            double cost = perRequest * requests;
            if (!local) { cloud = true; total += cost; }
            Map<String,Object> row = new LinkedHashMap<>();
            row.put("name", model.get("name")); row.put("local", local); row.put("requests", requests);
            row.put("inputTokens", Math.round(in)); row.put("outputTokens", Math.round(completion));
            row.put("basis", measured ? "เฉลี่ยจาก " + (long) usage[3] + " รอบก่อนหน้า" : "ค่าเริ่มต้น (ยังไม่เคยรัน)");
            row.put("cachedShare", cachedShare); row.put("costUsd", cost);
            models.add(row);
        }
        out.put("ok", true); out.put("bugs", bugs); out.put("repetitions", reps); out.put("requests", requests);
        out.put("models", models); out.put("cloud", cloud); out.put("totalCost", total);
        return out;
    }

    @PostMapping("/dispatch")
    public String dispatch(@RequestParam("targetMode") String targetMode,
            @RequestParam(value = "generationMode", defaultValue = "ai-comparison") String generationMode,
            @RequestParam(value = "project", required = false, defaultValue = "") String project,
            @RequestParam(value = "bugId", required = false, defaultValue = "") String bugId,
            @RequestParam(value = "bugIds", required = false) List<String> bugIds,
            @RequestParam("prompt") String prompt,
            @RequestParam(value = "buggySource", required = false, defaultValue = "") String buggySource,
            @RequestParam(value = "maxTokens", defaultValue = "0") int maxTokens,
            @RequestParam(value = "budgetSeconds", defaultValue = "60") int budgetSeconds,
            @RequestParam(value = "repetitions", defaultValue = "1") int repetitions,
            @RequestParam(value = "confirmCloud", defaultValue = "") String confirmCloud,
            @RequestParam(value = "algorithmOracle", defaultValue = "buggy") String algorithmOracle,
            @RequestParam(value = "aiRepairRounds", defaultValue = "2") int aiRepairRounds,
            @RequestParam(value = "onlyUndetected", defaultValue = "") String onlyUndetectedFlag,
            Model view) {
        aiRepairRounds = Math.max(0, Math.min(3, aiRepairRounds));
        boolean onlyUndetected = !onlyUndetectedFlag.isBlank() && !"0".equals(onlyUndetectedFlag) && !"false".equals(onlyUndetectedFlag);
        if ("auto".equals(algorithmOracle)) {
            // Auto = both oracles, kept as separate labelled results. The AI (and its cost) runs once, in the buggy-oracle
            // part; the fixed-oracle part is an extra algorithms-only run/campaign of the same bugs, queued after it.
            String first = dispatch(targetMode, generationMode, project, bugId, bugIds, prompt, buggySource, maxTokens,
                    budgetSeconds, repetitions, confirmCloud, "buggy", aiRepairRounds, onlyUndetectedFlag, view);
            if (first.startsWith("redirect:") && !"ai-only".equals(generationMode))
                dispatch(targetMode, "algorithms-only", project, bugId, bugIds, prompt, buggySource, maxTokens,
                        budgetSeconds, repetitions, "", "fixed", aiRepairRounds, onlyUndetectedFlag, view);
            return first;
        }
        String oracle = "fixed".equals(algorithmOracle) ? "fixed" : "buggy";
        // AI and algorithms must use the same reference version: a {{SOURCE_CODE}} template (AI sees fixed) with the fixed
        // oracle, a {{BUGGY_SOURCE}} template (AI sees buggy) with the buggy oracle.
        if (!"algorithms-only".equals(generationMode) && usesFixedSource(prompt) != "fixed".equals(oracle)) {
            view.addAttribute("error", usesFixedSource(prompt)
                    ? "Master Prompt นี้ส่ง source เวอร์ชัน fixed ให้ AI แต่ algorithm ตั้ง oracle เป็น buggy · ให้ใช้ oracle fixed หรือเลือก Master Prompt ที่ใช้ {{BUGGY_SOURCE}}"
                    : "algorithm ใช้ oracle fixed แต่ Master Prompt นี้ส่ง source เวอร์ชัน buggy ให้ AI · เลือก Master Prompt v13 ขึ้นไป (ใช้ {{SOURCE_CODE}}) ใน Settings แล้วรีเฟรชหน้าแรก");
            return index(view);
        }
        // A cloud model can cost money: refuse to start unless the user confirmed the estimate shown on the form.
        if (!"algorithms-only".equals(generationMode) && aiProviders.hasCloudSelected() && !"yes".equals(confirmCloud)) {
            view.addAttribute("error", "มี AI แบบ cloud ที่เลือกไว้ ต้องยืนยันค่าใช้จ่ายที่ประเมินไว้ก่อนเริ่ม (กดเริ่มจากหน้าแรกแล้วยืนยันในกล่องข้อความ) หรือเลือกเฉพาะ local AI ใน Settings");
            return index(view);
        }
        if ("auto".equals(targetMode)) {
            try {
                boolean algorithmOnly = "algorithms-only".equals(generationMode);
                CampaignState campaign = createCampaign(prompt, buggySource, maxTokens, budgetSeconds, algorithmOnly, "ai-only".equals(generationMode), onlyUndetected, repetitions, oracle, aiRepairRounds);
                return "redirect:/campaign?campaignId=" + encode(campaign.campaignId);
            } catch (Exception e) {
                view.addAttribute("error", e.getMessage() == null ? "เริ่ม campaign ไม่สำเร็จ" : e.getMessage());
                return index(view);
            }
        }
        List<String> selectedBugIds = bugIds == null ? new ArrayList<>() : bugIds.stream()
                .filter(id -> id != null && !id.isBlank()).distinct().collect(java.util.stream.Collectors.toList());
        if (selectedBugIds.isEmpty() && repetitions > 1 && bugId != null && !bugId.isBlank()) selectedBugIds.add(bugId);
        if (selectedBugIds.size() > 1 || (selectedBugIds.size() == 1 && repetitions > 1)) {
            try {
                boolean algorithmOnly = "algorithms-only".equals(generationMode);
                CampaignState campaign = createCampaign(prompt, "", maxTokens, budgetSeconds, algorithmOnly, "ai-only".equals(generationMode), onlyUndetected,
                        project, selectedBugIds, repetitions, oracle, aiRepairRounds);
                return "redirect:/campaign?campaignId=" + encode(campaign.campaignId);
            } catch (Exception e) {
                view.addAttribute("error", e.getMessage() == null ? "เริ่ม campaign ไม่สำเร็จ" : e.getMessage());
                return index(view);
            }
        }
        if (selectedBugIds.size() == 1) bugId = selectedBugIds.get(0);
        return generate(project, bugId, prompt, buggySource, maxTokens, budgetSeconds, generationMode, oracle, aiRepairRounds, view);
    }

    private CampaignState createCampaign(String prompt, String source, int maxTokens, int budgetSeconds,
            boolean algorithmOnly, boolean aiOnly, boolean onlyUndetected, int repetitions, String oracle, int aiRepairRounds) throws Exception {
        return createCampaign(prompt, source, maxTokens, budgetSeconds, algorithmOnly, aiOnly, onlyUndetected, "", List.of(), repetitions, oracle, aiRepairRounds);
    }

    private CampaignState createCampaign(String prompt, String source, int maxTokens, int budgetSeconds,
            boolean algorithmOnly, boolean aiOnly, boolean onlyUndetected, String selectedProject, List<String> selectedBugIds, int repetitions, String oracle, int aiRepairRounds) throws Exception {
        if (!algorithmOnly) {
            if (prompt == null || prompt.isBlank()) throw new IllegalArgumentException("กรุณาใส่ Master Prompt");
            validatePromptTemplate(prompt);
            if (maxTokens != 0 && (maxTokens < 256 || maxTokens > 16000)) throw new IllegalArgumentException("เพดาน output tokens ต้องอยู่ระหว่าง 256-16000 หรือปิด toggle เพื่อใช้ค่า provider");
        }
        if (budgetSeconds < 10 || budgetSeconds > 3600) throw new IllegalArgumentException("algorithm budget ต้องอยู่ระหว่าง 10-3600 วินาที");
        if (repetitions < 1 || repetitions > 50) throw new IllegalArgumentException("จำนวนรอบทำซ้ำต้องอยู่ระหว่าง 1-50");
        List<String> models = aiProviders.selectedModelIds();
        if (!algorithmOnly && !aiProviders.isReady()) throw new IllegalStateException("เลือก AI อย่างน้อยหนึ่งรายการและตรวจ API key ใน Settings ก่อนเริ่ม");
        List<String> projects;
        if (selectedBugIds != null && !selectedBugIds.isEmpty()) {
            if (selectedProject == null || !defects4jRunner.listProjects().contains(selectedProject))
                throw new IllegalArgumentException("Project ที่เลือกไม่มีใน Defects4J");
            List<String> availableBugs = defects4jRunner.listBugs(selectedProject);
            List<String> distinctBugs = selectedBugIds.stream().filter(id -> id != null && !id.isBlank()).distinct()
                    .collect(java.util.stream.Collectors.toList());
            if (distinctBugs.isEmpty() || !availableBugs.containsAll(distinctBugs))
                throw new IllegalArgumentException("Bug IDs ที่เลือกไม่ตรงกับ Project ใน Defects4J");
            projects = List.of(selectedProject);
            selectedBugIds = distinctBugs;
        } else {
            projects = defects4jRunner.listProjects();
            if (projects.isEmpty()) throw new IllegalStateException("Defects4J ไม่พบ Project IDs ใน installation นี้");
        }
        // AI-only: no algorithm rows at all (the AI side can then be measured or re-measured on its own).
        List<String> selectedAlgorithms = aiOnly ? List.of() : algorithmSettings.getAlgorithms();
        List<Map<String,Object>> targets = new ArrayList<>();
        // Skip what was already done: a method needs round r only while fewer than r+1 rounds of it are done or running.
        Map<String,Integer> done = doneRounds();
        // "Only what is not detected yet": a development round of the generators. A method that already detected the bug
        // (same budget/oracle or prompt version) is skipped; every other method runs again as a new run, old runs are kept.
        Set<String> detected = onlyUndetected ? detectedKeys() : Set.of();
        String version = algorithmOnly ? "" : promptVersionOf(prompt);
        String oracleKey = "fixed".equals(oracle) ? "fixed" : "buggy";
        int skippedDone = 0;
        for (String pid : projects) for (String bid : selectedBugIds != null && !selectedBugIds.isEmpty()
                ? selectedBugIds : defects4jRunner.listBugs(pid)) {
            for (int repetition = 0; repetition < repetitions; repetition++) {
                List<Integer> skipAi = new ArrayList<>(), skipAlgorithms = new ArrayList<>();
                boolean needed = false;
                if (!algorithmOnly) for (int i = 0; i < models.size(); i++) {
                    String key = aiKey(slug(pid), slug(bid), aiProviders.displayName(models.get(i)), versionKey(version, aiRepairRounds));
                    if (onlyUndetected ? detected.contains(key) : done.getOrDefault(key, 0) > repetition) skipAi.add(i);
                    else needed = true;
                }
                for (int i = 0; i < selectedAlgorithms.size(); i++) {
                    String key = algorithmKey(slug(pid), slug(bid), selectedAlgorithms.get(i), budgetSeconds, oracleKey);
                    if (onlyUndetected ? detected.contains(key) : done.getOrDefault(key, 0) > repetition) skipAlgorithms.add(i);
                    else needed = true;
                }
                String skipLabel = onlyUndetected ? ALREADY_DETECTED : ALREADY_DONE;
                skippedDone += skipAi.size() + skipAlgorithms.size();
                if (!needed) continue;
                Map<String,Object> target = new LinkedHashMap<>();
                target.put("project", pid); target.put("bugId", bid); target.put("repetition", repetition);
                target.put("status", "queued"); target.put("runId", "");
                List<Map<String,Object>> tests = queuedTests(algorithmOnly, aiNames(models), selectedAlgorithms);
                for (int i : skipAi) { tests.get(i).put("status", skipLabel); tests.get(i).put("pending", false); tests.get(i).put("done", true); }
                for (int i : skipAlgorithms) { Map<String,Object> chip = tests.get(models.size() + i); chip.put("status", skipLabel); chip.put("pending", false); chip.put("done", true); }
                target.put("tests", tests);
                if (!skipAi.isEmpty()) target.put("skipAi", skipAi);
                if (!skipAlgorithms.isEmpty()) target.put("skipAlgorithms", skipAlgorithms);
                targets.add(target);
            }
        }
        if (targets.isEmpty() && skippedDone > 0)
            throw new IllegalStateException("ทุกรายการที่เลือกทำครบตามจำนวนรอบแล้ว (" + skippedDone + " งาน) · ถ้าต้องการรันใหม่ ให้ลบรายการเดิมที่หน้าประวัติ หรือเพิ่มจำนวนรอบ");
        if (targets.isEmpty()) throw new IllegalStateException("Defects4J catalog ไม่มี Bug IDs");
        String id = UUID.randomUUID().toString();
        Path dir = outputRoot.resolve("ai-runs").resolve("campaigns").resolve(id).normalize();
        if (!dir.startsWith(outputRoot)) throw new IllegalArgumentException("Invalid campaign output location");
        Files.createDirectories(dir);
        Files.writeString(dir.resolve("user-prompt.txt"), prompt, StandardCharsets.UTF_8);
        Files.writeString(dir.resolve("buggy-source-input.txt"), source == null ? "" : source, StandardCharsets.UTF_8);
        CampaignState campaign = new CampaignState(id, dir, projects, targets, models, selectedAlgorithms,
                prompt == null ? "" : prompt, source == null ? "" : source, maxTokens, budgetSeconds, algorithmOnly);
        campaign.algorithmOracle = oracle;
        campaign.aiRepairRounds = aiRepairRounds;
        campaign.onlyUndetected = onlyUndetected;
        campaign.skippedDone = skippedDone;
        campaigns.put(id, campaign);
        persistCampaign(campaign);
        launchCampaign(campaign);
        return campaign;
    }

    private void launchCampaign(CampaignState campaign) {
        synchronized (campaign) {
            if (campaign.workerActive || campaign.isFinished()) return;
            campaign.workerActive = true;
        }
        campaignPool.submit(() -> {
            try { runCampaign(campaign); }
            finally { synchronized (campaign) { campaign.workerActive = false; } }
        });
    }

    private RunState createCampaignRun(CampaignState campaign, Map<String,Object> target) throws IOException {
        String project = String.valueOf(target.get("project"));
        String bugId = String.valueOf(target.get("bugId"));
        String runId = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss-SSS").withZone(ZoneOffset.UTC).format(Instant.now())
                + "-" + UUID.randomUUID().toString().substring(0, 8);
        String safeProject = slug(project), safeBug = slug(bugId);
        Path dir = outputRoot.resolve("ai-runs").resolve(safeProject + "-" + safeBug).resolve(runId).normalize();
        if (!dir.startsWith(outputRoot)) throw new IllegalArgumentException("Invalid output location");
        Files.createDirectories(dir);
        Files.writeString(dir.resolve("system-skill-used.md"), openRouter.getSystemInstruction(), StandardCharsets.UTF_8);
        Files.writeString(dir.resolve("models.txt"), String.join("\n", campaign.models) + "\n", StandardCharsets.UTF_8);
        Files.writeString(dir.resolve("user-prompt.txt"), campaign.prompt, StandardCharsets.UTF_8);
        Files.writeString(dir.resolve("buggy-source-input.txt"), campaign.source, StandardCharsets.UTF_8);
        RunState run = new RunState(runId, safeProject, safeBug, dir, campaign.models, campaign.algorithms,
                campaign.budgetSeconds, campaign.maxTokens);
        run.repetition = (int) numberValue(target.get("repetition"));
        run.algorithmOracle = campaign.algorithmOracle;
        run.aiRepairRounds = campaign.aiRepairRounds;
        assignModelFolders(run);
        stampPrompt(run, campaign.algorithmOnly ? "" : campaign.prompt);
        List<Integer> skipAi = indexList(target.get("skipAi")), skipAlgorithms = indexList(target.get("skipAlgorithms"));
        for (int i=0; i<campaign.models.size(); i++) {
            String model = campaign.models.get(i);
            Map<String,Object> row = new LinkedHashMap<>();
            row.put("label", aiProviders.displayName(model)); row.put("model", aiProviders.label(model));
            row.put("mode", campaign.algorithmOnly ? "skipped" : (aiProviders.isBatch(model) ? "batch" : "direct"));
            row.put("pending", !campaign.algorithmOnly); row.put("ok", false);
            row.put("status", campaign.algorithmOnly ? "ข้าม · algorithms-only campaign"
                    : campaign.source.isBlank() ? "กำลังดึง source จาก Defects4J" : "กำลังรอผลจากโมเดล");
            if (skipAi.contains(i)) markAlreadyDone(row);
            run.setInitial(i, row);
        }
        int aiCount=campaign.models.size();
        for (int i=0; i<campaign.algorithms.size(); i++) {
            initializeAlgorithmRow(run, aiCount+i, campaign.algorithms.get(i), campaign.budgetSeconds);
            if (skipAlgorithms.contains(i)) { Map<String,Object> row = run.snapshot().get(aiCount+i); markAlreadyDone(row); run.setInitial(aiCount+i, row); }
        }
        activeRuns.put(runId, run); persistMetadata(run);
        return run;
    }

    /** Runs the campaign with `bench.parallelism` workers that take targets in order; 1 worker = strictly sequential. */
    private void runCampaign(CampaignState campaign) {
        synchronized (campaign) { if (campaign.cancelled) return; campaign.status = "running"; campaign.claimed.clear(); }
        persistCampaign(campaign);
        List<Thread> workers = new ArrayList<>();
        for (int i = 0; i < parallelism; i++) {
            Thread worker = new Thread(() -> campaignWorker(campaign), "campaign-worker-" + i);
            worker.setDaemon(true); worker.start(); workers.add(worker);
        }
        try { for (Thread worker : workers) worker.join(); }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            synchronized (campaign) { campaign.paused = true; campaign.status = "paused"; }
            persistCampaign(campaign); return;
        }
        boolean finished = campaign.allTerminal();
        synchronized (campaign) { if (finished && !campaign.cancelled) { campaign.status = "completed"; campaign.paused = false; } }
        if (finished || campaign.cancelled) writeCampaignSummary(campaign);
        persistCampaign(campaign);
    }

    private void campaignWorker(CampaignState campaign) {
        while (true) {
            try { campaign.awaitRunning(); } catch (IllegalStateException interrupted) { return; }
            if (campaign.cancelled) return;
            Integer index = campaign.claimNext();
            if (index == null) return;
            if (!runTarget(campaign, index)) return;
        }
    }

    /** One bug (and repetition) of a campaign; returns false when the worker was interrupted. */
    private boolean runTarget(CampaignState campaign, int index) {
        Map<String,Object> target = campaign.target(index);
        try {
            String runId = String.valueOf(target.getOrDefault("runId", ""));
            RunState run = runId.isBlank() ? null : activeRuns.get(runId);
            if (run == null) {
                run = createCampaignRun(campaign, target);
                synchronized (campaign) {
                    target.put("runId", run.runId);
                    target.put("status", "running");
                    campaign.currentRunId = run.runId;
                    campaign.currentIndex = campaign.firstUnfinished();
                }
                persistCampaign(campaign);
                startRemaining(run, campaign.prompt, campaign.source, campaign.maxTokens, campaign.budgetSeconds);
            } else if (run.isPending() && run.isPaused()) {
                run.resume();
                startRemaining(run, campaign.prompt, campaign.source, campaign.maxTokens, campaign.budgetSeconds);
            }
            while (run.isPending()) {
                if (campaign.cancelled) cancelRun(run);
                else if (campaign.isPaused()) {
                    run.pause();
                    campaign.awaitRunning();
                    if (!campaign.cancelled) { run.resume(); startRemaining(run, campaign.prompt, campaign.source, campaign.maxTokens, campaign.budgetSeconds); }
                }
                Thread.sleep(500);
            }
            if (campaign.cancelled) {
                synchronized (campaign) {
                    target.put("status", "cancelled");
                    campaign.currentIndex = campaign.firstUnfinished();
                    if (run.runId.equals(campaign.currentRunId)) campaign.currentRunId = "";
                }
                persistCampaign(campaign);
                return false;
            }
            List<Map<String,Object>> results = run.snapshot();
            List<String> detections = new ArrayList<>();
            for (Map<String,Object> row : results) {
                Object benchmark = row.get("benchmark");
                if (benchmark instanceof Map) {
                    Object detection = ((Map<?,?>) benchmark).get("detection");
                    detections.add(detection == null ? "NOT_DETERMINED" : String.valueOf(detection));
                } else detections.add("NOT_DETERMINED");
            }
            synchronized (campaign) {
                target.put("detections", detections);
                target.put("tests", summarizeTests(results));
                target.put("status", "completed");
                campaign.currentIndex = campaign.firstUnfinished();
                if (run.runId.equals(campaign.currentRunId)) campaign.currentRunId = "";
            }
            persistCampaign(campaign);
            writeCampaignSummary(campaign);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            synchronized (campaign) { campaign.paused = true; campaign.status = "paused"; }
            persistCampaign(campaign);
            return false;
        } catch (Exception e) {
            synchronized (campaign) {
                target.put("status", "error"); target.put("error", e.getMessage() == null ? e.toString() : e.getMessage());
                target.put("tests", failedTests(e.getMessage() == null ? "error" : e.getMessage(), campaign.algorithmOnly, aiNames(campaign.models), campaign.algorithms));
                campaign.currentIndex = campaign.firstUnfinished();
            }
            persistCampaign(campaign);
            return true;
        }
    }

    /** Running mean that ignores missing values instead of treating them as 0. */
    private static final class Mean {
        double sum; long count;
        void add(Double value) { if (value != null && !value.isNaN()) { sum += value; count++; } }
        Double value() { return count == 0 ? null : sum / count; }
    }

    private static Double doubleValue(Object value) { return value instanceof Number ? ((Number) value).doubleValue() : null; }

    /** A finished run of a campaign target with its rows, copied once and shared by every aggregate of one summary. */
    private static final class TargetRows {
        final Map<String,Object> target; final List<Map<String,Object>> rows;
        TargetRows(Map<String,Object> target, List<Map<String,Object>> rows) { this.target = target; this.rows = rows; }
    }

    private void writeCampaignSummary(CampaignState campaign) {
        try { writeJson(campaign.dir.resolve("campaign-summary.json"), buildCampaignSummary(campaign)); }
        catch (IOException | RuntimeException ignored) { }
    }

    /** The summary of everything finished so far (also valid while the campaign is still running). */
    private List<TargetRows> loadFinished(CampaignState campaign) {
        List<TargetRows> loaded = new ArrayList<>();
        for (Map<String,Object> target : campaign.snapshot()) {
            String runId = String.valueOf(target.getOrDefault("runId", ""));
            RunState run = runId.isBlank() ? null : activeRuns.get(runId);
            if (run == null || run.isPending()) continue;
            loaded.add(new TargetRows(target, run.snapshot()));
        }
        return loaded;
    }

    private Map<String,Object> buildCampaignSummary(CampaignState campaign) {
        List<TargetRows> loaded = loadFinished(campaign);
        Map<String,Object> report = new LinkedHashMap<>();
        report.put("updatedAt", Instant.now().toString());
        report.put("finishedTargets", loaded.size());
        report.put("live", !campaign.isFinished());
        report.put("campaignId", campaign.campaignId);
        report.put("status", campaign.status);
        report.put("experimentMode", campaign.algorithmOnly ? "algorithms-only" : campaign.algorithms.isEmpty() ? "ai-only" : "ai-and-algorithms");
        report.put("projectCount", campaign.projects.size());
        report.put("bugCount", campaign.targets.size());
        report.put("processedCount", campaign.completedCount());
        report.put("errorCount", campaign.targets.stream().filter(t -> "error".equals(t.get("status"))).count());
        report.put("budgetSeconds", campaign.budgetSeconds);
        int generatorCount = campaign.models.size() + campaign.algorithms.size();
        List<Map<String,Object>> generators = new ArrayList<>();
        // An algorithms-only campaign never used an AI, so no AI entry appears in any table.
        int firstGenerator = campaign.algorithmOnly ? campaign.models.size() : 0;
        for (int generatorIndex = firstGenerator; generatorIndex < generatorCount; generatorIndex++)
            generators.add(aggregateGenerator(campaign, generatorIndex, null, loaded));
        report.put("generators", generators);
        List<Map<String,Object>> byProject = new ArrayList<>();
        for (String project : campaign.projects) {
            Map<String,Object> entry = new LinkedHashMap<>();
            entry.put("project", project);
            List<Map<String,Object>> projectGenerators = new ArrayList<>();
            for (int generatorIndex = firstGenerator; generatorIndex < generatorCount; generatorIndex++)
                projectGenerators.add(aggregateGenerator(campaign, generatorIndex, project, loaded));
            entry.put("generators", projectGenerators);
            byProject.add(entry);
        }
        report.put("byProject", byProject);
        return report;
    }

    /** One flat row per finished (bug, round, generator): the detail table of the campaign page and of the exports. */
    private List<Map<String,Object>> resultRows(CampaignState campaign, List<TargetRows> loaded, String projectFilter) {
        List<Map<String,Object>> out = new ArrayList<>();
        int aiCount = campaign.models.size();
        for (TargetRows loadedTarget : loaded) {
            Map<String,Object> target = loadedTarget.target;
            String project = String.valueOf(target.get("project"));
            if (projectFilter != null && !projectFilter.isBlank() && !projectFilter.equals(project)) continue;
            for (int g = 0; g < loadedTarget.rows.size(); g++) {
                Map<String,Object> row = loadedTarget.rows.get(g);
                if ("skipped".equals(row.get("mode"))) continue;
                boolean ai = g < aiCount;
                Object rawBenchmark = row.get("benchmark");
                Map<?,?> benchmark = rawBenchmark instanceof Map ? (Map<?,?>) rawBenchmark : Map.of();
                Object versions = benchmark.get("versions");
                Object buggy = versions instanceof Map ? ((Map<?,?>) versions).get("b") : null;
                Object fixed = versions instanceof Map ? ((Map<?,?>) versions).get("f") : null;
                Map<String,Object> r = new LinkedHashMap<>();
                r.put("project", project); r.put("bug", target.get("bugId")); r.put("round", numberValue(target.get("repetition")) + 1);
                r.put("type", ai ? "AI" : "Algorithm");
                r.put("generator", ai ? aiProviders.displayName(campaign.models.get(g))
                        : algorithmLabel(campaign.algorithms.get(g - aiCount)).replace("Algorithm · ", ""));
                r.put("oracle", ai ? "" : String.valueOf(benchmark.get("oracleVersion") == null ? campaign.algorithmOracle : benchmark.get("oracleVersion")));
                String detection = Boolean.TRUE.equals(row.get("invalidOutput")) ? "INVALID_OUTPUT"
                        : benchmark.get("detection") != null ? String.valueOf(benchmark.get("detection"))
                        : (ai && String.valueOf(row.getOrDefault("javaFile", "")).isBlank() ? "NO_SUITE" : "ERROR");
                r.put("detection", detection);
                r.put("detectedTests", benchmark.get("detectedTests") instanceof List ? ((List<?>) benchmark.get("detectedTests")).size() : 0);
                r.put("versionsDiffer", benchmark.get("behaviorDiffers"));
                r.put("tests", benchmark.get("validTests") != null ? benchmark.get("validTests") : benchmark.get("uniqueTests"));
                r.put("removedTests", benchmark.get("removedTests"));
                r.put("buggyStatus", buggy instanceof Map ? ((Map<?,?>) buggy).get("testStatus") : null);
                r.put("fixedStatus", fixed instanceof Map ? ((Map<?,?>) fixed).get("testStatus") : null);
                r.put("fixedSuitePasses", benchmark.get("fixedSuitePasses"));
                r.put("buggyLineCovPercent", coverageValue(buggy, "lineCoveragePercent"));
                r.put("buggyBranchCovPercent", coverageValue(buggy, "branchCoveragePercent"));
                r.put("fixedLineCovPercent", coverageValue(fixed, "lineCoveragePercent"));
                r.put("fixedBranchCovPercent", coverageValue(fixed, "branchCoveragePercent"));
                r.put("generationMs", row.get("elapsedMs"));
                Double bt = versionNumber(buggy, "testElapsedMs"), ft = versionNumber(fixed, "testElapsedMs");
                r.put("testExecutionMs", bt != null && ft != null ? bt + ft : null);
                r.put("promptTokens", ai ? row.get("promptTokens") : null);
                r.put("completionTokens", ai ? row.get("completionTokens") : null);
                r.put("cachedTokens", ai ? row.get("cachedTokens") : null);
                r.put("costUsd", ai ? row.get("cost") : null);
                Object reason = benchmark.get("error") != null ? benchmark.get("error") : row.get("error");
                if (reason == null && "NOT_DETERMINED".equals(detection)) reason = versionError(versions);
                r.put("note", reason == null ? "" : String.valueOf(reason).replaceAll("\\s+", " ").trim());
                r.put("runId", loadedTarget.target.get("runId"));
                out.add(r);
            }
        }
        return out;
    }

    private List<TableExport.Table> campaignTables(CampaignState campaign) {
        Map<String,Object> summary = buildCampaignSummary(campaign);
        List<Map<String,Object>> generators = new ArrayList<>();
        Object rawGenerators = summary.get("generators");
        if (rawGenerators instanceof List) for (Object item : (List<?>) rawGenerators) {
            @SuppressWarnings("unchecked") Map<String,Object> generator = (Map<String,Object>) item;
            if (!"NOT_RUN_AI_DISABLED".equals(generator.get("status"))) generators.add(generator);
        }
        List<Map<String,Object>> projectRows = new ArrayList<>();
        Object rawProjects = summary.get("byProject");
        if (rawProjects instanceof List) for (Object group : (List<?>) rawProjects) {
            Map<?,?> entry = (Map<?,?>) group;
            Object list = entry.get("generators");
            if (list instanceof List) for (Object item : (List<?>) list) {
                @SuppressWarnings("unchecked") Map<String,Object> generator = (Map<String,Object>) item;
                if ("NOT_RUN_AI_DISABLED".equals(generator.get("status")) || numberOrNegative(generator.get("attempted")) == 0) continue;
                Map<String,Object> row = new LinkedHashMap<>();
                row.put("project", entry.get("project")); row.putAll(generator);
                projectRows.add(row);
            }
        }
        List<TableExport.Table> tables = new ArrayList<>();
        tables.add(TableExport.Table.fromMaps("Summary", generators));
        tables.add(TableExport.Table.fromMaps("By project", projectRows));
        tables.add(TableExport.Table.fromMaps("Results", resultRows(campaign, loadFinished(campaign), null)));
        return tables;
    }

    @GetMapping("/campaign-rows")
    @ResponseBody
    public Map<String,Object> campaignRows(@RequestParam("campaignId") String campaignId,
            @RequestParam(value = "project", defaultValue = "") String project,
            @RequestParam(value = "limit", defaultValue = "400") int limit) {
        CampaignState campaign = campaigns.get(campaignId);
        if (campaign == null) return Map.of("ok", false);
        List<Map<String,Object>> rows = resultRows(campaign, loadFinished(campaign), project);
        java.util.Collections.reverse(rows);   // newest first
        int shown = Math.max(1, Math.min(5000, limit));
        Map<String,Object> out = new LinkedHashMap<>();
        out.put("ok", true); out.put("total", rows.size());
        out.put("rows", rows.size() > shown ? rows.subList(0, shown) : rows);
        return out;
    }

    /** Download of the campaign tables: format=csv (table=results|summary|projects), xlsx (all three sheets) or json. */
    @GetMapping("/campaign-export")
    @ResponseBody
    public org.springframework.http.ResponseEntity<byte[]> campaignExport(@RequestParam("campaignId") String campaignId,
            @RequestParam(value = "table", defaultValue = "results") String table,
            @RequestParam(value = "format", defaultValue = "csv") String format) throws IOException {
        CampaignState campaign = campaigns.get(campaignId);
        if (campaign == null) return org.springframework.http.ResponseEntity.notFound().build();
        String base = "campaign-" + campaignId.substring(0, Math.min(8, campaignId.length()));
        List<TableExport.Table> tables = campaignTables(campaign);
        byte[] body; String type; String name;
        if ("xlsx".equals(format)) {
            body = TableExport.xlsx(tables);
            type = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"; name = base + ".xlsx";
        } else if ("json".equals(format)) {
            Map<String,Object> all = new LinkedHashMap<>(buildCampaignSummary(campaign));
            all.put("results", resultRows(campaign, loadFinished(campaign), null));
            body = mapper.writerWithDefaultPrettyPrinter().writeValueAsBytes(all);
            type = "application/json"; name = base + ".json";
        } else {
            int index = "summary".equals(table) ? 0 : "projects".equals(table) ? 1 : 2;
            body = TableExport.csv(tables.get(index));
            type = "text/csv; charset=UTF-8"; name = base + "-" + (index == 0 ? "summary" : index == 1 ? "projects" : "results") + ".csv";
        }
        return org.springframework.http.ResponseEntity.ok()
                .contentType(org.springframework.http.MediaType.parseMediaType(type))
                .header("Content-Disposition", "attachment; filename=\"" + name + "\"")
                .body(body);
    }

    /** Summary for the live campaign page, recomputed at most every 2 seconds however many viewers poll it. */
    @GetMapping("/campaign-summary")
    @ResponseBody
    public Map<String,Object> campaignSummary(@RequestParam("campaignId") String campaignId) {
        CampaignState campaign = campaigns.get(campaignId);
        if (campaign == null) return Map.of("ok", false);
        Map<String,Object> summary;
        synchronized (campaign) {
            long now = System.currentTimeMillis();
            if (campaign.summaryCache == null || now - campaign.summaryAt > 2000) {
                campaign.summaryCache = buildCampaignSummary(campaign);
                campaign.summaryAt = now;
            }
            summary = campaign.summaryCache;
        }
        Map<String,Object> out = new LinkedHashMap<>(summary);
        out.put("ok", true);
        return out;
    }

    /**
     * One generator (an AI or an algorithm), optionally limited to one project. Every attempted run lands in exactly one of:
     * invalid output, error (no suite / no result), not determined (compile or execution failure on a version) or evaluated.
     * The headline detection rate divides by attempted runs so failed generations are not silently dropped.
     */
    private Map<String,Object> aggregateGenerator(CampaignState campaign, int generatorIndex, String projectFilter, List<TargetRows> loaded) {
        String label = generatorIndex < campaign.models.size() ? aiProviders.displayName(campaign.models.get(generatorIndex))
                : algorithmLabel(campaign.algorithms.get(generatorIndex - campaign.models.size()));
        long attempted = 0, evaluated = 0, detected = 0, invalid = 0, errors = 0, notDetermined = 0, fixedSuiteFailed = 0, behaviorDiffers = 0;
        Mean tests = new Mean(), generationMs = new Mean(), executionMs = new Mean(), totalMs = new Mean();
        Mean buggyLine = new Mean(), fixedLine = new Mean(), buggyBranch = new Mean(), fixedBranch = new Mean();
        Mean tokensIn = new Mean(), tokensOut = new Mean(), tokensCached = new Mean();
        List<String> detectedBugs = new ArrayList<>(), differingBugs = new ArrayList<>();
        List<Map<String,Object>> notCounted = new ArrayList<>();
        double costSum = 0; long costRuns = 0;
        for (TargetRows loadedTarget : loaded) {
            Map<String,Object> target = loadedTarget.target;
            if (projectFilter != null && !projectFilter.equals(String.valueOf(target.get("project")))) continue;
            List<Map<String,Object>> rows = loadedTarget.rows;
            if (generatorIndex >= rows.size()) continue;
            Map<String,Object> row = rows.get(generatorIndex);
            if ("skipped".equals(row.get("mode"))) continue;
            attempted++;
            // tokens and cost are spent even when the suite later turns out to be unusable, so count every attempt
            Double promptTokens = doubleValue(row.get("promptTokens")), completionTokens = doubleValue(row.get("completionTokens"));
            Double cachedTokens = doubleValue(row.get("cachedTokens")), cost = doubleValue(row.get("cost"));
            if (promptTokens != null && promptTokens >= 0) tokensIn.add(promptTokens);
            if (completionTokens != null && completionTokens >= 0) tokensOut.add(completionTokens);
            if (cachedTokens != null && cachedTokens >= 0) tokensCached.add(cachedTokens);
            if (cost != null) {
                costSum += cost; costRuns++;
            }
            Object rawBenchmark = row.get("benchmark");
            Map<?,?> benchmark = rawBenchmark instanceof Map ? (Map<?,?>) rawBenchmark : null;
            String bugLabel = target.get("project") + "-" + target.get("bugId") + " (Round " + (numberValue(target.get("repetition")) + 1) + ")";
            if (Boolean.TRUE.equals(row.get("invalidOutput"))) { invalid++; notCounted.add(notCountedEntry(bugLabel, "invalid", row.get("error"))); continue; }
            if (benchmark == null || !"COMPLETED".equals(String.valueOf(benchmark.get("status")))) {
                errors++; notCounted.add(notCountedEntry(bugLabel, "error", benchmark != null && benchmark.get("error") != null ? benchmark.get("error") : row.get("error"))); continue; }
            String detection = String.valueOf(benchmark.get("detection"));
            if ("NOT_DETERMINED".equals(detection)) {
                notDetermined++;
                Object why = versionError(benchmark.get("versions"));
                notCounted.add(notCountedEntry(bugLabel, "not-determined", why)); continue; }
            evaluated++;
            if ("BUGGY_FAIL_FIXED_PASS".equals(detection)) { detected++; detectedBugs.add(bugLabel); }
            if (Boolean.TRUE.equals(benchmark.get("behaviorDiffers"))) { behaviorDiffers++; differingBugs.add(bugLabel); }
            if (Boolean.FALSE.equals(benchmark.get("fixedSuitePasses"))) fixedSuiteFailed++;
            tests.add(doubleValue(benchmark.get("validTests") != null ? benchmark.get("validTests") : benchmark.get("uniqueTests")));
            // Generation time: the generator's own time (AI: request; algorithm: search time).
            Double generation = doubleValue(row.get("elapsedMs"));
            generationMs.add(generation);
            Double evaluation = doubleValue(benchmark.get("elapsedMs"));
            if (evaluation != null && benchmark.get("algorithm") != null) {
                // an algorithm's benchmark elapsed time already contains its own search time
                Double search = doubleValue(benchmark.get("generationElapsedMs"));
                if (search != null) evaluation -= search;
            }
            if (generation != null && evaluation != null) totalMs.add(generation + evaluation);
            Object rawVersions = benchmark.get("versions");
            if (rawVersions instanceof Map) {
                Map<?,?> versions = (Map<?,?>) rawVersions;
                Double bt = versionNumber(versions.get("b"), "testElapsedMs"), ft = versionNumber(versions.get("f"), "testElapsedMs");
                if (bt != null && ft != null) executionMs.add(bt + ft);
                buggyLine.add(coverageValue(versions.get("b"), "lineCoveragePercent")); buggyBranch.add(coverageValue(versions.get("b"), "branchCoveragePercent"));
                fixedLine.add(coverageValue(versions.get("f"), "lineCoveragePercent")); fixedBranch.add(coverageValue(versions.get("f"), "branchCoveragePercent"));
            }
        }
        Map<String,Object> item = new LinkedHashMap<>();
        item.put("generator", label);
        item.put("attempted", attempted); item.put("evaluated", evaluated); item.put("detected", detected);
        item.put("invalidOutput", invalid); item.put("errors", errors); item.put("notDetermined", notDetermined);
        item.put("fixedSuiteFailed", fixedSuiteFailed);
        item.put("behaviorDiffers", behaviorDiffers);
        item.put("detectedBugs", detectedBugs);
        item.put("behaviorDiffersBugs", differingBugs);
        item.put("notCountedBugs", notCounted);
        item.put("behaviorDiffersRatePercentOfEvaluated", evaluated == 0 ? null : behaviorDiffers * 100.0 / evaluated);
        item.put("status", campaign.algorithmOnly && generatorIndex < campaign.models.size() ? "NOT_RUN_AI_DISABLED" : "RECORDED");
        item.put("detectionRatePercent", attempted == 0 ? null : detected * 100.0 / attempted);
        item.put("detectionRatePercentOfEvaluated", evaluated == 0 ? null : detected * 100.0 / evaluated);
        item.put("meanPromptTokens", tokensIn.value());
        item.put("meanCompletionTokens", tokensOut.value());
        item.put("meanCachedTokens", tokensCached.value());
        item.put("totalCostUsd", costRuns == 0 ? null : costSum);
        item.put("costReportedRuns", costRuns);
        item.put("meanUniqueTests", tests.value());
        item.put("meanGenerationElapsedMs", generationMs.value());
        item.put("meanTestExecutionMs", executionMs.value());
        item.put("meanTotalElapsedMs", totalMs.value());
        item.put("meanBuggyLineCoveragePercent", buggyLine.value());
        item.put("meanFixedLineCoveragePercent", fixedLine.value());
        item.put("meanBuggyBranchCoveragePercent", buggyBranch.value());
        item.put("meanFixedBranchCoveragePercent", fixedBranch.value());
        return item;
    }

    private static Map<String,Object> notCountedEntry(String bug, String kind, Object reason) {
        Map<String,Object> entry = new LinkedHashMap<>();
        entry.put("bug", bug); entry.put("kind", kind);
        String text = reason == null ? "" : String.valueOf(reason).replaceAll("\\s+", " ").trim();
        entry.put("reason", text.length() > 200 ? text.substring(0, 200) + "…" : text);
        return entry;
    }

    /** The first error text recorded for either version of a paired evaluation (compile or run failure). */
    private static Object versionError(Object versions) {
        if (!(versions instanceof Map)) return null;
        for (String side : List.of("b", "f")) {
            Object version = ((Map<?,?>) versions).get(side);
            if (!(version instanceof Map)) continue;
            Object error = ((Map<?,?>) version).get("error");
            if (error != null) return side.equals("b") ? "buggy: " + error : "fixed: " + error;
            if ("ERROR".equals(String.valueOf(((Map<?,?>) version).get("testStatus")))) return (side.equals("b") ? "buggy" : "fixed") + ": test รันไม่สำเร็จ";
        }
        return null;
    }

    private Double versionNumber(Object version, String key) {
        return version instanceof Map ? doubleValue(((Map<?,?>) version).get(key)) : null;
    }

    private void persistCampaign(CampaignState campaign) {
        synchronized (campaign) {
            try {
                Map<String,Object> data = new LinkedHashMap<>();
                data.put("campaignId", campaign.campaignId); data.put("createdAt", campaign.createdAt);
                data.put("projects", campaign.projects); data.put("targets", campaign.targets);
                data.put("models", campaign.models); data.put("algorithms", campaign.algorithms);
                data.put("prompt", campaign.prompt); data.put("source", campaign.source);
                data.put("maxTokens", campaign.maxTokens); data.put("budgetSeconds", campaign.budgetSeconds);
                data.put("algorithmOnly", campaign.algorithmOnly); data.put("onlyUndetected", campaign.onlyUndetected); data.put("algorithmOracle", campaign.algorithmOracle); data.put("aiRepairRounds", campaign.aiRepairRounds); data.put("skippedDone", campaign.skippedDone); data.put("pauseReason", campaign.isPaused() ? campaign.pauseReason : "");
                data.put("currentIndex", campaign.currentIndex); data.put("currentRunId", campaign.currentRunId);
                data.put("status", campaign.status); data.put("paused", campaign.isPaused());
                writeJson(campaign.dir.resolve("campaign.json"), data);
            } catch (IOException | RuntimeException ignored) { }
        }
    }

    private long numberValue(Object value) {
        return value instanceof Number ? ((Number) value).longValue() : 0L;
    }

    private Double coverageValue(Object version, String metric) {
        if (!(version instanceof Map)) return null;
        Object coverage = ((Map<?,?>) version).get("coverage");
        if (!(coverage instanceof Map)) return null;
        Object value = ((Map<?,?>) coverage).get(metric);
        return value instanceof Number ? ((Number) value).doubleValue() : null;
    }

    private List<Map<String,Object>> summarizeTests(List<Map<String,Object>> rows) {
        List<Map<String,Object>> tests = new ArrayList<>();
        for (Map<String,Object> row : rows) {
            Map<String,Object> test = new LinkedHashMap<>();
            test.put("label", row.get("label")); test.put("status", row.get("status") != null ? row.get("status") : row.get("error")); test.put("pending", row.get("pending"));
            test.put("done", !Boolean.TRUE.equals(row.get("pending")));
            Object benchmark = row.get("benchmark");
            if (benchmark instanceof Map) {
                Object detection = ((Map<?,?>) benchmark).get("detection");
                test.put("detection", detection == null ? "NOT_DETERMINED" : detection);
            } else test.put("detection", Boolean.TRUE.equals(row.get("pending")) ? "RUNNING" : "NOT_DETERMINED");
            tests.add(test);
        }
        return tests;
    }

    private List<String> aiNames(List<String> modelIds) {
        List<String> names = new ArrayList<>();
        for (String id : modelIds) names.add(aiProviders.displayName(id));
        return names;
    }

    private List<Map<String,Object>> queuedTests(boolean algorithmOnly, List<String> aiNames, List<String> algorithms) {
        List<Map<String,Object>> tests = new ArrayList<>();
        List<String> labels=new ArrayList<>(aiNames); for(String algorithm:algorithms)labels.add(algorithmLabel(algorithm));
        for (int index = 0; index < labels.size(); index++) {
            String label = labels.get(index);
            Map<String,Object> test = new LinkedHashMap<>();
            boolean skip = algorithmOnly && index < aiNames.size();
            test.put("label", label); test.put("status", skip ? "ข้าม · ไม่เรียก AI" : "queued");
            test.put("pending", !skip); test.put("done", skip); test.put("detection", "NOT_DETERMINED"); tests.add(test);
        }
        return tests;
    }

    private List<Map<String,Object>> failedTests(String message, boolean algorithmOnly, List<String> aiNames, List<String> algorithms) {
        List<Map<String,Object>> tests = queuedTests(algorithmOnly,aiNames,algorithms);
        for (int index = 0; index < tests.size(); index++) {
            Map<String,Object> test = tests.get(index);
            if (algorithmOnly && index < aiNames.size()) continue;
            test.put("status", "error: " + message); test.put("pending", false); test.put("done", true);
        }
        return tests;
    }

    @GetMapping("/campaign")
    public String campaignPage(@RequestParam("campaignId") String campaignId, Model model) {
        CampaignState campaign = campaigns.get(campaignId);
        if (campaign == null) return "redirect:/";
        model.addAttribute("campaignId", campaignId);
        model.addAttribute("status", campaign.status);
        model.addAttribute("paused", campaign.isPaused());
        model.addAttribute("campaignPending", !campaign.isFinished());
        model.addAttribute("skippedDone", campaign.skippedDone);
        model.addAttribute("algorithmOnly", campaign.algorithmOnly);
        model.addAttribute("aiCount", campaign.models.size());
        model.addAttribute("selectedAlgorithmLabels", campaign.algorithms.stream().map(AlgorithmSettingsService::label).collect(java.util.stream.Collectors.joining(" / ")));
        model.addAttribute("targets", campaign.snapshot());
        model.addAttribute("targetCount", campaign.targets.size());
        model.addAttribute("completedCount", campaign.completedCount());
        Path report = campaign.dir.resolve("campaign-summary.json");
        model.addAttribute("summaryUrl", Files.isRegularFile(report)
                ? "/artifact?path=" + encode(outputRoot.relativize(report).toString()) : "");
        return "campaign";
    }

    @GetMapping("/campaign-status")
    @ResponseBody
    public Map<String,Object> campaignStatus(@RequestParam("campaignId") String campaignId) {
        CampaignState campaign = campaigns.get(campaignId);
        if (campaign == null) return Map.of("ok", false, "pending", false, "targets", List.of());
        List<Map<String,Object>> targets = campaign.snapshot();
        for (Map<String,Object> target : targets) {
            if (!"running".equals(String.valueOf(target.get("status")))) continue;
            RunState live = activeRuns.get(String.valueOf(target.getOrDefault("runId", "")));
            if (live != null) target.put("tests", summarizeTests(live.snapshot()));
        }
        Map<String,Object> data = new LinkedHashMap<>();
        data.put("ok", true); data.put("campaignId", campaign.campaignId); data.put("status", campaign.status);
        data.put("algorithmOnly", campaign.algorithmOnly);
        data.put("paused", campaign.isPaused()); data.put("pending", !campaign.isFinished()); data.put("cancelled", campaign.cancelled);
        data.put("pauseReason", campaign.isPaused() ? campaign.pauseReason : "");
        data.put("currentIndex", campaign.currentIndex); data.put("targetCount", campaign.targets.size());
        int completed = campaign.completedCount();
        data.put("completedCount", completed); data.put("targets", targets);
        // Time estimate from the campaign's own pace: elapsed since its first run was created, divided by finished targets
        // (parallel workers and pauses are therefore already included), times the targets still open.
        Instant first = null;
        for (Map<String,Object> target : targets) {
            RunState run = activeRuns.get(String.valueOf(target.getOrDefault("runId", "")));
            if (run == null) continue;
            try { Instant created = Instant.parse(run.createdAt); if (first == null || created.isBefore(first)) first = created; }
            catch (RuntimeException ignored) { }
        }
        if (first != null) {
            long elapsed = Math.max(1, Duration.between(first, Instant.now()).getSeconds());
            data.put("elapsedSeconds", elapsed);
            if (completed > 0) {
                double perTarget = elapsed / (double) completed;
                long remaining = Math.round(perTarget * (campaign.targets.size() - completed));
                data.put("avgSecondsPerTarget", Math.round(perTarget));
                data.put("etaSeconds", campaign.isFinished() ? 0 : remaining);
                data.put("etaAt", campaign.isFinished() ? "" : Instant.now().plusSeconds(remaining).toString());
            }
        }
        return data;
    }

    @PostMapping("/campaign-control")
    @ResponseBody
    public Map<String,Object> campaignControl(@RequestParam("campaignId") String campaignId,
            @RequestParam("action") String action) {
        CampaignState campaign = campaigns.get(campaignId);
        if (campaign == null) return Map.of("ok", false, "message", "ไม่พบ campaign นี้");
        if (campaign.isFinished()) return Map.of("ok", false, "message", campaign.cancelled ? "campaign นี้ถูกยกเลิกแล้ว" : "campaign นี้ทำครบแล้ว");
        if ("cancel".equals(action)) {
            campaign.cancel();
            List<RunState> toCancel = new ArrayList<>();
            synchronized (campaign) {
                for (Map<String,Object> target : campaign.targets) {
                    String s = String.valueOf(target.get("status"));
                    if (s.equals("completed") || s.equals("error") || s.equals("cancelled")) continue;
                    String runId = String.valueOf(target.getOrDefault("runId", ""));
                    RunState run = runId.isBlank() ? null : activeRuns.get(runId);
                    if (run != null && run.isPending()) toCancel.add(run);
                    target.put("status", "cancelled");
                    if (target.get("tests") instanceof List) for (Object test : (List<?>) target.get("tests")) {
                        if (!(test instanceof Map)) continue;
                        @SuppressWarnings("unchecked") Map<String,Object> chip = (Map<String,Object>) test;
                        if (Boolean.TRUE.equals(chip.get("done"))) continue;
                        chip.put("status", "ยกเลิกโดยผู้ใช้"); chip.put("pending", false); chip.put("done", true);
                    }
                }
            }
            for (RunState run : toCancel) cancelRun(run);
            persistCampaign(campaign);
            writeCampaignSummary(campaign);
            return Map.of("ok", true, "cancelled", true, "message", "ยกเลิก campaign แล้ว (ผลที่เสร็จก่อนหน้ายังอยู่ครบ)");
        }
        if ("pause".equals(action)) {
            campaign.pause();
            RunState current = activeRuns.get(campaign.currentRunId);
            if (current != null) { current.pause(); persistMetadata(current); }
            persistCampaign(campaign);
            return Map.of("ok", true, "paused", true);
        }
        if ("resume".equals(action)) {
            campaign.resume();
            campaign.pauseReason = "";
            RunState current = activeRuns.get(campaign.currentRunId);
            if (current != null && current.isPending()) {
                current.resume();
                startRemaining(current, campaign.prompt, campaign.source, campaign.maxTokens, campaign.budgetSeconds);
            }
            campaign.status = "running";
            persistCampaign(campaign);
            launchCampaign(campaign);
            return Map.of("ok", true, "paused", false);
        }
        return Map.of("ok", false, "message", "action ต้องเป็น pause หรือ resume");
    }

    @PostMapping("/generate")
    public String generate(@RequestParam("project") String project, @RequestParam("bugId") String bugId,
            @RequestParam("prompt") String prompt, @RequestParam(value = "buggySource", required = false, defaultValue = "") String buggySource,
            @RequestParam(value = "maxTokens", defaultValue = "0") int maxTokens,
            @RequestParam(value = "budgetSeconds", defaultValue = "60") int budgetSeconds,
            @RequestParam(value = "generationMode", defaultValue = "ai-comparison") String generationMode,
            @RequestParam(value = "algorithmOracle", defaultValue = "buggy") String algorithmOracle,
            @RequestParam(value = "aiRepairRounds", defaultValue = "2") int aiRepairRounds, Model view) {
        boolean algorithmOnly = "algorithms-only".equals(generationMode);
        List<String> models = aiProviders.selectedModelIds();
        view.addAttribute("aiModels", aiProviders.safeList()); view.addAttribute("selectedAiCount", models.size());
        addAlgorithmSelectionAttributes(view, algorithmSettings.getAlgorithms());
        view.addAttribute("prompt", prompt); view.addAttribute("buggySource", buggySource);
        view.addAttribute("project", project); view.addAttribute("bugId", bugId);
        view.addAttribute("hasBatchModel", !algorithmOnly && aiProviders.isBatchSelected());
        view.addAttribute("algorithmOnly", algorithmOnly); view.addAttribute("aiOnly", "ai-only".equals(generationMode));
        String runId = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss-SSS").withZone(ZoneOffset.UTC).format(Instant.now())
                + "-" + UUID.randomUUID().toString().substring(0, 8);
        String safeProject = slug(project), safeBug = slug(bugId);
        Path runDir = outputRoot.resolve("ai-runs").resolve(safeProject + "-" + safeBug).resolve(runId).normalize();
        try {
            if (!project.matches("[A-Za-z][A-Za-z0-9]*") || !bugId.matches("[0-9]+"))
                throw new IllegalArgumentException("Project ต้องเป็น Defects4J ID และ Bug ID ต้องเป็นตัวเลข");
            if (!runDir.startsWith(outputRoot)) throw new IllegalArgumentException("Invalid output location");
            if (!algorithmOnly && prompt.isBlank()) throw new IllegalArgumentException("กรุณาใส่ prompt");
            if (!algorithmOnly && !aiProviders.isReady()) throw new IllegalArgumentException("เลือก AI อย่างน้อยหนึ่งรายการและตรวจ API key ใน Settings ก่อนเริ่ม");
            if (!algorithmOnly) validatePromptTemplate(prompt);
            if (maxTokens != 0 && (maxTokens < 256 || maxTokens > 16000)) throw new IllegalArgumentException("เพดาน output tokens ต้องอยู่ระหว่าง 256-16000 หรือปิด toggle เพื่อใช้ค่า provider");
            if (budgetSeconds < 10 || budgetSeconds > 3600) throw new IllegalArgumentException("algorithm budget ต้องอยู่ระหว่าง 10-3600 วินาที");
            Files.createDirectories(runDir);
            if (!algorithmOnly) {
                Files.writeString(runDir.resolve("system-skill-used.md"), openRouter.getSystemInstruction(), StandardCharsets.UTF_8);
                Files.writeString(runDir.resolve("models.txt"), String.join("\n",models) + "\n", StandardCharsets.UTF_8);
                Files.writeString(runDir.resolve("user-prompt.txt"), prompt, StandardCharsets.UTF_8);
            }
            Files.writeString(runDir.resolve("buggy-source-input.txt"), buggySource == null ? "" : buggySource, StandardCharsets.UTF_8);
            List<String> algorithms = "ai-only".equals(generationMode) ? List.of() : algorithmSettings.getAlgorithms();
            RunState run = new RunState(runId, safeProject, safeBug, runDir, models, algorithms, budgetSeconds, maxTokens);
            assignModelFolders(run);
            run.algorithmOracle = "fixed".equals(algorithmOracle) ? "fixed" : "buggy";
            run.aiRepairRounds = Math.max(0, Math.min(3, aiRepairRounds));
            stampPrompt(run, algorithmOnly ? "" : prompt);
            Map<String,Integer> done = doneRounds();   // before this run is registered, so it does not count itself
            String version = promptVersionOf(prompt);
            activeRuns.put(runId, run);
            for (int i = 0; i < models.size(); i++) {
                Map<String, Object> row = new LinkedHashMap<>();
                String modelId = models.get(i);
                row.put("label", aiProviders.displayName(modelId));
                row.put("model", algorithmOnly ? "not called" : aiProviders.label(modelId));
                row.put("mode", aiProviders.isBatch(modelId) ? "batch" : "direct");
                row.put("pending", !algorithmOnly);
                row.put("ok", false);
                if (algorithmOnly) row.put("mode", "skipped");
                row.put("status", algorithmOnly ? "ข้าม · โหมดไม่เรียก AI" : buggySource.isBlank() ? "กำลังดึง source จาก Defects4J"
                        : (aiProviders.isBatch(modelId) ? "ส่งงานแบบ Batch แล้ว กำลังรอผลจากผู้ให้บริการ (อาจใช้เวลานาน)" : "กำลังรอผลจากโมเดล"));
                run.setInitial(i, row);
            }
            for (int i=0; i<algorithms.size(); i++) initializeAlgorithmRow(run, models.size()+i, algorithms.get(i), budgetSeconds);
            // A method already done for this Project/Bug (same prompt version or budget) is skipped; delete it in History to redo it.
            int needed = 0, skipped = 0;
            for (int i = 0; i < models.size() + algorithms.size(); i++) {
                Map<String,Object> row = run.snapshot().get(i);
                if ("skipped".equals(row.get("mode"))) continue;
                String key = i < models.size()
                        ? aiKey(safeProject, safeBug, aiProviders.displayName(models.get(i)), versionKey(version, run.aiRepairRounds))
                        : algorithmKey(safeProject, safeBug, algorithms.get(i - models.size()), budgetSeconds, run.algorithmOracle);
                if (done.getOrDefault(key, 0) >= 1) { markAlreadyDone(row); run.setInitial(i, row); skipped++; }
                else needed++;
            }
            if (needed == 0) {
                activeRuns.remove(runId, run);
                deleteTree(runDir);
                throw new IllegalStateException(project + "-" + bugId + " ทำครบแล้วสำหรับทุกวิธีที่เลือก (" + skipped
                        + " งาน) · ถ้าต้องการรันใหม่ ให้ลบรายการเดิมที่หน้าประวัติ หรือเพิ่มจำนวนรอบ");
            }
            persistMetadata(run);
            startRemaining(run, prompt, buggySource, maxTokens, budgetSeconds);
            return "redirect:/run?runId=" + encode(runId);
        } catch (Exception e) {
            view.addAttribute("error", e.getMessage());
            view.addAttribute("aiModels", aiProviders.safeList()); view.addAttribute("selectedAiCount", models.size());
        }
        view.addAttribute("apiReady", aiProviders.isReady());
        return "index";
    }

    private void prepareAndStart(RunState run, String prompt, String suppliedSource, int maxTokens, int budgetSeconds) {
        try {
            run.awaitRunning();
            boolean aiEnabled = run.snapshot().subList(0, run.models.size()).stream()
                    .anyMatch(row -> !"skipped".equals(row.get("mode")));
            String completedPrompt = "";
            boolean aiPrepared = true;
            if (aiEnabled) {
                try {
                    // The source always comes from Defects4J (the version the template asks for), never from the browser form.
                    String version = sourceVersion(prompt);
                    run.aiSourceVersion = "f".equals(version) ? "fixed" : "buggy";
                    Path saved = run.runDir.resolve(Defects4jRunner.sourceFileName(version));
                    String source = Files.isRegularFile(saved) ? Files.readString(saved, StandardCharsets.UTF_8)
                            : defects4jRunner.extractSource(run.project, run.bugId, version, run.runDir, progress -> {
                                for(int i=0;i<run.models.size();i++)updateProgress(run,i,progress);
                            });
                    String promptSource = source;
                    Files.writeString(run.runDir.resolve(run.aiSourceVersion + "-source-prompt.txt"), promptSource, StandardCharsets.UTF_8);
                    completedPrompt = composePrompt(prompt, promptSource, run.project, run.bugId);
                    Files.writeString(run.runDir.resolve("prompt-used.txt"), completedPrompt, StandardCharsets.UTF_8);
                    persistMetadata(run);
                } catch (Exception e) {
                    // Only the AI rows depend on the prompt and source; the algorithms below must still run.
                    failPendingRows(run, 0, run.models.size(), e.getMessage() == null ? "เตรียม Defects4J source ไม่สำเร็จ" : e.getMessage());
                    aiPrepared = false;
                }
            } else if (!Files.isRegularFile(run.runDir.resolve("prompt-used.txt"))) {
                // No AI in this run: still save the prompt an AI would get for this bug, so it can be reused elsewhere.
                try {
                    String template = prompt;
                    try { validatePromptTemplate(template); }
                    catch (RuntimeException invalid) { template = Files.readString(promptTemplate, StandardCharsets.UTF_8); }
                    Path work = Files.createTempDirectory("testbench-run-prompt-");
                    try {
                        String source = defects4jRunner.extractSourceNow(run.project, run.bugId, sourceVersion(template), work);
                        String text = composePrompt(template, source, run.project, run.bugId);
                        Files.writeString(run.runDir.resolve("prompt-used.txt"), text, StandardCharsets.UTF_8);
                        Files.writeString(run.runDir.resolve("system-skill-used.md"), openRouter.getSystemInstruction(), StandardCharsets.UTF_8);
                    } finally { deleteTree(work); }
                } catch (Exception e) {
                    LOG.warn("Could not save the prompt of run {} ({}-{}): {}", run.runId, run.project, run.bugId, e.toString());
                }
            }
            final String promptForModels = completedPrompt;
            for (int i = 0; i < run.models.size() && aiPrepared; i++) {
                final int index = i;
                if ("skipped".equals(run.snapshot().get(index).get("mode"))) continue;
                if (!modelCompleted(run, index)) generationPool.submit(() -> {
                    if (!run.claim(index)) return;
                    try { executeModel(run, index, run.models.get(index), promptForModels, maxTokens); }
                    finally { run.release(index); }
                });
            }
            for (int i = 0; i < run.algorithms.size(); i++) {
                final int index = i + run.models.size();
                String algorithm = run.algorithms.get(i);
                if ("skipped".equals(run.snapshot().get(index).get("mode"))) continue;
                if (!algorithmCompleted(run, index)) algorithmPool.submit(() -> {
                    if (!run.claim(index)) return;
                    try { executeAlgorithm(run, index, algorithm, budgetSeconds); }
                    finally { run.release(index); }
                });
            }
        } catch (Exception e) {
            failPendingRows(run, 0, run.models.size() + run.algorithms.size(),
                    e.getMessage() == null ? "เตรียมการทดลองไม่สำเร็จ" : e.getMessage());
        }
    }

    private void failPendingRows(RunState run, int from, int to, String error) {
        for (int i = from; i < to; i++) {
            Map<String, Object> row = run.snapshot().get(i);
            if (!Boolean.TRUE.equals(row.get("pending"))) continue;
            row.put("pending", false); row.put("ok", false); row.put("error", error); row.put("status", error);
            run.complete(i, row);
        }
        persistMetadata(run);
    }

    private void startRemaining(RunState run, String prompt, String source, int maxTokens, int budgetSeconds) {
        if (!run.beginDispatch(() -> startRemaining(run, prompt, source, maxTokens, budgetSeconds))) return;
        generationPool.submit(() -> {
            try { prepareAndStart(run, prompt, source, maxTokens, budgetSeconds); }
            finally {
                Runnable deferred = run.endDispatch();
                if (deferred != null) deferred.run();
            }
        });
    }

    /** AI failures also go to the server log, so the reason survives even when the run is deleted from History. */
    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(GenerationController.class);

    private static final Pattern QUOTA_ERROR = Pattern.compile(
            "(?i)(HTTP 402|HTTP 429|\\b402\\b|insufficient[ _]?(credits?|quota|balance|funds)|credit|quota|rate[ -]?limit|RESOURCE_EXHAUSTED|too many requests|billing|overloaded)");

    /**
     * Output budget of a follow-up round (repair, untested methods, reference repair). The reply is the same class again,
     * so it is about the size of the class sent (~3 characters per token); a reply many times longer is a model that lost
     * the thread (65k tokens of repetition were seen) and only costs money and compile time. Never above the run's limit.
     */
    static int followUpTokenCap(String javaText, int maxTokens) {
        int cap = Math.min(48000, Math.max(8000, javaText.length() / 3 * 2 + 2000));
        return maxTokens > 0 ? Math.min(maxTokens, cap) : cap;
    }

    /** True when the provider stopped the reply at the output limit (finish_reason "length"): the class is cut off. */
    static boolean truncated(AiProviderService.ProviderResult result) {
        return result.rawResponse != null
                && "length".equals(result.rawResponse.path("choices").path(0).path("finish_reason").asText(""));
    }

    /** Errors meaning "the provider will not serve now" (rate limit, no credit), as opposed to a failure of the request itself. */
    static boolean isQuotaError(String message) {
        return message != null && QUOTA_ERROR.matcher(message).find();
    }

    private CampaignState campaignOf(String runId) {
        for (CampaignState campaign : campaigns.values())
            for (Map<String,Object> target : campaign.snapshot())
                if (runId.equals(String.valueOf(target.getOrDefault("runId", "")))) return campaign;
        return null;
    }

    private void pauseForQuota(RunState run, String reason) {
        run.pause();
        run.pauseReason = reason;
        CampaignState campaign = campaignOf(run.runId);
        if (campaign != null && !campaign.isFinished()) {
            synchronized (campaign) { campaign.pause(); campaign.pauseReason = reason; }
            persistCampaign(campaign);
        }
    }

    /** " · คำตอบถูกตัด…" when the provider stopped at the output-token limit (reasoning can use most of it), else "". */
    private String outputLimitNote(Path responseJson, int maxTokens) {
        try {
            if (!Files.isRegularFile(responseJson)) return "";
            JsonNode response = mapper.readTree(responseJson.toFile());
            // Some providers keep only the usage block (no finish_reason): an answer that used exactly the limit was cut off.
            JsonNode usage = response.has("usage") ? response.path("usage") : response;
            int output = usage.path("completion_tokens").asInt(-1);
            boolean cut = "length".equals(response.path("choices").path(0).path("finish_reason").asText(""))
                    || (maxTokens > 0 && output >= maxTokens);
            if (!cut) return "";
            int reasoning = usage.path("completion_tokens_details").path("reasoning_tokens").asInt(-1);
            return " · คำตอบถูกตัดเพราะชนเพดาน output tokens (" + output + " tokens" + (reasoning > 0 ? ", เป็นการคิด " + reasoning : "")
                    + ") · ดูใน response.md ว่า AI ตอบวนซ้ำหรือคิดนานเกิน · เพิ่มเพดานหรือลด reasoning effort";
        } catch (Exception e) { return ""; }
    }

    static final String ALREADY_DONE = "ข้าม · ทำครบตามจำนวนรอบแล้ว";

    private static final String ALREADY_DETECTED = "ข้าม · ตรวจพบแล้วในรอบก่อน";

    private static void markAlreadyDone(Map<String,Object> row) {
        row.put("mode", "skipped"); row.put("alreadyDone", true); row.put("pending", false); row.put("ok", false);
        row.put("status", ALREADY_DONE);
    }

    @SuppressWarnings("unchecked")
    private static List<Integer> indexList(Object value) {
        List<Integer> out = new ArrayList<>();
        if (value instanceof List) for (Object item : (List<Object>) value) if (item instanceof Number) out.add(((Number) item).intValue());
        return out;
    }

    /**
     * The version whose saved template text equals this template: the current prompts/Master_Prompt.md (version in
     * prompt-version.txt) or one of prompts/versions/Master_Prompt.vN.md. A campaign keeps the template it started with, so its
     * later runs are labelled with that version even after the current prompt changed; an edited template is "custom".
     */
    private String promptVersionOf(String template) {
        String saved = savedVersionOf(template);
        if (saved != null) return saved;
        try {
            Path current = promptTemplate;
            if (Files.isRegularFile(current) && normalizedPrompt(Files.readString(current, StandardCharsets.UTF_8)).equals(normalizedPrompt(template))) return currentPromptVersion();
        } catch (IOException ignored) { }
        return "custom";
    }

    /** The saved prompts/versions/Master_Prompt.vN.md whose text equals this template, or null. */
    private String savedVersionOf(String template) {
        String wanted = normalizedPrompt(template);
        for (int n : savedPromptVersionNumbers()) {
            try {
                Path file = Paths.get("prompts/versions/Master_Prompt.v" + n + ".md").toAbsolutePath().normalize();
                if (normalizedPrompt(Files.readString(file, StandardCharsets.UTF_8)).equals(wanted)) return "v" + n;
            } catch (IOException ignored) { }
        }
        return null;
    }

    /** A browser form sends CRLF line endings; versions are compared on the text only. */
    private static String normalizedPrompt(String text) {
        return text == null ? "" : text.replace("\r\n", "\n").replace('\r', '\n').strip();
    }

    private String currentPromptVersion() {
        try {
            Path file = Paths.get("prompts/prompt-version.txt").toAbsolutePath().normalize();
            if (Files.isRegularFile(file)) return Files.readString(file, StandardCharsets.UTF_8).trim();
        } catch (IOException ignored) { }
        return "unversioned";
    }

    /** AI results count separately per prompt version and per number of allowed compile-repair rounds. */
    private static String versionKey(String promptVersion, int repairRounds) { return repairRounds > 0 ? promptVersion + "+r" + repairRounds : promptVersion; }

    private static String aiKey(String project, String bug, String aiName, String promptVersion) {
        return "ai\t" + project + "\t" + bug + "\t" + aiName + "\t" + promptVersion;
    }

    private static String algorithmKey(String project, String bug, String algorithm, int budgetSeconds, String oracle) {
        return "alg\t" + project + "\t" + bug + "\t" + algorithm + "\t" + budgetSeconds + "\t" + oracle;
    }

    /**
     * Rounds of every Project/Bug/method that are done or still running, over all saved runs (a deleted run no longer counts).
     * AI: per AI name and prompt version; algorithm: per algorithm, budget and oracle. Cancelled rows, "already done" rows and
     * failures of the system or provider (no answer saved, dead search worker) do not count, so they are run again.
     */
    private Map<String,Integer> doneRounds() {
        Map<String,Integer> done = new java.util.HashMap<>();
        for (RunState run : activeRuns.values()) {
            List<Map<String,Object>> rows = run.snapshot();
            for (int i = 0; i < rows.size(); i++) {
                Map<String,Object> row = rows.get(i);
                if (row == null || "skipped".equals(row.get("mode")) || Boolean.TRUE.equals(row.get("cancelled"))) continue;
                if (String.valueOf(row.get("status")).contains("ยกเลิก")) continue;
                boolean running = Boolean.TRUE.equals(row.get("pending"));
                String key;
                if (i < run.models.size()) {
                    if (!running && !modelCompleted(run, i)) continue;
                    key = aiKey(run.project, run.bugId, String.valueOf(row.get("label")), versionKey(run.promptVersion, run.aiRepairRounds));
                } else if (i - run.models.size() < run.algorithms.size()) {
                    if (!running && !algorithmCompleted(run, i)) continue;
                    key = algorithmKey(run.project, run.bugId, run.algorithms.get(i - run.models.size()), run.budgetSeconds, run.algorithmOracle);
                } else continue;
                done.merge(key, 1, Integer::sum);
            }
        }
        return done;
    }

    /** Keys (same form as doneRounds) of every AI/algorithm result that detected its bug. */
    private Set<String> detectedKeys() {
        Set<String> detected = new HashSet<>();
        for (RunState run : activeRuns.values()) {
            List<Map<String,Object>> rows = run.snapshot();
            for (int i = 0; i < rows.size(); i++) {
                Map<String,Object> row = rows.get(i);
                if (row == null || !(row.get("benchmark") instanceof Map)) continue;
                if (!"BUGGY_FAIL_FIXED_PASS".equals(((Map<?,?>) row.get("benchmark")).get("detection"))) continue;
                if (i < run.models.size())
                    detected.add(aiKey(run.project, run.bugId, String.valueOf(row.get("label")), versionKey(run.promptVersion, run.aiRepairRounds)));
                else if (i - run.models.size() < run.algorithms.size())
                    detected.add(algorithmKey(run.project, run.bugId, run.algorithms.get(i - run.models.size()), run.budgetSeconds, run.algorithmOracle));
            }
        }
        return detected;
    }

    private boolean modelCompleted(RunState run, int index) {
        Map<String,Object> row = run.snapshot().get(index);
        return !Boolean.TRUE.equals(row.get("pending"))
                && (Boolean.TRUE.equals(row.get("ok")) || Boolean.TRUE.equals(row.get("invalidOutput")));
    }

    private boolean algorithmCompleted(RunState run, int index) {
        Map<String,Object> row = run.snapshot().get(index);
        Object value = row.get("benchmark");
        if (Boolean.TRUE.equals(row.get("pending")) || !(value instanceof Map)) return false;
        Object status = ((Map<?,?>) value).get("status");
        Object error = ((Map<?,?>) value).get("error");
        // A dead search worker (killed with the app, out of memory...) is an interruption, not a verdict: run it again on resume.
        if ("ERROR".equals(status) && error != null && String.valueOf(error).contains("Generic fitness worker")) return false;
        // Every other ERROR is terminal: a resume must not repeat a known unsupported-API failure; start a fresh run instead.
        return "COMPLETED".equals(status) || "ERROR".equals(status);
    }

    private void updateProgress(RunState run, int index, String status) {
        run.awaitRunning();
        Map<String, Object> row = run.snapshot().get(index);
        // A row skipped as already done (or not called) stays finished: re-marking it pending would leave the run open forever.
        if ("skipped".equals(row.get("mode"))) return;
        row.put("status", status); row.put("pending", true);
        addActivity(row, status);
        run.complete(index, row);
        persistMetadata(run);
    }

    private void publishProgress(RunState run, int index, Map<String,Object> row, String status, AtomicLong lastLoggedAt) {
        run.awaitRunning();
        row.put("status", status); row.put("pending", true);
        long now = System.currentTimeMillis();
        boolean candidate = status.startsWith("ประเมิน #");
        if (candidate && now - lastLoggedAt.get() < 1000) return;
        boolean log = true;
        if (log) { addActivity(row, status); lastLoggedAt.set(now); }
        run.complete(index, row);
        if (log) persistMetadata(run);
    }

    @SuppressWarnings("unchecked")
    private static void addActivity(Map<String,Object> row, String message) {
        Object value = row.get("activity");
        List<Map<String,Object>> activity = value instanceof List ? (List<Map<String,Object>>) value : new ArrayList<>();
        if (value != activity) row.put("activity", activity);
        Map<String,Object> event = new LinkedHashMap<>();
        event.put("at", Instant.now().toString()); event.put("message", message);
        activity.add(event);
        while (activity.size() > 40) activity.remove(0);
    }

    private void initializeAlgorithmRow(RunState run, int index, String algorithm, int budgetSeconds) {
        Map<String, Object> row = new LinkedHashMap<>();
        row.put("label", algorithmLabel(algorithm));
        row.put("model", algorithm);
        row.put("mode", "algorithm");
        row.put("pending", true);
        row.put("ok", false);
        row.put("status", "รอสร้าง test suite (budget " + budgetSeconds + "s)");
        row.put("activity", new ArrayList<Map<String,Object>>());
        run.setInitial(index, row);
    }

    private void executeAlgorithm(RunState run, int index, String algorithm, int budgetSeconds) {
        String label = algorithmLabel(algorithm);
        Path modelDir = run.runDir.resolve("algorithm-" + algorithm);
        Map<String, Object> row = new LinkedHashMap<>();
        row.put("label", label); row.put("model", algorithm); row.put("mode", "algorithm");
        row.put("pending", true); row.put("ok", false);
        Object previousActivity = run.snapshot().get(index).get("activity");
        row.put("activity", previousActivity instanceof List ? new ArrayList<>((List<?>) previousActivity) : new ArrayList<Map<String,Object>>());
        AtomicLong lastLoggedAt = new AtomicLong(0);
        try {
            run.awaitRunning();
            Files.createDirectories(modelDir);
            Path savedBenchmark = benchmarkPath(modelDir);
            Map<String, Object> benchmark;
            if (Files.isRegularFile(savedBenchmark)) {
                @SuppressWarnings("unchecked")
                Map<String, Object> saved = mapper.readValue(savedBenchmark.toFile(), Map.class);
                if ("COMPLETED".equals(saved.get("status"))) benchmark = saved;
                else benchmark = defects4jRunner.generateAlgorithm(run.project, run.bugId,
                        algorithm, budgetSeconds, run.repetition, run.algorithmOracle, modelDir, progress -> {
                            publishProgress(run, index, row, progress, lastLoggedAt);
                        });
            } else benchmark = defects4jRunner.generateAlgorithm(run.project, run.bugId,
                    algorithm, budgetSeconds, run.repetition, run.algorithmOracle, modelDir, progress -> {
                        publishProgress(run, index, row, progress, lastLoggedAt);
                    });
            row.put("benchmark", benchmark);
            row.put("benchmarkUrl", "/artifact?path=" + encode(outputRoot.relativize(savedBenchmark).toString()));
            Object archive = benchmark.get("testSuiteArchive");
            if (archive != null) row.put("suiteArchiveUrl", "/artifact?path=" + encode(outputRoot.relativize(modelDir.resolve(archive.toString())).toString()));
            row.put("elapsedMs", benchmark.get("generationElapsedMs"));
            row.put("status", "ERROR".equals(benchmark.get("status"))
                    ? ("ยกเลิกโดยผู้ใช้".equals(String.valueOf(benchmark.get("error"))) ? "ยกเลิกโดยผู้ใช้" : "สร้าง test suite ไม่สำเร็จ: " + benchmark.get("error"))
                    : "Defects4J: " + (benchmark.get("detection") == null ? "NOT_DETERMINED" : benchmark.get("detection")));
            row.put("ok", "COMPLETED".equals(benchmark.get("status")));
        } catch (Throwable e) {
            boolean cancelled = e instanceof RunCancelledException || run.isCancelled();
            String error = cancelled ? "ยกเลิกโดยผู้ใช้" : (e.getMessage() == null ? "สร้าง/รัน algorithm test ไม่สำเร็จ" : e.getMessage());
            if (cancelled) row.put("cancelled", true);
            row.put("error", error); row.put("status", error); addActivity(row, label + (cancelled ? " ถูกยกเลิก" : " หยุดด้วย error · " + error));
        }
        row.put("pending", false);
        run.complete(index, row);
        persistMetadata(run);
    }

    private void executeModel(RunState run, int index, String modelId, String prompt, int maxTokens) {
        Instant started = Instant.now();
        Map<String, Object> previous = run.snapshot().get(index);
        Map<String, Object> row = new LinkedHashMap<>();
        row.put("label", aiProviders.displayName(modelId));
        row.put("model", aiProviders.label(modelId));
        row.put("mode", aiProviders.isBatch(modelId) ? "batch" : "direct");
        row.put("pending", true);
        row.put("status", "ส่ง prompt พร้อม source ให้โมเดลแล้ว");
        Object oldActivity = previous.get("activity");
        row.put("activity", oldActivity instanceof List ? new ArrayList<>((List<?>) oldActivity) : new ArrayList<Map<String,Object>>());
        AtomicLong lastLoggedAt = new AtomicLong(0);
        Path sourceShown = sourceShownFile(run.runDir);
        row.put("buggySourceUrl", "/artifact?path=" + encode(outputRoot.relativize(sourceShown).toString()));
        row.put("promptUsedUrl", "/artifact?path=" + encode(outputRoot.relativize(run.runDir.resolve("prompt-used.txt")).toString()));
        addActivity(row, "เตรียมคำขอ · AI: " + aiProviders.displayName(modelId) + " · prompt ที่ประกอบแล้ว " + prompt.length() + " ตัวอักษร · " + (maxTokens > 0 ? "กำหนด output limit " + maxTokens + " tokens" : "ใช้ output limit ตาม provider/model"));
        run.complete(index, row);
        persistMetadata(run);
        try {
            run.awaitRunning();
            String folder = run.modelFolders.get(index);
            Path modelDir = run.runDir.resolve(folder);
            Files.createDirectories(modelDir);
            Path generatedDir = modelDir.resolve("generated/original");
            Files.createDirectories(generatedDir);
            Path responseFile = generatedDir.resolve("response.md");
            Path legacyResponse = modelDir.resolve("response.md");
            if (!Files.isRegularFile(responseFile) && Files.isRegularFile(legacyResponse)) {
                // Reuse old-run output after upgrading the artifact layout; never make a duplicate paid call.
                Files.copy(legacyResponse, responseFile);
                Path legacyJson = modelDir.resolve("response.json");
                Path responseJson = generatedDir.resolve("response.json");
                if (Files.isRegularFile(legacyJson) && !Files.exists(responseJson)) Files.copy(legacyJson, responseJson);
            }
            AiProviderService.ProviderResult result = null;
            String content;
            if (Files.isRegularFile(responseFile)) {
                // A prior process may have stopped after receiving the model response. Reuse it
                // so resuming a run does not issue a second paid request.
                content = Files.readString(responseFile, StandardCharsets.UTF_8);
                // Keep the recorded usage of the saved response, but not stale errors or the failed attempt's timing.
                for (String key : List.of("promptTokens", "completionTokens", "cost", "actualModel", "generationId", "batchId", "outputTokensPerSecond"))
                    if (previous.containsKey(key)) row.put(key, previous.get(key));
                if (previous.get("error") == null && previous.containsKey("elapsedMs")) row.put("elapsedMs", previous.get("elapsedMs"));
                row.put("pending", true);
            } else {
                row.put("waitingSince", System.currentTimeMillis());
                row.put("status", "ส่งคำขอไปยัง provider แล้ว · รอผล inference; ระบบไม่สามารถเห็น reasoning ภายในโมเดลได้");
                addActivity(row, "ส่งคำขอแล้ว · กำลังรอ provider ตอบกลับ (โมเดลไม่ส่ง token stream ให้ระบบนี้)");
                run.complete(index, row);
                persistMetadata(run);
                OpenRouterService.BATCH_PROGRESS.set(line -> {
                    addActivity(row, line);
                    row.put("status", "Batch · " + line);
                    run.complete(index, row);
                });
                try { result = aiProviders.generate(modelId, prompt, maxTokens); }
                finally { OpenRouterService.BATCH_PROGRESS.remove(); }
                content = result.content;
                row.remove("waitingSince");
                addActivity(row, "ได้รับคำตอบแล้ว · input/output " + result.promptTokens + "/" + result.completionTokens + " tokens · ใช้เวลา " + result.elapsedMs + " ms");
                Files.writeString(responseFile, content, StandardCharsets.UTF_8);
                mapper.writerWithDefaultPrettyPrinter().writeValue(generatedDir.resolve("response.json").toFile(), result.rawResponse);
            }
            String javaText = extractJava(content);
            // Untested-methods round: the public methods of the class under test that the first answer never calls are listed
            // and the same AI extends its class once (the defect may sit in any of them). Static view of the reference source
            // only; the extended class then goes through the usual compile repair, salvage and evaluation.
            long repairPromptTokens = 0, repairCompletionTokens = 0, repairElapsedMs = 0; double repairCost = 0; boolean repairCalled = false;
            if (run.aiRepairRounds > 0 && !javaText.isBlank() && !run.aiSourceVersion.isBlank()) {
                List<String> untested = untestedPublicMethods(prompt, javaText);
                row.put("untestedMethods", untested.size());
                // The first request already lists every public method (v17+): the extra round is worth its tokens only when
                // several of them are still untouched.
                if (untested.size() > UNTESTED_ROUND_THRESHOLD) {
                    Path extDir = modelDir.resolve("generated/untested-methods");
                    Files.createDirectories(extDir);
                    Files.write(extDir.resolve("untested.txt"), untested, StandardCharsets.UTF_8);
                    String extPrompt = composeUntestedPrompt(prompt, javaText, String.join("\n", untested));
                    Files.writeString(extDir.resolve("prompt.txt"), OpenRouterService.flatten(extPrompt), StandardCharsets.UTF_8);
                    Files.copy(untestedTemplate, run.runDir.resolve("untested-methods-prompt-used.md"), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                    row.put("status", untested.size() + " public method ยังไม่มี test · ให้ AI เขียนเพิ่ม 1 รอบ");
                    addActivity(row, untested.size() + " public method ของคลาสยังไม่ถูกเรียกใน test · ส่งรายการให้ AI เขียน test เพิ่ม 1 รอบ");
                    run.complete(index, row); persistMetadata(run);
                    Path extResponse = extDir.resolve("response.md");
                    String extContent;
                    if (Files.isRegularFile(extResponse)) extContent = Files.readString(extResponse, StandardCharsets.UTF_8);
                    else {
                        run.awaitRunning();
                        AiProviderService.ProviderResult ext = aiProviders.generate(modelId, extPrompt, followUpTokenCap(javaText, maxTokens));
                        repairCalled = true;
                        extContent = truncated(ext) ? "" : ext.content;
                        if (truncated(ext)) addActivity(row, "คำตอบรอบเพิ่ม test ถูกตัดที่ขีดจำกัด output (" + ext.completionTokens + " tokens) · ใช้ class เดิม");
                        Files.writeString(extResponse, extContent, StandardCharsets.UTF_8);
                        mapper.writerWithDefaultPrettyPrinter().writeValue(extDir.resolve("response.json").toFile(), ext.rawResponse);
                        repairPromptTokens += Math.max(0, ext.promptTokens); repairCompletionTokens += Math.max(0, ext.completionTokens);
                        if (!Double.isNaN(ext.cost)) repairCost += ext.cost;
                        repairElapsedMs += ext.elapsedMs;
                    }
                    String extended = extractJava(extContent);
                    int before = countTests(javaText), after = countTests(extended);
                    if (extended.isBlank() || after < before) addActivity(row, "คำตอบรอบเพิ่ม test ใช้ไม่ได้ (" + after + " test) · ใช้ class เดิม " + before + " test");
                    else { javaText = extended; row.put("extendedTests", after - before); Files.writeString(extDir.resolve("extended.java"), javaText, StandardCharsets.UTF_8);
                        addActivity(row, "ได้ class ที่ขยายแล้ว " + after + " test (+" + (after - before) + ")"); }
                }
            }
            // Compile-repair rounds: the class is compiled against the version the AI was given; when javac reports errors the
            // same AI gets its class and those errors and may correct it. Nothing about test results or the other version is sent.
            if (run.aiRepairRounds > 0 && !javaText.isBlank() && !run.aiSourceVersion.isBlank()) {
                Path checkDir = modelDir.resolve("evaluation/compile-check");
                String version = "fixed".equals(run.aiSourceVersion) ? "f" : "b";
                try {
                    int used = 0;
                    String compileStatus = "OK";
                    String lastErrors = "";
                    for (int round = 1; ; round++) {
                        Path roundDir = modelDir.resolve("generated/repair-" + round);
                        Path roundResponse = roundDir.resolve("response.md");
                        String roundContent;
                        if (Files.isRegularFile(roundResponse)) roundContent = Files.readString(roundResponse, StandardCharsets.UTF_8);   // resumed run
                        else {
                            run.awaitRunning();
                            String errors = defects4jRunner.compileErrors(run.project, run.bugId, version, javaText, checkDir,
                                    progress -> publishProgress(run, index, row, progress, lastLoggedAt));
                            lastErrors = errors;
                            if (errors.isEmpty()) { compileStatus = "OK"; break; }
                            compileStatus = "ERRORS";
                            if (round > run.aiRepairRounds) break;
                            Files.createDirectories(roundDir);
                            Files.writeString(roundDir.resolve("compile-errors.txt"), errors, StandardCharsets.UTF_8);
                            String repairPrompt = composeRepairPrompt(prompt, javaText, errors);
                            // Both AI rows of a run may reach this at once: copying with REPLACE_EXISTING never throws for the second.
                            Files.copy(repairTemplate, run.runDir.resolve("repair-prompt-used.md"), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                            row.put("repairPromptVersion", repairPromptVersion());
                            Files.writeString(roundDir.resolve("prompt.txt"), OpenRouterService.flatten(repairPrompt), StandardCharsets.UTF_8);
                            int errorCount = errors.split("error:", -1).length - 1;
                            row.put("status", "คอมไพล์ไม่ผ่าน (" + errorCount + " errors) · ให้ AI แก้รอบที่ " + round + "/" + run.aiRepairRounds);
                            addActivity(row, "คอมไพล์ไม่ผ่าน " + errorCount + " errors · ส่ง error ของคอมไพเลอร์ให้ AI แก้ รอบที่ " + round + "/" + run.aiRepairRounds);
                            run.complete(index, row);
                            persistMetadata(run);
                            AiProviderService.ProviderResult repair = aiProviders.generate(modelId, repairPrompt, followUpTokenCap(javaText, maxTokens));
                            repairCalled = true;
                            // A reply cut off at the output limit is not a class: compiling and salvaging it would only burn minutes.
                            roundContent = truncated(repair) ? "" : repair.content;
                            if (truncated(repair)) addActivity(row, "คำตอบรอบแก้ที่ " + round + " ถูกตัดที่ขีดจำกัด output (" + repair.completionTokens + " tokens)");
                            Files.writeString(roundResponse, roundContent, StandardCharsets.UTF_8);
                            mapper.writerWithDefaultPrettyPrinter().writeValue(roundDir.resolve("response.json").toFile(), repair.rawResponse);
                            repairPromptTokens += Math.max(0, repair.promptTokens); repairCompletionTokens += Math.max(0, repair.completionTokens);
                            if (!Double.isNaN(repair.cost)) repairCost += repair.cost;
                            repairElapsedMs += repair.elapsedMs;
                            addActivity(row, "ได้คำตอบรอบแก้ที่ " + round + " · input/output " + repair.promptTokens + "/" + repair.completionTokens + " tokens · " + repair.elapsedMs + " ms");
                        }
                        String corrected = extractJava(roundContent);
                        if (corrected.isBlank()) { addActivity(row, "คำตอบรอบแก้ที่ " + round + " ไม่มี Java test class · ใช้ class เดิม"); break; }
                        javaText = corrected;
                        used = round;
                        Files.writeString(roundDir.resolve("corrected.java"), javaText, StandardCharsets.UTF_8);
                    }
                    // Salvage: when the AI could not make the class compile, drop the members javac points at (one test
                    // method, a helper class, an import) and compile again, a few times. The compiling remainder is evaluated;
                    // what was dropped simply counts as tests the AI did not produce.
                    if ("ERRORS".equals(compileStatus) && !lastErrors.isBlank()) {
                        int before = countTests(javaText), passes = 0;
                        for (int pass = 1; pass <= 5; pass++) {
                            String pruned = Defects4jRunner.salvage(javaText, lastErrors);
                            if (pruned == null || pruned.equals(javaText)) break;
                            javaText = pruned; passes = pass;
                            if (countTests(javaText) == 0) break;
                            run.awaitRunning();
                            lastErrors = defects4jRunner.compileErrors(run.project, run.bugId, version, javaText, checkDir,
                                    progress -> publishProgress(run, index, row, progress, lastLoggedAt));
                            if (lastErrors.isEmpty()) { compileStatus = "SALVAGED"; break; }
                        }
                        int after = countTests(javaText);
                        if (passes > 0) {
                            Files.writeString(modelDir.resolve("generated/salvaged.java"), javaText, StandardCharsets.UTF_8);
                            row.put("salvagedTests", after); row.put("droppedTests", before - after);
                            addActivity(row, ("SALVAGED".equals(compileStatus) ? "ตัด test ที่คอมไพล์ไม่ผ่านออก " : "ตัด test ที่คอมไพล์ไม่ผ่านออกแล้วยังไม่ผ่าน ")
                                    + (before - after) + " จาก " + before + " · เหลือ " + after + " test (" + passes + " รอบ)");
                        }
                        if (after == 0) javaText = "";
                    }
                    // Reference-repair round: the class compiles, but some tests may fail on the reference version itself (a
                    // wrong expectation or setup). Those failures are sent back once; a corrected class replaces the old one only
                    // if it still compiles. Only the reference version is run here - nothing from the other version is used.
                    if (!javaText.isBlank() && ("OK".equals(compileStatus) || "SALVAGED".equals(compileStatus))) {
                        run.awaitRunning();
                        String failures = defects4jRunner.referenceFailures(run.project, run.bugId, version, javaText, checkDir,
                                progress -> publishProgress(run, index, row, progress, lastLoggedAt));
                        Path refDir = modelDir.resolve("generated/reference-repair");
                        if (!failures.isEmpty()) {
                            Files.createDirectories(refDir);
                            Files.writeString(refDir.resolve("failures.txt"), failures, StandardCharsets.UTF_8);
                            int failing = failures.split("\n").length;
                            row.put("referenceFailures", failing);
                            String refPrompt = composeReferenceRepairPrompt(prompt, javaText, failures);
                            Files.writeString(refDir.resolve("prompt.txt"), OpenRouterService.flatten(refPrompt), StandardCharsets.UTF_8);
                            Files.copy(referenceRepairTemplate, run.runDir.resolve("reference-repair-prompt-used.md"), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                            row.put("status", failing + " test ไม่ผ่านบนเวอร์ชันอ้างอิง · ให้ AI แก้ 1 รอบ");
                            addActivity(row, failing + " test ไม่ผ่านบนเวอร์ชันอ้างอิง · ส่งชื่อ test และข้อความ assertion ให้ AI แก้ 1 รอบ");
                            run.complete(index, row); persistMetadata(run);
                            Path refResponse = refDir.resolve("response.md");
                            String refContent;
                            if (Files.isRegularFile(refResponse)) refContent = Files.readString(refResponse, StandardCharsets.UTF_8);
                            else {
                                AiProviderService.ProviderResult fix = aiProviders.generate(modelId, refPrompt, followUpTokenCap(javaText, maxTokens));
                                repairCalled = true;
                                refContent = truncated(fix) ? "" : fix.content;
                                if (truncated(fix)) addActivity(row, "คำตอบรอบแก้ test ที่ล้มถูกตัดที่ขีดจำกัด output (" + fix.completionTokens + " tokens)");
                                Files.writeString(refResponse, refContent, StandardCharsets.UTF_8);
                                mapper.writerWithDefaultPrettyPrinter().writeValue(refDir.resolve("response.json").toFile(), fix.rawResponse);
                                repairPromptTokens += Math.max(0, fix.promptTokens); repairCompletionTokens += Math.max(0, fix.completionTokens);
                                if (!Double.isNaN(fix.cost)) repairCost += fix.cost;
                                repairElapsedMs += fix.elapsedMs;
                            }
                            String corrected = extractJava(refContent);
                            if (corrected.isBlank()) addActivity(row, "คำตอบรอบแก้ test ที่ล้มไม่มี Java class · ใช้ class เดิม");
                            else {
                                run.awaitRunning();
                                String errs = defects4jRunner.compileErrors(run.project, run.bugId, version, corrected, checkDir,
                                        progress -> publishProgress(run, index, row, progress, lastLoggedAt));
                                if (errs.isEmpty()) {
                                    javaText = corrected; row.put("referenceRepair", 1);
                                    Files.writeString(refDir.resolve("corrected.java"), javaText, StandardCharsets.UTF_8);
                                    addActivity(row, "ใช้ class ที่แก้แล้ว (" + countTests(javaText) + " test) · test ที่ยังไม่ผ่านบน fixed จะถูกตัดตามปกติ");
                                } else {
                                    Files.writeString(refDir.resolve("compile-errors.txt"), errs, StandardCharsets.UTF_8);
                                    row.put("referenceRepair", 0);
                                    addActivity(row, "class ที่แก้แล้วคอมไพล์ไม่ผ่าน · ใช้ class เดิม");
                                }
                            }
                        } else { row.put("referenceFailures", 0); addActivity(row, "ทุก test ผ่านบนเวอร์ชันอ้างอิง"); }
                    }
                    row.put("repairRounds", used);
                    row.put("compileCheck", compileStatus);
                    if (used > 0) row.put("repairUrl", "/artifact?path=" + encode(outputRoot.relativize(modelDir.resolve("generated/repair-" + used + "/response.md")).toString()));
                    addActivity(row, "ตรวจคอมไพล์: " + ("OK".equals(compileStatus) ? "ผ่าน" : "ยังไม่ผ่าน") + " · ใช้รอบแก้ " + used + "/" + run.aiRepairRounds);
                } finally { defects4jRunner.releaseCompileCheck(checkDir); }
            }
            String javaName = "";
            if (!javaText.isBlank()) {
                String detectedClass = Defects4jRunner.findTestClassName(javaText);
                if (detectedClass == null) javaText = "";   // no usable class: nothing may be evaluated
                else {
                    javaName = detectedClass + ".java";
                    Files.writeString(generatedDir.resolve(javaName), javaText, StandardCharsets.UTF_8);
                    addActivity(row, "แยก Java test class ได้ · " + javaName + " · " + javaText.length() + " ตัวอักษร");
                }
            }
            if (javaName.isBlank()) addActivity(row, "ตรวจ response แล้ว · AI ไม่ได้ส่ง Java test class ที่มี @Test · ยังไม่ได้เริ่มรัน Defects4J");
            if (result != null) {
                row.put("actualModel", result.actualModel);
                row.put("generationId", result.generationId);
                if (!result.batchId.isBlank()) row.put("batchId", result.batchId);
                row.put("promptTokens", result.promptTokens);
                row.put("completionTokens", result.completionTokens);
                row.put("cachedTokens", result.cachedTokens);
                row.put("cost", Double.isNaN(result.cost) ? null : result.cost);
                row.put("elapsedMs", result.elapsedMs);
                row.put("outputTokensPerSecond", aiProviders.isBatch(modelId) || result.completionTokens < 0
                        || result.elapsedMs <= 0 ? null : result.completionTokens * 1000.0 / result.elapsedMs);
            }
            if (repairCalled) {
                // Usage of the repair requests is part of this AI's totals.
                row.put("promptTokens", (long) numberValue(row.get("promptTokens")) + repairPromptTokens);
                row.put("completionTokens", (long) numberValue(row.get("completionTokens")) + repairCompletionTokens);
                Double cost = doubleValue(row.get("cost"));
                if (cost != null || repairCost > 0) row.put("cost", (cost == null ? 0 : cost) + repairCost);
                // Deletion-proof usage record: tokens and cost of every round of this AI row.
                usageLedger.record(run.runId, run.project, run.bugId, String.valueOf(row.get("label")), aiProviders.label(modelId),
                        String.valueOf(row.getOrDefault("actualModel", "")), (long) numberValue(row.get("promptTokens")),
                        (long) numberValue(row.get("completionTokens")), (long) numberValue(row.get("cachedTokens")),
                        row.get("cost") == null ? null : ((Number) row.get("cost")).doubleValue(), (long) numberValue(row.get("elapsedMs")),
                        !javaName.isBlank(), 1 + (repairCalled ? 1 : 0));
                row.put("elapsedMs", (long) numberValue(row.get("elapsedMs")) + repairElapsedMs);
                row.put("repairElapsedMs", repairElapsedMs);
            }
            row.put("mode", aiProviders.isBatch(modelId) ? "batch" : "direct");
            row.put("javaFile", javaName);
            row.put("responseUrl", "/artifact?path=" + encode(outputRoot.relativize(responseFile).toString()));
            row.put("javaUrl", javaName.isBlank() ? "" : "/artifact?path=" + encode(outputRoot.relativize(generatedDir.resolve(javaName)).toString()));
            if (!javaName.isBlank()) {
                Path aiReport = modelDir.resolve("report/ai-report.md");
                boolean reportComplete = writeAiReport(content, javaText, aiReport);
                row.put("aiReportUrl", "/artifact?path=" + encode(outputRoot.relativize(aiReport).toString()));
                row.put("reportComplete", reportComplete);
                if (!reportComplete) addActivity(row, "AI ส่งส่วนรายงานไม่ครบ; เก็บส่วนที่ขาดตามจริงใน ai-report.md");
            }
            String cutOff = javaName.isBlank() ? outputLimitNote(generatedDir.resolve("response.json"), run.maxTokens) : "";
            row.put("status", javaName.isBlank()
                    ? "สร้าง test ไม่สำเร็จ · AI ตอบกลับแต่ไม่มี Java test class" + cutOff + " · ยังไม่ได้รัน Defects4J"
                    : "บันทึก Java test แล้ว");
            row.put("ok", !javaName.isBlank());
            if (javaName.isBlank()) row.put("error", "AI ตอบกลับโดยไม่มี Java test class ที่มี @Test" + cutOff + "; ตรวจคำตอบดิบได้จาก response.md");
            run.complete(index, row);
            persistMetadata(run);
            if (!javaName.isBlank()) {
                String invalid = validateAiSuite(javaText, run.project, run.bugId);
                if (!invalid.isBlank()) {
                    row.put("invalidOutput", true);
                    row.put("ok", false);
                    row.put("pending", false);
                    row.put("error", invalid);
                    row.put("status", "AI suite ไม่ตรงขอบเขต · " + invalid);
                    addActivity(row, "หยุดก่อนรัน Defects4J · " + invalid);
                    run.complete(index, row);
                    persistMetadata(run);
                    return;
                }
            }
            if (!javaText.isBlank()) {
                run.awaitRunning();
                row.put("status", "สร้าง test แล้ว · กำลังรันกับ Defects4J buggy/fixed");
                run.complete(index, row);
                persistMetadata(run);
                Path savedBenchmark = benchmarkPath(modelDir);
                Map<String, Object> benchmark;
                if (Files.isRegularFile(savedBenchmark)) {
                    @SuppressWarnings("unchecked")
                    Map<String, Object> saved = mapper.readValue(savedBenchmark.toFile(), Map.class);
                    if ("COMPLETED".equals(saved.get("status"))) benchmark = saved;
                    else benchmark = defects4jRunner.evaluate(run.project, run.bugId,
                            javaText, modelDir, "ai" + (index + 1), "fixed".equals(run.aiSourceVersion), progress -> {
                                publishProgress(run, index, row, progress, lastLoggedAt);
                            });
                } else benchmark = defects4jRunner.evaluate(run.project, run.bugId,
                        javaText, modelDir, "ai" + (index + 1), "fixed".equals(run.aiSourceVersion), progress -> {
                            publishProgress(run, index, row, progress, lastLoggedAt);
                        });
                // The AI's generation time lives on the row; expose it next to the algorithms' metric for the tables.
                if (row.get("elapsedMs") != null) benchmark.put("generationElapsedMs", row.get("elapsedMs"));
                row.put("benchmark", benchmark);
                row.put("benchmarkUrl", "/artifact?path=" + encode(outputRoot.relativize(savedBenchmark).toString()));
                Object suiteArchive = benchmark.get("testSuiteArchive");
                if (suiteArchive != null) row.put("suiteArchiveUrl", "/artifact?path=" + encode(outputRoot.relativize(modelDir.resolve(suiteArchive.toString())).toString()));
                Object detection = benchmark.get("detection");
                row.put("status", "สร้าง test แล้ว · Defects4J: " + (detection == null ? benchmark.get("error") : detection));
                addActivity(row, "ประเมิน buggy/fixed เสร็จ · Detection: " + (detection == null ? benchmark.get("error") : detection));
            }
            row.put("pending", false);
        } catch (Throwable e) {
            row.remove("waitingSince");
            boolean cancelled = e instanceof RunCancelledException || run.isCancelled();
            String failure = e.getMessage() == null ? "" : e.getMessage();
            if (!cancelled) LOG.warn("AI request failed · run {} · {}-{} · AI {} · {}", run.runId, run.project, run.bugId,
                    row.get("label"), failure.isEmpty() ? e.toString() : failure);
            if (!cancelled && isQuotaError(failure)) {
                // Rate limit / no credit is not a result of the AI: keep the request pending, stop the run (and its campaign)
                // and tell the user; "ทำงานต่อ" after topping up sends the same request again.
                String reason = "หยุดชั่วคราว · AI \"" + row.get("label") + "\" ติด rate limit หรือเครดิตหมด ("
                        + (failure.length() > 160 ? failure.substring(0, 160) + "…" : failure)
                        + ") · เติมเครดิตหรือรอให้ limit คืน แล้วกด \"ทำงานต่อ\"";
                addActivity(row, reason);
                row.put("pending", true); row.put("ok", false); row.put("quotaBlocked", true);
                row.put("status", reason); row.remove("error");
                run.complete(index, row);
                pauseForQuota(run, reason);
                persistMetadata(run);
                return;
            }
            addActivity(row, cancelled ? "ถูกยกเลิกโดยผู้ใช้" : "คำขอ/การประมวลผลล้มเหลว · " + (e.getMessage() == null ? "ไม่ทราบสาเหตุ" : e.getMessage()));
            if (cancelled) row.put("cancelled", true);
            row.put("ok", false);
            row.put("pending", false);
            row.put("elapsedMs", Duration.between(started, Instant.now()).toMillis());
            String error = cancelled ? "ยกเลิกโดยผู้ใช้" : (e.getMessage() == null ? "สร้าง test ไม่สำเร็จ" : e.getMessage());
            row.put("error", error);
            row.put("status", error);
        }
        run.complete(index, row);
        persistMetadata(run);
    }

    /** Writes through a temp file so a crash never leaves a truncated metadata/campaign file behind. */
    private void writeJson(Path file, Object value) throws IOException {
        if (!Files.isDirectory(file.getParent())) return;   // run was deleted meanwhile; do not resurrect it
        Path temp = file.resolveSibling(file.getFileName() + ".tmp");
        mapper.writerWithDefaultPrettyPrinter().writeValue(temp.toFile(), value);
        try { Files.move(temp, file, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING); }
        catch (AtomicMoveNotSupportedException e) { Files.move(temp, file, StandardCopyOption.REPLACE_EXISTING); }
    }

    private void persistMetadata(RunState run) {
        synchronized (run) {
            try {
                Map<String, Object> metadata = new LinkedHashMap<>();
                metadata.put("project", run.project);
                metadata.put("bugId", run.bugId);
                metadata.put("runId", run.runId);
                metadata.put("createdAt", run.createdAt);
                metadata.put("requestedModels", run.models);
                metadata.put("modelFolders", run.modelFolders);
                metadata.put("algorithms", run.algorithms);
                metadata.put("experimentMode", run.models.isEmpty() || ("skipped".equals(run.snapshot().get(0).get("mode")) && !Boolean.TRUE.equals(run.snapshot().get(0).get("alreadyDone")))
                        ? "algorithms-only" : run.algorithms.isEmpty() ? "ai-only" : "ai-comparison");
                metadata.put("repetition", run.repetition);
                metadata.put("algorithmOracle", run.algorithmOracle);
                metadata.put("aiRepairRounds", run.aiRepairRounds);
                if (run.aiRepairRounds > 0) metadata.put("repairPromptVersion", repairPromptVersion());
                if (!run.aiSourceVersion.isBlank()) metadata.put("aiSourceVersion", run.aiSourceVersion);
                metadata.put("defects4jVersion", Defects4jRunner.installedVersion());
                metadata.put("promptVersion", run.promptVersion);
                metadata.put("promptSha256", run.promptSha256);
                metadata.put("algorithmBudgetSeconds", run.budgetSeconds);
                metadata.put("maxTokens", run.maxTokens);
                metadata.put("sampling", OpenRouterService.SAMPLING);
                metadata.put("paused", run.isPaused());
                metadata.put("pauseReason", run.isPaused() ? run.pauseReason : "");
                metadata.put("results", run.snapshot());
                writeJson(run.runDir.resolve("metadata.json"), metadata);
            } catch (IOException | RuntimeException ignored) {
                // Individual model artifacts remain available even if run metadata cannot be refreshed.
            }
        }
    }

    @GetMapping("/run-status")
    @ResponseBody
    public Map<String, Object> runStatus(@RequestParam("runId") String runId) {
        RunState run = activeRuns.get(runId);
        if (run == null) return Map.of("pending", false, "results", List.of());
        Map<String, Object> status = new LinkedHashMap<>();
        status.put("pending", run.isPending());
        status.put("paused", run.isPaused());
        status.put("pauseReason", run.isPaused() ? run.pauseReason : "");
        status.put("results", resultsWithDefectLinks(run));
        return status;
    }

    @PostMapping("/run-control")
    @ResponseBody
    public Map<String,Object> controlRun(@RequestParam("runId") String runId, @RequestParam("action") String action) throws IOException {
        RunState run = activeRuns.get(runId);
        if (run == null) return Map.of("ok", false, "message", "ไม่พบ run นี้");
        if (!run.isPending()) return Map.of("ok", false, "paused", run.isPaused(), "message", "run นี้ทำเสร็จแล้ว");
        if ("pause".equals(action)) {
            run.pause();
            persistMetadata(run);
            return Map.of("ok", true, "paused", true, "message", "หยุดชั่วคราวเมื่อขั้นตอนปัจจุบันถึง checkpoint");
        }
        if ("resume".equals(action)) {
            run.resume();
            run.pauseReason = "";
            Path promptFile = run.runDir.resolve("user-prompt.txt");
            String prompt = Files.isRegularFile(promptFile) ? Files.readString(promptFile, StandardCharsets.UTF_8) : "";
            Path inputFile = run.runDir.resolve("buggy-source-input.txt");
            String source = Files.isRegularFile(inputFile) ? Files.readString(inputFile, StandardCharsets.UTF_8) : "";
            startRemaining(run, prompt, source, run.maxTokens, run.budgetSeconds);
            persistMetadata(run);
            return Map.of("ok", true, "paused", false, "message", "ทำงานต่อจาก checkpoint แล้ว");
        }
        if ("cancel".equals(action)) {
            if (isCampaignRun(runId)) return Map.of("ok", false, "message", "run นี้อยู่ใน campaign: ยกเลิกทั้ง campaign จากหน้า campaign หรือหน้า History");
            cancelRun(run);
            return Map.of("ok", true, "cancelled", true, "message", "ยกเลิก run แล้ว");
        }
        return Map.of("ok", false, "message", "action ต้องเป็น pause, resume หรือ cancel");
    }

    /**
     * Stops a run for good: its workers stop at their next step, the Defects4J/ant/search processes of the run are killed and
     * unfinished rows are marked cancelled. A request already sent to an AI provider cannot be recalled (it ends first).
     */
    private void cancelRun(RunState run) {
        run.cancel();
        ProcessRegistry.killUnder(run.runDir);
        List<Map<String,Object>> rows = run.snapshot();
        for (int i = 0; i < rows.size(); i++) {
            Map<String,Object> row = rows.get(i);
            if (!Boolean.TRUE.equals(row.get("pending"))) continue;
            row.put("pending", false); row.put("ok", false); row.put("cancelled", true);
            row.put("error", "ยกเลิกโดยผู้ใช้"); row.put("status", "ยกเลิกโดยผู้ใช้");
            run.complete(i, row);
        }
        persistMetadata(run);
    }

    @PostMapping("/run-delete")
    @ResponseBody
    public Map<String,Object> deleteRun(@RequestParam("runId") String runId) {
        RunState run = activeRuns.get(runId);
        if (run == null) return Map.of("ok", false, "message", "ไม่พบ run นี้หรือถูกลบไปแล้ว");
        if (run.isPending()) return Map.of("ok", false, "message", "ลบไม่ได้ เพราะ run นี้ยังทำงานอยู่");
        if (isCampaignRun(runId)) return Map.of("ok", false, "message", "run นี้เป็นส่วนหนึ่งของ campaign จึงลบแยกไม่ได้ (ลบทั้ง campaign ได้จากหน้าประวัติ)");
        String error = removeRunFiles(run);
        return error == null ? Map.of("ok", true, "message", "ลบ run และไฟล์ผลที่เกี่ยวข้องแล้ว") : Map.of("ok", false, "message", error);
    }

    /** Deletes a run's directory and forgets the run; returns an error message, or null on success. */
    private String removeRunFiles(RunState run) {
        Path runsRoot = outputRoot.resolve("ai-runs").normalize();
        Path runDir = run.runDir.toAbsolutePath().normalize();
        if (!runDir.startsWith(runsRoot) || runDir.getParent() == null || runDir.getParent().getParent() == null
                || !runDir.getParent().getParent().equals(runsRoot) || !runDir.getFileName().toString().equals(run.runId)) {
            return "ตำแหน่งไฟล์ run ไม่ถูกต้อง จึงยกเลิกการลบ";
        }
        if (!activeRuns.remove(run.runId, run)) return "สถานะ run เปลี่ยนระหว่างลบ กรุณาโหลดหน้าใหม่";
        try {
            deleteTree(runDir);
            // drop the now empty <Project>-<Bug> folder too
            try (java.util.stream.Stream<Path> left = Files.list(runDir.getParent())) {
                if (left.findAny().isEmpty()) Files.deleteIfExists(runDir.getParent());
            } catch (IOException ignored) { }
            return null;
        } catch (IOException | java.io.UncheckedIOException e) {
            activeRuns.putIfAbsent(run.runId, run);
            return "ลบไฟล์ run ไม่ครบ: " + (e.getMessage() == null ? "I/O error" : e.getMessage());
        }
    }

    private static void deleteTree(Path dir) throws IOException {
        if (!Files.exists(dir)) return;
        try (java.util.stream.Stream<Path> paths = Files.walk(dir)) {
            paths.sorted(java.util.Comparator.reverseOrder()).forEach(path -> {
                try { Files.deleteIfExists(path); }
                catch (IOException e) { throw new java.io.UncheckedIOException(e); }
            });
        }
    }

    /** Deletes a campaign together with all of its runs; refused while a worker of the campaign is still active. */
    @PostMapping("/campaign-delete")
    @ResponseBody
    public Map<String,Object> deleteCampaign(@RequestParam("campaignId") String campaignId) {
        CampaignState campaign = campaigns.get(campaignId);
        if (campaign == null) return Map.of("ok", false, "message", "ไม่พบ campaign นี้หรือถูกลบไปแล้ว");
        if (campaign.workerActive) return Map.of("ok", false, "message", "campaign นี้ยังมีงานกำลังทำงานอยู่ ลบไม่ได้จนกว่าจะจบ");
        Path campaignsRoot = outputRoot.resolve("ai-runs").resolve("campaigns").normalize();
        Path dir = campaign.dir.toAbsolutePath().normalize();
        if (!dir.startsWith(campaignsRoot) || dir.equals(campaignsRoot) || !dir.getFileName().toString().equals(campaignId))
            return Map.of("ok", false, "message", "ตำแหน่งไฟล์ campaign ไม่ถูกต้อง จึงยกเลิกการลบ");
        int removed = 0;
        for (Map<String,Object> target : campaign.snapshot()) {
            String runId = String.valueOf(target.getOrDefault("runId", ""));
            RunState run = runId.isBlank() ? null : activeRuns.get(runId);
            if (run == null) continue;
            String error = removeRunFiles(run);
            if (error != null) return Map.of("ok", false, "message", "ลบ run " + runId + " ไม่สำเร็จ: " + error);
            removed++;
        }
        try { deleteTree(dir); }
        catch (IOException | java.io.UncheckedIOException e) {
            return Map.of("ok", false, "message", "ลบไฟล์ campaign ไม่ครบ: " + (e.getMessage() == null ? "I/O error" : e.getMessage()));
        }
        campaigns.remove(campaignId, campaign);
        return Map.of("ok", true, "message", "ลบ campaign และ run ย่อย " + removed + " รายการแล้ว");
    }

    /** Deletes every campaign and single run that is not running; running ones are kept and counted. */
    @PostMapping("/history-delete-all")
    @ResponseBody
    public Map<String,Object> deleteAllHistory(@RequestParam(value = "confirm", defaultValue = "") String confirm) {
        if (!"yes".equals(confirm)) return Map.of("ok", false, "message", "ต้องยืนยันก่อนลบ");
        int campaignsRemoved = 0, runsRemoved = 0, skipped = 0;
        List<String> errors = new ArrayList<>();
        for (CampaignState campaign : new ArrayList<>(campaigns.values())) {
            if (campaign.workerActive) { skipped++; continue; }
            Map<String,Object> result = deleteCampaign(campaign.campaignId);
            if (Boolean.TRUE.equals(result.get("ok"))) campaignsRemoved++; else errors.add(String.valueOf(result.get("message")));
        }
        for (RunState run : new ArrayList<>(activeRuns.values())) {
            if (isCampaignRun(run.runId)) continue;   // belongs to a campaign that is still running
            if (run.isPending()) { skipped++; continue; }
            String error = removeRunFiles(run);
            if (error == null) runsRemoved++; else errors.add(error);
        }
        String message = "ลบ campaign " + campaignsRemoved + " รายการ และ run เดี่ยว " + runsRemoved + " รายการแล้ว"
                + (skipped > 0 ? " · เก็บไว้ " + skipped + " รายการที่ยังทำงานอยู่" : "")
                + (errors.isEmpty() ? "" : " · ลบไม่สำเร็จ " + errors.size() + " รายการ: " + errors.get(0));
        return Map.of("ok", errors.isEmpty(), "message", message);
    }

    /** Runs that do not belong to a campaign, newest first. */
    private List<Map<String,Object>> singleRunHistory() {
        List<RunState> runs = new ArrayList<>(activeRuns.values());
        runs.sort(Comparator.comparing((RunState run) -> run.runId).reversed());
        List<Map<String,Object>> history = new ArrayList<>();
        for (RunState run : runs) {
            if (isCampaignRun(run.runId)) continue;
            Map<String,Object> row = new LinkedHashMap<>();
            row.put("runId", run.runId); row.put("project", run.project); row.put("bugId", run.bugId);
            row.put("url", "/run?runId=" + encode(run.runId));
            row.put("pending", run.isPending()); row.put("paused", run.isPaused());
            row.put("pauseReason", run.isPaused() ? run.pauseReason : "");
            row.put("canDelete", !run.isPending());
            history.add(row);
        }
        return history;
    }

    /** Campaigns for the history page: one collapsible entry each, runs grouped by project inside. */
    private List<Map<String,Object>> campaignHistory() {
        List<CampaignState> list = new ArrayList<>(campaigns.values());
        list.sort(Comparator.comparing((CampaignState campaign) -> campaign.createdAt).reversed());
        List<Map<String,Object>> history = new ArrayList<>();
        for (CampaignState campaign : list) {
            Map<String,Object> row = new LinkedHashMap<>();
            row.put("campaignId", campaign.campaignId); row.put("createdAt", campaign.createdAt);
            row.put("status", campaign.status); row.put("paused", campaign.isPaused());
            row.put("pending", !campaign.isFinished());
            row.put("cancelled", campaign.cancelled);
            row.put("pauseReason", campaign.isPaused() ? campaign.pauseReason : "");
            row.put("targetCount", campaign.targets.size()); row.put("completedCount", campaign.completedCount());
            row.put("url", "/campaign?campaignId=" + encode(campaign.campaignId));
            row.put("canDelete", !campaign.workerActive);
            List<String> ais = new ArrayList<>(), algorithms = new ArrayList<>();
            for (String model : campaign.models) ais.add(aiProviders.displayName(model));
            for (String algorithm : campaign.algorithms) algorithms.add(algorithmLabel(algorithm).replace("Algorithm · ", ""));
            String promptVersion = "";
            Map<String,List<Map<String,Object>>> byProject = new LinkedHashMap<>();
            int targetIndex = 0;
            for (Map<String,Object> target : campaign.snapshot()) {
                String project = String.valueOf(target.get("project"));
                String runId = String.valueOf(target.getOrDefault("runId", ""));
                RunState run = runId.isBlank() ? null : activeRuns.get(runId);
                if (run != null && promptVersion.isBlank()) promptVersion = run.promptVersion;
                Map<String,Object> item = new LinkedHashMap<>();
                item.put("index", targetIndex++);
                item.put("label", project + "-" + target.get("bugId") + " · Round " + (numberValue(target.get("repetition")) + 1));
                item.put("status", target.get("status"));
                item.put("url", runId.isBlank() ? "" : "/run?runId=" + encode(runId));
                item.put("tests", target.get("tests") instanceof List ? target.get("tests") : List.of());
                byProject.computeIfAbsent(project, key -> new ArrayList<>()).add(item);
            }
            List<Map<String,Object>> projects = new ArrayList<>();
            byProject.forEach((project, runs) -> {
                Map<String,Object> group = new LinkedHashMap<>();
                group.put("project", project); group.put("runs", runs);
                // Per-project progress for the summary line: finished rounds, rounds with at least one detection, rounds running.
                int finished = 0, detected = 0, running = 0;
                for (Map<String,Object> item : runs) {
                    String status = String.valueOf(item.get("status"));
                    if ("completed".equals(status) || "error".equals(status) || "cancelled".equals(status)) finished++;
                    else if ("running".equals(status)) running++;
                    for (Object test : (List<?>) item.get("tests"))
                        if (test instanceof Map && "BUGGY_FAIL_FIXED_PASS".equals(((Map<?,?>) test).get("detection"))) { detected++; break; }
                }
                group.put("finished", finished); group.put("detected", detected); group.put("running", running);
                group.put("done", finished == runs.size());
                projects.add(group);
            });
            row.put("projects", projects);
            row.put("description", (campaign.algorithmOnly ? "algorithms-only" : "AI: " + String.join(", ", ais))
                    + " · " + (algorithms.isEmpty() ? "AI เท่านั้น" : String.join(", ", algorithms)) + " · oracle " + campaign.algorithmOracle
                    + " · budget " + campaign.budgetSeconds + " s" + (promptVersion.isBlank() || campaign.algorithmOnly ? "" : " · prompt " + promptVersion)
                    + (campaign.onlyUndetected ? " · เฉพาะที่ยังไม่ตรวจพบ" : ""));
            history.add(row);
        }
        return history;
    }

    private boolean isCampaignRun(String runId) {
        for (CampaignState campaign : campaigns.values()) if (campaign.referencesRun(runId)) return true;
        return false;
    }

    private List<Map<String,Object>> recentRunHistory() {
        List<RunState> runs = new ArrayList<>(activeRuns.values());
        runs.sort(Comparator.comparing((RunState run) -> run.runId).reversed());
        List<Map<String,Object>> history = new ArrayList<>();
        for (RunState run : runs.subList(0, Math.min(20, runs.size()))) {
            Map<String,Object> row = new LinkedHashMap<>();
            row.put("runId", run.runId); row.put("project", run.project); row.put("bugId", run.bugId);
            row.put("url", "/run?runId=" + encode(run.runId));
            row.put("pending", run.isPending()); row.put("paused", run.isPaused());
            row.put("canDelete", !run.isPending() && !isCampaignRun(run.runId));
            history.add(row);
        }
        return history;
    }

    private void restoreRuns() {
        Path runsRoot = outputRoot.resolve("ai-runs");
        if (!Files.isDirectory(runsRoot)) return;
        // ai-runs/<Project>-<Bug>/<run-id>/metadata.json is exactly three levels deep; never walk into the checkouts
        try (java.util.stream.Stream<Path> files = Files.walk(runsRoot, 3)) {
            files.filter(p -> p.getFileName().toString().equals("metadata.json")).forEach(path -> {
                try {
                    JsonNode meta = mapper.readTree(path.toFile());
                    String id = meta.path("runId").asText("");
                    if (id.isBlank() || !meta.path("requestedModels").isArray() || !meta.path("algorithms").isArray()) return;
                    List<String> models = new ArrayList<>(), algorithms = new ArrayList<>();
                    meta.path("requestedModels").forEach(n -> models.add(n.asText()));
                    meta.path("algorithms").forEach(n -> algorithms.add(n.asText()));
                    if (algorithms.isEmpty() && models.isEmpty()) return;   // AI-only runs have no algorithm rows
                    RunState run = new RunState(id, meta.path("project").asText(), meta.path("bugId").asText(),
                            path.getParent(), models, algorithms, meta.path("algorithmBudgetSeconds").asInt(60), meta.path("maxTokens").asInt(0));
                    run.repetition = meta.path("repetition").asInt(0);
                    run.algorithmOracle = meta.path("algorithmOracle").asText("buggy");
                    run.aiRepairRounds = meta.path("aiRepairRounds").asInt(0);
                    run.aiSourceVersion = meta.path("aiSourceVersion").asText("");
                    run.promptVersion = meta.path("promptVersion").asText("");
                    run.promptSha256 = meta.path("promptSha256").asText("");
                    run.pauseReason = meta.path("pauseReason").asText("");
                    if (!meta.path("createdAt").asText("").isBlank()) run.createdAt = meta.path("createdAt").asText("");
                    for (int i = 0; i < models.size(); i++) {
                        String saved = meta.path("modelFolders").path(i).asText("");
                        run.modelFolders.add(saved.isBlank() ? "model-" + (i + 1) + "-" + slug(models.get(i)) : saved);
                    }
                    JsonNode rows = meta.path("results");
                    boolean reclassified = false;
                    for (int i=0; i<rows.size() && i<models.size()+algorithms.size(); i++) {
                        @SuppressWarnings("unchecked")
                        Map<String,Object> restored = mapper.convertValue(rows.get(i), Map.class);
                        hideModelIdsInActivity(restored);
                        if (i < models.size() && "direct".equals(restored.get("mode"))
                                && String.valueOf(restored.getOrDefault("javaFile", "")).isBlank()) {
                            Path response = path.getParent().resolve(run.modelFolders.get(i))
                                    .resolve("generated/original/response.md");
                            if (Files.isRegularFile(response)) {
                                String raw = Files.readString(response, StandardCharsets.UTF_8);
                                if (extractJava(raw).isBlank()) {
                                    restored.put("ok", false);
                                    restored.put("error", "AI ตอบกลับโดยไม่มี Java test class ที่มี @Test; ยังไม่ได้รัน Defects4J");
                                    restored.put("status", "สร้าง test ไม่สำเร็จ · AI ตอบกลับแต่ไม่มี Java test class · ยังไม่ได้รัน Defects4J");
                                }
                            }
                        }
                        if (reclassifySavedBenchmark(run, i, restored)) reclassified = true;
                        run.setInitial(i, restored);
                    }
                    if (run.isPending()) run.pause();
                    activeRuns.put(id, run);
                    if (reclassified) persistMetadata(run);
                } catch (Exception ignored) { /* Skip incomplete or older metadata; artifacts remain available. */ }
            });
        } catch (IOException ignored) { }
    }

    @SuppressWarnings("unchecked")
    private boolean reclassifySavedBenchmark(RunState run, int index, Map<String, Object> row) {
        Object reportValue = row.get("benchmark");
        if (!(reportValue instanceof Map)) return false;
        Map<String, Object> report = (Map<String, Object>) reportValue;
        if (!"COMPLETED".equals(report.get("status")) || !(report.get("versions") instanceof Map)) return false;
        String before = String.valueOf(report.get("detection"));
        boolean alreadyClassified = report.containsKey("detectedTests");
        Defects4jRunner.classifyDetection(report, (Map<String, Object>) report.get("versions"));
        if (before.equals(report.get("detection")) && alreadyClassified) return false;
        String folder = index < run.models.size()
                ? run.modelFolders.get(index)
                : "algorithm-" + run.algorithms.get(index - run.models.size());
        Path modelDir = run.runDir.resolve(folder);
        try {
            Path reportDir = modelDir.resolve("report");
            Files.createDirectories(reportDir);
            mapper.writerWithDefaultPrettyPrinter().writeValue(reportDir.resolve("benchmark.json").toFile(), report);
            mapper.writerWithDefaultPrettyPrinter().writeValue(modelDir.resolve("benchmark.json").toFile(), report);
        } catch (IOException ignored) { }
        Object status = row.get("status");
        if (status instanceof String && ((String) status).contains("Defects4J:"))
            row.put("status", (index < run.models.size() ? "สร้าง test แล้ว · " : "")
                    + "Defects4J: " + report.get("detection"));
        return true;
    }

    private void restoreCampaigns() {
        Path root = outputRoot.resolve("ai-runs").resolve("campaigns");
        if (!Files.isDirectory(root)) return;
        try (java.util.stream.Stream<Path> files = Files.walk(root, 2)) {
            files.filter(p -> p.getFileName().toString().equals("campaign.json")).forEach(path -> {
                try {
                    JsonNode data = mapper.readTree(path.toFile());
                    String id = data.path("campaignId").asText("");
                    List<String> projects = new ArrayList<>(), models = new ArrayList<>(), algorithms = new ArrayList<>();
                    data.path("projects").forEach(n -> projects.add(n.asText()));
                    data.path("models").forEach(n -> models.add(n.asText()));
                    data.path("algorithms").forEach(n -> algorithms.add(n.asText()));
                    List<Map<String,Object>> targets = new ArrayList<>();
                    data.path("targets").forEach(n -> targets.add(mapper.convertValue(n, Map.class)));
                    if (id.isBlank() || (algorithms.isEmpty() && models.isEmpty()) || targets.isEmpty()) return;
                    CampaignState campaign = new CampaignState(id, path.getParent(), projects, targets, models,
                            algorithms, data.path("prompt").asText(""), data.path("source").asText(""),
                            data.path("maxTokens").asInt(0), data.path("budgetSeconds").asInt(60),
                            data.path("algorithmOnly").asBoolean(false));
                    campaign.algorithmOracle = data.path("algorithmOracle").asText("buggy");
                    campaign.aiRepairRounds = data.path("aiRepairRounds").asInt(0);
                    campaign.onlyUndetected = data.path("onlyUndetected").asBoolean(false);
                    campaign.skippedDone = data.path("skippedDone").asInt(0);
                    campaign.pauseReason = data.path("pauseReason").asText("");
                    campaign.currentIndex = data.path("currentIndex").asInt(0);
                    campaign.currentRunId = data.path("currentRunId").asText("");
                    campaign.status = data.path("status").asText("paused");
                    if (!campaign.isFinished()) { campaign.pause(); campaign.status="paused"; }
                    campaign.cancelled = "cancelled".equals(campaign.status);
                    campaigns.put(id, campaign);
                } catch (Exception ignored) { /* Ignore incomplete campaign metadata; retain its artifacts. */ }
            });
        } catch (IOException ignored) { }
    }

    private static final class CampaignState {
        final String campaignId; final Path dir; final List<String> projects,models,algorithms;
        final List<Map<String,Object>> targets; final String prompt,source; final int maxTokens,budgetSeconds;
        final boolean algorithmOnly;
        final String createdAt=Instant.now().toString();
        volatile int currentIndex; volatile String currentRunId=""; volatile String status="queued"; volatile String algorithmOracle="buggy"; volatile int aiRepairRounds; volatile boolean onlyUndetected; volatile int skippedDone; volatile String pauseReason="";
        volatile Map<String,Object> summaryCache; volatile long summaryAt;
        volatile boolean workerActive; private boolean paused;
        CampaignState(String id,Path dir,List<String> projects,List<Map<String,Object>> targets,List<String> models,
                List<String> algorithms,String prompt,String source,int maxTokens,int budgetSeconds,boolean algorithmOnly){
            this.campaignId=id;this.dir=dir;this.projects=new ArrayList<>(projects);this.targets=new ArrayList<>(targets);
            this.models=new ArrayList<>(models);this.algorithms=new ArrayList<>(algorithms);this.prompt=prompt;this.source=source;
            this.maxTokens=maxTokens;this.budgetSeconds=budgetSeconds;this.algorithmOnly=algorithmOnly;
        }
        private final Set<Integer> claimed = new java.util.HashSet<>();
        /** Next target that is neither finished nor taken by another worker, or null when nothing is left. */
        synchronized Integer claimNext(){
            for(int i=0;i<targets.size();i++){
                String s=String.valueOf(targets.get(i).get("status"));
                if(cancelled)return null;
                if(s.equals("completed")||s.equals("error")||s.equals("cancelled")||claimed.contains(i))continue;
                claimed.add(i);return i;
            }
            return null;
        }
        synchronized int firstUnfinished(){
            for(int i=0;i<targets.size();i++){String s=String.valueOf(targets.get(i).get("status"));if(!s.equals("completed")&&!s.equals("error")&&!s.equals("cancelled"))return i;}
            return targets.size();
        }
        synchronized boolean allTerminal(){return firstUnfinished()>=targets.size();}
        volatile boolean cancelled;
        boolean isFinished(){return "completed".equals(status)||cancelled||"cancelled".equals(status);}
        synchronized void cancel(){cancelled=true;paused=false;status="cancelled";notifyAll();}
        synchronized void pause(){paused=true;status="paused";}
        synchronized void resume(){paused=false;status="running";notifyAll();}
        synchronized boolean isPaused(){return paused;}
        synchronized void awaitRunning(){while(paused){try{wait();}catch(InterruptedException e){Thread.currentThread().interrupt();throw new IllegalStateException("Campaign interrupted while paused",e);}}}
        synchronized Map<String,Object> target(int i){return targets.get(i);}
        synchronized boolean referencesRun(String runId){for(Map<String,Object> target:targets)if(runId.equals(String.valueOf(target.get("runId"))))return true;return false;}
        synchronized List<Map<String,Object>> snapshot(){List<Map<String,Object>> copy=new ArrayList<>();for(Map<String,Object> row:targets)copy.add(new LinkedHashMap<>(row));return copy;}
        synchronized int completedCount(){int count=0;for(Map<String,Object> row:targets){String s=String.valueOf(row.get("status"));if(s.equals("completed")||s.equals("error"))count++;}return count;}
    }

    /** Thrown inside a run's workers once the user cancelled it; every step of a run passes through awaitRunning(). */
    private static final class RunCancelledException extends RuntimeException {
        RunCancelledException() { super("ยกเลิกโดยผู้ใช้"); }
    }

    private static final class RunState {
        private final String runId;
        private final String project;
        private final String bugId;
        private final Path runDir;
        private final List<String> models;
        private final List<String> algorithms;
        private final int budgetSeconds;
        private final int maxTokens;
        private volatile String createdAt = Instant.now().toString();   // restored from metadata for saved runs
        private volatile int repetition;
        private volatile String promptVersion = "", promptSha256 = "";
        /** Which Defects4J version the AI saw: "buggy" or "fixed" (from the template's source placeholder). */
        private volatile String aiSourceVersion = "";
        /** Where the algorithms record their expected values: "buggy" (default) or "fixed" (reference oracle). */
        private volatile String algorithmOracle = "buggy";
        /** How many times the AI may correct its class from the compiler errors of the reference version (0 = single request). */
        private volatile int aiRepairRounds;
        private volatile String pauseReason = "";
        /** Output folder of each AI, named after the AI used (fixed at run creation and saved in metadata). */
        private final List<String> modelFolders = new ArrayList<>();
        private final List<Map<String, Object>> rows = new ArrayList<>();
        private final Set<Integer> inProgress = new java.util.HashSet<>();
        private boolean dispatching;
        private volatile boolean paused;

        private RunState(String runId, String project, String bugId, Path runDir, List<String> models,
                List<String> algorithms, int budgetSeconds, int maxTokens) {
            this.runId = runId; this.project = project; this.bugId = bugId; this.runDir = runDir; this.models = models;
            this.algorithms = algorithms;
            this.budgetSeconds = budgetSeconds;
            this.maxTokens = maxTokens;
            for (int i = 0; i < models.size() + algorithms.size(); i++) rows.add(new LinkedHashMap<>());
        }

        private Runnable deferredDispatch;
        private synchronized boolean beginDispatch(Runnable retry) {
            if (dispatching) { deferredDispatch = retry; return false; }
            dispatching = true;
            return true;
        }
        private synchronized Runnable endDispatch() {
            dispatching = false;
            Runnable retry = deferredDispatch;
            deferredDispatch = null;
            return retry;
        }
        private volatile boolean cancelled;
        private synchronized void cancel() { cancelled = true; paused = false; notifyAll(); }
        private boolean isCancelled() { return cancelled; }
        private synchronized boolean claim(int index) { if (paused || cancelled || !inProgress.add(index)) return false; return true; }
        private synchronized void release(int index) { inProgress.remove(index); }
        private synchronized void pause() { paused = true; }
        private synchronized void resume() { paused = false; notifyAll(); }
        private synchronized boolean isPaused() { return paused; }
        private void awaitRunning() {
            synchronized (this) {
                while (paused && !cancelled) {
                    try { wait(); }
                    catch (InterruptedException e) { Thread.currentThread().interrupt(); throw new IllegalStateException("Run หยุดระหว่างรอ resume", e); }
                }
                if (cancelled) throw new RunCancelledException();
            }
        }
        // Rows are stored and returned as deep copies: the owning worker thread keeps mutating its own row (and its
        // nested activity list) while other threads persist metadata or answer /run-status.
        private synchronized void setInitial(int index, Map<String, Object> row) { rows.set(index, deepCopy(row)); }
        private synchronized void complete(int index, Map<String, Object> row) { rows.set(index, deepCopy(row)); }
        private synchronized List<Map<String, Object>> snapshot() {
            List<Map<String, Object>> copy = new ArrayList<>();
            for (Map<String, Object> row : rows) copy.add(deepCopy(row));
            return copy;
        }
        @SuppressWarnings("unchecked")
        private static Map<String, Object> deepCopy(Map<String, Object> source) {
            return (Map<String, Object>) copyValue(source);
        }
        private static Object copyValue(Object value) {
            if (value instanceof Map) {
                Map<Object, Object> copy = new LinkedHashMap<>();
                for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) copy.put(entry.getKey(), copyValue(entry.getValue()));
                return copy;
            }
            if (value instanceof List) {
                List<Object> copy = new ArrayList<>();
                for (Object item : (List<?>) value) copy.add(copyValue(item));
                return copy;
            }
            return value;
        }
        private synchronized boolean isPending() {
            for (Map<String, Object> row : rows) if (Boolean.TRUE.equals(row.get("pending"))) return true;
            return false;
        }
    }

    @GetMapping("/artifact")
    @ResponseBody
    public byte[] artifact(@RequestParam("path") String path, HttpServletResponse response) throws IOException {
        Path file;
        try { file = outputRoot.resolve(path.replaceFirst("^/", "")).normalize(); }
        catch (InvalidPathException e) { response.setStatus(404); return new byte[0]; }
        // toRealPath resolves symlinks (e.g. inside a Defects4J checkout) so they cannot lead outside the output root.
        if (!file.startsWith(outputRoot) || !Files.isRegularFile(file)
                || !file.toRealPath().startsWith(outputRoot.toRealPath())) {
            response.setStatus(404); return new byte[0];
        }
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getFileName().toString().replace("\"", "") + "\"");
        return Files.readAllBytes(file);
    }

    private static final Pattern OLD_MODEL_ACTIVITY = Pattern.compile("provider/model: (.+?) · \\S+/\\S+ · prompt");

    /** Runs saved before the UI showed only the user's AI name logged "provider/model: name · provider/model-id": keep just the name. */
    @SuppressWarnings("unchecked")
    private static void hideModelIdsInActivity(Map<String,Object> row) {
        Object activity = row.get("activity");
        if (!(activity instanceof List)) return;
        for (Object item : (List<Object>) activity) {
            if (!(item instanceof Map)) continue;
            Map<String,Object> entry = (Map<String,Object>) item;
            Object message = entry.get("message");
            if (message instanceof String) entry.put("message", OLD_MODEL_ACTIVITY.matcher((String) message).replaceAll("AI: $1 · prompt"));
        }
    }

    private void validatePromptTemplate(String prompt) {
        if (prompt == null || prompt.isBlank()) throw new IllegalArgumentException("Master Prompt ต้องไม่ว่าง");
        Set<String> present = new java.util.HashSet<>();
        Matcher matcher = PROMPT_PLACEHOLDER.matcher(prompt);
        while (matcher.find()) {
            String name = matcher.group(1).trim();
            if (!SUPPORTED_PROMPT_PLACEHOLDERS.contains(name))
                throw new IllegalArgumentException("พบ placeholder ที่ไม่รองรับ: {{" + name + "}}; ดูรายการ placeholder ที่หน้า Settings");
            present.add(name);
        }
        Set<String> missing = new java.util.LinkedHashSet<>(REQUIRED_PROMPT_PLACEHOLDERS);
        missing.removeAll(present);
        if (!missing.isEmpty()) {
            List<String> formatted = new ArrayList<>();
            for (String name : missing) formatted.add("{{" + name + "}}");
            throw new IllegalArgumentException("Master Prompt ขาดช่องแทนค่าบังคับ: " + String.join(", ", formatted));
        }
        // {{BUGGY_SOURCE}}: the AI gets the buggy version; {{SOURCE_CODE}}: the AI gets the fixed (reference) version.
        if (present.contains("BUGGY_SOURCE") == present.contains("SOURCE_CODE"))
            throw new IllegalArgumentException("Master Prompt ต้องมีช่อง source หนึ่งช่อง: {{BUGGY_SOURCE}} (ส่ง buggy) หรือ {{SOURCE_CODE}} (ส่ง fixed) อย่างใดอย่างหนึ่ง");
    }

    /** A template with {{SOURCE_CODE}} gives the AI the fixed version (the same reference the algorithms' fixed oracle uses). */
    static boolean usesFixedSource(String template) {
        return template != null && template.contains("{{SOURCE_CODE}}");
    }

    private static String sourceVersion(String template) { return usesFixedSource(template) ? "f" : "b"; }

    /** The source file a run's AI saw, newest naming first. */
    private static Path sourceShownFile(Path runDir) {
        for (String name : List.of("fixed-source-prompt.txt", "buggy-source-prompt.txt", "fixed-source.txt", "buggy-source.txt")) {
            Path file = runDir.resolve(name);
            if (Files.isRegularFile(file)) return file;
        }
        return runDir.resolve("buggy-source.txt");
    }

    private String composePrompt(String prompt, String source, String project, String bugId) {
        if (source == null || source.isBlank()) throw new IllegalArgumentException("ไม่มี source สำหรับใส่ใน prompt");
        validatePromptTemplate(prompt);
        source = trimSource(source);
        // No per-bug hint: the AI only gets the reference source (TARGET_* placeholders of older templates stay NOT_SPECIFIED).
        String targetClass = "NOT_SPECIFIED", targetMethod = "NOT_SPECIFIED", reportId = "NOT_SPECIFIED";
        // A template with its own {{CONCRETE_SUBCLASSES}} / {{API_OUTLINE}} sections gets them separately; otherwise they stay
        // appended to the source, as before.
        String subclasses = "NONE", outline = "NONE";
        if (prompt.contains("{{CONCRETE_SUBCLASSES}}") || prompt.contains("{{API_OUTLINE}}")) {
            // Line endings are mixed (CRLF project files, LF outline, a form resubmits CRLF): find the markers on any line start.
            int sub = markerAt(source, "// ===== CONCRETE SUBCLASSES of"), out = markerAt(source, "// ===== API OUTLINE of");
            if (out >= 0) outline = source.substring(out).trim();
            if (sub >= 0) subclasses = source.substring(sub, out > sub ? out : source.length()).trim();
            int cut = sub >= 0 && (out < 0 || sub < out) ? sub : out;
            if (cut >= 0) source = source.substring(0, cut);
        }
        Map<String, String> values = new java.util.HashMap<>(Map.of("PROJECT_ID", project, "BUG_ID", bugId, "BUG_REPORT_ID", reportId,
                "TARGET_CLASS", targetClass, "TARGET_METHOD", targetMethod, "BUGGY_SOURCE", source, "SOURCE_CODE", source,
                "CONCRETE_SUBCLASSES", subclasses, "API_OUTLINE", outline,
                "FRAMEWORK_NOTE", isJunit3(project) ? JUNIT3_NOTE : ""));
        if (prompt.contains("{{TEST_HEADER}}")) values.put("TEST_HEADER", testHeader(source, subclasses + "\n" + outline, isJunit3(project)));
        if (prompt.contains("{{PUBLIC_METHODS}}")) values.put("PUBLIC_METHODS", publicMethodList(source));
        // A template saved before v5 has no {{FRAMEWORK_NOTE}}: the note must still reach the model for these projects.
        if (isJunit3(project) && !prompt.contains("{{FRAMEWORK_NOTE}}")) prompt = JUNIT3_NOTE + "\n\n" + prompt;
        // One pass over the template: braces inside the buggy source (e.g. new int[][]{{1,2}}) are never treated as placeholders.
        Matcher placeholders = PROMPT_PLACEHOLDER.matcher(prompt);
        StringBuffer completed = new StringBuffer();
        while (placeholders.find()) {
            String value = values.get(placeholders.group(1).trim());
            if (value == null) throw new IllegalStateException("ยังมี prompt placeholder ที่ไม่ได้แทนค่า: {{" + placeholders.group(1) + "}}");
            placeholders.appendReplacement(completed, Matcher.quoteReplacement(value));
        }
        placeholders.appendTail(completed);
        return completed.toString();
    }

    private static final Pattern HEADER_IMPORT = Pattern.compile("(?m)^import\\s+([\\w.]+(?:\\.\\*)?)\\s*;");
    private static final Pattern HEADER_TYPE = Pattern.compile("(?m)^(?:public\\s+)?(?:final\\s+|abstract\\s+|strictfp\\s+)*(?:class|interface|enum)\\s+(\\w+)");
    private static final Pattern SOURCE_FILE = Pattern.compile("(?m)^// ===== SOURCE: ([\\w/$]+)\\.java =====");
    private static final Pattern OUTLINE_FILE = Pattern.compile("(?m)^// --- ([\\w/$]+)\\.java");

    /**
     * The first lines every generated test class must start with: the package of the class under test, the test framework
     * imports, and an import for each class whose name is certain (the imports of the class under test itself and the classes
     * of the API outline / concrete subclasses). Models then never have to guess a package name. Nothing here comes from
     * another version: it is derived from the text already in the prompt.
     */
    static String testHeader(String source, String outlineAndSubclasses, boolean junit3) {
        int end = source.indexOf("\n// ===== SOURCE:");
        String first = end < 0 ? source : source.substring(0, end);
        Matcher pkg = PACKAGE.matcher(first);
        String packageName = pkg.find() ? pkg.group(1) : "";
        Matcher type = HEADER_TYPE.matcher(Defects4jRunner.stripCommentsAndStrings(first));
        String testClass = (type.find() ? type.group(1) : "Generated") + "Test";
        java.util.LinkedHashMap<String, String> imports = new java.util.LinkedHashMap<>();   // simple name -> import target
        // further modified classes (other files of the supplied source) that live in another package
        Matcher others = SOURCE_FILE.matcher(source);
        while (others.find()) {
            String name = others.group(1).replace('/', '.');
            int dot = name.lastIndexOf('.');
            if (dot >= 0 && !name.substring(0, dot).equals(packageName)) imports.putIfAbsent(name.substring(dot + 1), name);
        }
        // the imports of the supplied source files themselves: names that certainly exist in this version
        Matcher own = HEADER_IMPORT.matcher(source);
        while (own.find()) {
            String name = own.group(1);
            imports.putIfAbsent(name.endsWith(".*") ? name : name.substring(name.lastIndexOf('.') + 1), name);
        }
        Matcher listed = OUTLINE_FILE.matcher(outlineAndSubclasses);
        while (listed.find()) {
            String name = listed.group(1).replace('/', '.');
            int dot = name.lastIndexOf('.');
            if (dot < 0 || name.substring(0, dot).equals(packageName)) continue;   // same package: no import needed
            imports.putIfAbsent(name.substring(dot + 1), name);
        }
        for (String reserved : List.of("Test", "Assert", "TestCase")) imports.remove(reserved);
        StringBuilder out = new StringBuilder();
        if (!packageName.isEmpty()) out.append("package ").append(packageName).append(";\n\n");
        if (junit3) out.append("import junit.framework.TestCase;\n");
        else out.append("import org.junit.Test;\nimport static org.junit.Assert.*;\n");
        for (String name : imports.values()) out.append("import ").append(name).append(";\n");
        out.append("\npublic class ").append(testClass).append(junit3 ? " extends TestCase {" : " {").append('\n');
        out.append(junit3
                ? "    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with \"test\", no annotation):\n    //     public void testWhatItChecks() throws Exception { ... }"
                : "    // test methods (as many as the instructions ask for), each exactly in this form:\n    //     @Test\n    //     public void testWhatItChecks() throws Exception { ... }");
        return out.toString();
    }

    private static int markerAt(String source, String marker) {
        Matcher m = Pattern.compile("(?m)^" + Pattern.quote(marker)).matcher(source);
        return m.find() ? m.start() : -1;
    }

    private String validateAiSuite(String javaText, String project, String bugId) {
        if (countTests(javaText) == 0) return isJunit3(project) ? "ไม่มี test method แบบ JUnit 3 (public void test...)" : "ไม่มี @Test method";
        return "";
    }

    private String extractJava(String response) {
        Matcher matcher = JAVA_BLOCK.matcher(response);
        while (matcher.find()) {
            String candidate = matcher.group(1).trim();
            if (candidate.contains("class ") && (TEST_ANNOTATION.matcher(candidate).find() || candidate.contains("TestCase"))) return candidate + "\n";
        }
        // Some models answer with bare Java (no ``` fence): take it from the package/import line to the last closing brace before
        // the report sections. Only the format is tolerated; the code itself is evaluated unchanged.
        Matcher start = Pattern.compile("(?m)^(package|import)\\s+[\\w.]+").matcher(response);
        if (!start.find()) return "";
        Matcher report = Pattern.compile("(?m)^\\s*(#+\\s*)?\\**\\s*1\\.\\s+SOURCE CODE ANALYSIS").matcher(response);
        int end = report.find(start.start()) ? report.start() : response.length();
        int close = response.lastIndexOf('}', end - 1);
        if (close <= start.start()) return "";
        String bare = response.substring(start.start(), close + 1).trim();
        return bare.contains("class ") && (TEST_ANNOTATION.matcher(bare).find() || bare.contains("TestCase")) ? bare + "\n" : "";
    }

    private boolean writeAiReport(String response, String javaText, Path reportPath) throws IOException {
        Matcher code = JAVA_BLOCK.matcher(response);
        String prose = code.find() ? response.substring(code.end()) : response;
        Matcher headings = AI_REPORT_HEADING.matcher(prose);
        Map<Integer, String> sections = new LinkedHashMap<>();
        int previousNumber = -1;
        int previousEnd = -1;
        while (headings.find()) {
            if (previousNumber >= 0) sections.put(previousNumber, prose.substring(previousEnd, headings.start()).trim());
            previousNumber = Integer.parseInt(headings.group(1));
            previousEnd = headings.end();
        }
        if (previousNumber >= 0) sections.put(previousNumber, prose.substring(previousEnd).trim());
        String[] names = {"", "SOURCE CODE ANALYSIS", "TEST CASE DESIGN", "JUNIT 4.12 TEST CODE",
                "DEFECT DETECTION STRATEGY", "SUMMARY", "LIMITATIONS"};
        StringBuilder assembled = new StringBuilder();
        boolean complete = true;
        for (int number = 1; number <= 6; number++) {
            assembled.append(number).append(". ").append(names[number]).append("\n\n");
            if (number == 3) assembled.append("```java\n").append(javaText.trim()).append("\n```\n\n");
            else {
                String section = sections.get(number);
                if (section == null || section.isBlank()) {
                    complete = false;
                    assembled.append("[Not supplied by the AI model.]\n\n");
                } else assembled.append(section).append("\n\n");
            }
        }
        Files.createDirectories(reportPath.getParent());
        Files.writeString(reportPath, assembled.toString(), StandardCharsets.UTF_8);
        return complete;
    }

    /** Records which prompt version and exact text (template + system instruction) a run used. */
    private void stampPrompt(RunState run, String template) {
        if (template == null || template.isBlank()) return;
        run.promptVersion = promptVersionOf(template);
        try {
            java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
            digest.update(template.getBytes(StandardCharsets.UTF_8));
            digest.update("\n---\n".getBytes(StandardCharsets.UTF_8));
            digest.update(openRouter.getSystemInstruction().getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder();
            for (byte b : digest.digest()) hex.append(String.format("%02x", b));
            run.promptSha256 = hex.toString();
        } catch (java.security.NoSuchAlgorithmException ignored) { }
    }

    /** model-<n>-<AI name from Settings>; the index keeps folders unique when two AIs share a name. */
    private void assignModelFolders(RunState run) {
        run.modelFolders.clear();
        for (int i = 0; i < run.models.size(); i++) {
            String name = slug(aiProviders.displayName(run.models.get(i)));
            if (name.length() > 60) name = name.substring(0, 60);
            run.modelFolders.add("model-" + (i + 1) + "-" + (name.isBlank() ? "ai" : name));
        }
    }
    private static String slug(String value) {
        return value == null ? "item" : value.trim().replaceAll("[^A-Za-z0-9._-]+", "-").replaceAll("^-|-$", "");
    }
    private List<Map<String, Object>> resultsWithDefectLinks(RunState run) {
        List<Map<String, Object>> results = run.snapshot();
        for (int index = 0; index < results.size(); index++) {
            Map<String, Object> row = results.get(index);
            Object value = row.get("benchmark");
            if (!(value instanceof Map) || !"COMPLETED".equals(((Map<?, ?>) value).get("status"))
                    || "skipped".equals(row.get("mode"))) continue;
            String folder = "algorithm".equals(row.get("mode"))
                    ? "algorithm-" + slug(String.valueOf(row.get("model")))
                    : run.modelFolders.get(index);
            row.put("defectDetailsUrl", "/defect-details?runId=" + encode(run.runId)
                    + "&methodFolder=" + encode(folder));
        }
        return results;
    }
    private static Object versionValue(Map<String, Object> analysis, String version, String key) {
        Object versions = analysis.get("versions");
        Object value = versions instanceof Map ? ((Map<?, ?>) versions).get(version) : null;
        return value instanceof Map ? ((Map<?, ?>) value).get(key) : null;
    }

    /** One short line per failing test method (name and the first line of its exception), for the defect page. */
    private static List<String> summarizeFailures(Map<String, Object> analysis, String version) {
        List<String> summary = new ArrayList<>();
        Object text = versionValue(analysis, version, "failingTests");
        if (!(text instanceof String)) return summary;
        String[] lines = ((String) text).split("\\R");
        for (int i = 0; i < lines.length; i++) {
            if (!lines[i].startsWith("--- ")) continue;
            String name = lines[i].substring(4).trim();
            name = name.substring(name.lastIndexOf('.') + 1);
            String reason = i + 1 < lines.length ? lines[i + 1].trim() : "";
            if (reason.isEmpty() || reason.startsWith("at ") || reason.startsWith("---")) reason = "(ไม่มีข้อความ)";
            summary.add(name + " — " + (reason.length() > 160 ? reason.substring(0, 160) + "…" : reason));
        }
        return summary;
    }
    private String methodLabel(RunState run, String folder) {
        if (folder.startsWith("algorithm-")) return algorithmLabel(folder.substring("algorithm-".length()));
        for (int i = 0; i < run.models.size(); i++) {
            if (folder.equals(run.modelFolders.get(i)))
                return aiProviders.displayName(run.models.get(i));
        }
        return folder;
    }
    private static Path benchmarkPath(Path methodDir) {
        Path separated = methodDir.resolve("report/benchmark.json");
        Path legacy = methodDir.resolve("benchmark.json");
        return Files.isRegularFile(separated) || !Files.isRegularFile(legacy) ? separated : legacy;
    }
    private void addAlgorithmSelectionAttributes(Model model, List<String> selected) {
        model.addAttribute("algorithmCatalog", algorithmSettings.getCatalog());
        model.addAttribute("selectedAlgorithms", selected);
        model.addAttribute("selectedAlgorithmLabels", selected.stream().map(AlgorithmSettingsService::label).collect(java.util.stream.Collectors.joining(" / ")));
    }
    private static String algorithmLabel(String algorithm) {
        return "Algorithm · " + AlgorithmSettingsService.label(algorithm);
    }
    private static String formatCost(double cost) {
        return Double.isNaN(cost) ? "ค่าใช้จ่ายไม่รายงาน" : "$" + String.format(java.util.Locale.ROOT, "%.6f", cost);
    }
    private static String formatSpeed(int outputTokens, long elapsedMs) {
        return outputTokens < 0 || elapsedMs <= 0 ? "ความเร็วไม่รายงาน"
                : String.format(java.util.Locale.ROOT, "%.2f output tokens/s", outputTokens * 1000.0 / elapsedMs);
    }
    private static String encode(String path) { return URLEncoder.encode(path, StandardCharsets.UTF_8).replace("+", "%20"); }
}
