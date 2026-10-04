package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;

public class ProcessClosurePrimitivesTest {

    // Helper method to create a mock compiler.
    private static AbstractCompiler createMockCompiler() {
        return new AbstractCompiler() {
            private JSModuleGraph moduleGraph = null;
            private CssRenamingMap cssRenamingMap = null;
            private TypeRegistry typeRegistry = new TypeRegistry();
            private final CodingConvention codingConvention = new DefaultCodingConvention();
            private int errorCount = 0;
            private final DiagnosticGroupSet diagnosticGroups = new DiagnosticGroupSet(Collections.emptyList());
            private int ecmaVersion = 0;

            @Override
            public void report(JSError error) {
                errorCount++;
                // In a real test, you'd assert that the correct error is reported.
                // For now, we'll just print it.
                System.err.println(error);
            }

            @Override
            public void reportCodeChange() {
                // No-op for now.
            }

            @Override
            public JSModuleGraph getModuleGraph() {
                return moduleGraph;
            }

            @Override
            public void setModuleGraph(JSModuleGraph moduleGraph) {
                this.moduleGraph = moduleGraph;
            }

            @Override
            public CodingConvention getCodingConvention() {
                return codingConvention;
            }

            @Override
            public TypeRegistry getTypeRegistry() {
                return typeRegistry;
            }

            @Override
            public void setCssRenamingMap(CssRenamingMap cssRenamingMap) {
                this.cssRenamingMap = cssRenamingMap;
            }
            
            @Override
            public CssRenamingMap getCssRenamingMap() {
                return cssRenamingMap;
            }

            @Override
            public Node getNodeForCodeInsertion(JSModule module) {
                // This is a simplification; in a real scenario, you'd need a more robust way
                // to get a node for code insertion based on the module.
                return new Node(Token.SCRIPT); // Placeholder
            }
            
            @Override
            public String getAstFileName(Node n) {
                return "test";
            }

            @Override
            public int getErrorCount() {
                return errorCount;
            }

            @Override
            public void setDiagnosticGroups(DiagnosticGroupSet diagnostics) {
                // No-op for now.
            }

            @Override
            public void updateGlobalEcmaVersion(int ecmaVersion) {
                this.ecmaVersion = ecmaVersion;
            }

            @Override
            public int getEcmaVersion() {
                return ecmaVersion;
            }

            @Override
            public LineAndColumnEncoder getLineAndColumnEncoder() {
                // Mock implementation
                return new LineAndColumnEncoder() {
                    @Override
                    public int encode(String sourceName, int lineNumber, int charNumber) { return 0; }
                    @Override
                    public LineAndColumnEncoder.LineColumnRange decode(int encoding) { return null; }
                };
            }

            @Override
            public String getPathRelativeToSource(String path) {
                return path;
            }

            @Override
            public Object getParsers() {
                return null; // Not used in this test context
            }
            
            @Override
            public void dispose() {}
        };
    }

    private ProcessClosurePrimitives createPass(AbstractCompiler compiler) {
        return new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    }

