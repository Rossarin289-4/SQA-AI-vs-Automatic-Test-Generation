package generated.algorithm;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Builds typed search inputs and performs the reflective call. The search worker and every
 * generated JUnit test use the same {@link #call} so a recorded outcome is reproducible.
 * Defects4J runs every .java file of a suite as a test class except files ending in _scaffolding, hence the suffix.
 * Written in Java 6 syntax because Defects4J compiles it at each project's source level.
 */
public final class SearchInputFactory_scaffolding {
    private SearchInputFactory_scaffolding() { }

    /** The harness (not the code under test) failed, so the outcome must not become an oracle. */
    public static final class HarnessException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public HarnessException(String message, Throwable cause) { super(message, cause); }
    }

    public static Class<?> resolve(String name) throws ClassNotFoundException {
        if (name.endsWith("[]")) return Array.newInstance(resolve(name.substring(0, name.length() - 2)), 0).getClass();
        if (name.equals("boolean")) return boolean.class;
        if (name.equals("byte")) return byte.class;
        if (name.equals("short")) return short.class;
        if (name.equals("int")) return int.class;
        if (name.equals("long")) return long.class;
        if (name.equals("float")) return float.class;
        if (name.equals("double")) return double.class;
        if (name.equals("char")) return char.class;
        return Class.forName(name);
    }

    /** Methods declared by the project's own class hierarchy (never java.lang.Object or JDK classes). */
    public static List<Method> candidateMethods(Class<?> type) {
        List<Method> result = new ArrayList<Method>();
        Set<String> seen = new HashSet<String>();
        for (Class<?> c = type; c != null && c != Object.class; c = c.getSuperclass()) {
            String name = c.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("sun.") || name.startsWith("jdk.")) break;
            Method[] declared;
            try { declared = c.getDeclaredMethods(); } catch (Throwable ignored) { continue; }
            Arrays.sort(declared, new Comparator<Method>() {
                public int compare(Method a, Method b) { return a.toString().compareTo(b.toString()); }
            });
            for (Method method : declared) {
                if (method.isSynthetic() || method.isBridge() || Modifier.isPrivate(method.getModifiers())) continue;
                if (seen.add(method.getName() + Arrays.toString(method.getParameterTypes()))) result.add(method);
            }
        }
        return result;
    }

    public static Method findMethod(Class<?> owner, String name, Class<?>[] types) throws NoSuchMethodException {
        for (Class<?> c = owner; c != null; c = c.getSuperclass()) {
            try {
                Method method = c.getDeclaredMethod(name, types);
                makeAccessible(method);
                return method;
            } catch (NoSuchMethodException ignored) { }
        }
        Method method = owner.getMethod(name, types);
        makeAccessible(method);
        return method;
    }

    private static void makeAccessible(java.lang.reflect.AccessibleObject member) {
        try { member.setAccessible(true); } catch (Throwable ignored) { }
    }

    public static boolean canCreateInstance(String className) {
        try {
            Class<?> type = resolve(className);
            if (type.isInterface() || Modifier.isAbstract(type.getModifiers())) return false;
            return true;   // newReceiver() decides: constructors, factories, then a field-default instance
        } catch (Throwable ignored) { }
        return false;
    }

    /**
     * A fresh receiver of the class: the first non-null object among a few deterministic constructor/argument variants
     * (a constructor may reject the first sample, e.g. a negative size). Used by the search worker and by every generated
     * test, so both see the same receiver.
     */
    public static Object newReceiver(String className) { return newReceiver(className, 0); }

    /** Same, starting at the given construction variant (another constructor / other constructor arguments). */
    public static Object newReceiver(String className, int first) {
        for (int variant = first; variant < first + 16; variant++) {
            try {
                Object value = build(className, "<sample:" + variant + ">");
                if (value != null) return value;
            } catch (Throwable ignored) { }
        }
        return null;
    }

    /**
     * Calls owner.name(values) on a fresh receiver. Exceptions thrown by the code under test are rethrown
     * unchanged; failures of the reflection harness are reported as {@link HarnessException}.
     */
    public static Object call(String owner, String receiver, String name, String[] typeNames, String[] values,
            boolean isStatic) throws Throwable {
        return call(owner, receiver, name, typeNames, values, isStatic, 0, null);
    }

    /** Default locales a call can be made under (environment 1..3); 0 keeps the JVM's own default. */
    private static final java.util.Locale[] LOCALES = { new java.util.Locale("tr", "TR"), java.util.Locale.GERMANY, java.util.Locale.FRANCE };

    /** Same as the call below, made while the default locale is set to LOCALES[environment - 1] (restored afterwards). */
    public static Object call(String owner, String receiver, String name, String[] typeNames, String[] values,
            boolean isStatic, int receiverVariant, String[][] prefix, int environment) throws Throwable {
        if (environment <= 0 || environment > LOCALES.length) return call(owner, receiver, name, typeNames, values, isStatic, receiverVariant, prefix);
        java.util.Locale saved = java.util.Locale.getDefault();
        try {
            java.util.Locale.setDefault(LOCALES[environment - 1]);
            return call(owner, receiver, name, typeNames, values, isStatic, receiverVariant, prefix);
        } finally {
            java.util.Locale.setDefault(saved);
        }
    }

    /**
     * A short call sequence on one receiver: the receiver is built with the given construction variant, the prefix calls
     * ({declaring class, method, "type1,type2", value1, value2, ...}) run first to bring it into a state (their results and
     * exceptions are ignored), then the observed call is made.
     */
    public static Object call(String owner, String receiver, String name, String[] typeNames, String[] values,
            boolean isStatic, int receiverVariant, String[][] prefix) throws Throwable {
        Method method;
        Object target = null;
        lastReceiver = null;
        Object[] args = new Object[typeNames.length];
        try {
            Class<?> ownerClass = resolve(owner);
            Class<?>[] types = new Class<?>[typeNames.length];
            for (int i = 0; i < types.length; i++) {
                types[i] = resolve(typeNames[i]);
                args[i] = build(typeNames[i], values[i]);
            }
            method = findMethod(ownerClass, name, types);
            if (!isStatic) {
                target = newReceiver(receiver, receiverVariant);
                if (target == null) throw new HarnessException("receiver " + receiver + " could not be constructed", null);
                lastReceiver = target;
                if (prefix != null) for (int p = 0; p < prefix.length; p++) runPrefix(target, prefix[p]);
            }
        } catch (HarnessException e) {
            throw e;
        } catch (Throwable e) {
            throw new HarnessException("cannot prepare call: " + e, e);
        }
        try {
            return invokeWithTimeout(method, target, args);
        } catch (InvocationTargetException e) {
            throw e.getCause() == null ? e : e.getCause();
        } catch (IllegalAccessException e) {
            throw new HarnessException("illegal access: " + e.getMessage(), e);
        } catch (IllegalArgumentException e) {
            throw new HarnessException("argument mismatch: " + e.getMessage(), e);
        } catch (ExceptionInInitializerError e) {
            throw new HarnessException("static initializer failed: " + e, e);
        } catch (NoClassDefFoundError e) {
            throw new HarnessException("class unavailable: " + e, e);
        }
    }

    private static void runPrefix(Object target, String[] step) {
        try {
            String[] stepTypes = step[2].length() == 0 ? new String[0] : step[2].split(",");
            Class<?>[] types = new Class<?>[stepTypes.length];
            Object[] args = new Object[stepTypes.length];
            for (int i = 0; i < types.length; i++) {
                types[i] = resolve(stepTypes[i]);
                args[i] = build(stepTypes[i], step[3 + i]);
            }
            invokeWithTimeout(findMethod(resolve(step[0]), step[1], types), target, args);
        } catch (Throwable ignored) { /* a failing set-up call leaves the receiver as it is; the outcome stays deterministic */ }
    }

    private static final Set<String> NO_FOLLOW = new HashSet<String>(Arrays.asList("forEach", "forEachRemaining", "spliterator", "stream",
            "parallelStream", "wait", "notify", "notifyAll", "hashCode", "toString", "equals", "getClass", "removeIf", "replaceAll",
            "sort", "compute", "computeIfAbsent", "computeIfPresent", "merge", "toArray"));

    /** Public instance methods that can be called on a returned object, in a stable order (name, then parameter types). */
    public static List<Method> followMethods(Class<?> type) {
        List<Method> result = new ArrayList<Method>();
        Method[] all;
        try { all = type.getMethods(); } catch (Throwable ignored) { return result; }
        Arrays.sort(all, new Comparator<Method>() {
            public int compare(Method a, Method b) {
                int byName = a.getName().compareTo(b.getName());
                return byName != 0 ? byName : Arrays.toString(a.getParameterTypes()).compareTo(Arrays.toString(b.getParameterTypes()));
            }
        });
        Set<String> seen = new HashSet<String>();
        for (Method method : all) {
            if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge()) continue;
            if (method.getDeclaringClass() == Object.class || NO_FOLLOW.contains(method.getName())) continue;
            if (method.getParameterTypes().length > 3) continue;
            if (!seen.add(method.getName() + Arrays.toString(method.getParameterTypes()))) continue;
            Method usable = accessible(method);
            if (usable != null) result.add(usable);
        }
        return result;
    }

    /** The same method as declared by a public type (e.g. java.util.Iterator.next for a private iterator class). */
    private static Method accessible(Method method) {
        if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) return method;
        Method found = publicDeclaration(method.getDeclaringClass(), method.getName(), method.getParameterTypes());
        if (found != null) return found;
        try { method.setAccessible(true); return method; } catch (Throwable ignored) { return null; }
    }

    private static Method publicDeclaration(Class<?> type, String name, Class<?>[] parameters) {
        if (type == null) return null;
        for (Class<?> parent : type.getInterfaces()) {
            if (Modifier.isPublic(parent.getModifiers())) {
                try { return parent.getMethod(name, parameters); } catch (NoSuchMethodException ignored) { }
            }
            Method deeper = publicDeclaration(parent, name, parameters);
            if (deeper != null) return deeper;
        }
        Class<?> parent = type.getSuperclass();
        if (parent == null) return null;
        if (Modifier.isPublic(parent.getModifiers())) {
            try {
                Method method = parent.getMethod(name, parameters);
                if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) return method;
            } catch (NoSuchMethodException ignored) { }
        }
        return publicDeclaration(parent, name, parameters);
    }

    private static boolean terminal(Object value) {
        return value == null || value instanceof String || value instanceof Number || value instanceof Boolean
                || value instanceof Character || value instanceof Enum || value instanceof Class;
    }

    /**
     * Follow-up calls are made on the returned object; when such a call itself returns an object the chain goes on with that
     * object (entrySet().iterator().next().setValue(..)), and when it returns a plain value or nothing it stays on the same
     * object (iterator.next(); iterator.setValue(..)). The result of the last call is what the test asserts.
     * Search side: follow-up calls chosen by index into followMethods(); each call made is added to resolved as
     * {method name, parameter types, argument variant} so that a generated test can repeat it by name.
     */
    public static Object followByIndex(Object value, int[] indexes, int[] variants, List<String[]> resolved) throws Throwable {
        Object current = value, last = value;
        for (int i = 0; i < indexes.length; i++) {
            if (terminal(current)) break;
            List<Method> methods = followMethods(current.getClass());
            if (methods.isEmpty()) break;
            Method method = methods.get(indexes[i] % methods.size());
            StringBuilder types = new StringBuilder();
            for (Class<?> parameter : method.getParameterTypes()) { if (types.length() > 0) types.append(','); types.append(parameter.getName().startsWith("[") ? parameter.getCanonicalName() : parameter.getName()); }
            resolved.add(new String[]{method.getName(), types.toString(), String.valueOf(variants[i])});
            last = invokeFollow(current, method, variants[i]);
            if (method.getReturnType() == void.class) last = current;
            else if (!terminal(last)) current = last;   // an object came back: go on with it; a plain value: stay on the same object
        }
        return last;
    }

    /** Test side: calls on the object a call returned ({method name, parameter types, argument variant}); the last result is returned. */
    public static Object follow(Object value, String[][] calls) throws Throwable {
        Object current = value, last = value;
        for (int c = 0; c < calls.length; c++) {
            if (current == null) throw new IllegalStateException("follow-up call " + calls[c][0] + " on null");
            Method method;
            try {
                String[] names = calls[c][1].length() == 0 ? new String[0] : calls[c][1].split(",");
                Class<?>[] types = new Class<?>[names.length];
                for (int i = 0; i < types.length; i++) types[i] = resolve(names[i]);
                method = accessible(current.getClass().getMethod(calls[c][0], types));
                if (method == null) throw new NoSuchMethodException(calls[c][0]);
            } catch (Throwable e) {
                throw new HarnessException("cannot prepare follow-up call: " + e, e);
            }
            last = invokeFollow(current, method, Integer.parseInt(calls[c][2]));
            if (method.getReturnType() == void.class) last = current;
            else if (!terminal(last)) current = last;   // same rule as the search: go on with a returned object, stay after a plain value
        }
        return last;
    }

    private static Object invokeFollow(Object value, Method method, int variant) throws Throwable {
        Class<?>[] parameters = method.getParameterTypes();
        Object[] args = new Object[parameters.length];
        try {
            for (int i = 0; i < args.length; i++) { steps = 0; args[i] = sample(parameters[i], variant + i, 1, false); }
        } catch (Throwable e) {
            throw new HarnessException("cannot build follow-up argument: " + e, e);
        }
        try {
            return invokeWithTimeout(method, value, args);
        } catch (InvocationTargetException e) {
            throw e.getCause() == null ? e : e.getCause();
        } catch (IllegalAccessException e) {
            throw new HarnessException("illegal access: " + e.getMessage(), e);
        } catch (IllegalArgumentException e) {
            throw new HarnessException("argument mismatch: " + e.getMessage(), e);
        }
    }

    /** The receiver of the most recent call(): its state after the call is part of the observed behaviour. */
    private static Object lastReceiver;

    /** Observable state of the receiver after the last call(), or null (static call, or no stable text form). */
    public static String receiverState() {
        return lastReceiver == null ? null : observe(lastReceiver);
    }

    private static final java.util.regex.Pattern IDENTITY = java.util.regex.Pattern.compile("@[0-9a-f]{5,}");

    /**
     * A deterministic text form of a value, or null when it has none: scalars, arrays, collections and maps of such values,
     * and objects whose class defines its own toString(). Identity-based text (Object.toString) is never returned.
     */
    public static String observe(Object value) {
        try {
            StringBuilder out = new StringBuilder();
            if (!describe(value, out, 0)) return null;
            String text = out.toString();
            if (IDENTITY.matcher(text).find()) return null;
            if (text.length() > 200) text = text.substring(0, 200) + "...#" + text.length() + "#" + text.hashCode();
            return text;
        } catch (Throwable ignored) {
            return null;
        }
    }

    private static boolean describe(Object value, StringBuilder out, int depth) throws Exception {
        if (value == null) { out.append("null"); return true; }
        if (out.length() > 4000 || depth > 4) return false;
        if (value instanceof String || value instanceof Number || value instanceof Boolean || value instanceof Character
                || value instanceof Enum) { out.append(String.valueOf(value)); return true; }
        Class<?> type = value.getClass();
        if (type.isArray()) {
            int length = Array.getLength(value);
            if (length > 200) return false;
            out.append('[');
            for (int i = 0; i < length; i++) {
                if (i > 0) out.append(", ");
                if (!describe(Array.get(value, i), out, depth + 1)) return false;
            }
            out.append(']');
            return true;
        }
        if (value instanceof Collection) {
            Collection<?> items = (Collection<?>) value;
            if (items.size() > 200) return false;
            List<String> parts = new ArrayList<String>();
            for (Object item : items) {
                StringBuilder part = new StringBuilder();
                if (!describe(item, part, depth + 1)) return false;
                parts.add(part.toString());
            }
            // The iteration order of a hash-based set is not part of its contract (it can differ between JVM runs).
            if (value instanceof Set && !(value instanceof SortedSet) && !(value instanceof LinkedHashSet)) Collections.sort(parts);
            out.append(parts.toString());
            return true;
        }
        if (value instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) value;
            if (map.size() > 200) return false;
            List<String> parts = new ArrayList<String>();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                StringBuilder part = new StringBuilder();
                if (!describe(entry.getKey(), part, depth + 1)) return false;
                part.append('=');
                if (!describe(entry.getValue(), part, depth + 1)) return false;
                parts.add(part.toString());
            }
            if (!(value instanceof SortedMap) && !(value instanceof LinkedHashMap)) Collections.sort(parts);
            out.append('{');
            for (int i = 0; i < parts.size(); i++) { if (i > 0) out.append(", "); out.append(parts.get(i)); }
            out.append('}');
            return true;
        }
        String name = type.getName();
        if (name.contains("$$Lambda") || name.contains("$Proxy") || name.matches(".*\\$[0-9]+.*")) return false;
        boolean hasText = type.getMethod("toString").getDeclaringClass() != Object.class;
        if (hasText) out.append(String.valueOf(value));
        // Inspectors: the values of the object's public no-argument getters (name=value, sorted), so that a change inside the
        // object shows even when its text form does not. Only at the top level, only cheap scalar-ish results.
        if (depth == 0) {
            String inspected = inspect(value);
            if (inspected.length() > 0) { if (hasText) out.append(' '); out.append(inspected); return true; }
        }
        return hasText;
    }

    private static final Set<String> INSPECTOR_PREFIXES = new HashSet<String>(Arrays.asList("get", "is", "has", "size", "length", "count", "contains", "can", "should"));

    /** "{getA=1, isB=true, ...}" from public no-argument methods that look like getters and return plain values; at most 16. */
    private static String inspect(Object value) {
        Method[] methods;
        try { methods = value.getClass().getMethods(); } catch (Throwable ignored) { return ""; }
        Arrays.sort(methods, new Comparator<Method>() {
            public int compare(Method a, Method b) { return a.getName().compareTo(b.getName()); }
        });
        StringBuilder out = new StringBuilder();
        int used = 0;
        for (Method method : methods) {
            if (used >= 16) break;
            if (Modifier.isStatic(method.getModifiers()) || method.getParameterTypes().length != 0 || method.isSynthetic()) continue;
            String name = method.getName();
            if (name.equals("getClass") || name.equals("hashCode") || name.equals("toString") || name.equals("clone")) continue;
            boolean getter = false;
            for (String prefix : INSPECTOR_PREFIXES) if (name.startsWith(prefix)) getter = true;
            if (!getter) continue;
            Class<?> result = method.getReturnType();
            boolean plain = result.isPrimitive() || result == String.class || Number.class.isAssignableFrom(result) || result == Boolean.class
                    || result == Character.class || result.isEnum() || result.isArray();
            if (!plain || result == void.class) continue;
            Method usable = accessible(method);
            if (usable == null) continue;
            String text;
            try {
                Object got = usable.invoke(value);
                StringBuilder part = new StringBuilder();
                text = got != null && describe(got, part, 1) ? part.toString() : (got == null ? "null" : "?");
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause() == null ? e : e.getCause();
                text = "!" + cause.getClass().getSimpleName();
            } catch (Throwable ignored) { continue; }
            if (text.length() > 60) text = text.substring(0, 60) + "..";
            out.append(used == 0 ? "{" : ", ").append(name).append('=').append(text);
            used++;
        }
        return used == 0 ? "" : out.append('}').toString();
    }

    /** Seconds one call may run inside a generated test (the search worker has its own timeout and sets bench.worker). */
    private static final long TEST_CALL_TIMEOUT_MS = 20000L;

    /**
     * In a generated test the call runs in a daemon thread and fails after 20 s: JUnit 3 suites (Cli) have no per-test
     * timeout, and an input that loops forever on one version would otherwise hang that whole Defects4J run.
     */
    private static Object invokeWithTimeout(final Method method, final Object target, final Object[] args) throws Exception {
        if (System.getProperty("bench.worker") != null) return method.invoke(target, args);
        final Object[] result = new Object[1];
        final Throwable[] failure = new Throwable[1];
        Thread worker = new Thread(new Runnable() {
            public void run() {
                try { result[0] = method.invoke(target, args); }
                catch (Throwable t) { failure[0] = t; }
            }
        }, "generated-test-call");
        worker.setDaemon(true);
        worker.start();
        worker.join(TEST_CALL_TIMEOUT_MS);
        if (worker.isAlive()) {
            worker.interrupt();
            throw new IllegalStateException("call did not finish within " + (TEST_CALL_TIMEOUT_MS / 1000) + " s (endless loop?)");
        }
        if (failure[0] instanceof Exception) throw (Exception) failure[0];
        if (failure[0] instanceof Error) throw (Error) failure[0];
        return result[0];
    }

    /** Upper bound of sample() calls for one build(): object graphs can otherwise grow exponentially with the nesting depth. */
    private static int steps;
    private static final int MAX_STEPS = 400;

    public static Object build(String typeName, String spec) throws Exception {
        steps = 0;
        Class<?> type = resolve(typeName);
        if ("<null>".equals(spec)) return null;
        if (type == String.class) return spec;
        // "<make:k|text>": the object made by a parser/factory of the project from the given text (k selects the factory).
        if (spec.startsWith("<make:") && spec.endsWith(">") && spec.indexOf('|') > 6) {
            int bar = spec.indexOf('|');
            int k = 0;
            try { k = Integer.parseInt(spec.substring(6, bar)); } catch (NumberFormatException ignored) { }
            String text = spec.substring(bar + 1, spec.length() - 1);
            Object made = fromProvider(type, k, 0, text);
            return made != null ? made : sample(type, k, 0, false);
        }
        // A scalar passed where the declared type is Object, Comparable, Serializable, CharSequence or Number.
        if (spec.length() > 3 && spec.charAt(0) == '<' && spec.charAt(2) == ':' && spec.endsWith(">")) {
            String inner = spec.substring(3, spec.length() - 1);
            char kind = spec.charAt(1);
            if (kind == 's' && type.isAssignableFrom(String.class)) return inner;
            if (kind == 'i' && type.isAssignableFrom(Integer.class)) return Integer.valueOf(inner);
            if (kind == 'd' && type.isAssignableFrom(Double.class)) return Double.valueOf(inner);
            if (kind == 'b' && type.isAssignableFrom(Boolean.class)) return Boolean.valueOf(inner);
        }
        if (type == boolean.class || type == Boolean.class) return Boolean.valueOf(spec);
        if (type == char.class || type == Character.class) return spec.length() == 0 ? '\0' : spec.charAt(0);
        if (type == byte.class || type == Byte.class) return Byte.valueOf(spec);
        if (type == short.class || type == Short.class) return Short.valueOf(spec);
        if (type == int.class || type == Integer.class) return Integer.valueOf(spec);
        if (type == long.class || type == Long.class) return Long.valueOf(spec);
        if (type == float.class || type == Float.class) return Float.valueOf(spec);
        if (type == double.class || type == Double.class) return Double.valueOf(spec);
        if (type == BigInteger.class) return new BigInteger(spec);
        if (type == BigDecimal.class) return new BigDecimal(spec);
        int variant = parseVariant(spec);
        if (type.isEnum()) {
            Object[] values = type.getEnumConstants();
            return values.length == 0 ? null : values[Math.floorMod(variant, values.length)];
        }
        return sample(type, variant, 0, "<empty>".equals(spec));
    }

    private static final Class<?>[] CLASS_SAMPLES = { String.class, GenericSub.class, GenericBase.class, GenericLeaf.class, Integer.class,
            Object.class, List.class, int.class, String[].class, Map.class, Comparable.class, Number.class, Collection.class,
            TypeSamples.class, ArrayList.class };

    private static final Object[] OBJECTS = { "a", Integer.valueOf(1), "b", Integer.valueOf(2), "key", Integer.valueOf(0), "", Boolean.TRUE,
            "c", Integer.valueOf(-1), Double.valueOf(1.5), "value" };

    private static boolean isLibrary(Class<?> type) {
        String name = type.getName();
        return name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("sun.") || name.startsWith("jdk.")
                || name.startsWith("org.w3c.") || name.startsWith("org.xml.");
    }

    private static final Map<Class<?>, List<Method>> PROVIDERS = new HashMap<Class<?>, List<Method>>();

    private static boolean simpleParameter(Class<?> p) {
        return p.isPrimitive() || p == String.class || p == CharSequence.class || p == Boolean.class || p == Integer.class || p == Long.class
                || p == Double.class || p == java.io.Reader.class || p == java.io.InputStream.class || p == byte[].class || p == char[].class;
    }

    /**
     * Public methods of the project classes in the type's package and its parent package that return the type (or a project
     * supertype of it) from simple arguments: the usual way a parser result, a document or a built object comes into being.
     */
    private static List<Method> providers(Class<?> type) {
        synchronized (PROVIDERS) {
            List<Method> cached = PROVIDERS.get(type);
            if (cached != null) return cached;
            List<Method> found = new ArrayList<Method>();
            try {
                java.security.CodeSource source = type.getProtectionDomain().getCodeSource();
                String name = type.getName();
                if (source != null && name.contains(".")) {
                    java.io.File location = new java.io.File(source.getLocation().toURI());
                    String pkg = name.substring(0, name.lastIndexOf('.'));
                    LinkedHashSet<String> names = new LinkedHashSet<String>();
                    names.add(name);
                    names.addAll(classNames(location, name, true));
                    if (pkg.contains(".")) names.addAll(classNames(location, pkg, true));
                    // The rest of the project (e.g. Closure's Compiler.parseTestCode for a rhino Node): classes under the
                    // first three package segments, parsers/factories/builders first, at most 300 more classes.
                    String[] segments = pkg.split("\\.");
                    if (segments.length >= 3) {
                        List<String> wider = classNamesUnder(location, segments[0] + "." + segments[1] + "." + segments[2]);
                        Collections.sort(wider, new Comparator<String>() {
                            public int compare(String a, String b) { int d = factoryScore(a) - factoryScore(b); return d != 0 ? d : a.compareTo(b); }
                        });
                        int added = 0;
                        for (String candidate : wider) { if (added >= 300) break; if (names.add(candidate)) added++; }
                    }
                    for (String candidate : names) {
                        if (found.size() >= 40) break;
                        if (candidate.contains("$")) continue;
                        Class<?> owner;
                        Method[] methods;
                        try { owner = Class.forName(candidate, false, type.getClassLoader()); methods = owner.getMethods(); }
                        catch (Throwable ignored) { continue; }
                        if (!Modifier.isPublic(owner.getModifiers())) continue;
                        boolean self = owner == type;   // the type's own static factories (createShell, parse, of, valueOf, ...)
                        Arrays.sort(methods, new Comparator<Method>() {
                            public int compare(Method a, Method b) { return a.toString().compareTo(b.toString()); }
                        });
                        boolean constructible = !owner.isInterface() && !Modifier.isAbstract(owner.getModifiers());
                        for (Method method : methods) {
                            Class<?> result = method.getReturnType();
                            if (method.getDeclaringClass() == Object.class || result.isPrimitive() || isLibrary(result)) continue;
                            if (!type.isAssignableFrom(result) && !result.isAssignableFrom(type)) continue;
                            Class<?>[] parameters = method.getParameterTypes();
                            if (parameters.length > 3) continue;
                            boolean simple = true;
                            for (Class<?> parameter : parameters) if (!simpleParameter(parameter)) simple = false;
                            if (!simple || (!Modifier.isStatic(method.getModifiers()) && (!constructible || self))) continue;
                            found.add(method);
                        }
                    }
                }
            } catch (Throwable ignored) { }
            PROVIDERS.put(type, found);
            return found;
        }
    }

    private static Object fromProvider(Class<?> type, int variant, int depth) { return fromProvider(type, variant, depth, null); }

    /** With a text: every String/Reader/InputStream argument of the factory carries that text (a real input of the project). */
    private static Object fromProvider(Class<?> type, int variant, int depth, String text) {
        List<Method> methods = providers(type);
        if (methods.isEmpty()) return null;
        int round = variant / methods.size();
        for (int attempt = 0; attempt < methods.size() && attempt < 6; attempt++) {
            Method method = methods.get((variant + attempt) % methods.size());
            try {
                Class<?>[] parameters = method.getParameterTypes();
                Object[] args = new Object[parameters.length];
                for (int i = 0; i < args.length; i++) {
                    Class<?> p = parameters[i];
                    if (text != null && (p == String.class || p == CharSequence.class)) args[i] = text;
                    else if (text != null && p == java.io.Reader.class) args[i] = new java.io.StringReader(text);
                    else if (text != null && p == java.io.InputStream.class) args[i] = new java.io.ByteArrayInputStream(text.getBytes("UTF-8"));
                    else args[i] = p == String.class || p == CharSequence.class
                            ? TEXTS[(round + i + 6) % TEXTS.length] : sample(p, round + i, depth + 1, false);
                }
                Object owner = Modifier.isStatic(method.getModifiers()) ? null : sample(method.getDeclaringClass(), 0, depth + 2, false);
                if (owner == null && !Modifier.isStatic(method.getModifiers())) continue;
                makeAccessible(method);
                Object made = method.invoke(owner, args);
                if (type.isInstance(made)) return made;
            } catch (Throwable ignored) { }
        }
        return null;
    }

    /** Small numbers after the boundary values: sizes, indexes and type codes are usually small. */
    private static final int[] SMALL = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 16, 32, 64, 100, 255, 256, 1000, -2, -10 };

    /** Texts for readers and streams: empty, one line, different line ends, separated values, markup, JSON, blanks. */
    private static final String[] TEXTS = { "", "a", "a\nb", "a\r\nb\r\n", "a\rb", "a,b\n1,2\n", "<a><b>t</b></a>", "{\"a\":1}",
            " x \t y ", "line1\n\nline3", "\n", "\r" };

    /** A class hierarchy with type parameters, for code that inspects generic types. */
    public static class GenericBase<T> {
        public T value;
        public List<T> values;
        public T[] array;
    }
    public static class GenericSub extends GenericBase<String> { }
    public static class GenericLeaf extends GenericSub { }

    /** A node of a small parsed XML document whose type fits the requested DOM interface (document, element, text, ...). */
    private static Object domNode(Class<?> type, int variant) {
        try {
            javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
            org.w3c.dom.Document document = factory.newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.StringReader(
                    "<root a=\"1\"><child>text</child><!--c--><?pi d?><empty/><![CDATA[x]]></root>")));
            List<Object> nodes = new ArrayList<Object>();
            org.w3c.dom.Element root = document.getDocumentElement();
            nodes.add(document);
            nodes.add(root);
            org.w3c.dom.NodeList children = root.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) nodes.add(children.item(i));
            nodes.add(root.getFirstChild().getFirstChild());
            nodes.add(root.getAttributeNode("a"));
            nodes.add(children);
            nodes.add(root.getAttributes());
            for (int i = 0; i < nodes.size(); i++) {
                Object node = nodes.get((variant + i) % nodes.size());
                if (type.isInstance(node)) return node;
            }
        } catch (Throwable ignored) { }
        return null;
    }

    /** Fields whose declared types cover plain, array, parameterized, wildcard and nested generic types. */
    public static final class TypeSamples {
        public String text;
        public int number;
        public String[] array;
        public List<String> list;
        public Map<String, Integer> map;
        public List<? extends Number> wildcard;
        public Map<String, List<Integer>> nested;
        public List<String>[] genericArray;
    }

    private static java.lang.reflect.Field[] sortedFields() {
        List<java.lang.reflect.Field> all = new ArrayList<java.lang.reflect.Field>(Arrays.asList(TypeSamples.class.getFields()));
        all.addAll(Arrays.asList(GenericBase.class.getFields()));
        java.lang.reflect.Field[] fields = all.toArray(new java.lang.reflect.Field[0]);
        Arrays.sort(fields, new Comparator<java.lang.reflect.Field>() {
            public int compare(java.lang.reflect.Field a, java.lang.reflect.Field b) { return a.toString().compareTo(b.toString()); }
        });
        return fields;
    }

    private static int parseVariant(String spec) {
        int colon = spec.indexOf(':');
        if (colon < 0) return 0;
        // "<sample:3>": the digits between the colon and the closing bracket
        int end = colon + 1;
        while (end < spec.length() && Character.isDigit(spec.charAt(end))) end++;
        if (end == colon + 1) return 0;
        try { return Integer.parseInt(spec.substring(colon + 1, end)); }
        catch (NumberFormatException ignored) { return 0; }
    }

    private static Object sample(Class<?> type, int variant, int depth, boolean empty) throws Exception {
        if (++steps > MAX_STEPS && !type.isPrimitive()) return null;
        if (type == String.class || type == CharSequence.class) return new String[]{"", "a", "0", "sample"}[variant % 4];
        if (type == boolean.class || type == Boolean.class) return (variant & 1) != 0;
        if (type == char.class || type == Character.class) return new char[]{'\0', ' ', 'a', '0'}[variant % 4];
        if (type == byte.class || type == Byte.class) return (byte) (variant < 4 ? new int[]{Byte.MIN_VALUE, -1, 0, Byte.MAX_VALUE}[variant] : SMALL[(variant - 4) % SMALL.length]);
        if (type == short.class || type == Short.class) return (short) (variant < 4 ? new int[]{Short.MIN_VALUE, -1, 0, Short.MAX_VALUE}[variant] : SMALL[(variant - 4) % SMALL.length]);
        if (type == int.class || type == Integer.class) return variant < 5 ? new int[]{Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE}[variant] : SMALL[(variant - 5) % SMALL.length];
        if (type == long.class || type == Long.class) return variant < 5 ? new long[]{Long.MIN_VALUE, -1, 0, 1, Long.MAX_VALUE}[variant] : (long) SMALL[(variant - 5) % SMALL.length];
        if (type == float.class || type == Float.class) return new float[]{Float.NEGATIVE_INFINITY, -1, 0, 1, Float.POSITIVE_INFINITY}[variant % 5];
        if (type == double.class || type == Double.class) return new double[]{Double.NEGATIVE_INFINITY, -1, 0, 1, Double.POSITIVE_INFINITY}[variant % 5];
        if (type == BigInteger.class) return new BigInteger[]{BigInteger.ZERO, BigInteger.ONE, BigInteger.valueOf(-1), BigInteger.ONE.shiftLeft(32)}[variant % 4];
        if (type == BigDecimal.class) return new BigDecimal[]{BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.valueOf(-1), new BigDecimal("1E+100")}[variant % 4];
        if (type.isEnum()) { Object[] e = type.getEnumConstants(); return e.length == 0 ? null : e[variant % e.length]; }
        // a value for a parameter declared as Object/Comparable/Serializable: observable scalars, not a bare new Object()
        if (type == Object.class || type == Comparable.class || type == java.io.Serializable.class) return OBJECTS[variant % OBJECTS.length];
        // JDK text and byte sources/sinks with real content
        if (type == java.io.Reader.class || type == Readable.class) return new java.io.StringReader(TEXTS[variant % TEXTS.length]);
        if (type == java.io.InputStream.class) return new java.io.ByteArrayInputStream(TEXTS[variant % TEXTS.length].getBytes("UTF-8"));
        if (type == java.io.Writer.class) return new java.io.StringWriter();
        if (type == java.io.OutputStream.class) return new java.io.ByteArrayOutputStream();
        if (type == Appendable.class) return new StringBuilder();
        if (type.isInterface() && type.getName().startsWith("org.w3c.dom.")) {
            Object node = domNode(type, variant);
            if (node != null) return node;
        }
        if (type == Class.class) return CLASS_SAMPLES[variant % CLASS_SAMPLES.length];
        if (type == java.lang.reflect.Field.class) { java.lang.reflect.Field[] fields = sortedFields(); return fields[variant % fields.length]; }
        if (type == java.lang.reflect.Type.class) {
            java.lang.reflect.Field[] fields = sortedFields();
            if (variant % 3 == 0) return fields[(variant / 3) % fields.length].getGenericType();
            if (variant % 3 == 1) return CLASS_SAMPLES[(variant / 3) % CLASS_SAMPLES.length];
            Class<?> owner = CLASS_SAMPLES[(variant / 3) % CLASS_SAMPLES.length];
            return owner.getGenericSuperclass() != null ? owner.getGenericSuperclass() : owner;
        }
        if (type == Method.class) {
            // plain, one-argument, and variable-arity methods
            Method[] methods = { String.class.getMethod("length"), Arrays.class.getMethod("asList", Object[].class),
                    String.class.getMethod("charAt", int.class), String.class.getMethod("format", String.class, Object[].class),
                    Object.class.getMethod("toString"), List.class.getMethod("get", int.class) };
            return methods[variant % methods.length];
        }
        if (depth > 4) return null;
        if (type.isArray()) {
            int size = empty ? 0 : variant % 3 + 1;
            Object array = Array.newInstance(type.getComponentType(), size);
            for (int i = 0; i < size; i++) Array.set(array, i, sample(type.getComponentType(), variant + i + 1, depth + 1, false));
            return array;
        }
        if (Optional.class.isAssignableFrom(type)) return empty ? Optional.empty() : Optional.ofNullable(new String[]{"", "a", "0", "sample"}[variant % 4]);
        if (Collection.class.isAssignableFrom(type)) {
            Collection<Object> result = collection(type);
            if (!empty) for (int i = 0; i < variant % 3 + 1; i++) result.add(new String[]{"", "a", "0", "sample"}[(variant + i) % 4]);
            return result;
        }
        if (Map.class.isAssignableFrom(type)) {
            Map<Object, Object> result = map(type);
            if (!empty) for (int i = 0; i < variant % 3 + 1; i++) result.put("key" + i, new String[]{"", "a", "0", "sample"}[(variant + i) % 4]);
            return result;
        }
        // Even variants from 4 on: an instance obtained from a factory/parser/builder method of the project (odd variants keep
        // using constructors and subclasses, so both kinds of objects stay reachable).
        if (variant >= 4 && variant % 2 == 0 && depth <= 1 && !type.isArray() && !isLibrary(type)) {
            Object made = fromProvider(type, variant / 2 - 2, depth);
            if (made != null) return made;
        }
        if (type.isInterface()) return proxy(type, variant);
        if (Modifier.isAbstract(type.getModifiers())) {
            Object made = invokeFactory(type, depth);
            return made != null ? made : fromConcreteSubclass(type, variant, depth);
        }
        Constructor<?>[] constructors = constructors(type);
        if (constructors.length == 0) {
            Object made = invokeFactory(type, depth);
            return made != null || depth > 0 ? made : allocate(type);
        }
        // Try every constructor, starting at the one the variant selects: the first ones are often unusable
        // (they reject null/abstract arguments), and giving up would leave the class without any receiver.
        for (int k = 0; k < constructors.length; k++) {
            Constructor<?> constructor = constructors[(variant + k) % constructors.length];
            Class<?>[] parameters = constructor.getParameterTypes();
            Object[] args = new Object[parameters.length];
            try {
                for (int i = 0; i < args.length; i++) args[i] = sample(parameters[i], variant + i + 1, depth + 1, false);
                return initialized(constructor.newInstance(args), depth);
            } catch (Throwable ignored) { }
        }
        Object made = invokeFactory(type, depth);
        return made != null || depth > 0 ? made : allocate(type);
    }

    /**
     * Last resort for a receiver whose constructors all failed: an instance with every field at its default value
     * (no constructor runs). Calls on it mostly end in exceptions, which are still deterministic outcomes to record.
     */
    private static Object allocate(Class<?> type) {
        try {
            Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
            java.lang.reflect.Field field = unsafeClass.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Object unsafe = field.get(null);
            return unsafeClass.getMethod("allocateInstance", Class.class).invoke(unsafe, type);
        } catch (Throwable ignored) { return null; }
    }

    /**
     * Some project classes need an explicit init call before use (Closure's Compiler.initOptions). Public methods named
     * init*, found on the project's own class hierarchy, are called once with sampled arguments; failures are ignored.
     */
    private static Object initialized(Object object, int depth) {
        if (object == null || depth > 2) return object;
        String owner = object.getClass().getName();
        if (owner.startsWith("java.") || owner.startsWith("javax.")) return object;
        int calls = 0;
        for (Method method : candidateMethods(object.getClass())) {
            if (calls >= 3) break;
            String name = method.getName();
            if (!name.startsWith("init") || name.equals("initCause") || Modifier.isStatic(method.getModifiers())
                    || !Modifier.isPublic(method.getModifiers())) continue;
            try {
                Class<?>[] parameters = method.getParameterTypes();
                Object[] args = new Object[parameters.length];
                for (int i = 0; i < args.length; i++) args[i] = sample(parameters[i], i, depth + 1, false);
                makeAccessible(method);
                method.invoke(object, args);
                calls++;
            } catch (Throwable ignored) { }
        }
        return object;
    }

    private static final Map<Class<?>, List<Class<?>>> SUBCLASSES = new HashMap<Class<?>, List<Class<?>>>();

    /** An instance of a concrete subclass of an abstract project class (deterministic: same package first, then by name). */
    private static Object fromConcreteSubclass(Class<?> type, int variant, int depth) {
        if (depth > 3) return null;
        List<Class<?>> candidates = concreteSubclasses(type);
        for (int i = 0; i < candidates.size(); i++) {
            Class<?> candidate = candidates.get((variant + i) % candidates.size());   // the variant picks which subclass comes first
            try {
                Object value = sample(candidate, variant / Math.max(1, candidates.size()), depth + 1, false);
                if (value != null) return value;
            } catch (Throwable ignored) { }
        }
        return null;
    }

    private static List<Class<?>> concreteSubclasses(Class<?> type) {
        synchronized (SUBCLASSES) {
            List<Class<?>> cached = SUBCLASSES.get(type);
            if (cached != null) return cached;
            List<Class<?>> found = new ArrayList<Class<?>>();
            String name = type.getName();
            boolean library = name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("sun.") || name.startsWith("jdk.");
            if (!library) {
                try {
                    java.security.CodeSource source = type.getProtectionDomain().getCodeSource();
                    if (source != null) {
                        List<String> names = classNames(new java.io.File(source.getLocation().toURI()), name, true);
                        found = filterSubclasses(type, names);
                        if (found.isEmpty()) found = filterSubclasses(type, classNames(new java.io.File(source.getLocation().toURI()), name, false));
                    }
                } catch (Throwable ignored) { }
            }
            SUBCLASSES.put(type, found);
            return found;
        }
    }

    private static List<Class<?>> filterSubclasses(Class<?> type, List<String> names) {
        List<Class<?>> result = new ArrayList<Class<?>>();
        for (String candidateName : names) {
            try {
                Class<?> candidate = Class.forName(candidateName, false, type.getClassLoader());
                if (candidate != type && type.isAssignableFrom(candidate) && !candidate.isInterface()
                        && !Modifier.isAbstract(candidate.getModifiers()) && !candidate.isAnonymousClass()) result.add(candidate);
            } catch (Throwable ignored) { }
        }
        return result;
    }

    /** Class names under a class directory or jar, sorted; only the type's own package when samePackage is true (capped). */
    private static int factoryScore(String className) {
        String simple = className.substring(className.lastIndexOf('.') + 1);
        for (String hint : new String[]{"Parser", "Parse", "Compiler", "Factory", "Builder", "Reader", "Loader", "Util", "Helper"})
            if (simple.contains(hint)) return 0;
        return 1;
    }

    /** Every top-level class name under a package prefix (directories or a jar), recursively. */
    private static List<String> classNamesUnder(java.io.File location, String prefix) {
        List<String> names = new ArrayList<String>();
        try {
            if (location.isDirectory()) {
                Deque<java.io.File> pending = new ArrayDeque<java.io.File>();
                pending.push(new java.io.File(location, prefix.replace('.', '/')));
                int scanned = 0;
                while (!pending.isEmpty() && scanned < 20000) {
                    java.io.File[] children = pending.pop().listFiles();
                    if (children == null) continue;
                    for (java.io.File child : children) {
                        if (child.isDirectory()) { pending.push(child); continue; }
                        if (!child.getName().endsWith(".class") || child.getName().contains("$")) continue;
                        scanned++;
                        String relative = child.getPath().substring(location.getPath().length() + 1, child.getPath().length() - 6);
                        String className = relative.replace(java.io.File.separatorChar, '.');
                        if (!className.endsWith("package-info") && !className.endsWith("module-info")) names.add(className);
                    }
                }
            } else if (location.isFile()) {
                java.util.zip.ZipFile zip = new java.util.zip.ZipFile(location);
                try {
                    java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zip.entries();
                    String dir = prefix.replace('.', '/') + "/";
                    while (entries.hasMoreElements()) {
                        String entry = entries.nextElement().getName();
                        if (!entry.startsWith(dir) || !entry.endsWith(".class") || entry.contains("$")) continue;
                        String className = entry.substring(0, entry.length() - 6).replace('/', '.');
                        if (!className.endsWith("package-info") && !className.endsWith("module-info")) names.add(className);
                    }
                } finally { zip.close(); }
            }
        } catch (Throwable ignored) { }
        return names;
    }

    private static List<String> classNames(java.io.File location, String typeName, boolean samePackage) throws Exception {
        String pkg = typeName.contains(".") ? typeName.substring(0, typeName.lastIndexOf('.')) : "";
        List<String> names = new ArrayList<String>();
        if (location.isDirectory()) {
            Deque<java.io.File> pending = new ArrayDeque<java.io.File>();
            pending.push(samePackage ? new java.io.File(location, pkg.replace('.', '/')) : location);
            int scanned = 0;
            while (!pending.isEmpty() && scanned < 20000) {
                java.io.File[] children = pending.pop().listFiles();
                if (children == null) continue;
                for (java.io.File child : children) {
                    if (child.isDirectory()) { if (!samePackage) pending.push(child); continue; }
                    if (!child.getName().endsWith(".class")) continue;
                    scanned++;
                    String relative = child.getPath().substring(location.getPath().length() + 1, child.getPath().length() - 6);
                    String className = relative.replace(java.io.File.separatorChar, '.');
                    if (!className.endsWith("package-info") && !className.endsWith("module-info")) names.add(className);
                }
            }
        } else if (location.isFile()) {
            java.util.zip.ZipFile zip = new java.util.zip.ZipFile(location);
            try {
                java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zip.entries();
                while (entries.hasMoreElements() && names.size() < 20000) {
                    String entry = entries.nextElement().getName();
                    if (!entry.endsWith(".class")) continue;
                    String className = entry.substring(0, entry.length() - 6).replace('/', '.');
                    if (samePackage && !(className.startsWith(pkg + ".") && className.indexOf('.', pkg.length() + 1) < 0)) continue;
                    if (!className.endsWith("package-info") && !className.endsWith("module-info")) names.add(className);
                }
            } finally { zip.close(); }
        }
        Collections.sort(names);
        return names;
    }

    @SuppressWarnings("unchecked")
    private static Collection<Object> collection(Class<?> type) throws Exception {
        if (!type.isInterface() && !Modifier.isAbstract(type.getModifiers())) {
            try { return (Collection<Object>) type.getConstructor().newInstance(); } catch (Throwable ignored) { }
        }
        if (SortedSet.class.isAssignableFrom(type)) return new TreeSet<Object>(new StringOrder());
        if (java.util.Set.class.isAssignableFrom(type)) return new LinkedHashSet<Object>();
        if (Queue.class.isAssignableFrom(type) || Deque.class.isAssignableFrom(type)) return new ArrayDeque<Object>();
        return new ArrayList<Object>();
    }

    @SuppressWarnings("unchecked")
    private static Map<Object, Object> map(Class<?> type) throws Exception {
        if (!type.isInterface() && !Modifier.isAbstract(type.getModifiers())) {
            try { return (Map<Object, Object>) type.getConstructor().newInstance(); } catch (Throwable ignored) { }
        }
        if (SortedMap.class.isAssignableFrom(type)) return new TreeMap<Object, Object>(new StringOrder());
        return new LinkedHashMap<Object, Object>();
    }

    private static final class StringOrder implements Comparator<Object> {
        public int compare(Object a, Object b) { return String.valueOf(a).compareTo(String.valueOf(b)); }
    }

    /**
     * A stand-in for an interface. Variant 0 answers every call with an empty/default value; other variants answer with the
     * sample of that variant, so different variants drive the code under test down different paths.
     */
    private static Object proxy(Class<?> type, final int variant) {
        try {
            return Proxy.newProxyInstance(type.getClassLoader(), new Class<?>[]{type}, new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if (method.getDeclaringClass() == Object.class) {
                        if (method.getName().equals("toString")) return "GeneratedTestInputProxy";
                        if (method.getName().equals("hashCode")) return System.identityHashCode(proxy);
                        if (method.getName().equals("equals")) return proxy == args[0];
                    }
                    if (method.getReturnType() == void.class) return null;
                    return sample(method.getReturnType(), variant, 1, variant == 0);
                }
            });
        } catch (Throwable ignored) { return null; }
    }

    private static Object invokeFactory(Class<?> type, int depth) {
        for (Method method : type.getMethods()) {
            if (!Modifier.isStatic(method.getModifiers()) || !type.isAssignableFrom(method.getReturnType())) continue;
            try {
                Class<?>[] parameters = method.getParameterTypes();
                Object[] args = new Object[parameters.length];
                for (int i = 0; i < args.length; i++) args[i] = sample(parameters[i], i, depth + 1, false);
                return method.invoke(null, args);
            } catch (Throwable ignored) { }
        }
        return null;
    }

    /** Non-private constructors, fewest parameters first; made accessible so package-private classes work. */
    private static Constructor<?>[] constructors(Class<?> type) {
        List<Constructor<?>> usable = new ArrayList<Constructor<?>>();
        Constructor<?>[] declared;
        try { declared = type.getDeclaredConstructors(); } catch (Throwable ignored) { return new Constructor<?>[0]; }
        for (Constructor<?> constructor : declared) {
            if (Modifier.isPrivate(constructor.getModifiers()) || constructor.isSynthetic()) continue;
            makeAccessible(constructor);
            usable.add(constructor);
        }
        Constructor<?>[] result = usable.toArray(new Constructor<?>[0]);
        Arrays.sort(result, new Comparator<Constructor<?>>() {
            public int compare(Constructor<?> a, Constructor<?> b) {
                int byArity = a.getParameterTypes().length - b.getParameterTypes().length;
                return byArity != 0 ? byArity : a.toString().compareTo(b.toString());
            }
        });
        return result;
    }
}
