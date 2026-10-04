import java.util.HashMap;
import java.util.Map;

/**
 * Branch-distance recorder used by the instrumented target classes (see BranchAgent). For every conditional jump the
 * instrumentation reports the operands; this class keeps, per jump, how far the operands were from making the jump go
 * the other way (0 = that outcome was taken). The search reads it after each call and rewards inputs that come closer
 * to an outcome no kept test has taken yet (the "branch distance" of search-based testing).
 */
public final class BranchRecorder {
    private BranchRecorder() { }

    /** jump id -> {min distance to the true outcome, min distance to the false outcome} seen since reset(). */
    private static final Map<Integer, double[]> DISTANCES = new HashMap<Integer, double[]>();
    private static double pendingMagnitude = -1;   // |a - b| of a preceding long/float/double comparison
    private static final int LIMIT = 2000;

    // opcodes as in the JVM specification
    private static final int IFEQ = 153, IFNE = 154, IFLT = 155, IFGE = 156, IFGT = 157, IFLE = 158,
            IF_ICMPEQ = 159, IF_ICMPNE = 160, IF_ICMPLT = 161, IF_ICMPGE = 162, IF_ICMPGT = 163, IF_ICMPLE = 164,
            IF_ACMPEQ = 165, IF_ACMPNE = 166, IFNULL = 198, IFNONNULL = 199;

    public static synchronized void reset() { DISTANCES.clear(); pendingMagnitude = -1; }

    /** One int operand compared with zero (also the int result of lcmp/fcmp/dcmp, whose magnitude was stored). */
    public static void one(int value, int opcode, int id) {
        double v = value;
        double magnitude = pendingMagnitude;
        pendingMagnitude = -1;
        if (magnitude >= 0) v = value < 0 ? -magnitude : value > 0 ? magnitude : 0;   // keep the real distance of the comparison
        record(id, v, opcode);
    }

    /** Two int operands. */
    public static void two(int a, int b, int opcode, int id) {
        pendingMagnitude = -1;
        record(id, (double) a - (double) b, opcode - (IF_ICMPEQ - IFEQ));
    }

    public static void ref(Object o, int opcode, int id) {
        pendingMagnitude = -1;
        boolean isNull = o == null;
        boolean taken = opcode == IFNULL ? isNull : !isNull;
        put(id, taken ? 0 : 1, taken ? 1 : 0);
    }

    public static void refs(Object a, Object b, int opcode, int id) {
        pendingMagnitude = -1;
        boolean same = a == b;
        boolean taken = opcode == IF_ACMPEQ ? same : !same;
        put(id, taken ? 0 : 1, taken ? 1 : 0);
    }

    /** Replacements of lcmp / fcmpl / fcmpg / dcmpl / dcmpg: same result, magnitude remembered for the following jump. */
    public static int lcmp(long a, long b) { pendingMagnitude = Math.abs((double) a - (double) b); return a < b ? -1 : a == b ? 0 : 1; }
    public static int fcmpl(float a, float b) { pendingMagnitude = Float.isNaN(a) || Float.isNaN(b) ? 1 : Math.abs((double) a - b); return Float.isNaN(a) || Float.isNaN(b) ? -1 : a < b ? -1 : a == b ? 0 : 1; }
    public static int fcmpg(float a, float b) { pendingMagnitude = Float.isNaN(a) || Float.isNaN(b) ? 1 : Math.abs((double) a - b); return Float.isNaN(a) || Float.isNaN(b) ? 1 : a < b ? -1 : a == b ? 0 : 1; }
    public static int dcmpl(double a, double b) { pendingMagnitude = Double.isNaN(a) || Double.isNaN(b) ? 1 : Math.abs(a - b); return Double.isNaN(a) || Double.isNaN(b) ? -1 : a < b ? -1 : a == b ? 0 : 1; }
    public static int dcmpg(double a, double b) { pendingMagnitude = Double.isNaN(a) || Double.isNaN(b) ? 1 : Math.abs(a - b); return Double.isNaN(a) || Double.isNaN(b) ? 1 : a < b ? -1 : a == b ? 0 : 1; }

    /** v is the (signed) value compared with 0 by a jump of the single-operand kind. */
    private static void record(int id, double v, int opcode) {
        double toTrue, toFalse;
        switch (opcode) {
            case IFEQ: toTrue = Math.abs(v); toFalse = v == 0 ? 1 : 0; break;
            case IFNE: toTrue = v == 0 ? 1 : 0; toFalse = Math.abs(v); break;
            case IFLT: toTrue = v < 0 ? 0 : v + 1; toFalse = v < 0 ? -v : 0; break;
            case IFGE: toTrue = v >= 0 ? 0 : -v; toFalse = v >= 0 ? v + 1 : 0; break;
            case IFGT: toTrue = v > 0 ? 0 : 1 - v; toFalse = v > 0 ? v : 0; break;
            case IFLE: toTrue = v <= 0 ? 0 : v; toFalse = v <= 0 ? 1 - v : 0; break;
            default: return;
        }
        put(id, toTrue, toFalse);
    }

    private static synchronized void put(int id, double toTrue, double toFalse) {
        double[] best = DISTANCES.get(id);
        if (best == null) {
            if (DISTANCES.size() >= LIMIT) return;
            DISTANCES.put(id, new double[]{toTrue, toFalse});
        } else {
            if (toTrue < best[0]) best[0] = toTrue;
            if (toFalse < best[1]) best[1] = toFalse;
        }
    }

    /** "id:toTrue:toFalse;..." with distances normalised to [0,1) (0 = taken), at most 400 entries. */
    public static synchronized String dump() {
        StringBuilder out = new StringBuilder();
        int n = 0;
        for (Map.Entry<Integer, double[]> entry : DISTANCES.entrySet()) {
            if (n++ >= 400) break;
            double[] d = entry.getValue();
            if (out.length() > 0) out.append(';');
            out.append(entry.getKey()).append(':').append(norm(d[0])).append(':').append(norm(d[1]));
        }
        return out.toString();
    }

    private static String norm(double d) {
        if (d <= 0) return "0";
        double n = d / (d + 1);
        return String.valueOf(Math.round(n * 1000) / 1000.0);
    }
}
