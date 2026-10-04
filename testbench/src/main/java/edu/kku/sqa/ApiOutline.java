package edu.kku.sqa;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Declarations (no method bodies) of the project classes that the modified source uses, taken from the buggy checkout.
 * A model that sees only the modified class has to guess how the other classes it must create (for example an Option for a
 * CommandLine) behave; the outline gives their constructors, methods and one-line summaries. Buggy version only.
 */
final class ApiOutline {
    private ApiOutline() { }

    static final int MAX_CLASSES = 6;
    static final int MAX_PER_CLASS = 4500;
    static final int MAX_TOTAL = 16000;
    private static final Pattern IDENTIFIER = Pattern.compile("\\b[A-Z][A-Za-z0-9_]*\\b");
    private static final Pattern IMPORT = Pattern.compile("(?m)^\\s*import\\s+(?!static)([\\w.]+)\\s*;");
    private static final Pattern PACKAGE = Pattern.compile("(?m)^\\s*package\\s+([\\w.]+)\\s*;");

    /** The outline text to append to the supplied source, or an empty string when no other project class is used. */
    static String build(Path sourceRoot, Map<Path, String> modifiedFiles) { return build(sourceRoot, modifiedFiles, "buggy version"); }

    /** versionLabel names the checkout in the headings, e.g. "buggy version" (text of prompts v1-v12). */
    static String build(Path sourceRoot, Map<Path, String> modifiedFiles, String versionLabel) {
        Map<Path, Integer> uses = new LinkedHashMap<>();
        Map<Path, Boolean> modified = new HashMap<>();
        for (Path file : modifiedFiles.keySet()) modified.put(file.normalize(), true);
        for (Map.Entry<Path, String> entry : modifiedFiles.entrySet()) {
            String text = entry.getValue();
            Matcher pkg = PACKAGE.matcher(text);
            Path samePackage = pkg.find() ? sourceRoot.resolve(pkg.group(1).replace('.', '/')).normalize() : sourceRoot;
            Map<String, Path> candidates = new HashMap<>();
            Matcher imports = IMPORT.matcher(text);
            while (imports.find()) {
                String name = imports.group(1);
                Path file = sourceRoot.resolve(name.replace('.', '/') + ".java").normalize();
                if (file.startsWith(sourceRoot) && Files.isRegularFile(file)) candidates.put(name.substring(name.lastIndexOf('.') + 1), file);
            }
            Matcher words = IDENTIFIER.matcher(stripComments(text));
            while (words.find()) {
                String word = words.group();
                Path file = candidates.get(word);
                if (file == null) {
                    Path sibling = samePackage.resolve(word + ".java").normalize();
                    if (sibling.startsWith(sourceRoot) && Files.isRegularFile(sibling)) file = sibling;
                }
                if (file == null || modified.containsKey(file)) continue;
                uses.merge(file, 1, Integer::sum);
            }
        }
        List<Map.Entry<Path, Integer>> ranked = new ArrayList<>(uses.entrySet());
        ranked.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        StringBuilder out = new StringBuilder();
        int taken = 0;
        for (Map.Entry<Path, Integer> entry : ranked) {
            if (taken >= MAX_CLASSES || out.length() >= MAX_TOTAL) break;
            String outline;
            try { outline = outlineOf(Files.readString(entry.getKey(), StandardCharsets.UTF_8)); }
            catch (IOException | RuntimeException e) { continue; }
            if (outline.isBlank()) continue;
            if (outline.length() > MAX_PER_CLASS) outline = outline.substring(0, outline.lastIndexOf('\n', MAX_PER_CLASS)) + "\n    // ... (more members omitted)\n}";
            out.append("\n// --- ").append(sourceRoot.relativize(entry.getKey())).append(" (declarations only) ---\n").append(outline).append('\n');
            taken++;
        }
        String subclasses = concreteSubclasses(sourceRoot, modifiedFiles, versionLabel);
        if (out.length() == 0 && subclasses.isEmpty()) return "";
        if (out.length() == 0) return subclasses;
        return subclasses + "\n\n// ===== API OUTLINE of project classes used by the source above (declarations and one-line summaries from the "
                + versionLabel + "; method bodies are not shown, so do not assume behaviour that is not stated) =====\n" + out;
    }

