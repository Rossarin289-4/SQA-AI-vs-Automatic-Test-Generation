package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
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
import javax.annotation.Nullable; // Added import for @Nullable

public class AnalyzePrototypePropertiesTest {

    /** A minimal AbstractCompiler stub for testing. */

    // Instance of the stub compiler

    private JSModule createModule(String name) {
        return new JSModule(name);
    }



    private Node createNodeFromString(String code) {
        return Node.newString(code);
    }

    private Node createNodeFromNumber(double number) {
        return Node.newNumber(number);
    }
    
    private Node createFunctionNode() {
        return new Node(Token.FUNCTION);
    }

    private Node createAssignNode(Node lhs, Node rhs) {
        return new Node(Token.ASSIGN, lhs, rhs);
    }

    private Node createGetPropNode(Node obj, String prop) {
        return new Node(Token.GETPROP, obj, Node.newString(prop));
    }

    private Node createNameNode(String name) {
        return new Node(Token.NAME, Node.newString(name));
    }



































    




    @Test
    public void testGetPrototypeFromAssignmentProperty() throws Exception {
        AnalyzePrototypeProperties analyzer = createAnalyzePrototypeProperties(false, false);
        Node prototypeAccess = createGetPropNode(createNameNode("Foo"), "prototype");
        Node assignNode = new Node(Token.ASSIGN, prototypeAccess, createFunctionNode());
        AnalyzePrototypeProperties.AssignmentProperty assignProp = analyzer.new AssignmentProperty(new Node(Token.EXPR_RESULT, assignNode), null);
        
        assertEquals(createNameNode("Foo"), assignProp.getPrototype());
    }

    @Test
    public void testGetValueFromAssignmentProperty() throws Exception {
        AnalyzePrototypeProperties analyzer = createAnalyzePrototypeProperties(false, false);
        Node valueNode = createFunctionNode();
        Node assignNode = new Node(Token.ASSIGN, createGetPropNode(createNameNode("Foo"), "prototype"), valueNode);
        AnalyzePrototypeProperties.AssignmentProperty assignProp = analyzer.new AssignmentProperty(new Node(Token.EXPR_RESULT, assignNode), null);

        assertEquals(valueNode, assignProp.getValue());
    }

    @Test
    public void testRemoveLiteralProperty() throws Exception {
        AnalyzePrototypeProperties analyzer = createAnalyzePrototypeProperties(false, false);
        Node key = Node.newString("prop");
        Node value = Node.newString("value");
        Node map = new Node(Token.OBJECTLIT, key, value);
        Node assign = new Node(Token.ASSIGN, createGetPropNode(createNameNode("Foo"), "prototype"), map);
        
        AnalyzePrototypeProperties.LiteralProperty literalProp = analyzer.new LiteralProperty(key, value, map, assign, null);
        literalProp.remove();
        
        assertFalse(map.hasChildren());
    }

    @Test
    public void testGetPrototypeFromLiteralProperty() throws Exception {
        AnalyzePrototypeProperties analyzer = createAnalyzePrototypeProperties(false, false);
        Node prototypeNode = createGetPropNode(createNameNode("Foo"), "prototype");
        Node objectLit = new Node(Token.OBJECTLIT, Node.newString("prop"), Node.newString("value"));
        Node assign = createAssignNode(prototypeNode, objectLit);
        
        AnalyzePrototypeProperties.LiteralProperty literalProp = analyzer.new LiteralProperty(objectLit.getFirstChild(), objectLit.getFirstChild().getNext(), objectLit, assign, null);
        
        assertEquals(prototypeNode, literalProp.getPrototype());
    }

    @Test
    public void testGetValueFromLiteralProperty() throws Exception {
        AnalyzePrototypeProperties analyzer = createAnalyzePrototypeProperties(false, false);
        Node valueNode = Node.newString("value");
        Node objectLit = new Node(Token.OBJECTLIT, Node.newString("prop"), valueNode);
        Node assign = createAssignNode(createGetPropNode(createNameNode("Foo"), "prototype"), objectLit);

        AnalyzePrototypeProperties.LiteralProperty literalProp = analyzer.new LiteralProperty(objectLit.getFirstChild(), valueNode, objectLit, assign, null);
        assertEquals(valueNode, literalProp.getValue());
    }
}





