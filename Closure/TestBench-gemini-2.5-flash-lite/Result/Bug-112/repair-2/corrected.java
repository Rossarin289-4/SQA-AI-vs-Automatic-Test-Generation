package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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

public class TypeInferenceTest {

    private JSTypeRegistry registry = new JSTypeRegistry(null);
    private Node unknownTypeNode = new Node(Token.ERROR); // Placeholder
    private JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    private Node scriptNode = new Node(Token.SCRIPT);
    private Scope globalScope = Scope.createGlobalScope(scriptNode);
    private TypeInference typeInference;

    // Mock AbstractCompiler for ControlFlowGraph constructor
    private static class MockAbstractCompiler extends AbstractCompiler {
        MockAbstractCompiler() {
            super(null, null, null, null);
        }
        @Override public JSTypeRegistry getTypeRegistry() { return registry; }
        @Override public CodingConvention getCodingConvention() { return new CodingConvention.DefaultCodingConvention(); }
    }

    private void setupInference(Node root, Scope scope) {
        AbstractCompiler compiler = new MockAbstractCompiler();
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(compiler, root, false);
        ReverseAbstractInterpreter rai = null; // Dummy for now
        FlowScope functionScope = LinkedFlowScope.createEntryLattice(scope);
        Map<String, AssertionFunctionSpec> assertionFunctionsMap = Maps.newHashMap();
        typeInference = new TypeInference(compiler, cfg, rai, scope, assertionFunctionsMap);
        // Accessing private fields directly for test setup.
        typeInference.bottomScope = LinkedFlowScope.createEntryLattice(scope);
        typeInference.functionScope = LinkedFlowScope.createEntryLattice(scope);
    }

    @Test
    public void testPredicate_apply_keyContained() {
        TemplateType templateType1 = registry.createTemplateType("T1");
        TemplateType templateType2 = registry.createTemplateType("T2");
        ImmutableList<TemplateType> keys = ImmutableList.of(templateType1, templateType2);

        Predicate<TemplateType> predicate = new Predicate<TemplateType>() {
            @Override
            public boolean apply(TemplateType key) {
                return keys.contains(key);
            }
        };

        assertTrue(predicate.apply(templateType1));
    }

    @Test
    public void testPredicate_apply_keyNotContained() {
        TemplateType templateType1 = registry.createTemplateType("T1");
        TemplateType templateType2 = registry.createTemplateType("T2");
        ImmutableList<TemplateType> keys = ImmutableList.of(templateType1, templateType2);

        Predicate<TemplateType> predicate = new Predicate<TemplateType>() {
            @Override
            public boolean apply(TemplateType key) {
                return keys.contains(key);
            }
        };

        TemplateType templateType3 = registry.createTemplateType("T3");
        assertFalse(predicate.apply(templateType3));
    }

    @Test
    public void testPredicate_apply_emptyKeys() {
        ImmutableList<TemplateType> keys = ImmutableList.of();

        Predicate<TemplateType> predicate = new Predicate<TemplateType>() {
            @Override
            public boolean apply(TemplateType key) {
                return keys.contains(key);
            }
        };

        TemplateType templateType1 = registry.createTemplateType("T1");
        assertFalse(predicate.apply(templateType1));
    }

    @Test
    public void testPredicate_apply_nullKey() {
        ImmutableList<TemplateType> keys = ImmutableList.of(registry.createTemplateType("T1"));

        Predicate<TemplateType> predicate = new Predicate<TemplateType>() {
            @Override
            public boolean apply(TemplateType key) {
                return keys.contains(key);
            }
        };

        assertFalse(predicate.apply(null));
    }

