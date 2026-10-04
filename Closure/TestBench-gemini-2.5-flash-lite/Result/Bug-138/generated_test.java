package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.rhino.Node;
import java.util.Map;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor;
import com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor;

public class ClosureReverseAbstractInterpreterTest {

    private JSTypeRegistry registry = new JSTypeRegistry(null);
    private CodingConvention convention = new GoogleCodingConvention();

    private ClosureReverseAbstractInterpreter createInterpreter() {
        return new ClosureReverseAbstractInterpreter(convention, registry);
    }

    private JSType getNativeType(JSTypeNative typeId) {
        return registry.getNativeType(typeId);
    }

    // Helper method to call getObjectType from the JSTypeRegistry


    private ObjectType createAnonymousObjectType() {
        return registry.createAnonymousObjectType();
    }

    // Helper method to access protected methods of ClosureReverseAbstractInterpreter




























    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsArray() throws Exception {
        ClosureReverseAbstractInterpreter interpreter = createInterpreter();
        Node condition = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP);
        callee.addChildToBack(new Node(Token.NAME, "goog"));
        callee.addChildToBack(new Node(Token.STRING, "isArray"));
        condition.addChildToBack(callee);
        condition.addChildToBack(new Node(Token.NAME, "x"));

        Scope enclosingScope = new Scope(new Node(Token.BLOCK), convention);
        FlowScope blindScope = LinkedFlowScope.createEntryLattice(enclosingScope);
        ObjectType unknownObjectType = (ObjectType) getNativeType(JSTypeNative.UNKNOWN_TYPE);
        enclosingScope.declare("x", unknownObjectType, false);

        // goog.isArray(x) is true
        FlowScope trueScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        JSType xTypeTrue = trueScope.getSlot("x").getType();
        assertNotNull(xTypeTrue);
        assertTrue(xTypeTrue.isArrayType()); // Should be an array

        // goog.isArray(x) is false
        FlowScope falseScope = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        JSType xTypeFalse = falseScope.getSlot("x").getType();
        assertNotNull(xTypeFalse);
        assertFalse(xTypeFalse.isArrayType()); // Should not be an array
    }

    // Inner class to simulate the TypeRestriction
    private static class TypeRestriction {
        private final JSType type;
        private final boolean outcome;

        private TypeRestriction(JSType type, boolean outcome) {
            this.type = type;
            this.outcome = outcome;
        }
    }
}





