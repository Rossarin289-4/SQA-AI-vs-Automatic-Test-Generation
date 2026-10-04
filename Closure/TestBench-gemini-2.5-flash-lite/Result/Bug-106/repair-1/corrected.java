package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.ScriptOrFnScope;
import com.google.javascript.rhino.jstype.StaticSlot;

public class GlobalNamespaceTest {
    // Helper to create a mock Compiler and NodeTraversal
    private AbstractCompiler compiler = new AbstractCompiler() {
        @Override public void report(DiagnosticType diagnosticType, Node node, String... arguments) { }
        @Override public void report(Node node, DiagnosticType diagnosticType, String... arguments) { }
        @Override public void setProgress(String progress) { }
        @Override public void setNodeCount(int nodeCount) { }
        @Override public int getNodeCount() { return 0; }
        @Override public boolean shouldReport(DiagnosticType diagnosticType) { return true; }
        @Override public boolean abortOnViolation() { return false; }
        @Override public TypeChecker getTypeChecker() { return null; }
        @Override public boolean isNormalized() { return false; }
        @Override public boolean isTypeCheckingEnabled() { return false; }
        @Override public boolean areWarningsEnabled() { return false; }
        @Override public void enableTypeChecking(boolean enable) { }
        @Override public void enableComments(boolean enable) { }
        @Override public void reassessCode(String flag) { }
        @Override public String getAstDotGraph() { return null; }
        @Override public void processDefines() { }
        @Override public boolean parse() { return false; }
        @Override public void parse(SourceFile sourceFile) { }
        @Override public void parse(SourceFile externs, SourceFile source) { }
        @Override public void parse(List<SourceFile> externs, List<SourceFile> sources) { }
        @Override public Node getRoot() { return null; }
        @Override public Node getExternsRoot() { return null; }
        @Override public void setExterns(Node externs) { }
        @Override public boolean isIdeMode() { return false; }
        @Override public void setIdeMode(boolean ideMode) { }
        @Override public void removeClosureExterns() { }
        @Override public void prepareCodeChangingTraversal() { }
        @Override public void process(String flag) { }
        @Override public void process(CompilerPass pass) { }
        @Override public void process(String flag, CompilerPass pass) { }
        @Override public void validate() { }
        @Override public void normalize() { }
        @Override public void normalize(Phase phase) { }
        @Override public void optimize() { }
        @Override public void collectWarnings() { }
        @Override public void setErrorManager(ErrorManager errorManager) { }
        @Override public ErrorManager getErrorManager() { return null; }
        @Override public String getSourceLine(Node n, String sourceName) { return null; }
        @Override public String getSourceName() { return null; }
        @Override public void setProgress(int progress) { }
        @Override public void setProgress(int progress, int total) { }
        @Override public void setProgress(int progress, int total, String message) { }
        @Override public void incrementExternChanges() { }
        @Override public int getExternChanges() { return 0;}
    };