    @Test
    public void testProcessRequireSimple() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node requireProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "require"));
        Node requireCall = new Node(Token.CALL, requireProp, new Node(Token.STRING, "com.example.SomeClass"));
        Node exprResult = new Node(Token.EXPR_RESULT, requireCall);
        root.addChildToBack(exprResult);

        // Mocking that com.example.SomeClass is provided
        compiler.getTypeRegistry().forwardDeclareType("com.example.SomeClass");

        pass.process(null, root); // moduleGraph is null, so no module checks

        // After processing, the require should be removed.
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testProcessProvideSimple() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node provideCall = new Node(Token.CALL, provideProp, new Node(Token.STRING, "com.example.MyNamespace"));
        Node exprResult = new Node(Token.EXPR_RESULT, provideCall);
        root.addChildToBack(exprResult);

        pass.process(null, root);

        // After processing, the provide should be replaced by a declaration.
        assertEquals(1, root.getChildCount());
        Node declaration = root.getFirstChild();
        assertTrue(NodeUtil.isVar(declaration) || NodeUtil.isExprAssign(declaration));
        assertEquals("com.example.MyNamespace", declaration.getFirstChild().getString());
    }

    @Test
    public void testProcessExportSymbol() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node exportSymbolProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "exportSymbol"));
        Node exportCall = new Node(Token.CALL, exportSymbolProp, new Node(Token.STRING, "MyGlobalVar"));
        Node exprResult = new Node(Token.EXPR_RESULT, exportCall);
        root.addChildToBack(exprResult);

        pass.process(null, root);

        assertTrue(pass.getExportedVariableNames().contains("MyGlobalVar"));
    }

    @Test
    public void testProcessAddDependency() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node addDependencyProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "addDependency"));
        Node addDepCall = new Node(Token.CALL, addDependencyProp, new Node(Token.STRING, "path/to/file.js"), new Node(Token.ARRAYLIT, new Node(Token.STRING, "required.module")));
        Node exprResult = new Node(Token.EXPR_RESULT, addDepCall);
        root.addChildToBack(exprResult);

        pass.process(null, root);

        // addDependency call should be replaced by a number (0).
        assertEquals(1, root.getChildCount());
        assertEquals(Token.NUMBER, root.getFirstChild().getType());
        assertEquals(0, root.getFirstChild().getDouble(), 0);
    }

    @Test
    public void testProcessSetCssNameMapping() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT,
                new Node(Token.STRING, "input1"), new Node(Token.STRING, "output1"),
                new Node(Token.STRING, "input2"), new Node(Token.STRING, "output2"));
        Node googName = new Node(Token.NAME, "goog");
        Node setCssNameMappingProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "setCssNameMapping"));
        Node setCssCall = new Node(Token.CALL, setCssNameMappingProp, objLit);
        Node exprResult = new Node(Token.EXPR_RESULT, setCssCall);
        root.addChildToBack(exprResult);

        pass.process(null, root);

        // The call should be removed, and the compiler should have a CssRenamingMap.
        assertEquals(0, root.getChildCount());
        assertNotNull(compiler.getCssRenamingMap());
        assertEquals("output1", compiler.getCssRenamingMap().get("input1"));
    }

    @Test
    public void testProcessSetCssNameMappingInvalidArg() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node invalidArg = new Node(Token.STRING, "not an object");
        Node googName = new Node(Token.NAME, "goog");
        Node setCssNameMappingProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "setCssNameMapping"));
        Node setCssCall = new Node(Token.CALL, setCssNameMappingProp, invalidArg);
        Node exprResult = new Node(Token.EXPR_RESULT, setCssCall);
        root.addChildToBack(exprResult);

        // Expecting an error to be reported, but not crashing.
        pass.process(null, root);
        // The call should remain since an error occurred and it wasn't processed.
        assertEquals(1, root.getChildCount());
        assertNull(compiler.getCssRenamingMap());
    }

    @Test
    public void testProcessBaseClassConstructor() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);

        Node googName = new Node(Token.NAME, "goog");
        Node baseProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "base"));
        Node baseCall = new Node(Token.CALL, baseProp, new Node(Token.THIS));
        Node constructorBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, baseCall));
        Node functionNameNode = new Node(Token.NAME, "MyClass");
        Node functionNode = new Node(Token.FUNCTION, functionNameNode, new Node(Token.PARAM_LIST), constructorBody);
        Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "MyClass"), functionNode);
        Node exprResult1 = new Node(Token.EXPR_RESULT, assign);

        Node inheritsProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "inherits"));
        Node inheritsCall = new Node(Token.CALL, inheritsProp, new Node(Token.NAME, "MyClass"), new Node(Token.NAME, "BaseClass"));
        Node exprResult2 = new Node(Token.EXPR_RESULT, inheritsCall);

        root.addChildToBack(exprResult1);
        root.addChildToBack(exprResult2);

        pass.process(null, root);

        // The goog.base call should be replaced by BaseClass.call(this)
        Node newBaseCall = exprResult1.getFirstChild().getFirstChild().getNext().getFirstChild();
        assertEquals("BaseClass.call", newBaseCall.getQualifiedName());
        assertEquals(Token.CALL, newBaseCall.getType());
        assertEquals(Token.THIS, newBaseCall.getNext());
    }

    @Test
    public void testProcessBaseClassMethod() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);

        Node googName = new Node(Token.NAME, "goog");
        Node baseProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "base"));
        Node baseCall = new Node(Token.CALL, baseProp, new Node(Token.THIS), new Node(Token.STRING, "methodName"), new Node(Token.NUMBER, 1));
        
        // Create a proper nested structure for getEnclosingDeclNameNode to parse.
        Node methodFunctionNameNode = new Node(Token.NAME, "methodName");
        Node methodBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, baseCall));
        Node methodFunctionNode = new Node(Token.FUNCTION, methodFunctionNameNode, new Node(Token.PARAM_LIST), methodBody);
        
        Node classNameNode = new Node(Token.NAME, "MyClass");
        Node prototypeProperty = new Node(Token.GETPROP, classNameNode, new Node(Token.STRING, "prototype"));
        Node methodOnPrototype = new Node(Token.GETPROP, prototypeProperty, new Node(Token.STRING, "methodName"));
        Node assignmentToPrototypeMethod = new Node(Token.ASSIGN, methodOnPrototype, methodFunctionNode);
        Node exprStatement = new Node(Token.EXPR_RESULT, assignmentToPrototypeMethod);
        root.addChildToBack(exprStatement);

        // Simulate the NodeTraversal context.
        NodeTraversal simulatedTraversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) { }
            // getScopeRoot() should return the function declaration node.
            @Override
            public Node getScopeRoot() {
                return methodFunctionNode;
            }
        });

        pass.processBaseClassCall(simulatedTraversal, baseCall);

        assertEquals("MyClass.superClass_.methodName.call", baseCall.getQualifiedName());
        assertEquals(Token.CALL, baseCall.getType());
        assertEquals(Token.THIS, baseCall.getNext());
        assertNull(baseCall.getChildAtIndex(2)); // The string methodName should be removed.
    }

    @Test
    public void testHandleCandidateProvideDefinitionVar() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = new Node(Token.NAME, "MyNamespace");
        Node varNode = new Node(Token.VAR, nameNode);
        root.addChildToBack(varNode);

        // Simulate a prior goog.provide call
        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node originalProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, provideProp, new Node(Token.STRING, "MyNamespace")));
        pass.providedNames.put("MyNamespace",
            new ProcessClosurePrimitives.ProvidedName("MyNamespace", originalProvideNode, null, true));

        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) { }
            @Override
            public boolean inGlobalScope() { return true; }
        });
        pass.handleCandidateProvideDefinition(traversal, nameNode, varNode);

        // The var declaration should be marked as a namespace.
        assertTrue(varNode.getBooleanProp(Node.IS_NAMESPACE));
    }

    @Test
    public void testHandleCandidateProvideDefinitionAssign() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node qualifiedNameNode = NodeUtil.newQualifiedNameNode("MyNamespace", null, "MyNamespace");
        Node assignNode = new Node(Token.ASSIGN, qualifiedNameNode, new Node(Token.OBJECTLIT));
        Node exprResult = new Node(Token.EXPR_RESULT, assignNode);
        root.addChildToBack(exprResult);

        // Simulate a prior goog.provide call
        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node originalProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, provideProp, new Node(Token.STRING, "MyNamespace")));
        pass.providedNames.put("MyNamespace",
            new ProcessClosurePrimitives.ProvidedName("MyNamespace", originalProvideNode, null, true));

        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) { }
            @Override
            public boolean inGlobalScope() { return true; }
        });
        pass.handleCandidateProvideDefinition(traversal, assignNode, exprResult);

        // The assign expression should be marked as a namespace.
        assertTrue(exprResult.getBooleanProp(Node.IS_NAMESPACE));
    }


    @Test
    public void testTrySimplifyNewDateSimple() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node nowProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "now"));
        Node googNowCall = new Node(Token.CALL, nowProp);
        Node dateName = new Node(Token.NAME, "Date");
        Node newDateCall = new Node(Token.NEW, dateName, googNowCall);
        Node exprResult = new Node(Token.EXPR_RESULT, newDateCall);
        root.addChildToBack(exprResult);

        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
                @Override public void visit(NodeTraversal t, Node n, Node parent) {}
            });
        pass.trySimplifyNewDate(traversal, newDateCall, exprResult);

        // The goog.now() call should be removed.
        assertEquals(1, newDateCall.getChildCount()); // Should only have "Date"
        assertEquals(Token.NAME, newDateCall.getFirstChild().getType());
        assertEquals("Date", newDateCall.getFirstChild().getString());
    }

    @Test
    public void testTrySimplifyNewDateWithArgs() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node nowProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "now"));
        Node googNowCall = new Node(Token.CALL, nowProp);
        Node dateArg = new Node(Token.NUMBER, 123);
        Node dateName = new Node(Token.NAME, "Date");
        Node newDateCall = new Node(Token.NEW, dateName, googNowCall, dateArg);
        Node exprResult = new Node(Token.EXPR_RESULT, newDateCall);
        root.addChildToBack(exprResult);

        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
                @Override public void visit(NodeTraversal t, Node n, Node parent) {}
            });
        pass.trySimplifyNewDate(traversal, newDateCall, exprResult);

        // The new Date call should not be simplified because it has extra arguments.
        assertEquals(3, newDateCall.getChildCount());
        assertEquals(Token.CALL, newDateCall.getChildAtIndex(1).getType());
        assertEquals(Token.NUMBER, newDateCall.getChildAtIndex(2).getType());
    }

    @Test
    public void testVerifyProvideValid() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node methodName = new Node(Token.STRING, "provide");
        Node arg = new Node(Token.STRING, "com.example.MyNamespace");
        assertTrue(pass.verifyProvide(null, methodName, arg));
    }

    @Test
    public void testVerifyProvideInvalidChars() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node methodName = new Node(Token.STRING, "provide");
        Node arg = new Node(Token.STRING, "com.example.Invalid-Chars");
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        assertFalse(pass.verifyProvide(traversal, methodName, arg));
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testVerifyArgumentString() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node methodName = new Node(Token.STRING, "someMethod");
        Node arg = new Node(Token.STRING, "valid");
        assertTrue(pass.verifyArgument(null, methodName, arg, Token.STRING));
    }

    @Test
    public void testVerifyArgumentNull() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node methodName = new Node(Token.STRING, "someMethod");
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        assertFalse(pass.verifyArgument(traversal, methodName, null, Token.STRING));
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testVerifyArgumentWrongType() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node methodName = new Node(Token.STRING, "someMethod");
        Node arg = new Node(Token.NUMBER, 123);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        assertFalse(pass.verifyArgument(traversal, methodName, arg, Token.STRING));
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testVerifyArgumentTooMany() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node methodName = new Node(Token.STRING, "someMethod");
        Node arg1 = new Node(Token.STRING, "arg1");
        Node arg2 = new Node(Token.STRING, "arg2");
        arg1.setNext(arg2);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        assertFalse(pass.verifyArgument(traversal, methodName, arg1, Token.STRING));
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testRegisterAnyProvidedPrefixesSimple() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        JSModule module = new JSModule("module1");
        compiler.setModuleGraph(new JSModuleGraph(ImmutableList.of(module)));

        pass.registerAnyProvidedPrefixes("com.example.MyNamespace", new Node(Token.EXPR_RESULT), module);

        assertTrue(pass.providedNames.containsKey("com"));
        assertTrue(pass.providedNames.containsKey("com.example"));
        assertFalse(pass.providedNames.get("com").isExplicitlyProvided());
        assertFalse(pass.providedNames.get("com.example").isExplicitlyProvided());
    }

    @Test
    public void testRegisterAnyProvidedPrefixesAlreadyProvided() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        JSModule module = new JSModule("module1");
        compiler.setModuleGraph(new JSModuleGraph(ImmutableList.of(module)));

        // Pre-register "com"
        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node originalProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, provideProp, new Node(Token.STRING, "com")));
        pass.providedNames.put("com", new ProcessClosurePrimitives.ProvidedName("com", originalProvideNode, module, true));

        pass.registerAnyProvidedPrefixes("com.example.MyNamespace", new Node(Token.EXPR_RESULT), module);

        assertTrue(pass.providedNames.containsKey("com"));
        assertTrue(pass.providedNames.containsKey("com.example"));
        assertTrue(pass.providedNames.get("com").isExplicitlyProvided()); // Should remain explicitly provided
        assertFalse(pass.providedNames.get("com.example").isExplicitlyProvided());
    }

    @Test
    public void testProvidedNameReplaceNoDefinition() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        JSModule module = new JSModule("module1");
        compiler.setModuleGraph(new JSModuleGraph(ImmutableList.of(module)));

        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node explicitProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, provideProp, new Node(Token.STRING, "MyNamespace")));
        ProcessClosurePrimitives.ProvidedName pn = new ProcessClosurePrimitives.ProvidedName("MyNamespace", explicitProvideNode, module, true);
        pass.providedNames.put("MyNamespace", pn);

        pn.replace();
        // Should create a var declaration
        Node decl = pn.replacementNode;
        assertTrue(NodeUtil.isVar(decl));
        assertEquals("MyNamespace", decl.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, decl.getFirstChild().getFirstChild().getType());
    }

    @Test
    public void testProvidedNameReplaceWithDefinition() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        JSModule module = new JSModule("module1");
        compiler.setModuleGraph(new JSModuleGraph(ImmutableList.of(module)));

        Node qualifiedNameNode = NodeUtil.newQualifiedNameNode("MyNamespace", null, "MyNamespace");
        Node assignNode = new Node(Token.ASSIGN, qualifiedNameNode, new Node(Token.OBJECTLIT));
        Node definitionExpr = new Node(Token.EXPR_RESULT, assignNode);
        root.addChildToBack(definitionExpr);

        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node explicitProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, provideProp, new Node(Token.STRING, "MyNamespace")));
        ProcessClosurePrimitives.ProvidedName pn = new ProcessClosurePrimitives.ProvidedName("MyNamespace", explicitProvideNode, module, true);
        pn.addDefinition(definitionExpr, module);
        pass.providedNames.put("MyNamespace", pn);

        pn.replace();
        // The definition should be used and marked as namespace.
        assertEquals(definitionExpr, pn.replacementNode);
        assertTrue(definitionExpr.getBooleanProp(Node.IS_NAMESPACE));
    }

    @Test
    public void testProvidedNameReplaceDuplicateExplicit() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        JSModule module = new JSModule("module1");
        compiler.setModuleGraph(new JSModuleGraph(ImmutableList.of(module)));

        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node explicitProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, provideProp, new Node(Token.STRING, "MyNamespace")));
        
        Node qualifiedNameNode = NodeUtil.newQualifiedNameNode("MyNamespace", null, "MyNamespace");
        Node assignNode = new Node(Token.ASSIGN, qualifiedNameNode, new Node(Token.OBJECTLIT));
        Node definitionExpr = new Node(Token.EXPR_RESULT, assignNode);
        root.addChildToBack(explicitProvideNode);
        root.addChildToBack(definitionExpr);

        ProcessClosurePrimitives.ProvidedName pn = new ProcessClosurePrimitives.ProvidedName("MyNamespace", explicitProvideNode, module, true);
        pn.addDefinition(definitionExpr, module);
        pass.providedNames.put("MyNamespace", pn);

        pn.replace();

        // The explicit provide should be removed.
        assertTrue(explicitProvideNode.isDetached()); // It should be detached by replace()
        // The definition should be used and marked as namespace.
        assertEquals(definitionExpr, pn.replacementNode);
        assertTrue(definitionExpr.getBooleanProp(Node.IS_NAMESPACE));
    }

    @Test
    public void testProvidedNameReplaceWithVarDecl() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        JSModule module = new JSModule("module1");
        compiler.setModuleGraph(new JSModuleGraph(ImmutableList.of(module)));

        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node explicitProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, provideProp, new Node(Token.STRING, "MyNamespace")));
        
        Node nameNode = new Node(Token.NAME, "MyNamespace", new Node(Token.OBJECTLIT));
        Node definitionVar = new Node(Token.VAR, nameNode);
        root.addChildToBack(explicitProvideNode);
        root.addChildToBack(definitionVar);

        ProcessClosurePrimitives.ProvidedName pn = new ProcessClosurePrimitives.ProvidedName("MyNamespace", explicitProvideNode, module, true);
        pn.addDefinition(definitionVar, module);
        pass.providedNames.put("MyNamespace", pn);

        pn.replace();

        // The explicit provide should be removed.
        assertTrue(explicitProvideNode.isDetached());
        // The definition should be used and marked as namespace.
        assertEquals(definitionVar, pn.replacementNode);
        assertTrue(definitionVar.getBooleanProp(Node.IS_NAMESPACE));
    }


    @Test
    public void testIsNamespacePlaceholderBasic() throws Exception {
        Node script = new Node(Token.SCRIPT);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "Foo", new Node(Token.OBJECTLIT)));
        varDecl.putBooleanProp(Node.IS_NAMESPACE, true);
        assertTrue(ProcessClosurePrimitives.isNamespacePlaceholder(varDecl));

        Node assignExpr = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, NodeUtil.newQualifiedNameNode("Bar", null, "Bar"), new Node(Token.OBJECTLIT)));
        assignExpr.putBooleanProp(Node.IS_NAMESPACE, true);
        assertTrue(ProcessClosurePrimitives.isNamespacePlaceholder(assignExpr));
    }

    @Test
    public void testIsNamespacePlaceholderNotNamespace() throws Exception {
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "Foo", new Node(Token.OBJECTLIT)));
        assertFalse(ProcessClosurePrimitives.isNamespacePlaceholder(varDecl));

        Node assignExpr = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, NodeUtil.newQualifiedNameNode("Bar", null, "Bar"), new Node(Token.OBJECTLIT)));
        assertFalse(ProcessClosurePrimitives.isNamespacePlaceholder(assignExpr));
    }

    @Test
    public void testIsNamespacePlaceholderNotObjectLit() throws Exception {
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "Foo", new Node(Token.STRING, "hello")));
        varDecl.putBooleanProp(Node.IS_NAMESPACE, true);
        assertFalse(ProcessClosurePrimitives.isNamespacePlaceholder(varDecl));

        Node assignExpr = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, NodeUtil.newQualifiedNameNode("Bar", null, "Bar"), new Node(Token.STRING, "world")));
        assignExpr.putBooleanProp(Node.IS_NAMESPACE, true);
        assertFalse(ProcessClosurePrimitives.isNamespacePlaceholder(assignExpr));
    }
    
    @Test
    public void testProcessRequireMissingProvide() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node requireProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "require"));
        Node requireCall = new Node(Token.CALL, requireProp, new Node(Token.STRING, "com.example.Missing"));
        Node exprResult = new Node(Token.EXPR_RESULT, requireCall);
        root.addChildToBack(exprResult);

        pass.process(null, root);

        // The require should remain and an error should be reported.
        assertEquals(1, root.getChildCount());
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testProcessRequireLateProvide() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node requireProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "require"));
        Node requireCall = new Node(Token.CALL, requireProp, new Node(Token.STRING, "com.example.Late"));
        Node exprResult = new Node(Token.EXPR_RESULT, requireCall);
        root.addChildToBack(exprResult);

        // Simulate a late provide
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node provideCall = new Node(Token.CALL, provideProp, new Node(Token.STRING, "com.example.Late"));
        Node provideExprResult = new Node(Token.EXPR_RESULT, provideCall);
        root.addChildToBack(provideExprResult);

        pass.process(null, root);

        // The require should be removed and an error reported because it's "late".
        assertEquals(1, root.getChildCount()); // Only the provide should remain.
        assertEquals(1, compiler.getErrorCount()); // LATE_PROVIDE_ERROR
    }

    @Test
    public void testProcessProvideDuplicate() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node provideCall1 = new Node(Token.CALL, provideProp, new Node(Token.STRING, "com.example.Duplicate"));
        Node exprResult1 = new Node(Token.EXPR_RESULT, provideCall1);
        Node provideCall2 = new Node(Token.CALL, provideProp, new Node(Token.STRING, "com.example.Duplicate"));
        Node exprResult2 = new Node(Token.EXPR_RESULT, provideCall2);
        root.addChildToBack(exprResult1);
        root.addChildToBack(exprResult2);

        pass.process(null, root);

        // Only one provide should be processed, and the second should result in an error.
        assertEquals(1, root.getChildCount());
        assertEquals(1, compiler.getErrorCount()); // DUPLICATE_NAMESPACE_ERROR
    }

    @Test
    public void testProcessProvideImplicitPrefix() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node provideCall = new Node(Token.CALL, provideProp, new Node(Token.STRING, "com.example.MyNamespace"));
        Node exprResult = new Node(Token.EXPR_RESULT, provideCall);
        root.addChildToBack(exprResult);

        pass.process(null, root);

        // Should create declarations for "com" and "com.example" as well.
        assertEquals(3, root.getChildCount()); // var com = {}, var com.example = {}, var com.example.MyNamespace = {} (or similar)
    }
    
    @Test
    public void testFunctionNamespaceError() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        
        // Simulate a provide
        Node googName = new Node(Token.NAME, "goog");
        Node provideProp = new Node(Token.GETPROP, googName, new Node(Token.STRING, "provide"));
        Node provideCall = new Node(Token.CALL, provideProp, new Node(Token.STRING, "MyFunction"));
        Node provideExprResult = new Node(Token.EXPR_RESULT, provideCall);
        root.addChildToBack(provideExprResult);

        // Simulate a function declaration with the same name
        Node functionName = new Node(Token.NAME, "MyFunction");
        Node functionBody = new Node(Token.BLOCK);
        Node functionDecl = new Node(Token.FUNCTION, functionName, new Node(Token.PARAM_LIST), functionBody);
        Node functionExprResult = new Node(Token.EXPR_RESULT, functionDecl);
        root.addChildToBack(functionExprResult);

        pass.process(null, root);

        // Should report FUNCTION_NAMESPACE_ERROR
        assertEquals(1, compiler.getErrorCount());
        assertEquals(2, root.getChildCount()); // Both the provide replacement and the function should remain.
    }
}
