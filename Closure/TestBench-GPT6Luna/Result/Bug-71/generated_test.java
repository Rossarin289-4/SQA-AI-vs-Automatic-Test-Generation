package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.common.collect.Multimap;
import com.google.common.collect.HashMultimap;

public class CheckAccessControlsTest {
    @Test
    public void testConstructorDeclarationVisible() throws Exception {
        assertEquals("JSC_BAD_PRIVATE_GLOBAL_ACCESS",
                CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS.key);
    }

    @Test
    public void testOtherDiagnosticKeys() throws Exception {
        assertEquals("JSC_CONSTANT_PROPERTY_REASSIGNED_VALUE",
                CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE.key);
    }

    @Test
    public void testDeprecatedNameDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.DEPRECATED_NAME.defaultLevel);
    }

    @Test
    public void testDeprecatedNameReasonDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.DEPRECATED_NAME_REASON.defaultLevel);
    }

    @Test
    public void testDeprecatedPropertyDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.DEPRECATED_PROP.defaultLevel);
    }

    @Test
    public void testDeprecatedPropertyReasonDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.DEPRECATED_PROP_REASON.defaultLevel);
    }

    @Test
    public void testDeprecatedClassDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.DEPRECATED_CLASS.defaultLevel);
    }

    @Test
    public void testDeprecatedClassReasonDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.DEPRECATED_CLASS_REASON.defaultLevel);
    }

    @Test
    public void testPrivatePropertyDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.BAD_PRIVATE_PROPERTY_ACCESS.defaultLevel);
    }

    @Test
    public void testProtectedPropertyDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.BAD_PROTECTED_PROPERTY_ACCESS.defaultLevel);
    }

    @Test
    public void testPrivateOverrideDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.PRIVATE_OVERRIDE.defaultLevel);
    }

    @Test
    public void testVisibilityMismatchDiagnosticDisabled() throws Exception {
        assertEquals(CheckLevel.OFF,
                CheckAccessControls.VISIBILITY_MISMATCH.defaultLevel);
    }

    @Test
    public void testConstantPropertyDiagnosticIsWarning() throws Exception {
        assertEquals(CheckLevel.WARNING,
                CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE.defaultLevel);
    }

    @Test
    public void testConstantPropertyKey() throws Exception {
        assertEquals("JSC_CONSTANT_PROPERTY_REASSIGNED_VALUE",
                CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE.key);
    }

    @Test
    public void testPrivateGlobalKey() throws Exception {
        assertEquals("JSC_BAD_PRIVATE_GLOBAL_ACCESS",
                CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS.key);
    }

    @Test
    public void testPrivatePropertyKey() throws Exception {
        assertEquals("JSC_BAD_PRIVATE_PROPERTY_ACCESS",
                CheckAccessControls.BAD_PRIVATE_PROPERTY_ACCESS.key);
    }

    @Test
    public void testProtectedPropertyKey() throws Exception {
        assertEquals("JSC_BAD_PROTECTED_PROPERTY_ACCESS",
                CheckAccessControls.BAD_PROTECTED_PROPERTY_ACCESS.key);
    }

    @Test
    public void testPrivateOverrideKey() throws Exception {
        assertEquals("JSC_PRIVATE_OVERRIDE",
                CheckAccessControls.PRIVATE_OVERRIDE.key);
    }

    @Test
    public void testVisibilityMismatchKey() throws Exception {
        assertEquals("JSC_VISIBILITY_MISMATCH",
                CheckAccessControls.VISIBILITY_MISMATCH.key);
    }

    @Test
    public void testDeprecatedClassKey() throws Exception {
        assertEquals("JSC_DEPRECATED_CLASS",
                CheckAccessControls.DEPRECATED_CLASS.key);
    }

    @Test
    public void testShouldTraverseAlwaysAllowsTraversal() throws Exception {
        CheckAccessControls pass = new CheckAccessControls(null);
        Node node = Node.newString("x");
        assertTrue(pass.shouldTraverse(null, node, null));
    }

    @Test
    public void testVisitEmptyNodeDoesNothing() throws Exception {
        CheckAccessControls pass = new CheckAccessControls(null);
        Node node = new Node(Token.EMPTY);
        pass.visit(null, node, new Node(Token.BLOCK));
        assertEquals(Token.EMPTY, node.getType());
    }

    @Test
    public void testVisitNumberNodeDoesNothing() throws Exception {
        CheckAccessControls pass = new CheckAccessControls(null);
        Node node = Node.newNumber(0);
        pass.visit(null, node, new Node(Token.BLOCK));
        assertEquals(Token.NUMBER, node.getType());
        assertEquals(0.0, node.getDouble(), 0.0);
    }

    @Test
    public void testVisitStringNodeDoesNothing() throws Exception {
        CheckAccessControls pass = new CheckAccessControls(null);
        Node node = Node.newString("edge");
        pass.visit(null, node, new Node(Token.BLOCK));
        assertEquals(Token.STRING, node.getType());
        assertEquals("edge", node.getString());
    }

    @Test
    public void testVisitUnrecognizedNodeLeavesChildrenUnchanged() throws Exception {
        CheckAccessControls pass = new CheckAccessControls(null);
        Node child = Node.newString("child");
        Node parent = new Node(Token.BLOCK, child);
        pass.visit(null, parent, null);
        assertSame(child, parent.getFirstChild());
    }

    @Test
    public void testShouldTraverseWithNullParentStillReturnsTrue() throws Exception {
        CheckAccessControls pass = new CheckAccessControls(null);
        Node node = new Node(Token.SCRIPT);
        assertTrue(pass.shouldTraverse(null, node, null));
    }

    @Test
    public void testVisitBlockWithChildLeavesChildAttached() throws Exception {
        CheckAccessControls pass = new CheckAccessControls(null);
        Node child = Node.newString("x");
        Node block = new Node(Token.BLOCK, child);
        pass.visit(null, block, null);
        assertSame(child, block.getFirstChild());
    }

    @Test
    public void testVisitNullParentOnNumberIsNoOp() throws Exception {
        CheckAccessControls pass = new CheckAccessControls(null);
        Node number = Node.newNumber(1);
        pass.visit(null, number, null);
        assertEquals(1.0, number.getDouble(), 0.0);
    }
}
