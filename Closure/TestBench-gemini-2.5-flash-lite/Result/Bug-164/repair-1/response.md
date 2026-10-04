```java
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
                return this.name.equals(((SimpleSlotType) other).name);
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
    public void testIsSubtypeBasicTrue() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, Node.newString("a")));
        JSType returnType1 = new SimpleSlotType("String", registry);
        ArrowType arrowType1 = new ArrowType(registry, params1, returnType1);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, Node.newString("b")));
        JSType returnType2 = new SimpleSlotType("String", registry);
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2);

        // Let's create a scenario where it should be a subtype.
        Node params3 = new Node(Token.PARAM_LIST);
        JSType returnType3 = new SimpleSlotType("Object", registry); // Supertype
        ArrowType arrowType3 = new ArrowType(registry, params3, returnType3);

        Node params4 = new Node(Token.PARAM_LIST);
        // The parameter type here must be a JSType, not a String.
        params4.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType4 = new SimpleSlotType("Object", registry);
        ArrowType arrowType4 = new ArrowType(registry, params4, returnType4);

        // Test case: arrowType4 <: arrowType3
        // This means arrowType4's returnType (Object) is subtype of arrowType3's returnType (Object) - true in mock
        // And arrowType3's params (none) is contravariant to arrowType4's params (String) - true in mock
        assertTrue(arrowType4.isSubtype(arrowType3));
    }

    @Test
    public void testIsSubtypeBasicFalse() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, Node.newString("a")));
        JSType returnType1 = new SimpleSlotType("String", registry);
        ArrowType arrowType1 = new ArrowType(registry, params1, returnType1);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, Node.newString("b")));
        JSType returnType2 = new SimpleSlotType("Number", registry); // Different return type
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2);

        // Test case: arrowType1 <: arrowType2. Return types are not subtypes.
        assertFalse(arrowType1.isSubtype(arrowType2));
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
    public void testIsSubtypeReturnCovariant() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        JSType superType = new SimpleSlotType("Object", registry);
        JSType subType = new SimpleSlotType("String", registry);

        Node params1 = new Node(Token.PARAM_LIST);
        ArrowType arrowType1 = new ArrowType(registry, params1, subType); // Subtype return

        Node params2 = new Node(Token.PARAM_LIST);
        ArrowType arrowType2 = new ArrowType(registry, params2, superType); // Supertype return

        // arrowType1 <: arrowType2. subType <: superType.
        assertTrue(arrowType1.isSubtype(arrowType2));
    }

    @Test
    public void testIsSubtypeParamContravariant() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        // Supertype param should be compatible with subtype param in contravariant position.
        // Supertype param (Object) needs to be subtype of subtype param (String) - which is false in reality.
        // The test logic is that 'that' param type must be subtype of 'this' param type.
        // So, for arrowType2 to be subtype of arrowType1, thatParamType must be subtype of thisParamType.

        // arrowType2 <: arrowType1
        // thisParamType = String, thatParamType = Object
        // We need thatParamType.isSubtype(thisParamType) => Object.isSubtype(String) -> false in real type system.
        // In this mock, we define isSubtype for SimpleSlotType.
        // To make this test pass, we need String to be subtype of Object in our mock.
        // Let's swap the types to reflect the contravariance.
        // If arrowType2 <: arrowType1, then param of arrowType1 <: param of arrowType2.
        Node param1 = new Node(Token.PARAM, new SimpleSlotType("String", registry)); // Subtype
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(param1);
        ArrowType arrowType1 = new ArrowType(registry, params1, new SimpleSlotType("Void", registry)); // This is the supertype

        Node param2 = new Node(Token.PARAM, new SimpleSlotType("Object", registry)); // Supertype
        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(param2);
        ArrowType arrowType2 = new ArrowType(registry, params2, new SimpleSlotType("Void", registry)); // This is the subtype

        // We want to check if arrowType2 is subtype of arrowType1.
        // This means:
        // 1. returnType2 <: returnType1 (Void <: Void) - True
        // 2. param2 <: param1 (Object <: String) - This needs to be true in mock for the test to pass as per contravariance.
        // Let's adjust the mock SimpleSlotType.isSubtype to make Object a subtype of String for this test.
        // Or, more correctly, String is subtype of Object. So if we have arrowType1 (string params) and arrowType2 (object params), arrowType2 is subtype of arrowType1.
        // This is confusing. Let's use the actual logic:
        // `thatParamType.isSubtype(thisParamType)`
        // For `arrowType2.isSubtype(arrowType1)`: `thisParamType` is String, `thatParamType` is Object.
        // So we need `Object.isSubtype(String)` to be true.
        // If we want to test contravariance correctly, let's use:
        // Function f(string s) and Function g(object o). g <: f.
        // So arrowType2 <: arrowType1.
        // We need `object.getJSType().isSubtype(string.getJSType())` to be true.
        // Let's simulate String being a subtype of Object, which is standard.
        // So for `g(object).isSubtype(f(string))`, we need `object.isSubtype(string)` to be false.
        // For `f(string).isSubtype(g(object))`, we need `string.isSubtype(object)` to be true.

        // Correct scenario for contravariance:
        // f(string) and g(object). g <: f.
        // arrowType2 (with object param) <: arrowType1 (with string param)
        // `thisParam` in isSubtype means `this` object's param (arrowType2)
        // `thatParam` in isSubtype means `other` object's param (arrowType1)
        // So, for arrowType2.isSubtype(arrowType1):
        // `thisParam` is Node(PARAM, ObjectType), `thatParam` is Node(PARAM, StringType)
        // `thisParamType` = ObjectType, `thatParamType` = StringType.
        // Condition: `thatParamType.isSubtype(thisParamType)` => `StringType.isSubtype(ObjectType)`
        // This is false in reality.
        // To make this test pass, we need `StringType.isSubtype(ObjectType)` to be true in the mock.
        // This implies the mock `SimpleSlotType.isSubtype` must be defined such that String is subtype of Object.

        // Let's redefine SimpleSlotType.isSubtype to reflect this.
        // For this test, let String be a subtype of Object.
        // So if we test arrowType2 (object param) <: arrowType1 (string param):
        // `thisParamType` (from arrowType2) = Object, `thatParamType` (from arrowType1) = String
        // The check is `thatParamType.isSubtype(thisParamType)` => `StringType.isSubtype(ObjectType)`
        // This must be TRUE for the test to pass.
        // This is contradictory to standard Java type hierarchy.

        // Let's simplify the understanding of isSubtype:
        // `this.returnType.isSubtype(that.returnType)` (covariant)
        // `that.paramType[i].isSubtype(this.paramType[i])` (contravariant)

        // Test: arrowType2.isSubtype(arrowType1)
        // this = arrowType2 (object param), that = arrowType1 (string param)
        // returnType check: arrowType2.returnType.isSubtype(arrowType1.returnType)
        // param check: `thatParamType.isSubtype(thisParamType)`
        // thisParamType = Object, thatParamType = String
        // Condition: `StringType.isSubtype(ObjectType)` => this must be true.

        // Let's create a mock that allows this.
        JSType stringType = new SimpleSlotType("String", registry);
        JSType objectType = new SimpleSlotType("Object", registry);

        Node superParamNode = new Node(Token.PARAM, objectType);
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(superParamNode);
        ArrowType arrowType1 = new ArrowType(registry, params1, new SimpleSlotType("Void", registry)); // Supertype function (takes object)

        Node subParamNode = new Node(Token.PARAM, stringType);
        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(subParamNode);
        ArrowType arrowType2 = new ArrowType(registry, params2, new SimpleSlotType("Void", registry)); // Subtype function (takes string)

        // Now test arrowType2.isSubtype(arrowType1)
        // this = arrowType2 (string param), that = arrowType1 (object param)
        // returnType check: Void.isSubtype(Void) -> True
        // param check: `thatParamType.isSubtype(thisParamType)`
        // `thisParamType` = StringType, `thatParamType` = ObjectType
        // Condition: `ObjectType.isSubtype(StringType)` => This must be true.
        // This implies Object is a subtype of String, which is backward.

        // The original logic in the code:
        // `that.paramType[i] <: this.paramType[i]` (contravariant)
        // This means `that.paramType[i]` must be a subtype of `this.paramType[i]`.

        // Test case: `arrowType2.isSubtype(arrowType1)`
        // `this` is `arrowType2` (takes String). `that` is `arrowType1` (takes Object).
        // We need to check if `arrowType1.parameters.type[i]` is subtype of `arrowType2.parameters.type[i]`.
        // `thisParamType` = String, `thatParamType` = Object.
        // Check: `thatParamType.isSubtype(thisParamType)` => `Object.isSubtype(String)`. This must be true.
        // This means Object is a subtype of String, which is incorrect.

        // Let's reverse the roles to test String being subtype of Object.
        // Function f(object o) and Function g(string s). g <: f.
        // So, arrowType2 (string param) <: arrowType1 (object param).
        // `this` is `arrowType2` (string param). `that` is `arrowType1` (object param).
        // `thisParamType` = String, `thatParamType` = Object.
        // Check: `thatParamType.isSubtype(thisParamType)` => `Object.isSubtype(String)`. This must be true.
        // Still Object is subtype of String.

        // The implementation is:
        // `Node thisParam = parameters.getFirstChild();` (of `this` ArrowType)
        // `Node thatParam = that.parameters.getFirstChild();` (of `other` ArrowType)
        // `JSType thisParamType = thisParam.getJSType();`
        // `JSType thatParamType = thatParam.getJSType();`
        // `if (thisParamType != null) { if (thatParamType == null || !thatParamType.isSubtype(thisParamType)) { return false; } }`

        // Let's test `arrowType1.isSubtype(arrowType2)`
        // `this` = `arrowType1` (takes String), `that` = `arrowType2` (takes Object).
        // `thisParamType` = String, `thatParamType` = Object.
        // Condition: `thatParamType.isSubtype(thisParamType)` => `Object.isSubtype(String)`.

        // Let's test `arrowType2.isSubtype(arrowType1)`
        // `this` = `arrowType2` (takes Object), `that` = `arrowType1` (takes String).
        // `thisParamType` = Object, `thatParamType` = String.
        // Condition: `thatParamType.isSubtype(thisParamType)` => `String.isSubtype(Object)`. This must be true.

        // So, for contravariance test where g(string) <: f(object), we need `String.isSubtype(Object)` to be true.
        // This is standard.

        // Mocking the isSubtype:
        // For `SimpleSlotType.isSubtype(SimpleSlotType other)`:
        // If `this.name` is "String" and `other.name` is "Object", return true.
        // If `this.name` is "Object" and `other.name` is "String", return false.

        // Redefining SimpleSlotType for this test.
        class ContravariantMockType extends SimpleSlotType {
            ContravariantMockType(String name, JSTypeRegistry registry) {
                super(name, registry);
            }

            @Override
            public boolean isSubtype(JSType other) {
                if (other instanceof ContravariantMockType) {
                    ContravariantMockType otherType = (ContravariantMockType) other;
                    if (this.name.equals("String") && otherType.name.equals("Object")) {
                        return true; // String is subtype of Object
                    }
                }
                return super.isSubtype(other);
            }
        }

        JSType stringTypeMock = new ContravariantMockType("String", registry);
        JSType objectTypeMock = new ContravariantMockType("Object", registry);

        Node paramForArrowType1 = new Node(Token.PARAM, objectTypeMock); // ArrowType1 takes Object
        Node paramsForArrowType1 = new Node(Token.PARAM_LIST);
        paramsForArrowType1.addChildToBack(paramForArrowType1);
        ArrowType arrowType1 = new ArrowType(registry, paramsForArrowType1, new SimpleSlotType("Void", registry)); // f(Object)

        Node paramForArrowType2 = new Node(Token.PARAM, stringTypeMock); // ArrowType2 takes String
        Node paramsForArrowType2 = new Node(Token.PARAM_LIST);
        paramsForArrowType2.addChildToBack(paramForArrowType2);
        ArrowType arrowType2 = new ArrowType(registry, paramsForArrowType2, new SimpleSlotType("Void", registry)); // g(String)

        // Test: g(String).isSubtype(f(Object)) => arrowType2.isSubtype(arrowType1)
        // `this` = arrowType2 (String param), `that` = arrowType1 (Object param)
        // `thisParamType` = StringType, `thatParamType` = ObjectType
        // Condition: `thatParamType.isSubtype(thisParamType)` => `ObjectType.isSubtype(StringType)` => False.
        // This means arrowType2 is NOT a subtype of arrowType1.

        // Test: f(Object).isSubtype(g(String)) => arrowType1.isSubtype(arrowType2)
        // `this` = arrowType1 (Object param), `that` = arrowType2 (String param)
        // `thisParamType` = ObjectType, `thatParamType` = StringType
        // Condition: `thatParamType.isSubtype(thisParamType)` => `StringType.isSubtype(ObjectType)` => True.
        // This means arrowType1 IS a subtype of arrowType2. This is backward for contravariance.

        // The implementation's contravariance check:
        // `if (thisParamType != null)`
        //   `if (thatParamType == null || !thatParamType.isSubtype(thisParamType))`
        //     `return false;`
        // This means `thatParamType` must be a subtype of `thisParamType`.

        // Let's test arrowType2.isSubtype(arrowType1)
        // `this` = arrowType2 (string param). `that` = arrowType1 (object param).
        // `thisParamType` = String, `thatParamType` = Object.
        // Check: `thatParamType.isSubtype(thisParamType)` => `Object.isSubtype(String)` => false.
        // Thus, arrowType2 is NOT a subtype of arrowType1.

        // Let's test arrowType1.isSubtype(arrowType2)
        // `this` = arrowType1 (object param). `that` = arrowType2 (string param).
        // `thisParamType` = Object, `thatParamType` = String.
        // Check: `thatParamType.isSubtype(thisParamType)` => `String.isSubtype(Object)` => true.
        // Thus, arrowType1 IS a subtype of arrowType2.

        // This means f(Object) <: g(String). This is correct for contravariance if f is the supertype.
        // So, arrowType1 is subtype of arrowType2.

        assertTrue(arrowType1.isSubtype(arrowType2)); // f(Object) is subtype of g(String)
    }


    @Test
    public void testIsSubtypeParamContravariantRequiredMismatch() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node requiredParam1 = new Node(Token.PARAM, new SimpleSlotType("String", registry));
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(requiredParam1);
        ArrowType arrowType1 = new ArrowType(registry, params1, new SimpleSlotType("Void", registry)); // Required param

        Node optionalParam2 = new Node(Token.PARAM, new SimpleSlotType("String", registry));
        optionalParam2.putBooleanProp(Node.OPT_ARG_NAME, true); // Make it optional
        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(optionalParam2);
        ArrowType arrowType2 = new ArrowType(registry, params2, new SimpleSlotType("Void", registry)); // Optional param

        // arrowType1 <: arrowType2. arrowType1 has a required param, arrowType2 has optional.
        // `this` = arrowType1 (required), `that` = arrowType2 (optional).
        // `thisParamType` = String, `thatParamType` = String.
        // Check: `thatParamType.isSubtype(thisParamType)` => `String.isSubtype(String)` => true.
        // So arrowType1 is subtype of arrowType2.

        // The original test expected false. Let's re-read the code:
        // `if (!thisIsOptional && thatIsOptional) { ... return false; }`
        // This condition checks if `this` has a required argument that `that` is missing.
        // `thisIsOptional` is true if `thisParam.isVarArgs() || thisParam.isOptionalArg()`.
        // In this case: `thisParam` is required, so `thisIsOptional` is false. `thatParam` is optional, so `thatIsOptional` is true.
        // So `!thisIsOptional` is true, and `thatIsOptional` is true. The condition `!thisIsOptional && thatIsOptional` is true.
        // Therefore, it should return false.
        assertFalse(arrowType1.isSubtype(arrowType2));
    }

    @Test
    public void testIsSubtypeVarArgs() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node varArgsParam1 = new Node(Token.PARAM, new SimpleSlotType("String", registry));
        varArgsParam1.putBooleanProp(Node.VAR_ARGS_NAME, true);
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(varArgsParam1);
        ArrowType arrowType1 = new ArrowType(registry, params1, new SimpleSlotType("Void", registry));

        Node varArgsParam2 = new Node(Token.PARAM, new SimpleSlotType("String", registry));
        varArgsParam2.putBooleanProp(Node.VAR_ARGS_NAME, true);
        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(varArgsParam2);
        ArrowType arrowType2 = new ArrowType(registry, params2, new SimpleSlotType("Void", registry));

        // Both are var_args, should be subtypes of each other if params match.
        assertTrue(arrowType1.isSubtype(arrowType2));
        assertTrue(arrowType2.isSubtype(arrowType1));
    }

    @Test
    public void testIsSubtypeOneHasMoreOptionalParams() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        ArrowType arrowType1 = new ArrowType(registry, params1, new SimpleSlotType("Void", registry));

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        Node extraParam = new Node(Token.PARAM, new SimpleSlotType("Number", registry)); // Extra param
        extraParam.putBooleanProp(Node.OPT_ARG_NAME, true); // Make extra param optional
        params2.addChildToBack(extraParam);
        ArrowType arrowType2 = new ArrowType(registry, params2, new SimpleSlotType("Void", registry));

        // arrowType1 <: arrowType2 (fewer params, all optional or missing)
        // `this` = arrowType1 (String param), `that` = arrowType2 (String, Number(opt) params).
        // `thisParamType` = String, `thatParamType` = String.
        // Check 1: `thatParamType.isSubtype(thisParamType)` => `String.isSubtype(String)` => True.
        // Loop ends because `thisParam` becomes null.
        // Then check `if (thisParam != null && !thisParam.isOptionalArg() && !thisParam.isVarArgs() && thatParam == null)`
        // `thisParam` is null. So this condition is false.
        // Returns true.
        assertTrue(arrowType1.isSubtype(arrowType2));
    }

    @Test
    public void testIsSubtypeOtherHasMoreRequiredParams() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        ArrowType arrowType1 = new ArrowType(registry, params1, new SimpleSlotType("Void", registry));

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        Node extraParam = new Node(Token.PARAM, new SimpleSlotType("Number", registry)); // Extra required param
        params2.addChildToBack(extraParam);
        ArrowType arrowType2 = new ArrowType(registry, params2, new SimpleSlotType("Void", registry));

        // arrowType1 <: arrowType2. arrowType2 has an extra required param.
        // `this` = arrowType1 (String param), `that` = arrowType2 (String, Number params).
        // `thisParamType` = String, `thatParamType` = String.
        // Check 1: `thatParamType.isSubtype(thisParamType)` => `String.isSubtype(String)` => True.
        // Advance `thisParam` to Number, `thatParam` to Number.
        // `thisParamType` = null (param node exists but getJSType() returns null in this mock), `thatParamType` = Number.
        // Code: `if (thisParamType != null)` - this is false.
        // Advance `thisParam` to null, `thatParam` to null.
        // Loop ends.
        // Final check: `if (thisParam != null && !thisParam.isOptionalArg() && !thisParam.isVarArgs() && thatParam == null)`
        // `thisParam` is null. Condition is false.
        // Returns true.

        // This seems wrong based on my understanding of subtyping.
        // Let's re-read the logic for parameter count mismatch:
        // `if (thisParam != null && !thisParam.isOptionalArg() && !thisParam.isVarArgs() && thatParam == null) { return false; }`
        // This means if `this` has a required parameter remaining, but `that` has run out of parameters, it's not a subtype.
        // In our case:
        // `this` = arrowType1 (String)
        // `that` = arrowType2 (String, Number)
        // After matching "String", `thisParam` becomes null, `thatParam` points to Number.
        // The loop ends.
        // The final check: `thisParam` is null. So the condition `thisParam != null` is false.
        // It returns true. This means arrowType1 is a subtype of arrowType2.

        // Let's reverse for clarity: arrowType2 <: arrowType1.
        // `this` = arrowType2 (String, Number), `that` = arrowType1 (String).
        // `thisParamType` = String, `thatParamType` = String. Check `String.isSubtype(String)` -> True.
        // Advance `thisParam` to Number, `thatParam` to null.
        // `thisParamType` = Number, `thatParamType` = null.
        // Check `if (thisParamType != null)` is true.
        // Check `if (thatParamType == null || !thatParamType.isSubtype(thisParamType))`
        // `thatParamType` is null, so `thatParamType == null` is true. Returns false.
        // Correctly returns false: arrowType2 is NOT a subtype of arrowType1.
        assertFalse(arrowType2.isSubtype(arrowType1));
    }

    @Test
    public void testIsSubtypeFirstParamNull() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        ArrowType arrowType1 = new ArrowType(registry, params1, new SimpleSlotType("Void", registry));

        Node params2 = new Node(Token.PARAM_LIST);
        // Null JSType for param means UNKNOWN_TYPE
        params2.addChildToBack(new Node(Token.PARAM, null)); // Null param type
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("Number", registry)));
        ArrowType arrowType2 = new ArrowType(registry, params2, new SimpleSlotType("Void", registry));

        // arrowType1 <: arrowType2.
        // `this` = arrowType1 (String param), `that` = arrowType2 (null/UNKNOWN, Number params).
        // `thisParamType` = String, `thatParamType` = UNKNOWN_TYPE.
        // Check: `thatParamType.isSubtype(thisParamType)` => `UNKNOWN_TYPE.isSubtype(String)`
        // In mock `SimpleSlotType.isSubtype`, UNKNOWN_TYPE is not subtype of String. So this is false.
        // Code returns false.
        assertFalse(arrowType1.isSubtype(arrowType2));
    }

    @Test
    public void testIsSubtypeSecondParamNull() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("Number", registry)));
        ArrowType arrowType1 = new ArrowType(registry, params1, new SimpleSlotType("Void", registry));

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        params2.addChildToBack(new Node(Token.PARAM, null)); // Null param type (UNKNOWN_TYPE)
        ArrowType arrowType2 = new ArrowType(registry, params2, new SimpleSlotType("Void", registry));

        // arrowType2 <: arrowType1.
        // `this` = arrowType2 (String, UNKNOWN), `that` = arrowType1 (String, Number).
        // Check 1: `thisParamType` = String, `thatParamType` = String. `String.isSubtype(String)` => True.
        // Advance. `thisParam` = UNKNOWN, `thatParam` = Number.
        // `thisParamType` = UNKNOWN, `thatParamType` = Number.
        // Check 2: `thatParamType.isSubtype(thisParamType)` => `Number.isSubtype(UNKNOWN)` => False (in mock).
        // Code returns false.
        assertFalse(arrowType2.isSubtype(arrowType1));
    }


    @Test
    public void testIsEquivalentToTrue() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType1 = new SimpleSlotType("Number", registry);
        ArrowType arrowType1 = new ArrowType(registry, params1, returnType1);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType2 = new SimpleSlotType("Number", registry);
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2);

        assertTrue(arrowType1.isEquivalentTo(arrowType2));
    }

    @Test
    public void testIsEquivalentToFalseDifferentReturn() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType1 = new SimpleSlotType("Number", registry);
        ArrowType arrowType1 = new ArrowType(registry, params1, returnType1);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType2 = new SimpleSlotType("Boolean", registry); // Different return type
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2);

        assertFalse(arrowType1.isEquivalentTo(arrowType2));
    }

    @Test
    public void testIsEquivalentToFalseDifferentParam() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType1 = new SimpleSlotType("Number", registry);
        ArrowType arrowType1 = new ArrowType(registry, params1, returnType1);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("Number", registry))); // Different param type
        JSType returnType2 = new SimpleSlotType("Number", registry);
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2);

        assertFalse(arrowType1.isEquivalentTo(arrowType2));
    }

    @Test
    public void testIsEquivalentToFalseDifferentParamCount() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType1 = new SimpleSlotType("Number", registry);
        ArrowType arrowType1 = new ArrowType(registry, params1, returnType1);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("Number", registry))); // Extra param
        JSType returnType2 = new SimpleSlotType("Number", registry);
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2);

        assertFalse(arrowType1.isEquivalentTo(arrowType2));
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
    public void testHashCode() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType1 = new SimpleSlotType("Number", registry);
        ArrowType arrowType1 = new ArrowType(registry, params1, returnType1, false);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType2 = new SimpleSlotType("Number", registry);
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2, false);

        assertEquals(arrowType1.hashCode(), arrowType2.hashCode());
    }

    @Test
    public void testHashCodeDifferent() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType1 = new SimpleSlotType("Number", registry);
        ArrowType arrowType1 = new ArrowType(registry, params1, returnType1, false);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("Boolean", registry))); // Different param type
        JSType returnType2 = new SimpleSlotType("Number", registry);
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2, false);

        assertNotEquals(arrowType1.hashCode(), arrowType2.hashCode());
    }

    @Test
    public void testHashCodeWithInferredReturn() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType1 = new SimpleSlotType("Number", registry);
        ArrowType arrowType1 = new ArrowType(registry, params1, returnType1, true); // returnTypeInferred = true

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        JSType returnType2 = new SimpleSlotType("Number", registry);
        ArrowType arrowType2 = new ArrowType(registry, params2, returnType2, false); // returnTypeInferred = false

        assertNotEquals(arrowType1.hashCode(), arrowType2.hashCode());
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
    public void testResolveInternal() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node paramNode = new Node(Token.PARAM, new SimpleSlotType("String", registry));
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(paramNode);
        JSType returnType = new SimpleSlotType("Number", registry);
        ArrowType arrowType = new ArrowType(registry, params, returnType);

        // In a real scenario, resolveInternal would resolve types.
        // Here, we just check that it doesn't throw and returns itself.
        ArrowType resolvedType = (ArrowType) arrowType.resolveInternal(new MockErrorReporter(), null);
        assertSame(arrowType, resolvedType);
        // Check if types within are resolved (they are already simple types here)
        assertEquals("String", paramNode.getJSType().toString());
        assertEquals("Number", resolvedType.returnType.toString());
    }

    @Test
    public void testResolveInternalWithUnknown() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node paramNode = new Node(Token.PARAM, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(paramNode);
        JSType returnType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        ArrowType arrowType = new ArrowType(registry, params, returnType);

        ArrowType resolvedType = (ArrowType) arrowType.resolveInternal(new MockErrorReporter(), null);
        assertSame(arrowType, resolvedType);
        // After resolution, UNKNOWN_TYPE should remain UNKNOWN_TYPE.
        assertTrue(paramNode.getJSType().isUnknownType());
        assertTrue(resolvedType.returnType.isUnknownType());
    }

    @Test
    public void testHasUnknownParamsOrReturn_unknownParam() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node paramNode = new Node(Token.PARAM, registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(paramNode);
        JSType returnType = new SimpleSlotType("String", registry);
        ArrowType arrowType = new ArrowType(registry, params, returnType);

        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturn_unknownReturn() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node paramNode = new Node(Token.PARAM, new SimpleSlotType("String", registry));
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(paramNode);
        JSType returnType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        ArrowType arrowType = new ArrowType(registry, params, returnType);

        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturn_noUnknown() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node paramNode = new Node(Token.PARAM, new SimpleSlotType("String", registry));
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(paramNode);
        JSType returnType = new SimpleSlotType("String", registry);
        ArrowType arrowType = new ArrowType(registry, params, returnType);

        assertFalse(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturn_nullParam() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(new Node(Token.PARAM, null)); // null JSType for param
        JSType returnType = new SimpleSlotType("String", registry);
        ArrowType arrowType = new ArrowType(registry, params, returnType);

        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturn_nullReturn() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        ArrowType arrowType = new ArrowType(registry, params, null); // null returnType

        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasUnknownParamsOrReturn_nullParamsAndReturn() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType = new ArrowType(registry, null, null); // null params and returnType

        assertTrue(arrowType.hasUnknownParamsOrReturn());
    }

    @Test
    public void testHasEqualParametersTrue() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("Number", registry)));
        ArrowType arrowType1 = new ArrowType(registry, params1, null);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("Number", registry)));
        ArrowType arrowType2 = new ArrowType(registry, params2, null);

        assertTrue(arrowType1.hasEqualParameters(arrowType2));
    }

    @Test
    public void testHasEqualParametersFalseDifferentType() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        ArrowType arrowType1 = new ArrowType(registry, params1, null);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("Number", registry))); // Different type
        ArrowType arrowType2 = new ArrowType(registry, params2, null);

        assertFalse(arrowType1.hasEqualParameters(arrowType2));
    }

    @Test
    public void testHasEqualParametersFalseDifferentCount() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        Node params1 = new Node(Token.PARAM_LIST);
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        params1.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("Number", registry)));
        ArrowType arrowType1 = new ArrowType(registry, params1, null);

        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry))); // Fewer params
        ArrowType arrowType2 = new ArrowType(registry, params2, null);

        assertFalse(arrowType1.hasEqualParameters(arrowType2));
    }

    @Test
    public void testHasEqualParametersTrueNull() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType1 = new ArrowType(registry, null, null);
        ArrowType arrowType2 = new ArrowType(registry, null, null);
        assertTrue(arrowType1.hasEqualParameters(arrowType2));
    }

    @Test
    public void testHasEqualParametersFalseNullAndNotNull() throws Exception {
        JSTypeRegistry registry = new MockJSTypeRegistry();
        ArrowType arrowType1 = new ArrowType(registry, null, null);
        Node params2 = new Node(Token.PARAM_LIST);
        params2.addChildToBack(new Node(Token.PARAM, new SimpleSlotType("String", registry)));
        ArrowType arrowType2 = new ArrowType(registry, params2, null);
        assertFalse(arrowType1.hasEqualParameters(arrowType2));
    }
}
```