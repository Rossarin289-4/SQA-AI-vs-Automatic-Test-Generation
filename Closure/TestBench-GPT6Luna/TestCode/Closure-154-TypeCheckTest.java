package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Iterator;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.jstype.UnionType;
import java.text.MessageFormat;
import java.util.List;

public class TypeCheckTest {
    @Test
    public void testDiagnosticTypeWarning() throws Exception {
        assertEquals(CheckLevel.WARNING, TypeCheck.BAD_DELETE.defaultLevel);
    }

    @Test
    public void testDiagnosticTypeError() throws Exception {
        assertEquals(CheckLevel.ERROR, TypeCheck.UNEXPECTED_TOKEN.defaultLevel);
    }

    @Test
    public void testDisabledDiagnostic() throws Exception {
        assertEquals(CheckLevel.OFF, TypeCheck.INEXISTENT_PROPERTY.defaultLevel);
    }

    @Test
    public void testTypedPercentHasZeroForNoVisitedNodes() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertEquals(0.0, check.getTypedPercent(), 0.0);
    }

    @Test
    public void testPropertyCheckConfigurationReturnsSameChecker() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        assertSame(check, check.reportMissingProperties(false));
    }

    @Test
    public void testNullArgumentToCheckThrows() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        try {
            check.check(null, false);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessRequiresScopeCreator() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        try {
            check.process(null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testProcessForTestingRequiresDetachedScopeCreator() throws Exception {
        TypeCheck check = new TypeCheck(null, null, null);
        try {
            check.processForTesting(null, null);
            fail("expected IllegalStateException");
        } catch (NullPointerException expected) {
        }
    }
}
