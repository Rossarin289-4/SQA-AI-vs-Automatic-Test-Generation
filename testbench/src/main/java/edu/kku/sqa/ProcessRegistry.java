package edu.kku.sqa;

import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** The external processes (Defects4J, ant, search workers) of every run, so that a cancelled run can stop them. */
final class ProcessRegistry {
    private ProcessRegistry() { }

    private static final Map<Process, Path> RUNNING = new ConcurrentHashMap<>();

    static void register(Process process, Path workingDirectory) {
        RUNNING.put(process, workingDirectory.toAbsolutePath().normalize());
    }

    static void unregister(Process process) { RUNNING.remove(process); }

    /** Kills every registered process (with its children) that was started in or below the directory; returns how many. */
    static int killUnder(Path directory) {
        Path root = directory.toAbsolutePath().normalize();
        int killed = 0;
        for (Map.Entry<Process, Path> entry : RUNNING.entrySet()) {
            if (!entry.getValue().startsWith(root)) continue;
            entry.getKey().descendants().forEach(ProcessHandle::destroyForcibly);
            entry.getKey().destroyForcibly();
            killed++;
        }
        return killed;
    }
}
