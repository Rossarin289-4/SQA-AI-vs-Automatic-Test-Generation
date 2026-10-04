package edu.kku.sqa;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.function.Consumer;

/** Runs each generated suite against the paired Defects4J buggy/fixed checkouts. */
@Service
public class Defects4jRunner {
    private static final Pattern PACKAGE = Pattern.compile("(?m)^\\s*package\\s+([A-Za-z0-9_.]+)\\s*;");
    private static final Pattern CLASS_DECLARATION = Pattern.compile("\\bclass\\s+([A-Za-z_$][A-Za-z0-9_$]*)");
    private static final Pattern COMMENTS_AND_STRINGS = Pattern.compile("/\\*[\\s\\S]*?\\*/|//[^\\n]*|\"(?:\\\\.|[^\"\\\\\\n])*\"");
    private static final Pattern FAILING_TEST = Pattern.compile("(?m)^---\\s+([^\\s]+)");
    private static final Pattern JUNIT_TEST = Pattern.compile("@(?:org\\.junit\\.)?Test\\b");
    private final ObjectMapper mapper;
    private final String defects4j;
    private final GenericSearchTestGenerator searchGenerator;
    /** How many Defects4J evaluations may run at once (bench.parallelism, default 1 = strictly one at a time). */
    private final java.util.concurrent.Semaphore slots;
    /**
     * Separate slots for the short steps of an AI row (javac of one class, JUnit of one class on the compile-check
     * workspace). They took a full evaluation slot before and so queued behind 60-second algorithm searches on every round.
     */
    private final java.util.concurrent.Semaphore lightSlots;
    /** Keep the full Defects4J checkouts of every run (large). By default only logs, evidence files and the analysis stay. */
    private final boolean keepWorkspaces;

    public Defects4jRunner(ObjectMapper mapper,
            @Value("${bench.defects4j-command:defects4j}") String defects4j,
            GenericSearchTestGenerator searchGenerator,
            @Value("${bench.parallelism:1}") int parallelism,
            @Value("${bench.keep-workspaces:false}") boolean keepWorkspaces) {
        this.slots = new java.util.concurrent.Semaphore(Math.max(1, parallelism), true);
        this.lightSlots = new java.util.concurrent.Semaphore(Math.max(2, parallelism / 2), true);
        this.keepWorkspaces = keepWorkspaces;
        this.mapper = mapper;
        this.defects4j = defects4j;
        this.searchGenerator = searchGenerator;
    }

    public String extractBuggySource(String project, String bugId, Path runDir, Consumer<String> progress) throws Exception {
        return extractSource(project, bugId, "b", runDir, progress);
    }

    /**
     * Source of the modified classes (plus API outline and concrete subclasses) from one version: "b" buggy or "f" fixed.
     * Saved as buggy-source.txt or fixed-source.txt in runDir.
     */
    public String extractSource(String project, String bugId, String version, Path runDir, Consumer<String> progress) throws Exception {
        slots.acquire();
        try { return extractBuggySourceLocked(project, bugId, version, runDir, progress); }
        finally { slots.release(); }
    }

    /** Same as extractBuggySource but without waiting for a free evaluation slot: a short checkout for a prompt preview/export. */
    public String extractBuggySourceNow(String project, String bugId, Path runDir) throws Exception {
        return extractBuggySourceLocked(project, bugId, "b", runDir, ignored -> { });
    }

    public String extractSourceNow(String project, String bugId, String version, Path runDir) throws Exception {
        return extractBuggySourceLocked(project, bugId, version, runDir, ignored -> { });
    }

    static String sourceFileName(String version) { return "f".equals(version) ? "fixed-source.txt" : "buggy-source.txt"; }

    private String extractBuggySourceLocked(String project, String bugId, String version, Path runDir,
            Consumer<String> progress) throws Exception {
        if (!"b".equals(version) && !"f".equals(version)) throw new IllegalArgumentException("version ต้องเป็น b หรือ f");
        String side = "f".equals(version) ? "fixed" : "buggy";
        if (!project.matches("[A-Za-z][A-Za-z0-9]*") || !bugId.matches("[0-9]+"))
            throw new IllegalArgumentException("Project ต้องเป็น Defects4J ID และ Bug ID ต้องเป็นตัวเลข");
        Path base = runDir.resolve("defects4j-source").normalize();
        Path work = base.resolve("checkout");
        GenericSearchTestGenerator.deleteRecursively(work);
        Files.createDirectories(base);
        progress.accept("Checkout " + side + " version เพื่อดึง source จาก Defects4J");
        int checkout = runCommand(List.of(defects4j, "checkout", "-p", project,
                "-v", bugId + version, "-w", work.toString()), base, base.resolve("checkout.log"));
        if (checkout != 0) throw new IOException("Checkout " + side + " version ไม่สำเร็จ; ดู defects4j-source/checkout.log");
        String classes = exportProperty(work, "classes.modified", base.resolve("classes-modified.log"));
        String sourceDir = exportProperty(work, "dir.src.classes", base.resolve("source-dir.log"));
        Path sourceRoot = work.resolve(sourceDir.trim()).normalize();
        if (!sourceRoot.startsWith(work)) throw new IOException("Defects4J ส่ง source directory ที่ไม่ถูกต้อง");
        java.util.Set<Path> sourceFiles = new java.util.LinkedHashSet<>();
        for (String className : classes.split("\\s+")) {
            if (className.isBlank()) continue;
            String topLevelType = className.contains("$") ? className.substring(0, className.indexOf('$')) : className;
            Path file = sourceRoot.resolve(topLevelType.replace('.', '/') + ".java").normalize();
            if (file.startsWith(sourceRoot) && Files.isRegularFile(file)) sourceFiles.add(file);
        }
        if (sourceFiles.isEmpty()) throw new IOException("ไม่พบ source ของ classes.modified จาก Defects4J");
        StringBuilder source = new StringBuilder();
        java.util.Map<Path, String> modifiedTexts = new java.util.LinkedHashMap<>();
        for (Path file : sourceFiles) {
            if (source.length() > 0) source.append("\n\n// ===== SOURCE: ").append(sourceRoot.relativize(file)).append(" =====\n\n");
            String text = Files.readString(file, StandardCharsets.UTF_8);
            modifiedTexts.put(file.normalize(), text);
            source.append(text);
        }
        // Declarations of the other project classes the source uses (from the same checkout), so the model need not guess their API.
        try { source.append(ApiOutline.build(sourceRoot, modifiedTexts, "f".equals(version) ? "same version as the source above" : "buggy version")); }
        catch (RuntimeException e) { progress.accept("สร้าง API outline ไม่สำเร็จ (ข้าม): " + e); }
        Files.writeString(runDir.resolve(sourceFileName(version)), source.toString(), StandardCharsets.UTF_8);
        if (!keepWorkspaces) GenericSearchTestGenerator.deleteRecursively(work);   // only the source text is needed from this checkout
        return source.toString();
    }

    public List<String> listProjects() throws Exception {
        return runCatalogCommand(List.of(defects4j, "pids"), "Defects4J pids");
    }

    public List<String> listBugs(String project) throws Exception {
        if (project == null || !project.matches("[A-Za-z][A-Za-z0-9]*"))
            throw new IllegalArgumentException("Project ID ไม่ถูกต้อง");
        return runCatalogCommand(List.of(defects4j, "bids", "-p", project), "Defects4J bids");
    }

