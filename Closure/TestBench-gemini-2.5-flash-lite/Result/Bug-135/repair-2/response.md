```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.DefinitionsRemover.Definition;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Collection;
import java.util.List;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Collections;
import java.util.Set;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.PassConfig;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Var;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.SimpleDefinitionFinder;
import com.google.javascript.jscomp.DefinitionSite;
import com.google.javascript.jscomp.Definition;
import com.google.javascript.jscomp.UseSite;
import com.google.javascript.jscomp.JSModule;

public class DevirtualizePrototypeMethodsTest {

    // Mock AbstractCompiler for testing purposes
    private static class MockAbstractCompiler implements AbstractCompiler {
        private final JSTypeRegistry typeRegistry = new JSTypeRegistry(null);
        private final CodingConvention codingConvention = new GoogleCodingConvention();
        private final JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[0]);
        private int changeCount = 0;
        private CompilerOptions options = new CompilerOptions();

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return codingConvention;
        }

        @Override
        public JSModuleGraph getModuleGraph() {
            return moduleGraph;
        }

        @Override
        public void reportCodeChange() {
            changeCount++;
        }

        @Override
        public int getChangeCount() {
            return changeCount;
        }

        @Override
        public CompilerOptions getOptions() {
            return options;
        }

        @Override
        public void init(CompilerOptions options) { this.options = options; }
        @Override public void init(SourceFile... externs) {}
        @Override public SourceFile[] getSourceFiles() { return null;}
        @Override public SourceFile[] getExterns() { return null;}
        @Override public void parse(String code) {}
        @Override public Node parse(String code, String filename, CompilerInput input) { return null; }
        @Override public Node parseInputs() { return null; }
        @Override public void setErrorManager(ErrorManager errorManager) {}
        @Override public ErrorManager getErrorManager() { return null;}
        @Override public void process(Node externs, Node root) {}
        @Override public Node getRoot() { return null; }
        @Override public Node getExternsRoot() { return null; }
        @Override public boolean hasErrors() { return false;}
        @Override public void reassessEdges(NodeTraversal traversal) {}
        @Override public void updateGlobalVarReferences(NodeTraversal traversal, Var var) {}
        @Override public String getSourcePath(Node n) { return null; }
        @Override public void setSourcePath(Node n, String path) {}
        @Override public void setProgress(String progress) {}
        @Override public void setNormalized() {}
        @Override public boolean hasNormalized() { return false;}
        @Override public PassConfig getPassConfig() { return null;}
        @Override public void normalize() {}
        @Override public void processDefines() {}
        @Override public String getAstDotGraph() { return null;}
        @Override public void addChanged(Node n) {}
        @Override public void process(Node node) {}
        @Override public JSTypeRegistry getJSTypeRegistry() { return typeRegistry; }
        @Override public LanguageMode getLanguageMode() { return LanguageMode.ECMASCRIPT3; }
    }

    // Mock classes for SimpleDefinitionFinder
    private static class MockDefinitionSite extends DefinitionSite {
        public MockDefinitionSite(Definition definition, JSModule module, boolean inExterns, boolean inGlobalScope, Node node) {
            super(definition, module, inExterns, inGlobalScope, node);
        }
    }

    private static class MockDefinition implements Definition {
        private final Node rValue;
        private final Node lValue;

        MockDefinition(Node rValue, Node lValue) {
            this.rValue = rValue;
            this.lValue = lValue;
        }

        @Override public Node getRValue() { return rValue; }
        @Override public Node getLValue() { return lValue; }
        @Override public String getName() { return lValue != null && lValue.isGetProp() ? lValue.getLastChild().getString() : null; }
        @Override public boolean isAssigned() { return true; }
        @Override public boolean isParameter() { return false; }
        @Override public boolean isThis() { return false; }
        @Override public boolean isLocal() { return false; }
        @Override public boolean isDeclaration() { return true; }
        @Override public boolean isUnknown() { return false; }
    }

    private static class MockUseSite implements UseSite {
        final Node node;
        final JSModule module;
        MockUseSite(Node node, JSModule module) { this.node = node; this.module = module; }
    }

    private static class MockSimpleDefinitionFinder extends SimpleDefinitionFinder {
        private final Collection<DefinitionSite> definitionSites = Lists.newArrayList();
        private final java.util.Map<Node, Collection<Definition>> definitionsReferencedAtMap = new java.util.HashMap<>();
        private final java.util.Map<Definition, Collection<UseSite>> definitionUseSitesMap = new java.util.HashMap<>();

        MockSimpleDefinitionFinder(AbstractCompiler compiler) {
            super(compiler);
        }

        void addDefinitionSite(DefinitionSite ds) { definitionSites.add(ds); }
        void addDefinitionReference(Node node, Definition def) { definitionsReferencedAtMap.computeIfAbsent(node, k -> new java.util.ArrayList<>()).add(def); }
        void addDefinitionUseSite(Definition def, UseSite us) { definitionUseSitesMap.computeIfAbsent(def, k -> new java.util.ArrayList<>()).add(us); }

        @Override public Collection<DefinitionSite> getDefinitionSites() { return definitionSites; }
        @Override public Collection<UseSite> getUseSites(Definition definition) { return definitionUseSitesMap.getOrDefault(definition, Collections.emptyList()); }
        @Override public Collection<Definition> getDefinitionsReferencedAt(Node node) { return definitionsReferencedAtMap.getOrDefault(node, Collections.emptyList()); }
    }


    private DevirtualizePrototypeMethods createPass(AbstractCompiler compiler) {
        return new DevirtualizePrototypeMethods(compiler);
    }

    @Test
    public void testRewritePrototypeMethodDefinition() throws Exception {
        Node root = new Node(Token.ROOT);
        MockAbstractCompiler compiler = new MockAbstractCompiler();

        Node bValue = new Node(Token.FUNCTION);
        Node bName = Node.newString("b");
        Node bProto = Node.newString("prototype");
        Node aNode = Node.newString("a");
        Node bProp = new Node(Token.GETPROP, new Node(Token.GETPROP, aNode, bProto), bName); // a.prototype.b
        Node exprAssign = new Node(Token.EXPR_ASSIGN, bProp, bValue);
        root.addChildToBack(exprAssign);

        MockSimpleDefinitionFinder defFinder = new MockSimpleDefinitionFinder(compiler);
        Definition definition = new MockDefinition(bValue, bProp);
        DefinitionSite defSite = new MockDefinitionSite(definition, null, false, true, bProp);
        defFinder.addDefinitionSite(defSite);

        defFinder.addDefinitionUseSite(definition, new MockUseSite(bProp, null));
        defFinder.addDefinitionReference(bProp, definition);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.rewriteDefinitionIfEligible(defSite, defFinder);

        Node rootChild = root.getFirstChild();
        assertEquals(Token.VAR, rootChild.getType());
        assertEquals("JSCompiler_StaticMethods_b", rootChild.getFirstChild().getString());

        Node rewrittenFunctionNode = rootChild.getFirstChild().getLastChild();
        assertEquals(Token.FUNCTION, rewrittenFunctionNode.getType());
        assertEquals(1, rewrittenFunctionNode.getChildCount()); // LP node
        assertEquals(1, rewrittenFunctionNode.getFirstChild().getChildCount()); // LP node has one child: the 'self' arg
        assertEquals("JSCompiler_StaticMethods_b$self", rewrittenFunctionNode.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testRewriteCallSite() throws Exception {
        Node root = new Node(Token.ROOT);
        MockAbstractCompiler compiler = new MockAbstractCompiler();

        Node objName = Node.newString("obj");
        Node varObj = new Node(Token.VAR, Node.newString("obj"));
        root.addChildToBack(varObj);

        Node fooProp = new Node(Token.GETPROP, objName, Node.newString("foo"));
        Node callNode = new Node(Token.CALL, fooProp, Node.newString("a"), Node.newString("b"));
        Node exprCall = new Node(Token.EXPR_RESULT, callNode);
        root.addChildToBack(exprCall);

        MockSimpleDefinitionFinder defFinder = new MockSimpleDefinitionFinder(compiler);

        Node fooFuncBody = new Node(Token.FUNCTION);
        Node fooProto = Node.newString("prototype");
        Node FooClass = Node.newString("FooClass");
        Node fooDefLValue = new Node(Token.GETPROP, new Node(Token.GETPROP, FooClass, fooProto), Node.newString("foo"));
        Definition fooDef = new MockDefinition(fooFuncBody, fooDefLValue);
        DefinitionSite fooDefSite = new MockDefinitionSite(fooDef, null, false, true, fooDefLValue);
        defFinder.addDefinitionSite(fooDefSite);
        defFinder.addDefinitionUseSite(fooDef, new MockUseSite(fooProp, null));
        defFinder.addDefinitionReference(fooProp, fooDef);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.rewriteCallSites(defFinder, fooDef, "JSCompiler_StaticMethods_foo");

        Node firstChild = root.getFirstChild();
        assertEquals(Token.VAR, firstChild.getType());
        assertEquals("obj", firstChild.getFirstChild().getString());

        Node secondChild = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, secondChild.getType());
        Node callExpr = secondChild.getFirstChild();
        assertEquals(Token.CALL, callExpr.getType());
        assertEquals("JSCompiler_StaticMethods_foo", callExpr.getFirstChild().getString());
        assertEquals("obj", callExpr.getChildAtIndex(1).getString());
        assertEquals("a", callExpr.getChildAtIndex(2).getString());
        assertEquals("b", callExpr.getChildAtIndex(3).getString());
    }

    @Test
    public void testIsEligibleDefinition_notFunction() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSimpleDefinitionFinder defFinder = new MockSimpleDefinitionFinder(compiler);
        Node nonFunctionRValue = Node.newNumber(1.0);
        Node defLValue = new Node(Token.GETPROP, new Node(Token.GETPROP, Node.newString("A"), Node.newString("prototype")), Node.newString("b"));
        Definition definition = new MockDefinition(nonFunctionRValue, defLValue);
        DefinitionSite defSite = new MockDefinitionSite(definition, null, false, true, defLValue);
        DevirtualizePrototypeMethods pass = createPass(compiler);
        assertFalse(pass.isEligibleDefinition(defFinder, defSite));
    }

    @Test
    public void testIsEligibleDefinition_varArgsFunction() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSimpleDefinitionFinder defFinder = new MockSimpleDefinitionFinder(compiler);
        Node functionNode = new Node(Token.FUNCTION);
        Node lpNode = new Node(Token.LP);
        Node varArgsParam = Node.newString("arg");
        varArgsParam.putBooleanProp(Node.VAR_ARGS_NAME, true);
        lpNode.addChildToBack(varArgsParam);
        functionNode.addChildToBack(lpNode);
        Node defLValue = new Node(Token.GETPROP, new Node(Token.GETPROP, Node.newString("A"), Node.newString("prototype")), Node.newString("b"));
        Definition definition = new MockDefinition(functionNode, defLValue);
        DefinitionSite defSite = new MockDefinitionSite(definition, null, false, true, defLValue);
        DevirtualizePrototypeMethods pass = createPass(compiler);
        assertFalse(pass.isEligibleDefinition(defFinder, defSite));
    }

    @Test
    public void testIsEligibleDefinition_exportedFunction() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler() {
            @Override public CodingConvention getCodingConvention() {
                return new GoogleCodingConvention() {
                    @Override public boolean isExported(String name) {
                        return "b".equals(name);
                    }
                };
            }
        };
        MockSimpleDefinitionFinder defFinder = new MockSimpleDefinitionFinder(compiler);
        Node functionNode = new Node(Token.FUNCTION);
        Node defLValue = new Node(Token.GETPROP, new Node(Token.GETPROP, Node.newString("A"), Node.newString("prototype")), Node.newString("b"));
        Definition definition = new MockDefinition(functionNode, defLValue);
        DefinitionSite defSite = new MockDefinitionSite(definition, null, false, true, defLValue);
        DevirtualizePrototypeMethods pass = createPass(compiler);
        assertFalse(pass.isEligibleDefinition(defFinder, defSite));
    }

    @Test
    public void testIsEligibleDefinition_unusedFunction() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSimpleDefinitionFinder defFinder = new MockSimpleDefinitionFinder(compiler);
        Node functionNode = new Node(Token.FUNCTION);
        Node defLValue = new Node(Token.GETPROP, new Node(Token.GETPROP, Node.newString("A"), Node.newString("prototype")), Node.newString("b"));
        Definition definition = new MockDefinition(functionNode, defLValue);
        DefinitionSite defSite = new MockDefinitionSite(definition, null, false, true, defLValue);
        DevirtualizePrototypeMethods pass = createPass(compiler);
        assertFalse(pass.isEligibleDefinition(defFinder, defSite));
    }

    @Test
    public void testIsEligibleDefinition_propertyAccessedDirectly() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSimpleDefinitionFinder defFinder = new MockSimpleDefinitionFinder(compiler);
        Node functionNode = new Node(Token.FUNCTION);
        Node defLValue = new Node(Token.GETPROP, new Node(Token.GETPROP, Node.newString("A"), Node.newString("prototype")), Node.newString("b"));
        Definition definition = new MockDefinition(functionNode, defLValue);
        DefinitionSite defSite = new MockDefinitionSite(definition, null, false, true, defLValue);
        Node directAccessNode = Node.newString("a.prototype.b");
        defFinder.addDefinitionUseSite(definition, new MockUseSite(directAccessNode, null));
        DevirtualizePrototypeMethods pass = createPass(compiler);
        assertFalse(pass.isEligibleDefinition(defFinder, defSite));
    }

    @Test
    public void testIsEligibleDefinition_multipleDefinitions() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        MockSimpleDefinitionFinder defFinder = new MockSimpleDefinitionFinder(compiler);
        Node functionNode = new Node(Token.FUNCTION);
        Node defLValue = new Node(Token.GETPROP, new Node(Token.GETPROP, Node.newString("A"), Node.newString("prototype")), Node.newString("b"));
        Definition definition1 = new MockDefinition(functionNode, defLValue);
        DefinitionSite defSite1 = new MockDefinitionSite(definition1, null, false, true, defLValue);
        defFinder.addDefinitionSite(defSite1);
        defFinder.addDefinitionReference(defLValue, definition1);
        defFinder.addDefinitionReference(defLValue, new MockDefinition(new Node(Token.FUNCTION), defLValue));
        defFinder.addDefinitionUseSite(definition1, new MockUseSite(defLValue, null));
        DevirtualizePrototypeMethods pass = createPass(compiler);
        assertFalse(pass.isEligibleDefinition(defFinder, defSite1));
    }

    @Test
    public void testRewriteDefinition_basic() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Node methodProtoProp = new Node(Token.GETPROP, new Node(Token.GETPROP, Node.newString("someObject"), Node.newString("prototype")), Node.newString("methodName"));
        Node functionBody = new Node(Token.FUNCTION);
        Node exprAssign = new Node(Token.EXPR_ASSIGN, methodProtoProp, functionBody);
        Node block = new Node(Token.BLOCK, exprAssign);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.rewriteDefinition(methodProtoProp, "JSCompiler_StaticMethods_methodName");

        assertEquals(Token.VAR, block.getFirstChild().getType());
        Node rewrittenFunction = block.getFirstChild().getLastChild().getLastChild();
        assertEquals(Token.FUNCTION, rewrittenFunction.getType());
        assertEquals(1, rewrittenFunction.getFirstChild().getChildCount());
        assertEquals("JSCompiler_StaticMethods_methodName$self", rewrittenFunction.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testRewriteDefinition_withParams() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Node originalFunction = new Node(Token.FUNCTION);
        Node lpNode = new Node(Token.LP);
        lpNode.addChildToBack(Node.newString("param1"));
        lpNode.addChildToBack(Node.newString("param2"));
        originalFunction.addChildToBack(lpNode);
        originalFunction.addChildToBack(new Node(Token.BLOCK));

        Node methodProtoProp = new Node(Token.GETPROP, new Node(Token.GETPROP, Node.newString("someObject"), Node.newString("prototype")), Node.newString("methodName"));
        Node exprAssign = new Node(Token.EXPR_ASSIGN, methodProtoProp, originalFunction);
        Node block = new Node(Token.BLOCK, exprAssign);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.rewriteDefinition(methodProtoProp, "JSCompiler_StaticMethods_methodName");

        Node rewrittenFunction = block.getFirstChild().getLastChild().getLastChild();
        Node params = rewrittenFunction.getFirstChild();
        assertEquals(3, params.getChildCount());
        assertEquals("JSCompiler_StaticMethods_methodName$self", params.getChildAtIndex(0).getString());
        assertEquals("param1", params.getChildAtIndex(1).getString());
        assertEquals("param2", params.getChildAtIndex(2).getString());
    }

    @Test
    public void testReplaceReferencesToThis_simple() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Node body = new Node(Token.BLOCK);
        Node thisNode = new Node(Token.THIS);
        body.addChildToBack(thisNode);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.replaceReferencesToThis(body, "newThis");

        assertEquals(Token.NAME, body.getFirstChild().getType());
        assertEquals("newThis", body.getFirstChild().getString());
    }

    @Test
    public void testReplaceReferencesToThis_nested() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Node body = new Node(Token.BLOCK);
        Node expr1 = new Node(Token.EXPR_RESULT, new Node(Token.THIS));
        Node expr2 = new Node(Token.EXPR_RESULT, new Node(Token.THIS));
        body.addChildToBack(expr1);
        body.addChildToBack(expr2);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.replaceReferencesToThis(body, "newThis");

        assertEquals("newThis", body.getChildAtIndex(0).getFirstChild().getString());
        assertEquals("newThis", body.getChildAtIndex(1).getFirstChild().getString());
    }

    @Test
    public void testReplaceReferencesToThis_ignoresFunction() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Node body = new Node(Token.BLOCK);
        Node functionNode = new Node(Token.FUNCTION);
        Node innerThis = new Node(Token.THIS);
        functionNode.addChildToBack(new Node(Token.LP));
        functionNode.addChildToBack(new Node(Token.BLOCK, innerThis));
        body.addChildToBack(functionNode);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.replaceReferencesToThis(body, "newThis");

        assertEquals(Token.FUNCTION, body.getFirstChild().getType());
        assertEquals(Token.THIS, body.getFirstChild().getLastChild().getFirstChild().getType());
    }

    @Test
    public void testGetRewrittenMethodName() {
        DevirtualizePrototypeMethods pass = createPass(new MockAbstractCompiler());
        assertEquals("JSCompiler_StaticMethods_originalName", pass.getRewrittenMethodName("originalName"));
    }

    @Test
    public void testIsCall_true() {
        Node nameNode = Node.newString("func");
        Node callNode = new Node(Token.CALL, nameNode);
        assertTrue(DevirtualizePrototypeMethods.isCall(new UseSite(nameNode, null)));
    }

    @Test
    public void testIsCall_false_notCallParent() {
        Node nameNode = Node.newString("func");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);
        assertFalse(DevirtualizePrototypeMethods.isCall(new UseSite(nameNode, null)));
    }

    @Test
    public void testIsCall_false_notFirstChild() {
        Node nameNode = Node.newString("func");
        Node arg1 = Node.newString("arg1");
        Node callNode = new Node(Token.CALL, arg1, nameNode);
        assertFalse(DevirtualizePrototypeMethods.isCall(new UseSite(nameNode, null)));
    }

    @Test
    public void testIsPrototypeMethodDefinition_true() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString("method");
        Node protoNode = Node.newString("prototype");
        Node objectNameNode = Node.newString("MyObject");
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.GETPROP, objectNameNode, protoNode), nameNode);
        Node exprAssignNode = new Node(Token.EXPR_ASSIGN, getPropNode, functionNode);
        assertTrue(DevirtualizePrototypeMethods.isPrototypeMethodDefinition(getPropNode));
    }

    @Test
    public void testIsPrototypeMethodDefinition_false_notGetProp() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString("method");
        Node exprAssignNode = new Node(Token.EXPR_ASSIGN, nameNode, functionNode);
        assertFalse(DevirtualizePrototypeMethods.isPrototypeMethodDefinition(nameNode));
    }

    @Test
    public void testIsPrototypeMethodDefinition_false_notExprAssign() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString("method");
        Node protoNode = Node.newString("prototype");
        Node objectNameNode = Node.newString("MyObject");
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.GETPROP, objectNameNode, protoNode), nameNode);
        Node exprAssignNode = new Node(Token.EXPR_ASSIGN, functionNode, getPropNode);
        assertFalse(DevirtualizePrototypeMethods.isPrototypeMethodDefinition(getPropNode));
    }

    @Test
    public void testIsPrototypeMethodDefinition_false_functionNotLastChild() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString("method");
        Node protoNode = Node.newString("prototype");
        Node objectNameNode = Node.newString("MyObject");
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.GETPROP, objectNameNode, protoNode), nameNode);
        Node exprAssignNode = new Node(Token.EXPR_ASSIGN, functionNode, getPropNode);
        assertFalse(DevirtualizePrototypeMethods.isPrototypeMethodDefinition(getPropNode));
    }

    @Test
    public void testIsPrototypeMethodDefinition_false_notPrototype() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString("method");
        Node propNode = Node.newString("property");
        Node objectNameNode = Node.newString("MyObject");
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.GETPROP, objectNameNode, propNode), nameNode);
        Node exprAssignNode = new Node(Token.EXPR_ASSIGN, getPropNode, functionNode);
        assertFalse(DevirtualizePrototypeMethods.isPrototypeMethodDefinition(getPropNode));
    }

    @Test
    public void testRewriteCallSites_multipleCalls() throws Exception {
        Node root = new Node(Token.ROOT);
        MockAbstractCompiler compiler = new MockAbstractCompiler();

        Node objName = Node.newString("obj");
        Node fooProp1 = new Node(Token.GETPROP, objName, Node.newString("foo"));
        Node callNode1 = new Node(Token.CALL, fooProp1, Node.newString("a"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, callNode1));

        Node fooProp2 = new Node(Token.GETPROP, objName, Node.newString("foo"));
        Node callNode2 = new Node(Token.CALL, fooProp2, Node.newString("b"));
        root.addChildToBack(new Node(Token.EXPR_RESULT, callNode2));

        MockSimpleDefinitionFinder defFinder = new MockSimpleDefinitionFinder(compiler);

        Node fooFuncBody = new Node(Token.FUNCTION);
        Node fooProto = Node.newString("prototype");
        Node FooClass = Node.newString("FooClass");
        Node fooDefLValue = new Node(Token.GETPROP, new Node(Token.GETPROP, FooClass, fooProto), Node.newString("foo"));
        Definition fooDef = new MockDefinition(fooFuncBody, fooDefLValue);
        DefinitionSite fooDefSite = new MockDefinitionSite(fooDef, null, false, true, fooDefLValue);
        defFinder.addDefinitionSite(fooDefSite);

        defFinder.addDefinitionUseSite(fooDef, new MockUseSite(fooProp1, null));
        defFinder.addDefinitionUseSite(fooDef, new MockUseSite(fooProp2, null));
        defFinder.addDefinitionReference(fooProp1, fooDef);
        defFinder.addDefinitionReference(fooProp2, fooDef);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.rewriteCallSites(defFinder, fooDef, "JSCompiler_StaticMethods_foo");

        Node firstExpr = root.getFirstChild();
        assertEquals(Token.EXPR_RESULT, firstExpr.getType());
        Node firstCall = firstExpr.getFirstChild();
        assertEquals(Token.CALL, firstCall.getType());
        assertEquals("JSCompiler_StaticMethods_foo", firstCall.getFirstChild().getString());
        assertEquals("obj", firstCall.getChildAtIndex(1).getString());
        assertEquals("a", firstCall.getChildAtIndex(2).getString());

        Node secondExpr = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, secondExpr.getType());
        Node secondCall = secondExpr.getFirstChild();
        assertEquals(Token.CALL, secondCall.getType());
        assertEquals("JSCompiler_StaticMethods_foo", secondCall.getFirstChild().getString());
        assertEquals("obj", secondCall.getChildAtIndex(1).getString());
        assertEquals("b", secondCall.getChildAtIndex(2).getString());
    }

    @Test
    public void testFixFunctionType_basic() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();

        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

        Node param1 = Node.newString("param1");
        param1.setJSType(stringType);
        Node param2 = Node.newString("param2");
        param2.setJSType(numberType);
        Node lp = new Node(Token.LP, param1, param2);

        FunctionType originalType = new FunctionType(registry, "myFunc", null, lp, booleanType);
        originalType.setTypeOfThis(registry.getNativeType(JSTypeNative.OBJECT_TYPE));

        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(originalType);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.fixFunctionType(functionNode);

        FunctionType rewrittenType = (FunctionType) functionNode.getJSType();

        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), rewrittenType.getTypeOfThis());
        Node paramsNode = rewrittenType.getParametersNode();
        assertEquals(3, paramsNode.getChildCount());
        assertEquals("JSCompiler_StaticMethods_myFunc$self", paramsNode.getChildAtIndex(0).getString());
        assertEquals(stringType, paramsNode.getChildAtIndex(1).getJSType());
        assertEquals(numberType, paramsNode.getChildAtIndex(2).getJSType());
        assertEquals(booleanType, rewrittenType.getReturnType());
    }

    @Test
    public void testFixFunctionType_noParams() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        JSType returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType originalType = new FunctionType(registry, "myFunc", null, null, returnType);
        originalType.setTypeOfThis(registry.getNativeType(JSTypeNative.OBJECT_TYPE));

        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(originalType);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.fixFunctionType(functionNode);

        FunctionType rewrittenType = (FunctionType) functionNode.getJSType();

        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), rewrittenType.getTypeOfThis());
        Node paramsNode = rewrittenType.getParametersNode();
        assertEquals(1, paramsNode.getChildCount());
        assertEquals("JSCompiler_StaticMethods_myFunc$self", paramsNode.getFirstChild().getString());
        assertEquals(returnType, rewrittenType.getReturnType());
    }

    @Test
    public void testFixFunctionType_nullThis() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        JSType returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType originalType = new FunctionType(registry, "myFunc", null, null, returnType, null);

        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(originalType);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.fixFunctionType(functionNode);

        FunctionType rewrittenType = (FunctionType) functionNode.getJSType();

        Node paramsNode = rewrittenType.getParametersNode();
        assertEquals(1, paramsNode.getChildCount());
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), paramsNode.getFirstChild().getJSType());
    }

    @Test
    public void testFixFunctionType_constructorWithPrototype() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        ObjectType proto = registry.createObjectType("MyProto");

        FunctionType originalType = new FunctionType(registry, "MyConstructor", null, null, registry.getNativeType(JSTypeNative.VOID_TYPE), null, null, true, false);
        originalType.setPrototype(new FunctionPrototypeType(registry, originalType, proto));

        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(originalType);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.fixFunctionType(functionNode);

        FunctionType rewrittenType = (FunctionType) functionNode.getJSType();
        assertEquals(originalType.getInstanceType(), rewrittenType.getTypeOfThis());
        assertEquals(proto, rewrittenType.getPrototype());
    }

    @Test
    public void testIsInstanceType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        assertFalse(new FunctionType(registry, "test", null).isInstanceType());
        assertTrue(registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE).isInstanceType());
    }

    @Test
    public void testIsConstructor() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType constructorFunc = new FunctionType(registry, "test", null, null, null, null, null, true, false);
        assertTrue(constructorFunc.isConstructor());
        FunctionType ordinaryFunc = new FunctionType(registry, "test", null);
        assertTrue(ordinaryFunc.isOrdinaryFunction());
        assertFalse(ordinaryFunc.isConstructor());
    }

    @Test
    public void testIsInterface() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType interfaceFunc = new FunctionType(registry, "TestInterface", null);
        interfaceFunc.kind = FunctionType.Kind.INTERFACE;
        assertTrue(interfaceFunc.isInterface());
    }

    @Test
    public void testIsOrdinaryFunction() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ordinaryFunc = new FunctionType(registry, "test", null);
        assertTrue(ordinaryFunc.isOrdinaryFunction());
    }

    @Test
    public void testIsFunctionType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        assertTrue(new FunctionType(registry, "test", null).isFunctionType());
        assertFalse(registry.getNativeType(JSTypeNative.OBJECT_TYPE).isFunctionType());
    }

    @Test
    public void testCanBeCalled() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        assertTrue(new FunctionType(registry, "test", null).canBeCalled());
    }

    @Test
    public void testGetParameters() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node param1 = Node.newString("p1");
        Node lp = new Node(Token.LP, param1);
        FunctionType ft = new FunctionType(registry, "test", null, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(1, Iterables.size(ft.getParameters()));
        assertEquals(param1, Iterables.get(ft.getParameters(), 0));
    }

    @Test
    public void testGetParametersNode() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node param1 = Node.newString("p1");
        Node lp = new Node(Token.LP, param1);
        FunctionType ft = new FunctionType(registry, "test", null, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(lp, ft.getParametersNode());
    }

    @Test
    public void testGetMinArguments() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node p1 = Node.newString("p1");
        Node p2 = Node.newString("p2");
        p2.setOptionalArg(true);
        Node p3 = Node.newString("p3");
        Node lp = new Node(Token.LP, p1, p2, p3);
        FunctionType ft = new FunctionType(registry, "test", null, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(1, ft.getMinArguments());
    }

    @Test
    public void testGetMaxArguments() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node p1 = Node.newString("p1");
        Node p2 = Node.newString("p2");
        p2.setOptionalArg(true);
        Node lp = new Node(Token.LP, p1, p2);
        FunctionType ft = new FunctionType(registry, "test", null, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(2, ft.getMaxArguments());

        Node p3 = Node.newString("p3");
        p3.setVarArgs(true);
        Node lpVarArgs = new Node(Token.LP, p1, p3);
        FunctionType ftVarArgs = new FunctionType(registry, "testVarArgs", null, lpVarArgs, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(Integer.MAX_VALUE, ftVarArgs.getMaxArguments());
    }

    @Test
    public void testGetReturnType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        JSType expectedReturnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        FunctionType ft = new FunctionType(registry, "test", null, null, expectedReturnType);
        assertEquals(expectedReturnType, ft.getReturnType());
    }

    @Test
    public void testGetPrototype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertNotNull(ft.getPrototype());
        assertEquals(ft.getPrototype(), registry.getNativeType(JSTypeNative.FUNCTION_PROTOTYPE));
    }

    @Test
    public void testSetPrototypeBasedOn() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ObjectType baseProto = registry.createObjectType("BaseProto");
        ft.setPrototypeBasedOn(baseProto);
        assertEquals(baseProto, ft.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testSetPrototype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        FunctionPrototypeType newProto = new FunctionPrototypeType(registry, ft, null);
        assertTrue(ft.setPrototype(newProto));
        assertEquals(newProto, ft.getPrototype());
    }

    @Test
    public void testGetAllImplementedInterfaces() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertTrue(ft.getAllImplementedInterfaces().isEmpty());
    }

    @Test
    public void testGetImplementedInterfaces() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertTrue(ft.getImplementedInterfaces().isEmpty());
    }

    @Test
    public void testSetImplementedInterfaces() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ObjectType iface1 = registry.createObjectType("Iface1");
        ObjectType iface2 = registry.createObjectType("Iface2");
        List<ObjectType> interfaces = Lists.newArrayList(iface1, iface2);
        ft.setImplementedInterfaces(interfaces);
        assertEquals(2, Iterables.size(ft.getImplementedInterfaces()));
        assertTrue(Iterables.contains(ft.getImplementedInterfaces(), iface1));
        assertTrue(Iterables.contains(ft.getImplementedInterfaces(), iface2));
    }

    @Test
    public void testHasProperty() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.defineProperty("testProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, false);
        assertTrue(ft.hasProperty("testProp"));
        assertTrue(ft.hasProperty("prototype"));
        assertFalse(ft.hasProperty("nonExistent"));
    }

    @Test
    public void testHasOwnProperty() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.defineProperty("testProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, false);
        assertTrue(ft.hasOwnProperty("testProp"));
        assertTrue(ft.hasOwnProperty("prototype"));
        assertFalse(ft.hasOwnProperty("nonExistent"));
    }

    @Test
    public void testGetPropertyType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        JSType propType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ft.defineProperty("testProp", propType, false, false);
        assertEquals(propType, ft.getPropertyType("testProp"));
        assertEquals(ft.getPrototype(), ft.getPropertyType("prototype"));
    }

    @Test
    public void testIsPropertyTypeInferred() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.defineProperty("testProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, false);
        assertTrue(ft.isPropertyTypeInferred("testProp"));
        assertTrue(ft.isPropertyTypeInferred("prototype"));
        assertFalse(ft.isPropertyTypeInferred("nonExistent"));
    }

    @Test
    public void testGetLeastSupertype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "func1", null);
        FunctionType ft2 = new FunctionType(registry, "func2", null);
        assertEquals(registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE), ft1.getLeastSupertype(ft2));
    }

    @Test
    public void testGetGreatestSubtype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "func1", null);
        FunctionType ft2 = new FunctionType(registry, "func2", null);
        assertEquals(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), ft1.getGreatestSubtype(ft2));
    }

    @Test
    public void testGetSuperClassConstructor() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertNull(ft.getSuperClassConstructor());
    }

    @Test
    public void testHasUnknownSupertype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertFalse(ft.hasUnknownSupertype());
    }

    @Test
    public void testGetTopMostDefiningType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.defineProperty("testProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, false);
        assertEquals(ft, ft.getTopMostDefiningType("testProp"));
    }

    @Test
    public void testEquals() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "test1", null);
        FunctionType ft2 = new FunctionType(registry, "test2", null);
        FunctionType ft3 = new FunctionType(registry, "test1", null);
        assertEquals(ft1, ft1);
        assertNotEquals(ft1, ft2);
        assertEquals(ft1, ft3);
    }

    @Test
    public void testHashCode() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "test1", null);
        FunctionType ft2 = new FunctionType(registry, "test2", null);
        FunctionType ft3 = new FunctionType(registry, "test1", null);
        assertEquals(ft1.hashCode(), ft1.hashCode());
        assertNotEquals(ft1.hashCode(), ft2.hashCode());
        assertEquals(ft1.hashCode(), ft3.hashCode());
    }

    @Test
    public void testHasEqualCallType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "test1", null, null, registry.getNativeType(JSTypeNative.STRING_TYPE));
        FunctionType ft2 = new FunctionType(registry, "test2", null, null, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType ft3 = new FunctionType(registry, "test3", null, null, registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(ft1.hasEqualCallType(ft3));
        assertFalse(ft1.hasEqualCallType(ft2));
    }

    @Test
    public void testToString() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null, null, registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(ft.toString().contains("function ("));
        assertTrue(ft.toString().contains(": string"));
    }

    @Test
    public void testIsSubtype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "func1", null);
        FunctionType ft2 = new FunctionType(registry, "func2", null);
        assertTrue(ft1.isSubtype(ft1));
        assertTrue(ft1.isSubtype(registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)));
    }

    @Test
    public void testVisit() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        class MockVisitor implements FunctionType.Visitor<Boolean> {
            @Override
            public Boolean caseFunctionType(FunctionType type) {
                return true;
            }
        }
        assertTrue(ft.visit(new MockVisitor()));
    }

    @Test
    public void testGetInstanceType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertEquals(ft.getTypeOfThis(), ft.getInstanceType());
    }

    @Test
    public void testHasInstanceType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertTrue(ft.hasInstanceType());
    }

    @Test
    public void testGetTypeOfThis() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        ObjectType thisType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        FunctionType ft = new FunctionType(registry, "test", null, null, null, thisType);
        assertEquals(thisType, ft.getTypeOfThis());
    }

    @Test
    public void testGetSource() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node sourceNode = new Node(Token.FUNCTION);
        FunctionType ft = new FunctionType(registry, "test", sourceNode);
        assertEquals(sourceNode, ft.getSource());
    }

    @Test
    public void testSetSource() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node sourceNode = new Node(Token.FUNCTION);
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.setSource(sourceNode);
        assertEquals(sourceNode, ft.getSource());
    }

    @Test
    public void testGetSubTypes() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertNull(ft.getSubTypes());
    }

    @Test
    public void testHasCachedValues() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertFalse(ft.hasCachedValues());
        ft.getPrototype();
        assertTrue(ft.hasCachedValues());
    }

    @Test
    public void testGetTemplateTypeName() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null, null, null, null, "T");
        assertEquals("T", ft.getTemplateTypeName());
    }

}
```