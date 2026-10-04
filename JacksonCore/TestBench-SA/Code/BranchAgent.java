import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * Java agent for the search worker: instruments the conditional jumps of the target classes so that BranchRecorder sees
 * the compared operands (branch distance). Agent argument: comma-separated class names; a class is instrumented when its
 * name equals one of them or is nested in it. Uses the ASM copy inside the JDK (java.base must export
 * jdk.internal.org.objectweb.asm to the unnamed module, see the worker's command line).
 */
public final class BranchAgent {
    private BranchAgent() { }

    public static void premain(String args, Instrumentation instrumentation) {
        final List<String> targets = new ArrayList<String>();
        if (args != null) for (String name : args.split(",")) if (name.length() > 0) targets.add(name.replace('.', '/'));
        instrumentation.addTransformer(new ClassFileTransformer() {
            public byte[] transform(ClassLoader loader, String className, Class<?> redefined, ProtectionDomain domain, byte[] bytes) {
                if (className == null) return null;
                boolean wanted = false;
                for (String target : targets) if (className.equals(target) || className.startsWith(target + "$")) wanted = true;
                if (!wanted) return null;
                try {
                    ClassReader reader = new ClassReader(bytes);
                    ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);
                    reader.accept(new Instrumenter(writer, className), 0);
                    return writer.toByteArray();
                } catch (Throwable ignored) {
                    return null;   // leave the class as it is: coverage probes still work without distances
                }
            }
        });
    }

    private static final String RECORDER = "BranchRecorder";

    private static final class Instrumenter extends ClassVisitor {
        private final String className;
        Instrumenter(ClassVisitor next, String className) { super(Opcodes.ASM6, next); this.className = className; }
        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
            MethodVisitor next = super.visitMethod(access, name, descriptor, signature, exceptions);
            return next == null ? null : new JumpInstrumenter(next, (className + "#" + name + descriptor).hashCode());
        }
    }

    private static final class JumpInstrumenter extends MethodVisitor {
        private final int methodHash;
        private int index;
        JumpInstrumenter(MethodVisitor next, int methodHash) { super(Opcodes.ASM6, next); this.methodHash = methodHash; }

        private int nextId() { return methodHash * 31 + (index++); }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            switch (opcode) {
                case Opcodes.IFEQ: case Opcodes.IFNE: case Opcodes.IFLT: case Opcodes.IFGE: case Opcodes.IFGT: case Opcodes.IFLE:
                    mv.visitInsn(Opcodes.DUP);
                    push(opcode); push(nextId());
                    mv.visitMethodInsn(Opcodes.INVOKESTATIC, RECORDER, "one", "(III)V", false);
                    break;
                case Opcodes.IF_ICMPEQ: case Opcodes.IF_ICMPNE: case Opcodes.IF_ICMPLT: case Opcodes.IF_ICMPGE: case Opcodes.IF_ICMPGT: case Opcodes.IF_ICMPLE:
                    mv.visitInsn(Opcodes.DUP2);
                    push(opcode); push(nextId());
                    mv.visitMethodInsn(Opcodes.INVOKESTATIC, RECORDER, "two", "(IIII)V", false);
                    break;
                case Opcodes.IFNULL: case Opcodes.IFNONNULL:
                    mv.visitInsn(Opcodes.DUP);
                    push(opcode); push(nextId());
                    mv.visitMethodInsn(Opcodes.INVOKESTATIC, RECORDER, "ref", "(Ljava/lang/Object;II)V", false);
                    break;
                case Opcodes.IF_ACMPEQ: case Opcodes.IF_ACMPNE:
                    mv.visitInsn(Opcodes.DUP2);
                    push(opcode); push(nextId());
                    mv.visitMethodInsn(Opcodes.INVOKESTATIC, RECORDER, "refs", "(Ljava/lang/Object;Ljava/lang/Object;II)V", false);
                    break;
                default:
                    break;
            }
            super.visitJumpInsn(opcode, label);
        }

        /** lcmp / fcmp / dcmp keep their result but go through the recorder, which remembers the real magnitude. */
        @Override
        public void visitInsn(int opcode) {
            switch (opcode) {
                case Opcodes.LCMP: mv.visitMethodInsn(Opcodes.INVOKESTATIC, RECORDER, "lcmp", "(JJ)I", false); return;
                case Opcodes.FCMPL: mv.visitMethodInsn(Opcodes.INVOKESTATIC, RECORDER, "fcmpl", "(FF)I", false); return;
                case Opcodes.FCMPG: mv.visitMethodInsn(Opcodes.INVOKESTATIC, RECORDER, "fcmpg", "(FF)I", false); return;
                case Opcodes.DCMPL: mv.visitMethodInsn(Opcodes.INVOKESTATIC, RECORDER, "dcmpl", "(DD)I", false); return;
                case Opcodes.DCMPG: mv.visitMethodInsn(Opcodes.INVOKESTATIC, RECORDER, "dcmpg", "(DD)I", false); return;
                default: super.visitInsn(opcode);
            }
        }

        private void push(int value) {
            if (value >= -1 && value <= 5) mv.visitInsn(Opcodes.ICONST_0 + value);
            else if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) mv.visitIntInsn(Opcodes.BIPUSH, value);
            else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) mv.visitIntInsn(Opcodes.SIPUSH, value);
            else mv.visitLdcInsn(Integer.valueOf(value));
        }
    }
}
