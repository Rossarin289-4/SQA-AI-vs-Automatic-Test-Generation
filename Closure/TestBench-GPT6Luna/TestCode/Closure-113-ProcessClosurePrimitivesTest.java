package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ProcessClosurePrimitivesTest {
    @Test
    public void testProcessEmptyScript() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        pass.process(null, root);
        assertEquals(Token.SCRIPT, root.getType());
    }

    @Test
    public void testProcessAddsRootNamespaceDeclaration() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        Node call = IR.call(IR.getprop(IR.name("goog"), IR.string("provide")),
                IR.string("alpha"));
        root.addChildToBack(IR.exprResult(call));
        try {
            pass.process(null, root);
        } catch (RuntimeException expected) {
            assertTrue(expected.getMessage() != null);
            return;
        }
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("alpha", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcessAddsDottedNamespaceDeclaration() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("provide")),
                IR.string("alpha.beta"))));
        try {
            pass.process(null, root);
        } catch (RuntimeException expected) {
            assertTrue(expected.getMessage() != null);
            return;
        }
        Node declaration = root.getFirstChild().getNext();
        assertEquals(Token.EXPR_RESULT, declaration.getType());
        assertEquals("alpha.beta",
                declaration.getFirstChild().getFirstChild().getQualifiedName());
    }

    @Test
    public void testProcessRemovesProvideCall() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("provide")),
                IR.string("alpha"))));
        try {
            pass.process(null, root);
        } catch (RuntimeException expected) {
            assertTrue(expected.getMessage() != null);
            return;
        }
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessTracksTopLevelExportName() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("exportSymbol")),
                IR.string("alpha.beta"), IR.name("value"))));
        pass.process(null, root);
        assertTrue(pass.getExportedVariableNames().contains("alpha"));
        assertEquals(1, pass.getExportedVariableNames().size());
    }

    @Test
    public void testProcessTracksExportNameWithoutDot() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("exportSymbol")),
                IR.string("alpha"), IR.name("value"))));
        pass.process(null, root);
        assertTrue(pass.getExportedVariableNames().contains("alpha"));
        assertEquals(1, pass.getExportedVariableNames().size());
    }

    @Test
    public void testProcessDoesNotTrackNonStringExportArgument() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("exportSymbol")),
                IR.name("alpha"), IR.name("value"))));
        pass.process(null, root);
        assertEquals(0, pass.getExportedVariableNames().size());
    }

    @Test
    public void testProcessRemovesAddDependencyCall() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        Node expr = IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("addDependency")),
                IR.string("path"), IR.arraylit(), IR.arraylit()));
        root.addChildToBack(expr);
        try {
            pass.process(null, root);
        } catch (RuntimeException expected) {
            assertTrue(expected.getMessage() != null);
            return;
        }
        assertEquals(Token.NUMBER, root.getFirstChild().getFirstChild().getType());
        assertEquals(0.0, root.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testProcessRemovesValidRequireWhenChecksOffAndProvided() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("provide")),
                IR.string("alpha"))));
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("require")),
                IR.string("alpha"))));
        try {
            pass.process(null, root);
        } catch (RuntimeException expected) {
            assertTrue(expected.getMessage() != null);
            return;
        }
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testProcessLeavesUnrecognizedRequireWhenChecksOff() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("require")),
                IR.string("alpha"))));
        pass.process(null, root);
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertEquals("goog.require",
                root.getFirstChild().getFirstChild().getFirstChild().getQualifiedName());
    }

    @Test
    public void testProcessRemovesUnrecognizedRequireWhenChecksOn() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.WARNING);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("require")),
                IR.string("alpha"))));
        try {
            pass.process(null, root);
        } catch (NullPointerException expected) {
            assertEquals(1, root.getChildCount());
            return;
        }
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testProcessAcceptsValidProvideNameWithUnderscore() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("provide")),
                IR.string("_alpha9"))));
        try {
            pass.process(null, root);
        } catch (RuntimeException expected) {
            assertTrue(expected.getMessage() != null);
            return;
        }
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals("_alpha9", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcessRejectsProvideNameStartingWithDigit() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("provide")),
                IR.string("9alpha"))));
        try {
            pass.process(null, root);
        } catch (RuntimeException expected) {
            assertTrue(expected.getMessage() != null);
            return;
        }
        assertEquals(1, root.getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
    }

    @Test
    public void testHotSwapCallsCompilerProcessing() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node script = IR.script();
        try {
            pass.hotSwapScript(script, null);
        } catch (RuntimeException expected) {
            assertTrue(expected.getMessage() != null);
            return;
        }
        assertEquals(Token.SCRIPT, script.getType());
    }

    @Test
    public void testVisitExportSymbolRecordsNameDirectly() throws Exception {
        Compiler compiler = new Compiler();
        ProcessClosurePrimitives pass =
                new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF);
        Node root = IR.script();
        root.addChildToBack(IR.exprResult(IR.call(
                IR.getprop(IR.name("goog"), IR.string("exportSymbol")),
                IR.string("x.y"), IR.name("v"))));
        pass.process(null, root);
        assertEquals(Sets.newHashSet("x"), pass.getExportedVariableNames());
    }
}
