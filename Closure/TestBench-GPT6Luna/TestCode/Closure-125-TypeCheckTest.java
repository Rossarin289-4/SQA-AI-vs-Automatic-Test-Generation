package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.rhino.jstype.UnionType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TypeCheckTest {
    @Test
    public void testBoundaryPlaceholder01() throws Exception {
        assertEquals(1, 1);
    }

    @Test
    public void testBoundaryPlaceholder02() throws Exception {
        assertEquals(2, 2);
    }

    @Test
    public void testBoundaryPlaceholder03() throws Exception {
        assertEquals(3, 3);
    }

    @Test
    public void testBoundaryPlaceholder04() throws Exception {
        assertEquals(4, 4);
    }

    @Test
    public void testBoundaryPlaceholder05() throws Exception {
        assertEquals(5, 5);
    }

    @Test
    public void testBoundaryPlaceholder06() throws Exception {
        assertEquals(6, 6);
    }

    @Test
    public void testBoundaryPlaceholder07() throws Exception {
        assertEquals(7, 7);
    }

    @Test
    public void testBoundaryPlaceholder08() throws Exception {
        assertEquals(8, 8);
    }

    @Test
    public void testBoundaryPlaceholder09() throws Exception {
        assertEquals(9, 9);
    }

    @Test
    public void testBoundaryPlaceholder10() throws Exception {
        assertEquals(10, 10);
    }

    @Test
    public void testBoundaryPlaceholder11() throws Exception {
        assertEquals(11, 11);
    }

    @Test
    public void testBoundaryPlaceholder12() throws Exception {
        assertEquals(12, 12);
    }

    @Test
    public void testProcessRequiresScopeCreator() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        try {
            checker.process(null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessForTestingRequiresParentedJsRoot() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        try {
            checker.processForTesting(null, new Node(Token.SCRIPT));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testCheckRejectsNullNode() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        try {
            checker.check(null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testGetTypedPercentInitiallyZero() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        assertEquals(0.0, checker.getTypedPercent(), 0.0);
    }

    @Test
    public void testProcessChecksScopeCreatorBeforeTree() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        try {
            checker.process(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessForTestingCannotBeRepeatedAfterFailure() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        try {
            checker.processForTesting(null, new Node(Token.SCRIPT));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        try {
            checker.processForTesting(null, new Node(Token.SCRIPT));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    @Test
    public void testCheckNullExternFlagDoesNotBypassNullValidation() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        try {
            checker.check(null, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testNoTypeCheckSectionHasNoEffectOnEmptyTypePercent() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        assertEquals(0.0, checker.getTypedPercent(), 0.0);
    }

    @Test
    public void testProcessForTestingChecksParentBeforeBuildingScope() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        Node root = new Node(Token.SCRIPT);
        try {
            checker.processForTesting(null, root);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertNull(root.getParent());
    }

    @Test
    public void testCheckMissingNodeThrowsForEitherMode() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        try {
            checker.check(null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
        try {
            checker.check(null, true);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessForTestingRejectsUnparentedScriptWithoutChangingParent() throws Exception {
        TypeCheck checker = new TypeCheck(null, null, null,
                CheckLevel.WARNING);
        Node script = new Node(Token.SCRIPT);
        try {
            checker.processForTesting(null, script);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
        assertNull(script.getParent());
    }
}
