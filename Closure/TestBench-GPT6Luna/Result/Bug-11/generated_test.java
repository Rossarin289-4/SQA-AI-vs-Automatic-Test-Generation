package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TypeCheckTest {
    @Test
    public void testNullCheckNode() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null, null, null,
                CheckLevel.WARNING, CheckLevel.OFF);
        try {
            check.check(null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessForTestingWithoutParentThrows() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null, null, null,
                CheckLevel.WARNING, CheckLevel.OFF);
        try {
            check.processForTesting(null, new Node(Token.SCRIPT));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testProcessForTestingRequiresUninitializedScope() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null, null, null,
                CheckLevel.WARNING, CheckLevel.OFF);
        Node root = new Node(Token.SCRIPT);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(root);
        try {
            check.processForTesting(null, root);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessRequiresScopeCreator() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null, null, null,
                CheckLevel.WARNING, CheckLevel.OFF);
        try {
            check.process(null, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessRequiresTopScope() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null, null, null,
                CheckLevel.WARNING, CheckLevel.OFF);
        try {
            check.process(null, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessForTestingCannotBeRepeated() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null, null, null,
                CheckLevel.WARNING, CheckLevel.OFF);
        Node root = new Node(Token.SCRIPT);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(root);
        try {
            check.processForTesting(null, root);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
        try {
            check.processForTesting(null, root);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testShouldTraverseNullNodeParentFails() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null, null, null,
                CheckLevel.WARNING, CheckLevel.OFF);
        try {
            check.shouldTraverse(null, null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testVisitRequiresTraversal() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null, null, null,
                CheckLevel.WARNING, CheckLevel.OFF);
        try {
            check.visit(null, new Node(Token.TRUE), new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessWithoutParentFailsAfterConfiguredFields() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        try {
            check.process(null, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testEmptyParentAndScriptRemainDistinctNodes() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(script);
        assertSame(parent, script.getParent());
        assertEquals(Token.SCRIPT, script.getType());
    }

    @Test
    public void testSmallestTokenTypeBoundary() throws Exception {
        assertEquals(-1, Token.ERROR);
        assertEquals(4, Token.RETURN);
    }

    @Test
    public void testLargestListedTokenTypes() throws Exception {
        assertEquals(154, Token.STRING_KEY);
        assertEquals(306, Token.BANG);
    }
}
