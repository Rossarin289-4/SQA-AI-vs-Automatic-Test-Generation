```java
package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Token;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.io.Serializable;
import java.util.Comparator;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import java.util.Map;
import java.util.SortedMap;
import com.google.common.base.Joiner;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;
import com.google.javascript.rhino.testing.MapBasedScope;
import com.google.javascript.jscomp.Scope;

public class ArrowTypeTest {
    @Test
    public void testDefaultPossibleBooleanOutcome() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, null, null);
        assertEquals(BooleanLiteralSet.TRUE, arrow.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testSubtypeOfItselfWithDefaultSignature() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, null, null);
        assertTrue(arrow.isSubtype(arrow));
    }

    @Test
    public void testNonArrowIsNotSupertypeCandidate() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, null, null);
        assertFalse(arrow.isSubtype(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testEqualDefaultParameters() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType a = new ArrowType(registry, null, null);
        ArrowType b = new ArrowType(registry, null, null);
        assertTrue(a.hasEqualParameters(b, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testDifferentParameterCountsAreNotEqual() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        Node one = new Node(Token.PARAM_LIST);
        one.addChildToBack(Node.newString(Token.NAME, "x"));
        Node two = new Node(Token.PARAM_LIST);
        two.addChildToBack(Node.newString(Token.NAME, "x"));
        two.addChildToBack(Node.newString(Token.NAME, "y"));
        ArrowType a = new ArrowType(registry, one, null);
        ArrowType b = new ArrowType(registry, two, null);
        assertFalse(a.hasEqualParameters(b, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testUnknownParameterAndReturnAreReported() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, null, null);
        assertTrue(arrow.hasUnknownParamsOrReturn());
    }

    @Test
    public void testUnknownReturnIsSubtypeOfUnknownReturn() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType a = new ArrowType(registry, null, null);
        ArrowType b = new ArrowType(registry, null, null);
        assertTrue(a.isSubtype(b));
    }

    @Test
    public void testNullArgumentToBooleanOutcome() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, null, null);
        assertEquals(BooleanLiteralSet.TRUE, arrow.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testArrowNotSubtypeOfNumber() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, null, null);
        assertFalse(arrow.isSubtype(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testArrowHashCodeRepeatable() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, null, null);
        assertEquals(arrow.hashCode(), arrow.hashCode());
    }

    @Test
    public void testInferredFlagDoesNotChangeBooleanOutcome() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, null, null, true);
        assertEquals(BooleanLiteralSet.TRUE, arrow.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testSameArrowSubtypeReflexivity() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        Node params = new Node(Token.PARAM_LIST);
        ArrowType arrow = new ArrowType(registry, params, null, true);
        assertTrue(arrow.isSubtype(arrow));
    }

    @Test
    public void testNullParameterListCreatesVarArgs() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, null, null);
        assertTrue(arrow.parameters.getFirstChild().isVarArgs());
    }

    @Test
    public void testUnknownReturnUsesNativeUnknown() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        assertTrue(arrow.returnType.isUnknownType());
    }

    @Test
    public void testNonArrowSubtypeReturnsFalse() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        assertFalse(arrow.isSubtype(registry.getNativeType(JSTypeNative.STRING_TYPE)));
    }

    @Test
    public void testUntypedParametersRemainEqual() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        Node p1 = new Node(Token.PARAM_LIST);
        p1.addChildToBack(Node.newString(Token.NAME, "a"));
        Node p2 = new Node(Token.PARAM_LIST);
        p2.addChildToBack(Node.newString(Token.NAME, "b"));
        ArrowType a = new ArrowType(registry, p1, null);
        ArrowType b = new ArrowType(registry, p2, null);
        assertTrue(a.hasEqualParameters(b, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testNullUntypedParameterDoesNotCountUnknown() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(Node.newString(Token.NAME, "x"));
        ArrowType arrow = new ArrowType(registry, params,
            registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertFalse(arrow.hasUnknownParamsOrReturn());
    }

    @Test
    public void testVarArgsSubtypeOfVarArgs() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        Node p1 = new Node(Token.PARAM_LIST);
        Node v1 = Node.newString(Token.NAME, "x");
        v1.setVarArgs(true);
        v1.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        p1.addChildToBack(v1);
        Node p2 = new Node(Token.PARAM_LIST);
        Node v2 = Node.newString(Token.NAME, "y");
        v2.setVarArgs(true);
        v2.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        p2.addChildToBack(v2);
        ArrowType a = new ArrowType(registry, p1, null);
        ArrowType b = new ArrowType(registry, p2, null);
        assertTrue(a.isSubtype(b));
    }

    @Test
    public void testNullAndEmptyParameterListsEqual() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType a = new ArrowType(registry, null, null);
        ArrowType b = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        assertTrue(a.hasEqualParameters(b, EquivalenceMethod.IDENTITY));
    }

    @Test
    public void testSubtypeAgainstEmptyArrow() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType a = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        ArrowType b = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        assertTrue(a.isSubtype(b));
    }

    @Test
    public void testHasNoTemplateOnNativeUnknownSignature() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        assertFalse(arrow.hasAnyTemplateInternal());
    }

    @Test
    public void testToStringHelperIsArrowMarker() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        assertEquals("[ArrowType]", arrow.toString());
    }

    @Test
    public void testUnsupportedLeastSupertypeThrows() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        try {
            arrow.getLeastSupertype(arrow);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testUnsupportedGreatestSubtypeThrows() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        try {
            arrow.getGreatestSubtype(arrow);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testUnsupportedEqualityThrows() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null);
        try {
            arrow.testForEquality(arrow);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testBooleanOutcomeIsTrueForInferredReturn() throws Exception {
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        JSTypeRegistry registry = new JSTypeRegistry(reporter);
        ArrowType arrow = new ArrowType(registry, new Node(Token.PARAM_LIST), null, true);
        assertEquals(BooleanLiteralSet.TRUE, arrow.getPossibleToBooleanOutcomes());
    }
}
```