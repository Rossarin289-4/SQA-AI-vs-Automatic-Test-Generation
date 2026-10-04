package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.UnionType;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TypeInferenceTest {

    private JSTypeRegistry registry;
    private TypeInference ti;


    // Mock AbstractCompiler for basic functionality

    // Mock ReverseAbstractInterpreter

    // Mock ControlFlowGraph

    // --- Helper methods to construct Nodes with Types ---
    private Node createNumberNode(double value) {
        Node node = Node.newNumber(value);
        node.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        return node;
    }

    private Node createStringNode(String value) {
        Node node = Node.newString(value);
        node.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        return node;
    }

    private Node createBooleanNode(boolean value) {
        Node node = value ? new Node(Token.TRUE) : new Node(Token.FALSE);
        node.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        return node;
    }

    private Node createNameNode(String name, JSType type) {
        Node node = new Node(Token.NAME);
        node.setString(name);
        node.setJSType(type);
        return node;
    }

    private Node createGetPropNode(Node obj, String propName, JSType propType) {
        Node propNode = Node.newString(propName);
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToFront(obj);
        getPropNode.addChildToBack(propNode);
        getPropNode.setJSType(propType);
        return getPropNode;
    }


    // --- Test Methods ---










































    @Test
    public void testGetJSType_existingType() {
        Node numberNode = Node.newNumber(1);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), ti.getJSType(numberNode));
    }

    @Test
    public void testGetJSType_nullType() {
        Node someNode = new Node(Token.NAME); // Node without a set JSType
        assertEquals(ti.unknownType, ti.getJSType(someNode));
    }

    @Test
    public void testTraverseAnd_shortCircuiting() throws Exception {
        setupTypeInference("function f(a, b) { return a && b; }");
        Node andNode = new Node(Token.AND);
        Node left = createBooleanNode(false);
        Node right = createNameNode("b", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        andNode.addChildToFront(left);
        andNode.addChildToBack(right);

        // Mock scope with variables
        Scope mockScope = Scope.createGlobalScope(compiler);
        Var aVar = Var.make("a", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        mockScope.declare("a", aVar, null, null);
        Var bVar = Var.make("b", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("b", bVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);
        ti.syntacticScope = mockScope;

        BooleanOutcomePair outcome = ti.traverseAnd(andNode, flowScope);

        assertTrue(outcome.toBooleanOutcomes.contains(false)); // Since left is false, result is false
    }

    @Test
    public void testTraverseOr_shortCircuiting() throws Exception {
        setupTypeInference("function f(a, b) { return a || b; }");
        Node orNode = new Node(Token.OR);
        Node left = createBooleanNode(true);
        Node right = createNameNode("b", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        orNode.addChildToFront(left);
        orNode.addChildToBack(right);

        // Mock scope with variables
        Scope mockScope = Scope.createGlobalScope(compiler);
        Var aVar = Var.make("a", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        mockScope.declare("a", aVar, null, null);
        Var bVar = Var.make("b", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("b", bVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);
        ti.syntacticScope = mockScope;

        BooleanOutcomePair outcome = ti.traverseOr(orNode, flowScope);

        assertTrue(outcome.toBooleanOutcomes.contains(true)); // Since left is true, result is true
    }

    @Test
    public void testTraverseWith_basic() throws Exception {
        setupTypeInference("function f(obj) { with(obj) { prop = 1; } }");
        Node withNode = new Node(Token.WITH);
        Node objNode = createNameNode("obj", registry.createObjectType("MockObj"));
        Node blockNode = new Node(Token.BLOCK);
        Node assignNode = new Node(Token.ASSIGN);
        Node propName = Node.newStringKey("prop");
        Node value = createNumberNode(1);
        assignNode.addChildToFront(propName);
        assignNode.addChildToBack(value);
        blockNode.addChildToBack(assignNode);

        withNode.addChildToFront(objNode);
        withNode.addChildToBack(blockNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseWith(withNode, initialScope);
    }
}





