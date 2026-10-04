```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.TokenStream;
import com.google.protobuf.CodedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.ParallelCompilerPass.Result;
import com.google.javascript.rhino.Token;

public class AbstractCommandLineRunnerTest {
    @Test
    public void testExpressionStatementWithPureNumberIsRemoved() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node statement = new Node(Token.EXPR_RESULT, Node.newNumber(7));
        root.addChildToBack(statement);

        RemoveConstantExpressions pass =
            new RemoveConstantExpressions(new Compiler());
        pass.process(null, root);

        assertFalse(root.hasChildren());
    }

    @Test
    public void testExpressionStatementWithPureNameIsRemoved() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(
            new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "x")));

        new RemoveConstantExpressions(new Compiler()).process(null, root);

        assertFalse(root.hasChildren());
    }

    @Test
    public void testCallExpressionStatementIsRetained() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, call));

        new RemoveConstantExpressions(new Compiler()).process(null, root);

        assertSame(call, root.getFirstChild().getFirstChild());
        assertTrue(root.getFirstChild().getType() == Token.EXPR_RESULT);
    }

    @Test
    public void testNewExpressionStatementIsRetained() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node expression = new Node(Token.NEW, Node.newString(Token.NAME, "C"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, expression));

        new RemoveConstantExpressions(new Compiler()).process(null, root);

        assertSame(expression, root.getFirstChild().getFirstChild());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
    }

    @Test
    public void testAssignmentExpressionStatementIsRetained() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assignment = new Node(Token.ASSIGN,
            Node.newString(Token.NAME, "x"), Node.newNumber(1));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assignment));

        new RemoveConstantExpressions(new Compiler()).process(null, root);

        assertSame(assignment, root.getFirstChild().getFirstChild());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
    }

    @Test
    public void testCallNestedInAdditionBecomesExpressionStatement() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
        Node expression = new Node(Token.ADD, Node.newNumber(1), call);
        root.addChildToBack(new Node(Token.EXPR_RESULT, expression));

        new RemoveConstantExpressions(new Compiler()).process(null, root);

        assertEquals(1, root.getChildAtIndex(0).getType());
        assertEquals(Token.EXPR_RESULT, root.getChildAtIndex(0).getType());
        assertSame(call, root.getChildAtIndex(0).getFirstChild());
    }

    @Test
    public void testPureExpressionNestedWithCallIsRemoved() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node call = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
        Node expression = new Node(Token.ADD,
            new Node(Token.MUL, Node.newNumber(2), Node.newNumber(3)), call);
        root.addChildToBack(new Node(Token.EXPR_RESULT, expression));

        new RemoveConstantExpressions(new Compiler()).process(null, root);

        assertTrue(root.hasChildren());
        assertSame(call, root.getFirstChild().getFirstChild());
    }

    @Test
    public void testTwoCallsInAdditionProduceTwoStatements() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node first = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
        Node second = new Node(Token.CALL, Node.newString(Token.NAME, "g"));
        root.addChildToBack(new Node(Token.EXPR_RESULT,
            new Node(Token.ADD, first, second)));

        new RemoveConstantExpressions(new Compiler()).process(null, root);

        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
        assertSame(first, root.getFirstChild().getFirstChild());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getNext().getType());
        assertSame(second, root.getFirstChild().getNext().getFirstChild());
    }

    @Test
    public void testExpressionStatementContainingOnlyPureAdditionIsRemoved() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(new Node(Token.EXPR_RESULT,
            new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2))));

        new RemoveConstantExpressions(new Compiler()).process(null, root);

        assertFalse(root.hasChildren());
    }

    @Test
    public void testNonExpressionStatementIsUnaffected() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node statement = new Node(Token.RETURN, Node.newNumber(3));
        root.addChildToBack(statement);

        new RemoveConstantExpressions(new Compiler()).process(null, root);

        assertSame(statement, root.getFirstChild());
        assertEquals(Token.RETURN, root.getFirstChild().getType());
    }
}
```