    @Test
    public void testInferArguments_withParameterTypes() {
        Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "fn"));
        Node paramList = new Node(Token.PARAM_LIST);
        Node param1 = new Node(Token.NAME, "a");
        Node param2 = new Node(Token.NAME, "b");
        paramList.addChildToBack(param1);
        paramList.addChildToBack(param2);
        functionNode.addChildToBack(paramList);

        FunctionType mockFunctionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            registry.getNativeType(JSTypeNative.STRING_TYPE)
        );
        functionNode.setJSType(mockFunctionType);

        Scope scope = Scope.createGlobalScope(functionNode); // Use createGlobalScope for simplicity
        Var varA = scope.declare("a", param1, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), null, false);
        Var varB = scope.declare("b", param2, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), null, false);

        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        ti.inferArguments(scope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), varA.getType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), varB.getType());
    }

    @Test
    public void testInferArguments_noParameterTypes_IIFE() {
        Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "fn"));
        Node paramList = new Node(Token.PARAM_LIST);
        Node param1 = new Node(Token.NAME, "a");
        paramList.addChildToBack(param1);
        functionNode.addChildToBack(paramList);

        Node iifeArg = Node.newNumber(123);
        iifeArg.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node iifeCall = new Node(Token.CALL, iifeArg); // Changed to simulate call context for IIFE

        FunctionType mockFunctionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE));
        functionNode.setJSType(mockFunctionType);

        Scope scope = Scope.createGlobalScope(functionNode);
        Var varA = scope.declare("a", param1, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), null, false);

        // Simulate IIFE by attaching functionNode to a call node
        Node callForIIFE = new Node(Token.CALL, functionNode, iifeCall);
        functionNode.setParent(callForIIFE); // Set parent for potential NodeUtil calls

        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        // The inferArguments method expects the functionNode to be part of the scope's root
        ti.functionScope.getRootNode().replaceChild(functionNode.getParent(), callForIIFE); // Replace in scope's root
        ti.inferArguments(scope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), varA.getType());
    }


    @Test
    public void testInferArguments_noParameterTypes_noIIFE() {
        Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "fn"));
        Node paramList = new Node(Token.PARAM_LIST);
        Node param1 = new Node(Token.NAME, "a");
        paramList.addChildToBack(param1);
        functionNode.addChildToBack(paramList);

        FunctionType mockFunctionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE));
        functionNode.setJSType(mockFunctionType);

        Scope scope = Scope.createGlobalScope(functionNode);
        Var varA = scope.declare("a", param1, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), null, false);

        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        ti.inferArguments(scope);

        assertEquals(unknownType, varA.getType());
    }

    @Test
    public void testInferArguments_alreadyInferred() {
        Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "fn"));
        Node paramList = new Node(Token.PARAM_LIST);
        Node param1 = new Node(Token.NAME, "a");
        paramList.addChildToBack(param1);
        functionNode.addChildToBack(paramList);

        FunctionType mockFunctionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)
        );
        functionNode.setJSType(mockFunctionType);

        Scope scope = Scope.createGlobalScope(functionNode);
        Node paramNode = new Node(Token.NAME, "a");
        Var varA = scope.declare("a", paramNode, registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), null, false);

        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        ti.inferArguments(scope);

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), varA.getType());
    }

    @Test
    public void testInferArguments_varIsUnflowable() {
        Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "fn"));
        Node paramList = new Node(Token.PARAM_LIST);
        Node param1 = new Node(Token.NAME, "a");
        paramList.addChildToBack(param1);
        functionNode.addChildToBack(paramList);

        FunctionType mockFunctionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)
        );
        functionNode.setJSType(mockFunctionType);

        Scope scope = Scope.createGlobalScope(functionNode);
        Node paramNode = new Node(Token.NAME, "a");
        Var varA = scope.declare("a", paramNode, unknownType, null, false);
        varA.setLocal(true);
        varA.setMarkedEscaped(true);
        varA.setScope(scope);

        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        ti.inferArguments(scope);

        assertEquals(unknownType, varA.getType());
    }


    @Test
    public void testTraverseReturn_withReturnValue() {
        Node returnNode = new Node(Token.RETURN, Node.newNumber(10));
        returnNode.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        FunctionType mockFunctionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node functionRoot = new Node(Token.FUNCTION, new Node(Token.NAME, "fn"));
        functionRoot.setJSType(mockFunctionType);
        Scope scope = Scope.createGlobalScope(functionRoot);

        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        ti.functionScope.getRootNode().setJSType(mockFunctionType);

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseReturn(returnNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), mockFunctionType.getReturnType());
    }

    @Test
    public void testTraverseReturn_noReturnValue() {
        Node returnNode = new Node(Token.RETURN);
        FunctionType mockFunctionType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE));
        Node functionRoot = new Node(Token.FUNCTION, new Node(Token.NAME, "fn"));
        functionRoot.setJSType(mockFunctionType);
        Scope scope = Scope.createGlobalScope(functionRoot);

        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        ti.functionScope.getRootNode().setJSType(mockFunctionType);

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseReturn(returnNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), mockFunctionType.getReturnType());
    }

    @Test
    public void testTraverseCatch_withCatchType() {
        Node catchNode = new Node(Token.CATCH);
        Node nameNode = new Node(Token.NAME, "e");
        catchNode.addChildToBack(nameNode);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        Var errorVar = scope.declare("e", nameNode, registry.getNativeType(JSTypeNative.ERROR_TYPE), null, false);
        nameNode.setJSType(registry.getNativeType(JSTypeNative.ERROR_TYPE));

        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        FlowScope finalScope = ti.traverseCatch(catchNode, initialScope);

        StaticSlot<JSType> slot = finalScope.getSlot("e");
        assertNotNull(slot);
        assertEquals(registry.getNativeType(JSTypeNative.ERROR_TYPE), slot.getType());
    }

    @Test
    public void testTraverseCatch_noCatchType() {
        Node catchNode = new Node(Token.CATCH);
        Node nameNode = new Node(Token.NAME, "e");
        catchNode.addChildToBack(nameNode);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        FlowScope finalScope = ti.traverseCatch(catchNode, initialScope);

        StaticSlot<JSType> slot = finalScope.getSlot("e");
        assertNotNull(slot);
        assertEquals(unknownType, slot.getType());
    }

    @Test
    public void testTraverseAssign_simpleAssignment() {
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), Node.newNumber(10));
        assignNode.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        assignNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        FlowScope finalScope = ti.traverseAssign(assignNode, initialScope);

        JSType resultType = assignNode.getJSType();
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), resultType);

        StaticSlot<JSType> slot = finalScope.getSlot("x");
        assertNotNull(slot);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), slot.getType());
    }

    @Test
    public void testTraverseAssign_assignmentToProperty() {
        Node assignNode = new Node(Token.ASSIGN,
                                   new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "prop")),
                                   Node.newString("value"));
        Node objNode = assignNode.getFirstChild().getFirstChild();
        objNode.setJSType(registry.createAnonymousObjectType());
        assignNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseAssign(assignNode, initialScope);

        JSType resultType = assignNode.getJSType();
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), resultType);
    }

    @Test
    public void testTraverseObjectLiteral_simpleObject() {
        Node objectLit = new Node(Token.OBJECTLIT);
        Node key1 = new Node(Token.STRING_KEY, "a");
        key1.addChildToBack(Node.newNumber(1));
        key1.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        objectLit.addChildToBack(key1);

        ObjectType objType = registry.createAnonymousObjectType(null);
        objectLit.setJSType(objType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseObjectLiteral(objectLit, initialScope);

        assertTrue(objType.hasProperty("a"));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), objType.findPropertyType("a"));
    }

    @Test
    public void testTraverseObjectLiteral_nestedObject() {
        Node objectLit = new Node(Token.OBJECTLIT);
        Node key1 = new Node(Token.STRING_KEY, "nested");
        Node nestedObjLit = new Node(Token.OBJECTLIT);
        Node nestedKey1 = new Node(Token.STRING_KEY, "b");
        nestedKey1.addChildToBack(Node.newString("hello"));
        nestedKey1.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        nestedObjLit.addChildToBack(nestedKey1);
        key1.addChildToBack(nestedObjLit);
        objectLit.addChildToBack(key1);

        ObjectType objType = registry.createAnonymousObjectType(null);
        objectLit.setJSType(objType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseObjectLiteral(objectLit, initialScope);

        assertTrue(objType.hasProperty("nested"));
        JSType nestedPropType = objType.findPropertyType("nested");
        assertNotNull(nestedPropType);
        assertTrue(nestedPropType.isObjectType());
        ObjectType nestedObj = (ObjectType) nestedPropType;
        assertTrue(nestedObj.hasProperty("b"));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), nestedObj.findPropertyType("b"));
    }

    @Test
    public void testTraverseObjectLiteral_withQualifiedName() {
        Node objectLit = new Node(Token.OBJECTLIT);
        Node key1 = new Node(Token.STRING_KEY, "prop");
        key1.addChildToBack(Node.newNumber(5));
        key1.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        objectLit.addChildToBack(key1);

        ObjectType objType = registry.createAnonymousObjectType(null);
        objectLit.setJSType(objType);

        Node objNodeForGetProp = new Node(Token.NAME, "obj"); // Node for the object itself
        objNodeForGetProp.setJSType(registry.createAnonymousObjectType(null));
        // Simulate the qualified name in the scope. The key in the map is the qualified name.
        // The value is the Node representing the property value.
        // This requires a more complex setup if we want to fully test `inferQualifiedSlot`.
        // For now, let's just ensure the property is defined on the object type.
        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseObjectLiteral(objectLit, initialScope);

        assertTrue(objType.hasProperty("prop"));
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), objType.findPropertyType("prop"));
    }


    @Test
    public void testTraverseAdd_stringConcatenation() {
        Node addNode = new Node(Token.ADD, Node.newString("hello"), Node.newString(" world"));
        addNode.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        addNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseAdd(addNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addNode.getJSType());
    }

    @Test
    public void testTraverseAdd_numberAddition() {
        Node addNode = new Node(Token.ADD, Node.newNumber(5), Node.newNumber(10));
        addNode.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        addNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseAdd(addNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), addNode.getJSType());
    }

    @Test
    public void testTraverseAdd_mixedTypes() {
        Node addNode = new Node(Token.ADD, Node.newNumber(5), Node.newString(" apples"));
        addNode.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        addNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseAdd(addNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addNode.getJSType());
    }

    @Test
    public void testTraverseAdd_unknownTypes() {
        Node addNode = new Node(Token.ADD, Node.newNumber(5), Node.newNumber(10));
        addNode.getFirstChild().setJSType(unknownType);
        addNode.getLastChild().setJSType(unknownType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseAdd(addNode, initialScope);

        assertEquals(unknownType, addNode.getJSType());
    }

    @Test
    public void testTraverseAdd_assignAdd_string() {
        Node assignAddNode = new Node(Token.ASSIGN_ADD, new Node(Token.NAME, "x"), Node.newString(" world"));
        Node xNode = assignAddNode.getFirstChild();
        xNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        assignAddNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        ti.functionScope.inferSlotType("x", registry.getNativeType(JSTypeNative.STRING_TYPE));

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        FlowScope finalScope = ti.traverseAdd(assignAddNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), assignAddNode.getJSType());
        StaticSlot<JSType> slot = finalScope.getSlot("x");
        assertNotNull(slot);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), slot.getType());
    }

    @Test
    public void testTraverseAdd_assignAdd_number() {
        Node assignAddNode = new Node(Token.ASSIGN_ADD, new Node(Token.NAME, "x"), Node.newNumber(5));
        Node xNode = assignAddNode.getFirstChild();
        xNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assignAddNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        ti.functionScope.inferSlotType("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        FlowScope finalScope = ti.traverseAdd(assignAddNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignAddNode.getJSType());
        StaticSlot<JSType> slot = finalScope.getSlot("x");
        assertNotNull(slot);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), slot.getType());
    }


    @Test
    public void testTraverseHook_conditionalExpression() {
        Node hookNode = new Node(Token.HOOK, Node.newBoolean(true), Node.newNumber(10), Node.newNumber(20));
        hookNode.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        hookNode.getChildAtIndex(1).setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        hookNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseHook(hookNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), hookNode.getJSType());
    }

    @Test
    public void testTraverseHook_conditionalExpression_mixedTypes() {
        Node hookNode = new Node(Token.HOOK, Node.newBoolean(false), Node.newNumber(10), Node.newString("twenty"));
        hookNode.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        hookNode.getChildAtIndex(1).setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        hookNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseHook(hookNode, initialScope);

        JSType expectedType = registry.createUnionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE), registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertEquals(expectedType, hookNode.getJSType());
    }

    @Test
    public void testTraverseHook_conditionalExpression_unknownType() {
        Node hookNode = new Node(Token.HOOK, Node.newBoolean(true), Node.newNumber(10), unknownTypeNode);
        hookNode.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        hookNode.getChildAtIndex(1).setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        hookNode.getLastChild().setJSType(unknownType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseHook(hookNode, initialScope);

        assertEquals(unknownType, hookNode.getJSType());
    }

    @Test
    public void testTraverseCall_functionCall() {
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "foo"));
        Node functionNameNode = callNode.getFirstChild();
        FunctionType funcType = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        functionNameNode.setJSType(funcType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseCall(callNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), callNode.getJSType());
    }

    @Test
    public void testTraverseCall_functionCallWithArgs() {
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "bar"), Node.newNumber(1));
        Node functionNameNode = callNode.getFirstChild();
        FunctionType funcType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.STRING_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)
        );
        functionNameNode.setJSType(funcType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseCall(callNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), callNode.getJSType());
    }

    @Test
    public void testTraverseCall_unknownFunctionType() {
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "baz"));
        Node functionNameNode = callNode.getFirstChild();
        functionNameNode.setJSType(unknownType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseCall(callNode, initialScope);

        assertEquals(unknownType, callNode.getJSType());
    }

    @Test
    public void testTraverseNew_constructorCall() {
        Node newNode = new Node(Token.NEW, new Node(Token.NAME, "MyClass"));
        Node constructorNode = newNode.getFirstChild();

        FunctionType constructorFnType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE));
        constructorFnType.setInstanceType(registry.createAnonymousObjectType(null));
        constructorFnType.setConstructor(true);
        constructorNode.setJSType(constructorFnType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseNew(newNode, initialScope);

        assertEquals(constructorFnType.getInstanceType(), newNode.getJSType());
    }

    @Test
    public void testTraverseNew_constructorCallWithArgs() {
        Node newNode = new Node(Token.NEW, new Node(Token.NAME, "MyClass"), Node.newNumber(10));
        Node constructorNode = newNode.getFirstChild();

        FunctionType constructorFnType = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.VOID_TYPE),
            registry.getNativeType(JSTypeNative.NUMBER_TYPE)
        );
        constructorFnType.setInstanceType(registry.createAnonymousObjectType(null));
        constructorFnType.setConstructor(true);
        constructorNode.setJSType(constructorFnType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseNew(newNode, initialScope);

        assertEquals(constructorFnType.getInstanceType(), newNode.getJSType());
    }

    @Test
    public void testTraverseNew_unknownConstructorType() {
        Node newNode = new Node(Token.NEW, new Node(Token.NAME, "UnknownClass"));
        Node constructorNode = newNode.getFirstChild();
        constructorNode.setJSType(unknownType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseNew(newNode, initialScope);

        assertEquals(unknownType, newNode.getJSType());
    }

    @Test
    public void testTraverseGetElem_arrayElementAccess() {
        Node getElemNode = new Node(Token.GETELEM, new Node(Token.NAME, "arr"), Node.newNumber(0));
        Node arrayNode = getElemNode.getFirstChild();

        JSType arrayElementType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ObjectType arrayObjectType = registry.createArrayType(arrayElementType);
        arrayNode.setJSType(arrayObjectType);

        getElemNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseGetElem(getElemNode, initialScope);

        assertEquals(arrayElementType, getElemNode.getJSType());
    }

    @Test
    public void testTraverseGetElem_objectPropertyAccess() {
        Node getElemNode = new Node(Token.GETELEM, new Node(Token.NAME, "obj"), Node.newString("prop"));
        Node objNode = getElemNode.getFirstChild();
        ObjectType objType = registry.createAnonymousObjectType(null);
        objType.defineInferredProperty("prop", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), null);
        objNode.setJSType(objType);
        getElemNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseGetElem(getElemNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), getElemNode.getJSType());
    }

    @Test
    public void testTraverseGetElem_unknownObjectType() {
        Node getElemNode = new Node(Token.GETELEM, new Node(Token.NAME, "obj"), Node.newString("prop"));
        Node objNode = getElemNode.getFirstChild();
        objNode.setJSType(unknownType);
        getElemNode.getLastChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseGetElem(getElemNode, initialScope);

        assertEquals(unknownType, getElemNode.getJSType());
    }

    @Test
    public void testTraverseGetProp_simplePropertyAccess() {
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "prop"));
        Node objNode = getPropNode.getFirstChild();
        ObjectType objType = registry.createAnonymousObjectType(null);
        objType.defineInferredProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
        objNode.setJSType(objType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseGetProp(getPropNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), getPropNode.getJSType());
    }

    @Test
    public void testTraverseGetProp_nonExistentProperty() {
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "nonExistent"));
        Node objNode = getPropNode.getFirstChild();
        objNode.setJSType(registry.createAnonymousObjectType(null));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseGetProp(getPropNode, initialScope);

        assertEquals(unknownType, getPropNode.getJSType());
    }

    @Test
    public void testTraverseGetProp_qualifiedNamePropertyAccess() {
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "prop"));
        Node objNode = getPropNode.getFirstChild();
        objNode.setJSType(registry.createAnonymousObjectType(null));

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        Var propVar = scope.declare("obj.prop", null, registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), null, false);

        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());
        ti.functionScope.getRootNode().setJSType(registry.createFunctionType(unknownType));

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseGetProp(getPropNode, initialScope);

        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), getPropNode.getJSType());
    }

    @Test
    public void testTraverseGetProp_unknownObject() {
        Node getPropNode = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "prop"));
        Node objNode = getPropNode.getFirstChild();
        objNode.setJSType(unknownType);

        Scope scope = Scope.createGlobalScope(new Node(Token.SCRIPT));
        TypeInference ti = new TypeInference(null, null, null, scope, Maps.newHashMap());

        FlowScope initialScope = LinkedFlowScope.createEntryLattice(scope);
        ti.traverseGetProp(getPropNode, initialScope);

        assertEquals(unknownType, getPropNode.getJSType());
    }
}