    private List<String> runCatalogCommand(List<String> command, String label) throws Exception {
        Path output = Files.createTempFile("testbench-defects4j-", ".txt");
        try {
            Process process = new ProcessBuilder(command).redirectErrorStream(true).redirectOutput(output.toFile()).start();
            if (!process.waitFor(Duration.ofSeconds(30).toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                process.destroyForcibly();
                throw new IOException(label + " ใช้เวลาเกิน 30 วินาที");
            }
            String text = Files.readString(output, StandardCharsets.UTF_8);
            if (process.exitValue() != 0) throw new IOException(label + " ไม่สำเร็จ: " + text.trim());
            LinkedHashSet<String> values = new LinkedHashSet<>();
            for (String token : text.split("\\s+")) {
                if (token.matches("[A-Za-z][A-Za-z0-9]*") && !token.equalsIgnoreCase("project")) values.add(token);
                else if (token.matches("[0-9]+")) values.add(token);
            }
            return new ArrayList<>(values);
        } finally { Files.deleteIfExists(output); }
    }

    private String exportProperty(Path work, String property, Path log) throws Exception {
        Path valueFile = log.resolveSibling(log.getFileName().toString() + ".value");
        int exit = runCommand(List.of(defects4j, "export", "-p", property, "-o", valueFile.toString(),
                "-w", work.toString()), work, log);
        if (exit != 0) throw new IOException("Defects4J export " + property + " ไม่สำเร็จ");
        return Files.readString(valueFile, StandardCharsets.UTF_8).trim();
    }

    /**
     * Compiles one generated test class against a checkout of the given version ("f" or "b") and returns javac's error text,
     * or an empty string when it compiles. The checkout in dir is prepared once and reused by later calls; call
     * releaseCompileCheck(dir) when done. Only compiler output of that one version is returned - nothing about test results.
     */
    public String compileErrors(String project, String bugId, String version, String javaSource, Path dir,
            Consumer<String> progress) throws Exception {
        Path work = dir.resolve("workspace");
        Path ready = dir.resolve("ready");
        Files.createDirectories(dir);
        if (!Files.isRegularFile(ready)) {
            // The one-time checkout and project build is a full Defects4J job; the javac rounds below are not.
            slots.acquire();
            try {
                GenericSearchTestGenerator.deleteRecursively(work);
                progress.accept("เตรียม " + project + "-" + bugId + version + " เพื่อตรวจว่า test class คอมไพล์ได้");
                if (runCommand(List.of(defects4j, "checkout", "-p", project, "-v", bugId + version, "-w", work.toString()), dir, dir.resolve("checkout.log")) != 0)
                    throw new IOException("Defects4J checkout ไม่สำเร็จ (compile check)");
                if (runCommand(List.of(defects4j, "compile", "-w", work.toString()), work, dir.resolve("compile.log")) != 0)
                    throw new IOException("Defects4J compile ไม่สำเร็จ (compile check)");
                Files.writeString(ready, exportProperty(work, "cp.test", dir.resolve("classpath.log")), StandardCharsets.UTF_8);
            } finally { slots.release(); }
        }
        lightSlots.acquire();
        try {
            String classpath = Files.readString(ready, StandardCharsets.UTF_8).trim();
            for (String home : new String[]{System.getenv("DEFECTS4J_HOME"), "/opt/defects4j"}) {
                if (home == null || home.isBlank()) continue;
                Path junit = Paths.get(home, "framework/projects/lib/junit-4.12-hamcrest-1.3.jar");
                if (Files.isRegularFile(junit)) { classpath += java.io.File.pathSeparator + junit; break; }
            }
            String className = findTestClassName(javaSource);
            if (className == null) return "no Java class found";
            Path sources = dir.resolve("src"), classes = dir.resolve("classes");
            GenericSearchTestGenerator.deleteRecursively(sources);
            GenericSearchTestGenerator.deleteRecursively(classes);
            Files.createDirectories(sources);
            Files.createDirectories(classes);
            Path file = sources.resolve(className + ".java");
            Files.writeString(file, javaSource, StandardCharsets.UTF_8);
            Path log = dir.resolve("javac.log");
            int exit = runCommand(List.of("javac", "-nowarn", "-proc:none", "-encoding", "UTF-8", "-Xmaxerrs", "30",
                    "-cp", classpath, "-d", classes.toString(), file.toString()), work, log);
            if (exit == 0) return "";
            String text = Files.readString(log, StandardCharsets.UTF_8).replace(file.toString(), className + ".java").trim();
            StringBuilder kept = new StringBuilder();
            for (String line : text.split("\\R")) if (!line.startsWith("Note: ") && !line.startsWith("warning: ")) kept.append(line).append('\n');
            text = kept.toString().trim();
            if (text.isEmpty()) text = "javac failed with exit code " + exit;
            return text.length() > 6000 ? text.substring(0, 6000) + "\n... (more errors omitted)" : text;
        } finally { lightSlots.release(); }
    }

    /**
     * Runs a test class that already compiled in the compile-check workspace (see compileErrors) on that same version and
     * returns the tests that fail there, one per line as "name: first line of the failure", or "" when all pass. Only the
     * reference version the AI was given is involved; nothing of the other version is run or returned.
     */
    public String referenceFailures(String project, String bugId, String version, String javaSource, Path dir,
            Consumer<String> progress) throws Exception {
        lightSlots.acquire();
        try {
            Path work = dir.resolve("workspace"), ready = dir.resolve("ready"), classes = dir.resolve("classes");
            if (!Files.isRegularFile(ready) || !Files.isDirectory(classes)) return "";
            String className = findTestClassName(javaSource);
            if (className == null) return "";
            Matcher pkg = PACKAGE.matcher(javaSource);
            String fqn = pkg.find() ? pkg.group(1) + "." + className : className;
            String classpath = Files.readString(ready, StandardCharsets.UTF_8).trim();
            for (String home : new String[]{System.getenv("DEFECTS4J_HOME"), "/opt/defects4j"}) {
                if (home == null || home.isBlank()) continue;
                Path junit = Paths.get(home, "framework/projects/lib/junit-4.12-hamcrest-1.3.jar");
                if (Files.isRegularFile(junit)) { classpath += java.io.File.pathSeparator + junit; break; }
            }
            progress.accept("รัน test class บน " + project + "-" + bugId + version + " (เวอร์ชันอ้างอิง) เพื่อหา test ที่ไม่ผ่าน");
            Path log = dir.resolve("reference-run.log");
            runCommand(List.of("timeout", "600", "java", "-Djava.awt.headless=true", "-Xmx1g",
                    "-cp", classes + java.io.File.pathSeparator + classpath, "org.junit.runner.JUnitCore", fqn), work, log);
            String out = Files.isRegularFile(log) ? Files.readString(log, StandardCharsets.UTF_8) : "";
            if (out.contains("\nOK (")) return "";
            StringBuilder report = new StringBuilder();
            Matcher m = Pattern.compile("(?m)^\\d+\\) (\\w+)\\(([^)]+)\\)\\R([^\\n]*)").matcher(out);
            int n = 0;
            while (m.find() && n < 40) {
                String message = m.group(3).trim();
                if (message.length() > 300) message = message.substring(0, 300) + "...";
                report.append(m.group(1)).append(": ").append(message.isEmpty() ? "failed" : message).append('\n');
                n++;
            }
            if (n == 0 && !out.contains("OK (")) report.append("the class could not be run: ").append(out.length() > 400 ? out.substring(0, 400) : out).append('\n');
            return report.toString().trim();
        } finally { lightSlots.release(); }
    }

    /**
     * Removes from a test class every top-level member (test method, helper method, nested class, field) that javac reported
     * an error in, and every import javac rejected; returns null when nothing could be removed. Used after the AI repair
     * rounds: the tests that do compile are still worth evaluating, and the removed ones are counted as not generated.
     */
    static String salvage(String source, String compilerErrors) {
        java.util.TreeSet<Integer> errorLines = new java.util.TreeSet<>();
        Matcher m = Pattern.compile("(?m)^[^\\n:]*\\.java:(\\d+): (?:error|\\u0e02\\u0e49\\u0e2d\\u0e1c\\u0e34\\u0e14\\u0e1e\\u0e25\\u0e32\\u0e14)").matcher(compilerErrors);
        while (m.find()) errorLines.add(Integer.parseInt(m.group(1)));
        if (errorLines.isEmpty()) return null;
        String[] lines = source.split("\n", -1);
        // depth of each line start (comments/strings stripped only for brace counting)
        String stripped = COMMENTS_AND_STRINGS.matcher(source).replaceAll(r -> r.group().replaceAll("[^\n]", " "));
        String[] bare = stripped.split("\n", -1);
        int[] depthAt = new int[bare.length + 1];
        int depth = 0;
        for (int i = 0; i < bare.length; i++) {
            depthAt[i] = depth;
            for (char c : bare[i].toCharArray()) { if (c == '{') depth++; else if (c == '}') depth--; }
        }
        // members of the top-level class: ranges of lines that start at depth 1 and run until depth returns to 1
        java.util.List<int[]> members = new java.util.ArrayList<>();
        int i = 0;
        while (i < bare.length) {
            if (depthAt[i] == 1 && !bare[i].isBlank() && !bare[i].trim().equals("}")) {
                int start = i;
                // annotations above the member belong to it
                int j = i;
                while (j < bare.length && !bare[j].contains("{") && !bare[j].contains(";")) j++;
                int end = j;
                if (j < bare.length && bare[j].contains("{")) { int k = j; while (k + 1 < bare.length && depthAt[k + 1] > 1) k++; end = k; }
                while (start > 0 && lines[start - 1].trim().startsWith("@")) start--;
                members.add(new int[]{start, end});
                i = end + 1;
            } else i++;
        }
        java.util.Set<Integer> drop = new java.util.HashSet<>();
        for (int line : errorLines) {
            int idx = line - 1;
            if (idx < 0 || idx >= lines.length) continue;
            boolean inMember = false;
            for (int[] r : members) if (idx >= r[0] && idx <= r[1]) { for (int x = r[0]; x <= r[1]; x++) drop.add(x); inMember = true; }
            if (!inMember && lines[idx].trim().startsWith("import ")) drop.add(idx);
        }
        if (drop.isEmpty()) return null;
        StringBuilder out = new StringBuilder();
        for (int x = 0; x < lines.length; x++) if (!drop.contains(x)) out.append(lines[x]).append('\n');
        return out.toString();
    }

    public void releaseCompileCheck(Path dir) {
        try { GenericSearchTestGenerator.deleteRecursively(dir.resolve("workspace")); Files.deleteIfExists(dir.resolve("ready")); }
        catch (IOException ignored) { }
    }

    /**
     * referenceFixed: the suite was generated from the fixed version, so tests that fail there are broken tests and are
     * removed (Defects4J's fix_test_suite) before the suite is run on the buggy version.
     */
    public Map<String, Object> evaluate(String project, String bugId, String javaSource,
            Path modelDir, String suiteName, boolean referenceFixed, Consumer<String> progress) {
        slots.acquireUninterruptibly();
        try { return evaluateLocked(project, bugId, javaSource, modelDir, suiteName, referenceFixed, progress); }
        finally { slots.release(); }
    }

    private Map<String, Object> evaluateLocked(String project, String bugId, String javaSource,
            Path modelDir, String suiteName, boolean referenceFixed, Consumer<String> progress) {
        Instant started = Instant.now();
        Map<String, Object> report = new LinkedHashMap<>();
        report.put("status", "ERROR");
        report.put("detection", "NOT_DETERMINED");
        report.put("defects4jVersion", installedVersion());
        report.put("startedAt", started.toString());
        try {
            if (!project.matches("[A-Za-z][A-Za-z0-9]*") || !bugId.matches("[0-9]+"))
                throw new IllegalArgumentException("Project ต้องเป็น Defects4J ID และ Bug ID ต้องเป็นตัวเลข");
            String className = findTestClassName(javaSource);
            if (className == null) throw new IllegalArgumentException("ไม่พบ Java test class ในไฟล์ที่สร้าง");
            String packageName = "";
            Matcher packageMatch = PACKAGE.matcher(javaSource);
            if (packageMatch.find()) packageName = packageMatch.group(1);
            String classId = packageName.isBlank() ? className : packageName + "." + className;
            Path base = modelDir.resolve("evaluation").normalize();
            Files.createDirectories(base);
            // One clean suite directory and one archive: exactly the same bytes are run on buggy and fixed.
            Path suiteRoot = modelDir.resolve("generated/original/suite-root");
            GenericSearchTestGenerator.deleteRecursively(suiteRoot);
            Path sourceDir = suiteRoot;
            if (!packageName.isBlank()) {
                for (String part : packageName.split("\\.")) sourceDir = sourceDir.resolve(part);
            }
            Files.createDirectories(sourceDir);
            Files.writeString(sourceDir.resolve(className + ".java"), javaSource, StandardCharsets.UTF_8);
            Path buggyDir = base.resolve("buggy");
            Files.createDirectories(buggyDir.resolve("logs"));
            progress.accept("เตรียม test suite สำหรับ " + project + "-" + bugId);
            int archiveExit = runCommand(List.of("tar", "-cjf", buggyDir.resolve("test-suite.tar.bz2").toString(), "-C", suiteRoot.toString(), "."),
                    buggyDir, buggyDir.resolve("logs/archive.log"));
            if (archiveExit != 0) throw new IOException("สร้าง Defects4J test archive ไม่สำเร็จ");
            report.put("project", project);
            report.put("bugId", bugId);
            report.put("testClass", classId);
            int testCount = 0;
            testCount = GenerationController.countTests(javaSource);
            report.put("uniqueTests", testCount);
            runPairedEvaluation(project, bugId, modelDir, classId, referenceFixed, report, progress);
        } catch (Exception e) {
            if (e instanceof InterruptedException) Thread.currentThread().interrupt();
            report.put("error", e.getMessage() == null ? e.toString() : e.getMessage());
        }
        report.put("elapsedMs", Duration.between(started, Instant.now()).toMillis());
        report.put("finishedAt", Instant.now().toString());
        try {
            writeBenchmark(modelDir, report);
        } catch (IOException e) {
            report.put("reportWriteError", e.getMessage());
        }
        finalizeEvidence(project, bugId, modelDir, report);
        return report;
    }

    public Map<String, Object> generateAlgorithm(String project, String bugId,
            String algorithm, int budgetSeconds, int repetition, String oracleVersion, Path modelDir, Consumer<String> progress) {
        slots.acquireUninterruptibly();
        try { return generateAlgorithmLocked(project, bugId, algorithm, budgetSeconds, repetition, oracleVersion, modelDir, progress); }
        finally { slots.release(); }
    }

    private Map<String, Object> generateAlgorithmLocked(String project, String bugId,
            String algorithm, int budgetSeconds, int repetition, String oracleVersion, Path modelDir, Consumer<String> progress) {
        Instant started = Instant.now();
        Map<String, Object> report = new LinkedHashMap<>();
        report.put("algorithm", algorithm);
        report.put("budgetSeconds", budgetSeconds);
        report.put("repetition", repetition);
        report.put("oracleVersion", "fixed".equals(oracleVersion) ? "fixed" : "buggy");
        report.put("status", "ERROR");
        report.put("detection", "NOT_DETERMINED");
        report.put("defects4jVersion", installedVersion());
        report.put("startedAt", started.toString());
        try {
            if (!project.matches("[A-Za-z][A-Za-z0-9]*") || !bugId.matches("[0-9]+"))
                throw new IllegalArgumentException("Project ต้องเป็น Defects4J ID และ Bug ID ต้องเป็นตัวเลข");
            if (!AlgorithmSettingsService.supports(algorithm))
                throw new IllegalArgumentException("ไม่รองรับ algorithm: " + algorithm);
            if (budgetSeconds < 10 || budgetSeconds > 3600)
                throw new IllegalArgumentException("budget ต้องอยู่ระหว่าง 10 ถึง 3600 วินาที");
            Path base = modelDir.resolve("evaluation").resolve("fitness").normalize();
            Files.createDirectories(base);
            GenericSearchTestGenerator.GeneratedSuite generated = searchGenerator.generate(project, bugId, algorithm,
                    budgetSeconds, repetition, "fixed".equals(oracleVersion) ? "fixed" : "buggy", base, modelDir, progress);
            report.putAll(generated.metrics);
            report.put("testClass", "generated.algorithm." + generated.className);
            Path buggyDir = modelDir.resolve("evaluation/buggy");
            Files.createDirectories(buggyDir.resolve("logs"));
            int archiveExit = runCommand(List.of("tar", "-cjf", buggyDir.resolve("test-suite.tar.bz2").toString(), "-C", generated.sourceRoot.toString(), "."),
                    buggyDir, buggyDir.resolve("logs/archive.log"));
            if (archiveExit != 0) throw new IOException("สร้าง Defects4J test archive ไม่สำเร็จ");
            runPairedEvaluation(project, bugId, modelDir, "generated.algorithm." + generated.className, "fixed".equals(oracleVersion), report, progress);
        } catch (Exception e) {
            if (e instanceof InterruptedException) Thread.currentThread().interrupt();
            report.put("error", e.getMessage() == null ? e.toString() : e.getMessage());
        }
        report.put("elapsedMs", Duration.between(started, Instant.now()).toMillis());
        report.put("finishedAt", Instant.now().toString());
        try {
            writeBenchmark(modelDir, report);
        } catch (IOException e) { report.put("reportWriteError", e.getMessage()); }
        finalizeEvidence(project, bugId, modelDir, report);
        return report;
    }

    /**
     * Runs the archive at evaluation/buggy/test-suite.tar.bz2 on the buggy and fixed checkouts. The fixed side gets a
     * byte-for-byte copy (same SHA-256). A failure on one version is recorded for that version and does not discard
     * the other version's results.
     */
    private void runPairedEvaluation(String project, String bugId, Path modelDir, String testClassId, boolean referenceFixed,
            Map<String, Object> report, Consumer<String> progress) throws Exception {
        Path buggyDir = modelDir.resolve("evaluation/buggy");
        Path fixedDir = modelDir.resolve("evaluation/fixed");
        Files.createDirectories(fixedDir.resolve("logs"));
        Path archiveB = buggyDir.resolve("test-suite.tar.bz2");
        if (referenceFixed) repairSuite(project, bugId, modelDir, archiveB, report, progress);
        Path archiveF = fixedDir.resolve("test-suite.tar.bz2");
        Files.copy(archiveB, archiveF, StandardCopyOption.REPLACE_EXISTING);
        String hash = sha256(archiveB);
        if (!hash.equals(sha256(archiveF))) throw new IOException("test archive ของ buggy และ fixed ไม่ตรงกัน");
        report.put("testSuiteSha256", hash);
        Map<String, Object> versions = new LinkedHashMap<>();
        runVersionSafely(project, bugId, "b", archiveB, buggyDir, testClassId, versions, progress);
        runVersionSafely(project, bugId, "f", archiveF, fixedDir, testClassId, versions, progress);
        report.put("versions", versions);
        report.put("testSuiteArchive", "evaluation/buggy/test-suite.tar.bz2");
        confirmDetections(versions, buggyDir, fixedDir, archiveB, archiveF, progress);
        report.put("status", "COMPLETED");
        classifyDetection(report, versions);
    }

    private static final Pattern REMOVED_TEST = Pattern.compile("(?m)^([\\w.$]+::[\\w$]+)\\s*$");
    private static final Pattern UNCOMPILABLE_CLASSES = Pattern.compile("Number of uncompilable test classes:\\s*(\\d+)");

    /**
     * Defects4J's own fix_test_suite.pl on the fixed version: test methods that fail there (wrong expected value, unstable
     * result) are replaced by empty methods until the suite passes five times in a row. The repaired archive is what both
     * versions run; the original is kept next to it. A suite that does not compile is left unchanged (it is reported as ERROR).
     */
    private void repairSuite(String project, String bugId, Path modelDir, Path archive, Map<String, Object> report,
            Consumer<String> progress) throws Exception {
        Map<String, Object> info = new LinkedHashMap<>();
        info.put("tool", "Defects4J framework/util/fix_test_suite.pl");
        info.put("version", project + "-" + bugId + "f");
        report.put("suiteRepair", info);
        Path script = null;
        for (String home : new String[]{System.getenv("DEFECTS4J_HOME"), "/opt/defects4j"}) {
            if (home == null || home.isBlank()) continue;
            Path candidate = Paths.get(home, "framework/util/fix_test_suite.pl");
            if (Files.isRegularFile(candidate)) { script = candidate; break; }
        }
        if (script == null) { info.put("status", "UNAVAILABLE"); return; }
        Path repair = modelDir.resolve("evaluation/repair");
        GenericSearchTestGenerator.deleteRecursively(repair);
        Path suites = repair.resolve("suites"), temporary = repair.resolve("tmp");
        Files.createDirectories(suites);
        Files.createDirectories(temporary);
        Files.copy(archive, modelDir.resolve("evaluation/original-test-suite.tar.bz2"), StandardCopyOption.REPLACE_EXISTING);
        Path working = suites.resolve(project + "-" + bugId + "f-testbench.1.tar.bz2");
        Files.copy(archive, working, StandardCopyOption.REPLACE_EXISTING);
        progress.accept("ตรวจ suite บน " + project + "-" + bugId + "f และตัด test ที่ไม่ผ่านบน fixed (Defects4J fix_test_suite)");
        int exit;
        try {
            exit = runCommand(List.of("perl", script.toString(), "-p", project, "-d", suites.toString(), "-v", bugId + "f",
                    "-t", temporary.toString()), repair, repair.resolve("fix_test_suite.log"));
        } finally {
            try { GenericSearchTestGenerator.deleteRecursively(temporary); } catch (IOException ignored) { }
        }
        Path summary = suites.resolve("fix_test_suite.summary.log");
        String text = Files.isRegularFile(summary) ? Files.readString(summary, StandardCharsets.UTF_8) : "";
        List<String> removed = new ArrayList<>();
        Matcher methods = REMOVED_TEST.matcher(text);
        while (methods.find()) removed.add(methods.group(1));
        Matcher uncompilable = UNCOMPILABLE_CLASSES.matcher(text);
        int brokenClasses = uncompilable.find() ? Integer.parseInt(uncompilable.group(1)) : 0;
        info.put("exitCode", exit);
        info.put("removedTests", removed);
        info.put("log", "evaluation/repair/suites/fix_test_suite.summary.log");
        if (exit != 0 || text.isBlank()) { info.put("status", "ERROR"); return; }
        if (brokenClasses > 0) { info.put("status", "UNCOMPILABLE"); return; }
        info.put("status", removed.isEmpty() ? "UNCHANGED" : "REPAIRED");
        if (!removed.isEmpty()) {
            Files.copy(working, archive, StandardCopyOption.REPLACE_EXISTING);
            report.put("removedTests", removed.size());
            Object total = report.get("uniqueTests");
            if (total instanceof Number) report.put("validTests", Math.max(0, ((Number) total).intValue() - removed.size()));
        }
    }

    private void runVersionSafely(String project, String bugId, String version, Path archive, Path dir, String testClassId,
            Map<String, Object> versions, Consumer<String> progress) throws Exception {
        try {
            runArchiveVersion(project, bugId, version, archive, dir, testClassId, versions, progress);
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e) {
            Map<String, Object> failed = new LinkedHashMap<>();
            failed.put("version", project + "-" + bugId + version);
            failed.put("testStatus", "ERROR");
            failed.put("error", e.getMessage() == null ? e.toString() : e.getMessage());
            versions.put(version, failed);
        }
    }

    /**
     * A detection must survive a second run of the same suite on both versions. A test that fails once on buggy
     * (or fails once on fixed) by chance is not evidence of a defect.
     */
    private void confirmDetections(Map<String, Object> versions, Path buggyDir, Path fixedDir, Path archiveB, Path archiveF,
            Consumer<String> progress) throws Exception {
        Map<String, Object> probe = new LinkedHashMap<>();
        classifyDetection(probe, versions);
        Object candidates = probe.get("detectedTests"), regressions = probe.get("regressionTests");
        boolean any = (candidates instanceof List && !((List<?>) candidates).isEmpty())
                || (regressions instanceof List && !((List<?>) regressions).isEmpty());
        if (!any) return;
        progress.accept("ยืนยัน detection: รัน suite เดิมซ้ำบน buggy และ fixed");
        rerunInto(versions, "b", buggyDir, archiveB);
        rerunInto(versions, "f", fixedDir, archiveF);
    }

    @SuppressWarnings("unchecked")
    private void rerunInto(Map<String, Object> versions, String version, Path dir, Path archive) throws Exception {
        if (!(versions.get(version) instanceof Map)) return;
        Map<String, Object> result = (Map<String, Object>) versions.get(version);
        Path work = dir.resolve("workspace");
        Files.deleteIfExists(work.resolve("failing_tests"));
        int exit = runCommand(List.of(defects4j, "test", "-w", work.toString(), "-s", archive.toString()), dir, dir.resolve("logs/test-rerun.log"));
        Path failing = work.resolve("failing_tests");
        boolean failed = Files.isRegularFile(failing) && Files.size(failing) > 0;
        result.put("rerunTestStatus", failed ? "FAIL" : (exit == 0 ? "PASS" : "ERROR"));
        result.put("rerunFailingTests", failed ? Files.readString(failing, StandardCharsets.UTF_8) : "");
    }

    static String sha256(Path file) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        StringBuilder hex = new StringBuilder();
        for (byte b : digest.digest(Files.readAllBytes(file))) hex.append(String.format("%02x", b));
        return hex.toString();
    }

