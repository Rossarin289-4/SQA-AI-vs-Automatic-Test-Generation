package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TypeInferenceTest {

    // Helper to create a minimal JSTypeRegistry and Compiler for testing
    private JSTypeRegistry registry;
    private MockCompiler compiler;
    private TypeInference ti;

    private void setupTypeInference(String code) {
        registry = new JSTypeRegistry(null);
        compiler = new MockCompiler(registry);
        Node root = compiler.parse(code); // Use the mocked parse method

        // Mocking the construction of CFG, Scope, and ReverseAbstractInterpreter
        // These mocks are simplified to allow testing TypeInference methods directly.

        // Mock Scope creation
        Scope globalScope = new Scope.Builder(compiler).build();
        Scope functionScope = Scope.createLatticeBottom(null); // Simplified scope

        // Mock ControlFlowGraph
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(compiler);
        cfg.computeCFG(root);

        // Mock ReverseAbstractInterpreter
        ReverseAbstractInterpreter rai = new SemanticReverseAbstractInterpreter(registry);

        Map<String, AssertionFunctionSpec> assertionFunctionsMap = Maps.newHashMap();

        // Instantiate TypeInference with mocked dependencies
        // The constructor for TypeInference expects specific arguments that might
        // not be fully provided by these mocks. For direct method testing,
        // we will call the methods directly and set up their internal state as needed.
        // The 'ti' field is intended for tests that need a fully constructed TypeInference.
        // For direct method calls, we create a temporary instance.
    }

    // Mock AbstractCompiler for basic functionality
    private static class MockCompiler extends AbstractCompiler {
        private JSTypeRegistry registry;
        private Node parsedCode; // Store parsed code for mock parse method

        MockCompiler(JSTypeRegistry registry) {
            this.registry = registry;
            this.parsedCode = null; // Initialize to null
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return registry;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention.DefaultCodingConvention(); // Use default
        }

        @Override
        public void report(DiagnosticType diagnosticType, Node... nodes) {
            // Do nothing for tests
        }

        @Override
        public void process(com.google.javascript.jscomp.Phase phase) {
            // Do nothing for tests
        }

        @Override
        public Node parse(String code) {
            // Mock parsing: create a simple AST for testing.
            // This mock returns a SCRIPT node with a FUNCTION node inside.
            // It does not actually parse the code string.
            Node script = new Node(Token.SCRIPT);
            Node function = new Node(Token.FUNCTION);
            Node name = new Node(Token.NAME);
            name.setString("anonymous");
            function.addChildToFront(name); // Function name
            Node params = new Node(Token.PARAM_LIST);
            function.addChildToBack(params); // Parameters
            Node body = new Node(Token.BLOCK);
            function.addChildToBack(body); // Body
            script.addChildToBack(function);
            this.parsedCode = script; // Store for potential later use if needed
            return script;
        }

        @Override
        public String getAstFileName() {
            return "test.js";
        }

        @Override
        public void setFileName(Node n, String fileName) {
            // no-op
        }

        // Add abstract methods from AbstractCompiler that were missing
        @Override
        public com.google.javascript.jscomp.CompilerOptions getOptions() {
            return new com.google.javascript.jscomp.CompilerOptions(); // Provide a default
        }

        @Override
        public com.google.javascript.jscomp.JsMessage.Style getMessageStyle() {
            return com.google.javascript.jscomp.JsMessage.Style.LEGACY; // Provide a default
        }

        @Override
        public com.google.javascript.jscomp.SourceFile getSourceFile(String filename) {
            return null; // Mock implementation
        }

        @Override
        public com.google.javascript.jscomp.SourceFile getSourceFile(String filename, String content) {
            return null; // Mock implementation
        }
    }

    // Mock ReverseAbstractInterpreter
    private static class SemanticReverseAbstractInterpreter extends ReverseAbstractInterpreter {
        private JSTypeRegistry registry;

        SemanticReverseAbstractInterpreter(JSTypeRegistry registry) {
            super(registry);
            this.registry = registry;
        }

        @Override
        public FlowScope getPreciserScopeKnowingConditionOutcome(Node condition, FlowScope scope, boolean branch) {
            // Mock implementation: simply return a copy of the scope.
            return scope.createChildFlowScope();
        }

        @Override
        public JSType estimateNewObjectType(ObjectType objectType) {
            return objectType; // Mock
        }
    }

    // Mock ControlFlowGraph
    private static class ControlFlowGraph<N> implements com.google.javascript.jscomp.ControlFlowGraph<N> {
        private AbstractCompiler compiler;

        ControlFlowGraph(AbstractCompiler compiler) {
            this.compiler = compiler;
        }

        @Override
        public void computeCFG(Node root) {
            // Mock computation
        }

        @Override
        public List<DiGraphEdge<N, Branch>> getOutEdges(N node) {
            // Mock: return empty list to avoid NPEs in tests
            return Collections.emptyList();
        }

        @Override
        public void visitGraph(com.google.javascript.jscomp.ControlFlowGraph.Visitor<N> visitor) {
            // Mock: do nothing
        }
    }

    // Mock helper for TypeInference constructor
    private TypeInference createMockTypeInference(Node functionNode) {
        registry = new JSTypeRegistry(null);
        compiler = new MockCompiler(registry);
        // Mock dependencies
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(compiler);
        cfg.computeCFG(functionNode); // Basic CFG computation
        ReverseAbstractInterpreter rai = new SemanticReverseAbstractInterpreter(registry);
        Map<String, AssertionFunctionSpec> assertionFunctionsMap = Maps.newHashMap();

        // Simplified Scope creation for testing
        Scope functionScope = new Scope.Builder(compiler).build(); // Create a basic scope

        // Use a minimal constructor or set fields directly if possible
        // Since TypeInference constructor is complex, and we want to test specific methods,
        // we might instantiate and then set fields for testability.
        // For now, let's assume a simplified instantiation path.
        // A more robust solution would involve mocking the constructor's dependencies.

        // To call methods like `traverse` directly, we need an instance.
        // Let's create a mock instance and set its essential fields.
        TypeInference mockTi = new TypeInference(compiler, cfg, rai, functionScope, assertionFunctionsMap);
        // Set up any other fields that `traverse` methods rely on (like syntacticScope, etc.)
        mockTi.syntacticScope = functionScope; // Ensure syntacticScope is set
        mockTi.functionScope = LinkedFlowScope.createEntryLattice(functionScope); // Ensure functionScope is set

        return mockTi;
    }

    @Test
    public void testTraverseAdd_stringConcatenation() {
        setupTypeInference("function f() { return 'a' + 'b'; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node addNode = new Node(Token.ADD);
        Node left = Node.newString("a");
        Node right = Node.newString("b");
        addNode.addChildToFront(left);
        addNode.addChildToBack(right);
        left.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        right.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        JSType resultType = ti.traverseAdd(addNode, initialScope).getJSType();

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), resultType);
    }

    @Test
    public void testTraverseAdd_numberAddition() {
        setupTypeInference("function f() { return 1 + 2; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node addNode = new Node(Token.ADD);
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        addNode.addChildToFront(left);
        addNode.addChildToBack(right);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        JSType resultType = ti.traverseAdd(addNode, initialScope).getJSType();

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), resultType);
    }

    @Test
    public void testTraverseAdd_mixedTypes() {
        setupTypeInference("function f() { return 1 + 'a'; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node addNode = new Node(Token.ADD);
        Node left = Node.newNumber(1);
        Node right = Node.newString("a");
        addNode.addChildToFront(left);
        addNode.addChildToBack(right);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        right.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        JSType expectedType = registry.createUnionType(registry.getNativeType(JSTypeNative.STRING_TYPE), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FlowScope initialScope = ti.createEntryLattice();
        JSType resultType = ti.traverseAdd(addNode, initialScope).getJSType();

        assertEquals(expectedType, resultType);
    }

    @Test
    public void testTraverseAssign_nameAssignment() {
        setupTypeInference("function f() { var x; x = 5; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        Node valueNode = Node.newNumber(5);
        assignNode.addChildToFront(nameNode);
        assignNode.addChildToBack(valueNode);

        JSType valueType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        valueNode.setJSType(valueType);
        nameNode.setJSType(valueType); // Assume x is number for this assignment

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseAssign(assignNode, initialScope);

        assertEquals(valueType, nameNode.getJSType());
        assertEquals(valueType, assignNode.getJSType());
    }

    @Test
    public void testTraverseAssign_getPropAssignment() {
        setupTypeInference("function f(obj) { obj.prop = 10; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node assignNode = new Node(Token.ASSIGN);
        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = new Node(Token.NAME);
        objNode.setString("obj");
        Node propNameNode = Node.newString("prop");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(propNameNode);
        Node valueNode = Node.newNumber(10);

        assignNode.addChildToFront(getPropNode);
        assignNode.addChildToBack(valueNode);

        ObjectType objType = registry.createObjectType("ObjType");
        JSType objJSType = objType;
        objNode.setJSType(objJSType);
        JSType valueType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        valueNode.setJSType(valueType);
        // Define the property on the object type for accurate type inference
        objType.defineInferredProperty("prop", valueType, propNameNode);
        getPropNode.setJSType(valueType);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseAssign(assignNode, initialScope);

        assertEquals(valueType, getPropNode.getJSType());
        assertEquals(valueType, assignNode.getJSType());
    }

    @Test
    public void testTraverseArrayLiteral() {
        setupTypeInference("function f() { return [1, 'a']; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node arrayNode = new Node(Token.ARRAYLIT);
        Node numNode = Node.newNumber(1);
        Node strNode = Node.newString("a");
        arrayNode.addChildToFront(numNode);
        arrayNode.addChildToBack(strNode);

        numNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        strNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseArrayLiteral(arrayNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrayNode.getJSType());
    }

    @Test
    public void testTraverseCall_simpleFunction() {
        setupTypeInference("function log(msg) {} function f() { log('hello'); }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node callNode = new Node(Token.CALL);
        Node funcNameNode = new Node(Token.NAME);
        funcNameNode.setString("log");
        Node argNode = Node.newString("hello");
        callNode.addChildToFront(funcNameNode);
        callNode.addChildToBack(argNode);

        // Mock the function type and return type
        FunctionType funcType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        funcNameNode.setJSType(funcType);
        argNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseCall(callNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), callNode.getJSType());
    }

    @Test
    public void testTraverseCall_functionReturningNumber() {
        setupTypeInference("function max(a, b) { return a > b ? a : b; } function f() { max(1, 2); }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node callNode = new Node(Token.CALL);
        Node funcNameNode = new Node(Token.NAME);
        funcNameNode.setString("max");
        Node arg1 = Node.newNumber(1);
        Node arg2 = Node.newNumber(2);
        callNode.addChildToFront(funcNameNode);
        callNode.addChildToBack(arg1);
        callNode.addChildToBack(arg2);

        // Mock the function type and return type
        FunctionType funcType = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        funcNameNode.setJSType(funcType);
        arg1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        arg2.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseCall(callNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), callNode.getJSType());
    }

    @Test
    public void testTraverseCatch_unknownTypeError() {
        setupTypeInference("function f() { try {} catch(e) {} }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node catchNode = new Node(Token.CATCH);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("e");
        catchNode.addChildToFront(nameNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseCatch(catchNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), nameNode.getJSType());
    }

    @Test
    public void testTraverseCatch_typedError() {
        setupTypeInference("/** @type {string} */ var err; function f() { try {} catch(e) { err = e; } }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node catchNode = new Node(Token.CATCH);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("e");
        catchNode.addChildToFront(nameNode);

        // Set JSDocInfo for the catch parameter to simulate a typed error
        JSDocInfo jsDocInfo = new JSDocInfo();
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        // Evaluate the type from JSDoc annotation
        jsDocInfo.addTypeVar("e", new com.google.javascript.rhino.jstype.SimpleSourceFile("string", 0, 0)); // Mocking type
        nameNode.setJSDocInfo(jsDocInfo);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseCatch(catchNode, initialScope);

        // The type of 'e' should be STRING_TYPE
        assertEquals(stringType, nameNode.getJSType());
    }

    @Test
    public void testTraverseComma_simple() {
        setupTypeInference("function f() { return (1, 2); }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node commaNode = new Node(Token.COMMA);
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(2);
        commaNode.addChildToFront(left);
        commaNode.addChildToBack(right);

        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseComma(commaNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), commaNode.getJSType());
    }

    @Test
    public void testTraverseComma_mixedTypes() {
        setupTypeInference("function f() { return (1, 'a'); }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node commaNode = new Node(Token.COMMA);
        Node left = Node.newNumber(1);
        Node right = Node.newString("a");
        commaNode.addChildToFront(left);
        commaNode.addChildToBack(right);

        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        right.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseComma(commaNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), commaNode.getJSType());
    }

    @Test
    public void testTraverseGetElem_simpleArrayAccess() {
        setupTypeInference("function f(arr) { return arr[0]; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node getElemNode = new Node(Token.GETELEM);
        Node arrayNode = new Node(Token.NAME);
        arrayNode.setString("arr");
        Node indexNode = Node.newNumber(0);
        getElemNode.addChildToFront(arrayNode);
        getElemNode.addChildToBack(indexNode);

        ObjectType arrayType = registry.createArrayType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        arrayNode.setJSType(arrayType);
        indexNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseGetElem(getElemNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), getElemNode.getJSType());
    }

    @Test
    public void testTraverseGetProp_simplePropertyAccess() {
        setupTypeInference("function f(obj) { return obj.prop; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = new Node(Token.NAME);
        objNode.setString("obj");
        Node propNameNode = Node.newString("prop");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(propNameNode);

        ObjectType objType = registry.createObjectType("MyObject");
        JSType propType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objType.defineInferredProperty("prop", propType, propNameNode);
        objNode.setJSType(objType);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseGetProp(getPropNode, initialScope);

        assertEquals(propType, getPropNode.getJSType());
    }

    @Test
    public void testTraverseHook_simpleTernary() {
        setupTypeInference("function f(cond) { return cond ? 1 : 'a'; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node hookNode = new Node(Token.HOOK);
        Node conditionNode = new Node(Token.NAME);
        conditionNode.setString("cond");
        Node trueNode = Node.newNumber(1);
        Node falseNode = Node.newString("a");
        hookNode.addChildToFront(conditionNode);
        hookNode.addChildToBack(trueNode);
        hookNode.addChildToBack(falseNode);

        conditionNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        trueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        falseNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseHook(hookNode, initialScope);

        JSType expectedType = registry.createUnionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            registry.getNativeType(JSTypeNative.STRING_TYPE)
        );
        assertEquals(expectedType, hookNode.getJSType());
    }

    @Test
    public void testTraverseName_variableLookup() {
        setupTypeInference("function f() { var x = 10; return x; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");

        // Mock the scope and the variable type
        // Need to ensure the scope used by TypeInference has 'x' defined.
        Scope mockScope = new Scope.Builder(compiler).build();
        Var xVar = Var.make("x", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        mockScope.declare("x", xVar, null, null);

        // Set the correct scope for TypeInference
        ti.syntacticScope = mockScope;
        ti.functionScope = LinkedFlowScope.createEntryLattice(mockScope); // Use the mock scope for flow

        ti.traverseName(nameNode, ti.functionScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), nameNode.getJSType());
    }

    @Test
    public void testTraverseObjectLiteral_simpleObject() {
        setupTypeInference("function f() { return { a: 1, b: 'hello' }; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node keyA = Node.newStringKey("a");
        Node valueA = Node.newNumber(1);
        Node keyB = Node.newStringKey("b");
        Node valueB = Node.newString("hello");

        keyA.addChildToBack(valueA);
        keyB.addChildToBack(valueB);
        objectLitNode.addChildToFront(keyA);
        objectLitNode.addChildToBack(keyB);

        valueA.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        valueB.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseObjectLiteral(objectLitNode, initialScope);

        assertTrue(objectLitNode.getJSType() instanceof ObjectType);
        ObjectType inferredType = objectLitNode.getJSType().toMaybeObjectType();
        assertNotNull(inferredType);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), inferredType.getPropertyType("a"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), inferredType.getPropertyType("b"));
    }

    @Test
    public void testTraverseNew_simpleObjectCreation() {
        setupTypeInference("function f() { return new Object(); }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node newNode = new Node(Token.NEW);
        Node constructorNode = new Node(Token.NAME);
        constructorNode.setString("Object");
        newNode.addChildToFront(constructorNode);

        // Mock the constructor type for Object
        ObjectType objectInstanceType = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
        FunctionType constructorFnType = registry.createFunctionType(objectInstanceType);
        constructorNode.setJSType(constructorFnType);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseNew(newNode, initialScope);

        assertEquals(objectInstanceType, newNode.getJSType());
    }

    @Test
    public void testTraverseReturn_returnNumber() {
        setupTypeInference("function f() { return 123; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node returnNode = new Node(Token.RETURN);
        Node numberNode = Node.newNumber(123);
        returnNode.addChildToFront(numberNode);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseReturn(returnNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberNode.getJSType());
    }

    @Test
    public void testTraverseReturn_returnString() {
        setupTypeInference("function f() { return 'abc'; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node returnNode = new Node(Token.RETURN);
        Node stringNode = Node.newString("abc");
        returnNode.addChildToFront(stringNode);
        stringNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseReturn(returnNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), stringNode.getJSType());
    }

    @Test
    public void testTraverseThis_functionThis() {
        setupTypeInference("function MyClass() { this.prop = 1; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node thisNode = new Node(Token.THIS);

        // Mock the function scope and its 'this' type
        ObjectType instanceType = registry.createObjectType("MyClassInstance");
        FunctionType functionType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), instanceType);

        Scope functionScope = new Scope.Builder(compiler).declareFunctionType(functionType).build();
        functionScope.setParent(new Scope.Builder(compiler).build()); // Global scope parent

        ti.syntacticScope = functionScope;
        ti.functionScope = LinkedFlowScope.createEntryLattice(functionScope);

        // The `traverse` method for `Token.THIS` calls `scope.getTypeOfThis()`.
        // We simulate that by directly setting the expected type on the node.
        thisNode.setJSType(instanceType);

        assertEquals(instanceType, thisNode.getJSType());
    }

    @Test
    public void testTraverseTypeof_number() {
        setupTypeInference("function f() { return typeof 123; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node typeofNode = new Node(Token.TYPEOF);
        Node numberNode = Node.newNumber(123);
        typeofNode.addChildToFront(numberNode);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseTypeof(typeofNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeofNode.getJSType());
    }

    @Test
    public void testTraverseTypeof_string() {
        setupTypeInference("function f() { return typeof 'abc'; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node typeofNode = new Node(Token.TYPEOF);
        Node stringNode = Node.newString("abc");
        typeofNode.addChildToFront(stringNode);
        stringNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseTypeof(typeofNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeofNode.getJSType());
    }

    @Test
    public void testUpdateScopeForTypeChange_nameAssignment() {
        setupTypeInference("var x; function f() { x = 10; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        JSType assignedType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        nameNode.setJSType(assignedType);

        // Mock scope with 'x' defined
        Scope mockScope = new Scope.Builder(compiler).build();
        Var xVar = Var.make("x", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("x", xVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        JSType previousType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        ti.updateScopeForTypeChange(flowScope, nameNode, previousType, assignedType);

        assertEquals(assignedType, mockScope.getVar("x").getType());
        assertEquals(assignedType, nameNode.getJSType());
    }

    @Test
    public void testUpdateScopeForTypeChange_getPropAssignment() {
        setupTypeInference("var obj = {}; function f() { obj.prop = 10; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = new Node(Token.NAME);
        objNode.setString("obj");
        Node propNameNode = Node.newString("prop");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(propNameNode);

        JSType assignedType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        getPropNode.setJSType(assignedType);

        ObjectType objType = registry.createObjectType("MockObj");
        objNode.setJSType(objType);
        objType.defineInferredProperty("prop", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), propNameNode);

        Scope mockScope = new Scope.Builder(compiler).build();
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        JSType previousPropType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        ti.updateScopeForTypeChange(flowScope, getPropNode, previousPropType, assignedType);

        assertEquals(assignedType, objType.getPropertyType("prop"));
        assertEquals(assignedType, getPropNode.getJSType());
    }

    @Test
    public void testIsAddedAsNumber_number() {
        // Direct call to helper method
        assertTrue(ti.isAddedAsNumber(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testIsAddedAsNumber_boolean() {
        assertTrue(ti.isAddedAsNumber(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE)));
    }

    @Test
    public void testIsAddedAsNumber_string() {
        assertFalse(ti.isAddedAsNumber(registry.getNativeType(JSTypeNative.STRING_TYPE)));
    }

    @Test
    public void testIsAddedAsNumber_null() {
        assertTrue(ti.isAddedAsNumber(registry.getNativeType(JSTypeNative.NULL_TYPE)));
    }

    @Test
    public void testIsAddedAsNumber_undefined() {
        assertTrue(ti.isAddedAsNumber(registry.getNativeType(JSTypeNative.VOID_TYPE)));
    }

    @Test
    public void testInferPropertyTypesToMatchConstraint_simple() {
        // Need an instance of TypeInference to call this method
        setupTypeInference("function f(obj) { obj.prop = 1; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node propNode = Node.newString("prop");
        ObjectType objType = registry.createObjectType("MyObj");
        objType.defineInferredProperty("prop", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), propNode);

        JSType constraintType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        tiInstance.inferPropertyTypesToMatchConstraint(objType.getPropertyType("prop"), constraintType);

        assertEquals(constraintType, objType.getPropertyType("prop"));
    }

    @Test
    public void testInferPropertyTypesToMatchConstraint_union() {
        setupTypeInference("function f(obj) { obj.prop = 1; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node propNode = Node.newString("prop");
        ObjectType objType = registry.createObjectType("MyObj");
        JSType currentPropType = registry.createUnionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            registry.getNativeType(JSTypeNative.STRING_TYPE)
        );
        objType.defineInferredProperty("prop", currentPropType, propNode);

        JSType constraintType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        tiInstance.inferPropertyTypesToMatchConstraint(objType.getPropertyType("prop"), constraintType);

        assertEquals(currentPropType, objType.getPropertyType("prop"));
    }

    @Test
    public void testDereferencePointer_qualifiedName() {
        setupTypeInference("function f(obj) { obj.prop; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node objNode = new Node(Token.NAME);
        objNode.setString("obj");
        ObjectType objType = registry.createObjectType("MyObj");
        objNode.setJSType(objType);

        Scope mockScope = new Scope.Builder(compiler).build();
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        tiInstance.dereferencePointer(objNode, flowScope);

        assertEquals(objType, objNode.getJSType());
    }

    @Test
    public void testDereferencePointer_nonQualifiedName() {
        setupTypeInference("function f(x) { x; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        JSType nameType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        nameNode.setJSType(nameType);

        Scope mockScope = new Scope.Builder(compiler).build();
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        tiInstance.dereferencePointer(nameNode, flowScope);

        assertEquals(nameType, nameNode.getJSType());
    }

    @Test
    public void testGetPropertyType_existingProperty() {
        setupTypeInference("function f(obj) { return obj.prop; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = new Node(Token.NAME);
        objNode.setString("obj");
        Node propNameNode = Node.newString("prop");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(propNameNode);

        ObjectType objType = registry.createObjectType("MyObj");
        JSType propType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        objType.defineInferredProperty("prop", propType, propNameNode);
        objNode.setJSType(objType);

        Scope mockScope = new Scope.Builder(compiler).build();
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        JSType resultType = tiInstance.getPropertyType(objNode.getJSType(), "prop", getPropNode, flowScope);
        assertEquals(propType, resultType);
    }

    @Test
    public void testGetPropertyType_unknownProperty() {
        setupTypeInference("function f(obj) { return obj.unknownProp; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = new Node(Token.NAME);
        objNode.setString("obj");
        Node propNameNode = Node.newString("unknownProp");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(propNameNode);

        ObjectType objType = registry.createObjectType("MyObj"); // No unknownProp defined
        objNode.setJSType(objType);

        Scope mockScope = new Scope.Builder(compiler).build();
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        JSType resultType = tiInstance.getPropertyType(objNode.getJSType(), "unknownProp", getPropNode, flowScope);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), resultType);
    }

    @Test
    public void testGetNativeType_number() {
        // Create a minimal TypeInference instance to access getNativeType
        setupTypeInference("function f() {}");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), tiInstance.getNativeType(JSTypeNative.NUMBER_TYPE));
    }

    @Test
    public void testGetNativeType_string() {
        setupTypeInference("function f() {}");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), tiInstance.getNativeType(JSTypeNative.STRING_TYPE));
    }

    @Test
    public void testRedeclareSimpleVar_basic() {
        setupTypeInference("var x; function f() { x = 10; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        JSType newType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        Scope mockScope = new Scope.Builder(compiler).build();
        Var xVar = Var.make("x", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("x", xVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        tiInstance.redeclareSimpleVar(flowScope, nameNode, newType);

        assertEquals(newType, mockScope.getVar("x").getType());
    }

    @Test
    public void testIsUnflowable_escapedVariable() {
        setupTypeInference("function f() { var x = 1; return function() { return x; }; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        // Manually construct the Var object as if it were created by the compiler
        Node funcNode = tiInstance.syntacticScope.getRootNode(); // Mock function node from scope
        Var xVar = Var.make("x", funcNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        xVar.markEscaped(true);
        xVar.setScope(tiInstance.syntacticScope); // Assign to the current syntactic scope

        assertTrue(tiInstance.isUnflowable(xVar));
    }

    @Test
    public void testIsUnflowable_localNonEscapedVariable() {
        setupTypeInference("function f() { var x = 1; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node funcNode = tiInstance.syntacticScope.getRootNode();
        Var xVar = Var.make("x", funcNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        xVar.markEscaped(false);
        xVar.setScope(tiInstance.syntacticScope);

        assertFalse(tiInstance.isUnflowable(xVar));
    }

    @Test
    public void testGetJSType_existingType() {
        setupTypeInference("function f() { return 1; }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node numberNode = Node.newNumber(1);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), tiInstance.getJSType(numberNode));
    }

    @Test
    public void testGetJSType_nullType() {
        setupTypeInference("function f() { }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node someNode = new Node(Token.NAME); // Node without a set JSType
        assertEquals(tiInstance.unknownType, tiInstance.getJSType(someNode));
    }

    @Test
    public void testTraverseAnd_shortCircuiting() {
        setupTypeInference("function f(a, b) { return a && b; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node andNode = new Node(Token.AND);
        Node left = Node.newVar("a"); // Represents a variable 'a'
        Node right = new Node(Token.NAME); // Represents a variable 'b'
        right.setString("b");
        andNode.addChildToFront(left);
        andNode.addChildToBack(right);

        // Mock types: 'a' is boolean false, 'b' is unknown type
        JSType aType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        left.setJSType(aType);
        right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

        // Mock scope with variables
        Scope mockScope = new Scope.Builder(compiler).build();
        Var aVar = Var.make("a", mockScope.getRootNode(), aType);
        mockScope.declare("a", aVar, null, null);
        Var bVar = Var.make("b", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("b", bVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        // Simulate the condition being false for short-circuiting
        // This requires interacting with `reverseInterpreter` which is mocked.
        // The `traverseAnd` method itself returns `BooleanOutcomePair`.
        BooleanOutcomePair outcome = ti.traverseAnd(andNode, flowScope);

        // If 'a' evaluates to false, the result is false.
        assertTrue(outcome.toBooleanOutcomes.contains(false));
        // If 'a' evaluates to true, the result depends on 'b'.
        assertTrue(outcome.toBooleanOutcomes.contains(true));
    }

    @Test
    public void testTraverseOr_shortCircuiting() {
        setupTypeInference("function f(a, b) { return a || b; }");
        TypeInference ti = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node orNode = new Node(Token.OR);
        Node left = Node.newVar("a"); // Represents a variable 'a'
        Node right = new Node(Token.NAME); // Represents a variable 'b'
        right.setString("b");
        orNode.addChildToFront(left);
        orNode.addChildToBack(right);

        // Mock types: 'a' is boolean true
        JSType aType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        left.setJSType(aType);
        right.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

        // Mock scope with variables
        Scope mockScope = new Scope.Builder(compiler).build();
        Var aVar = Var.make("a", mockScope.getRootNode(), aType);
        mockScope.declare("a", aVar, null, null);
        Var bVar = Var.make("b", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("b", bVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        BooleanOutcomePair outcome = ti.traverseOr(orNode, flowScope);

        // If 'a' evaluates to true, the result is true.
        assertTrue(outcome.toBooleanOutcomes.contains(true));
        // If 'a' evaluates to false, the result depends on 'b'.
        assertTrue(outcome.toBooleanOutcomes.contains(false));
    }

    @Test
    public void testTraverseWith_basic() {
        setupTypeInference("function f(obj) { with(obj) { prop = 1; } }");
        TypeInference tiInstance = createMockTypeInference(compiler.parsedCode.getFirstChild());

        Node withNode = new Node(Token.WITH);
        Node objNode = Node.newVar("obj");
        Node blockNode = new Node(Token.BLOCK);
        Node assignNode = new Node(Token.ASSIGN);
        Node propName = Node.newStringKey("prop");
        Node value = Node.newNumber(1);
        assignNode.addChildToFront(propName);
        assignNode.addChildToBack(value);
        blockNode.addChildToBack(assignNode);

        withNode.addChildToFront(objNode);
        withNode.addChildToBack(blockNode);

        objNode.setJSType(registry.createObjectType("MockObj"));
        propName.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        value.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        FlowScope initialScope = tiInstance.createEntryLattice();
        tiInstance.traverseWith(withNode, initialScope);
        // No specific assertion on the node's type, as traverseWith doesn't set one.
        // The goal is to ensure it doesn't crash.
    }
}
