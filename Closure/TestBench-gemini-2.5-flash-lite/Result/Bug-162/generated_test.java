package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.StaticSymbolTable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.SourcePosition;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;
import java.io.Serializable;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.jscomp.NodeUtil; // Import NodeUtil

// Remove unused or incorrectly imported classes
// import com.google.javascript.jscomp.AbstractCompiler.ExternProgress;
// import com.google.javascript.rhino.jstype.JSTypeNative; // Already imported

public class ScopeTest {

    // Mock AbstractCompiler for creating Scope objects

    // Helper to create a simple Scope.

    // Helper to create a nested Scope.
    private Scope createNestedScope(Scope parent, Node rootNode) {
        return new Scope(parent, rootNode);
    }

    // Helper to create a Var.
























    // Tests for ScopedAliases methods (implementing parts of the API outline)
    // These would typically be in a separate test class for ScopedAliases,
    // but given the constraints, we'll include basic checks if they directly
    // interact with Scope.













    @Test
    public void testVar_toString() throws Exception {
        Node nameNode = Node.newString("toStringVar");
        JSType mockType = new JSType(null) { // Mock JSType
            @Override public String getDisplayName() { return "MockType"; }
        };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("toStringVar", nameNode, mockType, scope, mockInput, false, false, null);
        assertEquals("Scope.Var toStringVar{MockType}", var.toString());
    }

    // New tests for uncovered methods