    private static volatile String installedVersion;

    /** Defects4J version of this installation, read from its git tag (recorded in every result). */
    static String installedVersion() {
        if (installedVersion != null) return installedVersion;
        String found = "unknown";
        String home = System.getenv("DEFECTS4J_HOME");
        for (String directory : new String[]{home, "/opt/defects4j"}) {
            if (directory == null || directory.isBlank() || !new java.io.File(directory).isDirectory()) continue;
            try {
                Process process = new ProcessBuilder("git", "-C", directory, "describe", "--tags", "--abbrev=0")
                        .redirectErrorStream(true).start();
                if (!process.waitFor(5, java.util.concurrent.TimeUnit.SECONDS)) { process.destroyForcibly(); continue; }
                String tag = new String(process.getInputStream().readAllBytes(), StandardCharsets.UTF_8).trim();
                if (process.exitValue() == 0 && tag.matches("v?[0-9][0-9A-Za-z.\\-]*")) { found = tag.startsWith("v") ? tag.substring(1) : tag; break; }
            } catch (Exception ignored) { }
        }
        installedVersion = found;
        return found;
    }

    static String stripCommentsAndStrings(String source) {
        return COMMENTS_AND_STRINGS.matcher(source).replaceAll(" ");
    }

    private static final Pattern PUBLIC_TOP_LEVEL_CLASS = Pattern.compile("(?m)^public\\s+(?:final\\s+|abstract\\s+)*class\\s+([A-Za-z_$][A-Za-z0-9_$]*)");

