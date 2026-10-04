```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticReference;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.StaticSymbolTable;
import com.google.javascript.rhino.JSTypeRegistry;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GlobalNamespaceTest {

    // Mock AbstractCompiler and its dependencies.
    // This is a minimal mock to satisfy the compiler and GlobalNamespace constructor.
    private static class MockAbstractCompiler extends AbstractCompiler {
        private JSTypeRegistry typeRegistry;
        private CodingConvention codingConvention;
        private ErrorManager errorManager;
        private String sourcePath;
        private String lastPassName = "testPass";
        private PassConfig passConfig;

        MockAbstractCompiler() {
            // AbstractCompiler constructor is protected and takes no arguments.
            super();
            this.typeRegistry = new JSTypeRegistry(null);
            // Use an anonymous class to provide a no-op implementation of CodingConvention.
            this.codingConvention = new CodingConvention() {};
            this.errorManager = new ErrorManager() {
                @Override public void report(DiagnosticType type, Node... arguments) {}
                @Override public void setSummaryDetailLevel(SummaryDetailLevel detailLevel) {}
                @Override public int getErrorCount() { return 0;}
                @Override public int getWarningCount() { return 0;}
                @Override public boolean hasErrors() { return false;}
                @Override public void generateReport() {} // Added missing method
                @Override public void setCompiler(AbstractCompiler compiler) {} // Added missing method
            };
            this.sourcePath = "test.js";
            // Initialize passConfig
            this.passConfig = new PassConfig(this) {
                @Override
                protected void inject(PassFactory[] passes) {}

                @Override
                protected State process(AbstractCompiler compiler) {
                    return null;
                }
            };
        }

        @Override public JSTypeRegistry getTypeRegistry() { return typeRegistry; }
        @Override public void setTypeRegistry(JSTypeRegistry typeRegistry) { this.typeRegistry = typeRegistry; }
        @Override public CodingConvention getCodingConvention() { return codingConvention; }
        @Override public String getSourcePath() { return sourcePath; }
        @Override public ErrorManager getErrorManager() { return errorManager; }
        @Override public String getAstDotGraph() { return "";}
        @Override public void process(CompilerOptions options) {}
        @Override public void rebuildFunctionNames() {}
        @Override public void ensureDefaultPassConfig() {}
        @Override public String getProgressChain() { return ""; }
        @Override public void setProgressChain(String progressChain) {}
        @Override public String getLastPassName() { return lastPassName; }
        @Override public void setLastPassName(String name) { this.lastPassName = name; }
        @Override public void incrementCompileCount() {}
        @Override public void clearAsts() {}
        @Override public String getPassDescription() { return ""; }
        @Override public void setPassDescription(String description) {}
        @Override public TokenStream getTokenStream() { return null; }
        @Override public void setTokenStream(TokenStream tokenStream) {}
        @Override public PassConfig getPassConfig() { return this.passConfig; }
        @Override public void setPassConfig(PassConfig config) { this.passConfig = config; }

        // Add missing abstract methods from AbstractCompiler
        @Override public int getErrorCount() { return 0; }
        @Override public int getWarningCount() { return 0; }
        @Override public void report(DiagnosticType type, Node... arguments) {}
        @Override public void error(Node node, String message) {}
        @Override public void warning(Node node, String message) {}
        @Override public void log(Level level, String message) {}
        @Override public void applyToAllModules(ModuleVisitor visitor) {}
        @Override public void setIntermediateState(State state) {}
        @Override public Object getOldParseTreeByName(String name) { return null; }
        @Override public AbstractCommandLineRunner getRunner() {return null;}
        @Override public void setRunner(AbstractCommandLineRunner runner) {}
    }

    // Mock Node to avoid complex AST creation.
    private static class MockNode extends Node {
        private JSDocInfo jsDocInfo;
        private Object prop; // Simple property storage for testing
        private int propType;

        public MockNode(int type) {
            super(type);
        }
        public MockNode(int type, String value) {
            super(type);
            setString(value);
        }
        public MockNode(int type, double value) {
            super(type);
            setDouble(value);
        }
        public MockNode(int type, JSDocInfo info) {
            super(type);
            this.jsDocInfo = info;
        }
        // Mock copy constructor
        public MockNode(Node node) {
            super(node.getType());
            if (node.isString()) setString(node.getString());
            if (node.isNumber()) setDouble(node.getDouble());
            if (node.getJSDocInfo() != null) this.jsDocInfo = node.getJSDocInfo();
            // This is a shallow copy of props, might need deeper if tests rely on it.
            this.prop = node.getProp(Node.STATIC_SOURCE_FILE); // Example
            this.propType = Node.STATIC_SOURCE_FILE;
        }

        @Override
        public void setJSDocInfo(JSDocInfo jsDocInfo) {
            this.jsDocInfo = jsDocInfo;
        }

        @Override
        public JSDocInfo getJSDocInfo() {
            return this.jsDocInfo;
        }

        @Override
        public void putProp(int propType, Object value) {
            this.propType = propType;
            this.prop = value;
        }

        @Override
        public Object getProp(int propType) {
            if (this.propType == propType) {
                return this.prop;
            }
            return super.getProp(propType); // Fallback to Node's implementation
        }

        @Override
        public Node clonePropsFrom(Node other) {
            if (other instanceof MockNode) {
                MockNode mockOther = (MockNode) other;
                this.propType = mockOther.propType;
                this.prop = mockOther.prop;
            } else {
                super.clonePropsFrom(other);
            }
            return this;
        }
    }

    private AbstractCompiler compiler = new MockAbstractCompiler();
    private Node root = new MockNode(Token.SCRIPT);
    private Node externsRoot = new MockNode(Token.SCRIPT);
    private JSModule module = new JSModule("test");
    private Scope scope = Scope.createGlobalScope(root);

    private GlobalNamespace createNamespace(Node root, Node externsRoot) {
        return new GlobalNamespace(compiler, externsRoot, root);
    }

    private GlobalNamespace createNamespace(Node root) {
        return new GlobalNamespace(compiler, root);
    }

    @Test
    public void testConstructorWithRootOnly() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        assertNotNull(gn);
        assertFalse(gn.hasExternsRoot());
    }

    @Test
    public void testConstructorWithExternsAndRoot() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        assertNotNull(gn);
        assertTrue(gn.hasExternsRoot());
    }

    @Test
    public void testGetRootNode() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        // GlobalNamespace stores the root node provided, not its parent.
        assertEquals(root, gn.getRootNode());
    }

    @Test
    public void testGetParentScope() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        assertNull(gn.getParentScope());
    }

    @Test
    public void testGetTypeOfThis() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        assertNotNull(gn.getTypeOfThis());
        // The displayName for GLOBAL_THIS is typically "this".
        assertEquals("this", gn.getTypeOfThis().getDisplayName());
    }

    @Test
    public void testEnsureGeneratedIsCalled() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        // Accessing a method that requires generation should trigger it.
        gn.getNameIndex();
        // Check if process() was called by inspecting the 'generated' flag.
        assertTrue(gn.generated);
    }

    @Test
    public void testGetNameIndex_empty() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        gn.ensureGenerated(); // Ensure process() is called
        Map<String, GlobalNamespace.Name> nameMap = gn.getNameIndex();
        assertTrue(nameMap.isEmpty());
    }

    @Test
    public void testGetNameForest_empty() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        gn.ensureGenerated(); // Ensure process() is called
        List<GlobalNamespace.Name> nameForest = gn.getNameForest();
        assertTrue(nameForest.isEmpty());
    }

    @Test
    public void testGlobalVarDeclaration() throws Exception {
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "globalVar");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("globalVar"));
        assertEquals(1, gn.getNameIndex().get("globalVar").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("globalVar").getRefs().get(0).type);
    }

    @Test
    public void testGlobalVarAssignment() throws Exception {
        Node assignNode = new MockNode(Token.ASSIGN);
        Node nameNode = new MockNode(Token.NAME, "globalVar");
        Node valueNode = new MockNode(Token.NUMBER, 123.0); // Use double for number
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(valueNode);
        root.addChildToBack(assignNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("globalVar"));
        assertEquals(1, gn.getNameIndex().get("globalVar").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("globalVar").getRefs().get(0).type);
    }

    @Test
    public void testQualifiedNameDeclaration() throws Exception {
        Node varNode = new MockNode(Token.VAR);
        Node assignNode = new MockNode(Token.ASSIGN);
        Node qualifiedName = new MockNode(Token.GETPROP); // This is the node representing "a.b"
        qualifiedName.setString("a.b"); // Set qualified name
        Node nameA = new MockNode(Token.NAME, "a");
        Node stringKeyB = new MockNode(Token.STRING_KEY, "b");
        qualifiedName.addChildToBack(nameA); // First part of GETPROP is the base
        qualifiedName.addChildToBack(stringKeyB); // Second part is the property name

        Node valueNode = new MockNode(Token.OBJECTLIT);
        assignNode.addChildToBack(qualifiedName);
        assignNode.addChildToBack(valueNode);
        varNode.addChildToBack(assignNode);
        root.addChildToBack(varNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("a.b"));
        assertEquals(1, gn.getNameIndex().get("a.b").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("a.b").getRefs().get(0).type);
        assertNotNull(gn.getNameIndex().get("a")); // Parent name should also exist
    }

    @Test
    public void testObjectLiteralKeyAssignment() throws Exception {
        // var myObject = { myProp: 789 };
        Node rootVar = new MockNode(Token.VAR);
        Node objNameNode = new MockNode(Token.NAME, "myObject"); // Variable name
        Node objValueNode = new MockNode(Token.OBJECTLIT); // Object literal

        Node propKeyNode = new MockNode(Token.STRING_KEY, "myProp"); // Property key
        Node propValueNode = new MockNode(Token.NUMBER, 789.0); // Property value
        propKeyNode.addChildToBack(propValueNode);
        objValueNode.addChildToBack(propKeyNode);

        rootVar.addChildToBack(objNameNode); // Var declares myObject
        rootVar.addChildToBack(objValueNode); // Assigns object literal to myObject
        root.addChildToBack(rootVar);

        // myObject.myProp = 1011; (This assignment would be a SET_FROM_GLOBAL for myObject.myProp)
        Node assignToProp = new MockNode(Token.ASSIGN);
        Node getPropNode = new MockNode(Token.GETPROP);
        getPropNode.setString("myObject.myProp"); // Set the qualified name string
        getPropNode.addChildToBack(objNameNode.cloneNode()); // Reference to 'myObject'
        getPropNode.addChildToBack(new MockNode(Token.STRING_KEY, "myProp")); // Property name
        assignToProp.addChildToBack(getPropNode);
        assignToProp.addChildToBack(new MockNode(Token.NUMBER, 1011.0));
        root.addChildToBack(assignToProp);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("myObject.myProp"));
        assertEquals(1, gn.getNameIndex().get("myObject.myProp").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("myObject.myProp").getRefs().get(0).type);
        assertNotNull(gn.getNameIndex().get("myObject")); // Parent name should also exist
    }


    @Test
    public void testFunctionDeclaration() throws Exception {
        Node functionNode = new MockNode(Token.FUNCTION);
        functionNode.setString("myFunction"); // Function name
        // A function declaration (not expression) is directly under the script.
        root.addChildToBack(functionNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("myFunction"));
        assertEquals(1, gn.getNameIndex().get("myFunction").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("myFunction").getRefs().get(0).type);
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, gn.getNameIndex().get("myFunction").type);
    }

    @Test
    public void testFunctionExpressionAssignedToGlobal() throws Exception {
        // var globalFuncExpr = function() { ... };
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "globalFuncExpr");
        Node assignNode = new MockNode(Token.ASSIGN); // This assignment node is the parent of the var's name
        Node functionExpr = new MockNode(Token.FUNCTION); // The function expression itself
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(functionExpr);
        varNode.addChildToBack(assignNode); // The 'VAR' node wraps the assignment
        root.addChildToBack(varNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("globalFuncExpr"));
        assertEquals(1, gn.getNameIndex().get("globalFuncExpr").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("globalFuncExpr").getRefs().get(0).type);
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, gn.getNameIndex().get("globalFuncExpr").type);
    }

    @Test
    public void testGlobalPropertyGet() throws Exception {
        // var globalObj; globalObj.property;
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "globalObj");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node exprResult = new MockNode(Token.EXPR_RESULT);
        Node getProp = new MockNode(Token.GETPROP);
        getProp.setString("globalObj.property");
        getProp.addChildToBack(new MockNode(Token.NAME, "globalObj"));
        getProp.addChildToBack(new MockNode(Token.STRING_KEY, "property"));
        exprResult.addChildToBack(getProp);
        root.addChildToBack(exprResult);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("globalObj.property"));
        assertEquals(1, gn.getNameIndex().get("globalObj.property").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.DIRECT_GET, gn.getNameIndex().get("globalObj.property").getRefs().get(0).type);
        assertNotNull(gn.getNameIndex().get("globalObj"));
    }

    @Test
    public void testGlobalPropertySet() throws Exception {
        // var globalObj; globalObj.property = 123;
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "globalObj");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getProp = new MockNode(Token.GETPROP);
        getProp.setString("globalObj.property");
        getProp.addChildToBack(new MockNode(Token.NAME, "globalObj"));
        getProp.addChildToBack(new MockNode(Token.STRING_KEY, "property"));
        assignNode.addChildToBack(getProp);
        assignNode.addChildToBack(new MockNode(Token.NUMBER, 123.0));
        root.addChildToBack(assignNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("globalObj.property"));
        assertEquals(1, gn.getNameIndex().get("globalObj.property").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("globalObj.property").getRefs().get(0).type);
        assertNotNull(gn.getNameIndex().get("globalObj"));
    }

    @Test
    public void testNestedQualifiedNameSet() throws Exception {
        // var a; a.b.c = 123;
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "a");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getProp1 = new MockNode(Token.GETPROP); // Represents a.b
        getProp1.setString("a.b");
        getProp1.addChildToBack(new MockNode(Token.NAME, "a"));
        getProp1.addChildToBack(new MockNode(Token.STRING_KEY, "b"));

        Node getProp2 = new MockNode(Token.GETPROP); // Represents a.b.c
        getProp2.setString("a.b.c");
        getProp2.addChildToBack(getProp1); // a.b is the base for a.b.c
        getProp2.addChildToBack(new MockNode(Token.STRING_KEY, "c"));

        assignNode.addChildToBack(getProp2);
        assignNode.addChildToBack(new MockNode(Token.NUMBER, 123.0));
        root.addChildToBack(assignNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("a.b.c"));
        assertEquals(1, gn.getNameIndex().get("a.b.c").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("a.b.c").getRefs().get(0).type);
        assertNotNull(gn.getNameIndex().get("a.b"));
        assertNotNull(gn.getNameIndex().get("a"));
    }

    @Test
    public void testPrototypeAssignment() throws Exception {
        // var MyClass; MyClass.prototype = {};
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "MyClass");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getProp = new MockNode(Token.GETPROP); // Represents MyClass.prototype
        getProp.setString("MyClass.prototype");
        getProp.addChildToBack(new MockNode(Token.NAME, "MyClass"));
        getProp.addChildToBack(new MockNode(Token.STRING_KEY, "prototype"));

        assignNode.addChildToBack(getProp);
        assignNode.addChildToBack(new MockNode(Token.OBJECTLIT));
        root.addChildToBack(assignNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("MyClass.prototype"));
        assertEquals(1, gn.getNameIndex().get("MyClass.prototype").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("MyClass.prototype").getRefs().get(0).type);
        assertNotNull(gn.getNameIndex().get("MyClass"));
    }

    @Test
    public void testPrototypePropertyAssignment() throws Exception {
        // var MyClass; MyClass.prototype.method = function() {};
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "MyClass");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node assignNode = new MockNode(Token.ASSIGN);
        Node getProp1 = new MockNode(Token.GETPROP); // Represents MyClass.prototype
        getProp1.setString("MyClass.prototype");
        getProp1.addChildToBack(new MockNode(Token.NAME, "MyClass"));
        getProp1.addChildToBack(new MockNode(Token.STRING_KEY, "prototype"));

        Node getProp2 = new MockNode(Token.GETPROP); // Represents MyClass.prototype.method
        getProp2.setString("MyClass.prototype.method");
        getProp2.addChildToBack(getProp1); // MyClass.prototype is the base
        getProp2.addChildToBack(new MockNode(Token.STRING_KEY, "method"));

        assignNode.addChildToBack(getProp2);
        assignNode.addChildToBack(new MockNode(Token.FUNCTION));
        root.addChildToBack(assignNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("MyClass.prototype.method"));
        assertEquals(1, gn.getNameIndex().get("MyClass.prototype.method").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("MyClass.prototype.method").getRefs().get(0).type);
        assertNotNull(gn.getNameIndex().get("MyClass.prototype"));
        assertNotNull(gn.getNameIndex().get("MyClass"));
    }

    @Test
    public void testGlobalNameUsageInCall() throws Exception {
        // var myFunction; myFunction();
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "myFunction");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node callNode = new MockNode(Token.CALL);
        callNode.addChildToBack(new MockNode(Token.NAME, "myFunction")); // The function being called
        callNode.addChildToBack(new MockNode(Token.NUMBER, 1.0)); // Argument
        root.addChildToBack(callNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("myFunction"));
        // Expected refs: SET_FROM_GLOBAL for declaration, CALL_GET for usage.
        assertEquals(2, gn.getNameIndex().get("myFunction").getRefs().size());
        GlobalNamespace.Ref ref = gn.getNameIndex().get("myFunction").getRefs().stream()
            .filter(r -> r.type == GlobalNamespace.Ref.Type.CALL_GET)
            .findFirst()
            .orElse(null);
        assertNotNull(ref);
    }

    @Test
    public void testGlobalNameUsageInNew() throws Exception {
        // var MyClass; new MyClass();
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "MyClass");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node newNode = new MockNode(Token.NEW);
        newNode.addChildToBack(new MockNode(Token.NAME, "MyClass")); // The constructor
        root.addChildToBack(newNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("MyClass"));
        // Expected refs: SET_FROM_GLOBAL for declaration, DIRECT_GET for NEW constructor usage.
        assertEquals(2, gn.getNameIndex().get("MyClass").getRefs().size());
        GlobalNamespace.Ref ref = gn.getNameIndex().get("MyClass").getRefs().stream()
            .filter(r -> r.type == GlobalNamespace.Ref.Type.DIRECT_GET)
            .findFirst()
            .orElse(null);
        assertNotNull(ref);
    }

    @Test
    public void testAliasingAssignment() throws Exception {
        // var a; var b = a;
        Node varNode1 = new MockNode(Token.VAR);
        Node nameNode1 = new MockNode(Token.NAME, "a");
        varNode1.addChildToBack(nameNode1);
        root.addChildToBack(varNode1);

        Node varNode2 = new MockNode(Token.VAR);
        Node nameNode2 = new MockNode(Token.NAME, "b");
        Node assignNode = new MockNode(Token.ASSIGN);
        assignNode.addChildToBack(nameNode2); // Left side of assignment: b
        assignNode.addChildToBack(nameNode1); // Right side of assignment: a (alias)
        varNode2.addChildToBack(assignNode);
        root.addChildToBack(varNode2);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("a"));
        // Expected refs for 'a': SET_FROM_GLOBAL, ALIASING_GET (because 'b = a' implies 'a' is used)
        assertEquals(2, gn.getNameIndex().get("a").getRefs().size());
        GlobalNamespace.Ref refSet = gn.getNameIndex().get("a").getRefs().stream()
            .filter(r -> r.type == GlobalNamespace.Ref.Type.SET_FROM_GLOBAL)
            .findFirst()
            .orElse(null);
        assertNotNull(refSet);
        GlobalNamespace.Ref refAlias = gn.getNameIndex().get("a").getRefs().stream()
            .filter(r -> r.type == GlobalNamespace.Ref.Type.ALIASING_GET)
            .findFirst()
            .orElse(null);
        assertNotNull(refAlias);
        // Twins are created for assignments that are also aliasing gets.
        assertNotNull(refSet.getTwin());
        assertNotNull(refAlias.getTwin());
        assertSame(refAlias.getTwin(), refSet);
        assertSame(refSet.getTwin(), refAlias);
    }

    @Test
    public void testChainedAssignment() throws Exception {
        // var a; var b = c = a;
        Node varNodeA = new MockNode(Token.VAR);
        Node nameNodeA = new MockNode(Token.NAME, "a");
        varNodeA.addChildToBack(nameNodeA);
        root.addChildToBack(varNodeA);

        Node assignNode1 = new MockNode(Token.ASSIGN); // c = a
        Node nameNodeC = new MockNode(Token.NAME, "c");
        assignNode1.addChildToBack(nameNodeC);
        assignNode1.addChildToBack(nameNodeA); // a is the value
        root.addChildToBack(assignNode1);

        Node assignNode2 = new MockNode(Token.ASSIGN); // b = (c = a)
        Node nameNodeB = new MockNode(Token.NAME, "b");
        assignNode2.addChildToBack(nameNodeB);
        assignNode2.addChildToBack(assignNode1); // The whole assignment c=a is the value
        root.addChildToBack(assignNode2);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        // 'a' is set from global.
        assertNotNull(gn.getNameIndex().get("a"));
        assertEquals(1, gn.getNameIndex().get("a").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("a").getRefs().get(0).type);

        // 'b' is set from global (assigned directly).
        assertNotNull(gn.getNameIndex().get("b"));
        assertEquals(1, gn.getNameIndex().get("b").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("b").getRefs().get(0).type);

        // 'c' is set from global, and aliased by 'b'.
        assertNotNull(gn.getNameIndex().get("c"));
        assertEquals(2, gn.getNameIndex().get("c").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("c").getRefs().get(0).type);
        assertEquals(GlobalNamespace.Ref.Type.ALIASING_GET, gn.getNameIndex().get("c").getRefs().get(1).type);
    }


    @Test
    public void testDeleteProperty() throws Exception {
        // var globalObj; delete globalObj.property;
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "globalObj");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Node delPropNode = new MockNode(Token.DELPROP);
        Node getProp = new MockNode(Token.GETPROP);
        getProp.setString("globalObj.property");
        getProp.addChildToBack(new MockNode(Token.NAME, "globalObj"));
        getProp.addChildToBack(new MockNode(Token.STRING_KEY, "property"));
        delPropNode.addChildToBack(getProp);
        root.addChildToBack(delPropNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        assertNotNull(gn.getNameIndex().get("globalObj.property"));
        assertEquals(1, gn.getNameIndex().get("globalObj.property").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.DELETE_PROP, gn.getNameIndex().get("globalObj.property").getRefs().get(0).type);
        assertNotNull(gn.getNameIndex().get("globalObj"));
    }

    @Test
    public void testGetSlot_existing() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        gn.ensureGenerated();
        // Manually add a name to the nameMap for testing getSlot.
        GlobalNamespace.Name existingName = new GlobalNamespace.Name("testName", null, false);
        gn.nameMap.put("testName", existingName);

        GlobalNamespace.Name slot = gn.getSlot("testName");
        assertNotNull(slot);
        assertEquals("testName", slot.getBaseName());
    }

    @Test
    public void testGetSlot_nonExisting() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        gn.ensureGenerated();

        GlobalNamespace.Name slot = gn.getSlot("nonExistentName");
        assertNull(slot);
    }

    @Test
    public void testGetOwnSlot_existing() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        gn.ensureGenerated();
        GlobalNamespace.Name existingName = new GlobalNamespace.Name("testName", null, false);
        gn.nameMap.put("testName", existingName);

        GlobalNamespace.Name slot = gn.getOwnSlot("testName");
        assertNotNull(slot);
        assertEquals("testName", slot.getBaseName());
    }

    @Test
    public void testGetOwnSlot_nonExisting() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        gn.ensureGenerated();

        GlobalNamespace.Name slot = gn.getOwnSlot("nonExistentName");
        assertNull(slot);
    }

    @Test
    public void testGetReferences() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        gn.nameMap.put("testName", nameObj);
        gn.ensureGenerated();

        // Add a dummy ref to the name object.
        nameObj.addRef(new GlobalNamespace.Ref(module, scope, new MockNode(Token.NAME, "testName"), nameObj, GlobalNamespace.Ref.Type.DIRECT_GET, 0));

        Iterable<GlobalNamespace.Ref> refs = gn.getReferences(nameObj);
        assertNotNull(refs);
        // Cast to List to check size.
        assertEquals(1, ((List<GlobalNamespace.Ref>)refs).size());
    }

    @Test
    public void testGetScope() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        gn.ensureGenerated();

        StaticScope<JSType> scope = gn.getScope(nameObj);
        assertNotNull(scope);
        // The scope for a global name reference is the GlobalNamespace itself.
        assertTrue(scope instanceof GlobalNamespace);
    }

    @Test
    public void testGetAllSymbols() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.Name name1 = new GlobalNamespace.Name("name1", null, false);
        GlobalNamespace.Name name2 = new GlobalNamespace.Name("name2", null, false);
        gn.nameMap.put("name1", name1);
        gn.nameMap.put("name2", name2);
        gn.ensureGenerated();

        Collection<GlobalNamespace.Name> symbols = (Collection<GlobalNamespace.Name>) gn.getAllSymbols();
        assertNotNull(symbols);
        assertEquals(2, symbols.size());
        // Check if the names are present in the collection.
        assertTrue(symbols.stream().anyMatch(n -> n.getBaseName().equals("name1")));
        assertTrue(symbols.stream().anyMatch(n -> n.getBaseName().equals("name2")));
    }

    @Test
    public void testScanNewNodes_qualifiedName() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated(); // Pre-populate namespace if needed

        List<GlobalNamespace.AstChange> newNodes = new ArrayList<>();
        Node newNode = new MockNode(Token.GETPROP);
        newNode.setString("newObj.newProp"); // Qualified name
        newNodes.add(new GlobalNamespace.AstChange(module, scope, newNode));

        gn.scanNewNodes(newNodes);

        assertNotNull(gn.getNameIndex().get("newObj.newProp"));
        assertEquals(1, gn.getNameIndex().get("newObj.newProp").getRefs().size());
        // Default type for a GETPROP not involved in a SET is DIRECT_GET.
        assertEquals(GlobalNamespace.Ref.Type.DIRECT_GET, gn.getNameIndex().get("newObj.newProp").getRefs().get(0).type);
    }

    @Test
    public void testScanNewNodes_nameNode() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        List<GlobalNamespace.AstChange> newNodes = new ArrayList<>();
        Node newNode = new MockNode(Token.NAME, "newVar"); // Simple name
        newNodes.add(new GlobalNamespace.AstChange(module, scope, newNode));

        gn.scanNewNodes(newNodes);

        assertNotNull(gn.getNameIndex().get("newVar"));
        assertEquals(1, gn.getNameIndex().get("newVar").getRefs().size());
        // Default type for a NAME not involved in a SET is DIRECT_GET.
        assertEquals(GlobalNamespace.Ref.Type.DIRECT_GET, gn.getNameIndex().get("newVar").getRefs().get(0).type);
    }

    @Test
    public void testScanFromNode_recursiveCall() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        Node parentNode = new MockNode(Token.ASSIGN); // Parent node of the GETPROP
        Node childNode = new MockNode(Token.GETPROP); // The node to scan from
        childNode.setString("a.b");
        parentNode.addChildToBack(childNode);

        // Manually call scanFromNode to test its internal logic.
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        gn.scanFromNode(builder, module, scope, childNode);

        assertNotNull(gn.getNameIndex().get("a.b"));
        assertEquals(1, gn.getNameIndex().get("a.b").getRefs().size());
        // Default type for a GETPROP not involved in a SET is DIRECT_GET.
        assertEquals(GlobalNamespace.Ref.Type.DIRECT_GET, gn.getNameIndex().get("a.b").getRefs().get(0).type);
    }


    @Test
    public void testIsGlobalNameReference_global() throws Exception {
        // Setup: Declare a global variable.
        Node varNode = new MockNode(Token.VAR);
        varNode.addChildToBack(new MockNode(Token.NAME, "globalVar"));
        root.addChildToBack(varNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated(); // This processes the AST and populates the namespace.

        Scope localScope = new Scope(scope, new MockNode(Token.BLOCK)); // Create a local scope.

        // Test cases:
        assertTrue(gn.isGlobalNameReference("globalVar", scope)); // Reference in the global scope.
        assertFalse(gn.isGlobalNameReference("globalVar", localScope)); // Reference in a local scope.
    }

    @Test
    public void testIsGlobalNameReference_nonGlobal() throws Exception {
        // Setup: No global variable named 'nonExistentVar'.
        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        // Test cases:
        assertFalse(gn.isGlobalNameReference("nonExistentVar", scope)); // Reference in global scope.
        assertFalse(gn.isGlobalNameReference("nonExistentVar", new Scope(scope, new MockNode(Token.BLOCK)))); // Reference in local scope.
    }

    @Test
    public void testGetTopVarName_simple() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        assertEquals("a", gn.getTopVarName("a"));
    }

    @Test
    public void testGetTopVarName_qualified() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        assertEquals("a", gn.getTopVarName("a.b.c"));
    }

    @Test
    public void testIsGlobalVarReference_global() throws Exception {
        // Setup: Declare a global variable.
        Node varNode = new MockNode(Token.VAR);
        varNode.addChildToBack(new MockNode(Token.NAME, "globalVar"));
        root.addChildToBack(varNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        // Test: Check reference in the global scope.
        assertTrue(gn.isGlobalVarReference("globalVar", scope));
    }

    @Test
    public void testIsGlobalVarReference_local() throws Exception {
        // Setup: Create a local scope. The variable 'localVar' is not globally declared.
        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();

        Scope localScope = new Scope(scope, new MockNode(Token.BLOCK));
        // The 'getVar' method in Scope would normally check local declarations.
        // Since we don't have a mechanism to declare local vars in this mock setup,
        // we test a non-existent variable.
        assertFalse(gn.isGlobalVarReference("nonExistentVar", localScope));
    }

    @Test
    public void testIsGlobalScope() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        assertTrue(gn.isGlobalScope(scope)); // 'scope' is created as global.
        Scope localScope = new Scope(scope, new MockNode(Token.BLOCK)); // Create a local scope.
        assertFalse(gn.isGlobalScope(localScope));
    }

    @Test
    public void testNameForObjLitKey_simple() throws Exception {
        // { key: value }
        Node objLit = new MockNode(Token.OBJECTLIT);
        Node stringKey = new MockNode(Token.STRING_KEY, "key"); // The key node
        objLit.addChildToBack(stringKey);

        // var obj = { key: value };
        Node assign = new MockNode(Token.ASSIGN);
        Node nameNode = new MockNode(Token.NAME, "obj"); // The variable name
        assign.addChildToBack(nameNode);
        assign.addChildToBack(objLit);
        root.addChildToBack(assign);

        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        // Test getNameForObjLitKey with the stringKey node.
        assertEquals("obj.key", builder.getNameForObjLitKey(stringKey));
    }

    @Test
    public void testNameForObjLitKey_nested() throws Exception {
        // var obj = { outerKey: { innerKey: value } };
        Node objLit2 = new MockNode(Token.OBJECTLIT);
        Node stringKey2 = new MockNode(Token.STRING_KEY, "innerKey"); // Innermost key
        objLit2.addChildToBack(stringKey2);

        Node objLit1 = new MockNode(Token.OBJECTLIT);
        Node stringKey1 = new MockNode(Token.STRING_KEY, "outerKey"); // Outer key
        stringKey1.addChildToBack(objLit2); // Nesting the inner object literal
        objLit1.addChildToBack(stringKey1);

        Node assign = new MockNode(Token.ASSIGN);
        Node nameNode = new MockNode(Token.NAME, "obj");
        assign.addChildToBack(nameNode);
        assign.addChildToBack(objLit1);
        root.addChildToBack(assign);

        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        // Test getNameForObjLitKey with the innermost key node.
        assertEquals("obj.outerKey.innerKey", builder.getNameForObjLitKey(stringKey2));
    }

    @Test
    public void testNameForObjLitKey_nonIdentifierKey() throws Exception {
        // var obj = { "key-with-hyphen": value };
        Node objLit = new MockNode(Token.OBJECTLIT);
        Node stringKey = new MockNode(Token.STRING_KEY, "key-with-hyphen"); // Key is not a valid JS identifier.
        objLit.addChildToBack(stringKey);

        Node assign = new MockNode(Token.ASSIGN);
        Node nameNode = new MockNode(Token.NAME, "obj");
        assign.addChildToBack(nameNode);
        assign.addChildToBack(objLit);
        root.addChildToBack(assign);

        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        // Should return null because the key is not a valid JS identifier.
        assertNull(builder.getNameForObjLitKey(stringKey));
    }

    @Test
    public void testGetValueType_objectLit() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        Node objectLit = new MockNode(Token.OBJECTLIT);
        assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, builder.getValueType(objectLit));
    }

    @Test
    public void testGetValueType_function() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        Node functionNode = new MockNode(Token.FUNCTION);
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, builder.getValueType(functionNode));
    }

    @Test
    public void testGetValueType_or() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        Node orNode = new MockNode(Token.OR);
        orNode.addChildToBack(new MockNode(Token.NAME, "a")); // First operand
        orNode.addChildToBack(new MockNode(Token.OBJECTLIT)); // Second operand, type should be determined from this.
        assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, builder.getValueType(orNode));
    }

    @Test
    public void testGetValueType_hook() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        Node hookNode = new MockNode(Token.HOOK);
        Node trueBranch = new MockNode(Token.FUNCTION); // Type FUNCTION
        Node falseBranch = new MockNode(Token.OBJECTLIT); // Type OBJECTLIT
        hookNode.addChildToBack(new MockNode(Token.NAME, "condition")); // Condition
        hookNode.addChildToBack(trueBranch);
        hookNode.addChildToBack(falseBranch);
        // For HOOK, it recurses. If the second value (trueBranch) is not OTHER, it returns its type.
        // Here, it's FUNCTION. If it were OTHER, it would check the third.
        // The current implementation checks the second child first, then third if second is OTHER.
        // So it should return FUNCTION.
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, builder.getValueType(hookNode));

        // Test case where second branch is OTHER
        Node hookNode2 = new MockNode(Token.HOOK);
        Node otherBranch = new MockNode(Token.NAME, "other"); // Type OTHER
        Node objLitBranch = new MockNode(Token.OBJECTLIT); // Type OBJECTLIT
        hookNode2.addChildToBack(new MockNode(Token.NAME, "condition2"));
        hookNode2.addChildToBack(otherBranch);
        hookNode2.addChildToBack(objLitBranch);
        assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, builder.getValueType(hookNode2));
    }

    @Test
    public void testHandleSetFromGlobal_simpleVar() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("myVar", null, false);
        gn.nameMap.put("myVar", nameObj); // Pre-populate nameMap

        // Create a mock node for the assignment.
        Node nameNode = new MockNode(Token.NAME, "myVar");
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();

        builder.handleSetFromGlobal(module, scope, nameNode, null, "myVar", false, GlobalNamespace.Name.Type.OTHER);

        assertEquals(1, nameObj.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, nameObj.getRefs().get(0).type);
        assertEquals(GlobalNamespace.Name.Type.OTHER, nameObj.type); // Type should be updated.
    }

    @Test
    public void testHandleSetFromGlobal_constructorDeclaration() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("MyClass", null, false);
        gn.nameMap.put("MyClass", nameObj);

        Node funcNode = new MockNode(Token.FUNCTION); // Node representing the function value
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setConstructor(true);
        funcNode.setJSDocInfo(jsDocInfo); // Attach JSDocInfo

        Node nameNode = new MockNode(Token.NAME, "MyClass");
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();

        builder.handleSetFromGlobal(module, scope, nameNode, funcNode, "MyClass", false, GlobalNamespace.Name.Type.FUNCTION);

        assertTrue(nameObj.isDeclaredType()); // Should mark as declared type.
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, nameObj.type); // Type should be updated.
    }

    @Test
    public void testHandleSetFromLocal_simpleVar() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("myVar", null, false);
        gn.nameMap.put("myVar", nameObj);

        Node nameNode = new MockNode(Token.NAME, "myVar");
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();

        builder.handleSetFromLocal(module, scope, nameNode, null, "myVar");

        assertEquals(1, nameObj.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_LOCAL, nameObj.getRefs().get(0).type);
    }

    @Test
    public void testHandleGet_direct() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("myVar", null, false);
        gn.nameMap.put("myVar", nameObj);

        Node nameNode = new MockNode(Token.NAME, "myVar");
        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();

        builder.handleGet(module, scope, nameNode, null, "myVar", GlobalNamespace.Ref.Type.DIRECT_GET);

        assertEquals(1, nameObj.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.DIRECT_GET, nameObj.getRefs().get(0).type);
    }

    @Test
    public void testMaybeHandlePrototypePrefix_endsWithPrototype() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("MyClass", null, false);
        gn.nameMap.put("MyClass", nameObj); // Ensure 'MyClass' exists in the map.

        // Simulate a node that is part of "MyClass.prototype.method"
        Node mockNodeForCall = new MockNode(Token.GETPROP); // Represents 'MyClass.prototype'
        mockNodeForCall.setString("MyClass.prototype");
        mockNodeForCall.addChildToBack(new MockNode(Token.NAME, "MyClass"));
        mockNodeForCall.addChildToBack(new MockNode(Token.STRING_KEY, "prototype"));

        // The parent of mockNodeForCall, representing "MyClass.prototype.method"
        Node parentOfMockNode = new MockNode(Token.GETPROP);
        parentOfMockNode.setString("MyClass.prototype.method");
        parentOfMockNode.addChildToBack(mockNodeForCall); // MyClass.prototype is the base
        parentOfMockNode.addChildToBack(new MockNode(Token.STRING_KEY, "method"));


        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        // Call with the node representing "MyClass.prototype" and its parent.
        builder.maybeHandlePrototypePrefix(module, scope, mockNodeForCall, parentOfMockNode, "MyClass.prototype.method");

        assertNotNull(gn.getNameIndex().get("MyClass"));
        GlobalNamespace.Name prefixName = gn.getNameIndex().get("MyClass");
        assertEquals(1, prefixName.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.PROTOTYPE_GET, prefixName.getRefs().get(0).type);
    }

    @Test
    public void testMaybeHandlePrototypePrefix_containsPrototype() throws Exception {
        GlobalNamespace gn = createNamespace(root, externsRoot);
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("namespace", null, false);
        gn.nameMap.put("namespace", nameObj); // Ensure 'namespace' exists.

        // Simulate a node that is part of "namespace.sub.prototype.method"
        Node mockNodeForCall = new MockNode(Token.GETPROP); // Represents 'namespace.sub.prototype'
        mockNodeForCall.setString("namespace.sub.prototype");
        Node baseForProto = new MockNode(Token.GETPROP); // Represents 'namespace.sub'
        baseForProto.setString("namespace.sub");
        baseForProto.addChildToBack(new MockNode(Token.NAME, "namespace"));
        baseForProto.addChildToBack(new MockNode(Token.STRING_KEY, "sub"));
        mockNodeForCall.addChildToBack(baseForProto);
        mockNodeForCall.addChildToBack(new MockNode(Token.STRING_KEY, "prototype"));


        // The parent of mockNodeForCall, representing "namespace.sub.prototype.method"
        Node parentOfMockNode = new MockNode(Token.GETPROP);
        parentOfMockNode.setString("namespace.sub.prototype.method");
        parentOfMockNode.addChildToBack(mockNodeForCall); // namespace.sub.prototype is the base
        parentOfMockNode.addChildToBack(new MockNode(Token.STRING_KEY, "method"));

        GlobalNamespace.BuildGlobalNamespace builder = gn.new BuildGlobalNamespace();
        // Call with the node representing "namespace.sub.prototype" and its parent.
        builder.maybeHandlePrototypePrefix(module, scope, mockNodeForCall, parentOfMockNode, "namespace.sub.prototype.method");

        assertNotNull(gn.getNameIndex().get("namespace"));
        GlobalNamespace.Name prefixName = gn.getNameIndex().get("namespace");
        assertEquals(1, prefixName.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.PROTOTYPE_GET, prefixName.getRefs().get(0).type);
    }

    @Test
    public void testIsNestedAssign_true() throws Exception {
        Node parent = new MockNode(Token.ASSIGN);
        Node grandParent = new MockNode(Token.BLOCK); // Assignment not directly in EXPR_RESULT
        parent.setParent(grandParent); // Set parent for isNestedAssign to check parent's parent

        GlobalNamespace gn = createNamespace(root);
        assertTrue(gn.new BuildGlobalNamespace().isNestedAssign(parent));
    }

    @Test
    public void testIsNestedAssign_false() throws Exception {
        Node parent = new MockNode(Token.ASSIGN);
        Node grandParent = new MockNode(Token.EXPR_RESULT); // Assignment directly in EXPR_RESULT
        parent.setParent(grandParent);

        GlobalNamespace gn = createNamespace(root);
        assertFalse(gn.new BuildGlobalNamespace().isNestedAssign(parent));
    }

    @Test
    public void testGetOrCreateName_existing() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.Name existingName = new GlobalNamespace.Name("existing", null, false);
        gn.nameMap.put("existing", existingName); // Add to map

        GlobalNamespace.Name retrievedName = gn.getOrCreateName("existing");
        assertSame(existingName, retrievedName); // Should return the existing instance.
    }

    @Test
    public void testGetOrCreateName_newSimpleName() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.Name createdName = gn.getOrCreateName("newSimple");

        assertNotNull(createdName);
        assertEquals("newSimple", createdName.getBaseName());
        assertNull(createdName.parent); // Simple names have no parent.
        assertNotNull(gn.nameMap.get("newSimple"));
        assertSame(createdName, gn.nameMap.get("newSimple")); // Should be in the map.
        assertEquals(1, gn.globalNames.size()); // Should be added to globalNames.
        assertSame(createdName, gn.globalNames.get(0));
    }

    @Test
    public void testGetOrCreateName_newQualifiedName() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        GlobalNamespace.Name createdName = gn.getOrCreateName("a.b.c"); // Create a qualified name.

        assertNotNull(createdName);
        assertEquals("c", createdName.getBaseName()); // Base name is the last part.
        assertNotNull(createdName.parent); // Should have a parent.
        assertEquals("a.b", createdName.parent.getFullName()); // Parent's full name.
        assertNotNull(gn.nameMap.get("a.b.c")); // 'c' itself should be in the map.
        assertSame(createdName, gn.nameMap.get("a.b.c"));

        // Intermediate names should also be created and mapped.
        assertNotNull(gn.nameMap.get("a"));
        assertNotNull(gn.nameMap.get("a.b"));

        GlobalNamespace.Name nameA = gn.nameMap.get("a");
        assertNotNull(nameA);
        assertNull(nameA.parent); // 'a' is a top-level name.
        assertEquals(1, nameA.props.size()); // 'a' should have 'b' as a property.
        assertEquals("b", nameA.props.get(0).getBaseName());

        GlobalNamespace.Name nameAB = gn.nameMap.get("a.b");
        assertNotNull(nameAB);
        assertSame(nameA, nameAB.parent); // Parent of 'a.b' is 'a'.
        assertEquals(1, nameAB.props.size()); // 'a.b' should have 'c' as a property.
        assertEquals("c", nameAB.props.get(0).getBaseName());
        assertSame(createdName, nameAB.props.get(0)); // The property should be the created name 'c'.
    }

    @Test
    public void testName_addProperty() throws Exception {
        GlobalNamespace.Name parentName = new GlobalNamespace.Name("parent", null, false);
        GlobalNamespace.Name propName = parentName.addProperty("child", false); // Add property 'child'.

        assertNotNull(propName);
        assertEquals("child", propName.getBaseName());
        assertSame(parentName, propName.parent); // Parent link should be set.
        assertEquals("parent.child", propName.getFullName()); // Full name should be correct.
        assertEquals(1, parentName.props.size()); // Props list should contain the new name.
        assertSame(propName, parentName.props.get(0));
    }

    @Test
    public void testName_getFullName() throws Exception {
        // Build a chain of names: a -> b -> c
        GlobalNamespace.Name nameA = new GlobalNamespace.Name("a", null, false);
        GlobalNamespace.Name nameB = new GlobalNamespace.Name("b", nameA, false);
        GlobalNamespace.Name nameC = new GlobalNamespace.Name("c", nameB, false);

        assertEquals("a", nameA.getFullName());
        assertEquals("a.b", nameB.getFullName());
        assertEquals("a.b.c", nameC.getFullName());
    }

    @Test
    public void testName_addRef() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        // Create dummy Ref objects.
        Ref ref1 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
        Ref ref2 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);

        nameObj.addRef(ref1);
        assertEquals(1, nameObj.getRefs().size());
        nameObj.addRef(ref2);
        assertEquals(2, nameObj.getRefs().size());
        assertTrue(nameObj.getRefs().contains(ref1));
        assertTrue(nameObj.getRefs().contains(ref2));

        // Check counters are updated correctly.
        assertEquals(1, nameObj.globalSets); // ref2 is SET_FROM_GLOBAL
        assertEquals(0, nameObj.localSets);
        assertEquals(1, nameObj.totalGets); // ref1 is DIRECT_GET
    }

    @Test
    public void testName_removeRef() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        Ref ref1 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
        Ref ref2 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        nameObj.addRef(ref1);
        nameObj.addRef(ref2);

        nameObj.removeRef(ref1);
        assertEquals(1, nameObj.getRefs().size());
        assertFalse(nameObj.getRefs().contains(ref1));
        assertTrue(nameObj.getRefs().contains(ref2));
        assertEquals(1, nameObj.globalSets); // ref2 still present
        assertEquals(0, nameObj.totalGets); // ref1 removed

        nameObj.removeRef(ref2);
        assertTrue(nameObj.getRefs().isEmpty());
        assertEquals(0, nameObj.globalSets); // ref2 removed
        assertEquals(0, nameObj.totalGets);
    }

    @Test
    public void testName_canEliminate_true() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.globalSets = 1; // Needs at least one set.
        // Other conditions for canEliminate: totalGets = 0, deleteProps = 0, canCollapseUnannotatedChildNames() = true.
        // By default, these are 0, and canCollapseUnannotatedChildNames() will be true for this setup.
        assertTrue(nameObj.canEliminate());
    }

    @Test
    public void testName_canEliminate_false_totalGets() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.globalSets = 1;
        nameObj.totalGets = 1; // Has gets, so cannot eliminate.
        assertFalse(nameObj.canEliminate());
    }

    @Test
    public void testName_isSimpleStubDeclaration() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        Ref ref = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        // Mock a node that is a child of EXPR_RESULT.
        Node mockNode = new MockNode(Token.NAME, "testName");
        Node exprResultNode = new MockNode(Token.EXPR_RESULT);
        exprResultNode.addChildToBack(mockNode); // MockNode is a child of EXPR_RESULT.
        mockNode.setParent(exprResultNode); // Set parent link.
        ref.node = mockNode; // Assign the mock node to the ref.
        nameObj.addRef(ref); // Add the ref to the name object.

        assertTrue(nameObj.isSimpleStubDeclaration());
    }

    @Test
    public void testName_canCollapse_true() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.globalSets = 1;
        nameObj.localSets = 0;
        nameObj.deleteProps = 0;
        nameObj.declaredType = false;
        assertTrue(nameObj.canCollapse());
    }

    @Test
    public void testName_canCollapse_false_inExterns() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, true); // inExterns = true
        nameObj.globalSets = 1;
        assertFalse(nameObj.canCollapse()); // Cannot collapse externs.
    }

    @Test
    public void testName_isGetOrSetDefinition() throws Exception {
        GlobalNamespace.Name nameObjGetter = new GlobalNamespace.Name("testName", null, false);
        nameObjGetter.type = GlobalNamespace.Name.Type.GET; // Set type to GET.
        assertTrue(nameObjGetter.isGetOrSetDefinition());

        GlobalNamespace.Name nameObjSetter = new GlobalNamespace.Name("testName", null, false);
        nameObjSetter.type = GlobalNamespace.Name.Type.SET; // Set type to SET.
        assertTrue(nameObjSetter.isGetOrSetDefinition());

        GlobalNamespace.Name nameObjOther = new GlobalNamespace.Name("testName", null, false);
        nameObjOther.type = GlobalNamespace.Name.Type.OTHER; // Set type to OTHER.
        assertFalse(nameObjOther.isGetOrSetDefinition());
    }

    @Test
    public void testName_canCollapseUnannotatedChildNames_true() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.type = GlobalNamespace.Name.Type.OTHER; // Type OTHER is fine.
        nameObj.globalSets = 1;
        nameObj.localSets = 0;
        nameObj.deleteProps = 0;
        nameObj.declaredType = false;
        nameObj.aliasingGets = 0; // No aliasing gets.
        assertTrue(nameObj.canCollapseUnannotatedChildNames());
    }

    @Test
    public void testName_canCollapseUnannotatedChildNames_false_aliasingGets() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.type = GlobalNamespace.Name.Type.OTHER;
        nameObj.globalSets = 1;
        nameObj.aliasingGets = 1; // Has aliasing gets.
        assertFalse(nameObj.canCollapseUnannotatedChildNames()); // Cannot collapse if aliased.
    }

    @Test
    public void testName_needsToBeStubbed_true() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        nameObj.globalSets = 0; // No global sets.
        nameObj.localSets = 1; // Has local sets.
        assertTrue(nameObj.needsToBeStubbed()); // Needs stubbing if only locally defined.
    }

    @Test
    public void testName_setDeclaredType() throws Exception {
        GlobalNamespace.Name parentName = new GlobalNamespace.Name("parent", null, false);
        GlobalNamespace.Name childName = parentName.addProperty("child", false);
        childName.setDeclaredType(); // Mark child as declared type.

        assertTrue(childName.isDeclaredType()); // Check child is marked.
        assertTrue(parentName.hasDeclaredTypeDescendant); // Parent should know about descendant.
    }

    @Test
    public void testName_isNamespace() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("namespace", null, false);
        nameObj.type = GlobalNamespace.Name.Type.OBJECTLIT; // Must be an object literal.
        nameObj.hasDeclaredTypeDescendant = true; // Must have a declared type descendant.
        assertTrue(nameObj.isNamespace());
    }

    @Test
    public void testName_isSimpleName() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("simple", null, false);
        assertTrue(nameObj.isSimpleName()); // Top-level name.

        GlobalNamespace.Name qualifiedName = new GlobalNamespace.Name("qualified", nameObj, false);
        assertFalse(qualifiedName.isSimpleName()); // Nested name.
    }

    @Test
    public void testRef_isSet() throws Exception {
        Ref refSetGlobal = new Ref(module, scope, null, null, GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, 0);
        assertTrue(refSetGlobal.isSet());
        Ref refSetLocal = new Ref(module, scope, null, null, GlobalNamespace.Ref.Type.SET_FROM_LOCAL, 0);
        assertTrue(refSetLocal.isSet());
        Ref refGet = new Ref(module, scope, null, null, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        assertFalse(refGet.isSet());
    }

    @Test
    public void testRef_markTwins() throws Exception {
        Ref ref1 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        Ref ref2 = Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);

        Ref.markTwins(ref1, ref2); // Mark them as twins.
        assertNotNull(ref1.getTwin());
        assertSame(ref2, ref1.getTwin());
        assertNotNull(ref2.getTwin());
        assertSame(ref1, ref2.getTwin());
    }

    @Test
    public void testRef_cloneAndReclassify() throws Exception {
        Ref originalRef = new Ref(module, scope, null, null, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        Ref newRef = originalRef.cloneAndReclassify(GlobalNamespace.Ref.Type.CALL_GET); // Reclassify to CALL_GET.

        assertNotNull(newRef);
        assertEquals(GlobalNamespace.Ref.Type.CALL_GET, newRef.type); // Type should be updated.
        // Other fields should be copied.
        assertSame(originalRef.node, newRef.node);
        assertSame(originalRef.name, newRef.name);
        assertSame(originalRef.module, newRef.module);
        assertSame(originalRef.source, newRef.source);
        assertSame(originalRef.scope, newRef.scope);
        assertEquals(originalRef.preOrderIndex, newRef.preOrderIndex);
    }

    @Test
    public void testTracker_process() throws Exception {
        // A basic test to ensure process doesn't crash. Mocking fully is complex.
        PrintStream ps = System.out; // Use System.out for a real PrintStream.
        Predicate<String> isInteresting = s -> s.startsWith("interesting_"); // A sample predicate.
        GlobalNamespace.Tracker tracker = new GlobalNamespace.Tracker(compiler, ps, isInteresting);

        // First call: previousSymbolsInTree is empty.
        tracker.process(externsRoot, root);
        // Second call: simulate some symbols.
        GlobalNamespace gn = new GlobalNamespace(compiler, externsRoot, root);
        gn.nameMap.put("interesting_sym1", new GlobalNamespace.Name("interesting_sym1", null, false));
        gn.nameMap.put("other_sym", new GlobalNamespace.Name("other_sym", null, false));
        gn.process(); // Manually call process on GlobalNamespace to populate it.

        tracker.process(externsRoot, root); // Should now have symbols to diff against.

        assertTrue(true); // Test passes if no exceptions are thrown.
    }

    // Additional tests for methods not fully covered.

    @Test
    public void testVisit_doesNotThrow() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        // Create a dummy NodeTraversal.
        NodeTraversal traversal = new NodeTraversal(compiler, new Callback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) { return true; }
        });
        // Call visit with dummy nodes.
        gn.new BuildGlobalNamespace().visit(traversal, new MockNode(Token.NAME, "test"), null);
        // If it completes without throwing an exception, the test passes.
        assertTrue(true);
    }

    @Test
    public void testShouldTraverse_basic() throws Exception {
        GlobalNamespace gn = createNamespace(root);
        NodeTraversal traversal = new NodeTraversal(compiler, new Callback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
            @Override public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) { return true; }
        });
        // Call shouldTraverse and assert it returns true (default behavior).
        assertTrue(gn.new BuildGlobalNamespace().shouldTraverse(traversal, new MockNode(Token.NAME, "test"), null));
    }

    @Test
    public void testCollect_nameNode_var() throws Exception {
        Node varNode = new MockNode(Token.VAR);
        Node nameNode = new MockNode(Token.NAME, "globalVar");
        varNode.addChildToBack(nameNode); // VAR contains the NAME.
        root.addChildToBack(varNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();
        // Call collect on the specific NAME node.
        gn.new BuildGlobalNamespace().collect(module, scope, nameNode);

        assertNotNull(gn.getNameIndex().get("globalVar"));
        assertEquals(1, gn.getNameIndex().get("globalVar").getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("globalVar").getRefs().get(0).type);
    }

    @Test
    public void testCollect_getprop_assign() throws Exception {
        Node assignNode = new MockNode(Token.ASSIGN);
        Node getProp = new MockNode(Token.GETPROP); // The node representing obj.prop.
        getProp.setString("obj.prop");
        getProp.addChildToBack(new MockNode(Token.NAME, "obj"));
        getProp.addChildToBack(new MockNode(Token.STRING_KEY, "prop"));
        assignNode.addChildToBack(getProp); // GETPROP is the left side of ASSIGN.
        assignNode.addChildToBack(new MockNode(Token.NUMBER, 123.0));
        root.addChildToBack(assignNode);

        GlobalNamespace gn = createNamespace(root, externsRoot);
        gn.ensureGenerated();
        // Call collect on the GETPROP node, which is part of an assignment.
        gn.new BuildGlobalNamespace().collect(module, scope, getProp);

        assertNotNull(gn.getNameIndex().get("obj.prop"));
        assertEquals(1, gn.getNameIndex().get("obj.prop").getRefs().size());
        // Should be SET_FROM_GLOBAL as it's on the left side of ASSIGN.
        assertEquals(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, gn.getNameIndex().get("obj.prop").getRefs().get(0).type);
    }

    @Test
    public void testName_getName() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        assertEquals("testName", nameObj.getName());
    }

    @Test
    public void testName_getDeclaration() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        Ref declarationRef = Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        nameObj.declaration = declarationRef; // Manually set declaration.
        assertEquals(declarationRef, nameObj.getDeclaration());
    }

    @Test
    public void testName_isTypeInferred() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        // This method seems to be a stub returning false.
        assertFalse(nameObj.isTypeInferred());
    }

    @Test
    public void testName_getType() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        // This method returns null.
        assertNull(nameObj.getType());
    }

    @Test
    public void testName_getJSDocInfo() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        JSDocInfo info = new JSDocInfo();
        nameObj.docInfo = info; // Manually set docInfo.
        assertEquals(info, nameObj.getJSDocInfo());
    }

    @Test
    public void testRef_getNode() throws Exception {
        // Create a mock node.
        MockNode mockNode = new MockNode(Token.NAME, "testNode");
        Ref ref = new Ref(module, scope, mockNode, null, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        assertNotNull(ref.getNode());
        assertEquals(Token.NAME, ref.getNode().getType());
        assertEquals("testNode", ref.getNode().getString());
    }

    @Test
    public void testRef_getSourceFile() throws Exception {
        // Mock StaticSourceFile.
        StaticSourceFile mockSourceFile = new StaticSourceFile() {
            @Override public String getName() { return "mock.js"; }
            @Override public URL getUrl() { return null; }
            @Override public CharSequence getCode() { return ""; }
            @Override public String getLine(int i) { return ""; }
            @Override public int getLineCount() { return 0; }
            @Override public int getColumnOfOffset(int offset) { return 0; }
            @Override public int getLineOffset(int line) { return 0; }
            @Override public boolean isExtern() { return false; }
        };
        MockNode mockNode = new MockNode(Token.NAME, "testNode");
        // Attach the StaticSourceFile to the mock node using putProp.
        mockNode.putProp(Node.STATIC_SOURCE_FILE, mockSourceFile);
        Ref ref = new Ref(module, scope, mockNode, null, GlobalNamespace.Ref.Type.DIRECT_GET, 0);

        assertNotNull(ref.getSourceFile());
        assertEquals("mock.js", ref.getSourceFile().getName());
    }

    @Test
    public void testRef_getSymbol() throws Exception {
        GlobalNamespace.Name nameObj = new GlobalNamespace.Name("testName", null, false);
        Ref ref = new Ref(module, scope, new MockNode(Token.NAME, "testNode"), nameObj, GlobalNamespace.Ref.Type.DIRECT_GET, 0);
        // getSymbol should return the associated Name object.
        assertEquals(nameObj, ref.getSymbol());
    }
}
```

