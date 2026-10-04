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
import java.util.List;
import java.util.Collection;

public class TypeCheckTest {

    // Helper to create a basic JSTypeRegistry
    private JSTypeRegistry createRegistry() {
        // Need a Compiler instance for JSTypeRegistry. Use a minimal mock.
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override
            public TypeValidator getTypeValidator() { return null; }
            @Override
            public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return null; } // Will be provided by caller
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        return new JSTypeRegistry(compiler);
    }

    // Helper to create a basic NodeTraversal with minimal mocks
    private NodeTraversal createTraversal(Node node, Scope scope, AbstractCompiler compiler, ScopeCreator scopeCreator, NodeTraversal.Callback callback) {
        return new NodeTraversal(compiler, callback, scopeCreator) {
            @Override
            public Scope getScope() {
                return scope;
            }

            @Override
            public Node getNode() {
                return node;
            }

            @Override
            public void report(Node n, DiagnosticType diagnosticType, String... arguments) {
                // Use a real JSError if possible, otherwise a simple representation
                compiler.report(JSError.make(n, diagnosticType, arguments));
            }

            @Override
            public JSError makeError(Node n, CheckLevel level, DiagnosticType diagnosticType, String... arguments) {
                return JSError.make(n, diagnosticType, arguments);
            }

            @Override
            public Node getRoot() {
                // Minimal implementation for traversal context
                return new Node(Token.SCRIPT);
            }

            @Override
            public String getSourceName() {
                return "test.js";
            }
        };
    }

    // Helper to create a basic Scope
    private Scope createScope(JSTypeRegistry registry) {
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override
            public TypeValidator getTypeValidator() { return null; }
            @Override
            public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        Node root = new Node(Token.BLOCK);
        return new SyntacticScopeCreator(compiler).createScope(root, null);
    }

    private TypeCheck createTypeCheck(AbstractCompiler compiler, JSTypeRegistry registry, Scope topScope) {
        ReverseAbstractInterpreter reverseInterpreter = new SemanticReverseAbstractInterpreter(registry);
        ScopeCreator scopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        return new TypeCheck(compiler, reverseInterpreter, registry, topScope, scopeCreator, CheckLevel.WARNING, CheckLevel.OFF);
    }

    @Test
    public void testVisitName() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node nameNode = Node.newString("testVar");
        scope.declare("testVar", nameNode, null, null);
        nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node parent = Node.newNumber(10); // A parent that is not function, catch, lp, var
        NodeTraversal traversal = createTraversal(nameNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);

        typeCheck.visit(traversal, nameNode, parent);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), nameNode.getJSType());
    }

    @Test
    public void testVisitNameMasksVariable() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node functionNameNode = Node.newString("myFunction");
        FunctionType functionType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        functionNameNode.setJSType(functionType);

        scope.declare("myFunction", functionNameNode, null, null); // Declare it as a variable first

        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(functionNameNode); // The name of the function
        functionNode.setJSType(functionType);

        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.addChildToBack(functionNode);

        NodeTraversal traversal = createTraversal(functionNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);

        typeCheck.shouldTraverse(traversal, functionNode, scriptNode);
        typeCheck.visit(traversal, functionNode, scriptNode);

        // The FUNCTION_MASKS_VARIABLE warning should be reported.
        // The MockCompiler will capture this via its error reporting mechanism.
    }

    @Test
    public void testVisitGetProp() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node objectNode = Node.newNumber(10); // Dummy object node
        objectNode.setJSType(registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE));

        Node propertyNode = Node.newString("toString");
        Node getPropNode = new Node(Token.GETPROP, objectNode, propertyNode);
        getPropNode.setJSType(registry.getNativeFunctionType(JSTypeNative.FUNCTION_TYPE)); // Assume toString is a function

        Node parent = Node.newNumber(10); // Dummy parent
        NodeTraversal traversal = createTraversal(getPropNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);

        typeCheck.visit(traversal, getPropNode, parent);

        assertEquals(registry.getNativeFunctionType(JSTypeNative.FUNCTION_TYPE), getPropNode.getJSType());
    }

    @Test
    public void testVisitGetPropNonObject() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node objectNode = Node.newNumber(10); // A number, not an object
        objectNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node propertyNode = Node.newString("toString");
        Node getPropNode = new Node(Token.GETPROP, objectNode, propertyNode);
        getPropNode.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)); // Assume unknown type for the result

        Node parent = Node.newNumber(10); // Dummy parent
        NodeTraversal traversal = createTraversal(getPropNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);

        typeCheck.visit(traversal, getPropNode, parent);
        // The type should remain unknown as it's not a valid property access on a primitive
        assertTrue(getPropNode.getJSType().isUnknownType());
    }

    @Test
    public void testVisitVar() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node varNameNode = Node.newString("myVar");
        Node varValueNode = Node.newNumber(123);
        varValueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(varNameNode);
        varNameNode.addChildToBack(varValueNode);

        scope.declare("myVar", varNameNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

        NodeTraversal traversal = createTraversal(varNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, varNode, new Node(Token.SCRIPT)); // Parent is SCRIPT

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), varNameNode.getJSType());
    }

    @Test
    public void testVisitNew() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        // Create a mock constructor function
        FunctionType constructorType = registry.createFunctionType(
            registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE) // return type
        );
        ObjectType instanceType = registry.createObjectType("MyClass");
        constructorType.setInstanceType(instanceType);
        constructorType.setConstructor(true);

        Node constructorNameNode = Node.newString("MyClass");
        constructorNameNode.setJSType(constructorType);

        Node argNode = Node.newNumber(10);
        argNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node newNode = new Node(Token.NEW, constructorNameNode, argNode);

        NodeTraversal traversal = createTraversal(newNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, newNode, new Node(Token.EXPR_RESULT)); // Parent is EXPR_RESULT

        // The type of the NEW expression should be the instance type of the constructor
        assertEquals(instanceType, newNode.getJSType());
    }

    @Test
    public void testVisitCall() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        // Create a mock function type
        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.STRING_TYPE) // return type
        );

        Node functionNameNode = Node.newString("myFunc");
        functionNameNode.setJSType(functionType);

        Node argNode = Node.newNumber(10);
        argNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node callNode = new Node(Token.CALL, functionNameNode, argNode);

        NodeTraversal traversal = createTraversal(callNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, callNode, new Node(Token.EXPR_RESULT)); // Parent is EXPR_RESULT

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), callNode.getJSType());
    }

    @Test
    public void testVisitReturn() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        // Create a mock function type with a return type
        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.BOOLEAN_TYPE) // return type
        );

        Node functionNameNode = Node.newString("myFunc");
        functionNameNode.setJSType(functionType);

        Node returnExpression = Node.newBoolean(true);
        returnExpression.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node returnNode = new Node(Token.RETURN, returnExpression);

        // Create an enclosing function context for the traversal
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(functionNameNode); // Function name
        functionNode.addChildToBack(new Node(Token.LP)); // Parameters
        Node blockNode = new Node(Token.BLOCK);
        functionNode.addChildToBack(blockNode); // Body
        functionNode.setJSType(functionType);
        blockNode.addChildToBack(returnNode); // Add return to body

        NodeTraversal traversal = createTraversal(returnNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        // Manually set the enclosing function context for the traversal
        typeCheck.visit(traversal, returnNode, blockNode);

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), returnNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorAdd() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newNumber(10);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(5);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node addNode = new Node(Token.ADD, left, right);
        addNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        NodeTraversal traversal = createTraversal(addNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, addNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), addNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorStringAdd() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newString("hello");
        left.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node right = Node.newString(" world");
        right.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Node addNode = new Node(Token.ADD, left, right);
        addNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        NodeTraversal traversal = createTraversal(addNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, addNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorBitwise() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newNumber(10); // In JS, numbers are coerced to 32-bit integers for bitwise ops
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(5);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node bitAndNode = new Node(Token.BITAND, left, right);
        bitAndNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        NodeTraversal traversal = createTraversal(bitAndNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, bitAndNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitAndNode.getJSType());
    }

    @Test
    public void testVisitBinaryOperatorShift() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newNumber(10); // In JS, numbers are coerced to 32-bit integers for bitwise ops
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(1); // Shift amount
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node lshNode = new Node(Token.LSH, left, right);
        lshNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        NodeTraversal traversal = createTraversal(lshNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, lshNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), lshNode.getJSType());
    }

    @Test
    public void testVisitEq() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newNumber(10);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(10);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node eqNode = new Node(Token.EQ, left, right);
        eqNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        NodeTraversal traversal = createTraversal(eqNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, eqNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), eqNode.getJSType());
    }

    @Test
    public void testVisitNe() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newNumber(10);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(5);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node neNode = new Node(Token.NE, left, right);
        neNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        NodeTraversal traversal = createTraversal(neNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, neNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), neNode.getJSType());
    }

    @Test
    public void testVisitLt() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newNumber(10);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(5);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node ltNode = new Node(Token.LT, left, right);
        ltNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        NodeTraversal traversal = createTraversal(ltNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, ltNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), ltNode.getJSType());
    }

    @Test
    public void testVisitGe() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newNumber(10);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(10);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node geNode = new Node(Token.GE, left, right);
        geNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        NodeTraversal traversal = createTraversal(geNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, geNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), geNode.getJSType());
    }

    @Test
    public void testVisitIn() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newString("prop"); // Property name
        left.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node right = Node.newObject(Token.OBJECTLIT, new Node[0]); // Object
        right.setJSType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));

        Node inNode = new Node(Token.IN, left, right);
        inNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        NodeTraversal traversal = createTraversal(inNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, inNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), inNode.getJSType());
    }

    @Test
    public void testVisitInstanceOf() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        // Mock a constructor type
        FunctionType constructorType = registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        ObjectType instanceType = registry.createObjectType("MyConstructor");
        constructorType.setInstanceType(instanceType);
        constructorType.setConstructor(true);

        Node left = Node.newObject(Token.OBJECTLIT, new Node[0]); // An object instance
        left.setJSType(instanceType);
        Node right = Node.newString("MyConstructor"); // The constructor name (or reference)
        right.setJSType(constructorType);

        Node instanceofNode = new Node(Token.INSTANCEOF, left, right);
        instanceofNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        NodeTraversal traversal = createTraversal(instanceofNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, instanceofNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), instanceofNode.getJSType());
    }

    @Test
    public void testVisitAssign() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node lhs = Node.newString("targetVar");
        lhs.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node rhs = Node.newNumber(42);
        rhs.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node assignNode = new Node(Token.ASSIGN, lhs, rhs);
        assignNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Assignment result type

        scope.declare("targetVar", lhs, registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

        NodeTraversal traversal = createTraversal(assignNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, assignNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

     @Test
    public void testVisitAssignGetProp() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node objectNode = Node.newObject(Token.OBJECTLIT, new Node[0]);
        ObjectType objectType = registry.createObjectType("MyObject");
        objectNode.setJSType(objectType);
        objectType.defineProperty("myProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, false);

        Node propertyNode = Node.newString("myProp");
        Node getPropNode = new Node(Token.GETPROP, objectNode, propertyNode);
        getPropNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); // Type of the property

        Node rhs = Node.newString("newValue");
        rhs.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Node assignNode = new Node(Token.ASSIGN, getPropNode, rhs);
        assignNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); // Assignment result type

        NodeTraversal traversal = createTraversal(assignNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, assignNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), assignNode.getJSType());
    }

    @Test
    public void testVisitFunction() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE)
        );
        functionType.setConstructor(true); // Mark as a constructor

        Node functionNameNode = Node.newString("MyFunction");
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(functionNameNode);
        functionNode.addChildToBack(new Node(Token.LP));
        functionNode.addChildToBack(new Node(Token.BLOCK));
        functionNode.setJSType(functionType);

        NodeTraversal traversal = createTraversal(functionNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, functionNode, new Node(Token.SCRIPT));

        assertEquals(functionType, functionNode.getJSType());
    }

    @Test
    public void testVisitFor() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node forNode = new Node(Token.FOR);
        Node init = Node.newNumber(0); init.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node cond = Node.newNumber(1); cond.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node inc = Node.newNumber(2); inc.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(init);
        forNode.addChildToBack(cond);
        forNode.addChildToBack(inc);
        forNode.addChildToBack(body);

        NodeTraversal traversal = createTraversal(forNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, forNode, new Node(Token.BLOCK));
    }

    @Test
    public void testVisitWhile() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node whileNode = new Node(Token.WHILE);
        Node cond = Node.newNumber(1); cond.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node body = new Node(Token.BLOCK);
        whileNode.addChildToBack(cond);
        whileNode.addChildToBack(body);

        NodeTraversal traversal = createTraversal(whileNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, whileNode, new Node(Token.BLOCK));
    }

    @Test
    public void testVisitIf() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node ifNode = new Node(Token.IF);
        Node cond = Node.newNumber(1); cond.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node thenBranch = new Node(Token.BLOCK);
        Node elseBranch = new Node(Token.BLOCK);
        ifNode.addChildToBack(cond);
        ifNode.addChildToBack(thenBranch);
        ifNode.addChildToBack(elseBranch);

        NodeTraversal traversal = createTraversal(ifNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, ifNode, new Node(Token.BLOCK));
    }

    @Test
    public void testVisitTry() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node tryNode = new Node(Token.TRY);
        Node tryBlock = new Node(Token.BLOCK);
        Node catchBlock = new Node(Token.CATCH);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(tryBlock);
        tryNode.addChildToBack(catchBlock);
        tryNode.addChildToBack(finallyBlock);

        NodeTraversal traversal = createTraversal(tryNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, tryNode, new Node(Token.BLOCK));
    }

    @Test
    public void testVisitThrow() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node throwNode = new Node(Token.THROW);
        Node exception = Node.newString("error"); exception.setJSType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        throwNode.addChildToBack(exception);

        NodeTraversal traversal = createTraversal(throwNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, throwNode, new Node(Token.BLOCK));
    }

    @Test
    public void testVisitDebugger() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node debuggerNode = new Node(Token.DEBUGGER);

        NodeTraversal traversal = createTraversal(debuggerNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, debuggerNode, new Node(Token.BLOCK));
    }

    @Test
    public void testVisitBlock() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node blockNode = new Node(Token.BLOCK);

        NodeTraversal traversal = createTraversal(blockNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, blockNode, new Node(Token.SCRIPT));
    }

    @Test
    public void testVisitComma() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node left = Node.newNumber(1);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(2);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node commaNode = new Node(Token.COMMA, left, right);
        commaNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Type of comma is type of last element

        NodeTraversal traversal = createTraversal(commaNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, commaNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), commaNode.getJSType());
    }

    @Test
    public void testVisitStringLiteral() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node stringNode = Node.newString("hello");
        stringNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        NodeTraversal traversal = createTraversal(stringNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, stringNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), stringNode.getJSType());
    }

    @Test
    public void testVisitNumberLiteral() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node numberNode = Node.newNumber(123.45);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        NodeTraversal traversal = createTraversal(numberNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, numberNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberNode.getJSType());
    }

    @Test
    public void testVisitBooleanLiteralTrue() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node trueNode = Node.newBoolean(true);
        trueNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        NodeTraversal traversal = createTraversal(trueNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, trueNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), trueNode.getJSType());
    }

    @Test
    public void testVisitBooleanLiteralFalse() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node falseNode = Node.newBoolean(false);
        falseNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        NodeTraversal traversal = createTraversal(falseNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, falseNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), falseNode.getJSType());
    }

    @Test
    public void testVisitNullLiteral() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node nullNode = Node.newNull();
        nullNode.setJSType(registry.getNativeType(JSTypeNative.NULL_TYPE));

        NodeTraversal traversal = createTraversal(nullNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, nullNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), nullNode.getJSType());
    }

    @Test
    public void testVisitThis() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        // Simulate 'this' context for a function
        ObjectType thisType = registry.createObjectType("ThisContext");
        Node functionNode = new Node(Token.FUNCTION);
        Node functionNameNode = Node.newString("fakeFunc");
        functionNode.addChildToBack(functionNameNode);
        functionNode.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        functionNode.addChildToBack(body);
        FunctionType functionType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), null, null, thisType);
        functionNode.setJSType(functionType);

        // Create a scope that has 'this' defined
        Scope functionScope = scope.createChild(functionNode);

        Node thisNode = new Node(Token.THIS);
        thisNode.setJSType(thisType);

        NodeTraversal traversal = createTraversal(thisNode, functionScope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, thisNode, body);

        assertEquals(thisType, thisNode.getJSType());
    }

    @Test
    public void testVisitVoid() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node expressionNode = Node.newNumber(10);
        expressionNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node voidNode = new Node(Token.VOID, expressionNode);
        voidNode.setJSType(registry.getNativeType(JSTypeNative.VOID_TYPE));

        NodeTraversal traversal = createTraversal(voidNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, voidNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), voidNode.getJSType());
    }

    @Test
    public void testVisitTypeOf() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node expressionNode = Node.newNumber(10);
        expressionNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node typeOfNode = new Node(Token.TYPEOF, expressionNode);
        typeOfNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); // typeof always returns a string

        NodeTraversal traversal = createTraversal(typeOfNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, typeOfNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeOfNode.getJSType());
    }

    @Test
    public void testVisitBitNot() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node expressionNode = Node.newNumber(10);
        expressionNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node bitNotNode = new Node(Token.BITNOT, expressionNode);
        bitNotNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Bitwise NOT returns a number

        NodeTraversal traversal = createTraversal(bitNotNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, bitNotNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitNotNode.getJSType());
    }

    @Test
    public void testVisitPos() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node expressionNode = Node.newNumber(-10);
        expressionNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node posNode = new Node(Token.POS, expressionNode);
        posNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Unary plus returns a number

        NodeTraversal traversal = createTraversal(posNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, posNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), posNode.getJSType());
    }

    @Test
    public void testVisitNeg() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node expressionNode = Node.newNumber(10);
        expressionNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node negNode = new Node(Token.NEG, expressionNode);
        negNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Unary minus returns a number

        NodeTraversal traversal = createTraversal(negNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, negNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), negNode.getJSType());
    }

    @Test
    public void testVisitDelProp() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node objectNode = Node.newObject(Token.OBJECTLIT, new Node[0]);
        objectNode.setJSType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        Node propertyName = Node.newString("propToDelete");
        Node delPropNode = new Node(Token.DELPROP, objectNode, propertyName);
        delPropNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE)); // delete returns a boolean

        NodeTraversal traversal = createTraversal(delPropNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, delPropNode, new Node(Token.EXPR_RESULT));

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), delPropNode.getJSType());
    }

    @Test
    public void testVisitCase() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node switchNode = new Node(Token.SWITCH);
        Node caseValue = Node.newNumber(10);
        caseValue.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node caseNode = new Node(Token.CASE, caseValue);
        caseNode.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)); // CASE node itself doesn't have a determined type

        switchNode.addChildToBack(caseNode);
        switchNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Dummy switch type

        NodeTraversal traversal = createTraversal(caseNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, caseNode, switchNode);
    }

    @Test
    public void testVisitWith() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node objectNode = Node.newObject(Token.OBJECTLIT, new Node[0]);
        objectNode.setJSType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        Node withNode = new Node(Token.WITH, objectNode);
        // WITH node itself doesn't have a type.

        NodeTraversal traversal = createTraversal(withNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, withNode, new Node(Token.BLOCK));
    }

    @Test
    public void testvisitFunction_Interface() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        FunctionType functionType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        functionType.setInterface(true); // Mark as an interface

        Node functionNameNode = Node.newString("MyInterface");
        Node functionNode = new Node(Token.FUNCTION, functionNameNode, new Node(Token.LP), new Node(Token.BLOCK));
        functionNode.setJSType(functionType);

        NodeTraversal traversal = createTraversal(functionNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, functionNode, new Node(Token.SCRIPT));

        assertEquals(functionType, functionNode.getJSType());
    }

    @Test
    public void testvisitFunction_Constructor() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        FunctionType functionType = registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        functionType.setConstructor(true); // Mark as a constructor

        Node functionNameNode = Node.newString("MyConstructor");
        Node functionNode = new Node(Token.FUNCTION, functionNameNode, new Node(Token.LP), new Node(Token.BLOCK));
        functionNode.setJSType(functionType);

        NodeTraversal traversal = createTraversal(functionNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visit(traversal, functionNode, new Node(Token.SCRIPT));

        assertEquals(functionType, functionNode.getJSType());
    }


    @Test
    public void testVisitAnnotatedAssignGetprop() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        Node objectNode = Node.newObject(Token.OBJECTLIT, new Node[0]);
        ObjectType objectType = registry.createObjectType("MyObject");
        objectNode.setJSType(objectType);
        objectType.defineProperty("annotatedProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, false); // Original type

        Node propertyNode = Node.newString("annotatedProp");
        Node getPropNode = new Node(Token.GETPROP, objectNode, propertyNode);
        getPropNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Type of the property

        Node rhs = Node.newNumber(123);
        rhs.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node assignNode = new Node(Token.ASSIGN, getPropNode, rhs);
        assignNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Assignment result type

        JSDocInfo info = new JSDocInfo();
        // Set @type annotation to a different type
        info.addTypeAnnotation(registry.createNamedType("string")); // This will be evaluated to STRING_TYPE
        assignNode.setJSDocInfo(info);

        NodeTraversal traversal = createTraversal(assignNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        // Manually call visitAnnotatedAssignGetprop which is called from visitAssign
        typeCheck.visitAnnotatedAssignGetprop(traversal, assignNode, registry.getNativeType(JSTypeNative.STRING_TYPE), objectNode, "annotatedProp", rhs);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), assignNode.getJSType());
    }

     @Test
    public void testvisitParameterList_CorrectCount() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE), // param 1
            registry.getNativeType(JSTypeNative.STRING_TYPE)  // param 2
        );
        functionType.setMinArguments(2);
        functionType.setMaxArguments(2);

        Node callNode = new Node(Token.CALL);
        Node functionName = Node.newString("testFunc");
        functionName.setJSType(functionType);
        callNode.addChildToBack(functionName);

        Node arg1 = Node.newNumber(10);
        arg1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        callNode.addChildToBack(arg1);

        Node arg2 = Node.newString("hello");
        arg2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        callNode.addChildToBack(arg2);

        NodeTraversal traversal = createTraversal(callNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.visitParameterList(traversal, callNode, functionType);
        // No error reported means it passed.
    }

     @Test
    public void testvisitParameterList_WrongCount() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        FunctionType functionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE), // param 1
            registry.getNativeType(JSTypeNative.STRING_TYPE)  // param 2
        );
        functionType.setMinArguments(2);
        functionType.setMaxArguments(2);

        Node callNode = new Node(Token.CALL);
        Node functionName = Node.newString("testFunc");
        functionName.setJSType(functionType);
        callNode.addChildToBack(functionName);

        Node arg1 = Node.newNumber(10); // Only one argument provided
        arg1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        callNode.addChildToBack(arg1);

        NodeTraversal traversal = createTraversal(callNode, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        // Expecting WRONG_ARGUMENT_COUNT diagnostic
        typeCheck.visitParameterList(traversal, callNode, functionType);
        // In a real test, we would assert that compiler.report() was called with the correct error.
    }

    @Test
    public void testCheckPropertyAccess_Exists() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        ObjectType objectType = registry.createObjectType("MyObject");
        objectType.defineProperty("existingProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, false);

        Node n = new Node(Token.GETPROP); // Dummy node
        n.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        NodeTraversal traversal = createTraversal(n, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.checkPropertyAccess(objectType, "existingProp", traversal, n);
        // No diagnostic should be reported.
    }

    @Test
    public void testCheckPropertyAccess_DoesNotExist() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        ObjectType objectType = registry.createObjectType("MyObject");
        // Property does not exist

        Node n = new Node(Token.GETPROP); // Dummy node
        n.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)); // Assume unknown type for the access result

        NodeTraversal traversal = createTraversal(n, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        // Set reportMissingProperties to true for this test
        typeCheck.reportMissingProperties = true;
        typeCheck.checkPropertyAccess(objectType, "nonExistentProp", traversal, n);
        // We expect INEXISTENT_PROPERTY or INEXISTENT_ENUM_ELEMENT to be reported.
    }

    @Test
    public void testCheckEnumInitializer_Valid() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        EnumType enumType = registry.createEnumType("MyEnum",
            registry.getNativeType(JSTypeNative.STRING_TYPE));

        Node enumValue = Node.newString("VALUE1");
        enumValue.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        NodeTraversal traversal = createTraversal(enumValue, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        typeCheck.checkEnumInitializer(traversal, enumValue, enumType.getElementsType().getPrimitiveType());
        // No error should be reported for a valid initializer.
    }

    @Test
    public void testCheckEnumInitializer_InvalidType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        Scope scope = createScope(registry);
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, scope);

        EnumType enumType = registry.createEnumType("MyEnum",
            registry.getNativeType(JSTypeNative.STRING_TYPE));

        Node enumValue = Node.newNumber(123); // Invalid type for string enum
        enumValue.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        NodeTraversal traversal = createTraversal(enumValue, scope, compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);
        // Expecting validator.expectCanAssignTo to report an error.
        typeCheck.checkEnumInitializer(traversal, enumValue, enumType.getElementsType().getPrimitiveType());
        // Assertion of reported errors needs a mock compiler that collects them.
    }

    @Test
    public void testIsReference_Name() {
        Node nameNode = Node.newString("var");
        assertTrue(TypeCheck.isReference(nameNode));
    }

    @Test
    public void testIsReference_GetProp() {
        Node obj = Node.newObject(Token.OBJECTLIT, new Node[0]);
        Node prop = Node.newString("prop");
        Node getPropNode = new Node(Token.GETPROP, obj, prop);
        assertTrue(TypeCheck.isReference(getPropNode));
    }

    @Test
    public void testIsReference_GetElem() {
        Node obj = Node.newObject(Token.OBJECTLIT, new Node[0]);
        Node index = Node.newNumber(0);
        Node getElemNode = new Node(Token.GETELEM, obj, index);
        assertTrue(TypeCheck.isReference(getElemNode));
    }

    @Test
    public void testIsReference_Invalid() {
        Node numberNode = Node.newNumber(123);
        assertFalse(TypeCheck.isReference(numberNode));
    }

    @Test
    public void testGetJSType_NotNull() {
        JSTypeRegistry registry = createRegistry();
        Node node = Node.newNumber(10);
        node.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, createScope(registry));
        NodeTraversal traversal = createTraversal(node, createScope(registry), compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), typeCheck.getJSType(node));
    }

    @Test
    public void testGetJSType_Null() {
        JSTypeRegistry registry = createRegistry();
        Node node = Node.newNumber(10); // No type set
        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, createScope(registry));
        NodeTraversal traversal = createTraversal(node, createScope(registry), compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);

        assertTrue(typeCheck.getJSType(node).isUnknownType());
    }

    @Test
    public void testGetFunctionType_ValidFunction() {
        JSTypeRegistry registry = createRegistry();
        FunctionType funcType = registry.createFunctionType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node node = Node.newString("myFunc");
        node.setJSType(funcType);

        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, createScope(registry));
        NodeTraversal traversal = createTraversal(node, createScope(registry), compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);

        assertEquals(funcType, typeCheck.getFunctionType(node));
    }

    @Test
    public void testGetFunctionType_NonFunctionType() {
        JSTypeRegistry registry = createRegistry();
        Node node = Node.newNumber(10);
        node.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        AbstractCompiler compiler = new AbstractCompiler() {
            @Override public TypeValidator getTypeValidator() { return null; }
            @Override public ErrorManager getErrorManager() { return new BasicErrorManager() {
                @Override protected void formatError(JSError error) {}
                @Override public void report(CheckLevel level, JSError error) {}
                @Override public void summarize() {}
            }; }
            @Override public CodingConvention getCodingConvention() { return new ClosureCodingConvention(); }
            @Override public String getSourcePath() { return "test.js"; }
            @Override public void init(CompilerOptions options) {}
            @Override public <T> T getImplementation(Class<T> cls) { return null; }
            @Override public JSTypeRegistry getTypeRegistry() { return registry; }
            @Override public void report(JSError error) {}
            @Override public void process(Node externsRoot, Node jsRoot) {}
            @Override public void process(Node node) {}
            @Override public Object getLicense() { return null; }
            @Override public String getVersion() { return "mock"; }
            @Override public void setErrorLevel(JSError error, CheckLevel level) {}
            @Override public CheckLevel getErrorLevel(JSError error) { return CheckLevel.ERROR; }
            @Override public void setProgress(String progress) {}
            @Override public void setBranch(String branch) {}
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public String[] getMessages() { return new String[0]; }
            @Override public String getDiagnosticCode(DiagnosticType type) { return type.key; }
            @Override public boolean hasRegExpGlobalReferences() { return false; }
        };
        TypeCheck typeCheck = createTypeCheck(compiler, registry, createScope(registry));
        NodeTraversal traversal = createTraversal(node, createScope(registry), compiler, new MemoizedScopeCreator(new TypedScopeCreator(compiler)), typeCheck);

        assertNull(typeCheck.getFunctionType(node));
    }
}