    /**
     * The file name Java requires: the public top-level class (an answer may put helper classes before it), else the first
     * class declared; comments and string literals are ignored.
     */
    static String findTestClassName(String source) {
        String code = stripCommentsAndStrings(source);
        Matcher publicClass = PUBLIC_TOP_LEVEL_CLASS.matcher(code);
        if (publicClass.find()) return publicClass.group(1);
        Matcher matcher = CLASS_DECLARATION.matcher(code);
        return matcher.find() ? matcher.group(1) : null;
    }

    /**
     * Keeps the small evidence files and the defect analysis, then removes the (large) checkouts: a full dataset run would
     * otherwise need hundreds of GB. bench.keep-workspaces=true keeps everything.
     */
    @SuppressWarnings("unchecked")
    private void finalizeEvidence(String project, String bugId, Path modelDir, Map<String, Object> report) {
        try {
            Map<String, Object> analysis = createDefectAnalysis(project, bugId, modelDir);
            // Diagnostic for the experimenter (never an input of a generator): did the suite execute the lines of the fix?
            Map<String, Object> reach = patchCoverage(analysis, modelDir);
            if (reach != null) {
                report.put("patchCoverage", reach);
                writeBenchmark(modelDir, report);
            }
        } catch (Exception ignored) { /* best effort */ }
        if (keepWorkspaces) return;
        for (String side : List.of("buggy", "fixed")) {
            Path dir = modelDir.resolve("evaluation").resolve(side), workspace = dir.resolve("workspace");
            if (!Files.isDirectory(workspace)) continue;
            try {
                for (String name : List.of("failing_tests", "all_tests", "summary.csv")) {
                    Path file = workspace.resolve(name);
                    if (!Files.isRegularFile(file)) continue;
                    Files.createDirectories(dir.resolve("evidence"));
                    Files.copy(file, dir.resolve("evidence").resolve(name), StandardCopyOption.REPLACE_EXISTING);
                }
                GenericSearchTestGenerator.deleteRecursively(workspace);
            } catch (IOException ignored) { /* the checkout stays; nothing is lost */ }
        }
    }

