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
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.LinkedFlowScope;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.Scope;

public class TypeInferenceTest {

    // Mock AbstractCompiler - simplified for testing purposes
    // Removed the need for IRFactory and other external dependencies by mocking more thoroughly.

    private JSTypeRegistry registry;
    private AbstractCompiler compiler;
    private Map<String, AssertionFunctionSpec> assertionFunctionsMap;

    





    






    



    











    


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