    private static final Pattern TYPE_DECLARATION = Pattern.compile(
            "(?m)^[\\w\\s@]*?\\b(abstract\\s+)?(class|interface)\\s+(\\w+)([^{]*)\\{");

    /**
     * For an abstract (or interface) class under test: the concrete project classes that extend/implement it (two levels),
     * with their constructors. A model that writes its own subclass cannot see every abstract method it must implement
     * (e.g. Chart's drawItem comes from an interface), so it should use one of these instead.
     */
    static String concreteSubclasses(Path sourceRoot, Map<Path, String> modifiedFiles, String versionLabel) {
        List<String> abstractTypes = new ArrayList<>();
        for (String text : modifiedFiles.values()) {
            Matcher type = TYPE_DECLARATION.matcher(stripComments(text));
            if (type.find() && (type.group(1) != null || "interface".equals(type.group(2)))) abstractTypes.add(type.group(3));
        }
        if (abstractTypes.isEmpty()) return "";
        Map<String, Path> files = new LinkedHashMap<>();
        Map<String, String> headers = new HashMap<>();
        Map<String, Boolean> isAbstract = new HashMap<>();
        try (java.util.stream.Stream<Path> walk = Files.walk(sourceRoot)) {
            for (Path file : (Iterable<Path>) walk.filter(f -> f.toString().endsWith(".java")).sorted()::iterator) {
                String text;
                try { text = stripComments(Files.readString(file, StandardCharsets.UTF_8)); } catch (IOException e) { continue; }
                Matcher type = TYPE_DECLARATION.matcher(text);
                if (!type.find()) continue;
                files.put(type.group(3), file);
                headers.put(type.group(3), type.group(4));
                isAbstract.put(type.group(3), type.group(1) != null || "interface".equals(type.group(2)));
            }
        } catch (IOException e) { return ""; }
        StringBuilder out = new StringBuilder();
        for (String base : abstractTypes) {
            List<String> found = new ArrayList<>();
            List<String> frontier = new ArrayList<>(List.of(base));
            for (int level = 0; level < 2 && found.size() < 8; level++) {
                List<String> next = new ArrayList<>();
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    String header = entry.getValue();
                    for (String parent : frontier) {
                        if (!Pattern.compile("\\b(extends|implements)\\b[^{]*\\b" + Pattern.quote(parent) + "\\b").matcher(header).find()) continue;
                        if (Boolean.TRUE.equals(isAbstract.get(entry.getKey()))) next.add(entry.getKey());
                        else if (!found.contains(entry.getKey()) && found.size() < 8) found.add(entry.getKey());
                    }
                }
                frontier = next;
            }
            if (found.isEmpty()) continue;
            out.append("\n\n// ===== CONCRETE SUBCLASSES of ").append(base).append(" in the project (" + versionLabel + "). ").append(base)
                    .append(" is abstract: test it through one of these, importing it; do not write your own subclass. Constructors: =====\n");
            int shown = 0;
            for (String name : found) {
                Path file = files.get(name);
                out.append("// --- ").append(sourceRoot.relativize(file)).append(" ---\n");
                if (shown++ >= 4) continue;   // names only after the first few
                try {
                    String outline = outlineOf(Files.readString(file, StandardCharsets.UTF_8));
                    for (String line : outline.split("\n")) {
                        String trimmed = line.trim();
                        if (trimmed.matches("(public|protected)?\\s*" + Pattern.quote(name) + "\\s*\\(.*")) out.append("    ").append(trimmed).append('\n');
                    }
                } catch (IOException | RuntimeException ignored) { }
            }
        }
        return out.toString();
    }

    private static String stripComments(String text) {
        return text.replaceAll("(?s)/\\*.*?\\*/", " ").replaceAll("(?m)//.*$", " ");
    }

    /** Type header plus the non-private members declared directly in the top-level type. */
    static String outlineOf(String source) {
        StringBuilder out = new StringBuilder();
        StringBuilder header = new StringBuilder();
        String pendingDoc = "";
        int depth = 0;
        boolean typeOpened = false;
        int n = source.length();
        for (int i = 0; i < n; i++) {
            char c = source.charAt(i);
            if (c == '/' && i + 1 < n && source.charAt(i + 1) == '*') {
                int end = source.indexOf("*/", i + 2);
                if (end < 0) break;
                if (depth == 1 && source.startsWith("/**", i)) pendingDoc = summary(source.substring(i + 3, end));
                i = end + 1;
                continue;
            }
            if (c == '/' && i + 1 < n && source.charAt(i + 1) == '/') {
                int end = source.indexOf('\n', i);
                i = end < 0 ? n : end;
                continue;
            }
            if (c == '"' || c == '\'') {
                int j = i + 1;
                while (j < n && source.charAt(j) != c) { if (source.charAt(j) == '\\') j++; j++; }
                if (depth <= 1) header.append(c).append(c);
                i = j;
                continue;
            }
            if (c == '{') {
                if (depth == 0 && !typeOpened && isTypeHeader(header.toString())) {
                    out.append(clean(header.toString())).append(" {\n");
                    typeOpened = true;
                    header.setLength(0);
                } else if (depth == 1) {
                    addMember(out, header.toString(), pendingDoc, true);
                    header.setLength(0); pendingDoc = "";
                }
                depth++;
                continue;
            }
            if (c == '}') {
                depth--;
                if (depth == 1) { header.setLength(0); }
                if (depth <= 0) break;
                continue;
            }
            if (depth == 0 && !typeOpened) { header.append(c); continue; }
            if (depth == 1) {
                if (c == ';') { addMember(out, header.toString(), pendingDoc, false); header.setLength(0); pendingDoc = ""; }
                else header.append(c);
            }
        }
        if (!typeOpened) return "";
        return out.append("}").toString();
    }

    private static boolean isTypeHeader(String header) {
        return Pattern.compile("\\b(class|interface|enum)\\b").matcher(header).find() && !header.contains("(");
    }

    private static String clean(String text) {
        String cleaned = text.replaceAll("(?m)^\\s*(@\\w+(\\([^)]*\\))?\\s*)+", "").replaceAll("\\s+", " ").trim();
        int pkg = cleaned.lastIndexOf(';');
        return pkg >= 0 ? cleaned.substring(pkg + 1).trim() : cleaned;
    }

    private static void addMember(StringBuilder out, String rawHeader, String doc, boolean hasBody) {
        String header = clean(rawHeader);
        if (header.isEmpty() || header.startsWith("static {") || header.equals("static")) return;
        if (header.matches("(?s).*\\bprivate\\b.*")) return;
        boolean isMethodLike = header.contains("(");
        if (!isMethodLike && !header.matches("(?s).*\\b(public|protected)\\b.*")) return;   // fields: only public/protected ones
        if (isMethodLike && header.contains("=") && header.indexOf('=') < header.indexOf('(')) return;
        String line = "    " + (doc.isEmpty() ? "" : "/** " + doc + " */\n    ") + header + (hasBody && isMethodLike ? ";" : (hasBody ? " { ... }" : ";"));
        out.append(line).append('\n');
    }

    private static String summary(String doc) {
        String text = doc.replaceAll("(?m)^\\s*\\*+", " ").replaceAll("<[^>]+>", " ").replaceAll("\\{@\\w+\\s+([^}]*)\\}", "$1")
                .replaceAll("@(param|return|throws|exception|see|since|author|version|deprecated)\\b.*", "").replaceAll("\\s+", " ").trim();
        int stop = text.indexOf(". ");
        if (stop > 0) text = text.substring(0, stop + 1);
        return text.length() > 220 ? text.substring(0, 220) + "…" : text;
    }
}