    private static final Pattern COVERAGE_CLASS = Pattern.compile("<class [^>]*filename=\"([^\"]+)\"[^>]*>([\\s\\S]*?)</class>");
    private static final Pattern COVERAGE_LINE = Pattern.compile("<line number=\"(\\d+)\" hits=\"(\\d+)\"");

    /**
     * How many executable lines of the fix the suite ran: lines added/changed by the fix (on the fixed checkout) and lines the
     * fix removed/changed (on the buggy checkout). "reached" tells whether a miss is a coverage problem or an oracle/input one.
     */
    @SuppressWarnings("unchecked")
    private Map<String, Object> patchCoverage(Map<String, Object> analysis, Path modelDir) {
        if (!(analysis.get("locations") instanceof List)) return null;
        Map<String, Object> out = new LinkedHashMap<>();
        boolean any = false, reached = false;
        for (String[] side : new String[][]{{"fixed", "fixedChangedLines"}, {"buggy", "buggyChangedLines"}}) {
            Path xml = modelDir.resolve("evaluation").resolve(side[0]).resolve("workspace/coverage.xml");
            if (!Files.isRegularFile(xml)) continue;
            Map<String, Map<Integer, Integer>> hits = new java.util.HashMap<>();
            try {
                Matcher classes = COVERAGE_CLASS.matcher(Files.readString(xml, StandardCharsets.UTF_8));
                while (classes.find()) {
                    Map<Integer, Integer> lines = hits.computeIfAbsent(classes.group(1), k -> new java.util.HashMap<>());
                    Matcher line = COVERAGE_LINE.matcher(classes.group(2));
                    while (line.find()) lines.merge(Integer.parseInt(line.group(1)), Integer.parseInt(line.group(2)), Math::max);
                }
            } catch (IOException | RuntimeException e) { continue; }
            int executable = 0, covered = 0;
            for (Object item : (List<Object>) analysis.get("locations")) {
                if (!(item instanceof Map)) continue;
                Map<String, Object> location = (Map<String, Object>) item;
                Map<Integer, Integer> lines = hits.get(String.valueOf(location.get("file")));
                if (lines == null || !(location.get(side[1]) instanceof List)) continue;
                for (Object number : (List<Object>) location.get(side[1])) {
                    Integer count = number instanceof Number ? lines.get(((Number) number).intValue()) : null;
                    if (count == null) continue;
                    executable++;
                    if (count > 0) covered++;
                }
            }
            any = true;
            out.put(side[0] + "ExecutableChangedLines", executable);
            out.put(side[0] + "CoveredChangedLines", covered);
            if (covered > 0) reached = true;
        }
        if (!any) return null;
        out.put("reached", reached);
        return out;
    }

