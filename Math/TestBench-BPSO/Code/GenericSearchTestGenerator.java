package edu.kku.sqa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Search-based test generation through the public/protected/package API of Defects4J's modified classes.
 * SA, BPSO, GA and Random Search share one candidate encoding, one fitness function and one worker JVM;
 * the final suite is replayed in a fresh JVM (reverse order) so only reproducible outcomes become assertions.
 */
@Service
public class GenericSearchTestGenerator {
    /** bench.test-seeding: seed the search with inputs mined from the project's own tests and factory-made objects (round 2). */
    private final boolean testSeeding;
    /** A generated JUnit class: where its source tree is, its simple name, the source text and the search metrics. */
    public static final class GeneratedSuite {
        public final Path sourceRoot; public final String className, source; public final Map<String,Object> metrics;
        GeneratedSuite(Path sourceRoot, String className, String source, Map<String,Object> metrics) { this.sourceRoot=sourceRoot; this.className=className; this.source=source; this.metrics=metrics; }
    }

    static final int MAX_TESTS = 300;
    static final int MAX_TESTS_PER_TARGET = 10;
    static final int STAGNATION_EVALUATIONS = 3000;
    /** The first call in a worker JVM loads the project's classes; later calls normally take well under a millisecond. */
    static final long FIRST_CALL_TIMEOUT_MS = 10_000, CALL_TIMEOUT_MS = 1_500;
    /** Defects4J sets this time zone for every test run (framework/core/Constants.pm). */
    static final String DEFECTS4J_TIMEZONE = "America/Los_Angeles";
    private final String defects4j;
    private final boolean keepWorkspaces;
    private final Set<String> junit3Projects;
    /** JaCoCo agent shipped with Defects4J: gives the search the probes (branches/lines) each call executes. */
    private final String coverageAgent;
    public GenericSearchTestGenerator(@Value("${bench.defects4j-command:defects4j}") String defects4j,
            @Value("${bench.keep-workspaces:false}") boolean keepWorkspaces,
            @Value("${bench.junit3-projects:Cli}") String junit3Projects,
            @Value("${bench.coverage-agent:/opt/defects4j/framework/lib/test_generation/generation/jacocoagent.jar}") String coverageAgent,
            @Value("${bench.test-seeding:false}") boolean testSeeding) {
        this.coverageAgent = coverageAgent;
        this.testSeeding = testSeeding;
        this.defects4j = defects4j;
        this.keepWorkspaces = keepWorkspaces;
        this.junit3Projects = new HashSet<>(Arrays.asList(junit3Projects.trim().split("\\s*,\\s*")));
    }

    /**
     * oracleVersion "buggy" (default) records the expected values from the buggy version; "fixed" records them from the
     * fixed version (reference oracle). The suite is then evaluated on both versions the same way. Only the algorithms
     * use the fixed version for this; AI prompts never see it.
     */
    public GeneratedSuite generate(String project, String bugId, String algorithm,
            int budgetSeconds, int repetition, String oracleVersion, Path base, Path modelDir, Consumer<String> progress) throws Exception {
        Files.createDirectories(base);
        boolean fixedOracle = "fixed".equals(oracleVersion);
        String suffix = fixedOracle ? "f" : "b";
        Path work = base.resolve(fixedOracle ? "search-fixed" : "search-buggy");
        deleteRecursively(work);
        try {
        progress.accept("Checkout และ compile " + project + "-" + bugId + suffix + " เพื่อค้นหา public API (oracle จากเวอร์ชัน " + (fixedOracle ? "fixed" : "buggy") + ")");
        command(List.of(defects4j, "checkout", "-p", project, "-v", bugId + suffix, "-w", work.toString()), base, base.resolve("search-checkout.log"));
        command(List.of(defects4j, "compile", "-w", work.toString()), work, base.resolve("search-compile.log"));
        Path cpFile = base.resolve("search-classpath.txt");
        command(List.of(defects4j, "export", "-p", "cp.test", "-o", cpFile.toString(), "-w", work.toString()), work, base.resolve("search-classpath.log"));
        String cp = Files.readString(cpFile, StandardCharsets.UTF_8).trim();
        if (cp.isBlank()) throw new IOException("Defects4J ไม่ได้ส่ง test classpath");
        Path binFile = base.resolve("search-bin-classes.txt");
        command(List.of(defects4j, "export", "-p", "dir.bin.classes", "-o", binFile.toString(), "-w", work.toString()), work, base.resolve("search-bin-classes.log"));
        Path classesDir = work.resolve(Files.readString(binFile, StandardCharsets.UTF_8).trim()).normalize();
        Path classesFile = base.resolve("classes-modified.txt");
        command(List.of(defects4j, "export", "-p", "classes.modified", "-o", classesFile.toString(), "-w", work.toString()), work, base.resolve("classes-modified.log"));
        // Nested classes are kept as targets and their outer class is added, so a fix inside Outer$Inner is not lost.
        LinkedHashSet<String> modifiedSet = new LinkedHashSet<>();
        for (String name : Files.readString(classesFile, StandardCharsets.UTF_8).split("\\s+")) {
            if (name.isBlank()) continue;
            modifiedSet.add(name);
            if (name.contains("$")) modifiedSet.add(name.substring(0, name.indexOf('$')));
        }
        if (modifiedSet.isEmpty()) throw new IOException("Defects4J ไม่พบ classes.modified");
        List<String> modified = new ArrayList<>(modifiedSet);
        Collections.sort(modified);
        Path classNames = base.resolve("search-target-classes.txt");
        Files.write(classNames, modified, StandardCharsets.UTF_8);
        long seed = seed(project, bugId, algorithm, repetition);
        Map<String,Object> metrics = new LinkedHashMap<>();
        String agent = null;
        if (Files.isRegularFile(Paths.get(coverageAgent))) {
            StringJoiner includes = new StringJoiner(":");
            for (String name : modified) if (!name.contains("$")) { includes.add(name); includes.add(name + "$*"); }
            agent = "-javaagent:" + coverageAgent + "=output=none,dumponexit=false,includes=" + includes;
        }
        try (Worker worker = new Worker(work, base, cp, classesDir, agent)) {
            List<Target> targets = worker.discover(classNames);
            metrics.put("testSeeding", testSeeding);
            if (testSeeding && !targets.isEmpty()) metrics.put("testSeeds", seedFromProjectTests(work, base, modified, targets.get(0).literals));
            if (targets.isEmpty()) throw new IOException("ไม่พบ method ที่รองรับใน classes.modified · เหตุผลที่ข้าม: " + worker.skipSummary(12));
            progress.accept(AlgorithmSettingsService.label(algorithm) + " ค้นหา inputs สำหรับ " + targets.size() + " methods");
            Search search = new Search(worker, targets, algorithm, budgetSeconds, seed, progress);
            search.run();
            if (search.suite.isEmpty()) throw new IOException("ค้นหาไม่พบ test input ที่ประเมินผลซ้ำได้ (ข้าม " + search.skipped + " evaluations)");
            progress.accept("ตรวจซ้ำ " + search.suite.size() + " tests ใน JVM ใหม่ (เรียงย้อนกลับ)");
            LinkedHashMap<String,Eval> verified;
            try (Worker verifier = new Worker(work, base, cp, classesDir, agent)) { verified = verify(verifier, targets, search.suite); }
            if (verified.isEmpty()) throw new IOException("ไม่มี test ที่ให้ผลเหมือนเดิมเมื่อตรวจซ้ำ (ผลไม่คงที่หรือขึ้นกับ state)");
            String simpleName = algorithmClassPrefix(algorithm) + "GeneratedTest";
            Path sourceRoot = modelDir.resolve("generated/original/suite-root");
            deleteRecursively(sourceRoot);
            Path packageDir = sourceRoot.resolve("generated/algorithm");
            Files.createDirectories(packageDir);
            boolean junit3 = junit3Projects.contains(project);
            String java = render(simpleName, targets, verified, junit3);
            writeInputFactory(packageDir);
            Files.writeString(packageDir.resolve(simpleName + ".java"), java, StandardCharsets.UTF_8);
            writeCsv(modelDir.resolve("generated/original/test-inputs.csv"), targets, verified);
            metrics.put("algorithm", AlgorithmSettingsService.label(algorithm));
            metrics.put("algorithmVariant", AlgorithmSettingsService.label(algorithm));
            metrics.put("searchStrategy", algorithm.equals("pso") ? "binary particle swarm: bits decode to a pool value plus up to two typed edits per argument; sigmoid bit updates toward pBest/gBest"
                    : algorithm.equals("ga") ? "population selection, crossover, and mutation" : algorithm.equals("random") ? "uniform random candidate sampling"
                    : "simulated annealing over concrete inputs: one small typed value change per move, geometric cooling with restarts");
            metrics.put("searchMode", "generic-public-api");
            metrics.put("testStyle", junit3 ? "JUnit 3 (TestCase)" : "JUnit 4");
            metrics.put("targetClasses", modified.size());
            metrics.put("supportedPublicMethods", targets.size());
            metrics.put("skippedClasses", worker.skips.size());
            metrics.put("bytecodeLiterals", worker.literalCount);
            metrics.put("skipReasons", worker.skipSummary(30));
            metrics.put("inputConstruction", "typed scalar, enum, array, collection, map, optional, proxy, constructor and concrete-subclass samples; receiver construction variants and up to three set-up calls before the observed call");
            metrics.put("evaluations", search.distinct);   // distinct calls made to the code under test
            metrics.put("evaluationsPerSecond", search.elapsedMs > 0 ? Math.round(search.distinct * 1000.0 / search.elapsedMs) : 0);
            metrics.put("coverageGuided", agent != null);
            metrics.put("coveredProbes", search.covered.cardinality());
            metrics.put("branchOutcomesTaken", search.takenOutcomes.size());
            metrics.put("branchDistance", search.worker.branchAgent != null);   // JaCoCo probes of the target classes reached during the search
            metrics.put("archiveSize", search.archive.size());
            metrics.put("searchSteps", search.evaluations);   // candidates examined, including cache hits
            metrics.put("uniqueTests", verified.size());
            metrics.put("testsBeforeReplay", search.suite.size());
            metrics.put("droppedByReplay", search.suite.size() - verified.size());
            metrics.put("coveredFeatures", search.featureTests.size());
            metrics.put("restarts", search.restarts);
            metrics.put("workerRestarts", worker.restarts);
            metrics.put("skippedEvaluations", search.skipped);
            metrics.put("fitness", agent != null ? "executed coverage probes of the modified classes, weighted by rarity (uncovered probes weigh most), plus branch distance to outcomes not yet taken, plus new outcome kinds"
                    : "new outcome kinds (coverage agent unavailable)");
            metrics.put("seed", seed);
            metrics.put("oracleVersion", fixedOracle ? "fixed" : "buggy");
            metrics.put("repetition", repetition);
            metrics.put("budgetSeconds", budgetSeconds);
            metrics.put("stopReason", search.stopReason());
            metrics.put("pools", search.poolSummary());
            metrics.put("generationElapsedMs", search.elapsedMs);
            metrics.put("generatedInputs", "generated/original/test-inputs.csv");
            Files.createDirectories(modelDir);
            Path reportDir = modelDir.resolve("report");
            Files.createDirectories(reportDir);
            new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter()
                    .writeValue(reportDir.resolve("generation.json").toFile(), metrics);
            return new GeneratedSuite(sourceRoot, simpleName, java, metrics);
        }
        } finally {
            // both worker JVMs are closed by now; the search checkout (hundreds of MB) is not needed afterwards
            if (!keepWorkspaces) { try { deleteRecursively(work); } catch (IOException ignored) { } }
            capWorkerLogs(base);
        }
    }

