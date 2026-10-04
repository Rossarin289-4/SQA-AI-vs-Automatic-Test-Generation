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

    private ProcessClosurePrimitives createPass(AbstractCompiler compiler) {
        return new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
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





