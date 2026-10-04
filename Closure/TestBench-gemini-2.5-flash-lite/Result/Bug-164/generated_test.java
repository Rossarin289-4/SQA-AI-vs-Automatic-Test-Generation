package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token; // Added import for Token

public class ArrowTypeTest {

    // Mock ErrorReporter for constructor and other methods that require it.
    // We don't expect errors to be reported in these tests.
    private static class MockErrorReporter implements ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int line, int lineOffset) {}
        @Override
        public void error(String message, String sourceName, int line, int lineOffset) {}
    }

    // Mock JSTypeRegistry for constructor.
    // We need a JSTypeRegistry to create JSType objects.
    private static class MockJSTypeRegistry extends JSTypeRegistry {
        public MockJSTypeRegistry() {
            // Pass a mock reporter to the super constructor.
            super(new MockErrorReporter());
        }

        // Override getNativeType to return a dummy JSType.
        @Override
        public JSType getNativeType(JSTypeNative typeId) {
            // For simplicity, return a basic JSType. In a real scenario, this would
            // return actual native types.
            if (typeId == JSTypeNative.UNKNOWN_TYPE) {
                return new UnknownType(this);
            }
            // Returning a new type for each call to avoid unexpected equivalency
            return new SimpleSlotType("dummy_" + System.nanoTime(), this);
        }
    }

    // A simple JSType implementation for testing purposes.
    private static class SimpleSlotType extends JSType {
        private final String name;

        SimpleSlotType(String name, JSTypeRegistry registry) {
            super(registry);
            this.name = name;
        }

        @Override
        public boolean isSubtype(JSType other) {
            if (other instanceof SimpleSlotType) {
                SimpleSlotType otherType = (SimpleSlotType) other;
                // Basic comparison for mock
                if (this.name.equals(otherType.name)) {
                    return true;
                }
                // Simulate String being a subtype of Object for contravariance test
                if (this.name.equals("String") && otherType.name.equals("Object")) {
                    return true;
                }
            }
            // Specifically for ArrowType.isSubtype
            if (other instanceof ArrowType) {
                return false; // Default to false for simplicity in mock
            }
            return false;
        }

        @Override
        public boolean isEquivalentTo(JSType object) {
            if (!(object instanceof SimpleSlotType)) {
                return false;
            }
            SimpleSlotType other = (SimpleSlotType) object;
            return this.name.equals(other.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public JSType getLeastSupertype(JSType that) {
            throw new UnsupportedOperationException("Not implemented for test");
        }

        @Override
        public JSType getGreatestSubtype(JSType that) {
            throw new UnsupportedOperationException("Not implemented for test");
        }

        @Override
        public TernaryValue testForEquality(JSType that) {
            throw new UnsupportedOperationException("Not implemented for test");
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            throw new UnsupportedOperationException("Not implemented for test");
        }

        @Override
        public BooleanLiteralSet getPossibleToBooleanOutcomes() {
            return BooleanLiteralSet.TRUE;
        }

        @Override
        String toStringHelper(boolean forAnnotations) {
            return name;
        }

        @Override
        JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
            return this;
        }
    }

    // A dummy implementation for UnknownType
    private static class UnknownType extends SimpleSlotType {
        UnknownType(JSTypeRegistry registry) {
            super("Unknown", registry);
        }

        @Override
        public boolean isUnknownType() {
            return true;
        }
    }




    @Test
    public void testIsSubtypeDifferentType() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType = new ArrowType(registry, null, null);
        SimpleSlotType otherType = new SimpleSlotType("SomeType", registry);

        assertFalse(arrowType.isSubtype(otherType));
    }

    @Test
    public void testIsSubtypeWithNullParamsAndReturn() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType1 = new ArrowType(registry, null, null); // Uses UNKNOWN_TYPE for params and return

        Node params2 = new Node(Token.PARAM_LIST);
        JSType returnType2 = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2);

        // arrowType1 should be a subtype of arrowType2 if arrowType2's return is UNKNOWN_TYPE
        // and arrowType1 has UNKNOWN_TYPE params (which it does via null)
        assertTrue(arrowType1.isSubtype(arrowType2));
    }














    @Test
    public void testIsEquivalentToNullParamsAndReturn() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType1 = new ArrowType(registry, null, null);
        ArrowType arrowType2 = new ArrowType(registry, null, null);
        assertTrue(arrowType1.isEquivalentTo(arrowType2));
    }

    @Test
    public void testIsEquivalentToWithUnknownType() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType1 = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        ArrowType arrowType2 = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        assertTrue(arrowType1.isEquivalentTo(arrowType2));
    }

    @Test
    public void testIsEquivalentToFalseWithUnknownType() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType1 = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        ArrowType arrowType2 = new ArrowType(registry, null, new SimpleSlotType("String", registry));
        assertFalse(arrowType1.isEquivalentTo(arrowType2));
    }




    @Test
    public void testHashCodeWithNullReturnAndParams() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType1 = new ArrowType(registry, null, null);
        ArrowType arrowType2 = new ArrowType(registry, null, null);
        assertEquals(arrowType1.hashCode(), arrowType2.hashCode());
    }

    @Test
    public void testGetPossibleToBooleanOutcomes() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType = new ArrowType(registry, null, null);
        assertEquals(BooleanLiteralSet.TRUE, arrowType.getPossibleToBooleanOutcomes());
    }








    @Test
    public void testHasUnknownParamsOrReturn_nullParamsAndReturn() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType = new ArrowType(registry, null, null); // null params and returnType

        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }




    @Test
    public void testHasEqualParametersTrueNull() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType1 = new ArrowType(registry, null, null);
        ArrowType arrowType2 = new ArrowType(registry, null, null);
        assertTrue(arrowType1.hasEqualParameters(arrowType2));
    }

}



