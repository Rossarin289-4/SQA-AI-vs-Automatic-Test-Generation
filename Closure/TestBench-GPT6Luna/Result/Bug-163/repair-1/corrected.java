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
import com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.Property;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol;
import com.google.javascript.rhino.IR;
import java.io.Serializable;
import java.util.Iterator;
import java.util.logging.Logger;

public class AnalyzePrototypePropertiesTest {
    @Test
    public void testInitialImplicitPropertyNames() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        Collection<NameInfo> infos = pass.getAllNameInfo();
        assertEquals(3, infos.size());
        Set<String> names = new java.util.HashSet<String>();
        for (NameInfo info : infos) {
            names.add(info.name);
        }
        assertEquals(ImmutableSet.of("length", "toString", "valueOf"), names);
    }

    @Test
    public void testEmptyProcessRetainsImplicitProperties() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        pass.process(IR.script(), IR.script());
        assertEquals(3, pass.getAllNameInfo().size());
    }

    @Test
    public void testImplicitNamesUniqueInInitialCollection() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, true, true);
        Collection<NameInfo> infos = pass.getAllNameInfo();
        Set<String> names = new java.util.HashSet<String>();
        for (NameInfo info : infos) {
            names.add(info.name);
        }
        assertEquals(infos.size(), names.size());
    }

    @Test
    public void testEmptyProcessRepeatable() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, true);
        pass.process(IR.script(), IR.script());
        pass.process(IR.script(), IR.script());
        assertEquals(3, pass.getAllNameInfo().size());
    }

    @Test
    public void testCollectionContainsImplicitLength() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        boolean found = false;
        for (NameInfo info : pass.getAllNameInfo()) {
            if ("length".equals(info.name)) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testCollectionContainsImplicitToString() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        boolean found = false;
        for (NameInfo info : pass.getAllNameInfo()) {
            if ("toString".equals(info.name)) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testCollectionContainsImplicitValueOf() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        boolean found = false;
        for (NameInfo info : pass.getAllNameInfo()) {
            if ("valueOf".equals(info.name)) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testImplicitPropertiesUnreferencedBeforeProcessing() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        for (NameInfo info : pass.getAllNameInfo()) {
            assertTrue(info.isReferenced());
        }
    }

    @Test
    public void testEmptyRootDoesNotAddNames() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        int before = pass.getAllNameInfo().size();
        pass.process(IR.script(), IR.script());
        assertEquals(before, pass.getAllNameInfo().size());
    }

    @Test
    public void testExternModificationOptionDoesNotChangeEmptyResult() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, true, false);
        pass.process(IR.script(), IR.script());
        assertEquals(3, pass.getAllNameInfo().size());
    }

    @Test
    public void testAnchorOptionDoesNotChangeEmptyResult() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, true);
        pass.process(IR.script(), IR.script());
        assertEquals(3, pass.getAllNameInfo().size());
    }

    @Test
    public void testEmptyProcessingLeavesImplicitNamesReferenced() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        pass.process(IR.script(), IR.script());
        for (NameInfo info : pass.getAllNameInfo()) {
            assertTrue(info.isReferenced());
        }
    }

    @Test
    public void testAssignmentPropertyValueAndPrototype() throws Exception {
        Node proto = IR.getprop(IR.name("Foo"), IR.string("prototype"));
        Node value = IR.function(IR.name(""), IR.paramList(), IR.block());
        Node assignment = IR.assign(
                IR.getprop(proto, IR.string("edge")), value);
        Node expression = IR.exprResult(assignment);
        AnalyzePrototypeProperties.AssignmentProperty property =
                new AnalyzePrototypeProperties.AssignmentProperty(
                        expression, null, null);

        assertSame(value, property.getValue());
        assertSame(proto, property.getPrototype());
        assertNull(property.getRootVar());
        assertNull(property.getModule());
    }

    @Test
    public void testAssignmentPropertyRemoveRemovesExpression() throws Exception {
        Node expression = IR.exprResult(
                IR.assign(IR.name("x"), IR.number(1)));
        Node parent = IR.block(expression);
        AnalyzePrototypeProperties.AssignmentProperty property =
                new AnalyzePrototypeProperties.AssignmentProperty(
                        expression, null, null);

        property.remove();

        assertNull(expression.getParent());
        assertEquals(0, parent.getFirstChild() == null ? 0 : 1);
    }

    @Test
    public void testLiteralPropertyValuePrototypeAndModule() throws Exception {
        Node value = IR.function(IR.name(""), IR.paramList(), IR.block());
        Node key = IR.propdef(IR.string("edge"), value);
        Node map = IR.objectlit(key);
        Node assign = IR.assign(
                IR.getprop(IR.name("Foo"), IR.string("prototype")), map);
        JSModule module = new JSModule("m");
        AnalyzePrototypeProperties.LiteralProperty property =
                new AnalyzePrototypeProperties.LiteralProperty(
                        key, value, map, assign, null, module);

        assertSame(value, property.getValue());
        assertSame(assign.getFirstChild(), property.getPrototype());
        assertSame(module, property.getModule());
        assertNull(property.getRootVar());
    }

    @Test
    public void testLiteralPropertyRemoveRemovesRegisteredKey() throws Exception {
        Node key = IR.propdef(IR.string("edge"), IR.number(1));
        Node map = IR.objectlit(key);
        AnalyzePrototypeProperties.LiteralProperty property =
                new AnalyzePrototypeProperties.LiteralProperty(
                        key, key.getFirstChild(), map,
                        IR.assign(IR.name("x"), map), null, null);

        property.remove();

        assertNull(key.getParent());
        assertNull(map.getFirstChild());
    }

    @Test
    public void testNameInfoMarkReferenceWithoutModuleGraph() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        NameInfo info = pass.new NameInfo("edge");

        assertFalse(info.isReferenced());
        assertTrue(info.markReference(null));
        assertTrue(info.isReferenced());
        assertFalse(info.markReference(null));
    }

    @Test
    public void testNameInfoDeclarationsInitiallyEmpty() throws Exception {
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        NameInfo info = pass.new NameInfo("edge");

        assertEquals(0, info.getDeclarations().size());
        assertFalse(info.readsClosureVariables());
    }

    @Test
    public void testGlobalFunctionRemoveDeclaration() throws Exception {
        Node function = IR.function(
                IR.name("edge"), IR.paramList(), IR.block());
        Node parent = IR.script(function);
        Node nameNode = function.getFirstChild();
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        AnalyzePrototypeProperties.GlobalFunction symbol =
                pass.new GlobalFunction(nameNode, null, null);

        symbol.remove();

        assertNull(function.getParent());
        assertNull(parent.getFirstChild());
    }

    @Test
    public void testGlobalFunctionNodeAndModule() throws Exception {
        Node function = IR.function(
                IR.name("edge"), IR.paramList(), IR.block());
        Node nameNode = function.getFirstChild();
        JSModule module = new JSModule("m");
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        AnalyzePrototypeProperties.GlobalFunction symbol =
                pass.new GlobalFunction(nameNode, null, module);

        assertSame(function, symbol.getFunctionNode());
        assertSame(module, symbol.getModule());
        assertNull(symbol.getRootVar());
    }

    @Test
    public void testGlobalFunctionRemoveNameFromMultiNameVar() throws Exception {
        Node first = IR.name("first");
        Node second = IR.name("edge");
        Node var = new Node(Token.VAR, first, second);
        Node function = IR.function(
                IR.name(""), IR.paramList(), IR.block());
        second.addChildToBack(function);
        Node parent = IR.script(var);
        AnalyzePrototypeProperties pass =
                new AnalyzePrototypeProperties(null, null, false, false);
        AnalyzePrototypeProperties.GlobalFunction symbol =
                pass.new GlobalFunction(second, null, null);

        symbol.remove();

        assertSame(var, second.getParent());
        assertNull(second.getFirstChild());
        assertSame(first, parent.getFirstChild().getFirstChild());
    }
}
