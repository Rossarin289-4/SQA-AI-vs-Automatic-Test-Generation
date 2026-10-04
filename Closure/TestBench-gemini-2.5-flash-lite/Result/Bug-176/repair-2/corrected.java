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
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TypeInferenceTest {

    private JSTypeRegistry registry;
    private MockCompiler compiler;
    private TypeInference ti;

    private void setupTypeInference(String code) {
        registry = new JSTypeRegistry(null);
        compiler = new MockCompiler(registry);
        Node root = compiler.parse(code);

        // Mock ControlFlowGraph
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(compiler);
        cfg.computeCFG(root);

        // Mock ReverseAbstractInterpreter
        ReverseAbstractInterpreter rai = new SemanticReverseAbstractInterpreter(registry);

        Map<String, AssertionFunctionSpec> assertionFunctionsMap = Maps.newHashMap();

        // Create a simplified Scope for testing purposes
        Scope functionScope = Scope.createGlobalScope(compiler); // Use createGlobalScope for a valid scope

        // Instantiate TypeInference with mocked dependencies
        ti = new TypeInference(compiler, cfg, rai, functionScope, assertionFunctionsMap);
        ti.syntacticScope = functionScope; // Ensure syntacticScope is set
        ti.functionScope = LinkedFlowScope.createEntryLattice(functionScope); // Ensure functionScope is set
    }

    // Mock AbstractCompiler for basic functionality
    private static class MockCompiler extends AbstractCompiler {
        private JSTypeRegistry registry;
        private Node parsedCode;

        MockCompiler(JSTypeRegistry registry) {
            this.registry = registry;
            this.parsedCode = null;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return registry;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new DefaultCodingConvention();
        }

        @Override
        public void report(DiagnosticType diagnosticType, Node... nodes) {}

        @Override
        public void process(Phase phase) {}

        @Override
        public Node parse(String code) {
            // Mock parsing: create a simple AST for testing.
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
            this.parsedCode = script;
            return script;
        }

        @Override
        public String getAstFileName() {
            return "test.js";
        }

        @Override
        public void setFileName(Node n, String fileName) {}

        @Override
        public CompilerOptions getOptions() {
            return new CompilerOptions();
        }

        @Override
        public JsMessage.Style getMessageStyle() {
            return JsMessage.Style.LEGACY;
        }

        @Override
        public SourceFile getSourceFile(String filename) { return null; }

        @Override
        public SourceFile getSourceFile(String filename, String content) { return null; }
        
        @Override
        public Node getParseTree() {
            return this.parsedCode;
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
            return scope.createChildFlowScope(); // Mock implementation
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
        public void computeCFG(Node root) {}

        @Override
        public List<DiGraphEdge<N, Branch>> getOutEdges(N node) {
            return Collections.emptyList(); // Mock: return empty list
        }

        @Override
        public void visitGraph(com.google.javascript.jscomp.ControlFlowGraph.Visitor<N> visitor) {}
    }

    // --- Helper methods to construct Nodes with Types ---
    private Node createNumberNode(double value) {
        Node node = Node.newNumber(value);
        node.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        return node;
    }

    private Node createStringNode(String value) {
        Node node = Node.newString(value);
        node.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        return node;
    }

    private Node createBooleanNode(boolean value) {
        Node node = value ? new Node(Token.TRUE) : new Node(Token.FALSE);
        node.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        return node;
    }

    private Node createNameNode(String name, JSType type) {
        Node node = new Node(Token.NAME);
        node.setString(name);
        node.setJSType(type);
        return node;
    }

    private Node createGetPropNode(Node obj, String propName, JSType propType) {
        Node propNode = Node.newString(propName);
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToFront(obj);
        getPropNode.addChildToBack(propNode);
        getPropNode.setJSType(propType);
        return getPropNode;
    }

    private ObjectType createObjectType(String name, Map<String, JSType> properties) {
        ObjectType objType = registry.createObjectType(name);
        for (Map.Entry<String, JSType> entry : properties.entrySet()) {
            Node propNameNode = Node.newString(entry.getKey());
            objType.defineInferredProperty(entry.getKey(), entry.getValue(), propNameNode);
        }
        return objType;
    }

    // --- Test Methods ---

    @Test
    public void testTraverseAdd_stringConcatenation() throws Exception {
        setupTypeInference("function f() { return 'a' + 'b'; }");
        Node addNode = new Node(Token.ADD);
        Node left = createStringNode("a");
        Node right = createStringNode("b");
        addNode.addChildToFront(left);
        addNode.addChildToBack(right);

        FlowScope initialScope = ti.createEntryLattice();
        JSType resultType = ti.traverseAdd(addNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), resultType);
    }

    @Test
    public void testTraverseAdd_numberAddition() throws Exception {
        setupTypeInference("function f() { return 1 + 2; }");
        Node addNode = new Node(Token.ADD);
        Node left = createNumberNode(1);
        Node right = createNumberNode(2);
        addNode.addChildToFront(left);
        addNode.addChildToBack(right);

        FlowScope initialScope = ti.createEntryLattice();
        JSType resultType = ti.traverseAdd(addNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), resultType);
    }

    @Test
    public void testTraverseAdd_mixedTypes() throws Exception {
        setupTypeInference("function f() { return 1 + 'a'; }");
        Node addNode = new Node(Token.ADD);
        Node left = createNumberNode(1);
        Node right = createStringNode("a");
        addNode.addChildToFront(left);
        addNode.addChildToBack(right);

        JSType expectedType = registry.createUnionType(registry.getNativeType(JSTypeNative.STRING_TYPE), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FlowScope initialScope = ti.createEntryLattice();
        JSType resultType = ti.traverseAdd(addNode, initialScope);

        assertEquals(expectedType, resultType);
    }

    @Test
    public void testTraverseAssign_nameAssignment() throws Exception {
        setupTypeInference("function f() { var x; x = 5; }");
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = createNameNode("x", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        Node valueNode = createNumberNode(5);
        assignNode.addChildToFront(nameNode);
        assignNode.addChildToBack(valueNode);

        // Set up scope for 'x'
        Scope mockScope = Scope.createGlobalScope(compiler);
        Var xVar = Var.make("x", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("x", xVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);
        ti.syntacticScope = mockScope; // Ensure ti uses the mocked scope
        ti.functionScope = flowScope;

        ti.traverseAssign(assignNode, flowScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), nameNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

    @Test
    public void testTraverseAssign_getPropAssignment() throws Exception {
        setupTypeInference("function f(obj) { obj.prop = 10; }");
        Node assignNode = new Node(Token.ASSIGN);
        ObjectType objType = createObjectType("ObjType", Collections.singletonMap("prop", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)));
        Node objNode = createNameNode("obj", objType);
        Node getPropNode = createGetPropNode(objNode, "prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node valueNode = createNumberNode(10);

        assignNode.addChildToFront(getPropNode);
        assignNode.addChildToBack(valueNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseAssign(assignNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), getPropNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

    @Test
    public void testTraverseArrayLiteral() throws Exception {
        setupTypeInference("function f() { return [1, 'a']; }");
        Node arrayNode = new Node(Token.ARRAYLIT);
        Node numNode = createNumberNode(1);
        Node strNode = createStringNode("a");
        arrayNode.addChildToFront(numNode);
        arrayNode.addChildToBack(strNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseArrayLiteral(arrayNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrayNode.getJSType());
    }

    @Test
    public void testTraverseCall_simpleFunction() throws Exception {
        setupTypeInference("function log(msg) {} function f() { log('hello'); }");
        Node callNode = new Node(Token.CALL);
        Node funcNameNode = createNameNode("log", registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE)));
        Node argNode = createStringNode("hello");
        callNode.addChildToFront(funcNameNode);
        callNode.addChildToBack(argNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseCall(callNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), callNode.getJSType());
    }

    @Test
    public void testTraverseCall_functionReturningNumber() throws Exception {
        setupTypeInference("function max(a, b) { return a > b ? a : b; } function f() { max(1, 2); }");
        Node callNode = new Node(Token.CALL);
        Node funcNameNode = createNameNode("max", registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        Node arg1 = createNumberNode(1);
        Node arg2 = createNumberNode(2);
        callNode.addChildToFront(funcNameNode);
        callNode.addChildToBack(arg1);
        callNode.addChildToBack(arg2);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseCall(callNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), callNode.getJSType());
    }

    @Test
    public void testTraverseCatch_unknownTypeError() throws Exception {
        setupTypeInference("function f() { try {} catch(e) {} }");
        Node catchNode = new Node(Token.CATCH);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("e");
        catchNode.addChildToFront(nameNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseCatch(catchNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), nameNode.getJSType());
    }

    @Test
    public void testTraverseCatch_typedError() throws Exception {
        setupTypeInference("/** @type {string} */ var err; function f() { try {} catch(e) { err = e; } }");
        Node catchNode = new Node(Token.CATCH);
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("e");
        catchNode.addChildToFront(nameNode);

        // Simulate JSDocInfo by directly setting the type
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addStringType("string"); // Representing @type {string}
        nameNode.setJSDocInfo(jsDocInfo);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseCatch(catchNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), nameNode.getJSType());
    }

    @Test
    public void testTraverseComma_simple() throws Exception {
        setupTypeInference("function f() { return (1, 2); }");
        Node commaNode = new Node(Token.COMMA);
        Node left = createNumberNode(1);
        Node right = createNumberNode(2);
        commaNode.addChildToFront(left);
        commaNode.addChildToBack(right);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseComma(commaNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), commaNode.getJSType());
    }

    @Test
    public void testTraverseComma_mixedTypes() throws Exception {
        setupTypeInference("function f() { return (1, 'a'); }");
        Node commaNode = new Node(Token.COMMA);
        Node left = createNumberNode(1);
        Node right = createStringNode("a");
        commaNode.addChildToFront(left);
        commaNode.addChildToBack(right);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseComma(commaNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), commaNode.getJSType());
    }

    @Test
    public void testTraverseGetElem_simpleArrayAccess() throws Exception {
        setupTypeInference("function f(arr) { return arr[0]; }");
        Node getElemNode = new Node(Token.GETELEM);
        ObjectType arrayType = registry.createArrayType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node arrayNode = createNameNode("arr", arrayType);
        Node indexNode = createNumberNode(0);
        getElemNode.addChildToFront(arrayNode);
        getElemNode.addChildToBack(indexNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseGetElem(getElemNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), getElemNode.getJSType());
    }

    @Test
    public void testTraverseGetProp_simplePropertyAccess() throws Exception {
        setupTypeInference("function f(obj) { return obj.prop; }");
        Node getPropNode = new Node(Token.GETPROP);
        ObjectType objType = createObjectType("MyObject", Collections.singletonMap("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        Node objNode = createNameNode("obj", objType);
        Node propNameNode = Node.newString("prop");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(propNameNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseGetProp(getPropNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), getPropNode.getJSType());
    }

    @Test
    public void testTraverseHook_simpleTernary() throws Exception {
        setupTypeInference("function f(cond) { return cond ? 1 : 'a'; }");
        Node hookNode = new Node(Token.HOOK);
        Node conditionNode = createBooleanNode(true); // Mock condition as boolean
        Node trueNode = createNumberNode(1);
        Node falseNode = createStringNode("a");
        hookNode.addChildToFront(conditionNode);
        hookNode.addChildToBack(trueNode);
        hookNode.addChildToBack(falseNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseHook(hookNode, initialScope);

        JSType expectedType = registry.createUnionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            registry.getNativeType(JSTypeNative.STRING_TYPE)
        );
        assertEquals(expectedType, hookNode.getJSType());
    }

    @Test
    public void testTraverseName_variableLookup() throws Exception {
        setupTypeInference("function f() { var x = 10; return x; }");
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");

        Scope mockScope = Scope.createGlobalScope(compiler);
        Var xVar = Var.make("x", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        mockScope.declare("x", xVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);
        ti.syntacticScope = mockScope; // Ensure ti uses the mocked scope
        ti.functionScope = flowScope;

        ti.traverseName(nameNode, flowScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), nameNode.getJSType());
    }

    @Test
    public void testTraverseObjectLiteral_simpleObject() throws Exception {
        setupTypeInference("function f() { return { a: 1, b: 'hello' }; }");
        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node keyA = Node.newStringKey("a");
        Node valueA = createNumberNode(1);
        Node keyB = Node.newStringKey("b");
        Node valueB = createStringNode("hello");

        keyA.addChildToBack(valueA);
        keyB.addChildToBack(valueB);
        objectLitNode.addChildToFront(keyA);
        objectLitNode.addChildToBack(keyB);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseObjectLiteral(objectLitNode, initialScope);

        assertTrue(objectLitNode.getJSType() instanceof ObjectType);
        ObjectType inferredType = objectLitNode.getJSType().toMaybeObjectType();
        assertNotNull(inferredType);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), inferredType.getPropertyType("a"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), inferredType.getPropertyType("b"));
    }

    @Test
    public void testTraverseNew_simpleObjectCreation() throws Exception {
        setupTypeInference("function f() { return new Object(); }");
        Node newNode = new Node(Token.NEW);
        // Mock the constructor type for Object
        ObjectType objectInstanceType = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
        FunctionType constructorFnType = registry.createFunctionType(objectInstanceType);
        Node constructorNode = createNameNode("Object", constructorFnType);
        newNode.addChildToFront(constructorNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseNew(newNode, initialScope);

        assertEquals(objectInstanceType, newNode.getJSType());
    }

    @Test
    public void testTraverseReturn_returnNumber() throws Exception {
        setupTypeInference("function f() { return 123; }");
        Node returnNode = new Node(Token.RETURN);
        Node numberNode = createNumberNode(123);
        returnNode.addChildToFront(numberNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseReturn(returnNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numberNode.getJSType());
    }

    @Test
    public void testTraverseReturn_returnString() throws Exception {
        setupTypeInference("function f() { return 'abc'; }");
        Node returnNode = new Node(Token.RETURN);
        Node stringNode = createStringNode("abc");
        returnNode.addChildToFront(stringNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseReturn(returnNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), stringNode.getJSType());
    }

    @Test
    public void testTraverseThis_functionThis() throws Exception {
        setupTypeInference("function MyClass() { this.prop = 1; }");
        Node thisNode = new Node(Token.THIS);

        // Mock the function scope and its 'this' type
        ObjectType instanceType = registry.createObjectType("MyClassInstance");
        FunctionType functionType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE), instanceType);

        Scope functionScope = Scope.createGlobalScope(compiler); // A valid scope
        Var thisVar = Var.make("this", functionScope.getRootNode(), instanceType);
        functionScope.declare("this", thisVar, null, null); // Declare 'this' in the scope

        ti.syntacticScope = functionScope;
        ti.functionScope = LinkedFlowScope.createEntryLattice(functionScope);

        ti.traverseName(thisNode, ti.functionScope); // traverseName handles Token.THIS

        assertEquals(instanceType, thisNode.getJSType());
    }

    @Test
    public void testTraverseTypeof_number() throws Exception {
        setupTypeInference("function f() { return typeof 123; }");
        Node typeofNode = new Node(Token.TYPEOF);
        Node numberNode = createNumberNode(123);
        typeofNode.addChildToFront(numberNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseTypeof(typeofNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeofNode.getJSType());
    }

    @Test
    public void testTraverseTypeof_string() throws Exception {
        setupTypeInference("function f() { return typeof 'abc'; }");
        Node typeofNode = new Node(Token.TYPEOF);
        Node stringNode = createStringNode("abc");
        typeofNode.addChildToFront(stringNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseTypeof(typeofNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeofNode.getJSType());
    }

    @Test
    public void testUpdateScopeForTypeChange_nameAssignment() throws Exception {
        setupTypeInference("var x; function f() { x = 10; }");
        Node nameNode = createNameNode("x", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        JSType assignedType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        // Mock scope with 'x' defined
        Scope mockScope = Scope.createGlobalScope(compiler);
        Var xVar = Var.make("x", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("x", xVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);
        ti.syntacticScope = mockScope; // Ensure ti uses the mocked scope

        JSType previousType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        ti.updateScopeForTypeChange(flowScope, nameNode, previousType, assignedType);

        assertEquals(assignedType, mockScope.getVar("x").getType());
    }

    @Test
    public void testUpdateScopeForTypeChange_getPropAssignment() throws Exception {
        setupTypeInference("var obj = {}; function f() { obj.prop = 10; }");
        ObjectType objType = createObjectType("MockObj", Collections.singletonMap("prop", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)));
        Node objNode = createNameNode("obj", objType);
        Node getPropNode = createGetPropNode(objNode, "prop", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        JSType assignedType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        getPropNode.setJSType(assignedType); // Set the type of the prop access

        Scope mockScope = Scope.createGlobalScope(compiler);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        JSType previousPropType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        ti.updateScopeForTypeChange(flowScope, getPropNode, previousPropType, assignedType);

        assertEquals(assignedType, objType.getPropertyType("prop"));
    }

    @Test
    public void testIsAddedAsNumber_number() {
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
        Node propNode = Node.newString("prop");
        ObjectType objType = createObjectType("MyObj", Collections.singletonMap("prop", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)));

        JSType constraintType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ti.inferPropertyTypesToMatchConstraint(objType.getPropertyType("prop"), constraintType);

        assertEquals(constraintType, objType.getPropertyType("prop"));
    }

    @Test
    public void testInferPropertyTypesToMatchConstraint_union() {
        Node propNode = Node.newString("prop");
        ObjectType objType = createObjectType("MyObj", Collections.singletonMap("prop",
            registry.createUnionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE), registry.getNativeType(JSTypeNative.STRING_TYPE))
        ));

        JSType constraintType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ti.inferPropertyTypesToMatchConstraint(objType.getPropertyType("prop"), constraintType);

        assertEquals(registry.createUnionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE), registry.getNativeType(JSTypeNative.STRING_TYPE)), objType.getPropertyType("prop"));
    }

    @Test
    public void testDereferencePointer_qualifiedName() {
        setupTypeInference("function f(obj) { obj.prop; }");
        Node objNode = createNameNode("obj", registry.createObjectType("MyObj"));
        Node getPropNode = createGetPropNode(objNode, "prop", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

        Scope mockScope = Scope.createGlobalScope(compiler);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        ti.dereferencePointer(objNode, flowScope); // Test on the object node
        // The dereferencePointer is meant to narrow the scope of the *object itself* if it's qualified.
        // It doesn't directly change the type of objNode in this specific scenario.
        // The method is more about updating the FlowScope.
    }

    @Test
    public void testDereferencePointer_nonQualifiedName() {
        setupTypeInference("function f(x) { x; }");
        Node nameNode = createNameNode("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Scope mockScope = Scope.createGlobalScope(compiler);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        ti.dereferencePointer(nameNode, flowScope); // Test on a non-qualified name
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), nameNode.getJSType()); // Type should remain unchanged
    }

    @Test
    public void testGetPropertyType_existingProperty() {
        ObjectType objType = createObjectType("MyObj", Collections.singletonMap("prop", registry.getNativeType(JSTypeNative.STRING_TYPE)));
        Node objNode = createNameNode("obj", objType);
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(Node.newString("prop"));

        Scope mockScope = Scope.createGlobalScope(compiler);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        JSType resultType = ti.getPropertyType(objNode.getJSType(), "prop", getPropNode, flowScope);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), resultType);
    }

    @Test
    public void testGetPropertyType_unknownProperty() {
        ObjectType objType = createObjectType("MyObj", Collections.emptyMap());
        Node objNode = createNameNode("obj", objType);
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToBack(Node.newString("unknownProp"));

        Scope mockScope = Scope.createGlobalScope(compiler);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);

        JSType resultType = ti.getPropertyType(objNode.getJSType(), "unknownProp", getPropNode, flowScope);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), resultType);
    }

    @Test
    public void testGetNativeType_number() {
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), ti.getNativeType(JSTypeNative.NUMBER_TYPE));
    }

    @Test
    public void testGetNativeType_string() {
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), ti.getNativeType(JSTypeNative.STRING_TYPE));
    }

    @Test
    public void testRedeclareSimpleVar_basic() {
        setupTypeInference("var x;");
        Node nameNode = new Node(Token.NAME);
        nameNode.setString("x");
        JSType newType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        Scope mockScope = Scope.createGlobalScope(compiler);
        Var xVar = Var.make("x", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("x", xVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);
        ti.syntacticScope = mockScope;

        ti.redeclareSimpleVar(flowScope, nameNode, newType);

        assertEquals(newType, mockScope.getVar("x").getType());
    }

    @Test
    public void testIsUnflowable_escapedVariable() {
        setupTypeInference("function f() { var x = 1; return function() { return x; }; }");
        Var xVar = Var.make("x", ti.syntacticScope.getRootNode(), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        xVar.markEscaped(true);
        xVar.setScope(ti.syntacticScope);

        assertTrue(ti.isUnflowable(xVar));
    }

    @Test
    public void testIsUnflowable_localNonEscapedVariable() {
        setupTypeInference("function f() { var x = 1; }");
        Var xVar = Var.make("x", ti.syntacticScope.getRootNode(), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        xVar.markEscaped(false);
        xVar.setScope(ti.syntacticScope);

        assertFalse(ti.isUnflowable(xVar));
    }

    @Test
    public void testGetJSType_existingType() {
        Node numberNode = Node.newNumber(1);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), ti.getJSType(numberNode));
    }

    @Test
    public void testGetJSType_nullType() {
        Node someNode = new Node(Token.NAME); // Node without a set JSType
        assertEquals(ti.unknownType, ti.getJSType(someNode));
    }

    @Test
    public void testTraverseAnd_shortCircuiting() throws Exception {
        setupTypeInference("function f(a, b) { return a && b; }");
        Node andNode = new Node(Token.AND);
        Node left = createBooleanNode(false);
        Node right = createNameNode("b", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        andNode.addChildToFront(left);
        andNode.addChildToBack(right);

        // Mock scope with variables
        Scope mockScope = Scope.createGlobalScope(compiler);
        Var aVar = Var.make("a", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        mockScope.declare("a", aVar, null, null);
        Var bVar = Var.make("b", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("b", bVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);
        ti.syntacticScope = mockScope;

        BooleanOutcomePair outcome = ti.traverseAnd(andNode, flowScope);

        assertTrue(outcome.toBooleanOutcomes.contains(false)); // Since left is false, result is false
    }

    @Test
    public void testTraverseOr_shortCircuiting() throws Exception {
        setupTypeInference("function f(a, b) { return a || b; }");
        Node orNode = new Node(Token.OR);
        Node left = createBooleanNode(true);
        Node right = createNameNode("b", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        orNode.addChildToFront(left);
        orNode.addChildToBack(right);

        // Mock scope with variables
        Scope mockScope = Scope.createGlobalScope(compiler);
        Var aVar = Var.make("a", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        mockScope.declare("a", aVar, null, null);
        Var bVar = Var.make("b", mockScope.getRootNode(), registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        mockScope.declare("b", bVar, null, null);
        FlowScope flowScope = LinkedFlowScope.createEntryLattice(mockScope);
        ti.syntacticScope = mockScope;

        BooleanOutcomePair outcome = ti.traverseOr(orNode, flowScope);

        assertTrue(outcome.toBooleanOutcomes.contains(true)); // Since left is true, result is true
    }

    @Test
    public void testTraverseWith_basic() throws Exception {
        setupTypeInference("function f(obj) { with(obj) { prop = 1; } }");
        Node withNode = new Node(Token.WITH);
        Node objNode = createNameNode("obj", registry.createObjectType("MockObj"));
        Node blockNode = new Node(Token.BLOCK);
        Node assignNode = new Node(Token.ASSIGN);
        Node propName = Node.newStringKey("prop");
        Node value = createNumberNode(1);
        assignNode.addChildToFront(propName);
        assignNode.addChildToBack(value);
        blockNode.addChildToBack(assignNode);

        withNode.addChildToFront(objNode);
        withNode.addChildToBack(blockNode);

        FlowScope initialScope = ti.createEntryLattice();
        ti.traverseWith(withNode, initialScope);
    }
}
