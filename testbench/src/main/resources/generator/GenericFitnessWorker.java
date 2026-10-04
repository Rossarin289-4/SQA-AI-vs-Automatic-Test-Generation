import generated.algorithm.SearchInputFactory_scaffolding;
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.security.Permission;
import java.util.*;

/**
 * Evaluation worker for the generic search. Protocol (tab separated, values Base64):
 *   LIST  <classes>        -> METHOD <id> | SKIP <class> <reason> ... END
 *   CALL  <id> <args,...>  -> OK NULL | OK <type> <value> <S|N> | ERR <type> <message> | SKIP <reason>
 * SKIP means the harness (not the code under test) failed or the outcome is not reproducible.
 */
public final class GenericFitnessWorker {
    private static String decode(String value) { return new String(Base64.getDecoder().decode(value), StandardCharsets.UTF_8); }
    private static String encode(String value) { return Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8)); }

    private static String id(Class<?> type, Method method, String receiver) {
        StringJoiner parameters = new StringJoiner(",");
        for (Class<?> parameter : method.getParameterTypes()) parameters.add(parameter.getTypeName());
        return type.getName() + "#" + method.getName() + "#" + parameters + "#" + Modifier.isStatic(method.getModifiers()) + "#" + receiver;
    }

    public static void main(String[] args) throws Exception {
        // Keep the protocol channel private: code under test may print to System.out or read System.in.
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), StandardCharsets.UTF_8), true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        System.setOut(System.err);
        System.setIn(new ByteArrayInputStream(new byte[0]));
        try {
            System.setSecurityManager(new SecurityManager() {
                @Override public void checkExit(int status) { throw new SecurityException("System.exit blocked by search worker"); }
                @Override public void checkPermission(Permission permission) { }
                @Override public void checkPermission(Permission permission, Object context) { }
            });
        } catch (Throwable ignored) { /* newer JDKs disallow it; a timeout still protects the search */ }
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.equals("STOP")) break;
            String[] command = line.split("\\t", -1);
            if (command[0].equals("LIST")) list(decode(command[1]), writer);
            else if (command[0].equals("CALL")) writer.println(call(command));
        }
    }

    private static void list(String names, PrintWriter writer) {
        List<Class<?>> concrete = null;
        for (String name : names.split("\\s+")) {
            if (name.isEmpty()) continue;
            try {
                Class<?> type = Class.forName(name, false, GenericFitnessWorker.class.getClassLoader());
                String receiver = chooseReceiver(type);
                if (receiver == null) {
                    boolean anyInstanceMethod = false;
                    for (Method method : SearchInputFactory_scaffolding.candidateMethods(type))
                        if (!Modifier.isStatic(method.getModifiers())) { anyInstanceMethod = true; break; }
                    if (!anyInstanceMethod) receiver = type.getName();
                    else {
                        if (concrete == null) concrete = concreteClasses();
                        receiver = subclassReceiver(type, concrete);
                    }
                }
                int count = 0;
                String skippedInstance = null;
                for (Method method : SearchInputFactory_scaffolding.candidateMethods(type)) {
                    boolean isStatic = Modifier.isStatic(method.getModifiers());
                    if (!isStatic && receiver == null) { skippedInstance = "no instantiable receiver (abstract, no usable constructor, or no concrete subclass)"; continue; }
                    writer.println("METHOD\t" + encode(id(type, method, receiver == null ? type.getName() : receiver)));
                    count++;
                }
                if (count == 0) writer.println("SKIP\t" + encode(name) + "\t" + encode(skippedInstance != null ? skippedInstance : "no non-private methods declared by the project"));
            } catch (Throwable error) {
                writer.println("SKIP\t" + encode(name) + "\t" + encode("cannot load class: " + error));
            }
        }
        emitLiterals(names, writer);
        writer.println("END");
    }

    /** String and numeric constants of the target classes: values the code actually compares against. */
    private static void emitLiterals(String names, PrintWriter writer) {
        String directory = System.getProperty("bench.classes", "");
        if (directory.isEmpty()) return;
        Set<String> strings = new LinkedHashSet<String>(), numbers = new LinkedHashSet<String>();
        for (String name : names.split("\\s+")) {
            if (name.isEmpty()) continue;
            String top = name.contains("$") ? name.substring(0, name.indexOf('$')) : name;
            File file = new File(directory, top.replace('.', '/') + ".class");
            File folder = file.getParentFile();
            String simple = top.substring(top.lastIndexOf('.') + 1);
            File[] files = folder == null ? null : folder.listFiles();
            if (files == null) continue;
            Arrays.sort(files);
            for (File candidate : files) {
                String fileName = candidate.getName();
                if (fileName.equals(simple + ".class") || (fileName.startsWith(simple + "$") && fileName.endsWith(".class")))
                    readConstants(candidate, strings, numbers);
            }
        }
        int count = 0;
        for (String value : strings) {
            if (count++ >= 60) break;
            writer.println("LITERAL\tS\t" + encode(value));
        }
        count = 0;
        for (String value : numbers) {
            if (count++ >= 60) break;
            writer.println("LITERAL\tN\t" + encode(value));
        }
    }

    private static void readConstants(File file, Set<String> strings, Set<String> numbers) {
        DataInputStream in = null;
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            if (in.readInt() != 0xCAFEBABE) return;
            in.readUnsignedShort(); in.readUnsignedShort();
            int count = in.readUnsignedShort();
            String[] utf = new String[count];
            int[] stringIndex = new int[count];
            for (int i = 1; i < count; i++) {
                int tag = in.readUnsignedByte();
                switch (tag) {
                    case 1: utf[i] = in.readUTF(); break;
                    case 3: numbers.add(String.valueOf(in.readInt())); break;
                    case 4: { float f = in.readFloat(); if (!Float.isNaN(f) && !Float.isInfinite(f)) numbers.add(String.valueOf(f)); break; }
                    case 5: numbers.add(String.valueOf(in.readLong())); i++; break;
                    case 6: { double d = in.readDouble(); if (!Double.isNaN(d) && !Double.isInfinite(d)) numbers.add(String.valueOf(d)); i++; break; }
                    case 7: case 16: case 19: case 20: in.readUnsignedShort(); break;
                    case 8: stringIndex[i] = in.readUnsignedShort(); break;
                    case 9: case 10: case 11: case 12: case 17: case 18: in.readInt(); break;
                    case 15: in.readUnsignedByte(); in.readUnsignedShort(); break;
                    default: return;
                }
            }
            for (int i = 1; i < count; i++) {
                String value = stringIndex[i] > 0 ? utf[stringIndex[i]] : null;
                if (value == null || value.isEmpty() || value.length() > 24) continue;
                boolean printable = true;
                for (int c = 0; c < value.length(); c++) if (value.charAt(c) < 32 || value.charAt(c) > 126) { printable = false; break; }
                if (printable) strings.add(value);
            }
        } catch (Throwable ignored) {
        } finally {
            if (in != null) try { in.close(); } catch (IOException ignored) { }
        }
    }

    private static String chooseReceiver(Class<?> type) {
        try {
            if (SearchInputFactory_scaffolding.canCreateInstance(type.getName()) && SearchInputFactory_scaffolding.newReceiver(type.getName()) != null)
                return type.getName();
        } catch (Throwable ignored) { }
        return null;
    }

    /** Concrete classes of the compiled project (bench.classes), used as receivers for abstract targets. */
    private static List<Class<?>> concreteClasses() {
        List<Class<?>> result = new ArrayList<Class<?>>();
        String directory = System.getProperty("bench.classes", "");
        if (directory.isEmpty()) return result;
        File root = new File(directory);
        if (!root.isDirectory()) return result;
        Deque<File> pending = new ArrayDeque<File>();
        pending.push(root);
        int scanned = 0;
        while (!pending.isEmpty() && scanned < 20000) {
            File current = pending.pop();
            File[] children = current.listFiles();
            if (children == null) continue;
            Arrays.sort(children);
            for (File child : children) {
                if (child.isDirectory()) { pending.push(child); continue; }
                String path = child.getPath();
                if (!path.endsWith(".class")) continue;
                String relative = path.substring(root.getPath().length() + 1, path.length() - 6).replace(File.separatorChar, '.');
                if (relative.endsWith("package-info") || relative.endsWith("module-info")) continue;
                scanned++;
                try {
                    Class<?> candidate = Class.forName(relative, false, GenericFitnessWorker.class.getClassLoader());
                    if (!candidate.isInterface() && !Modifier.isAbstract(candidate.getModifiers())) result.add(candidate);
                } catch (Throwable ignored) { }
            }
        }
        return result;
    }

    private static String subclassReceiver(final Class<?> type, List<Class<?>> concrete) {
        final String pkg = type.getPackage() == null ? "" : type.getPackage().getName();
        List<Class<?>> matches = new ArrayList<Class<?>>();
        for (Class<?> candidate : concrete) if (candidate != type && type.isAssignableFrom(candidate)) matches.add(candidate);
        Collections.sort(matches, new Comparator<Class<?>>() {
            public int compare(Class<?> a, Class<?> b) {
                boolean samePackageA = a.getName().startsWith(pkg + "."), samePackageB = b.getName().startsWith(pkg + ".");
                if (samePackageA != samePackageB) return samePackageA ? -1 : 1;
                return a.getName().compareTo(b.getName());
            }
        });
        for (Class<?> candidate : matches) {
            String receiver = chooseReceiver(candidate);
            if (receiver != null) return receiver;
        }
        return null;
    }

    private static Object agent;
    private static Method agentReset, agentData;
    static {
        // Present when the JVM was started with the JaCoCo agent: per-call branch/line probes of the target classes.
        try {
            Class<?> runtime = Class.forName("org.jacoco.agent.rt.RT");
            Object found = runtime.getMethod("getAgent").invoke(null);
            Class<?> api = Class.forName("org.jacoco.agent.rt.IAgent");
            agentReset = api.getMethod("reset");
            agentData = api.getMethod("getExecutionData", boolean.class);
            agent = found;
        } catch (Throwable ignored) { agent = null; }
    }
    private static final char[] HEX = "0123456789abcdef".toCharArray();

    /** Probes hit since the last reset, per class: "classIdHex:probeCount:packedBitsHex;..." (JaCoCo exec format). */
    private static String coverage() {
        if (agent == null) return "";
        try {
            byte[] data = (byte[]) agentData.invoke(agent, Boolean.FALSE);
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(data));
            StringBuilder out = new StringBuilder();
            while (in.available() > 0) {
                int block = in.readUnsignedByte();
                if (block == 0x01) { in.readChar(); in.readChar(); }
                else if (block == 0x10) { in.readUTF(); in.readLong(); in.readLong(); }
                else if (block == 0x11) {
                    long id = in.readLong();
                    in.readUTF();
                    int length = 0, shift = 0, part;
                    do { part = in.readUnsignedByte(); length |= (part & 0x7F) << shift; shift += 7; } while ((part & 0x80) != 0);
                    if (out.length() > 0) out.append(';');
                    out.append(Long.toHexString(id)).append(':').append(length).append(':');
                    for (int i = 0, bytes = (length + 7) / 8; i < bytes; i++) {
                        int b = in.readUnsignedByte();
                        out.append(HEX[b >>> 4]).append(HEX[b & 15]);
                    }
                } else break;
            }
            return out.toString();
        } catch (Throwable ignored) { return ""; }
    }

    private static String call(String[] command) {
        if (agent != null) try { agentReset.invoke(agent); } catch (Throwable ignored) { }
        BranchRecorder.reset();
        lastFollow = new ArrayList<String[]>();
        List<String[]> followed = lastFollow;
        String response = guarded(command);
        if (!followed.isEmpty() && !response.startsWith("SKIP")) {
            StringBuilder text = new StringBuilder("\tfollow:");
            for (int i = 0; i < followed.size(); i++) {
                if (i > 0) text.append(';');
                text.append(encode(followed.get(i)[0])).append('!').append(encode(followed.get(i)[1])).append('!').append(followed.get(i)[2]);
            }
            response += text;
        }
        if (response.startsWith("OK")) {
            String state = SearchInputFactory_scaffolding.receiverState();
            if (state != null) response += "\tstate:" + encode(state);
        }
        String covered = coverage();
        if (!covered.isEmpty()) response += "\tcov:" + covered;
        String distances = BranchRecorder.dump();
        return distances.isEmpty() ? response : response + "\tbd:" + distances;
    }

    /** Runs the calls; replaced when a call does not return in time. */
    private static final class Runner extends Thread {
        final java.util.concurrent.SynchronousQueue<String[]> in = new java.util.concurrent.SynchronousQueue<String[]>();
        final java.util.concurrent.SynchronousQueue<String> out = new java.util.concurrent.SynchronousQueue<String>();
        Runner() { super("search-call"); setDaemon(true); }
        public void run() {
            try { while (true) out.put(invoke(in.take())); }
            catch (InterruptedException ignored) { }
        }
    }
    /** Follow-up calls actually made by the current call (name, parameter types, variant). */
    private static volatile List<String[]> lastFollow = new ArrayList<String[]>();
    private static Runner runner;
    private static boolean warmed;
    private static int stuck;
    private static final long CALL_LIMIT_MS = 400, FIRST_CALL_LIMIT_MS = 8000;

    /**
     * One call with a time limit inside this JVM: an input that makes the code under test loop (or compute for seconds) is
     * abandoned after 400 ms instead of costing a worker restart. The abandoned thread is stopped; if stopping fails three
     * times the host is asked to restart the JVM.
     */
    @SuppressWarnings("deprecation")
    private static String guarded(String[] command) {
        try {
            if (runner == null || !runner.isAlive()) { runner = new Runner(); runner.start(); }
            runner.in.put(command);
            String response = runner.out.poll(warmed ? CALL_LIMIT_MS : FIRST_CALL_LIMIT_MS, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (response != null) { warmed = true; return response; }
            Runner abandoned = runner;
            runner = null;
            try { abandoned.stop(); } catch (Throwable ignored) { }
            abandoned.join(100);
            if (abandoned.isAlive() && ++stuck >= 3) return "SKIP\t" + encode("hang; restart");
            return "SKIP\t" + encode("timeout " + CALL_LIMIT_MS + " ms");
        } catch (InterruptedException e) {
            return "SKIP\t" + encode("interrupted");
        }
    }

    private static String invoke(String[] command) {
        try {
            String[] target = decode(command[1]).split("#", -1);
            String[] typeNames = target[2].isEmpty() ? new String[0] : target[2].split(",");
            String[] values = new String[typeNames.length];
            if (typeNames.length > 0) {
                // split with limit -1 keeps trailing empty values, e.g. an empty String argument
                String[] encoded = command.length < 3 ? new String[0] : command[2].split(",", -1);
                if (encoded.length != typeNames.length) return "SKIP\t" + encode("argument count mismatch");
                for (int i = 0; i < values.length; i++) values[i] = decode(encoded[i]);
            }
            String receiver = target.length > 4 ? target[4] : target[0];
            // optional: receiver construction variant, and set-up calls "id!arg,arg;id!arg,arg" (ids and values Base64)
            int variant = command.length > 3 && command[3].length() > 0 ? Integer.parseInt(command[3]) : 0;
            String[][] prefix = null;
            if (command.length > 4 && command[4].length() > 0) {
                String[] steps = command[4].split(";");
                prefix = new String[steps.length][];
                for (int s = 0; s < steps.length; s++) {
                    int bang = steps[s].indexOf('!');
                    String[] id = decode(steps[s].substring(0, bang)).split("#", -1);
                    String[] stepTypes = id[2].isEmpty() ? new String[0] : id[2].split(",");
                    String[] encodedArgs = stepTypes.length == 0 ? new String[0] : steps[s].substring(bang + 1).split(",", -1);
                    if (encodedArgs.length != stepTypes.length) return "SKIP\t" + encode("prefix argument count mismatch");
                    prefix[s] = new String[3 + stepTypes.length];
                    prefix[s][0] = id[0]; prefix[s][1] = id[1]; prefix[s][2] = id[2];
                    for (int i = 0; i < stepTypes.length; i++) prefix[s][3 + i] = decode(encodedArgs[i]);
                }
            }
            int environment = command.length > 5 && command[5].length() > 0 ? Integer.parseInt(command[5]) : 0;
            Object result = SearchInputFactory_scaffolding.call(target[0], receiver, target[1], typeNames, values,
                    Boolean.parseBoolean(target[3]), variant, prefix, environment);
            // optional follow-up calls on the returned object: "methodIndex:variant,methodIndex:variant"
            if (command.length > 6 && command[6].length() > 0) {
                String[] picks = command[6].split(",");
                int[] indexes = new int[picks.length], variants = new int[picks.length];
                for (int i = 0; i < picks.length; i++) {
                    int colon = picks[i].indexOf(':');
                    indexes[i] = Integer.parseInt(picks[i].substring(0, colon));
                    variants[i] = Integer.parseInt(picks[i].substring(colon + 1));
                }
                result = SearchInputFactory_scaffolding.followByIndex(result, indexes, variants, lastFollow);
            }
            return describe(result);
        } catch (SearchInputFactory_scaffolding.HarnessException error) {
            return "SKIP\t" + encode(String.valueOf(error.getMessage()));
        } catch (Throwable error) {
            String type = error.getClass().getName();
            if (error instanceof SecurityException && String.valueOf(error.getMessage()).contains("System.exit")) return "SKIP\t" + encode("System.exit");
            if (error instanceof OutOfMemoryError || error instanceof StackOverflowError) return "SKIP\t" + encode(type);
            if (type.contains("$$Lambda") || type.contains("$Proxy") || type.matches(".*\\$[0-9]+.*")) return "SKIP\t" + encode("unstable exception type " + type);
            return "ERR\t" + type + "\t" + encode(error.getMessage() == null ? "" : error.getMessage());
        }
    }

    private static String describe(Object result) {
        if (result == null) return "OK\tNULL";
        String type = result.getClass().getName();
        // Anonymous classes, lambdas and proxies are numbered by the compiler/JVM and can differ between the buggy and the
        // fixed version: record only that something non-null came back ("?" = type not asserted).
        if (type.contains("$$Lambda") || type.contains("$Proxy") || type.matches(".*\\$[0-9]+.*"))
            return "OK\t?\t" + encode("") + "\tN";
        boolean scalar = result instanceof String || result instanceof Number || result instanceof Boolean
                || result instanceof Character || result instanceof Enum;
        String value = scalar ? String.valueOf(result) : "";
        // Identity hash codes (Object.toString) and similar values differ on every JVM run.
        if (scalar && value.matches("(?s).*@[0-9a-f]{5,}.*")) return "SKIP\t" + encode("identity-based value");
        // A very long text (a huge number, a long string) is asserted through its bounded text form instead.
        if (scalar && value.length() <= 200) return "OK\t" + type + "\t" + encode(value) + "\tS";
        // Arrays, collections, maps and objects with their own toString(): their text form is asserted too ("O").
        String observed = SearchInputFactory_scaffolding.observe(result);
        return observed == null ? "OK\t" + type + "\t" + encode("") + "\tN" : "OK\t" + type + "\t" + encode(observed) + "\tO";
    }
}