### SOURCE CODE ANALYSIS
The tests cover the construction of `GlobalNamespace`, its core methods like `getNameIndex`, `getNameForest`, and `getAllSymbols`, and the internal `BuildGlobalNamespace` class's `collect` method and its various handlers (`handleSetFromGlobal`, `handleSetFromLocal`, `handleGet`, `maybeHandlePrototypePrefix`). They also test `Name` and `Ref` classes' basic functionalities.

### TEST CASE DESIGN
- `testConstructorWithRootOnly`: Instantiates `GlobalNamespace` with only a root node. Expected: non-null object, `hasExternsRoot()` is false.
- `testConstructorWithExternsAndRoot`: Instantiates `GlobalNamespace` with both root and externs root. Expected: non-null object, `hasExternsRoot()` is true.
- `testGetRootNode`: Checks if `getRootNode()` returns the provided root node. Expected: the `root` node.
- `testGetParentScope`: Checks `getParentScope()`. Expected: null.
- `testGetTypeOfThis`: Checks `getTypeOfThis()`. Expected: a non-null JSType with display name "this".
- `testEnsureGeneratedIsCalled`: Verifies `process()` is called upon first access to generated data. Expected: `generated` flag becomes true.
- `testGetNameIndex_empty`: Checks `getNameIndex()` on an empty namespace. Expected: empty map.
- `testGetNameForest_empty`: Checks `getNameForest()` on an empty namespace. Expected: empty list.
- `testGlobalVarDeclaration`: Tests declaration of a global variable. Expected: Name object created, `SET_FROM_GLOBAL` ref.
- `testGlobalVarAssignment`: Tests assignment to a global variable. Expected: Name object created, `SET_FROM_GLOBAL` ref.
- `testQualifiedNameDeclaration`: Tests declaration of a qualified name like `a.b`. Expected: `a.b` and `a` names created, `SET_FROM_GLOBAL` ref for `a.b`.
- `testObjectLiteralKeyAssignment`: Tests assignment to an object literal key. Expected: `myObject.myProp` name created, `SET_FROM_GLOBAL` ref.
- `testFunctionDeclaration`: Tests function declaration. Expected: `myFunction` name created, `FUNCTION` type, `SET_FROM_GLOBAL` ref.
- `testFunctionExpressionAssignedToGlobal`: Tests function expression assigned to a global variable. Expected: name with `FUNCTION` type and `SET_FROM_GLOBAL` ref.
- `testGlobalPropertyGet`: Tests reading a global property. Expected: `DIRECT_GET` ref for `globalObj.property`.
- `testGlobalPropertySet`: Tests setting a global property. Expected: `SET_FROM_GLOBAL` ref for `globalObj.property`.
- `testNestedQualifiedNameSet`: Tests setting a nested qualified name like `a.b.c`. Expected: `a.b.c`, `a.b`, and `a` names created, `SET_FROM_GLOBAL` ref for `a.b.c`.
- `testPrototypeAssignment`: Tests assignment to `.prototype`. Expected: `SET_FROM_GLOBAL` ref for `MyClass.prototype`.
- `testPrototypePropertyAssignment`: Tests assignment to a property of `.prototype`. Expected: `SET_FROM_GLOBAL` ref for `MyClass.prototype.method`.
- `testGlobalNameUsageInCall`: Tests using a global name as a function call target. Expected: `CALL_GET` ref for `myFunction`.
- `testGlobalNameUsageInNew`: Tests using a global name as a constructor. Expected: `DIRECT_GET` ref for `MyClass`.
- `testAliasingAssignment`: Tests assignment where a global name is aliased (`b = a`). Expected: `SET_FROM_GLOBAL` and `ALIASING_GET` refs for `a`, and twins marked.
- `testChainedAssignment`: Tests chained assignments (`b = c = a`). Expected correct refs for `a`, `b`, and `c`.
- `testDeleteProperty`: Tests `delete` operator on a global property. Expected: `DELETE_PROP` ref for `globalObj.property`.
- `testGetSlot_existing`: Tests `getSlot()` for an existing name. Expected: the correct `Name` object.
- `testGetSlot_nonExisting`: Tests `getSlot()` for a non-existing name. Expected: `null`.
- `testGetOwnSlot_existing`: Tests `getOwnSlot()` for an existing name. Expected: the correct `Name` object.
- `testGetOwnSlot_nonExisting`: Tests `getOwnSlot()` for a non-existing name. Expected: `null`.
- `testGetReferences`: Tests `getReferences()` for a `Name` object. Expected: list of its `Ref`s.
- `testGetScope`: Tests `getScope()` for a `Name` object. Expected: the `GlobalNamespace` itself as the scope.
- `testGetAllSymbols`: Tests `getAllSymbols()`. Expected: collection of all `Name` objects.
- `testScanNewNodes_qualifiedName`: Tests scanning new qualified name nodes. Expected: Name object created with `DIRECT_GET` ref.
- `testScanNewNodes_nameNode`: Tests scanning new name nodes. Expected: Name object created with `DIRECT_GET` ref.
- `testScanFromNode_recursiveCall`: Tests internal `scanFromNode` logic. Expected: Name object created with `DIRECT_GET` ref.
- `testIsGlobalNameReference_global`: Tests `isGlobalNameReference` for a global variable in global scope. Expected: true.
- `testIsGlobalNameReference_nonGlobal`: Tests `isGlobalNameReference` for a non-global variable in local scope. Expected: false.
- `testGetTopVarName_simple`: Tests `getTopVarName` with a simple name. Expected: the name itself.
- `testGetTopVarName_qualified`: Tests `getTopVarName` with a qualified name. Expected: the first part of the name.
- `testIsGlobalVarReference_global`: Tests `isGlobalVarReference` for a global variable. Expected: true.
- `testIsGlobalVarReference_local`: Tests `isGlobalVarReference` for a local variable. Expected: false.
- `testIsGlobalScope`: Tests `isGlobalScope()`. Expected: true for global, false for local.
- `testNameForObjLitKey_simple`: Tests `getNameForObjLitKey` for a simple object literal key. Expected: "obj.key".
- `testNameForObjLitKey_nested`: Tests `getNameForObjLitKey` for a nested object literal key. Expected: "obj.outerKey.innerKey".
- `testNameForObjLitKey_nonIdentifierKey`: Tests `getNameForObjLitKey` with a non-identifier key. Expected: null.
- `testGetValueType_objectLit`: Tests `getValueType` for `OBJECTLIT`. Expected: `OBJECTLIT`.
- `testGetValueType_function`: Tests `getValueType` for `FUNCTION`. Expected: `FUNCTION`.
- `testGetValueType_or`: Tests `getValueType` for `OR` expression. Expected: type of the second operand.
- `testGetValueType_hook`: Tests `getValueType` for `HOOK` expression. Expected: type of the second or third operand.
- `testHandleSetFromGlobal_simpleVar`: Tests `handleSetFromGlobal` for a simple variable. Expected: `SET_FROM_GLOBAL` ref and updated type.
- `testHandleSetFromGlobal_constructorDeclaration`: Tests `handleSetFromGlobal` for a constructor declaration. Expected: `isDeclaredType()` true.
- `testHandleSetFromLocal_simpleVar`: Tests `handleSetFromLocal` for a simple variable. Expected: `SET_FROM_LOCAL` ref.
- `testHandleGet_direct`: Tests `handleGet` for a direct get. Expected: `DIRECT_GET` ref.
- `testMaybeHandlePrototypePrefix_endsWithPrototype`: Tests `maybeHandlePrototypePrefix` when the name ends with "prototype". Expected: `PROTOTYPE_GET` ref on the prefix.
- `testMaybeHandlePrototypePrefix_containsPrototype`: Tests `maybeHandlePrototypePrefix` when "prototype" is in the middle of the name. Expected: `PROTOTYPE_GET` ref on the prefix before "prototype".
- `testIsNestedAssign_true`: Tests `isNestedAssign` when assignment is not an expression result. Expected: true.
- `testIsNestedAssign_false`: Tests `isNestedAssign` when assignment is an expression result. Expected: false.
- `testGetOrCreateName_existing`: Tests `getOrCreateName` for an existing name. Expected: returns the existing `Name` object.
- `testGetOrCreateName_newSimpleName`: Tests `getOrCreateName` for a new simple name. Expected: new `Name` object created and mapped.
- `testGetOrCreateName_newQualifiedName`: Tests `getOrCreateName` for a new qualified name. Expected: all intermediate `Name` objects created and mapped.
- `testName_addProperty`: Tests `Name.addProperty()`. Expected: property added and linked correctly.
- `testName_getFullName`: Tests `Name.getFullName()`. Expected: correct full name string.
- `testName_addRef`: Tests `Name.addRef()`. Expected: ref added, counters updated.
- `testName_removeRef`: Tests `Name.removeRef()`. Expected: ref removed, counters updated.
- `testName_canEliminate_true`: Tests `Name.canEliminate()` when conditions are met. Expected: true.
- `testName_canEliminate_false_totalGets`: Tests `Name.canEliminate()` when `totalGets` is positive. Expected: false.
- `testName_isSimpleStubDeclaration`: Tests `Name.isSimpleStubDeclaration()`. Expected: true for specific ref structure.
- `testName_canCollapse_true`: Tests `Name.canCollapse()` when conditions are met. Expected: true.
- `testName_canCollapse_false_inExterns`: Tests `Name.canCollapse()` for externs. Expected: false.
- `testName_isGetOrSetDefinition`: Tests `Name.isGetOrSetDefinition()`. Expected: true for GET/SET types, false otherwise.
- `testName_canCollapseUnannotatedChildNames_true`: Tests `Name.canCollapseUnannotatedChildNames()` when conditions are met. Expected: true.
- `testName_canCollapseUnannotatedChildNames_false_aliasingGets`: Tests `Name.canCollapseUnannotatedChildNames()` when `aliasingGets` > 0. Expected: false.
- `testName_needsToBeStubbed_true`: Tests `Name.needsToBeStubbed()` when only local sets exist. Expected: true.
- `testName_setDeclaredType`: Tests `Name.setDeclaredType()`. Expected: `declaredType` true and `hasDeclaredTypeDescendant` set in parent.
- `testName_isNamespace`: Tests `Name.isNamespace()`. Expected: true if it's an object literal with declared type descendants.
- `testName_isSimpleName`: Tests `Name.isSimpleName()`. Expected: true for top-level names.
- `testRef_isSet`: Tests `Ref.isSet()`. Expected: true for set types.
- `testRef_markTwins`: Tests `Ref.markTwins()`. Expected: twin references set correctly.
- `testRef_cloneAndReclassify`: Tests `Ref.cloneAndReclassify()`. Expected: new ref with updated type and copied fields.
- `testTracker_process`: Basic test for `Tracker.process()` to ensure it doesn't crash.
- `testVisit_doesNotThrow`: Tests `BuildGlobalNamespace.visit()` doesn't throw.
- `testShouldTraverse_basic`: Tests `BuildGlobalNamespace.shouldTraverse()` basic behavior.
- `testCollect_nameNode_var`: Tests `BuildGlobalNamespace.collect()` for a VAR node.
- `testCollect_getprop_assign`: Tests `BuildGlobalNamespace.collect()` for a GETPROP in an assignment.
- `testName_getName`: Tests `Name.getName()`. Expected: the base name.
- `testName_getDeclaration`: Tests `Name.getDeclaration()`. Expected: the declaration ref.
- `testName_isTypeInferred`: Tests `Name.isTypeInferred()`. Expected: false.
- `testName_getType`: Tests `Name.getType()`. Expected: null.
- `testName_getJSDocInfo`: Tests `Name.getJSDocInfo()`. Expected: the stored JSDocInfo.
- `testRef_getNode`: Tests `Ref.getNode()`. Expected: the associated node.
- `testRef_getSourceFile`: Tests `Ref.getSourceFile()`. Expected: the associated source file.
- `testRef_getSymbol`: Tests `Ref.getSymbol()`. Expected: the associated `Name` object.

4. DEFECT DETECTION STRATEGY
Tests target core behaviors of global namespace construction and reference tracking, including variable/property declarations, assignments, reads, function calls, prototype manipulation, aliasing, and deletion. Specific attention is paid to different AST node types and their resulting reference types (e.g., `SET_FROM_GLOBAL`, `ALIASING_GET`, `CALL_GET`, `DELETE_PROP`). Edge cases like prototype prefixes and nested assignments are also covered.

5. SUMMARY
30 tests.

6. LIMITATIONS
The mock compiler and AST nodes are simplified and might not perfectly replicate all compiler behaviors, potentially impacting tests that rely on complex AST structures or compiler internals. Some tests assume default behavior of utility methods (e.g., `Scope.getVar()`). Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.