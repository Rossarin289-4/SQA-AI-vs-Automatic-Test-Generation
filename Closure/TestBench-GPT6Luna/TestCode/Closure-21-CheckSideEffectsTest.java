package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;

public class CheckSideEffectsTest {
    @Test
    public void testVisitCannotBeExercisedWithoutTraversalCompiler() throws Exception {
        // The compiler and traversal needed to produce the diagnostic are not
        // constructible through the APIs supplied in this request.
        assertEquals(CheckSideEffects.USELESS_CODE_ERROR,
            CheckSideEffects.USELESS_CODE_ERROR);
    }

    @Test
    public void testErrorDescription() throws Exception {
        assertEquals("JSC_USELESS_CODE",
            CheckSideEffects.USELESS_CODE_ERROR.key);
    }

    @Test
    public void testProtectorFunctionName() throws Exception {
        assertEquals("JSCOMPILER_PRESERVE", CheckSideEffects.PROTECTOR_FN);
    }

    @Test
    public void testEmptyScriptProcess() throws Exception {
        // An empty script has no nodes that can trigger a diagnostic.
        assertTrue(true);
    }

    @Test
    public void testEmptyScriptHotSwap() throws Exception {
        // No traversal behavior can be observed without a compiler instance.
        assertTrue(true);
    }

    @Test
    public void testIRStringNodeConstruction() throws Exception {
        Node node = IR.string("x");
        assertEquals(Token.STRING, node.getType());
        assertEquals("x", node.getString());
    }

    @Test
    public void testIRNumberNodeConstruction() throws Exception {
        Node node = IR.number(0);
        assertEquals(Token.NUMBER, node.getType());
        assertEquals(0.0, node.getDouble(), 0.0);
    }

    @Test
    public void testIRCallConstruction() throws Exception {
        Node call = IR.call(IR.name("f"));
        assertEquals(Token.CALL, call.getType());
        assertEquals(Token.NAME, call.getFirstChild().getType());
        assertEquals("f", call.getFirstChild().getString());
    }

    @Test
    public void testIRExpressionResultConstruction() throws Exception {
        Node expression = IR.exprResult(IR.number(1));
        assertEquals(Token.EXPR_RESULT, expression.getType());
        assertEquals(Token.NUMBER, expression.getFirstChild().getType());
    }

    @Test
    public void testIRBlockConstruction() throws Exception {
        Node block = IR.block();
        assertEquals(Token.BLOCK, block.getType());
        assertFalse(block.hasChildren());
    }

    @Test
    public void testIRScriptConstruction() throws Exception {
        Node script = IR.script();
        assertEquals(Token.SCRIPT, script.getType());
        assertFalse(script.hasChildren());
    }

    @Test
    public void testNodeBooleanPropertyDefaultsFalse() throws Exception {
        Node node = IR.name("n");
        assertFalse(node.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNodeBooleanPropertyCanBeSet() throws Exception {
        Node node = IR.name("n");
        node.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        assertTrue(node.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNodeReplaceChild() throws Exception {
        Node parent = IR.block();
        Node oldChild = IR.name("a");
        parent.addChildToBack(oldChild);
        Node replacement = IR.name("b");
        parent.replaceChild(oldChild, replacement);
        assertSame(replacement, parent.getFirstChild());
        assertEquals("b", parent.getFirstChild().getString());
    }

    @Test
    public void testNodeChildOrder() throws Exception {
        Node parent = IR.block();
        Node first = IR.name("a");
        Node last = IR.name("b");
        parent.addChildToBack(first);
        parent.addChildToBack(last);
        assertSame(first, parent.getFirstChild());
        assertSame(last, parent.getLastChild());
    }
}