    // Mock NodeTraversal with a dummy Node
    private NodeTraversal mockTraversal(Node node) {
        return new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
                // Do nothing
            }
        }) {
            @Override
            public Node getCurrentNode() {
                return node;
            }
            @Override
            public Scope getScope() {
                // Return a dummy global scope
                return new Scope(null, compiler);
            }
            @Override
            public String getSourceName() {
                return "test.js";
            }
        };
    }

    @Test
    public void testGetNameForest() throws Exception {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        assertEquals(0, ns.getNameForest().size());
    }

    @Test
    public void testGetNameIndex() throws Exception {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        assertEquals(0, ns.getNameIndex().size());
    }

    @Test
    public void testProcessGlobalVariableDeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(Node.newVar("a", Node.newNumber(1)));
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(1, ns.getNameIndex().size());
        assertTrue(ns.getNameIndex().containsKey("a"));
        assertEquals("a", ns.getNameIndex().get("a").name);
        assertEquals(1, ns.getNameIndex().get("a").globalSets);
    }

    @Test
    public void testProcessGlobalVariableDeclarationWithExterns() throws Exception {
        Node externsRoot = new Node(Token.SCRIPT);
        externsRoot.addChildToBack(Node.newVar("b", Node.newNumber(2)));
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(Node.newVar("a", Node.newNumber(1)));
        GlobalNamespace ns = new GlobalNamespace(compiler, externsRoot, root);
        ns.getNameForest(); // Trigger process
        assertEquals(2, ns.getNameIndex().size());
        assertTrue(ns.getNameIndex().containsKey("a"));
        assertTrue(ns.getNameIndex().containsKey("b"));
        assertEquals(1, ns.getNameIndex().get("a").globalSets);
        assertEquals(0, ns.getNameIndex().get("b").globalSets); // externs are not sets
    }

    @Test
    public void testProcessGlobalAssignment() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node varA = Node.newVar("a");
        root.addChildToBack(varA);
        Node assign = new Node(Token.ASSIGN,
                               Node.newName("a"),
                               Node.newNumber(1));
        root.addChildToBack(assign);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(1, ns.getNameIndex().size());
        assertTrue(ns.getNameIndex().containsKey("a"));
        assertEquals(1, ns.getNameIndex().get("a").globalSets);
    }

    @Test
    public void testProcessGlobalPropertyAssignment() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN,
                               new Node(Token.GETPROP,
                                        Node.newString("a"),
                                        Node.newString("b")),
                               Node.newNumber(1));
        root.addChildToBack(assign);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(2, ns.getNameIndex().size()); // a and a.b
        assertTrue(ns.getNameIndex().containsKey("a"));
        assertTrue(ns.getNameIndex().containsKey("a.b"));
        assertEquals(0, ns.getNameIndex().get("a").globalSets);
        assertEquals(1, ns.getNameIndex().get("a.b").globalSets);
    }

    @Test
    public void testProcessNestedGlobalPropertyAssignment() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN,
                               new Node(Token.GETPROP,
                                        new Node(Token.GETPROP,
                                                 Node.newString("a"),
                                                 Node.newString("b")),
                                        Node.newString("c")),
                               Node.newNumber(1));
        root.addChildToBack(assign);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(3, ns.getNameIndex().size()); // a, a.b, a.b.c
        assertTrue(ns.getNameIndex().containsKey("a"));
        assertTrue(ns.getNameIndex().containsKey("a.b"));
        assertTrue(ns.getNameIndex().containsKey("a.b.c"));
        assertEquals(0, ns.getNameIndex().get("a").globalSets);
        assertEquals(0, ns.getNameIndex().get("a.b").globalSets);
        assertEquals(1, ns.getNameIndex().get("a.b.c").globalSets);
    }

    @Test
    public void testProcessGlobalNameGet() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node var = Node.newVar("a", Node.newNumber(1));
        root.addChildToBack(var);
        root.addChildToBack(new Node(Token.GETPROP, Node.newName("a"), Node.newString("b")));
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(1, ns.getNameIndex().size()); // Only "a" is declared
        assertEquals(1, ns.getNameIndex().get("a").globalSets);
        assertEquals(1, ns.getNameIndex().get("a").totalGets);
    }

    @Test
    public void testProcessGlobalQualifiedNameGet() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN,
                               new Node(Token.GETPROP,
                                        Node.newString("a"),
                                        Node.newString("b")),
                               Node.newNumber(1));
        root.addChildToBack(assign);
        root.addChildToBack(new Node(Token.GETPROP,
                                    new Node(Token.GETPROP,
                                             Node.newString("a"),
                                             Node.newString("b")),
                                    Node.newString("c")));
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(3, ns.getNameIndex().size()); // a, a.b, a.b.c
        assertEquals(1, ns.getNameIndex().get("a.b.c").globalSets);
        assertEquals(1, ns.getNameIndex().get("a.b").totalGets); // a.b is read
    }

    @Test
    public void testProcessObjectLiteralKeys() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node objectLit = new Node(Token.OBJECTLIT);
        objectLit.addChildToBack(Node.newString("a"));
        objectLit.addChildToBack(Node.newNumber(1));
        objectLit.addChildToBack(Node.newString("b"));
        objectLit.addChildToBack(Node.newNumber(2));
        root.addChildToBack(Node.newVar("obj", objectLit));

        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(3, ns.getNameIndex().size()); // obj, obj.a, obj.b
        assertTrue(ns.getNameIndex().containsKey("obj"));
        assertTrue(ns.getNameIndex().containsKey("obj.a"));
        assertTrue(ns.getNameIndex().containsKey("obj.b"));
        assertEquals(1, ns.getNameIndex().get("obj").globalSets);
        assertEquals(1, ns.getNameIndex().get("obj.a").globalSets);
        assertEquals(1, ns.getNameIndex().get("obj.b").globalSets);
    }

    @Test
    public void testProcessObjectLiteralKeysNested() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node innerObjLit = new Node(Token.OBJECTLIT);
        innerObjLit.addChildToBack(Node.newString("c"));
        innerObjLit.addChildToBack(Node.newNumber(3));

        Node outerObjLit = new Node(Token.OBJECTLIT);
        outerObjLit.addChildToBack(Node.newString("a"));
        outerObjLit.addChildToBack(Node.newNumber(1));
        outerObjLit.addChildToBack(Node.newString("b"));
        outerObjLit.addChildToBack(innerObjLit);
        root.addChildToBack(Node.newVar("obj", outerObjLit));

        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(4, ns.getNameIndex().size()); // obj, obj.a, obj.b, obj.b.c
        assertTrue(ns.getNameIndex().containsKey("obj"));
        assertTrue(ns.getNameIndex().containsKey("obj.a"));
        assertTrue(ns.getNameIndex().containsKey("obj.b"));
        assertTrue(ns.getNameIndex().containsKey("obj.b.c"));
        assertEquals(1, ns.getNameIndex().get("obj").globalSets);
        assertEquals(1, ns.getNameIndex().get("obj.a").globalSets);
        assertEquals(1, ns.getNameIndex().get("obj.b").globalSets);
        assertEquals(1, ns.getNameIndex().get("obj.b.c").globalSets);
    }

    @Test
    public void testProcessObjectLiteralKeysInAssignment() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.addChildToBack(Node.newString("a"));
        objLit.addChildToBack(Node.newNumber(1));
        root.addChildToBack(new Node(Token.ASSIGN, Node.newString("obj"), objLit));

        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(2, ns.getNameIndex().size()); // obj, obj.a
        assertTrue(ns.getNameIndex().containsKey("obj"));
        assertTrue(ns.getNameIndex().containsKey("obj.a"));
        assertEquals(1, ns.getNameIndex().get("obj").globalSets);
        assertEquals(1, ns.getNameIndex().get("obj.a").globalSets);
    }

    @Test
    public void testProcessFunctionDeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node function = Node.newFunction("myFunc", null);
        root.addChildToBack(function);

        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(1, ns.getNameIndex().size());
        assertTrue(ns.getNameIndex().containsKey("myFunc"));
        assertEquals(1, ns.getNameIndex().get("myFunc").globalSets);
        assertEquals(Name.Type.FUNCTION, ns.getNameIndex().get("myFunc").type);
    }

    @Test
    public void testProcessAnonymousFunctionDeclaration() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node function = Node.newFunction(null, null); // Anonymous function
        root.addChildToBack(function);

        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(0, ns.getNameIndex().size()); // Anonymous functions are not global names
    }

    @Test
    public void testProcessFunctionExpressionAssignedToGlobal() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node functionExpr = Node.newFunction(null, null);
        root.addChildToBack(new Node(Token.ASSIGN, Node.newName("myFunc"), functionExpr));

        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(1, ns.getNameIndex().size());
        assertTrue(ns.getNameIndex().containsKey("myFunc"));
        assertEquals(1, ns.getNameIndex().get("myFunc").globalSets);
        assertEquals(Name.Type.FUNCTION, ns.getNameIndex().get("myFunc").type);
    }

    @Test
    public void testProcessGetPrototype() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node protoAssign = new Node(Token.ASSIGN,
                                    new Node(Token.GETPROP, Node.newString("MyClass"), Node.newString("prototype")),
                                    new Node(Token.OBJECTLIT));
        root.addChildToBack(protoAssign);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest();
        assertEquals(2, ns.getNameIndex().size()); // MyClass, MyClass.prototype
        assertTrue(ns.getNameIndex().containsKey("MyClass"));
        assertTrue(ns.getNameIndex().containsKey("MyClass.prototype"));
        assertEquals(1, ns.getNameIndex().get("MyClass").globalSets);
        assertEquals(1, ns.getNameIndex().get("MyClass.prototype").globalSets);
    }

    @Test
    public void testProcessSetPrototypeProperty() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node protoMethodAssign = new Node(Token.ASSIGN,
                                          new Node(Token.GETPROP,
                                                   new Node(Token.GETPROP, Node.newString("MyClass"), Node.newString("prototype")),
                                                   Node.newString("method")),
                                          Node.newFunction(null, null));
        root.addChildToBack(protoMethodAssign);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest();
        // MyClass, MyClass.prototype, MyClass.prototype.method
        assertEquals(3, ns.getNameIndex().size());
        assertTrue(ns.getNameIndex().containsKey("MyClass"));
        assertTrue(ns.getNameIndex().containsKey("MyClass.prototype"));
        assertTrue(ns.getNameIndex().containsKey("MyClass.prototype.method"));
        assertEquals(0, ns.getNameIndex().get("MyClass").globalSets); // MyClass is not set, only its prototype
        assertEquals(0, ns.getNameIndex().get("MyClass.prototype").globalSets); // MyClass.prototype is not set, only its method
        assertEquals(1, ns.getNameIndex().get("MyClass.prototype.method").globalSets);
    }

    @Test
    public void testHandleSetFromGlobalWithPrototypePrefix() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN,
                               new Node(Token.GETPROP,
                                        new Node(Token.GETPROP, Node.newString("MyClass"), Node.newString("prototype")),
                                        Node.newString("method")),
                               Node.newFunction(null, null));
        root.addChildToBack(assign);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(3, ns.getNameIndex().size());
        Name method = ns.getNameIndex().get("MyClass.prototype.method");
        assertNotNull(method);
        assertEquals(1, method.globalSets);
        Name proto = ns.getNameIndex().get("MyClass.prototype");
        assertNotNull(proto);
        assertEquals(1, proto.aliasingGets); // Because prototype is a prefix of a set
        Name cls = ns.getNameIndex().get("MyClass");
        assertNotNull(cls);
        assertEquals(1, cls.aliasingGets); // Because MyClass is a prefix of a set
    }

     @Test
    public void testHandleGetWithPrototypePrefix() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN,
                               Node.newName("a"),
                               new Node(Token.GETPROP,
                                        new Node(Token.GETPROP, Node.newString("MyClass"), Node.newString("prototype")),
                                        Node.newString("method")));
        root.addChildToBack(assign);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Trigger process
        assertEquals(3, ns.getNameIndex().size());
        Name method = ns.getNameIndex().get("MyClass.prototype.method");
        assertNotNull(method);
        assertEquals(1, method.globalSets);
        Name proto = ns.getNameIndex().get("MyClass.prototype");
        assertNotNull(proto);
        assertEquals(1, proto.aliasingGets); // Because prototype is a prefix of a get
        Name cls = ns.getNameIndex().get("MyClass");
        assertNotNull(cls);
        assertEquals(1, cls.aliasingGets); // Because MyClass is a prefix of a get
    }

    @Test
    public void testIsGlobalNameReference() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node scopeNode = Node.newFunction(null, null);
        root.addChildToBack(scopeNode);
        Scope scope = new Scope(null, compiler); // Global scope
        scope.declare("globalVar", Node.newName("globalVar"), null, null);

        Scope localScope = new Scope(scope, scopeNode);
        localScope.declare("local", Node.newName("local"), null, null);

        GlobalNamespace ns = new GlobalNamespace(compiler, root);

        // Global scope
        assertTrue(ns.isGlobalNameReference("globalVar", scope));
        // Local scope, global variable
        assertTrue(ns.isGlobalNameReference("globalVar", localScope));
        // Local scope, local variable
        assertFalse(ns.isGlobalNameReference("local", localScope));
    }

    @Test
    public void testIsGlobalVarReference() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node scopeNode = Node.newFunction(null, null);
        root.addChildToBack(scopeNode);
        Scope scope = new Scope(null, compiler); // Global scope
        scope.declare("globalVar", Node.newName("globalVar"), null, null);

        Scope localScope = new Scope(scope, scopeNode);
        localScope.declare("local", Node.newName("local"), null, null);

        GlobalNamespace ns = new GlobalNamespace(compiler, root);

        // Global scope
        assertTrue(ns.isGlobalVarReference("globalVar", scope));
        // Local scope, global variable
        assertTrue(ns.isGlobalVarReference("globalVar", localScope));
        // Local scope, local variable
        assertFalse(ns.isGlobalVarReference("local", localScope));
    }

    @Test
    public void testGetTopVarName() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        assertEquals("a", ns.getTopVarName("a"));
        assertEquals("a", ns.getTopVarName("a.b"));
        assertEquals("a", ns.getTopVarName("a.b.c"));
    }

    @Test
    public void testNameMapPutAndGet() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Name name1 = new Name("test1", null, false);
        ns.nameMap.put("test1", name1);
        assertEquals(name1, ns.nameMap.get("test1"));
    }

    @Test
    public void testGetOrCreateName() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Name name1 = ns.getOrCreateName("a");
        assertNotNull(name1);
        assertEquals("a", name1.name);
        assertTrue(ns.nameMap.containsKey("a"));
        assertEquals(name1, ns.nameMap.get("a"));

        Name name2 = ns.getOrCreateName("a.b");
        assertNotNull(name2);
        assertEquals("b", name2.name);
        assertEquals(name1, name2.parent);
        assertTrue(ns.nameMap.containsKey("a.b"));
        assertEquals(name2, ns.nameMap.get("a.b"));
    }

    @Test
    public void testIsClassOrEnumDeclaration() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Node root = new Node(Token.SCRIPT);

        // Constructor function
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        builder.recordConstructor();
        JSDocInfo info = builder.build("test.js");
        Node functionNode = Node.newFunction("MyClass", null);
        functionNode.setJSDocInfo(info);
        root.addChildToBack(Node.newVar("MyClass", functionNode));
        ns.process(); // Manually trigger process for testing internal methods

        assertTrue(ns.getNameIndex().get("MyClass").isClassOrEnum);
    }

    @Test
    public void testIsClassOrEnumDeclaration_Enum() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Node root = new Node(Token.SCRIPT);

        // Enum object literal
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        // For simplicity, we'll use recordType and assume it's an enum type representation
        JSTypeExpression enumType = new JSTypeExpression(Node.newString("Enum"), "test.js", null);
        builder.recordEnumParameterType(enumType); // Simulating enum annotation
        JSDocInfo info = builder.build("test.js");
        Node enumNode = new Node(Token.OBJECTLIT);
        enumNode.setJSDocInfo(info);
        root.addChildToBack(Node.newVar("MyEnum", enumNode));
        ns.process(); // Manually trigger process for testing internal methods

        assertTrue(ns.getNameIndex().get("MyEnum").isClassOrEnum);
    }

    @Test
    public void testIsNamespace() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Node root = new Node(Token.SCRIPT);

        // Class declaration
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        builder.recordConstructor();
        JSDocInfo info = builder.build("test.js");
        Node classNode = Node.newFunction("MyClass", null);
        classNode.setJSDocInfo(info);
        root.addChildToBack(Node.newVar("MyClass", classNode));

        // Another class declaration within MyClass
        Node subClassNode = Node.newFunction("MySubClass", null);
        subClassNode.setJSDocInfo(info); // Assume it's also a class for simplicity
        Node protoAssign = new Node(Token.ASSIGN,
                                    new Node(Token.GETPROP, Node.newString("MyClass"), Node.newString("prototype")),
                                    new Node(Token.OBJECTLIT));
        // Manually add MySubClass as a property of prototype
        protoAssign.getFirstChild().getParent().addChildToBack(Node.newString("MySubClass"));
        protoAssign.getFirstChild().getParent().getParent().addChildToBack(subClassNode);
        root.addChildToBack(protoAssign);

        ns.process(); // Manually trigger process

        Name myClass = ns.getNameIndex().get("MyClass");
        assertTrue(myClass.isClassOrEnum);
        // To make MyClass a namespace, it needs to be an OBJECTLIT or FUNCTION and have class/enum descendants
        // In this test, it's a FUNCTION and has a class descendant.
        assertTrue(myClass.isNamespace());

        Name mySubClass = ns.getNameIndex().get("MyClass.prototype.MySubClass");
        assertTrue(mySubClass.isClassOrEnum);
        // MySubClass itself isn't an OBJECTLIT or FUNCTION declaration that would make it a namespace.
        assertFalse(mySubClass.isNamespace());
    }

    @Test
    public void testCanCollapse() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Name name = ns.getOrCreateName("a");
        name.globalSets = 1;
        name.localSets = 0;
        name.type = Name.Type.OBJECTLIT;

        // Initially false because canCollapseUnannotatedChildNames requires parent to be collapsable
        assertFalse(name.canCollapse());

        // Make parent collapsable
        Name parentName = ns.getOrCreateName("b");
        parentName.globalSets = 1;
        parentName.localSets = 0;
        parentName.type = Name.Type.OBJECTLIT;
        parentName.props = new ArrayList<>();
        parentName.props.add(name);
        name.parent = parentName;

        // Mock parent's canCollapseUnannotatedChildNames to be true
        parentName.canCollapseUnannotatedChildNames = true;

        assertTrue(name.canCollapse());
    }

    @Test
    public void testCanCollapseUnannotatedChildNames() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Name name = ns.getOrCreateName("a");
        name.globalSets = 1;
        name.localSets = 0;
        name.type = Name.Type.OBJECTLIT;
        name.aliasingGets = 0;
        name.isClassOrEnum = false;

        // Case 1: Valid conditions
        // Mock parent to be collapsable
        name.parent = ns.getOrCreateName("parent");
        name.parent.canCollapseUnannotatedChildNames = true;
        assertTrue(name.canCollapseUnannotatedChildNames());

        // Case 2: If globalSets is not 1, it cannot collapse
        name.globalSets = 2;
        assertFalse(name.canCollapseUnannotatedChildNames());
        name.globalSets = 1;

        // Case 3: If localSets is not 0, it cannot collapse
        name.localSets = 1;
        assertFalse(name.canCollapseUnannotatedChildNames());
        name.localSets = 0;

        // Case 4: If aliasingGets > 0, it cannot collapse
        name.aliasingGets = 1;
        assertFalse(name.canCollapseUnannotatedChildNames());
        name.aliasingGets = 0;

        // Case 5: If it's a class or enum, it can collapse regardless of other conditions
        name.isClassOrEnum = true;
        assertTrue(name.canCollapseUnannotatedChildNames());
    }

    @Test
    public void testCanEliminate() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Name name = ns.getOrCreateName("a");
        name.globalSets = 1;
        name.localSets = 0;
        name.totalGets = 0;
        name.type = Name.Type.OBJECTLIT;
        name.isClassOrEnum = false;

        // Initially false because canCollapseUnannotatedChildNames requires parent to be collapsable
        assertFalse(name.canEliminate());

        // Make parent collapsable
        name.parent = ns.getOrCreateName("parent");
        name.parent.canCollapseUnannotatedChildNames = true;

        assertTrue(name.canEliminate());

        // Test with properties
        Name childProp = ns.getOrCreateName("a.b");
        childProp.globalSets = 1;
        childProp.localSets = 0;
        childProp.totalGets = 0;
        childProp.isClassOrEnum = false;
        childProp.parent = name;
        name.props = new ArrayList<>();
        name.props.add(childProp);

        // Make childProp pass canCollapseUnannotatedChildNames
        childProp.parent = name; // Parent should be the current name
        childProp.parent.canCollapseUnannotatedChildNames = true; // Mock parent

        assertFalse(name.canEliminate()); // Fails because childProp.canCollapse() is false (requires its own parent to be collapsable)
    }

    @Test
    public void testNeedsToBeStubbed() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Name name = ns.getOrCreateName("a");
        name.globalSets = 0;
        name.localSets = 1;
        assertTrue(name.needsToBeStubbed());

        name.localSets = 0;
        assertFalse(name.needsToBeStubbed());
    }

    @Test
    public void testIsSimpleName() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Name name = ns.getOrCreateName("a");
        assertTrue(name.isSimpleName());

        Name qualifiedName = ns.getOrCreateName("a.b");
        assertFalse(qualifiedName.isSimpleName());
    }

    @Test
    public void testFullName() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Name nameA = ns.getOrCreateName("a");
        assertEquals("a", nameA.fullName());

        Name nameAB = ns.getOrCreateName("a.b");
        assertEquals("a.b", nameAB.fullName());

        Name nameABC = ns.getOrCreateName("a.b.c");
        assertEquals("a.b.c", nameABC.fullName());
    }

    @Test
    public void testNameToString() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Name name = ns.getOrCreateName("test");
        name.type = Name.Type.FUNCTION;
        name.globalSets = 1;
        name.localSets = 2;
        name.totalGets = 3;
        name.aliasingGets = 4;
        name.callGets = 5;
        String expected = "test (FUNCTION): globalSets=1, localSets=2, totalGets=3, aliasingGets=4, callGets=5";
        assertEquals(expected, name.toString());
    }

    @Test
    public void testGetDocInfoForDeclaration() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));

        // Simulate a VAR declaration with JSDocInfo
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        builder.recordDescription("Test description");
        JSDocInfo docInfo = builder.build("test.js");

        Node varNode = Node.newVar("testVar", Node.newNumber(1));
        varNode.setJSDocInfo(docInfo);

        Ref varRef = Ref.createRefForTesting(Ref.Type.SET_FROM_GLOBAL);
        varRef.node = varNode.getFirstChild(); // The NAME node for "testVar"
        varRef.sourceName = "test.js";

        JSDocInfo retrievedDocInfo = Name.getDocInfoForDeclaration(varRef);
        assertNotNull(retrievedDocInfo);
        assertTrue(retrievedDocInfo.hasDescription());
        assertEquals("Test description", retrievedDocInfo.getDescription());
    }

    @Test
    public void testRefCreateRefForTesting() {
        Ref ref = Ref.createRefForTesting(Ref.Type.DIRECT_GET);
        assertNotNull(ref);
        assertEquals(Ref.Type.DIRECT_GET, ref.type);
        assertNull(ref.node);
        assertNull(ref.twin);
    }

    @Test
    public void testRefMarkTwins() {
        Ref ref1 = Ref.createRefForTesting(Ref.Type.SET_FROM_GLOBAL);
        Ref ref2 = Ref.createRefForTesting(Ref.Type.ALIASING_GET);
        Ref.markTwins(ref1, ref2);
        assertNotNull(ref1.getTwin());
        assertNotNull(ref2.getTwin());
        assertEquals(ref2, ref1.getTwin());
        assertEquals(ref1, ref2.getTwin());
    }

    @Test
    public void testRefCloneAndReclassify() {
        Ref originalRef = Ref.createRefForTesting(Ref.Type.DIRECT_GET);
        Ref newRef = originalRef.cloneAndReclassify(Ref.Type.CALL_GET);
        assertNotNull(newRef);
        assertEquals(Ref.Type.CALL_GET, newRef.type);
        assertNull(newRef.node); // Original had no node
        assertNull(newRef.twin);
        assertNull(newRef.sourceName);
        assertNull(newRef.scope);
        assertNull(newRef.module);
    }

    // Tests for BuildGlobalNamespace internal methods

    @Test
    public void testBuildGlobalNamespaceApply() throws Exception {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        GlobalNamespace.BuildGlobalNamespace builder = ns.new BuildGlobalNamespace();
        assertTrue(builder.apply(Node.newString("test")));
    }

    @Test
    public void testBuildGlobalNamespaceVisitName() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(Node.newVar("globalVar", Node.newNumber(1)));
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        NodeTraversal t = mockTraversal(Node.newName("globalVar"));
        Node n = Node.newName("globalVar");
        Node parent = new Node(Token.ASSIGN, n, Node.newNumber(2));
        ns.new BuildGlobalNamespace().visit(t, n, parent);
        assertEquals(2, ns.getNameIndex().get("globalVar").globalSets);
    }

    @Test
    public void testBuildGlobalNamespaceVisitNameAsFunction() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node function = Node.newFunction("globalFunc", null);
        root.addChildToBack(function);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        NodeTraversal t = mockTraversal(Node.newName("globalFunc"));
        Node n = Node.newName("globalFunc");
        Node parent = new Node(Token.FUNCTION);
        parent.addChildToBack(n);
        ns.new BuildGlobalNamespace().visit(t, n, parent);
        assertEquals(1, ns.getNameIndex().get("globalFunc").globalSets);
        assertEquals(Name.Type.FUNCTION, ns.getNameIndex().get("globalFunc").type);
    }

    @Test
    public void testBuildGlobalNamespaceVisitGetprop() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN,
                               new Node(Token.GETPROP, Node.newString("a"), Node.newString("b")),
                               Node.newNumber(1));
        root.addChildToBack(assign);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        NodeTraversal t = mockTraversal(new Node(Token.GETPROP, Node.newString("a"), Node.newString("b")));
        Node n = new Node(Token.GETPROP, Node.newString("a"), Node.newString("b"));
        ns.new BuildGlobalNamespace().visit(t, n, new Node(Token.ASSIGN));
        assertEquals(1, ns.getNameIndex().get("a.b").globalSets);
    }

    @Test
    public void testGetNameForObjLitKey() throws Exception {
        Node root = new Node(Token.SCRIPT);
        Node objectLit = new Node(Token.OBJECTLIT);
        objectLit.addChildToBack(Node.newString("key1"));
        objectLit.addChildToBack(Node.newNumber(1));
        objectLit.addChildToBack(Node.newString("key2"));
        objectLit.addChildToBack(Node.newNumber(2));
        root.addChildToBack(Node.newVar("obj", objectLit));

        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        ns.getNameForest(); // Process the AST

        // Test case 1: Simple object literal key
        Node keyNode1 = objectLit.getChildAtIndex(0); // "key1"
        Node parentLit = objectLit;
        assertEquals("obj.key1", ns.new BuildGlobalNamespace().getNameForObjLitKey(keyNode1));

        // Test case 2: Nested object literal key
        Node innerObjLit = new Node(Token.OBJECTLIT);
        innerObjLit.addChildToBack(Node.newString("nestedKey"));
        innerObjLit.addChildToBack(Node.newNumber(3));
        parentLit.addChildToBack(Node.newString("nestedObj"));
        parentLit.addChildToBack(innerObjLit);

        Node nestedKeyNode = innerObjLit.getChildAtIndex(0); // "nestedKey"
        assertEquals("obj.nestedObj.nestedKey", ns.new BuildGlobalNamespace().getNameForObjLitKey(nestedKeyNode));
    }

    @Test
    public void testGetValueType() throws Exception {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Node objectLit = new Node(Token.OBJECTLIT);
        Node functionNode = Node.newFunction(null, null);
        Node orNode = new Node(Token.OR, Node.newNumber(0), Node.newString(""));
        Node hookNode = new Node(Token.HOOK, Node.newNumber(0), Node.newNumber(1), Node.newNumber(2));

        assertEquals(Name.Type.OBJECTLIT, ns.new BuildGlobalNamespace().getValueType(objectLit));
        assertEquals(Name.Type.FUNCTION, ns.new BuildGlobalNamespace().getValueType(functionNode));
        assertEquals(Name.Type.OTHER, ns.new BuildGlobalNamespace().getValueType(orNode)); // OR defaults to last child, which is OTHER here
        assertEquals(Name.Type.OTHER, ns.new BuildGlobalNamespace().getValueType(hookNode)); // HOOK defaults to other if types are other
    }

    @Test
    public void testHandleSetFromGlobal() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(Node.newVar("a", Node.newNumber(1)));
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        NodeTraversal t = mockTraversal(Node.newName("a"));
        Node n = Node.newName("a");
        Node parent = new Node(Token.ASSIGN, n, Node.newNumber(2));
        ns.new BuildGlobalNamespace().handleSetFromGlobal(t, n, parent, "a", false, Name.Type.OTHER);
        assertEquals(2, ns.getNameIndex().get("a").globalSets);
    }

    @Test
    public void testHandleSetFromLocal() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(Node.newVar("a"));
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        NodeTraversal t = mockTraversal(Node.newName("a"));
        Node n = Node.newName("a");
        Node parent = new Node(Token.ASSIGN, n, Node.newNumber(2));
        ns.new BuildGlobalNamespace().handleSetFromLocal(t, n, parent, "a");
        assertEquals(1, ns.getNameIndex().get("a").localSets);
    }

    @Test
    public void testHandleGet() throws Exception {
        Node root = new Node(Token.SCRIPT);
        root.addChildToBack(Node.newVar("a", Node.newNumber(1)));
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        NodeTraversal t = mockTraversal(Node.newName("a"));
        Node n = Node.newName("a");
        Node parent = new Node(Token.GETPROP, n, Node.newString("b"));
        ns.new BuildGlobalNamespace().handleGet(t, n, parent, "a");
        assertEquals(1, ns.getNameIndex().get("a").totalGets);
        assertEquals(Ref.Type.ALIASING_GET, ns.getNameIndex().get("a").refs.get(0).type);
    }

    @Test
    public void testDetermineGetTypeForHookOrBooleanExpr() throws Exception {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        NodeTraversal t = mockTraversal(Node.newString("a"));
        Node parentOr = new Node(Token.OR, Node.newString("a"), Node.newString("b"));
        Node parentHook = new Node(Token.HOOK, Node.newString("a"), Node.newString("b"), Node.newString("c"));

        // Test with ASSIGN where the target is NOT the name itself
        Node assignToDifferent = new Node(Token.ASSIGN, Node.newString("x"), parentOr);
        assertEquals(Ref.Type.ALIASING_GET, ns.new BuildGlobalNamespace().determineGetTypeForHookOrBooleanExpr(t, parentOr, "a"));

        // Test with ASSIGN where the target IS the name itself
        Node assignToSame = new Node(Token.ASSIGN, Node.newName("a"), parentOr);
        assertEquals(Ref.Type.DIRECT_GET, ns.new BuildGlobalNamespace().determineGetTypeForHookOrBooleanExpr(t, parentOr, "a"));

        // Test with HOOK where the name is not the first child
        assertEquals(Ref.Type.DIRECT_GET, ns.new BuildGlobalNamespace().determineGetTypeForHookOrBooleanExpr(t, parentHook, "a"));
    }

    @Test
    public void testIsNestedAssign() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Node assign = new Node(Token.ASSIGN);
        Node exprResult = new Node(Token.EXPR_RESULT, assign);
        Node var = new Node(Token.VAR, assign);

        // assign is a child of EXPR_RESULT, and EXPR_RESULT is not an expression node itself in this context
        // but its parent is SCRIPT, so it's not nested.
        assertFalse(ns.new BuildGlobalNamespace().isNestedAssign(assign));

        // assign is a child of VAR
        assertFalse(ns.new BuildGlobalNamespace().isNestedAssign(assign));
    }

    @Test
    public void testMaybeHandlePrototypePrefix() {
        Node root = new Node(Token.SCRIPT);
        Node protoAssign = new Node(Token.ASSIGN,
                                    new Node(Token.GETPROP, Node.newString("MyClass"), Node.newString("prototype")),
                                    new Node(Token.OBJECTLIT));
        root.addChildToBack(protoAssign);
        GlobalNamespace ns = new GlobalNamespace(compiler, root);
        NodeTraversal t = mockTraversal(new Node(Token.GETPROP, Node.newString("MyClass"), Node.newString("prototype")));

        // Case 1: name ends with ".prototype"
        Node n1 = new Node(Token.GETPROP, Node.newString("MyClass"), Node.newString("prototype"));
        Node parent1 = new Node(Token.ASSIGN, n1, Node.newNumber(1));
        assertTrue(ns.new BuildGlobalNamespace().maybeHandlePrototypePrefix(t, n1, parent1, "MyClass.prototype"));
        assertEquals(1, ns.getNameIndex().get("MyClass").aliasingGets); // Should be marked as aliasing get

        // Case 2: name contains ".prototype."
        Node n2 = new Node(Token.GETPROP,
                           new Node(Token.GETPROP, Node.newString("MyClass"), Node.newString("prototype")),
                           Node.newString("method"));
        Node parent2 = new Node(Token.ASSIGN, n2, Node.newNumber(1));
        assertTrue(ns.new BuildGlobalNamespace().maybeHandlePrototypePrefix(t, n2, parent2, "MyClass.prototype.method"));
        assertEquals(1, ns.getNameIndex().get("MyClass").aliasingGets); // Should mark MyClass
        assertEquals(1, ns.getNameIndex().get("MyClass.prototype").aliasingGets); // Should mark MyClass.prototype

        // Case 3: Not a prototype name
        Node n3 = Node.newName("a");
        Node parent3 = new Node(Token.ASSIGN, n3, Node.newNumber(1));
        assertFalse(ns.new BuildGlobalNamespace().maybeHandlePrototypePrefix(t, n3, parent3, "a"));
    }

    @Test
    public void testHandleSetFromGlobal_IsClassOrEnumDeclaration() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Node root = new Node(Token.SCRIPT);
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        builder.recordConstructor();
        JSDocInfo info = builder.build("test.js");
        Node functionNode = Node.newFunction("MyClass", null);
        functionNode.setJSDocInfo(info);
        root.addChildToBack(Node.newVar("MyClass", functionNode));
        ns.process();

        NodeTraversal t = mockTraversal(Node.newName("MyClass"));
        Name myClass = ns.getNameIndex().get("MyClass");
        assertNotNull(myClass);
        Node n = Node.newName("MyClass");
        Node parent = new Node(Token.ASSIGN, n, functionNode);
        ns.new BuildGlobalNamespace().handleSetFromGlobal(t, n, parent, "MyClass", false, Name.Type.FUNCTION);
        assertTrue(ns.getNameIndex().get("MyClass").isClassOrEnum);
    }

    @Test
    public void testHandleSetFromLocal_IsClassOrEnumDeclaration() {
        GlobalNamespace ns = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        Node root = new Node(Token.SCRIPT);
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        builder.recordConstructor();
        JSDocInfo info = builder.build("test.js");
        Node functionNode = Node.newFunction("MyClass", null);
        functionNode.setJSDocInfo(info);
        root.addChildToBack(Node.newVar("MyClass", functionNode));
        ns.process();

        NodeTraversal t = mockTraversal(Node.newName("MyClass"));
        Name myClass = ns.getNameIndex().get("MyClass");
        assertNotNull(myClass);
        Node n = Node.newName("MyClass");
        Node parent = new Node(Token.ASSIGN, n, functionNode);
        ns.new BuildGlobalNamespace().handleSetFromLocal(t, n, parent, "MyClass");
        // handleSetFromLocal doesn't set isClassOrEnum, only handles references.
        assertFalse(ns.getNameIndex().get("MyClass").isClassOrEnum);
    }

    @Test
    public void testJSDocInfoBuilder_RecordConstructor() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordConstructor());
        assertTrue(builder.isConstructorRecorded());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isConstructor());
    }

    @Test
    public void testJSDocInfoBuilder_RecordInterface() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordInterface());
        assertTrue(builder.isInterfaceRecorded());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isInterface());
    }

    @Test
    public void testJSDocInfoBuilder_RecordConstancy() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordConstancy());
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isConstant());
    }

    @Test
    public void testJSDocInfoBuilder_RecordDefineType() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        JSTypeExpression type = new JSTypeExpression(Node.newString("number"), "test.js", null);
        assertTrue(builder.recordDefineType(type));
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isDefine());
        assertTrue(info.hasType());
    }

    @Test
    public void testJSDocInfoBuilder_RecordSuppressions() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        Set<String> suppressions = new java.util.HashSet<>();
        suppressions.add("checkTypes");
        assertTrue(builder.recordSuppressions(suppressions));
        JSDocInfo info = builder.build("test.js");
        assertEquals(suppressions, info.getSuppressions());
    }

    @Test
    public void testJSDocInfoBuilder_RecordDeprecationReason() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordDeprecated());
        assertTrue(builder.recordDeprecationReason("Old functionality"));
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.isDeprecated());
        assertEquals("Old functionality", info.getDeprecationReason());
    }

    @Test
    public void testJSDocInfoBuilder_RecordFileOverview() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.recordFileOverview("This is a file overview."));
        JSDocInfo info = builder.build("test.js");
        assertEquals("This is a file overview.", info.getFileOverview());
    }

    @Test
    public void testJSDocInfoBuilder_RecordParameter() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        JSTypeExpression type = new JSTypeExpression(Node.newString("string"), "test.js", null);
        assertTrue(builder.recordParameter("param1", type));
        assertTrue(builder.hasParameter("param1"));
        assertEquals(type, builder.currentInfo.getParameterType("param1"));
    }

    @Test
    public void testJSDocInfoBuilder_RecordReturnType() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        JSTypeExpression type = new JSTypeExpression(Node.newString("number"), "test.js", null);
        assertTrue(builder.recordReturnType(type));
        JSDocInfo info = builder.build("test.js");
        assertEquals(type, info.getReturnType());
    }

    @Test
    public void testJSDocInfoBuilder_RecordThrowType() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        JSTypeExpression type = new JSTypeExpression(Node.newString("Error"), "test.js", null);
        assertTrue(builder.recordThrowType(type));
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.hasThrows(type));
    }

    @Test
    public void testJSDocInfoBuilder_AddAuthor() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.addAuthor("John Doe"));
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.hasAuthor());
        assertEquals("John Doe", info.getAuthors().get(0));
    }

    @Test
    public void testJSDocInfoBuilder_AddReference() {
        JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
        assertTrue(builder.addReference("See also"));
        JSDocInfo info = builder.build("test.js");
        assertTrue(info.hasReference());
        assertEquals("See also", info.getReferences().get(0));
    }
}
