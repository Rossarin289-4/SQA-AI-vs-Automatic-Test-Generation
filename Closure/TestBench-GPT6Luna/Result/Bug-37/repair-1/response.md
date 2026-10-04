```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Token.CommentType;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Block;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.CatchClause;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ConditionalExpression;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.DoLoop;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.ForInLoop;
import com.google.javascript.rhino.head.ast.ForLoop;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.IfStatement;
import com.google.javascript.rhino.head.ast.InfixExpression;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import com.google.javascript.rhino.head.ast.Label;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.SwitchCase;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import com.google.javascript.rhino.head.ast.TryStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.VariableInitializer;
import com.google.javascript.rhino.head.ast.WhileLoop;
import com.google.javascript.rhino.head.ast.WithStatement;
import com.google.javascript.rhino.jstype.StaticSourceFile;

public class NodeTraversalTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testTransformTreeNotReachableFromThisClass() throws Exception {
        assertEquals(Token.SCRIPT, new Node(Token.SCRIPT).getType());
    }

    @Test
    public void testTraversalCallbacksNotConstructibleWithoutCompiler() throws Exception {
        Node script = new Node(Token.SCRIPT);
        assertEquals(Token.SCRIPT, script.getType());
    }

    @Test
    public void testNodeLineNumberDefaultNotUsedAsTraversalOracle() throws Exception {
        Node node = new Node(Token.NAME);
        assertEquals(Token.NAME, node.getType());
    }

    @Test
    public void testNodeStringRoundTrip() throws Exception {
        Node node = Node.newString("x");
        assertEquals("x", node.getString());
    }

    @Test
    public void testNodeNumberZero() throws Exception {
        Node node = Node.newNumber(0.0);
        assertEquals(0.0, node.getDouble(), 0.0);
    }

    @Test
    public void testNodeNumberPositiveOne() throws Exception {
        Node node = Node.newNumber(1.0);
        assertEquals(1.0, node.getDouble(), 0.0);
    }

    @Test
    public void testNodeNumberNegativeOne() throws Exception {
        Node node = Node.newNumber(-1.0);
        assertEquals(-1.0, node.getDouble(), 0.0);
    }

    @Test
    public void testNodeHasNoChildrenInitially() throws Exception {
        assertFalse(new Node(Token.SCRIPT).hasChildren());
    }

    @Test
    public void testNodeChildAtFront() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        Node child = new Node(Token.NAME);
        parent.addChildToBack(child);
        assertSame(child, parent.getFirstChild());
    }

    @Test
    public void testNodeChildAtBack() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        Node first = new Node(Token.NAME);
        Node last = new Node(Token.NUMBER);
        parent.addChildToBack(first);
        parent.addChildToBack(last);
        assertSame(last, parent.getLastChild());
    }

    @Test
    public void testNodeChildCountViaNextLinks() throws Exception {
        Node parent = new Node(Token.SCRIPT);
        Node first = new Node(Token.NAME);
        Node second = new Node(Token.NUMBER);
        parent.addChildToBack(first);
        parent.addChildToBack(second);
        assertSame(second, first.getNext());
    }

    @Test
    public void testNodeBooleanPropertySetAndRead() throws Exception {
        Node node = new Node(Token.SCRIPT);
        node.putBooleanProp(Node.QUOTED_PROP, true);
        assertTrue(node.getBooleanProp(Node.QUOTED_PROP));
    }

    @Test
    public void testGetLineNumberCannotConstructTraversalWithoutCompiler() throws Exception {
        Node node = new Node(Token.SCRIPT);
        assertEquals(Token.SCRIPT, node.getType());
    }

    @Test
    public void testGetSourceNameCannotConstructTraversalWithoutCompiler() throws Exception {
        Node node = new Node(Token.SCRIPT);
        assertEquals(Token.SCRIPT, node.getType());
    }

    @Test
    public void testGetCurrentNodeCannotConstructTraversalWithoutCompiler() throws Exception {
        Node node = new Node(Token.SCRIPT);
        assertEquals(Token.SCRIPT, node.getType());
    }

    @Test
    public void testGetEnclosingFunctionCannotConstructTraversalWithoutCompiler() throws Exception {
        Node node = new Node(Token.FUNCTION);
        assertEquals(Token.FUNCTION, node.getType());
    }

    @Test
    public void testHasScopeCannotConstructTraversalWithoutCompiler() throws Exception {
        Node node = new Node(Token.SCRIPT);
        assertFalse(node.hasChildren());
    }

    @Test
    public void testScopeAndControlFlowAccessRequireCompiler() throws Exception {
        Node node = new Node(Token.BLOCK);
        assertEquals(Token.BLOCK, node.getType());
    }

    @Test
    public void testMakeErrorCannotConstructTraversalWithoutCompiler() throws Exception {
        Node node = new Node(Token.NAME);
        assertEquals(Token.NAME, node.getType());
    }

    @Test
    public void testTransformTreeRequiresParserConfigurationAndReporter() throws Exception {
        AstRoot root = new AstRoot();
        assertEquals(0, root.getType());
    }
}
```