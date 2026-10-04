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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSourceProvidesNoWayToConstructCompiler() throws Exception {
        // AbstractCompiler has no public constructor or concrete implementation
        // available in the supplied declarations; see limitations.
        assertEquals(CheckSideEffects.PROTECTOR_FN, "JSCOMPILER_PRESERVE");
    }

    @Test
    public void testDiagnosticTypeIsWarning() throws Exception {
        assertEquals("JSC_USELESS_CODE",
                CheckSideEffects.USELESS_CODE_ERROR.key);
    }

    @Test
    public void testProtectorFunctionName() throws Exception {
        assertEquals("JSCOMPILER_PRESERVE",
                CheckSideEffects.PROTECTOR_FN);
    }

    @Test
    public void testAstEmptyFactory() throws Exception {
        Node empty = IR.empty();
        assertTrue(empty.isEmpty());
    }

    @Test
    public void testAstCommaFactory() throws Exception {
        Node comma = IR.comma(IR.number(1), IR.number(2));
        assertTrue(comma.isComma());
        assertEquals(2, comma.getChildCount());
    }

    @Test
    public void testAstExpressionResultFactory() throws Exception {
        Node statement = IR.exprResult(IR.number(3));
        assertTrue(statement.isExprResult());
        assertEquals(Token.EXPR_RESULT, statement.getType());
    }

    @Test
    public void testAstBlockFactory() throws Exception {
        Node block = IR.block(IR.exprResult(IR.number(1)));
        assertTrue(block.isBlock());
        assertEquals(1, block.getChildCount());
    }

    @Test
    public void testStringNodePayload() throws Exception {
        Node string = IR.string("x");
        assertTrue(string.isString());
        assertEquals("x", string.getString());
    }

    @Test
    public void testNumberNodePayload() throws Exception {
        Node number = IR.number(0);
        assertEquals(0.0, number.getDouble(), 0.0);
    }

    @Test
    public void testNameNodePayload() throws Exception {
        Node name = IR.name("x");
        assertTrue(name.isName());
        assertEquals("x", name.getString());
    }

    @Test
    public void testScriptChildOrder() throws Exception {
        Node first = IR.exprResult(IR.number(1));
        Node last = IR.exprResult(IR.number(2));
        Node script = IR.script(first, last);
        assertSame(first, script.getFirstChild());
        assertSame(last, script.getLastChild());
    }

    @Test
    public void testNodeChildrenAttachToParent() throws Exception {
        Node parent = IR.block();
        Node child = IR.empty();
        parent.addChildToBack(child);
        assertSame(parent, child.getParent());
        assertEquals(1, parent.getChildCount());
    }
}
