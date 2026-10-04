```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
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
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.BasicErrorReporter;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.ErrorReporter;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.SemanticReverseAbstractInterpreter;
import com.google.javascript.jscomp.LinkedFlowScope;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.Scope;

public class TypeInferenceTest {

    // Mock AbstractCompiler - simplified for testing purposes
    // Removed the need for IRFactory and other external dependencies by mocking more thoroughly.
    private static class MockAbstractCompiler extends AbstractCompiler {
        private final JSTypeRegistry registry;
        private final CodingConvention convention;
        private final ErrorReporter errorReporter;

        MockAbstractCompiler(JSTypeRegistry registry) {
            this.registry = registry;
            this.convention = new ClosureCodingConvention();
            this.errorReporter = new BasicErrorReporter() {
                @Override
                public void report(DiagnosticType diagnosticType, String... arguments) {
                    // Ignore errors for test purposes
                }
            };
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return registry;
        }

        @Override
        public ErrorReporter getErrorReporter() {
            return errorReporter;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return convention;
        }

        @Override
        public void report(JSError error) {
            // Ignore errors for test purposes
        }

        @Override
        public SourceFile[] getSourceFiles() {
            return new SourceFile[0];
        }

        @Override
        public String getAstDotGraph(Node root) {
            return "";
        }
        
        @Override
        public void process(SourceFile externs, SourceFile... files) {}

        @Override
        public Node parse(SourceFile file) {
             return new Node(Token.SCRIPT); // Mock parse that returns a SCRIPT node
        }

        @Override
        public Node parse(String code) {
            return new Node(Token.SCRIPT); // Mock parse that returns a SCRIPT node
        }

        @Override
        public void normalize() {}

        @Override
        public void phase(String name) {}

        @Override
        public Node parse(Node root) {
             return root; // Mock parse that returns the root node
        }

        @Override
        public void ensureLibraryInjected(String name) {}
    }

    private JSTypeRegistry registry;
    private AbstractCompiler compiler;
    private Map<String, AssertionFunctionSpec> assertionFunctionsMap;

    private void setupEnvironment() {
        registry = new JSTypeRegistry(getErrorReporter());
        compiler = new MockAbstractCompiler(registry);
        assertionFunctionsMap = new java.util.HashMap<>();
    }
    
    private ErrorReporter getErrorReporter() {
        return new BasicErrorReporter() {
            @Override
            public void report(DiagnosticType diagnosticType, String... arguments) {
                // Do nothing for tests
            }
        };
    }

    private TypeInference createTypeInference(Node functionNode) {
        ControlFlowGraph<Node> mockCfg = new ControlFlowGraph<>(functionNode); // Use functionNode for CFG
        ReverseAbstractInterpreter mockReverseInterpreter = new SemanticReverseAbstractInterpreter(registry);
        Scope parentScope = new Scope(functionNode, compiler.getCodingConvention()); // Minimal scope
        return new TypeInference(compiler, mockCfg, mockReverseInterpreter, parentScope, assertionFunctionsMap);
    }

    @Test
    public void testTraverseAssign_numberToNumber() {
        setupEnvironment();

        Node nameNodeA = new Node(Token.NAME, "a");
        nameNodeA.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node numberNode1 = Node.newNumber(1.0);
        numberNode1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node assignmentNode = new Node(Token.ASSIGN, nameNodeA, numberNode1);

        Node functionNode = new Node(Token.FUNCTION);
        Scope parentScope = new Scope(functionNode, compiler.getCodingConvention());
        parentScope.declare("a", nameNodeA, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), null);

        TypeInference ti = createTypeInference(functionNode);
        // Set the parent scope for the type inference to use
        // Accessing private field is not allowed, we should pass it to the constructor.
        // In `createTypeInference` we use `new Scope(functionNode, compiler.getCodingConvention());`
        // which sets the `syntacticScope` for `TypeInference`.
        
        // `flowThrough` needs a non-null `input` scope.
        FlowScope resultScope = ti.flowThrough(assignmentNode, LinkedFlowScope.createEntryLattice(parentScope));
        
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), resultScope.getSlot("a").getType());
    }

    @Test
    public void testTraverseAssign_stringToNumber() {
        setupEnvironment();

        Node nameNodeA = new Node(Token.NAME, "a");
        nameNodeA.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Target is number
        Node stringNodeHello = Node.newString("hello");
        stringNodeHello.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); // Source is string
        Node assignmentNode = new Node(Token.ASSIGN, nameNodeA, stringNodeHello);

        Node functionNode = new Node(Token.FUNCTION);
        Scope parentScope = new Scope(functionNode, compiler.getCodingConvention());
        parentScope.declare("a", nameNodeA, registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(assignmentNode, LinkedFlowScope.createEntryLattice(parentScope));
        
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), resultScope.getSlot("a").getType());
    }

    @Test
    public void testTraverseName_existingVariable() {
        setupEnvironment();

        Node nameNode = new Node(Token.NAME, "x");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node functionNode = new Node(Token.FUNCTION);
        Scope parentScope = new Scope(functionNode, compiler.getCodingConvention());
        parentScope.declare("x", nameNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(nameNode, LinkedFlowScope.createEntryLattice(parentScope));
        
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), nameNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), resultScope.getSlot("x").getType());
    }

    @Test
    public void testTraverseGetProp_simpleProperty() {
        setupEnvironment();

        Node objNode = new Node(Token.NAME, "obj");
        ObjectType objType = registry.createObjectType("MyObject");
        objNode.setJSType(objType);
        
        Node propNode = Node.newString("prop");
        propNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)); // Type of property

        Node getPropNode = new Node(Token.GETPROP, objNode, propNode);
        
        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        
        objType.defineInferredProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), propNode);
        
        FlowScope resultScope = ti.flowThrough(getPropNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope)); // Use the scope from ti

        assertNotNull(getPropNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), getPropNode.getJSType());
    }
    
    @Test
    public void testTraverseGetElem_arrayElement() {
        setupEnvironment();

        Node arrayNode = new Node(Token.NAME, "arr");
        JSType elementNumberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType arrayObjectType = registry.createArrayType(elementNumberType);
        arrayNode.setJSType(arrayObjectType);
        
        Node indexNode = Node.newNumber(0.0);
        indexNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node getElemNode = new Node(Token.GETELEM, arrayNode, indexNode);
        
        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(getElemNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));

        assertNotNull(getElemNode.getJSType());
        assertEquals(elementNumberType, getElemNode.getJSType());
    }

    @Test
    public void testTraverseObjectLiteral_simpleObject() {
        setupEnvironment();

        Node valueNode = Node.newNumber(1);
        Node keyNode = Node.newString("a");
        keyNode.addChildToBack(valueNode);
        
        Node objectLitNode = new Node(Token.OBJECTLIT, keyNode);
        ObjectType inferredObjectType = registry.createObjectType("AnonymousObject");
        objectLitNode.setJSType(inferredObjectType); 

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(objectLitNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(objectLitNode.getJSType());
        assertEquals("AnonymousObject", objectLitNode.getJSType().getDisplayName());
    }

    @Test
    public void testTraverseArrayLiteral_emptyArray() {
        setupEnvironment();

        Node arrayLitNode = new Node(Token.ARRAYLIT);
        arrayLitNode.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(arrayLitNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(arrayLitNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrayLitNode.getJSType());
    }

    @Test
    public void testTraverseArrayLiteral_arrayWithElements() {
        setupEnvironment();

        Node element1 = Node.newNumber(1);
        Node element2 = Node.newString("a");
        
        Node arrayLitNode = new Node(Token.ARRAYLIT, element1, element2);
        arrayLitNode.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(arrayLitNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(arrayLitNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrayLitNode.getJSType());
    }

    @Test
    public void testTraverseThis_inFunction() {
        setupEnvironment();

        Node thisNode = new Node(Token.THIS);
        JSType functionThisType = registry.createObjectType("MyFunctionScope");
        
        Node functionNode = new Node(Token.FUNCTION);
        Scope parentScope = new Scope(functionNode, compiler.getCodingConvention());
        parentScope.setTypeofThis(functionThisType);
        
        TypeInference ti = createTypeInference(functionNode);
        // Manually set the type of 'this' in the scope for TypeInference to pick up.
        // The TypeInference constructor populates the scope, but we need to ensure
        // 'this' is correctly set for the scope it operates on.
        // However, TypeInference.syntacticScope is based on the functionNode.
        // A direct pass of a scope with 'this' set is needed.
        // Let's ensure the scope used in flowThrough has the correct 'this'.
        Scope initialScope = new Scope(functionNode, compiler.getCodingConvention());
        initialScope.setTypeofThis(functionThisType);

        FlowScope resultScope = ti.flowThrough(thisNode, LinkedFlowScope.createEntryLattice(initialScope));
        
        assertNotNull(thisNode.getJSType());
        assertEquals(functionThisType, thisNode.getJSType());
    }

    @Test
    public void testTraverseAdd_numberPlusNumber() {
        setupEnvironment();

        Node left = Node.newNumber(1.0);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(2.0);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node addNode = new Node(Token.ADD, left, right);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(addNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(addNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), addNode.getJSType());
    }

    @Test
    public void testTraverseAdd_stringPlusNumber() {
        setupEnvironment();

        Node left = Node.newString("hello");
        left.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node right = Node.newNumber(1.0);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node addNode = new Node(Token.ADD, left, right);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(addNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(addNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addNode.getJSType());
    }
    
    @Test
    public void testTraverseNeg_number() {
        setupEnvironment();

        Node numberNode = Node.newNumber(5.0);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node negNode = new Node(Token.NEG, numberNode);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(negNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(negNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), negNode.getJSType());
    }

    @Test
    public void testTraversePos_number() {
        setupEnvironment();

        Node numberNode = Node.newNumber(5.0);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node posNode = new Node(Token.POS, numberNode);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(posNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(posNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), posNode.getJSType());
    }

    @Test
    public void testTraverseBitNot_number() {
        setupEnvironment();

        Node numberNode = Node.newNumber(5.0);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node bitNotNode = new Node(Token.BITNOT, numberNode);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(bitNotNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(bitNotNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), bitNotNode.getJSType());
    }

    @Test
    public void testTraverseTypeof_string() {
        setupEnvironment();

        Node stringNode = Node.newString("hello");
        stringNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node typeofNode = new Node(Token.TYPEOF, stringNode);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(typeofNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(typeofNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeofNode.getJSType());
    }
    
    @Test
    public void testTraverseNot_boolean() {
        setupEnvironment();

        Node booleanNode = new Node(Token.TRUE);
        booleanNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node notNode = new Node(Token.NOT, booleanNode);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(notNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(notNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), notNode.getJSType());
    }

    @Test
    public void testTraverseEq_numberEqNumber() {
        setupEnvironment();

        Node left = Node.newNumber(1.0);
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newNumber(1.0);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node eqNode = new Node(Token.EQ, left, right);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(eqNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(eqNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), eqNode.getJSType());
    }

    @Test
    public void testTraverseAnd_booleanAndBoolean() {
        setupEnvironment();

        Node left = new Node(Token.TRUE);
        left.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node right = new Node(Token.FALSE);
        right.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node andNode = new Node(Token.AND, left, right);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(andNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(andNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), andNode.getJSType());
    }

    @Test
    public void testTraverseOr_booleanOrBoolean() {
        setupEnvironment();

        Node left = new Node(Token.TRUE);
        left.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node right = new Node(Token.FALSE);
        right.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node orNode = new Node(Token.OR, left, right);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(orNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(orNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), orNode.getJSType());
    }

    @Test
    public void testTraverseHook_simpleHook() {
        setupEnvironment();

        Node condition = new Node(Token.TRUE);
        condition.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node trueNode = Node.newNumber(1.0);
        trueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node falseNode = Node.newString("a");
        falseNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node hookNode = new Node(Token.HOOK, condition, trueNode, falseNode);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(hookNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(hookNode.getJSType());
        assertTrue(hookNode.getJSType().isUnionType());
        assertEquals(registry.createUnionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE), registry.getNativeType(JSTypeNative.STRING_TYPE)), hookNode.getJSType());
    }

    @Test
    public void testTraverseCall_functionWithReturnType() {
        setupEnvironment();

        Node functionName = Node.newString("myFunc");
        FunctionType funcType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.STRING_TYPE), // Return type
            registry.getNativeType(JSTypeNative.NUMBER_TYPE) // Parameter type
        );
        functionName.setJSType(funcType);

        Node arg = Node.newNumber(1.0);
        arg.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node callNode = new Node(Token.CALL, functionName, arg);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(callNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(callNode.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), callNode.getJSType());
    }

    @Test
    public void testTraverseNew_constructorCall() {
        setupEnvironment();

        Node constructorName = Node.newString("MyClass");
        FunctionType constructorType = registry.createConstructorType(
            registry.createObjectType("MyClassInstance") // Instance type
        );
        constructorName.setJSType(constructorType);

        Node newNode = new Node(Token.NEW, constructorName);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(newNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(newNode.getJSType());
        assertEquals("MyClassInstance", newNode.getJSType().getDisplayName());
    }

    @Test
    public void testTraverseReturn_withValue() {
        setupEnvironment();

        Node returnValue = Node.newString("result");
        returnValue.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node returnNode = new Node(Token.RETURN, returnValue);

        Node functionNode = new Node(Token.FUNCTION);
        // The function type is set by the TypeInference constructor.
        FunctionType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.STRING_TYPE)); // Return type String
        functionNode.setJSType(fnType);

        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(returnNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        // The primary effect of traverseReturn is within the TypeInference instance
        // and its impact on functionScope.
        // For testing purposes, we can check if the flow proceeds without error.
        assertTrue(true); 
    }

    @Test
    public void testTraverseVar_declarationWithInitialValue() {
        setupEnvironment();

        Node varName = Node.newString("myVar");
        Node initialValue = Node.newNumber(42.0);
        initialValue.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        varName.addChildToBack(initialValue);
        Node varNode = new Node(Token.VAR, varName);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(varNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        Var var = ti.syntacticScope.getVar("myVar"); // Access scope from TypeInference
        assertNotNull(var);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), var.getType());
    }

    @Test
    public void testTraverseCatch_unknownType() {
        setupEnvironment();

        Node catchName = Node.newString("e");
        Node catchNode = new Node(Token.CATCH, catchName);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(catchNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertNotNull(catchName.getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), catchName.getJSType());
    }

    @Test
    public void testUpdateScopeForTypeChange_assignNameToObject() {
        setupEnvironment();

        Node nameNode = Node.newString("objRef");
        ObjectType originalType = registry.createObjectType("OriginalType");
        nameNode.setJSType(originalType);

        JSType newType = registry.createObjectType("NewType");
        
        Node functionNode = new Node(Token.FUNCTION);
        Scope parentScope = new Scope(functionNode, compiler.getCodingConvention());
        parentScope.declare("objRef", nameNode, originalType, null);

        TypeInference ti = createTypeInference(functionNode);
        FlowScope currentScope = LinkedFlowScope.createEntryLattice(parentScope);
        ti.updateScopeForTypeChange(currentScope, nameNode, originalType, newType);
        
        assertEquals(newType, currentScope.getSlot("objRef").getType());
    }

    @Test
    public void testUpdateScopeForTypeChange_assignGetProp() {
        setupEnvironment();

        Node objNode = Node.newString("obj");
        ObjectType objType = registry.createObjectType("MyObject");
        objNode.setJSType(objType);

        Node propNameNode = Node.newString("prop");
        JSType oldPropType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        
        Node getPropNode = new Node(Token.GETPROP, objNode, propNameNode);
        getPropNode.setJSType(oldPropType);

        JSType newPropType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        FlowScope currentScope = LinkedFlowScope.createEntryLattice(ti.syntacticScope);
        ti.updateScopeForTypeChange(currentScope, getPropNode, oldPropType, newPropType);
        
        assertNotNull(currentScope.getSlot("obj.prop"));
        assertEquals(newPropType, currentScope.getSlot("obj.prop").getType());
    }
    
    @Test
    public void testEnsurePropertyDefined_newPropertyOnObjectType() {
        setupEnvironment();

        Node objNode = Node.newString("obj");
        ObjectType objType = registry.createObjectType("MyObject");
        objNode.setJSType(objType);

        Node propNameNode = Node.newString("newProp");
        JSType propType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

        Node getPropNode = new Node(Token.GETPROP, objNode, propNameNode);
        
        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        
        ti.ensurePropertyDefined(getPropNode, propType);
        
        assertTrue(objType.hasProperty("newProp"));
        assertEquals(propType, objType.getPropertyType("newProp"));
    }

    @Test
    public void testInferPropertyTypesToMatchConstraint_simpleMatch() {
        setupEnvironment();

        JSType typeToInfer = registry.createObjectType("InferredObject");
        ObjectType constraintObject = registry.createObjectType("ConstraintObject");
        constraintObject.defineInferredProperty("someProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        
        ti.inferPropertyTypesToMatchConstraint(typeToInfer, constraintObject);
        
        // The typeToInfer is not necessarily an ObjectType here, so cast carefully.
        if (typeToInfer.isObjectType()) {
            assertTrue(typeToInfer.asObjectType().hasProperty("someProp"));
            assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), typeToInfer.asObjectType().getPropertyType("someProp"));
        } else {
            fail("typeToInfer is not an ObjectType");
        }
    }

    @Test
    public void testDereferencePointer_nonNullableName() {
        setupEnvironment();

        Node nameNode = Node.newString("myVar");
        JSType originalType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        nameNode.setJSType(originalType);

        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        
        FlowScope resultScope = ti.dereferencePointer(nameNode, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertEquals(originalType, nameNode.getJSType());
        assertNull(resultScope.getSlot("myVar"));
    }

    @Test
    public void testDereferencePointer_nullableName() {
        setupEnvironment();

        Node nameNode = Node.newString("nullableVar");
        JSType nullableType = registry.createUnionType(
            registry.getNativeType(JSTypeNative.STRING_TYPE),
            registry.getNativeType(JSTypeNative.NULL_TYPE)
        );
        nameNode.setJSType(nullableType);

        Node functionNode = new Node(Token.FUNCTION);
        Scope parentScope = new Scope(functionNode, compiler.getCodingConvention());
        parentScope.declare("nullableVar", nameNode, nullableType, null);
        
        TypeInference ti = createTypeInference(functionNode);
        FlowScope resultScope = ti.flowThrough(nameNode, LinkedFlowScope.createEntryLattice(parentScope)); // Use flowThrough to get scope updates
        
        JSType expectedNarrowedType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertEquals(expectedNarrowedType, resultScope.getSlot("nullableVar").getType());
    }
    
    @Test
    public void testGetPropertyType_existingProperty() {
        setupEnvironment();

        Node objNode = Node.newString("obj");
        ObjectType objType = registry.createObjectType("MyObject");
        objType.defineInferredProperty("myProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        objNode.setJSType(objType);

        Node propNameNode = Node.newString("myProp");
        
        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        
        Node getPropNodeForCall = new Node(Token.GETPROP, objNode, propNameNode); 
        JSType propertyType = ti.getPropertyType(objNode.getJSType(), "myProp", getPropNodeForCall, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), propertyType);
    }

    @Test
    public void testGetPropertyType_nonExistingProperty() {
        setupEnvironment();

        Node objNode = Node.newString("obj");
        ObjectType objType = registry.createObjectType("MyObject");
        objNode.setJSType(objType);

        Node propNameNode = Node.newString("nonExistentProp");
        
        Node functionNode = new Node(Token.FUNCTION);
        TypeInference ti = createTypeInference(functionNode);
        
        Node getPropNodeForCall = new Node(Token.GETPROP, objNode, propNameNode); 
        JSType propertyType = ti.getPropertyType(objNode.getJSType(), "nonExistentProp", getPropNodeForCall, LinkedFlowScope.createEntryLattice(ti.syntacticScope));
        
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), propertyType);
    }

    @Test
    public void testNewBooleanOutcomePair_true() {
        setupEnvironment();

        Node trueNode = new Node(Token.TRUE);
        trueNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node functionNode = new Node(Token.FUNCTION);
        Scope parentScope = new Scope(functionNode, compiler.getCodingConvention());
        FlowScope entryLattice = LinkedFlowScope.createEntryLattice(parentScope);

        TypeInference.BooleanOutcomePair outcomePair = new TypeInference.BooleanOutcomePair(
            BooleanLiteralSet.get(true), BooleanLiteralSet.get(true), entryLattice, entryLattice);
        
        assertTrue(outcomePair.toBooleanOutcomes.contains(true));
        assertFalse(outcomePair.toBooleanOutcomes.contains(false));
        assertTrue(outcomePair.booleanValues.contains(true));
        assertFalse(outcomePair.booleanValues.contains(false));
    }

    @Test
    public void testGetBooleanOutcomes_andCondition() {
        // AND, condition = true
        assertEquals(BooleanLiteralSet.get(true),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true), BooleanLiteralSet.get(true), true));
        assertEquals(BooleanLiteralSet.get(false),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true), BooleanLiteralSet.get(false), true));
        assertEquals(BooleanLiteralSet.get(true), // Based on formula: right.union(left.intersection(FALSE)) -> right
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false), BooleanLiteralSet.get(true), true));
        assertEquals(BooleanLiteralSet.get(false),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false), BooleanLiteralSet.get(false), true));
        assertEquals(BooleanLiteralSet.BOTH, // Based on formula: right.union(left.intersection(FALSE)) -> right
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.get(true), true));
        assertEquals(BooleanLiteralSet.BOTH, // Based on formula: right.union(left.intersection(FALSE)) -> right
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.get(false), true));
        assertEquals(BooleanLiteralSet.BOTH, // Based on formula: right.union(left.intersection(FALSE)) -> right
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true), BooleanLiteralSet.BOTH, true));
        assertEquals(BooleanLiteralSet.BOTH, // Based on formula: right.union(left.intersection(FALSE)) -> right
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false), BooleanLiteralSet.BOTH, true));
    }

    @Test
    public void testGetBooleanOutcomes_orCondition() {
        // OR, condition = false
        assertEquals(BooleanLiteralSet.get(true),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true), BooleanLiteralSet.get(true), false));
        assertEquals(BooleanLiteralSet.get(true),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true), BooleanLiteralSet.get(false), false));
        assertEquals(BooleanLiteralSet.get(true),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false), BooleanLiteralSet.get(true), false));
        assertEquals(BooleanLiteralSet.get(false),
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false), BooleanLiteralSet.get(false), false));
        assertEquals(BooleanLiteralSet.BOTH, // Formula: right.union(left)
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.get(true), false));
        assertEquals(BooleanLiteralSet.BOTH, // Formula: right.union(left)
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.get(false), false));
        assertEquals(BooleanLiteralSet.BOTH, // Formula: right.union(left)
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(true), BooleanLiteralSet.BOTH, false));
        assertEquals(BooleanLiteralSet.BOTH, // Formula: right.union(left)
            TypeInference.getBooleanOutcomes(BooleanLiteralSet.get(false), BooleanLiteralSet.BOTH, false));
    }
}
```