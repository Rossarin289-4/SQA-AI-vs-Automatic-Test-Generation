```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProcessClosurePrimitivesTest {

    // Helper method to create a mock compiler.
    private static AbstractCompiler createMockCompiler() {
        return new AbstractCompiler() {
            private JSModuleGraph moduleGraph = null;
            private CssRenamingMap cssRenamingMap = null;
            private TypeRegistry typeRegistry = new TypeRegistry();
            private final CodingConvention codingConvention = new DefaultCodingConvention();

            @Override
            public void report(JSError error) {
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
                return 0;
            }

            @Override
            public void setDiagnosticGroups(DiagnosticGroupSet diagnostics) {}

            @Override
            public void updateGlobalEcmaVersion(int ecmaVersion) {}

            @Override
            public int getEcmaVersion() {
                return 0;
            }

            @Override
            public LineAndColumnEncoder getLineAndColumnEncoder() {
                return null;
            }

            @Override
            public String getPathRelativeToSource(String path) {
                return path;
            }

            @Override
            public Object getParsers() {
                return null;
            }
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
        Node requireCall = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "require")),
                new Node(Token.STRING, "com.example.SomeClass"));
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
        Node provideCall = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "provide")),
                new Node(Token.STRING, "com.example.MyNamespace"));
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
        Node exportCall = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "exportSymbol")),
                new Node(Token.STRING, "MyGlobalVar"));
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
        Node addDepCall = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "addDependency")),
                new Node(Token.STRING, "path/to/file.js"),
                new Node(Token.ARRAYLIT, new Node(Token.STRING, "required.module")));
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
        Node setCssCall = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "setCssNameMapping")),
                objLit);
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
        Node setCssCall = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "setCssNameMapping")),
                invalidArg);
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

        Node baseCall = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "base")),
                new Node(Token.THIS));
        Node constructorBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, baseCall));
        Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "MyClass"), new Node(Token.PARAM_LIST), constructorBody);
        Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "MyClass"), functionNode);
        Node exprResult1 = new Node(Token.EXPR_RESULT, assign);

        Node inheritsCall = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "inherits")),
                new Node(Token.NAME, "MyClass"), new Node(Token.NAME, "BaseClass"));
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

        Node baseCall = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "base")),
                new Node(Token.THIS), new Node(Token.STRING, "methodName"), new Node(Token.NUMBER, 1));
        Node methodNameNode = baseCall.getChildAtIndex(2); // The "methodName" string node
        Node constructorBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, baseCall));

        // Simulate the context of being inside a method named 'methodName'
        Node simulatedMethodDecl = new Node(Token.FUNCTION, new Node(Token.NAME, "methodName"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, baseCall)));
        Node simulatedProtoAccess = new Node(Token.GETPROP, new Node(Token.NAME, "MyClass"), new Node(Token.STRING, "prototype"));
        Node simulatedMethodAccess = new Node(Token.GETPROP, simulatedProtoAccess, new Node(Token.STRING, "methodName"));
        Node simulatedMethodAssign = new Node(Token.ASSIGN, simulatedMethodAccess, simulatedMethodDecl);
        Node simulatedExpr = new Node(Token.EXPR_RESULT, simulatedMethodAssign);
        root.addChildToBack(simulatedExpr);

        // This is a hacky way to make the test work without a full NodeTraversal setup.
        // The actual replacement happens in processBaseClassCall.
        pass.processBaseClassCall(
            new NodeTraversal(compiler, new AbstractPostOrderCallback() {
                @Override
                public void visit(NodeTraversal t, Node n, Node parent) {
                    // This mock traversal is just to provide a context.
                }
                @Override
                public Node getScopeRoot() {
                    // Simulate being inside a method declaration.
                    // The name needs to be fully qualified to match the logic in getEnclosingDeclNameNode
                    Node func = new Node(Token.FUNCTION, new Node(Token.GETPROP, new Node(Token.GETPROP, new Node(Token.NAME, "MyClass"), new Node(Token.STRING, "prototype")), new Node(Token.STRING, "methodName")));
                    return func;
                }
            }),
            baseCall
        );


        // The goog.base call should be replaced by MyClass.superClass_.methodName.call(this, ...)
        // The qualified name is formed by the logic in processBaseClassCall, which uses getEnclosingDeclNameNode.
        // For the test to pass, we need to ensure getEnclosingDeclNameNode returns the correct qualified name.
        // The simulatedMethodDecl above attempts this by naming the function 'methodName' directly.
        // However, the logic in getEnclosingDeclNameNode looks at the parent.
        // Let's adjust the simulation to better reflect the structure.

        // Create a proper nested structure for getEnclosingDeclNameNode to parse.
        Node methodFunctionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "methodName"));
        Node prototypeProperty = new Node(Token.GETPROP, new Node(Token.NAME, "MyClass"), new Node(Token.STRING, "prototype"));
        Node methodOnPrototype = new Node(Token.GETPROP, prototypeProperty, new Node(Token.STRING, "methodName"));
        Node assignmentToPrototypeMethod = new Node(Token.ASSIGN, methodOnPrototype, methodFunctionNode);
        Node exprStatement = new Node(Token.EXPR_RESULT, assignmentToPrototypeMethod);
        root.addChildToBack(exprStatement);

        // Now, modify the baseCall to be inside the methodFunctionNode's body.
        Node methodBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, baseCall));
        methodFunctionNode.addChildToBack(methodBody);

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
        Node originalProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "provide")), new Node(Token.STRING, "MyNamespace")));
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
        Node originalProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "provide")), new Node(Token.STRING, "MyNamespace")));
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
        Node googNowCall = new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "now")));
        Node newDateCall = new Node(Token.NEW, new Node(Token.NAME, "Date"), googNowCall);
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
        Node googNowCall = new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "now")));
        Node dateArg = new Node(Token.NUMBER, 123);
        Node newDateCall = new Node(Token.NEW, new Node(Token.NAME, "Date"), googNowCall, dateArg);
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
        // Expecting an error to be reported, but verifyProvide should return false.
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        assertFalse(pass.verifyProvide(traversal, methodName, arg));
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
        // Expecting an error, but verifyArgument should return false.
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        assertFalse(pass.verifyArgument(traversal, methodName, null, Token.STRING));
    }

    @Test
    public void testVerifyArgumentWrongType() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node methodName = new Node(Token.STRING, "someMethod");
        Node arg = new Node(Token.NUMBER, 123);
        // Expecting an error, but verifyArgument should return false.
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        assertFalse(pass.verifyArgument(traversal, methodName, arg, Token.STRING));
    }

    @Test
    public void testVerifyArgumentTooMany() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node methodName = new Node(Token.STRING, "someMethod");
        Node arg1 = new Node(Token.STRING, "arg1");
        Node arg2 = new Node(Token.STRING, "arg2");
        arg1.setNext(arg2);
        // Expecting an error, but verifyArgument should return false.
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        assertFalse(pass.verifyArgument(traversal, methodName, arg1, Token.STRING));
    }

    @Test
    public void testRegisterAnyProvidedPrefixesSimple() throws Exception {
        AbstractCompiler compiler = createMockCompiler();
        ProcessClosurePrimitives pass = createPass(compiler);
        Node root = new Node(Token.SCRIPT);
        JSModule module = new JSModule("module1");
        compiler.setModuleGraph(new JSModuleGraph(Lists.newArrayList(module)));

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
        compiler.setModuleGraph(new JSModuleGraph(Lists.newArrayList(module)));

        // Pre-register "com"
        Node originalProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "provide")), new Node(Token.STRING, "com")));
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
        compiler.setModuleGraph(new JSModuleGraph(Lists.newArrayList(module)));

        Node explicitProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "provide")), new Node(Token.STRING, "MyNamespace")));
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
        compiler.setModuleGraph(new JSModuleGraph(Lists.newArrayList(module)));

        Node definitionAssign = new Node(Token.ASSIGN, NodeUtil.newQualifiedNameNode("MyNamespace", null, "MyNamespace"), new Node(Token.OBJECTLIT));
        Node definitionExpr = new Node(Token.EXPR_RESULT, definitionAssign);
        root.addChildToBack(definitionExpr);

        Node explicitProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "provide")), new Node(Token.STRING, "MyNamespace")));
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
        compiler.setModuleGraph(new JSModuleGraph(Lists.newArrayList(module)));

        Node explicitProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "provide")), new Node(Token.STRING, "MyNamespace")));
        Node definitionAssign = new Node(Token.ASSIGN, NodeUtil.newQualifiedNameNode("MyNamespace", null, "MyNamespace"), new Node(Token.OBJECTLIT));
        Node definitionExpr = new Node(Token.EXPR_RESULT, definitionAssign);
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
        compiler.setModuleGraph(new JSModuleGraph(Lists.newArrayList(module)));

        Node explicitProvideNode = new Node(Token.EXPR_RESULT, new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), new Node(Token.STRING, "provide")), new Node(Token.STRING, "MyNamespace")));
        Node definitionVar = new Node(Token.VAR, new Node(Token.NAME, "MyNamespace", new Node(Token.OBJECTLIT)));
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
}
```