    @Test
    public void testVar_getSourceFile() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertNull(var.getSourceFile()); // CompilerInput is null in mock
    }

    @Test
    public void testVar_getSymbol() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(var, var.getSymbol());
    }

    @Test
    public void testVar_getDeclaration() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(var, var.getDeclaration());
    }

    @Test
    public void testVar_getParentNode() throws Exception {
        Node parentNode = new Node(Token.VAR);
        Node nameNode = Node.newString("testVar");
        parentNode.addChildToBack(nameNode);
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(parentNode, var.getParentNode());
    }

    @Test
    public void testVar_isBleedingFunction() throws Exception {
        // To test isBleedingFunction, the parent of nameNode needs to be a FUNCTION expression.
        Node functionExpr = new Node(Token.FUNCTION);
        Node nameNode = Node.newString("testVar");
        functionExpr.addChildToBack(nameNode); // Function expression body

        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        // Manually set parent to simulate a function expression.
        // The Var constructor does not set parent.
        nameNode.setParent(functionExpr);
        assertTrue(var.isBleedingFunction()); // Parent is FUNCTION and it's an expression
    }

    @Test
    public void testVar_getInitialValue_var() throws Exception {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString("testVar");
        Node initialValueNode = Node.newNumber(10);
        varNode.addChildToBack(nameNode);
        nameNode.addChildToBack(initialValueNode); // Initial value as a child of nameNode
        nameNode.setParent(varNode); // Set parent for nameNode
        initialValueNode.setParent(nameNode); // Set parent for initialValueNode

        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(initialValueNode, var.getInitialValue());
    }

    @Test
    public void testVar_getInitialValue_assign() throws Exception {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString("testVar");
        Node initialValueNode = Node.newNumber(10);
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(initialValueNode);
        nameNode.setParent(assignNode); // Set parent for nameNode
        initialValueNode.setParent(assignNode); // Set parent for initialValueNode

        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(initialValueNode, var.getInitialValue());
    }

    @Test
    public void testVar_getInitialValue_function() throws Exception {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString("testVar");
        functionNode.addChildToBack(nameNode); // Function name
        nameNode.setParent(functionNode); // Set parent for nameNode

        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(functionNode, var.getInitialValue());
    }

    @Test
    public void testVar_getType() throws Exception {
        Node nameNode = Node.newString("testVar");
        JSType mockType = new JSType(null) { @Override public String getDisplayName() { return "MockType"; } };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, mockType, scope, mockInput, false, false, null);
        assertEquals(mockType, var.getType());
    }

    @Test
    public void testVar_getNameNode() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals(nameNode, var.getNameNode());
    }

    @Test
    public void testVar_getInputName() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        mockInput.sourceFile = new StaticSourceFile() {
            @Override public String getName() { return "test.js"; }
            @Override public Node getNode() { return null; }
            @Override public int getLineCount() { return 0; }
            @Override public String getCode() { return null; }
            @Override public CharSequence getCodeStructure() { return null; }
            @Override public long getLastModified() { return 0; }
            @Override public void setCode(String code) {}
            @Override public long getLength() { return 0; }
            @Override public Object getId() { return null; }
            @Override public CharSequence getLine(int lineno) { return null; }
            @Override public int getLineIndex(int charOffset) { return 0; }
            @Override public String getLineOfOffset(int offset) { return null; }
            @Override public int getColumnOfOffset(int offset) { return 0; }
            @Override public String getUri() { return null; }
            @Override public int getLineOffset(int lineno) { return 0; }
        };
        Var var = createVar("testVar", nameNode, null, scope, mockInput, false, false, null);
        assertEquals("test.js", var.getInputName());
    }

    @Test
    public void testVar_getInputName_nullInput() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        Var var = createVar("testVar", nameNode, null, scope, null, false, false, null); // Null CompilerInput
        assertEquals("<non-file>", var.getInputName());
    }

    @Test
    public void testVar_setType() throws Exception {
        Node nameNode = Node.newString("testVar");
        JSType initialType = new JSType(null) { @Override public String getDisplayName() { return "InitialType"; } };
        JSType newType = new JSType(null) { @Override public String getDisplayName() { return "NewType"; } };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var inferredVar = createVar("inferredVar", nameNode, initialType, scope, mockInput, true, false, null); // inferred=true

        inferredVar.setType(newType);
        assertEquals(newType, inferredVar.getType());
    }

    @Test(expected = IllegalStateException.class)
    public void testVar_setType_onDeclaredVar() throws Exception {
        Node nameNode = Node.newString("testVar");
        JSType initialType = new JSType(null) { @Override public String getDisplayName() { return "InitialType"; } };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var declaredVar = createVar("declaredVar", nameNode, initialType, scope, mockInput, false, false, null); // inferred=false
        declaredVar.setType(null); // Should throw IllegalStateException
    }

    @Test
    public void testVar_resolveType() throws Exception {
        Node nameNode = Node.newString("testVar");
        JSType mockType = new JSType(null) {
            @Override
            public JSType resolve(ErrorReporter errorReporter, StaticScope<JSType> scope) {
                return new JSType(null) { @Override public String getDisplayName() { return "ResolvedType"; } };
            }
            @Override public String getDisplayName() { return "InitialType"; }
        };
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, mockType, scope, mockInput, true, false, null);

        var.resolveType(null); // Pass null ErrorReporter for simplicity
        assertEquals("ResolvedType", var.getType().getDisplayName());
    }

    @Test
    public void testVar_resolveType_nullType() throws Exception {
        Node nameNode = Node.newString("testVar");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = createVar("testVar", nameNode, null, scope, mockInput, true, false, null);

        var.resolveType(null); // Should not throw exception
        assertNull(var.getType());
    }

    @Test
    public void testScope_declare() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);

        Var declaredVar = scope.declare("myVar", nameNode, mockType, mockInput);
        assertNotNull(declaredVar);
        assertEquals("myVar", declaredVar.getName());
        assertEquals(nameNode, declaredVar.getNode());
        assertEquals(scope, declaredVar.getScope());
        assertTrue(scope.vars.containsKey("myVar"));
        assertEquals(declaredVar, scope.vars.get("myVar"));
    }

    @Test
    public void testScope_declare_withInferredFlag() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        JSType mockType = null;
        CompilerInput mockInput = new CompilerInput(null, null, false);

        Var declaredVar = scope.declare("myVar", nameNode, mockType, mockInput, true); // inferred = true
        assertTrue(declaredVar.isTypeInferred());
        assertEquals(1, declaredVar.index);

        Var declaredVar2 = scope.declare("myVar2", nameNode, mockType, mockInput, false); // inferred = false
        assertFalse(declaredVar2.isTypeInferred());
        assertEquals(2, declaredVar2.index);
    }

    @Test(expected = IllegalStateException.class)
    public void testScope_declare_twice() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        CompilerInput mockInput = new CompilerInput(null, null, false);

        scope.declare("myVar", nameNode, null, mockInput);
        scope.declare("myVar", nameNode, null, mockInput); // Should throw
    }

    @Test
    public void testScope_undeclare() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode = Node.newString("myVar");
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var = scope.declare("myVar", nameNode, null, mockInput);

        assertTrue(scope.vars.containsKey("myVar"));
        scope.undeclare(var);
        assertFalse(scope.vars.containsKey("myVar"));
    }

    @Test
    public void testScope_constructor_nullParent() throws Exception {
        Node rootNode = new Node(Token.FUNCTION);
        try {
            new Scope(null, rootNode); // This constructor expects a non-null parent
            fail("Expected an exception for null parent");
        } catch (NullPointerException expected) {
            // Preconditions.checkNotNull(parent) will throw NullPointerException
        }
    }

    @Test
    public void testScope_constructor_rootNodeSameAsParentRoot() throws Exception {
        Node rootNode = new Node(Token.FUNCTION);
        Scope parentScope = new Scope(rootNode, new MockAbstractCompiler());
        try {
            new Scope(parentScope, rootNode); // rootNode should not be the same as parent.rootNode
            fail("Expected an IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected exception
        }
    }

    @Test
    public void testScope_constructor_global() throws Exception {
        Node rootNode = new Node(Token.SCRIPT);
        Scope globalScope = new Scope(rootNode, new MockAbstractCompiler());
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());
        assertNull(globalScope.getParent());
        assertFalse(globalScope.isBottom());
        assertEquals(0, globalScope.getDepth());
    }

    @Test
    public void testScope_constructor_bottom() throws Exception {
        Node rootNode = new Node(Token.SCRIPT);
        ObjectType mockThisType = new ObjectType(null){}; // Mock ObjectType for 'this'
        Scope bottomScope = new Scope(rootNode, mockThisType);
        assertNotNull(bottomScope);
        assertNull(bottomScope.getParent());
        assertTrue(bottomScope.isBottom());
        assertEquals(0, bottomScope.getDepth());
        assertEquals(mockThisType, bottomScope.getTypeOfThis());
    }

    @Test
    public void testScope_getSlot_nonexistent() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        assertNull(scope.getSlot("nonexistent"));
    }

    @Test
    public void testScope_getOwnSlot_nonexistent() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        assertNull(scope.getOwnSlot("nonexistent"));
    }

    @Test
    public void testScope_isDeclared_nonexistent() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        assertFalse(scope.isDeclared("nonexistent", true));
        assertFalse(scope.isDeclared("nonexistent", false));
    }

    @Test
    public void testScope_getVarIterable() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Scope scope = createGlobalScope(root);
        Node nameNode1 = Node.newString("var1");
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var1 = scope.declare("var1", nameNode1, null, mockInput);

        Node nameNode2 = Node.newString("var2");
        Var var2 = scope.declare("var2", nameNode2, null, mockInput);

        Collection<Var> vars = Lists.newArrayList(scope.getVarIterable());
        assertEquals(2, vars.size());
        assertTrue(vars.contains(var1));
        assertTrue(vars.contains(var2));
    }

    @Test
    public void testScope_getParentScope() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot = new Node(Token.FUNCTION);
        Scope nestedScope = createNestedScope(globalScope, functionRoot);
        assertEquals(globalScope, nestedScope.getParentScope());
        assertNull(globalScope.getParentScope());
    }

    @Test
    public void testScope_constructor_nestedWithThisType() throws Exception {
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = createGlobalScope(globalRoot);
        Node functionRoot = new Node(Token.FUNCTION);
        ObjectType mockThisType = new ObjectType(null){}; // Mock ObjectType for 'this'
        // Manually create a scope and set its thisType for testing
        // The constructor `Scope(Scope parent, Node rootNode)` sets thisType based on rootNode.getJSType()
        // and then falls back to parent.thisType if rootNode's type is not a function.
        // To ensure our mockThisType is used, we can bypass the direct constructor call and set it.
        // However, the test aims to check the behavior of the constructor.
        // Let's mock the function type for the rootNode.
        JSType mockFunctionType = new JSType(null) {
            @Override public FunctionType toMaybeFunctionType() {
                return new FunctionType(null, null) {
                    @Override public JSType getTypeOfThis() {
                        return mockThisType;
                    }
                };
            }
            @Override public String getDisplayName() { return "MockFunctionType"; }
        };
        functionRoot.setJSType(mockFunctionType);
        Scope nestedScope = new Scope(globalScope, functionRoot);
        assertEquals(mockThisType, nestedScope.getTypeOfThis());
    }

    @Test
    public void testScope_constructor_globalWithThisType() throws Exception {
        Node rootNode = new Node(Token.SCRIPT);
        AbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public JSTypeRegistry getTypeRegistry() {
                JSTypeRegistry registry = new JSTypeRegistry(null);
                // Mock the JSTypeNative.GLOBAL_THIS to return a known ObjectType.
                // This requires a more complex mock of JSTypeRegistry or JSTypeNative.
                // For simplicity, we'll rely on the fact that the constructor calls
                // `compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS)` and
                // we just check that it returns a non-null ObjectType.
                return registry;
            }
        };
        Scope globalScope = new Scope(rootNode, compiler);
        // The actual 'thisType' for global scope is determined by the compiler.getTypeRegistry().getNativeObjectType(GLOBAL_THIS);
        // We cannot easily mock this without a full JSTypeRegistry mock.
        // We will assert that it is not null and it's an ObjectType.
        assertNotNull(globalScope.getTypeOfThis());
        assertTrue(globalScope.getTypeOfThis() instanceof ObjectType);
    }

    @Test
    public void testVar_equalsAndHashCode() {
        Node nameNode1 = Node.newString("var1");
        Scope scope = createGlobalScope(new Node(Token.SCRIPT));
        CompilerInput mockInput = new CompilerInput(null, null, false);
        Var var1 = createVar("var1", nameNode1, null, scope, mockInput, false, false, null);
        Var var1_copy = createVar("var1", nameNode1, null, scope, mockInput, false, false, null); // Same nameNode

        Node nameNode2 = Node.newString("var2");
        Var var2 = createVar("var2", nameNode2, null, scope, mockInput, false, false, null);

        // Test equals
        assertEquals(var1, var1_copy); // Same nameNode should be equal
        assertNotEquals(var1, var2); // Different nameNodes should not be equal

        // Test hashCode
        assertEquals(var1.hashCode(), var1_copy.hashCode());
        assertNotEquals(var1.hashCode(), var2.hashCode());
    }

    @Test
    public void testArguments_equalsAndHashCode() {
        Scope scope1 = createGlobalScope(new Node(Token.SCRIPT));
        Scope scope2 = createGlobalScope(new Node(Token.SCRIPT)); // Different scope

        Scope.Arguments args1 = new Scope.Arguments(scope1);
        Scope.Arguments args1_copy = new Scope.Arguments(scope1); // Same scope
        Scope.Arguments args2 = new Scope.Arguments(scope2); // Different scope

        // Test equals
        assertEquals(args1, args1_copy); // Same scope should be equal
        assertNotEquals(args1, args2); // Different scopes should not be equal

        // Test hashCode
        assertEquals(args1.hashCode(), args1_copy.hashCode());
        assertNotEquals(args1.hashCode(), args2.hashCode());
    }
}