    /** Builds post-run evidence from Defects4J's paired checkouts; it never changes either checkout. */
    public Map<String, Object> createDefectAnalysis(String project, String bugId, Path modelDir)
            throws Exception {
        Path buggyWork = firstDirectory(modelDir.resolve("evaluation/buggy/workspace"),
                modelDir.resolve("defects4j/b"));
        Path fixedWork = firstDirectory(modelDir.resolve("evaluation/fixed/workspace"),
                modelDir.resolve("defects4j/f"));
        if (buggyWork == null || fixedWork == null) {
            Path cached = modelDir.resolve("report/bug-analysis.json");   // written while the checkouts still existed
            if (Files.isRegularFile(cached)) {
                @SuppressWarnings("unchecked") Map<String, Object> saved = mapper.readValue(cached.toFile(), Map.class);
                return saved;
            }
            throw new IOException("ยังไม่มีทั้ง buggy และ fixed checkout สำหรับดูตำแหน่ง defect");
        }

        Path reportDir = modelDir.resolve("report");
        Files.createDirectories(reportDir);
        String buggySourceDir = exportProperty(buggyWork, "dir.src.classes", reportDir.resolve("source-dir-buggy.log"));
        String fixedSourceDir = exportProperty(fixedWork, "dir.src.classes", reportDir.resolve("source-dir-fixed.log"));
        Path buggyRoot = buggyWork.resolve(buggySourceDir).normalize();
        Path fixedRoot = fixedWork.resolve(fixedSourceDir).normalize();
        if (!buggyRoot.startsWith(buggyWork) || !fixedRoot.startsWith(fixedWork))
            throw new IOException("Defects4J ส่ง source directory ที่ไม่ถูกต้อง");
        String modified = exportProperty(buggyWork, "classes.modified", reportDir.resolve("classes-modified.log"));
        LinkedHashSet<String> classes = new LinkedHashSet<>();
        for (String name : modified.split("\\s+")) if (!name.isBlank()) classes.add(name);

        StringBuilder patch = new StringBuilder();
        List<Map<String, Object>> locations = new ArrayList<>();
        for (String className : classes) {
            String topLevel = className.contains("$") ? className.substring(0, className.indexOf('$')) : className;
            String relative = topLevel.replace('.', '/') + ".java";
            Path buggyFile = buggyRoot.resolve(relative).normalize();
            Path fixedFile = fixedRoot.resolve(relative).normalize();
            if (!buggyFile.startsWith(buggyRoot) || !fixedFile.startsWith(fixedRoot)
                    || !Files.isRegularFile(buggyFile) || !Files.isRegularFile(fixedFile)) continue;

            String buggyRelative = modelDir.relativize(buggyFile).toString();
            String fixedRelative = modelDir.relativize(fixedFile).toString();
            Process process = new ProcessBuilder("git", "diff", "--no-index", "--no-ext-diff", "--unified=5", "--",
                    buggyRelative, fixedRelative)
                    .directory(modelDir.toFile()).redirectErrorStream(true).start();
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            try (var input = process.getInputStream()) { input.transferTo(output); }
            if (!process.waitFor(Duration.ofMinutes(2).toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                process.destroyForcibly();
                throw new IOException("อ่าน diff ของ " + relative + " ใช้เวลาเกิน 2 นาที");
            }
            int exit = process.exitValue();
            if (exit > 1) throw new IOException("สร้าง diff ของ " + relative + " ไม่สำเร็จ: " + output.toString(StandardCharsets.UTF_8));
            String filePatch = output.toString(StandardCharsets.UTF_8);
            if (exit == 1 && !filePatch.isBlank()) {
                filePatch = filePatch.replace(buggyRelative, "a/" + relative)
                        .replace(fixedRelative, "b/" + relative);
                filePatch = filePatch.replace("diff --git a/a/" + relative + " b/b/" + relative,
                        "diff --git a/" + relative + " b/" + relative)
                        .replace("--- a/a/" + relative, "--- a/" + relative)
                        .replace("+++ b/b/" + relative, "+++ b/" + relative);
                patch.append(filePatch).append('\n');
                locations.addAll(readPatchLocations(relative, filePatch));
            }
        }

        Path patchFile = reportDir.resolve("fix.patch");
        Files.writeString(patchFile, patch.toString(), StandardCharsets.UTF_8);
        Map<String, Object> analysis = new LinkedHashMap<>();
        analysis.put("project", project);
        analysis.put("bugId", bugId);
        analysis.put("source", "Defects4J buggy-to-fixed source diff");
        analysis.put("classesModified", new ArrayList<>(classes));
        analysis.put("locations", locations);
        analysis.put("patchFile", "report/fix.patch");
        analysis.put("patchAvailable", patch.length() > 0);
        analysis.put("explanation", patch.length() > 0
                ? "บรรทัดที่ขึ้นต้นด้วย - คือโค้ดใน buggy version; บรรทัดที่ขึ้นต้นด้วย + คือโค้ดใน fixed version ของ Defects4J"
                : "Defects4J ระบุคลาสที่เกี่ยวข้อง แต่ไม่พบ source diff ใน checkout นี้");

        Path benchmark = Files.isRegularFile(reportDir.resolve("benchmark.json"))
                ? reportDir.resolve("benchmark.json") : modelDir.resolve("benchmark.json");
        if (Files.isRegularFile(benchmark)) {
            @SuppressWarnings("unchecked") Map<String, Object> report = mapper.readValue(benchmark.toFile(), Map.class);
            analysis.put("detection", report.get("detection"));
            analysis.put("testClass", report.get("testClass"));
            analysis.put("versions", report.get("versions"));
        }
        mapper.writerWithDefaultPrettyPrinter().writeValue(reportDir.resolve("bug-analysis.json").toFile(), analysis);
        return analysis;
    }

    private Path firstDirectory(Path currentLayout, Path legacyLayout) {
        if (Files.isDirectory(currentLayout)) return currentLayout;
        if (Files.isDirectory(legacyLayout)) return legacyLayout;
        return null;
    }

    private List<Map<String, Object>> readPatchLocations(String file, String patch) {
        List<Map<String, Object>> result = new ArrayList<>();
        Pattern hunk = Pattern.compile("(?m)^@@ -(\\d+)(?:,(\\d+))? \\+(\\d+)(?:,(\\d+))? @@(.*)$");
        String[] lines = patch.split("\\R");
        for (int index = 0; index < lines.length; index++) {
            Matcher matcher = hunk.matcher(lines[index]);
            if (!matcher.matches()) continue;
            int buggyLine = Integer.parseInt(matcher.group(1));
            int fixedLine = Integer.parseInt(matcher.group(3));
            int buggyAnchor = -1;
            int fixedAnchor = -1;
            List<Integer> buggyChanges = new ArrayList<>();
            List<Integer> fixedChanges = new ArrayList<>();
            int next = index + 1;
            while (next < lines.length && !lines[next].startsWith("@@ ") && !lines[next].startsWith("diff --git ")) {
                String line = lines[next++];
                if (line.isEmpty() || line.charAt(0) == '\\') continue;
                char kind = line.charAt(0);
                if (kind == ' ') { buggyLine++; fixedLine++; }
                else if (kind == '-') {
                    if (fixedAnchor < 0) fixedAnchor = fixedLine;
                    buggyChanges.add(buggyLine++);
                } else if (kind == '+') {
                    if (buggyAnchor < 0) buggyAnchor = buggyLine;
                    fixedChanges.add(fixedLine++);
                }
            }
            Map<String, Object> location = new LinkedHashMap<>();
            location.put("file", file);
            int firstBuggyLine = buggyChanges.isEmpty()
                    ? (buggyAnchor < 0 ? Integer.parseInt(matcher.group(1)) : buggyAnchor) : buggyChanges.get(0);
            int firstFixedLine = fixedChanges.isEmpty()
                    ? (fixedAnchor < 0 ? Integer.parseInt(matcher.group(3)) : fixedAnchor) : fixedChanges.get(0);
            location.put("buggyLine", firstBuggyLine);
            location.put("fixedLine", firstFixedLine);
            location.put("buggyChangedLines", buggyChanges);
            location.put("fixedChangedLines", fixedChanges);
            location.put("buggyLocation", buggyChanges.isEmpty() ? "insertion near line " + firstBuggyLine
                    : "changed line(s) " + buggyChanges);
            location.put("fixedLocation", fixedChanges.isEmpty() ? "deletion near line " + firstFixedLine
                    : "changed line(s) " + fixedChanges);
            location.put("context", matcher.group(5).trim());
            result.add(location);
            index = next - 1;
        }
        return result;
    }

    private void runArchiveVersion(String project, String bugId, String version, Path archive, Path base,
            String testClassId, Map<String, Object> versions, Consumer<String> progress) throws Exception {
        String versionId = project + "-" + bugId + version;
        Path work = base.resolve("workspace");
        Path logs = base.resolve("logs");
        Files.createDirectories(logs);
        // A leftover checkout would make defects4j refuse the target or reuse stale results.
        GenericSearchTestGenerator.deleteRecursively(work);
        progress.accept("Checkout Defects4J " + versionId);
        long checkoutStarted = System.nanoTime();
        int checkoutExit = runCommand(List.of(defects4j, "checkout", "-p", project, "-v", bugId + version, "-w", work.toString()), base,
                logs.resolve("checkout.log"));
        if (checkoutExit != 0) throw new IOException("Defects4J checkout " + versionId + " ไม่สำเร็จ; ดู logs/checkout.log");
        Path testLog = logs.resolve("test.log");
        progress.accept("รัน test บน " + versionId);
        long testStarted = System.nanoTime();
        int testExit = runCommand(List.of(defects4j, "test", "-w", work.toString(), "-s", archive.toString()), base, testLog);
        long testElapsedMs = Duration.ofNanos(System.nanoTime() - testStarted).toMillis();
        Path failingTests = work.resolve("failing_tests");
        boolean failed = Files.isRegularFile(failingTests) && Files.size(failingTests) > 0;
        String failingText = failed ? Files.readString(failingTests, StandardCharsets.UTF_8) : "";
        // Only class-level failures (e.g. initializationError) mean the suite never ran: not a FAIL of any test method.
        boolean suiteNotRunnable = failed && failingTestIds(failingText).isEmpty();
        String testStatus = suiteNotRunnable ? "ERROR" : failed ? "FAIL" : (testExit == 0 ? "PASS" : "ERROR");
        // Defects4J lists every executed test in all_tests; a green run that executed none of our tests proves nothing.
        int executedTests = -1;
        Path allTests = work.resolve("all_tests");
        if (Files.isRegularFile(allTests)) {
            executedTests = 0;
            for (String line : Files.readAllLines(allTests, StandardCharsets.UTF_8))
                if (line.contains("(" + testClassId + ")") && !line.startsWith("initializationError(")) executedTests++;
        }
        if ("PASS".equals(testStatus) && executedTests == 0) testStatus = "NO_TESTS";

        Path coverageLog = logs.resolve("coverage.log");
        progress.accept("วัด coverage บน " + versionId);
        long coverageStarted = System.nanoTime();
        int coverageExit = runCommand(List.of(defects4j, "coverage", "-w", work.toString(),
                "-s", archive.toString()), base, coverageLog);
        long coverageElapsedMs = Duration.ofNanos(System.nanoTime() - coverageStarted).toMillis();
        String side = "b".equals(version) ? "buggy" : "fixed";
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("version", versionId);
        result.put("checkoutElapsedMs", Duration.ofNanos(testStarted - checkoutStarted).toMillis());
        result.put("testStatus", testStatus);
        result.put("testElapsedMs", testElapsedMs);
        result.put("testExitCode", testExit);
        result.put("executedTests", executedTests);
        result.put("failingTests", failingText);
        if (suiteNotRunnable) result.put("error", "test suite รันไม่ได้ (ไม่มี test method ที่ถูกรัน): "
                + String.join(" · ", failingText.lines().limit(2).toArray(String[]::new)));
        result.put("testLog", "evaluation/" + side + "/logs/test.log");
        result.put("coverageStatus", coverageExit == 0 ? "COMPLETED" : "ERROR");
        result.put("coverageElapsedMs", coverageElapsedMs);
        result.put("coverageLog", "evaluation/" + side + "/logs/coverage.log");
        Path summary = work.resolve("summary.csv");
        if (coverageExit == 0 && Files.isRegularFile(summary)) {
            try { result.put("coverage", readCoverage(summary)); }
            catch (Exception e) { result.put("coverageStatus", "ERROR"); result.put("coverageError", e.getMessage() == null ? e.toString() : e.getMessage()); }
        }
        versions.put(version, result);
    }

    /** Reads Defects4J's summary.csv by header name; a zero total is "not measured", not 0%. */
    private Map<String, Object> readCoverage(Path csv) throws IOException {
        List<String> lines = Files.readAllLines(csv, StandardCharsets.UTF_8);
        if (lines.size() < 2) throw new IOException("Defects4J summary.csv has no data row");
        String[] header = lines.get(0).trim().split(",");
        String[] values = lines.get(1).trim().split(",");
        long linesTotal = column(header, values, "LinesTotal", 0);
        long linesCovered = column(header, values, "LinesCovered", 1);
        long branchesTotal = column(header, values, "ConditionsTotal", 2);
        long branchesCovered = column(header, values, "ConditionsCovered", 3);
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("linesTotal", linesTotal); result.put("linesCovered", linesCovered);
        result.put("lineCoveragePercent", linesTotal == 0 ? null : linesCovered * 100.0 / linesTotal);
        result.put("branchesTotal", branchesTotal); result.put("branchesCovered", branchesCovered);
        result.put("branchCoveragePercent", branchesTotal == 0 ? null : branchesCovered * 100.0 / branchesTotal);
        return result;
    }

    private static long column(String[] header, String[] values, String name, int fallbackIndex) throws IOException {
        int index = fallbackIndex;
        for (int i = 0; i < header.length; i++) if (header[i].trim().equalsIgnoreCase(name)) { index = i; break; }
        if (index >= values.length) throw new IOException("Unexpected Defects4J summary.csv format: missing " + name);
        try { return Long.parseLong(values[index].trim()); }
        catch (NumberFormatException e) { throw new IOException("Defects4J summary.csv column " + name + " is not a number: " + values[index]); }
    }

    private void writeBenchmark(Path modelDir, Map<String, Object> report) throws IOException {
        Path reportDir = modelDir.resolve("report");
        Files.createDirectories(reportDir);
        mapper.writerWithDefaultPrettyPrinter().writeValue(reportDir.resolve("benchmark.json").toFile(), report);
        // Keep a root-level copy for compatibility with runs created before the separated layout.
        mapper.writerWithDefaultPrettyPrinter().writeValue(modelDir.resolve("benchmark.json").toFile(), report);
    }

    /** The experiment criterion applies to each test method, even when another test fails on fixed. */
    @SuppressWarnings("unchecked")
    public static void classifyDetection(Map<String, Object> report, Map<String, Object> versions) {
        Map<String, Object> buggy = versions.get("b") instanceof Map ? (Map<String, Object>) versions.get("b") : Map.of();
        Map<String, Object> fixed = versions.get("f") instanceof Map ? (Map<String, Object>) versions.get("f") : Map.of();
        String buggyStatus = String.valueOf(buggy.getOrDefault("testStatus", "ERROR"));
        String fixedStatus = String.valueOf(fixed.getOrDefault("testStatus", "ERROR"));
        if (!("PASS".equals(buggyStatus) || "FAIL".equals(buggyStatus))
                || !("PASS".equals(fixedStatus) || "FAIL".equals(fixedStatus))) {
            report.put("detection", "NOT_DETERMINED");
            report.put("detectedTests", List.of());
            report.put("fixedSuitePasses", false);
            return;
        }
        LinkedHashSet<String> buggyFailures = failingTestIds(String.valueOf(buggy.getOrDefault("failingTests", "")));
        LinkedHashSet<String> fixedFailures = failingTestIds(String.valueOf(fixed.getOrDefault("failingTests", "")));
        LinkedHashSet<String> buggyConfirmed = new LinkedHashSet<>(buggyFailures), fixedConfirmed = new LinkedHashSet<>(fixedFailures);
        if (buggy.containsKey("rerunFailingTests") && fixed.containsKey("rerunFailingTests")) {
            LinkedHashSet<String> buggyAgain = failingTestIds(String.valueOf(buggy.get("rerunFailingTests")));
            LinkedHashSet<String> fixedAgain = failingTestIds(String.valueOf(fixed.get("rerunFailingTests")));
            // detection: failed on both buggy runs and on neither fixed run
            buggyFailures.retainAll(buggyAgain);
            fixedFailures.addAll(fixedAgain);
            // regression: failed on both fixed runs and on neither buggy run
            fixedConfirmed.retainAll(fixedAgain);
            buggyConfirmed.addAll(buggyAgain);
            report.put("detectionConfirmedByRerun", true);
        }
        List<String> detected = new ArrayList<>();
        for (String test : buggyFailures) if (!fixedFailures.contains(test)) detected.add(test);
        // The reverse direction (passes on buggy, fails on fixed) shows the two versions behave differently under this
        // suite. It is reported separately and is never counted as a detection.
        List<String> regression = new ArrayList<>();
        for (String test : fixedConfirmed) if (!buggyConfirmed.contains(test)) regression.add(test);
        report.put("regressionTests", regression);
        report.put("behaviorDiffers", !detected.isEmpty() || !regression.isEmpty());
        report.put("detectedTests", detected);
        report.put("fixedSuitePasses", "PASS".equals(fixedStatus));
        report.put("detection", detected.isEmpty() ? "NOT_DETECTED" : "BUGGY_FAIL_FIXED_PASS");
    }

    /** Test-method failures only: class-level entries (initialization errors) say nothing about a specific defect. */
    private static LinkedHashSet<String> failingTestIds(String failingTests) {
        LinkedHashSet<String> ids = new LinkedHashSet<>();
        Matcher matcher = FAILING_TEST.matcher(failingTests);
        while (matcher.find()) {
            String id = matcher.group(1);
            if (!id.contains("::") || id.endsWith("::initializationError") || id.endsWith("::classMethod")) continue;
            ids.add(id);
        }
        return ids;
    }

    private int runCommand(List<String> command, Path cwd, Path log) throws IOException, InterruptedException {
        Process process = new ProcessBuilder(new ArrayList<>(command)).directory(cwd.toFile())
                .redirectInput(ProcessBuilder.Redirect.from(new java.io.File("/dev/null")))
                .redirectErrorStream(true).redirectOutput(log.toFile()).start();
        ProcessRegistry.register(process, cwd);
        try {
            if (!process.waitFor(Duration.ofMinutes(90).toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                killTree(process);
                throw new IOException("คำสั่งใช้เวลาเกิน 90 นาที: " + command.get(0) + " (ดู " + log.getFileName() + ")");
            }
        } catch (InterruptedException e) {
            killTree(process);
            throw e;
        } finally {
            ProcessRegistry.unregister(process);
        }
        return process.exitValue();
    }

    /** defects4j is a perl wrapper around ant/JVMs; killing only the wrapper would leave those children running. */
    private static void killTree(Process process) {
        process.descendants().forEach(ProcessHandle::destroyForcibly);
        process.destroyForcibly();
    }

}