    /** Keep at most this much of a worker's stderr log: some targets print their usage text on every call (Closure: 400 MB). */
    private static final long WORKER_LOG_CAP = 5L * 1024 * 1024;

    private static void capWorkerLogs(Path base) {
        try (java.util.stream.Stream<Path> files = Files.walk(base)) {
            for (Path log : (Iterable<Path>) files.filter(f -> f.getFileName().toString().equals("generic-worker-runtime.log"))::iterator) {
                long size = Files.size(log);
                if (size <= WORKER_LOG_CAP) continue;
                try (java.nio.channels.FileChannel channel = java.nio.channels.FileChannel.open(log, StandardOpenOption.WRITE)) {
                    channel.truncate(WORKER_LOG_CAP);
                }
                Files.writeString(log, "\n[truncated by TestBench: the worker wrote " + (size / (1024 * 1024)) + " MB, only the first "
                        + (WORKER_LOG_CAP / (1024 * 1024)) + " MB are kept]\n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
        } catch (IOException ignored) { /* the log is diagnostic only */ }
    }

    /**
     * Seeds the String domain with literals from the project's own test suite at the checked-out (fixed) version: real
     * inputs of the code under test (JavaScript for Closure, HTML for Jsoup, JSON for Jackson, option strings for Cli...)
     * that random text would never produce. The bug's trigger test methods are cut out before mining, so nothing written
     * to expose this defect is used; everything else existed before the fix. Tests of the modified classes come first.
     * Returns how many strings were taken; never fails the run.
     */
    private int seedFromProjectTests(Path work, Path base, List<String> modified, Literals literals) {
        try {
            Path dirFile = base.resolve("search-test-dir.txt"), triggerFile = base.resolve("search-trigger-tests.txt");
            command(List.of(defects4j, "export", "-p", "dir.src.tests", "-o", dirFile.toString(), "-w", work.toString()), work, base.resolve("search-test-dir.log"));
            command(List.of(defects4j, "export", "-p", "tests.trigger", "-o", triggerFile.toString(), "-w", work.toString()), work, base.resolve("search-trigger-tests.log"));
            Path testDir = work.resolve(Files.readString(dirFile, StandardCharsets.UTF_8).trim()).normalize();
            if (!Files.isDirectory(testDir)) return 0;
            Map<String, Set<String>> trigger = new HashMap<>();   // simple test class name -> methods to cut out
            for (String line : Files.readAllLines(triggerFile, StandardCharsets.UTF_8)) {
                String[] parts = line.trim().split("::");
                if (parts.length != 2) continue;
                String cls = parts[0].substring(parts[0].lastIndexOf('.') + 1);
                trigger.computeIfAbsent(cls, k -> new HashSet<>()).add(parts[1]);
            }
            Set<String> simpleNames = new HashSet<>();
            for (String name : modified) { String n = name.substring(name.lastIndexOf('.') + 1); simpleNames.add(n.contains("$") ? n.substring(0, n.indexOf('$')) : n); }
            LinkedHashSet<String> related = new LinkedHashSet<>(), others = new LinkedHashSet<>();
            int files = 0, cut = 0;
            try (java.util.stream.Stream<Path> walk = Files.walk(testDir)) {
                List<Path> sources = new ArrayList<>();
                walk.filter(f -> f.toString().endsWith(".java")).forEach(sources::add);
                Collections.sort(sources);
                for (Path file : sources) {
                    String simple = file.getFileName().toString().replace(".java", "");
                    String text;
                    try { text = Files.readString(file, StandardCharsets.UTF_8); } catch (IOException | RuntimeException e) { continue; }
                    files++;
                    Set<String> methods = trigger.get(simple);
                    if (methods != null) for (String m : methods) { String before = text; text = cutMethod(text, m); if (!before.equals(text)) cut++; }
                    boolean isRelated = false;
                    for (String n : simpleNames) if (simple.contains(n)) isRelated = true;
                    Set<String> sink = isRelated ? related : others;
                    Matcher lit = JAVA_STRING.matcher(text);
                    while (lit.find() && sink.size() < 2000) {
                        String value = unescapeJava(lit.group(1));
                        if (value.isEmpty() || value.length() > 300) continue;
                        sink.add(value);
                    }
                }
            }
            List<String> seeds = new ArrayList<>(related);
            for (String v : others) if (seeds.size() >= 400) break; else if (!related.contains(v)) seeds.add(v);
            literals.testStrings.addAll(seeds);
            Files.write(base.resolve("search-test-seeds.txt"), seeds, StandardCharsets.UTF_8);
            Files.writeString(base.resolve("search-test-seeds.log"), "test files: " + files + "\nrelated strings: " + related.size()
                    + "\nother strings: " + others.size() + "\ntrigger test methods removed: " + cut + "\nseeds used: " + seeds.size() + "\n", StandardCharsets.UTF_8);
            return seeds.size();
        } catch (Exception e) {
            return 0;
        }
    }

    private static final Pattern JAVA_STRING = Pattern.compile("\"((?:\\\\.|[^\"\\\\\\n])*)\"");

    /** Removes the body of a method named {@code name} (first declaration found) from Java source text, brace-matched. */
    static String cutMethod(String text, String name) {
        Matcher m = Pattern.compile("\\bvoid\\s+" + Pattern.quote(name) + "\\s*\\(").matcher(text);
        if (!m.find()) return text;
        int open = text.indexOf('{', m.end());
        if (open < 0) return text;
        int depth = 0;
        for (int i = open; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '{') depth++;
            else if (c == '}' && --depth == 0) return text.substring(0, m.start()) + text.substring(i + 1);
        }
        return text.substring(0, m.start());
    }

    static String unescapeJava(String raw) {
        StringBuilder out = new StringBuilder(raw.length());
        for (int i = 0; i < raw.length(); i++) {
            char c = raw.charAt(i);
            if (c != '\\' || i + 1 >= raw.length()) { out.append(c); continue; }
            char n = raw.charAt(++i);
            switch (n) {
                case 'n': out.append('\n'); break;
                case 't': out.append('\t'); break;
                case 'r': out.append('\r'); break;
                case 'b': out.append('\b'); break;
                case 'f': out.append('\f'); break;
                case '0': out.append('\0'); break;
                case 'u':
                    if (i + 4 < raw.length()) { try { out.append((char) Integer.parseInt(raw.substring(i + 1, i + 5), 16)); i += 4; break; } catch (NumberFormatException ignored) { } }
                    out.append('u'); break;
                default: out.append(n);
            }
        }
        return out.toString();
    }

    static long seed(String project, String bugId, String algorithm, int repetition) {
        long hash = 1125899906842597L;
        for (char c : (project + "|" + bugId + "|" + algorithm + "|" + repetition + "|2026").toCharArray()) hash = 31 * hash + c;
        return hash;
    }

    /** Constants read from the bytecode of the modified classes; they seed the input domains. */
    private static final class Literals {
        static final Literals EMPTY = new Literals();
        final List<String> strings = new ArrayList<>(), numbers = new ArrayList<>();
        /** String literals mined from the project's existing test suite (fixed version, trigger tests removed), related tests first. */
        final List<String> testStrings = new ArrayList<>();
    }

    private static final class Target {
        final String id, className, methodName, receiver;
        final String[] types;
        final boolean isStatic;
        Literals literals = Literals.EMPTY;
        private String[][] domains;
        Target(String id) {
            this.id = id;
            String[] f = id.split("#", -1);
            className = f[0]; methodName = f[1]; types = f[2].isEmpty() ? new String[0] : f[2].split(","); isStatic = Boolean.parseBoolean(f[3]);
            receiver = f.length > 4 ? f[4] : className;
        }
        int arity() { return types.length; }
        String[] domain(int p) {
            if (domains == null) domains = new String[types.length][];
            if (domains[p] == null) domains[p] = values(types[p], literals);
            return domains[p];
        }
        /** Generic seed strings: number formats of different shapes, dates/times, structured text and odd characters. */
        private static final String[] STRING_SEEDS = {
                "1.5", "-1.5", "1.1234567", "1.12345678", "1.1234567890123456", "1.12345678901234567", "123456789012345678901234567890",
                "-0.0", "1e10", "1E-5", "1.5e300", "0x1F", "0xFFFFFFFF", "0x123456789", "010", "1L", "1.5f", "1.5d", ".5", "5.", "+1", "--1",
                "2020-01-01", "2020-02-30T25:61:61", "12:30:45", "PT1H", "abc", "Hello, World", "Title", "TITLE", "i", "I", "a,b,c", "a b", "\t", "\n", "\u00e9",
                "{\"a\":1}", "[1,2]", "<a>b</a>", "http://example.com/a?b=c", "/a/b", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        private static final Set<String> PRIMITIVES = Set.of("boolean", "byte", "short", "int", "long", "float", "double", "char");
        /** How many test-suite strings join the String domain (the pool keeps room below POOL_LIMIT for learned values). */
        static final int TEST_SEED_LIMIT = 100;
        /** How many "<make:k|text>" seeds an object-typed parameter gets from the project's test inputs. */
        static final int MAKE_SEED_LIMIT = 24;
        /** Fixed boundary values for the type, plus null for reference types and the literals the code compares against. */
        static String[] values(String type, Literals literals) {
            LinkedHashSet<String> out = new LinkedHashSet<>(Arrays.asList(baseValues(type)));
            if (!PRIMITIVES.contains(type)) out.add("<null>");
            if (type.equals("java.lang.String")) {
                for (int i = 0; i < literals.strings.size() && i < 20; i++) out.add(literals.strings.get(i));
                for (int i = 0; i < literals.numbers.size() && i < 8; i++) out.add(literals.numbers.get(i));
                for (int i = 0; i < literals.testStrings.size() && i < TEST_SEED_LIMIT; i++) out.add(literals.testStrings.get(i));
                out.addAll(Arrays.asList(STRING_SEEDS));
            } else if (isProjectType(type) && !literals.testStrings.isEmpty()) {
                // Project objects (an AST node, a document, a parsed tree...) are usually made by a parser/factory of the
                // project from text: "<make:k|text>" asks the scaffolding for that, with the project's own test inputs as text.
                int made = 0;
                for (int i = 0; i < literals.testStrings.size() && made < MAKE_SEED_LIMIT; i++) {
                    String text = literals.testStrings.get(i);
                    if (text.length() > 200) continue;
                    out.add("<make:" + (made % 3) + "|" + text + ">"); made++;
                }
                for (int i = 0; i < literals.strings.size() && i < 4; i++) out.add("<make:" + i + "|" + literals.strings.get(i) + ">");
            } else if (type.equals("char") || type.equals("java.lang.Character")) {
                for (String s : literals.strings) if (s.length() == 1 && out.size() < 16) out.add(s);
                for (String s : literals.testStrings) if (s.length() == 1 && out.size() < 24) out.add(s);
            } else if (isIntegral(type)) {
                long[] range = integralRange(type);
                for (int i = 0; i < literals.numbers.size() && i < 20; i++) {
                    java.math.BigDecimal n;
                    try { n = new java.math.BigDecimal(literals.numbers.get(i)); } catch (NumberFormatException e) { continue; }
                    if (n.stripTrailingZeros().scale() > 0) continue;
                    long v;
                    try { v = n.longValueExact(); } catch (ArithmeticException e) { continue; }
                    for (long candidate : new long[]{v, v - 1, v + 1}) if (candidate >= range[0] && candidate <= range[1]) out.add(Long.toString(candidate));
                }
            } else if (type.equals("double") || type.equals("java.lang.Double") || type.equals("float") || type.equals("java.lang.Float")) {
                for (int i = 0; i < literals.numbers.size() && i < 20; i++) out.add(literals.numbers.get(i));
            } else if (type.equals("java.math.BigInteger") || type.equals("java.math.BigDecimal")) {
                for (int i = 0; i < literals.numbers.size() && i < 10; i++) if (type.endsWith("BigDecimal") || literals.numbers.get(i).matches("-?[0-9]+")) out.add(literals.numbers.get(i));
            }
            String[] all = out.toArray(new String[0]);
            int cap = type.equals("java.lang.String") ? 180 : isProjectType(type) ? 96 : 64;
            return all.length <= cap ? all : Arrays.copyOf(all, cap);
        }
        /** A class of the project itself (not JDK/XML/array/primitive): the kind a project parser or factory produces. */
        static boolean isProjectType(String type) {
            return !PRIMITIVES.contains(type) && !type.endsWith("[]") && !type.startsWith("java.") && !type.startsWith("javax.")
                    && !type.startsWith("org.w3c.") && !type.startsWith("org.xml.") && !type.startsWith("sun.") && type.contains(".");
        }
        static boolean isIntegral(String t) {
            return t.equals("int") || t.equals("java.lang.Integer") || t.equals("long") || t.equals("java.lang.Long")
                    || t.equals("short") || t.equals("java.lang.Short") || t.equals("byte") || t.equals("java.lang.Byte");
        }
        static long[] integralRange(String t) {
            if (t.equals("byte") || t.equals("java.lang.Byte")) return new long[]{Byte.MIN_VALUE, Byte.MAX_VALUE};
            if (t.equals("short") || t.equals("java.lang.Short")) return new long[]{Short.MIN_VALUE, Short.MAX_VALUE};
            if (t.equals("int") || t.equals("java.lang.Integer")) return new long[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
            return new long[]{Long.MIN_VALUE, Long.MAX_VALUE};
        }
        private static String[] baseValues(String type) {
            if (type.equals("java.lang.String")) return new String[]{"", " ", "0", "1", "-1", "a", "null", "true", "2147483648", "1.25"};
            if (type.equals("boolean") || type.equals("java.lang.Boolean")) return new String[]{"false","true"};
            if (type.equals("char") || type.equals("java.lang.Character")) return new String[]{"\u0000"," ","a","0","\uffff"};
            if (type.equals("byte") || type.equals("java.lang.Byte")) return new String[]{"-128","-1","0","1","127"};
            if (type.equals("short") || type.equals("java.lang.Short")) return new String[]{"-32768","-1","0","1","32767"};
            if (type.equals("int") || type.equals("java.lang.Integer")) return new String[]{"-2147483648","-1","0","1","10","2147483647"};
            if (type.equals("long") || type.equals("java.lang.Long")) return new String[]{"-9223372036854775808","-1","0","1","9223372036854775807"};
            if (type.equals("float") || type.equals("java.lang.Float")) return new String[]{"-3.4028235E38","-1.0","0.0","1.0","3.4028235E38","NaN","Infinity"};
            if (type.equals("double") || type.equals("java.lang.Double")) return new String[]{"-1.7976931348623157E308","-1.0","0.0","1.0","1.7976931348623157E308","NaN","Infinity"};
            if (type.equals("java.math.BigInteger")) return new String[]{"-1","0","1","2147483648","9223372036854775808"};
            if (type.equals("java.math.BigDecimal")) return new String[]{"-1.0","0","0.1","1.0","1E+100"};
            if (type.equals("java.lang.Object") || type.equals("java.lang.Comparable") || type.equals("java.io.Serializable"))
                return new String[]{"<null>", "<s:>", "<s:a>", "<s:b>", "<s:key>", "<i:0>", "<i:1>", "<i:-1>", "<i:2>", "<d:1.5>", "<b:true>", "<sample:0>", "<sample:1>"};
            if (type.equals("java.lang.CharSequence")) return new String[]{"<null>", "<s:>", "<s:a>", "<s:0>", "<s:abc>", "<s: >"};
            if (type.equals("java.lang.Number")) return new String[]{"<null>", "<i:0>", "<i:1>", "<i:-1>", "<d:1.5>", "<d:-0.5>"};
            if (type.endsWith("[]")) return new String[]{"<null>", "<empty>", "<sample:0>", "<sample:1>", "<sample:2>"};
            if (type.startsWith("java.util.") || type.startsWith("java.lang.") || type.startsWith("java.time.")
                    || type.startsWith("java.io.") || type.startsWith("java.nio."))
                return new String[]{"<null>", "<empty>", "<sample:0>", "<sample:1>", "<sample:2>", "<sample:3>"};
            return new String[]{"<null>", "<sample:0>", "<sample:1>", "<sample:2>", "<sample:3>", "<sample:4>", "<sample:5>", "<sample:6>", "<sample:7>"};
        }
    }

    private static final class Outcome {
        final String kind, type, value;
        /** 'S' scalar (String.valueOf is asserted), 'O' observed text form (observe() is asserted), 'N' type only. */
        final char mode;
        /** Text form of the receiver after the call, or null when it has none. */
        final String state;
        /** JaCoCo probes of the target classes hit by this call (global ids), empty without the coverage agent. */
        final int[] cov;
        /** Follow-up calls made on the returned object, as resolved by the worker: {method, parameter types, variant}. */
        String[][] follow = new String[0][];
        /** Conditional jumps executed: id, and the normalised distance to the true and the false outcome (0 = taken). */
        int[] branchIds = NO_COVERAGE; double[] toTrue = NO_DISTANCE, toFalse = NO_DISTANCE;
        static final double[] NO_DISTANCE = new double[0];
        final boolean scalar;
        Outcome(String kind, String type, String value, boolean scalar) { this(kind, type, value, scalar ? 'S' : 'N', null, NO_COVERAGE); }
        Outcome(String kind, String type, String value, char mode, String state, int[] cov) {
            this.kind = kind; this.type = type; this.value = value; this.mode = mode; this.state = state; this.cov = cov; this.scalar = mode == 'S';
        }
        static final int[] NO_COVERAGE = new int[0];
        boolean skip() { return kind.equals("SKIP"); }
        /** Distinct (short) results stand in for distinct execution paths, so a candidate with a new result is novel. */
        String feature() {
            return kind + ":" + type + (mode != 'N' && !value.isEmpty() ? ":" + (value.length() > 16 ? value.substring(0, 16) : value) : "");
        }
        String describe() {
            if (kind.equals("SKIP")) return "ข้าม (" + value + ")";
            if (kind.equals("ERR")) return "throws " + type + (value.isBlank() ? "" : ": " + value);
            if (kind.equals("NULL")) return "returns null";
            return "returns " + type + (mode != 'N' && !value.isEmpty() ? " = " + (value.length() > 60 ? value.substring(0, 57) + "..." : value) : "");
        }
        /** Same observable behaviour as recorded when the suite was built (exception messages are never asserted). */
        boolean sameAs(Outcome other) {
            return kind.equals(other.kind) && type.equals(other.type) && mode == other.mode
                    && (mode == 'N' || value.equals(other.value)) && Objects.equals(state, other.state) && Arrays.deepEquals(follow, other.follow);
        }
    }

    /** One test input: a target method and the concrete argument values (text forms understood by the input factory). */
    private static final class Candidate {
        static final int[] NO_STEPS = new int[0];
        static final String[][] NO_ARGS = new String[0][];
        final int t; final String[] a;
        /** Receiver construction variant and set-up calls (targets of the same receiver) made before the observed call. */
        final int rv; final int[] pt; final String[][] pa;
        /** Environment of the call: 0 = the JVM's default locale, 1..3 = another default locale (Turkish, German, French). */
        final int env;
        /** Follow-up calls on the returned object: index into its public methods and the argument variant. */
        final int[] fm, fv;
        Candidate(int t, String[] a) { this(t, a, 0, NO_STEPS, NO_ARGS, 0); }
        Candidate(int t, String[] a, int rv, int[] pt, String[][] pa) { this(t, a, rv, pt, pa, 0); }
        Candidate(int t, String[] a, int rv, int[] pt, String[][] pa, int env) { this(t, a, rv, pt, pa, env, NO_STEPS, NO_STEPS); }
        Candidate(int t, String[] a, int rv, int[] pt, String[][] pa, int env, int[] fm, int[] fv) {
            this.t = t; this.a = a; this.rv = rv; this.pt = pt; this.pa = pa; this.env = env; this.fm = fm; this.fv = fv;
        }
        Candidate withEnv(int e) { return new Candidate(t, a, rv, pt, pa, e, fm, fv); }
        Candidate withFollow(int[] m, int[] v) { return new Candidate(t, a, rv, pt, pa, env, m, v); }
    }

    private static final class Eval {
        final Candidate candidate; final Target target; final String[] args; final Outcome outcome;
        Eval(Candidate c, Target t, Outcome o) { candidate = c; target = t; args = c.a; outcome = o; }
    }

    /**
     * Value-level moves shared by all algorithms: a small, typed change of one argument value (op 1..7; pos and operand
     * select where and by how much). SA draws them at random as its neighbourhood; BPSO decodes them from particle bits.
     */
    private static final class Edits {
        static boolean isBool(String t) { return t.equals("boolean") || t.equals("java.lang.Boolean"); }
        static boolean isChar(String t) { return t.equals("char") || t.equals("java.lang.Character"); }
        static boolean isFloating(String t) { return t.equals("float") || t.equals("java.lang.Float") || t.equals("double") || t.equals("java.lang.Double"); }
        static String apply(String type, String v, int op, int pos, int operand, char[] alphabet, List<String> pool) {
            if (op <= 0) return v;
            try {
                boolean scalar = isBool(type) || isChar(type) || isFloating(type) || Target.isIntegral(type) || type.equals("java.lang.String")
                        || type.equals("java.math.BigInteger") || type.equals("java.math.BigDecimal");
                if (scalar && v.equals("<null>")) return pool.get(operand % pool.size());
                if (!scalar && v.length() > 3 && v.charAt(0) == '<' && v.charAt(2) == ':' && v.endsWith(">")) {
                    // a scalar passed as Object/Comparable/Number: edit the wrapped value with the moves of its own type
                    String inner = v.substring(3, v.length() - 1);
                    char kind = v.charAt(1);
                    String innerType = kind == 's' ? "java.lang.String" : kind == 'i' ? "int" : kind == 'd' ? "double" : "boolean";
                    if (op == 6 && kind != 's') return pool.get(operand % pool.size());
                    String edited = apply(innerType, inner, op == 6 ? 2 : op, pos, operand, alphabet, List.of(inner));
                    return "<" + kind + ":" + (edited.length() > 40 ? edited.substring(0, 40) : edited) + ">";
                }
                if (isBool(type)) return (op & 1) == 1 ? String.valueOf(!Boolean.parseBoolean(v)) : v;
                if (isChar(type)) {
                    char c = v.isEmpty() ? 0 : v.charAt(0);
                    switch (op) {
                        case 1: c++; break;
                        case 2: c--; break;
                        case 4: c = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c); break;
                        default: c = alphabet[operand % alphabet.length];
                    }
                    return String.valueOf(c);
                }
                if (Target.isIntegral(type) || type.equals("java.math.BigInteger")) {
                    java.math.BigInteger x = new java.math.BigInteger(v), d = java.math.BigInteger.valueOf(operand + 1L);
                    java.math.BigInteger power = java.math.BigInteger.ONE.shiftLeft(pos % (type.endsWith("BigInteger") ? 100 : 63));
                    switch (op) {
                        case 1: x = x.add(d); break;
                        case 2: x = x.subtract(d); break;
                        case 3: x = x.shiftLeft(1); break;
                        case 4: x = x.divide(java.math.BigInteger.valueOf(2)); break;
                        case 5: x = x.negate(); break;
                        case 6: x = x.add(power); break;
                        default: x = x.subtract(power);
                    }
                    if (!type.endsWith("BigInteger")) {
                        long[] range = Target.integralRange(type);
                        x = x.max(java.math.BigInteger.valueOf(range[0])).min(java.math.BigInteger.valueOf(range[1]));
                    }
                    return x.toString();
                }
                if (isFloating(type)) {
                    double x = Double.parseDouble(v), d = (operand + 1) * Math.pow(10, -(pos % 4));
                    switch (op) {
                        case 1: x += d; break;
                        case 2: x -= d; break;
                        case 3: x *= 2; break;
                        case 4: x /= 2; break;
                        case 5: x = -x; break;
                        case 6: x = (pos & 1) == 0 ? Math.nextUp(x) : Math.nextDown(x); break;
                        default: x = (pos & 1) == 0 ? x * 10 : x / 10;
                    }
                    return type.endsWith("loat") ? Float.toString((float) x) : Double.toString(x);
                }
                if (type.equals("java.math.BigDecimal")) {
                    java.math.BigDecimal x = new java.math.BigDecimal(v), d = java.math.BigDecimal.valueOf(operand + 1L).movePointLeft(pos % 4);
                    switch (op) {
                        case 1: x = x.add(d); break;
                        case 2: x = x.subtract(d); break;
                        case 3: x = x.multiply(java.math.BigDecimal.valueOf(2)); break;
                        case 4: x = x.divide(java.math.BigDecimal.valueOf(2)); break;
                        case 5: x = x.negate(); break;
                        case 6: x = x.movePointRight(1); break;
                        default: x = x.movePointLeft(1);
                    }
                    return x.toString().length() > 60 ? v : x.toString();
                }
                if (type.equals("java.lang.String")) {
                    StringBuilder b = new StringBuilder(v);
                    int n = b.length();
                    char symbol = alphabet[operand % alphabet.length];
                    switch (op) {
                        case 1: if (n == 0) b.append(symbol); else b.setCharAt(pos % n, symbol); break;
                        case 2: b.insert(pos % (n + 1), symbol); break;
                        case 3: if (n > 0) b.deleteCharAt(pos % n); break;
                        case 4: if (n > 0) b.setCharAt(pos % n, (char) (b.charAt(pos % n) + 1)); break;
                        case 5: if (n > 0) b.setCharAt(pos % n, (char) Math.max(0, b.charAt(pos % n) - 1)); break;
                        case 6: { String other = pool.get(operand % pool.size()); if (!other.equals("<null>")) b.append(other); break; }
                        default: if (n > 0) { if ((operand & 1) == 0) b.insert(pos % n, b.charAt(pos % n)); else b.setLength(pos % n); }
                    }
                    return b.length() > 80 ? b.substring(0, 80) : b.toString();
                }
                // "<make:k|text>": another factory variant, or the text edited with the String moves
                if (v.startsWith("<make:") && v.endsWith(">") && v.indexOf('|') > 6) {
                    int bar = v.indexOf('|');
                    int k = Integer.parseInt(v.substring(6, bar));
                    String text = v.substring(bar + 1, v.length() - 1);
                    if (op == 1 || op == 6) return "<make:" + Math.min(15, k + 1) + "|" + text + ">";
                    if (op == 2 || op == 7) return "<make:" + Math.max(0, k - 1) + "|" + text + ">";
                    String edited = apply("java.lang.String", text, op, pos, operand, alphabet, List.of(text));
                    if (edited.length() > 300) edited = edited.substring(0, 300);
                    return "<make:" + k + "|" + edited + ">";
                }
                // objects, arrays, collections, enums: move between the factory's sample variants
                if (v.startsWith("<sample:")) {
                    int k = Integer.parseInt(v.substring(8, v.length() - 1));
                    if (op == 1 || op == 6) return "<sample:" + Math.min(31, k + 1 + operand % 3) + ">";
                    if (op == 2 || op == 7) return "<sample:" + Math.max(0, k - 1) + ">";
                }
                return pool.get(operand % pool.size());
            } catch (RuntimeException e) { return v; }
        }
    }

    private static final class Search {
        static final int POOL_LIMIT = 256, MAX_ARCHIVE = 2000, FEATURE_TESTS_PER_TARGET = 8, STATE_TESTS_PER_TARGET = 4;
        final Worker worker; final List<Target> targets; final String algorithm; final Random random;
        final long budgetNanos; long deadline; final long started = System.nanoTime(); long pausedNanos;
        final Consumer<String> progress;
        final int maxArity;
        /** Values to draw from, per parameter type: boundary values and bytecode literals, plus values that reached new code. */
        final Map<String,List<String>> pools = new HashMap<>();
        final Map<String,Integer> poolSeeds = new HashMap<>(), poolRing = new HashMap<>();
        final char[] alphabet;
        /** Every input that reached new code or showed a new outcome; the suite is selected from it at the end. */
        final LinkedHashMap<String,Eval> archive = new LinkedHashMap<>();
        LinkedHashMap<String,Eval> suite = new LinkedHashMap<>();
        final Map<String,Eval> cache = new HashMap<>();
        final BitSet covered = new BitSet();
        /** Branch outcomes some kept test has taken: id -> bit 1 (true outcome), bit 2 (false outcome). */
        final Map<Integer,Integer> takenOutcomes = new HashMap<>();
        int[] probeTests = new int[1024];
        final Map<String,Integer> featureTests = new HashMap<>(), perTarget = new HashMap<>();
        final Map<String,int[]> matesByReceiver = new HashMap<>();
        /** Targets whose call returned an object (not a scalar): follow-up calls make sense there. */
        final Set<Integer> followable = new HashSet<>();
        int evaluations, distinct, lastNovel, restarts, skipped; long elapsedMs, lastReport;

        Search(Worker w, List<Target> t, String a, int seconds, long seed, Consumer<String> progress) {
            worker = w; targets = t; algorithm = a; random = new Random(seed); this.progress = progress;
            budgetNanos = TimeUnit.SECONDS.toNanos(seconds); deadline = System.nanoTime() + budgetNanos;
            int arity = 0;
            for (Target target : targets) arity = Math.max(arity, target.arity());
            maxArity = arity;
            LinkedHashSet<Character> symbols = new LinkedHashSet<>();
            for (char c : "0123456789abcdefxX.-+eE ,:;/_ABCDEFLlfdiI\r\n".toCharArray()) symbols.add(c);
            for (String s : pool("java.lang.String")) for (char c : s.toCharArray()) if (symbols.size() < 64) symbols.add(c);
            alphabet = new char[symbols.size()];
            int i = 0;
            for (char c : symbols) alphabet[i++] = c;
        }

        List<String> pool(String type) {
            List<String> pool = pools.get(type);
            if (pool == null) {
                pool = new ArrayList<>(Arrays.asList(Target.values(type, targets.get(0).literals)));
                pools.put(type, pool); poolSeeds.put(type, pool.size());
            }
            return pool;
        }
        /** A value that reached new code becomes a starting point for later moves (oldest learned values are replaced). */
        void learn(String type, String value) {
            List<String> pool = pool(type);
            if (pool.contains(value)) return;
            if (pool.size() < POOL_LIMIT) { pool.add(value); return; }
            int seeds = poolSeeds.get(type), ring = poolRing.merge(type, 1, Integer::sum);
            pool.set(seeds + ring % (POOL_LIMIT - seeds), value);
        }
        String pick(String type) { List<String> pool = pool(type); return pool.get(random.nextInt(pool.size())); }
        /** Diagnostic: every parameter type's pool size and a few of its values (written to generation.json). */
        Map<String,Object> poolSummary() {
            Map<String,Object> out = new LinkedHashMap<>();
            for (Target t : targets) for (String type : t.types) if (!out.containsKey(type)) {
                List<String> pool = pool(type);
                List<String> sample = new ArrayList<>();
                for (int i = 0; i < pool.size() && sample.size() < 4; i++) { String v = pool.get(i); sample.add(v.length() > 60 ? v.substring(0, 60) : v); }
                int makes = 0; for (String v : pool) if (v.startsWith("<make:")) makes++;
                out.put(type, Map.of("size", pool.size(), "make", makes, "sample", sample));
            }
            return out;
        }

        /** A uniformly chosen target with values drawn from the pools of its parameter types. */
        Candidate randomCandidate() {
            Candidate c = randomCall();
            if (!followable.contains(c.t) || random.nextDouble() < 0.7) return c;
            int n = 1 + random.nextInt(3);
            int[] m = new int[n], v = new int[n];
            for (int i = 0; i < n; i++) { m[i] = random.nextInt(64); v[i] = random.nextInt(8); }
            return c.withFollow(m, v);
        }
        Candidate randomCall() {
            int t = random.nextInt(targets.size());
            Target target = targets.get(t);
            int[] mates = mates(target);
            int env = random.nextDouble() < 0.9 ? 0 : 1 + random.nextInt(3);
            if (mates.length == 0 || random.nextDouble() < 0.5) return new Candidate(t, randomArgs(target)).withEnv(env);
            int steps = 1 + (random.nextDouble() < 0.3 ? 1 : 0);
            int[] pt = new int[steps]; String[][] pa = new String[steps][];
            for (int i = 0; i < steps; i++) { pt[i] = mates[random.nextInt(mates.length)]; pa[i] = randomArgs(targets.get(pt[i])); }
            return new Candidate(t, randomArgs(target), random.nextDouble() < 0.7 ? 0 : random.nextInt(8), pt, pa, env);
        }
        String[] randomArgs(Target target) {
            String[] a = new String[target.arity()];
            for (int i = 0; i < a.length; i++) a[i] = pick(target.types[i]);
            return a;
        }
        /** Instance methods callable on the same receiver as this target: the candidates for set-up calls. */
        int[] mates(Target target) {
            if (target.isStatic) return Candidate.NO_STEPS;
            int[] found = matesByReceiver.get(target.receiver);
            if (found == null) {
                int[] all = new int[targets.size()]; int n = 0;
                for (int i = 0; i < targets.size(); i++) if (!targets.get(i).isStatic && targets.get(i).receiver.equals(target.receiver)) all[n++] = i;
                found = Arrays.copyOf(all, n);
                matesByReceiver.put(target.receiver, found);
            }
            return found;
        }
        String[] editArgs(Target target, String[] args) {
            String[] a = args.clone();
            if (a.length == 0) return a;
            int p = random.nextInt(a.length);
            String type = target.types[p];
            a[p] = random.nextDouble() < 0.15 ? pick(type)
                    : Edits.apply(type, a[p], 1 + random.nextInt(7), random.nextInt(64), random.nextInt(64), alphabet, pool(type));
            return a;
        }
        /**
         * Neighbourhood move: one small change - a typed edit of one argument (of the observed call or of a set-up call),
         * another receiver variant, one set-up call more or less - or, rarely, a jump to a fresh random input.
         */
        Candidate neighbor(Candidate c) {
            Target target = targets.get(c.t);
            double roll = random.nextDouble();
            if (roll < 0.08) return randomCandidate();
            if (random.nextDouble() < 0.04) return c.withEnv(c.env == 0 ? 1 + random.nextInt(3) : 0);
            if (followable.contains(c.t) && random.nextDouble() < 0.12) { lastFollowSource = c.fv; int[] m = followMove(c.fm, true); return c.withFollow(m, lastFollowVariants); }
            Candidate moved = move(c, target, roll);
            return moved.withEnv(c.env).withFollow(c.fm, c.fv);
        }
        int[] lastFollowVariants = Candidate.NO_STEPS;
        /** One change of the follow-up calls: one more, one fewer, or another method/argument for one of them. */
        int[] followMove(int[] fm, boolean unused) {
            int[] fv = lastFollowSource;
            int n = fm.length, kind = random.nextInt(3);
            if (n == 0 || (kind == 0 && n < 4)) {
                int[] m = Arrays.copyOf(fm, n + 1), v = Arrays.copyOf(fv, n + 1);
                m[n] = random.nextInt(64); v[n] = random.nextInt(8);
                lastFollowVariants = v; return m;
            }
            if (kind == 1) { lastFollowVariants = Arrays.copyOf(fv, n - 1); return Arrays.copyOf(fm, n - 1); }
            int[] m = fm.clone(), v = fv.clone();
            int at = random.nextInt(n);
            if (random.nextBoolean()) m[at] = random.nextInt(64); else v[at] = random.nextInt(8);
            lastFollowVariants = v; return m;
        }
        int[] lastFollowSource = Candidate.NO_STEPS;
        Candidate move(Candidate c, Target target, double roll) {
            int[] mates = mates(target);
            if (mates.length > 0) {
                if (roll < 0.16) return new Candidate(c.t, c.a, random.nextBoolean() ? Math.max(0, c.rv + (random.nextBoolean() ? 1 : -1)) : random.nextInt(16), c.pt, c.pa);
                if (roll < 0.28 && c.pt.length < 3) {   // add a set-up call
                    int at = random.nextInt(c.pt.length + 1);
                    int[] pt = new int[c.pt.length + 1]; String[][] pa = new String[c.pt.length + 1][];
                    for (int i = 0, j = 0; i < pt.length; i++) {
                        if (i == at) { pt[i] = mates[random.nextInt(mates.length)]; pa[i] = randomArgs(targets.get(pt[i])); }
                        else { pt[i] = c.pt[j]; pa[i] = c.pa[j]; j++; }
                    }
                    return new Candidate(c.t, c.a, c.rv, pt, pa);
                }
                if (roll < 0.36 && c.pt.length > 0) {   // drop a set-up call
                    int drop = random.nextInt(c.pt.length);
                    int[] pt = new int[c.pt.length - 1]; String[][] pa = new String[c.pt.length - 1][];
                    for (int i = 0, j = 0; i < c.pt.length; i++) if (i != drop) { pt[j] = c.pt[i]; pa[j] = c.pa[i]; j++; }
                    return new Candidate(c.t, c.a, c.rv, pt, pa);
                }
                if (roll < 0.56 && c.pt.length > 0) {   // edit an argument of a set-up call
                    int step = random.nextInt(c.pt.length);
                    if (c.pa[step].length > 0) {
                        String[][] pa = c.pa.clone();
                        pa[step] = editArgs(targets.get(c.pt[step]), c.pa[step]);
                        return new Candidate(c.t, c.a, c.rv, c.pt, pa);
                    }
                }
            }
            if (target.arity() == 0) return mates.length > 0 ? new Candidate(c.t, c.a, c.rv + 1, c.pt, c.pa) : randomCandidate();
            String[] a = editArgs(target, c.a);
            if (random.nextDouble() < 0.15) a = editArgs(target, a);
            return new Candidate(c.t, a, c.rv, c.pt, c.pa);
        }
        String key(Candidate c) {
            StringBuilder k = new StringBuilder(targets.get(c.t).id).append('\u001e').append(String.join("\u001f", c.a));
            if (c.rv != 0 || c.pt.length > 0 || c.env != 0 || c.fm.length > 0) {
                k.append('\u001e').append(c.rv).append('/').append(c.env);
                for (int i = 0; i < c.fm.length; i++) k.append('/').append(c.fm[i]).append(':').append(c.fv[i]);
                for (int i = 0; i < c.pt.length; i++) k.append('\u001e').append(c.pt[i]).append('\u001f').append(String.join("\u001f", c.pa[i]));
            }
            return k.toString();
        }

        /**
         * Coverage-driven fitness: every probe (branch/line block of the target classes) this input executes counts, weighted by
         * rarity among the kept tests; a probe no kept test reaches yet weighs most. A new kind of outcome adds a little.
         */
        double fitness(Eval e) {
            Outcome o = e.outcome;
            if (o.skip()) return 0;
            double score = 1.0 / (1 + featureTests.getOrDefault(e.target.id + "|" + e.candidate.env + "|" + o.feature(), 0));
            for (int id : o.cov) { int n = id < probeTests.length ? probeTests[id] : 0; score += n == 0 ? 10 : 1.0 / (1 + n); }
            // Branch distance: closeness to the outcomes of the executed conditions that no kept test has taken yet.
            double distance = 0;
            for (int i = 0; i < o.branchIds.length; i++) {
                int taken = takenOutcomes.getOrDefault(o.branchIds[i], 0);
                if ((taken & 1) == 0) distance += 1 - o.toTrue[i];
                if ((taken & 2) == 0) distance += 1 - o.toFalse[i];
            }
            return score + Math.min(30, distance);
        }

        /** Progress callbacks block while a run is paused; that time must not consume the search budget. */
        void report(String message) {
            long before = System.nanoTime();
            progress.accept(message);
            long spent = System.nanoTime() - before;
            if (spent > 50_000_000L) { deadline += spent; pausedNanos += spent; }
        }
        Eval eval(Candidate c) throws Exception {
            String k = key(c);
            Eval hit = cache.get(k);
            if (hit != null) return hit;
            Target t = targets.get(c.t);
            Eval e = new Eval(c, t, worker.evaluate(targets, c));
            distinct++;
            if (cache.size() >= 200_000) cache.clear();
            cache.put(k, e);
            return e;
        }
        void consider(Candidate c, Eval e) {
            evaluations++;
            Outcome o = e.outcome;
            if (o.skip()) skipped++;
            else {
                String k = key(c);
                boolean newProbe = false;
                for (int id : o.cov) if (!covered.get(id)) { newProbe = true; break; }
                for (int i = 0; i < o.branchIds.length && !newProbe; i++) {   // a branch outcome taken for the first time counts too
                    int taken = takenOutcomes.getOrDefault(o.branchIds[i], 0);
                    if ((o.toTrue[i] == 0 && (taken & 1) == 0) || (o.toFalse[i] == 0 && (taken & 2) == 0)) newProbe = true;
                }
                if (o.kind.equals("OK") && o.mode != 'S' && c.fm.length == 0) followable.add(c.t);
                // A call under another default locale counts as its own kind of outcome, so such tests are kept even though the
                // reference version covers nothing new with them (locale-dependent code only shows on the faulty version).
                String feature = e.target.id + "|" + c.env + "|" + o.feature();
                String quota = e.target.id + "|" + c.env;
                int used = perTarget.getOrDefault(quota, 0);
                boolean newFeature = !featureTests.containsKey(feature) && used < FEATURE_TESTS_PER_TARGET;
                // A receiver left in a state no kept test produced (a few per target): sequences that change state differently.
                String stateKey = o.state == null ? null : quota + "|state|" + Integer.toHexString(o.state.hashCode());
                boolean newState = stateKey != null && !featureTests.containsKey(stateKey) && perTarget.getOrDefault(quota + "|state", 0) < STATE_TESTS_PER_TARGET;
                if ((newProbe || newFeature || newState) && archive.size() < MAX_ARCHIVE && !archive.containsKey(k)) {
                    archive.put(k, e); lastNovel = evaluations;
                    for (int i = 0; i < o.branchIds.length; i++) {
                        int bits = (o.toTrue[i] == 0 ? 1 : 0) | (o.toFalse[i] == 0 ? 2 : 0);
                        if (bits != 0) takenOutcomes.merge(o.branchIds[i], bits, (a, b) -> a | b);
                    }
                    for (int id : o.cov) {
                        covered.set(id);
                        if (id >= probeTests.length) probeTests = Arrays.copyOf(probeTests, Math.max(id + 1, probeTests.length * 2));
                        probeTests[id]++;
                    }
                    featureTests.merge(feature, 1, Integer::sum);
                    if (stateKey != null) featureTests.merge(stateKey, 1, Integer::sum);
                    if (!newProbe && newFeature) perTarget.put(quota, used + 1);
                    else if (!newProbe && newState) perTarget.merge(quota + "|state", 1, Integer::sum);
                    else {
                        for (int i = 0; i < e.args.length; i++) learn(e.target.types[i], e.args[i]);
                        for (int p = 0; p < c.pt.length; p++) { Target step = targets.get(c.pt[p]); for (int i = 0; i < c.pa[p].length; i++) learn(step.types[i], c.pa[p][i]); }
                    }
                }
            }
            long now = System.nanoTime();
            if (now - lastReport > 500_000_000L) {
                lastReport = now;
                report("ค้นหา inputs · " + distinct + " การเรียกจริง · " + archive.size() + " tests · ครอบคลุม " + covered.cardinality() + " probes · ล่าสุด "
                        + e.target.methodName + "(" + displayArgs(e.args) + ") → " + o.describe());
            }
        }
        void run() throws Exception {
            switch (algorithm) { case "sa": sa(); break; case "pso": pso(); break; case "ga": ga(); break; case "random": randomSearch(); break; default: throw new IllegalArgumentException("Unsupported algorithm: " + algorithm); }
            elapsedMs = Duration.ofNanos(Math.max(0, System.nanoTime() - started - pausedNanos)).toMillis();
            suite = select();
        }
        /** The time budget is the stop criterion; stagnation triggers diversification instead of stopping. */
        boolean done() { return System.nanoTime() >= deadline; }
        boolean stagnant() { return evaluations - lastNovel >= STAGNATION_EVALUATIONS; }
        String stopReason() { return "time-budget"; }

        /** At most MAX_TESTS tests: greedy set cover of the probes first, then the remaining archive in discovery order. */
        LinkedHashMap<String,Eval> select() {
            if (archive.size() <= MAX_TESTS) return new LinkedHashMap<>(archive);
            Set<String> chosen = new HashSet<>();
            BitSet got = new BitSet();
            while (chosen.size() < MAX_TESTS) {
                String best = null; int bestGain = 0;
                for (Map.Entry<String,Eval> entry : archive.entrySet()) {
                    if (chosen.contains(entry.getKey())) continue;
                    int gain = 0;
                    for (int id : entry.getValue().outcome.cov) if (!got.get(id)) gain++;
                    if (gain > bestGain) { bestGain = gain; best = entry.getKey(); }
                }
                if (best == null) break;
                chosen.add(best);
                for (int id : archive.get(best).outcome.cov) got.set(id);
            }
            LinkedHashMap<String,Eval> out = new LinkedHashMap<>();
            for (Map.Entry<String,Eval> entry : archive.entrySet()) if (chosen.contains(entry.getKey())) out.put(entry.getKey(), entry.getValue());
            int localeTests = 0;   // then tests under another default locale (up to a quarter), then the rest in discovery order
            for (Map.Entry<String,Eval> entry : archive.entrySet()) {
                if (out.size() >= MAX_TESTS || localeTests >= MAX_TESTS / 4) break;
                if (entry.getValue().candidate.env != 0 && out.putIfAbsent(entry.getKey(), entry.getValue()) == null) localeTests++;
            }
            for (Map.Entry<String,Eval> entry : archive.entrySet()) { if (out.size() >= MAX_TESTS) break; out.putIfAbsent(entry.getKey(), entry.getValue()); }
            return out;
        }
        /** Restart point: a kept test (to keep exploring around code already reached) or a fresh random input. */
        Candidate restartPoint() {
            if (!archive.isEmpty() && random.nextBoolean()) {
                int skip = random.nextInt(archive.size());
                for (Eval e : archive.values()) if (skip-- == 0) return e.candidate;
            }
            return randomCandidate();
        }

        /**
         * Simulated annealing over concrete inputs: the neighbour differs by one small value change; a worse neighbour is
         * accepted with probability exp(delta / T); T cools geometrically within an epoch and each epoch restarts.
         */
        void sa() throws Exception {
            Candidate c = randomCandidate(); Eval e = eval(c); consider(c, e);
            long epochStart = System.nanoTime();
            long epoch = Math.max(TimeUnit.SECONDS.toNanos(1), budgetNanos / 8);
            while (!done()) {
                double fraction = Math.min(1.0, (double) (System.nanoTime() - epochStart) / epoch);
                double temp = 8.0 * Math.pow(0.05 / 8.0, fraction);
                if (fraction >= 1.0 || stagnant()) {
                    c = restartPoint(); e = eval(c); consider(c, e);
                    epochStart = System.nanoTime(); lastNovel = evaluations; restarts++;
                    continue;
                }
                double f = fitness(e);
                Candidate n = neighbor(c); Eval ne = eval(n); consider(n, ne);
                if (ne.outcome.skip()) continue;   // an input that could not be evaluated (timeout, harness failure) is never a state
                double nf = fitness(ne);
                if (nf >= f || random.nextDouble() < Math.exp((nf - f) / temp)) { c = n; e = ne; }
            }
        }
        void randomSearch() throws Exception {
            while (!done()) { Candidate c = randomCandidate(); Eval e = eval(c); consider(c, e); }
        }
        void ga() throws Exception {
            int size = 16; Candidate[] population = new Candidate[size]; Eval[] results = new Eval[size];
            for (int i = 0; i < size; i++) { population[i] = randomCandidate(); results[i] = eval(population[i]); consider(population[i], results[i]); }
            while (!done()) {
                if (stagnant()) {
                    for (int i = size / 2; i < size && !done(); i++) { population[i] = restartPoint(); results[i] = eval(population[i]); consider(population[i], results[i]); }
                    lastNovel = evaluations; restarts++;
                }
                Candidate[] next = new Candidate[size]; Eval[] nextResults = new Eval[size];
                for (int i = 0; i < size && !done(); i++) {
                    Candidate a = tournament(population, results), b = tournament(population, results);
                    Candidate child = a;
                    if (a.t == b.t && a.a.length > 0) { String[] mixed = a.a.clone(); for (int p = 0; p < mixed.length; p++) if (random.nextBoolean()) mixed[p] = b.a[p]; child = new Candidate(a.t, mixed, a.rv, a.pt, a.pa); }
                    child = neighbor(child);
                    Eval e = eval(child); consider(child, e);
                    next[i] = child; nextResults[i] = e;
                }
                for (int i = 0; i < size; i++) if (next[i] != null) { population[i] = next[i]; results[i] = nextResults[i]; }
            }
        }
        Candidate tournament(Candidate[] population, Eval[] results) {
            int best = random.nextInt(population.length);
            for (int i = 0; i < 3; i++) { int c = random.nextInt(population.length); if (fitness(results[c]) > fitness(results[best])) best = c; }
            return population[best];
        }

        // ---- Binary PSO ----
        static final int SEED_BITS = 8, EDITS = 2, OP_BITS = 4, POS_BITS = 6, OPERAND_BITS = 6;
        static final int SLOT_BITS = SEED_BITS + EDITS * (OP_BITS + POS_BITS + OPERAND_BITS);
        static final int VARIANT_BITS = 4, STEPS = 2, STEP_ON_BITS = 2, STEP_METHOD_BITS = 8;
        int targetBits;
        static int bits(byte[] x, int from, int width) { int v = 0; for (int i = 0; i < width; i++) v |= x[from + i] << i; return v; }
        int callBits() { return SLOT_BITS * maxArity; }
        static final int ENV_BITS = 4, FOLLOWS = 3, FOLLOW_BITS = 2 + 6 + 3;
        int bitCount() { return targetBits + callBits() + VARIANT_BITS + STEPS * (STEP_ON_BITS + STEP_METHOD_BITS + callBits()) + FOLLOWS * FOLLOW_BITS + ENV_BITS; }
        /** Before the locale bits: three optional follow-up calls (on/off, method index, argument variant). */
        Candidate decodeFollow(byte[] x, Candidate c) {
            if (!followable.contains(c.t)) return c;
            int at = x.length - ENV_BITS - FOLLOWS * FOLLOW_BITS, n = 0;
            int[] m = new int[FOLLOWS], v = new int[FOLLOWS];
            for (int f = 0; f < FOLLOWS; f++, at += FOLLOW_BITS) {
                if (bits(x, at, 2) != 3) continue;
                m[n] = bits(x, at + 2, 6); v[n] = bits(x, at + 8, 3); n++;
            }
            return n == 0 ? c : c.withFollow(Arrays.copyOf(m, n), Arrays.copyOf(v, n));
        }
        /** The last four bits: codes 13..15 select another default locale, every other code keeps the default. */
        int decodeEnv(byte[] x) { int code = bits(x, x.length - ENV_BITS, ENV_BITS); return code < 13 ? 0 : code - 12; }
        /** Arguments of one call: per argument a pool value index and up to two typed edits (operation, position, operand). */
        String[] decodeArgs(byte[] x, int base, Target target) {
            String[] a = new String[target.arity()];
            for (int p = 0; p < a.length; p++) {
                int slot = base + p * SLOT_BITS;
                String type = target.types[p];
                List<String> pool = pool(type);
                String value = pool.get(bits(x, slot, SEED_BITS) % pool.size());
                for (int k = 0; k < EDITS; k++) {
                    int at = slot + SEED_BITS + k * (OP_BITS + POS_BITS + OPERAND_BITS);
                    int code = bits(x, at, OP_BITS);
                    if (code < 8) continue;   // half of the codes mean "no edit"
                    int op = code - 7;
                    value = Edits.apply(type, value, op == 8 ? 6 : op, bits(x, at + OP_BITS, POS_BITS), bits(x, at + OP_BITS + POS_BITS, OPERAND_BITS), alphabet, pool);
                }
                a[p] = value;
            }
            return a;
        }
        /**
         * A particle is a bit string: [target | arguments | receiver variant | two optional set-up calls (on/off, method,
         * arguments)]. Decoding gives a concrete input; argument values are pool values changed by up to two small typed edits.
         */
        Candidate decode(byte[] x) {
            int t = bits(x, 0, targetBits) % targets.size();
            Target target = targets.get(t);
            String[] a = decodeArgs(x, targetBits, target);
            int[] mates = mates(target);
            if (mates.length == 0) return decodeFollow(x, new Candidate(t, a).withEnv(decodeEnv(x)));
            int at = targetBits + callBits();
            int code = bits(x, at, VARIANT_BITS);
            int rv = code < 8 ? 0 : code - 8;
            at += VARIANT_BITS;
            int[] pt = new int[STEPS]; String[][] pa = new String[STEPS][]; int n = 0;
            for (int step = 0; step < STEPS; step++, at += STEP_ON_BITS + STEP_METHOD_BITS + callBits()) {
                if (bits(x, at, STEP_ON_BITS) != 3) continue;   // a set-up call is present in one of four codes
                pt[n] = mates[bits(x, at + STEP_ON_BITS, STEP_METHOD_BITS) % mates.length];
                pa[n] = decodeArgs(x, at + STEP_ON_BITS + STEP_METHOD_BITS, targets.get(pt[n]));
                n++;
            }
            return decodeFollow(x, new Candidate(t, a, rv, Arrays.copyOf(pt, n), Arrays.copyOf(pa, n), decodeEnv(x)));
        }
        byte[] randomBits(int n) { byte[] x = new byte[n]; for (int i = 0; i < n; i++) x[i] = (byte) (random.nextBoolean() ? 1 : 0); return x; }
        /**
         * Binary particle swarm (Kennedy and Eberhart): velocity per bit, pulled toward the particle's best and the swarm's
         * best position; each bit is 1 with probability sigmoid(velocity).
         */
        void pso() throws Exception {
            int count = 12;
            targetBits = Math.max(1, 32 - Integer.numberOfLeadingZeros(Math.max(1, targets.size() - 1)));
            int bitCount = bitCount();
            byte[][] x = new byte[count][], bestX = new byte[count][];
            double[][] velocity = new double[count][bitCount];
            Eval[] e = new Eval[count], bestEval = new Eval[count];
            for (int i = 0; i < count; i++) {
                x[i] = randomBits(bitCount);
                Candidate c = decode(x[i]); e[i] = eval(c); consider(c, e[i]);
                bestX[i] = x[i].clone(); bestEval[i] = e[i];
            }
            while (!done()) {
                // The fitness surface changes as code is covered, so gBest is re-derived from the pBests each sweep.
                int globalIndex = 0; double globalFitness = -1;
                for (int i = 0; i < count; i++) { double s = fitness(bestEval[i]); if (s > globalFitness) { globalFitness = s; globalIndex = i; } }
                byte[] global = bestX[globalIndex].clone();
                if (stagnant()) {
                    for (int i = count / 2; i < count && !done(); i++) {
                        x[i] = randomBits(bitCount); velocity[i] = new double[bitCount];
                        Candidate c = decode(x[i]); e[i] = eval(c); consider(c, e[i]);
                        bestX[i] = x[i].clone(); bestEval[i] = e[i];
                    }
                    lastNovel = evaluations; restarts++;
                }
                for (int i = 0; i < count && !done(); i++) {
                    for (int bit = 0; bit < bitCount; bit++) {
                        double r1 = random.nextDouble(), r2 = random.nextDouble();
                        velocity[i][bit] = .68 * velocity[i][bit]
                                + 1.45 * r1 * (bestX[i][bit] - x[i][bit])
                                + 1.45 * r2 * (global[bit] - x[i][bit]);
                        velocity[i][bit] = Math.max(-6.0, Math.min(6.0, velocity[i][bit]));
                        double probability = 1.0 / (1.0 + Math.exp(-velocity[i][bit]));
                        x[i][bit] = (byte) (random.nextDouble() < probability ? 1 : 0);
                    }
                    Candidate c = decode(x[i]); e[i] = eval(c); consider(c, e[i]);
                    if (fitness(e[i]) > fitness(bestEval[i])) { bestX[i] = x[i].clone(); bestEval[i] = e[i]; }
                }
            }
        }
    }

    /** Replays the suite in a fresh JVM in reverse order; only outcomes that reproduce are kept as assertions. */
    private static LinkedHashMap<String,Eval> verify(Worker worker, List<Target> targets, LinkedHashMap<String,Eval> suite) throws Exception {
        List<Map.Entry<String,Eval>> entries = new ArrayList<>(suite.entrySet());
        Collections.reverse(entries);
        Set<String> reproducible = new HashSet<>();
        for (Map.Entry<String,Eval> entry : entries) {
            Eval original = entry.getValue();
            Outcome again = worker.evaluate(targets, original.candidate);
            if (!again.skip() && again.sameAs(original.outcome)) reproducible.add(entry.getKey());
        }
        LinkedHashMap<String,Eval> kept = new LinkedHashMap<>();
        for (Map.Entry<String,Eval> entry : suite.entrySet()) if (reproducible.contains(entry.getKey())) kept.put(entry.getKey(), entry.getValue());
        return kept;
    }

    private static String partition(String type, String value) {
        if (value.equals("<null>")) return "null";
        if (value.isEmpty()) return "empty";
        if (value.equals("0") || value.equals("0.0") || value.equals("false")) return "zero-or-false";
        if (value.equals("-1")) return "negative-one";
        if (value.equals("1") || value.equals("true")) return "one-or-true";
        if (value.length() > 12) return "long";
        if (value.startsWith("-")) return "negative";
        if (value.matches("[0-9]+")) return "integer";
        if (value.matches(".*[.Ee].*")) return "decimal";
        return "other";
    }
    private static String displayArgs(String[] args) {
        StringJoiner out = new StringJoiner(", ");
        for (String value : args) {
            String safe = value.replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
            if (safe.length() > 80) safe = safe.substring(0, 77) + "...";
            out.add("\"" + safe + "\"");
        }
        return out.toString();
    }

    /**
     * junit3 renders a junit.framework.TestCase suite: Defects4J gives some projects (Cli) a junit-4.12 jar without hamcrest,
     * which makes every JUnit 4 class fail to start there, while a TestCase never touches hamcrest.
     */
    private static String render(String name, List<Target> targets, LinkedHashMap<String,Eval> suite, boolean junit3) {
        StringBuilder s = new StringBuilder(junit3
                ? "package generated.algorithm;\n\nimport junit.framework.TestCase;\n\npublic class " + name + " extends TestCase {\n"
                : "package generated.algorithm;\n\nimport org.junit.FixMethodOrder;\nimport org.junit.Test;\nimport org.junit.runners.MethodSorters;\nimport static org.junit.Assert.*;\n\n@FixMethodOrder(MethodSorters.NAME_ASCENDING)\npublic class " + name + " {\n");
        int i = 0;
        for (Eval e : suite.values()) {
            Candidate c = e.candidate;
            String sequence = "";
            if (e.target.isStatic || (c.rv == 0 && c.pt.length == 0)) { if (c.env != 0) sequence = ", 0, null, " + c.env; }
            else {
                // receiver variant and set-up calls: {declaring class, method, parameter types, values...}
                StringBuilder steps = new StringBuilder(", " + c.rv + ", new String[][]{");
                for (int p = 0; p < c.pt.length; p++) {
                    Target step = targets.get(c.pt[p]);
                    String[] row = new String[3 + c.pa[p].length];
                    row[0] = step.className; row[1] = step.methodName; row[2] = String.join(",", step.types);
                    System.arraycopy(c.pa[p], 0, row, 3, c.pa[p].length);
                    if (p > 0) steps.append(", ");
                    String text = array(row);
                    steps.append(text.substring("new String[]".length()));
                }
                sequence = steps.append("}").toString() + (c.env != 0 ? ", " + c.env : "");
            }
            String call = "SearchInputFactory_scaffolding.call(" + javaString(e.target.className) + ", " + javaString(e.target.receiver) + ", "
                    + javaString(e.target.methodName) + ", " + array(e.target.types) + ", " + array(e.args) + ", " + e.target.isStatic + sequence + ")";
            if (e.outcome.follow.length > 0) {
                // then calls on the returned object: {method, parameter types, argument variant}
                StringBuilder chain = new StringBuilder("SearchInputFactory_scaffolding.follow(" + call + ", new String[][]{");
                for (int f = 0; f < e.outcome.follow.length; f++) { if (f > 0) chain.append(", "); chain.append(array(e.outcome.follow[f]).substring("new String[]".length())); }
                call = chain.append("})").toString();
            }
            if (junit3) s.append(" public void testGeneratedInput").append(String.format(Locale.ROOT, "%03d", i++)).append("() throws Throwable {\n");
            else s.append(" @Test(timeout = 20000)\n public void generatedInput").append(String.format(Locale.ROOT, "%03d", i++)).append("() throws Throwable {\n");
            Outcome o = e.outcome;
            if (o.kind.equals("ERR")) {
                s.append("  Throwable thrown = null;\n  try { ").append(call).append("; } catch (Throwable caught) { thrown = caught; }\n")
                        .append("  assertNotNull(\"expected an exception\", thrown);\n  assertEquals(").append(javaString(o.type)).append(", thrown.getClass().getName());\n");
            } else {
                s.append("  Object actual = ").append(call).append(";\n");
                if (o.kind.equals("NULL")) s.append("  assertNull(actual);\n");
                else {
                    s.append("  assertNotNull(actual);\n");
                    if (!"?".equals(o.type)) s.append("  assertEquals(").append(javaString(o.type)).append(", actual.getClass().getName());\n");
                    if (o.mode == 'S') s.append("  assertEquals(").append(javaString(o.value)).append(", String.valueOf(actual));\n");
                    else if (o.mode == 'O') s.append("  assertEquals(").append(javaString(o.value)).append(", SearchInputFactory_scaffolding.observe(actual));\n");
                }
                if (o.state != null) s.append("  assertEquals(\"receiver state after the call\", ").append(javaString(o.state)).append(", SearchInputFactory_scaffolding.receiverState());\n");
            }
            s.append(" }\n");
        }
        return s.append("}\n").toString();
    }
    private static String algorithmClassPrefix(String algorithm) { switch (algorithm) { case "sa": return "SimulatedAnnealing"; case "pso": return "BinaryParticleSwarm"; case "ga": return "Genetic"; case "random": return "RandomSearch"; default: throw new IllegalArgumentException("Unknown algorithm: " + algorithm); } }
    private static void writeInputFactory(Path packageDir) throws IOException {
        Files.writeString(packageDir.resolve("SearchInputFactory_scaffolding.java"), Worker.resourceSource("/generator/SearchInputFactory_scaffolding.java"), StandardCharsets.UTF_8);
    }
    private static String array(String[] values) { StringBuilder s = new StringBuilder("new String[]{"); for (int i = 0; i < values.length; i++) { if (i > 0) s.append(", "); s.append(javaString(values[i])); } return s.append('}').toString(); }
    private static String javaString(String v) {
        StringBuilder b = new StringBuilder("\"");
        for (char c : v.toCharArray()) {
            switch (c) {
                case '\\': b.append("\\\\"); break;
                case '"': b.append("\\\""); break;
                case '\n': b.append("\\n"); break;
                case '\r': b.append("\\r"); break;
                case '\t': b.append("\\t"); break;
                default: if (c < 32) b.append(String.format(Locale.ROOT, "\\%03o", (int) c)); else if (c > 126) b.append(String.format(Locale.ROOT, "\\u%04x", (int) c)); else b.append(c);
            }
        }
        return b.append('"').toString();
    }
    private static void writeCsv(Path p, List<Target> targets, LinkedHashMap<String,Eval> suite) throws IOException {
        Files.createDirectories(p.getParent());
        StringBuilder b = new StringBuilder("target,args,referenceOutcome,receiverVariant,setupCalls,localeEnvironment\n");
        for (Eval e : suite.values()) {
            StringJoiner setup = new StringJoiner(" ; ");
            for (int i = 0; i < e.candidate.pt.length; i++) setup.add(targets.get(e.candidate.pt[i]).methodName + "(" + String.join("|", e.candidate.pa[i]) + ")");
            b.append('"').append(e.target.id.replace("\"", "\"\"")).append("\",\"").append(String.join("|", e.args).replace("\"", "\"\"")).append("\",\"").append(e.outcome.kind + ":" + e.outcome.type)
                    .append("\",").append(e.candidate.rv).append(",\"").append(setup.toString().replace("\"", "\"\"")).append("\",").append(e.candidate.env).append("\n");
        }
        Files.writeString(p, b, StandardCharsets.UTF_8);
    }

    private static final class Worker implements AutoCloseable {
        final Path cwd, root, base, classesDir; final String cp;
        Process process; BufferedWriter in; BlockingQueue<String> lines;
        int restarts, literalCount; final List<String> skips = new ArrayList<>();
        static final String EOF = "\u0000EOF";

        final String agent;
        /** -javaagent for branch distances (BranchAgent.java compiled into a jar next to the worker), or null. */
        String branchAgent;
        /** Global probe ids: each instrumented class gets a block of ids the first time it reports coverage. */
        final Map<String,Integer> probeOffsets = new HashMap<>();
        int probeCount;
        Worker(Path cwd, Path base, String cp, Path classesDir, String agent) throws Exception {
            this.cwd = cwd; this.base = base; this.cp = cp; this.classesDir = classesDir; this.agent = agent;
            root = base.resolve("generic-fitness-worker");
            Files.createDirectories(root);
            Path src = root.resolve("GenericFitnessWorker.java"), factory = root.resolve("SearchInputFactory_scaffolding.java");
            Path recorder = root.resolve("BranchRecorder.java"), agentSource = root.resolve("BranchAgent.java");
            if (!Files.isRegularFile(root.resolve("GenericFitnessWorker.class"))) {
                Files.writeString(src, resourceSource("/generator/GenericFitnessWorker.java"), StandardCharsets.UTF_8);
                Files.writeString(factory, resourceSource("/generator/SearchInputFactory_scaffolding.java"), StandardCharsets.UTF_8);
                Files.writeString(recorder, resourceSource("/generator/BranchRecorder.java"), StandardCharsets.UTF_8);
                Files.writeString(agentSource, resourceSource("/generator/BranchAgent.java"), StandardCharsets.UTF_8);
                command(List.of("javac", "-cp", cp, "-d", root.toString(), src.toString(), factory.toString(), recorder.toString()), cwd, base.resolve("generic-worker-compile.log"));
                // The branch-distance agent uses the ASM copy inside the JDK; if that is not available the search runs without it.
                Path agentDir = root.resolve("branch-agent");
                try {
                    Files.createDirectories(agentDir);
                    command(List.of("javac", "--add-exports", "java.base/jdk.internal.org.objectweb.asm=ALL-UNNAMED", "-d", agentDir.toString(),
                            agentSource.toString(), recorder.toString()), cwd, base.resolve("branch-agent-compile.log"));
                    Files.writeString(agentDir.resolve("MANIFEST.MF"), "Premain-Class: BranchAgent\n", StandardCharsets.UTF_8);
                    command(List.of("jar", "--create", "--file", root.resolve("branch-agent.jar").toString(), "--manifest", agentDir.resolve("MANIFEST.MF").toString(),
                            "-C", agentDir.toString(), "BranchAgent.class", "-C", agentDir.toString(), "BranchAgent$1.class",
                            "-C", agentDir.toString(), "BranchAgent$Instrumenter.class", "-C", agentDir.toString(), "BranchAgent$JumpInstrumenter.class",
                            "-C", agentDir.toString(), "BranchRecorder.class"), cwd, base.resolve("branch-agent-jar.log"));
                } catch (Exception e) { Files.deleteIfExists(root.resolve("branch-agent.jar")); }
            }
            if (Files.isRegularFile(root.resolve("branch-agent.jar"))) {
                String targets = String.join(",", Files.readAllLines(base.resolve("search-target-classes.txt"), StandardCharsets.UTF_8));
                branchAgent = "-javaagent:" + root.resolve("branch-agent.jar") + "=" + targets;
            }
            start();
        }
        void start() throws IOException {
            // Same time zone as Defects4J's test runs (it exports TZ=America/Los_Angeles): otherwise date/time results recorded
            // here differ from the ones the generated tests see, and every such test fails on both versions.
            List<String> launch = new ArrayList<>(List.of("java", "-Xmx1g"));
            if (branchAgent != null) { launch.add("--add-exports"); launch.add("java.base/jdk.internal.org.objectweb.asm=ALL-UNNAMED"); launch.add(branchAgent); }
            if (agent != null) launch.add(agent);
            launch.addAll(List.of("-Duser.timezone=" + DEFECTS4J_TIMEZONE, "-Dbench.worker=true",
                    "-Dbench.classes=" + classesDir, "-cp", root + File.pathSeparator + cp, "GenericFitnessWorker"));
            ProcessBuilder builder = new ProcessBuilder(launch)
                    .directory(cwd.toFile()).redirectError(ProcessBuilder.Redirect.appendTo(base.resolve("generic-worker-runtime.log").toFile()));
            builder.environment().put("TZ", DEFECTS4J_TIMEZONE);
            process = builder.start();
            ProcessRegistry.register(process, cwd);
            in = new BufferedWriter(new OutputStreamWriter(process.getOutputStream(), StandardCharsets.UTF_8));
            final BufferedReader out = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
            final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
            lines = queue;
            Thread reader = new Thread(() -> {
                try { String l; while ((l = out.readLine()) != null) queue.add(l); } catch (IOException ignored) { }
                queue.add(EOF);
            }, "generic-worker-reader");
            reader.setDaemon(true);
            reader.start();
        }
        String read(long timeoutMs) throws InterruptedException { return lines.poll(timeoutMs, TimeUnit.MILLISECONDS); }
        void restart(String reason) throws Exception {
            if (++restarts > 400) throw new IOException("Generic fitness worker ล้มเกิน 400 ครั้ง: " + reason);
            ProcessRegistry.unregister(process);
            process.destroyForcibly();
            warm = false;
            start();
        }
        List<Target> discover(Path classes) throws Exception {
            send("LIST\t" + enc(Files.readString(classes, StandardCharsets.UTF_8)));
            List<Target> list = new ArrayList<>();
            Literals literals = new Literals();
            while (true) {
                String line = read(600_000);
                if (line == null || line.equals(EOF)) throw new IOException("Generic fitness worker ไม่ตอบระหว่างค้นหา method (ดู generic-worker-runtime.log)");
                if (line.equals("END")) break;
                if (line.startsWith("METHOD\t")) list.add(new Target(dec(line.substring(7))));
                else if (line.startsWith("LITERAL\t")) {
                    String[] p = line.split("\\t", -1);
                    if (p.length > 2) (p[1].equals("S") ? literals.strings : literals.numbers).add(dec(p[2]));
                }
                else if (line.startsWith("SKIP\t")) { String[] p = line.split("\\t", -1); if (p.length > 2) skips.add(dec(p[1]) + ": " + dec(p[2])); }
            }
            for (Target t : list) t.literals = literals;
            list.sort(Comparator.comparing(t -> t.id));
            this.literalCount = literals.strings.size() + literals.numbers.size();
            return list;
        }
        String skipSummary(int limit) {
            if (skips.isEmpty()) return "ไม่มี class ที่ถูกข้าม (ไม่พบ class ใน classes.modified)";
            return String.join(" | ", skips.subList(0, Math.min(limit, skips.size())));
        }
        boolean warm;
        Outcome evaluate(List<Target> targets, Candidate c) throws Exception {
            Target t = targets.get(c.t);
            StringBuilder message = new StringBuilder("CALL\t").append(enc(t.id)).append('\t');
            for (int i = 0; i < c.a.length; i++) { if (i > 0) message.append(','); message.append(enc(c.a[i])); }
            boolean sequence = !t.isStatic && (c.rv != 0 || c.pt.length > 0);
            if (sequence || c.env != 0 || c.fm.length > 0) {
                message.append('\t').append(sequence ? c.rv : 0).append('\t');
                if (sequence) for (int p = 0; p < c.pt.length; p++) {
                    if (p > 0) message.append(';');
                    message.append(enc(targets.get(c.pt[p]).id)).append('!');
                    for (int i = 0; i < c.pa[p].length; i++) { if (i > 0) message.append(','); message.append(enc(c.pa[p][i])); }
                }
                message.append('\t').append(c.env).append('\t');
                for (int i = 0; i < c.fm.length; i++) { if (i > 0) message.append(','); message.append(c.fm[i]).append(':').append(c.fv[i]); }
            }
            try { send(message.toString()); }
            catch (IOException e) { restart("เขียนไม่ได้"); return new Outcome("SKIP", "", "worker restarted", false); }
            long timeout = warm ? CALL_TIMEOUT_MS : FIRST_CALL_TIMEOUT_MS;
            while (true) {
                String line = read(timeout);
                if (line == null) { restart("timeout"); return new Outcome("SKIP", "", "timeout " + timeout + " ms", false); }
                if (line.equals(EOF)) { restart("worker crashed"); return new Outcome("SKIP", "", "worker crashed", false); }
                if (line.startsWith("OK\t") || line.startsWith("ERR\t") || line.startsWith("SKIP\t")) {
                    warm = true;
                    Outcome outcome = parse(line);
                    if (outcome.skip() && outcome.value.startsWith("hang; restart")) restart("stuck threads");
                    return outcome;
                }
            }
        }
        Outcome parse(String line) {
            String[] p = line.split("\\t", -1);
            if (p[0].equals("SKIP")) return new Outcome("SKIP", "", p.length > 1 && !p[1].startsWith("cov:") ? dec(p[1]) : "", false);
            String state = null; int[] cov = Outcome.NO_COVERAGE; String[][] follow = new String[0][];
            int[] branchIds = Outcome.NO_COVERAGE; double[] toTrue = Outcome.NO_DISTANCE, toFalse = Outcome.NO_DISTANCE;
            for (int i = 2; i < p.length; i++) {
                if (p[i].startsWith("state:")) state = dec(p[i].substring(6));
                else if (p[i].startsWith("cov:")) cov = probes(p[i].substring(4));
                else if (p[i].startsWith("bd:")) {
                    String[] items = p[i].substring(3).split(";");
                    branchIds = new int[items.length]; toTrue = new double[items.length]; toFalse = new double[items.length];
                    int n = 0;
                    for (String item : items) {
                        String[] f = item.split(":");
                        if (f.length != 3) continue;
                        try { branchIds[n] = Integer.parseInt(f[0]); toTrue[n] = Double.parseDouble(f[1]); toFalse[n] = Double.parseDouble(f[2]); n++; }
                        catch (NumberFormatException ignored) { }
                    }
                    branchIds = Arrays.copyOf(branchIds, n); toTrue = Arrays.copyOf(toTrue, n); toFalse = Arrays.copyOf(toFalse, n);
                }
                else if (p[i].startsWith("follow:")) {
                    String[] calls = p[i].substring(7).split(";");
                    follow = new String[calls.length][];
                    for (int c = 0; c < calls.length; c++) { String[] f = calls[c].split("!", -1); follow[c] = new String[]{dec(f[0]), dec(f[1]), f[2]}; }
                }
            }
            Outcome outcome;
            if (p[0].equals("ERR")) outcome = new Outcome("ERR", p[1], p.length > 2 ? dec(p[2]) : "", 'N', null, cov);
            else if (p[1].equals("NULL")) outcome = new Outcome("NULL", "", "", 'N', state, cov);
            else outcome = new Outcome("OK", p[1], p.length > 2 ? dec(p[2]) : "", p.length > 3 && p[3].length() == 1 ? p[3].charAt(0) : 'N', state, cov);
            outcome.follow = follow;
            outcome.branchIds = branchIds; outcome.toTrue = toTrue; outcome.toFalse = toFalse;
            return outcome;
        }
        /** "classId:probeCount:packedBitsHex;..." from the worker, as global probe ids. */
        int[] probes(String text) {
            int[] out = new int[16]; int n = 0;
            for (String block : text.split(";")) {
                String[] f = block.split(":", -1);
                if (f.length != 3) continue;
                int length;
                try { length = Integer.parseInt(f[1]); } catch (NumberFormatException e) { continue; }
                Integer offset = probeOffsets.get(f[0]);
                if (offset == null) { offset = probeCount; probeOffsets.put(f[0], offset); probeCount += length; }
                String hex = f[2];
                for (int b = 0; b * 2 + 1 < hex.length(); b++) {
                    int value = Character.digit(hex.charAt(b * 2), 16) << 4 | Character.digit(hex.charAt(b * 2 + 1), 16);
                    for (int bit = 0; value != 0 && bit < 8; bit++, value >>>= 1) if ((value & 1) != 0 && b * 8 + bit < length) {
                        if (n == out.length) out = Arrays.copyOf(out, n * 2);
                        out[n++] = offset + b * 8 + bit;
                    }
                }
            }
            return n == 0 ? Outcome.NO_COVERAGE : Arrays.copyOf(out, n);
        }
        void send(String s) throws IOException { in.write(s); in.newLine(); in.flush(); }
        static String enc(String s) { return Base64.getEncoder().encodeToString(s.getBytes(StandardCharsets.UTF_8)); }
        static String dec(String s) { return new String(Base64.getDecoder().decode(s), StandardCharsets.UTF_8); }
        public void close() {
            try { send("STOP"); } catch (Exception ignored) { }
            if (process != null) {
                ProcessRegistry.unregister(process);
                process.destroyForcibly();
                try { process.waitFor(2, TimeUnit.SECONDS); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        }
        static String resourceSource(String resource) throws IOException {
            try (InputStream in = GenericSearchTestGenerator.class.getResourceAsStream(resource)) {
                if (in == null) throw new IOException("ไม่พบ resource " + resource);
                return new String(in.readAllBytes(), StandardCharsets.UTF_8);
            }
        }
    }
    static void deleteRecursively(Path path) throws IOException {
        if (!Files.exists(path)) return;
        try (java.util.stream.Stream<Path> walk = Files.walk(path)) {
            for (Path p : (Iterable<Path>) walk.sorted(Comparator.reverseOrder())::iterator) Files.deleteIfExists(p);
        }
    }
    private static void command(List<String> c, Path cwd, Path log) throws Exception {
        Process p = new ProcessBuilder(c).directory(cwd.toFile()).redirectInput(ProcessBuilder.Redirect.from(new File("/dev/null")))
                .redirectErrorStream(true).redirectOutput(log.toFile()).start();
        ProcessRegistry.register(p, cwd);
        try {
            if (!p.waitFor(Duration.ofMinutes(10).toMillis(), TimeUnit.MILLISECONDS)) {
                p.descendants().forEach(ProcessHandle::destroyForcibly);
                p.destroyForcibly();
                throw new IOException("คำสั่งเกิน 10 นาที: " + c.get(0));
            }
        } finally { ProcessRegistry.unregister(p); }
        if (p.exitValue() != 0) throw new IOException("คำสั่งไม่สำเร็จ " + c.get(0) + "; ดู " + log.getFileName());
    }
}
