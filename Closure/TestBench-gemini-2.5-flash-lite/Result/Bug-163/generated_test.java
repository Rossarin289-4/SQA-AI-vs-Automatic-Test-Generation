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
import java.io.IOException;

// Mock CodingConvention - Minimal implementation to satisfy the compiler
class MockCodingConvention implements CodingConvention {
    // Methods added for newer CodingConvention interface versions to compile
}

// Mock Compiler - Minimal implementation for testing
class MockCompiler implements AbstractCompiler {
    private CodingConvention codingConvention = new MockCodingConvention();
    private JSModuleGraph moduleGraph = null;
    private Node syntheticCodeRoot = IR.script();





    public void setModuleGraph(JSModuleGraph moduleGraph) {
        this.moduleGraph = moduleGraph;
    }




    
    // These methods are part of AbstractCompiler but not directly called by the code under test in this context.
    // Providing minimal implementations for compilation.
}

// Mock JSModuleGraph - Minimal implementation for testing
class MockJSModuleGraph extends JSModuleGraph {
    private List<JSModule> modules = Lists.newArrayList();

    MockJSModuleGraph() {
        super(Lists.newArrayList()); // Initialize superclass with empty list
    }

    


    
    @Override
    public Collection<JSModule> getAllModules() {
        return modules;
    }
    
    @Override
    public int getModuleCount() {
        return modules.size();
    }
    
    @Override
    public JSModule getRootModule() {
        return modules.isEmpty() ? null : modules.get(0);
    }
}

// Mock IdGenerator
class MockIdGenerator extends CrossModuleMethodMotion.IdGenerator {
    private int currentId = 0;
    @Override
    public int newId() {
        return currentId++;
    }
    @Override
    public boolean hasGeneratedAnyIds() {
        return currentId > 0;
    }
}

public class AnalyzePrototypePropertiesTest {
    // Mock compiler and module graph for testing
    private static JSModule module1 = new JSModule("module1");
    private static JSModule module2 = new JSModule("module2");
    private static MockJSModuleGraph moduleGraph = new MockJSModuleGraph();
    private static MockIdGenerator idGenerator = new MockIdGenerator();

    // Helper to create a Node for a property assignment.
    private Node createPropAssign(String objName, String propName, Node value) {
        Node prop = IR.string(propName);
        Node getProp = IR.getprop(IR.name(objName), prop);
        Node assign = IR.assign(getProp, value);
        return IR.exprResult(assign);
    }

    // Helper to create a Node for a function declaration.
    private Node createFunctionNode(String name, Node... bodyStmts) {
        Node body = IR.block(bodyStmts);
        Node fn = IR.function(IR.name(name), IR.paramList(), body);
        return fn;
    }

    // Helper to create a Node for a var declaration.
    private Node createVarNode(String name, Node value) {
        return IR.var(IR.name(name), value);
    }


































    
    @Test
    public void testGetFunctionNode() throws Exception {
        Node functionBody = IR.block(IR.returnNode(IR.string("hello")));
        Node function = IR.function(IR.name("myFunc"), IR.paramList(), functionBody);
        Node root = IR.script(
            createPropAssign("Foo", "bar", function)
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        AnalyzePrototypeProperties.Property prop = barInfo.getDeclarations().peek();
        assertNotNull(prop);
        assertTrue(prop instanceof AnalyzePrototypeProperties.AssignmentProperty);
        
        // The AssignmentProperty class has getValue() which returns the Node representing the function.
        Node functionNodeFromProp = prop.getValue();
        assertNotNull(functionNodeFromProp);
        assertEquals(function, functionNodeFromProp);
    }
    
    @Test
    public void testImplicitlyUsedPropertiesAreMarked() throws Exception {
        Node externs = IR.script();
        Node root = IR.script();
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(externs, root);

        // Check that implicitly used properties are marked as referenced, even if no explicit usage.
        // This is because they are connected from externNode in the constructor.
        NameInfo lengthInfo = pass.propertyNameInfo.get("length");
        assertNotNull(lengthInfo);
        assertTrue(lengthInfo.isReferenced());
    }
    
    @Test
    public void testSymbolGraphConnection() throws Exception {
        Node root = IR.script(
            createPropAssign("Foo", "bar", IR.string("value"))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo barInfo = pass.propertyNameInfo.get("bar");
        assertNotNull(barInfo);
        
        NameInfo lengthInfo = pass.propertyNameInfo.get("length");
        assertTrue(pass.symbolGraph.hasNode(pass.externNode));
        assertTrue(pass.symbolGraph.hasNode(lengthInfo));
        // The connect method used for externNode initialization when moduleGraph is null.
        assertTrue(pass.symbolGraph.hasEdge(pass.externNode, null, lengthInfo));
    }

    @Test
    public void testNameInfo_ReadsClosureVariables() throws Exception {
        Node outerVar = IR.name("outerVar");
        Node innerFnBody = IR.block(IR.returnNode(outerVar));
        Node innerFn = IR.function(null, IR.paramList(), innerFnBody);
        Node root = IR.script(
            IR.var(IR.name("outerVar"), IR.string("value")),
            IR.exprResult(innerFn)
        );

        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(IR.script(), root);

        NameInfo outerVarInfo = pass.varNameInfo.get("outerVar");
        assertNotNull(outerVarInfo);
        assertTrue(outerVarInfo.readsClosureVariables());
    }

    @Test
    public void testProcessExternProperties() throws Exception {
        Node externs = IR.script(
            IR.exprResult(IR.getprop(IR.name("Object"), IR.string("toString")))
        );
        // Pass null for moduleGraph as it's not used for this specific test.
        AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
        pass.process(externs, IR.script());

        NameInfo toStringInfo = pass.propertyNameInfo.get("toString");
        assertNotNull(toStringInfo);
        assertTrue(toStringInfo.isReferenced()); 
        
        // The connection is made with firstModule from the constructor when moduleGraph is not null.
        // If moduleGraph is null, it should connect to null module.
        assertTrue(pass.symbolGraph.hasEdge(pass.externNode, null, toStringInfo));
    }
}





