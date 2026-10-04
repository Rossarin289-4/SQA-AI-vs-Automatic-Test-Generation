package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Scope.Var;
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
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

public class TypeCheckTest {
    @Test
    public void testTypedPercentStartsAtZero() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertEquals(0.0, check.getTypedPercent(), 0.0);
    }

    @Test
    public void testMissingPropertiesSettingReturnsSameChecker() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertSame(check, check.reportMissingProperties(false));
    }

    @Test
    public void testVisitTrueNodeWithoutTraversal() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        Node node = new Node(Token.TRUE);
        try {
            check.visit(null, node, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testVisitFalseNodeWithoutTraversal() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        Node node = new Node(Token.FALSE);
        try {
            check.visit(null, node, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testVisitNumberNodeWithoutTraversal() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        Node node = Node.newNumber(0);
        try {
            check.visit(null, node, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testVisitNullNodeWithoutTraversal() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        Node node = new Node(Token.NULL);
        try {
            check.visit(null, node, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testShouldTraverseAlwaysReturnsTrueForScript() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertTrue(check.shouldTraverse(null, new Node(Token.SCRIPT), null));
    }

    @Test
    public void testShouldTraverseAlwaysReturnsTrueForEmptyBlock() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertTrue(check.shouldTraverse(null, new Node(Token.BLOCK), null));
    }

    @Test
    public void testCheckNullNodeThrows() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        try {
            check.check(null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessForTestingRequiresUninitializedScopeCreator() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        try {
            check.processForTesting(null, new Node(Token.SCRIPT));
            fail("expected IllegalStateException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessRequiresScopeCreator() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        try {
            check.process(null, new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessRejectsNullJavaScriptRoot() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        try {
            check.process(null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }
}
