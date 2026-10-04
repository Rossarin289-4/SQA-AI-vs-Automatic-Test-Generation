```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class AnalyzePrototypePropertiesTest {
    @Test
    public void testAssignmentPropertyValue() throws Exception {
        Node value = Node.newString("value");
        Node assign = new Node(Token.ASSIGN,
                new Node(Token.GETPROP, Node.newString("Foo"),
                        Node.newString("bar")), value);
        Node expr = NodeUtil.newExpr(assign);
        AnalyzePrototypeProperties.AssignmentProperty prop =
                new AnalyzePrototypeProperties.AssignmentProperty(expr, null);
        assertSame(value, prop.getValue());
    }

    @Test
    public void testAssignmentPropertyPrototype() throws Exception {
        Node receiver = Node.newString("Foo");
        Node getPrototype = new Node(Token.GETPROP, receiver,
                Node.newString("prototype"));
        Node assign = new Node(Token.ASSIGN,
                new Node(Token.GETPROP, getPrototype, Node.newString("bar")),
                Node.newString("value"));
        AnalyzePrototypeProperties.AssignmentProperty prop =
                new AnalyzePrototypeProperties.AssignmentProperty(
                        NodeUtil.newExpr(assign), null);
        assertSame(getPrototype, prop.getPrototype());
    }

    @Test
    public void testAssignmentPropertyModule() throws Exception {
        JSModule module = new JSModule("m");
        Node assign = new Node(Token.ASSIGN,
                Node.newString("lhs"), Node.newString("rhs"));
        AnalyzePrototypeProperties.AssignmentProperty prop =
                new AnalyzePrototypeProperties.AssignmentProperty(
                        NodeUtil.newExpr(assign), module);
        assertSame(module, prop.getModule());
    }

    @Test
    public void testAssignmentPropertyRemove() throws Exception {
        Node expr = NodeUtil.newExpr(new Node(Token.ASSIGN,
                Node.newString("lhs"), Node.newString("rhs")));
        Node script = new Node(Token.SCRIPT, expr);
        AnalyzePrototypeProperties.AssignmentProperty prop =
                new AnalyzePrototypeProperties.AssignmentProperty(expr, null);
        prop.remove();
        assertNull(script.getFirstChild());
    }

    @Test
    public void testLiteralPropertyValue() throws Exception {
        Node value = Node.newString("value");
        Node key = Node.newString("key");
        key.addChildToBack(value);
        Node map = new Node(Token.OBJECTLIT, key);
        Node assign = new Node(Token.ASSIGN, Node.newString("prototype"), map);
        AnalyzePrototypeProperties.LiteralProperty prop =
                new AnalyzePrototypeProperties.LiteralProperty(
                        key, value, map, assign, null);
        assertSame(value, prop.getValue());
    }

    @Test
    public void testLiteralPropertyPrototype() throws Exception {
        Node lhs = Node.newString("lhs");
        Node map = new Node(Token.OBJECTLIT);
        Node assign = new Node(Token.ASSIGN, lhs, map);
        AnalyzePrototypeProperties.LiteralProperty prop =
                new AnalyzePrototypeProperties.LiteralProperty(
                        Node.newString("key"), null, map, assign, null);
        assertSame(lhs, prop.getPrototype());
    }

    @Test
    public void testLiteralPropertyModule() throws Exception {
        JSModule module = new JSModule("m");
        Node map = new Node(Token.OBJECTLIT);
        AnalyzePrototypeProperties.LiteralProperty prop =
                new AnalyzePrototypeProperties.LiteralProperty(
                        Node.newString("key"), null, map,
                        new Node(Token.ASSIGN, Node.newString("lhs"), map),
                        module);
        assertSame(module, prop.getModule());
    }

    @Test
    public void testLiteralPropertyRemove() throws Exception {
        Node key = Node.newString("key");
        Node map = new Node(Token.OBJECTLIT, key);
        AnalyzePrototypeProperties.LiteralProperty prop =
                new AnalyzePrototypeProperties.LiteralProperty(
                        key, null, map,
                        new Node(Token.ASSIGN, Node.newString("lhs"), map),
                        null);
        prop.remove();
        assertNull(map.getFirstChild());
    }

    @Test
    public void testConstructorIncludesImplicitProperties() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        Collection<AnalyzePrototypeProperties.NameInfo> infos =
                pass.getAllNameInfo();
        assertEquals(3, infos.size());
    }

    @Test
    public void testProcessEmptyScriptPreservesImplicitProperties()
            throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        pass.process(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
        assertEquals(3, pass.getAllNameInfo().size());
    }

    @Test
    public void testProcessWithExternTraversalDisabled() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, true, false);
        pass.process(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
        assertEquals(3, pass.getAllNameInfo().size());
    }

    @Test
    public void testRepeatedProcessKeepsImplicitNameSet() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        pass.process(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
        pass.process(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
        assertEquals(3, pass.getAllNameInfo().size());
    }

    @Test
    public void testGlobalFunctionReturnsItsFunctionNode() throws Exception {
        Node fn = new Node(Token.FUNCTION,
                Node.newString("f"), new Node(Token.BLOCK),
                new Node(Token.BLOCK));
        Node name = Node.newString("f");
        Node var = new Node(Token.VAR, name);
        name.addChildToBack(fn);
        AnalyzePrototypeProperties.GlobalFunction symbol =
                new AnalyzePrototypeProperties(null, null, false, false)
                        .new GlobalFunction(name, var, null, null);
        assertSame(fn, symbol.getFunctionNode());
    }

    @Test
    public void testFunctionDeclarationReturnsParentFunction() throws Exception {
        Node name = Node.newString("f");
        Node fn = new Node(Token.FUNCTION, name,
                new Node(Token.BLOCK), new Node(Token.BLOCK));
        AnalyzePrototypeProperties.GlobalFunction symbol =
                new AnalyzePrototypeProperties(null, null, false, false)
                        .new GlobalFunction(name, fn, null, null);
        assertSame(fn, symbol.getFunctionNode());
    }

    @Test
    public void testGlobalFunctionModuleIsPreserved() throws Exception {
        JSModule module = new JSModule("m");
        Node name = Node.newString("f");
        Node var = new Node(Token.VAR, name);
        AnalyzePrototypeProperties.GlobalFunction symbol =
                new AnalyzePrototypeProperties(null, null, false, false)
                        .new GlobalFunction(name, var, null, module);
        assertSame(module, symbol.getModule());
    }

    @Test
    public void testGlobalFunctionRemoveSingleVariable() throws Exception {
        Node name = Node.newString("f");
        Node var = new Node(Token.VAR, name);
        Node script = new Node(Token.SCRIPT, var);
        AnalyzePrototypeProperties.GlobalFunction symbol =
                new AnalyzePrototypeProperties(null, null, false, false)
                        .new GlobalFunction(name, var, null, null);
        symbol.remove();
        assertNull(script.getFirstChild());
    }

    @Test
    public void testGlobalFunctionRemoveOneNameFromMultipleVariables()
            throws Exception {
        Node first = Node.newString("f");
        Node second = Node.newString("g");
        Node var = new Node(Token.VAR, first, second);
        AnalyzePrototypeProperties.GlobalFunction symbol =
                new AnalyzePrototypeProperties(null, null, false, false)
                        .new GlobalFunction(first, var, null, null);
        symbol.remove();
        assertSame(second, var.getFirstChild());
    }

    @Test
    public void testGlobalFunctionRemoveFunctionDeclaration() throws Exception {
        Node name = Node.newString("f");
        Node fn = new Node(Token.FUNCTION, name,
                new Node(Token.BLOCK), new Node(Token.BLOCK));
        Node script = new Node(Token.SCRIPT, fn);
        AnalyzePrototypeProperties.GlobalFunction symbol =
                new AnalyzePrototypeProperties(null, null, false, false)
                        .new GlobalFunction(name, fn, null, null);
        symbol.remove();
        assertNull(script.getFirstChild());
    }

    @Test
    public void testAssignmentPropertyRemoveLeavesFollowingStatement()
            throws Exception {
        Node expr = NodeUtil.newExpr(new Node(Token.ASSIGN,
                Node.newString("lhs"), Node.newString("rhs")));
        Node next = new Node(Token.EMPTY);
        Node script = new Node(Token.SCRIPT, expr, next);
        AnalyzePrototypeProperties.AssignmentProperty prop =
                new AnalyzePrototypeProperties.AssignmentProperty(expr, null);
        prop.remove();
        assertSame(next, script.getFirstChild());
    }

    @Test
    public void testLiteralPropertyRemoveLeavesOtherKey() throws Exception {
        Node key = Node.newString("a");
        Node other = Node.newString("b");
        Node map = new Node(Token.OBJECTLIT, key, other);
        AnalyzePrototypeProperties.LiteralProperty prop =
                new AnalyzePrototypeProperties.LiteralProperty(
                        key, null, map,
                        new Node(Token.ASSIGN, Node.newString("lhs"), map),
                        null);
        prop.remove();
        assertSame(other, map.getFirstChild());
    }

    @Test
    public void testAssignmentPropertyValueIsRightHandSide() throws Exception {
        Node value = Node.newNumber(1);
        Node assign = new Node(Token.ASSIGN, Node.newString("lhs"), value);
        AnalyzePrototypeProperties.AssignmentProperty prop =
                new AnalyzePrototypeProperties.AssignmentProperty(
                        NodeUtil.newExpr(assign), null);
        assertSame(value, prop.getValue());
    }
}
```