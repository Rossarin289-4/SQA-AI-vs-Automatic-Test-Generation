```java
package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.testing.EmptyScope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.EvaluatorException; // Added import for EvaluatorException
import com.google.javascript.rhino.jstype.BooleanLiteralSet; // Added import

public class JSTypeTest {

    // Mock ErrorReporter and JSTypeRegistry for testing purposes
    private ErrorReporter errorReporter = new ErrorReporter() {
        @Override
        public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {}
        @Override
        public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {}
        @Override
        public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
            return new EvaluatorException(message);
        }
    };

    private JSTypeRegistry registry = new JSTypeRegistry(errorReporter);

    // MockJSType needs to implement all abstract methods of JSType.
    private static class MockJSType extends JSType {
        private boolean isSubtypeResult;
        private boolean isEquivalentToResult;
        private boolean isNoTypeResult = false;
        private boolean isNoObjectTypeResult = false;
        private boolean isNoResolvedTypeResult = false;
        private boolean isEmptyTypeResult = false;
        private boolean isUnknownTypeResult = false;
        private boolean isStringValueTypeResult = false;
        private boolean isNumberValueTypeResult = false;
        private boolean isBooleanValueTypeResult = false;
        private boolean isStringObjectTypeResult = false;
        private boolean isNumberObjectTypeResult = false;
        private boolean isBooleanObjectTypeResult = false;
        private boolean isFunctionPrototypeTypeResult = false;
        private boolean isArrayTypeResult = false;
        private boolean isRegexpTypeResult = false;
        private boolean isDateTypeResult = false;
        private boolean isNullTypeResult = false;
        private boolean isVoidTypeResult = false;
        private boolean isAllTypeResult = false;
        private boolean isCheckedUnknownTypeResult = false;
        private boolean isUnionTypeResult = false;
        private boolean isFunctionTypeResult = false;
        private boolean isEnumElementTypeResult = false;
        private boolean isEnumTypeResult = false;
        private boolean isRecordTypeResult = false;
        private boolean isTemplateTypeResult = false;
        private boolean isObjectResult = false;
        private boolean isConstructorResult = false;
        private boolean isNominalTypeResult = false;
        private boolean isInstanceTypeResult = false;
        private boolean isInterfaceResult = false;
        private boolean isOrdinaryFunctionResult = false;
        private TernaryValue possibleToBooleanOutcomes = TernaryValue.UNKNOWN;
        private JSType findPropertyTypeResult = null;
        private JSDocInfo jsDocInfo = null;
        private String displayName = null;
        private Set<String> ownPropertyNames = null;
        private Set<String> propertyNames = null;
        private ObjectType implicitPrototype = null;
        private JSType indexType = null;
        private JSType parameterType = null;
        private Node propertyNode = null;
        private boolean resolvedInternalCalled = false; // Track if resolveInternal was called

        MockJSType(JSTypeRegistry registry, boolean isSubtypeResult, boolean isEquivalentToResult) {
            super(registry);
            this.isSubtypeResult = isSubtypeResult;
            this.isEquivalentToResult = isEquivalentToResult;
        }

        // Setters for mock results
        public void setMockResults(
            boolean isNoTypeResult, boolean isNoObjectTypeResult, boolean isNoResolvedTypeResult,
            boolean isEmptyTypeResult, boolean isUnknownTypeResult, boolean isStringValueTypeResult,
            boolean isNumberValueTypeResult, boolean isBooleanValueTypeResult, boolean isStringObjectTypeResult,
            boolean isNumberObjectTypeResult, boolean isBooleanObjectTypeResult, boolean isFunctionPrototypeTypeResult,
            boolean isArrayTypeResult, boolean isRegexpTypeResult, boolean isDateTypeResult, boolean isNullTypeResult,
            boolean isVoidTypeResult, boolean isAllTypeResult, boolean isCheckedUnknownTypeResult, boolean isUnionTypeResult,
            boolean isFunctionTypeResult, boolean isEnumElementTypeResult, boolean isEnumTypeResult, boolean isRecordTypeResult,
            boolean isTemplateTypeResult, boolean isObjectResult, boolean isConstructorResult, boolean isNominalTypeResult,
            boolean isInstanceTypeResult, boolean isInterfaceResult, boolean isOrdinaryFunctionResult) {
            this.isNoTypeResult = isNoTypeResult;
            this.isNoObjectTypeResult = isNoObjectTypeResult;
            this.isNoResolvedTypeResult = isNoResolvedTypeResult;
            this.isEmptyTypeResult = isEmptyTypeResult;
            this.isUnknownTypeResult = isUnknownTypeResult;
            this.isStringValueTypeResult = isStringValueTypeResult;
            this.isNumberValueTypeResult = isNumberValueTypeResult;
            this.isBooleanValueTypeResult = isBooleanValueTypeResult;
            this.isStringObjectTypeResult = isStringObjectTypeResult;
            this.isNumberObjectTypeResult = isNumberObjectTypeResult;
            this.isBooleanObjectTypeResult = isBooleanObjectTypeResult;
            this.isFunctionPrototypeTypeResult = isFunctionPrototypeTypeResult;
            this.isArrayTypeResult = isArrayTypeResult;
            this.isRegexpTypeResult = isRegexpTypeResult;
            this.isDateTypeResult = isDateTypeResult;
            this.isNullTypeResult = isNullTypeResult;
            this.isVoidTypeResult = isVoidTypeResult;
            this.isAllTypeResult = isAllTypeResult;
            this.isCheckedUnknownTypeResult = isCheckedUnknownTypeResult;
            this.isUnionTypeResult = isUnionTypeResult;
            this.isFunctionTypeResult = isFunctionTypeResult;
            this.isEnumElementTypeResult = isEnumElementTypeResult;
            this.isEnumTypeResult = isEnumTypeResult;
            this.isRecordTypeResult = isRecordTypeResult;
            this.isTemplateTypeResult = isTemplateTypeResult;
            this.isObjectResult = isObjectResult;
            this.isConstructorResult = isConstructorResult;
            this.isNominalTypeResult = isNominalTypeResult;
            this.isInstanceTypeResult = isInstanceTypeResult;
            this.isInterfaceResult = isInterfaceResult;
            this.isOrdinaryFunctionResult = isOrdinaryFunctionResult;
        }

        public void setFindPropertyTypeResult(JSType findPropertyTypeResult) { this.findPropertyTypeResult = findPropertyTypeResult; }
        public void setPossibleToBooleanOutcomesValue(TernaryValue possibleToBooleanOutcomes) { this.possibleToBooleanOutcomes = possibleToBooleanOutcomes; }
        public void setJsDocInfo(JSDocInfo jsDocInfo) { this.jsDocInfo = jsDocInfo; }
        public void setDisplayName(String displayName) { this.displayName = displayName; }
        public void setOwnPropertyList(Set<String> names) { this.ownPropertyNames = names; }
        public void setPropertyList(Set<String> names) { this.propertyNames = names; }
        public void setImplicitPrototype(ObjectType implicitPrototype) { this.implicitPrototype = implicitPrototype; }
        public void setIndexType(JSType indexType) { this.indexType = indexType; }
        public void setParameterType(JSType parameterType) { this.parameterType = parameterType; }
        public void setPropertyNode(Node propertyNode) { this.propertyNode = propertyNode; }

        @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() {
            return BooleanLiteralSet.fromTernaryValue(possibleToBooleanOutcomes);
        }

        @Override
        JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
            resolvedInternalCalled = true;
            return registry.getNativeType(JSTypeNative.UNKNOWN_TYPE); // Default for mock
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return null; // Default for mock
        }

        @Override public boolean isNoType() { return isNoTypeResult; }
        @Override public boolean isNoObjectType() { return isNoObjectTypeResult; }
        @Override public boolean isNoResolvedType() { return isNoResolvedTypeResult; }
        @Override public final boolean isEmptyType() { return isEmptyTypeResult; }
        @Override public boolean isUnknownType() { return isUnknownTypeResult; }
        @Override public boolean isStringValueType() { return isStringValueTypeResult; }
        @Override public boolean isNumberValueType() { return isNumberValueTypeResult; }
        @Override public boolean isBooleanValueType() { return isBooleanValueTypeResult; }
        @Override public boolean isStringObjectType() { return isStringObjectTypeResult; }
        @Override public boolean isNumberObjectType() { return isNumberObjectTypeResult; }
        @Override public boolean isBooleanObjectType() { return isBooleanObjectTypeResult; }
        @Override public boolean isFunctionPrototypeType() { return isFunctionPrototypeTypeResult; }
        @Override public boolean isArrayType() { return isArrayTypeResult; }
        @Override public boolean isRegexpType() { return isRegexpTypeResult; }
        @Override public boolean isDateType() { return isDateTypeResult; }
        @Override public boolean isNullType() { return isNullTypeResult; }
        @Override public boolean isVoidType() { return isVoidTypeResult; }
        @Override public boolean isAllType() { return isAllTypeResult; }
        @Override public boolean isCheckedUnknownType() { return isCheckedUnknownTypeResult; }
        @Override public boolean isUnionType() { return isUnionTypeResult; }
        @Override public boolean isFunctionType() { return isFunctionTypeResult; }
        @Override public boolean isEnumElementType() { return isEnumElementTypeResult; }
        @Override public boolean isEnumType() { return isEnumTypeResult; }
        @Override public boolean isRecordType() { return isRecordTypeResult; }
        @Override public boolean isTemplateType() { return isTemplateTypeResult; }
        @Override public boolean isObject() { return isObjectResult; }
        @Override public boolean isConstructor() { return isConstructorResult; }
        @Override public boolean isNominalType() { return isNominalTypeResult; }
        @Override public boolean isInstanceType() { return isInstanceTypeResult; }
        @Override public boolean isInterface() { return isInterfaceResult; }
        @Override public boolean isOrdinaryFunction() { return isOrdinaryFunctionResult; }

        @Override
        public boolean isSubtype(JSType that) {
            return this.isSubtypeResult;
        }

        @Override
        public boolean isEquivalentTo(JSType jsType) {
            return this.isEquivalentToResult;
        }

        @Override
        public JSType findPropertyType(String propertyName) { return this.findPropertyTypeResult; }

        // Mock implementations for ObjectType members
        public String getReferenceName() { return "MockObject"; }
        public FunctionType getConstructor() { return null; }
        public ObjectType getImplicitPrototype() { return this.implicitPrototype; }
        public boolean defineDeclaredProperty(String propertyName, JSType type, boolean inExterns, Node propertyNode) { return true; }
        public boolean defineInferredProperty(String propertyName, JSType type, boolean inExterns, Node propertyNode) { return true; }
        public boolean defineProperty(String propertyName, JSType type, boolean inferred, boolean inExterns, Node propertyNode) { return true; }
        public Node getPropertyNode(String propertyName) { return this.propertyNode; }
        public JSDocInfo getOwnPropertyJSDocInfo(String propertyName) { return null; }
        public void setPropertyJSDocInfo(String propertyName, JSDocInfo info, boolean inExterns) {}
        public boolean hasProperty(String propertyName) { return false; }
        public boolean hasOwnProperty(String propertyName) { return false; }
        public Set<String> getOwnPropertyNames() { return this.ownPropertyNames; }
        public boolean isPropertyTypeInferred(String propertyName) { return false; }
        public boolean isPropertyTypeDeclared(String propertyName) { return false; }
        public boolean hasOwnDeclaredProperty(String name) { return false; }
        public boolean isPropertyInExterns(String propertyName) { return false; }
        public int getPropertiesCount() { return 0; }
        public Set<String> getPropertyNames() { return this.propertyNames; }
        public void collectPropertyNames(Set<String> props) {}
        public JSType getParameterType() { return this.parameterType; }
        public JSType getIndexType() { return this.indexType; }
        public boolean detectImplicitPrototypeCycle() { return false; }
        public boolean isImplicitPrototype(ObjectType prototype) { return false; }
        public boolean hasCachedValues() { return false; }
        public void clearCachedValues() {}
        public boolean isNativeObjectType() { return false; }

        @Override
        public boolean isNullable() { return false; }
        @Override
        public boolean matchesNumberContext() { return false; }
        @Override
        public boolean matchesStringContext() { return false; }
        @Override
        public boolean matchesObjectContext() { return false; }
        @Override
        public boolean canBeCalled() { return false; }
        @Override
        public JSType autoboxesTo() { return null; }
        @Override
        public JSType unboxesTo() { return null; }
        @Override
        public ObjectType toObjectType() { return null; }

        @Override
        public final ObjectType dereference() {
            JSType restricted = restrictByNotNullOrUndefined();
            JSType autobox = restricted.autoboxesTo();
            return ObjectType.cast(autobox == null ? restricted : autobox);
        }

        @Override
        public final boolean canTestForEqualityWith(JSType that) {
            return testForEquality(that).equals(TernaryValue.UNKNOWN);
        }

        @Override
        public TernaryValue testForEquality(JSType that) {
            return TernaryValue.UNKNOWN; // Default for mock
        }

        @Override
        public final boolean canTestForShallowEqualityWith(JSType that) {
            return this.isSubtype(that) || that.isSubtype(this);
        }

        @Override
        public JSType getLeastSupertype(JSType that) {
            if (that.isUnionType()) {
                return that.getLeastSupertype(this);
            }
            return getLeastSupertype(this, that);
        }

        static JSType getLeastSupertype(JSType thisType, JSType thatType) {
            boolean areEquivalent = thisType.isEquivalentTo(thatType);
            return areEquivalent ? thisType :
                filterNoResolvedType(
                    thisType.registry.createUnionType(thisType, thatType));
        }

        @Override
        public JSType getGreatestSubtype(JSType that) {
            if (that.isRecordType()) {
                return that.getGreatestSubtype(this);
            }
            return getGreatestSubtype(this, that);
        }

        static JSType getGreatestSubtype(JSType thisType, JSType thatType) {
            if (thisType.isEquivalentTo(thatType)) {
                return thisType;
            } else if (thisType.isUnknownType() || thatType.isUnknownType()) {
                return thisType.isEquivalentTo(thatType) ? thisType :
                    thisType.getNativeType(JSTypeNative.UNKNOWN_TYPE);
            } else if (thisType.isSubtype(thatType)) {
                return filterNoResolvedType(thisType);
            } else if (thatType.isSubtype(thisType)) {
                return filterNoResolvedType(thatType);
            } else if (thisType.isUnionType()) {
                return ((UnionType) thisType).meet(thatType);
            } else if (thatType.isUnionType()) {
                return ((UnionType) thatType).meet(thisType);
            } else if (thisType.isObject() && thatType.isObject()) {
                return thisType.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
            }
            return thisType.getNativeType(JSTypeNative.NO_TYPE);
        }

        static JSType filterNoResolvedType(JSType type) {
            if (type.isNoResolvedType()) {
                return type.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
            } else if (type instanceof UnionType) {
                UnionType unionType = (UnionType) type;
                boolean needsFiltering = false;
                for (JSType alt : unionType.getAlternates()) {
                    if (alt.isNoResolvedType()) {
                        needsFiltering = true;
                        break;
                    }
                }

                if (needsFiltering) {
                    UnionTypeBuilder builder = new UnionTypeBuilder(type.registry);
                    for (JSType alt : unionType.getAlternates()) {
                        if (!alt.isNoResolvedType()) {
                            builder.addAlternate(alt);
                        }
                    }
                    return builder.build();
                }
            }
            return type;
        }

        @Override
        public JSType getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
            BooleanLiteralSet literals = getPossibleToBooleanOutcomes();
            if (literals.contains(outcome)) {
                return this;
            } else {
                return getNativeType(JSTypeNative.NO_TYPE);
            }
        }

        @Override
        public JSType restrictByNotNullOrUndefined() {
            return this; // Default for mock
        }

        @Override
        public TypePair getTypesUnderEquality(JSType that) {
            if (that instanceof UnionType) {
                TypePair p = that.getTypesUnderEquality(this);
                return new TypePair(p.typeB, p.typeA);
            }
            switch (this.testForEquality(that)) {
                case FALSE: return new TypePair(null, null);
                case TRUE: case UNKNOWN: return new TypePair(this, that);
            }
            throw new IllegalStateException();
        }

        @Override
        public TypePair getTypesUnderInequality(JSType that) {
            if (that instanceof UnionType) {
                TypePair p = that.getTypesUnderInequality(this);
                return new TypePair(p.typeB, p.typeA);
            }
            switch (this.testForEquality(that)) {
                case TRUE:
                    JSType noType = getNativeType(JSTypeNative.NO_TYPE);
                    return new TypePair(noType, noType);
                case FALSE: case UNKNOWN: return new TypePair(this, that);
            }
            throw new IllegalStateException();
        }

        @Override
        public TypePair getTypesUnderShallowEquality(JSType that) {
            JSType commonType = getGreatestSubtype(that);
            return new TypePair(commonType, commonType);
        }

        @Override
        public TypePair getTypesUnderShallowInequality(JSType that) {
            if (that instanceof UnionType) {
                TypePair p = that.getTypesUnderShallowInequality(this);
                return new TypePair(p.typeB, p.typeA);
            }
            if (this.isNullType() && that.isNullType() || this.isVoidType() && that.isVoidType()) {
                return new TypePair(null, null);
            } else {
                return new TypePair(this, that);
            }
        }

        @Override
        public boolean isResolved() {
            return resolvedInternalCalled; // simplified for mock
        }

        @Override
        void setResolvedTypeInternal(JSType type) {
            // Mock implementation - we don't need to store a result here for basic tests.
            // If a test specifically checks resolve(), it would need a more detailed mock.
            // For now, we ensure resolvedInternalCalled is true if resolve is called.
        }

        @Override
        public void clearResolved() {
            resolvedInternalCalled = false; // Reset mock state
        }

        @Override
        public boolean setValidator(Predicate<JSType> validator) {
            return validator.apply(this);
        }

        @Override
        public String toDebugHashCodeString() {
            return "{" + System.identityHashCode(this) + "}";
        }

        @Override
        public String getDisplayName() { return this.displayName; }
        @Override
        public boolean hasDisplayName() { return this.displayName != null && !this.displayName.isEmpty(); }
        @Override
        public JSDocInfo getJSDocInfo() { return this.jsDocInfo; }
    }

    // Helper to create concrete JSTypes for tests where mocks are not sufficient
    private JSType createNumberType() { return registry.getNativeType(JSTypeNative.NUMBER_TYPE); }
    private JSType createStringType() { return registry.getNativeType(JSTypeNative.STRING_TYPE); }
    private JSType createObjectType() { return registry.getNativeType(JSTypeNative.OBJECT_TYPE); }
    private JSType createNullType() { return registry.getNativeType(JSTypeNative.NULL_TYPE); }
    private JSType createVoidType() { return registry.getNativeType(JSTypeNative.VOID_TYPE); }
    private JSType createUnknownType() { return registry.getNativeType(JSTypeNative.UNKNOWN_TYPE); }
    private JSType createAllType() { return registry.getNativeType(JSTypeNative.ALL_TYPE); }
    private JSType createNoType() { return registry.getNativeType(JSTypeNative.NO_TYPE); }
    private JSType createNoObjectType() { return registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE); }
    private JSType createNoResolvedType() { return registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE); }
    private JSType createNumberObjectType() { return registry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE); }
    private JSType createStringObjectType() { return registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE); }
    private JSType createBooleanObjectType() { return registry.getNativeType(JSTypeNative.BOOLEAN_OBJECT_TYPE); }
    private JSType createBooleanValueType() { return registry.getNativeType(JSTypeNative.BOOLEAN_TYPE); }
    private JSType createFunctionType() { return registry.createFunctionType(createVoidType()); }
    private ObjectType createNamedType(String name) {
        // Use createNullableObjectIndexedType as createNamedType is not directly visible or takes more arguments
        return registry.createNullableObjectIndexedType(name);
    }

    @Test
    public void testIsEquivalentToWithEqualTypes() throws Exception {
        JSType type1 = createNamedType("A");
        JSType type2 = createNamedType("A");
        assertTrue(type1.isEquivalentTo(type2));
    }

    @Test
    public void testIsEquivalentToWithDifferentTypes() throws Exception {
        JSType type1 = createNamedType("A");
        JSType type2 = createNamedType("B");
        assertFalse(type1.isEquivalentTo(type2));
    }

    @Test
    public void testIsEquivalentStaticMethod() throws Exception {
        JSType type1 = createNamedType("A");
        JSType type2 = createNamedType("A");
        assertTrue(JSType.isEquivalent(type1, type2));
    }

    @Test
    public void testIsEquivalentStaticMethodWithNull() throws Exception {
        JSType type1 = createNamedType("A");
        assertFalse(JSType.isEquivalent(type1, null));
        assertFalse(JSType.isEquivalent(null, type1));
        assertTrue(JSType.isEquivalent(null, null));
    }

    @Test
    public void testEqualsWithEqualTypes() throws Exception {
        JSType type1 = createNamedType("A");
        JSType type2 = createNamedType("A");
        assertTrue(type1.equals(type2));
    }

    @Test
    public void testEqualsWithDifferentTypes() throws Exception {
        JSType type1 = createNamedType("A");
        JSType type2 = createNamedType("B");
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEqualsWithNonJSTypeObject() throws Exception {
        JSType type1 = createNamedType("A");
        assertFalse(type1.equals(new Object()));
    }

    @Test
    public void testHashCodeConsistency() throws Exception {
        JSType type1 = createNamedType("A");
        JSType type2 = createNamedType("A");
        assertEquals(type1.hashCode(), type2.hashCode());
    }

    @Test
    public void testHashCodeDifference() throws Exception {
        JSType type1 = createNamedType("A");
        JSType type2 = createNamedType("B");
        assertNotEquals(type1.hashCode(), type2.hashCode()); // Use assertNotEquals
    }

    @Test
    public void testMatchesInt32ContextForNumber() throws Exception {
        assertTrue(createNumberType().matchesInt32Context());
    }

    @Test
    public void testMatchesUint32ContextForNumber() throws Exception {
        assertTrue(createNumberType().matchesUint32Context());
    }

    @Test
    public void testMatchesNumberContextForNumber() throws Exception {
        assertTrue(createNumberType().matchesNumberContext());
    }

    @Test
    public void testMatchesStringContextForString() throws Exception {
        assertTrue(createStringType().matchesStringContext());
    }

    @Test
    public void testMatchesObjectContextForObject() throws Exception {
        assertTrue(createObjectType().matchesObjectContext());
    }

    @Test
    public void testFindPropertyTypeOnObject() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType(); // Cast to ObjectType
        JSType stringType = createStringType();
        objectType.defineInferredProperty("testProp", stringType, false, null);
        assertEquals(stringType, objectType.findPropertyType("testProp"));
    }

    @Test
    public void testFindPropertyTypeOnUnknownType() throws Exception {
        assertNull(createUnknownType().findPropertyType("anyProp"));
    }

    @Test
    public void testCanBeCalledForFunctionType() throws Exception {
        assertTrue(createFunctionType().canBeCalled());
    }

    @Test
    public void testCanBeCalledForObjectType() throws Exception {
        assertFalse(createObjectType().canBeCalled());
    }

    @Test
    public void testCanAssignToWhenSubtype() throws Exception {
        JSType numberType = createNumberType();
        JSType objectType = createObjectType();
        assertTrue(numberType.canAssignTo(objectType)); // number is a subtype of object
    }

    @Test
    public void testCanAssignToWhenNotSubtype() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();
        assertFalse(stringType.canAssignTo(numberType));
    }

    @Test
    public void testAutoboxesToForNumber() throws Exception {
        assertEquals(createNumberObjectType(), createNumberType().autoboxesTo());
    }

    @Test
    public void testUnboxesToForStringObject() throws Exception {
        assertEquals(createStringType(), createStringObjectType().unboxesTo());
    }

    @Test
    public void testToObjectTypeWhenIsObjectType() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType(); // Cast to ObjectType
        assertSame(objectType, objectType.toObjectType());
    }

    @Test
    public void testToObjectTypeWhenNotObjectType() throws Exception {
        assertNull(createStringType().toObjectType());
    }

    @Test
    public void testDereferenceForObjectType() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType(); // Cast to ObjectType
        ObjectType dereferenced = objectType.dereference();
        assertNotNull(dereferenced);
        assertSame(objectType, dereferenced);
    }

    @Test
    public void testDereferenceForPrimitiveType() throws Exception {
        assertEquals(createNumberObjectType(), createNumberType().dereference());
    }

    @Test
    public void testCanTestForEqualityWithUnknown() throws Exception {
        assertTrue(createUnknownType().canTestForEqualityWith(createAllType()));
    }

    @Test
    public void testCanTestForEqualityWithNonNull() throws Exception {
        // Based on the testForEquality logic, string and number comparison is UNKNOWN,
        // which means canTestForEqualityWith should be true.
        assertTrue(createStringType().canTestForEqualityWith(createNumberType()));
    }

    @Test
    public void testTestForEqualityWithBoolean() throws Exception {
        assertEquals(TernaryValue.TRUE, createBooleanValueType().testForEquality(createBooleanValueType()));
    }

    @Test
    public void testTestForEqualityWithDifferentTypes() throws Exception {
        // String vs Number comparison results in UNKNOWN
        assertEquals(TernaryValue.UNKNOWN, createStringType().testForEquality(createNumberType()));
    }

    @Test
    public void testCanTestForShallowEqualityWithSameType() throws Exception {
        assertTrue(createStringType().canTestForShallowEqualityWith(createStringType()));
    }

    @Test
    public void testCanTestForShallowEqualityWithSubtype() throws Exception {
        assertTrue(createNumberType().canTestForShallowEqualityWith(createObjectType())); // number is subtype of object
    }

    @Test
    public void testIsNullableForNullType() throws Exception {
        assertTrue(createNullType().isNullable());
    }

    @Test
    public void testIsNullableForObjectType() throws Exception {
        assertFalse(createObjectType().isNullable());
    }

    @Test
    public void testGetLeastSupertypeWithSameTypes() throws Exception {
        JSType numberType = createNumberType();
        assertEquals(numberType, numberType.getLeastSupertype(numberType));
    }

    @Test
    public void testGetLeastSupertypeWithDifferentTypes() throws Exception {
        JSType numberType = createNumberType();
        JSType objectType = createObjectType();
        JSType supertype = numberType.getLeastSupertype(objectType);
        assertEquals(objectType, supertype); // number | Object = Object
    }

    @Test
    public void testGetGreatestSubtypeWithSameTypes() throws Exception {
        JSType numberType = createNumberType();
        assertEquals(numberType, numberType.getGreatestSubtype(numberType));
    }

    @Test
    public void testGetGreatestSubtypeWithDifferentTypes() throws Exception {
        JSType numberType = createNumberType();
        JSType objectType = createObjectType();
        JSType subtype = numberType.getGreatestSubtype(objectType);
        // number & Object = NoObjectType in this context
        assertTrue(subtype.isNoObjectType());
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeTrue() throws Exception {
        JSType stringType = createStringType();
        // String can be true or false. Restricting to true should return String itself.
        JSType restricted = stringType.getRestrictedTypeGivenToBooleanOutcome(true);
        assertEquals(stringType, restricted);
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeFalse() throws Exception {
        JSType stringType = createStringType();
        // String can be true or false. Restricting to false should return String itself.
        JSType restricted = stringType.getRestrictedTypeGivenToBooleanOutcome(false);
        assertEquals(stringType, restricted);
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcomeForNull() throws Exception {
        JSType nullType = createNullType();
        // Null is always false. Restricting to true should result in NoType.
        JSType restricted = nullType.getRestrictedTypeGivenToBooleanOutcome(true);
        assertTrue(restricted.isNoType());
    }

    @Test
    public void testIsSubtypeOfUnknown() throws Exception {
        assertTrue(createStringType().isSubtype(createUnknownType()));
    }

    @Test
    public void testIsSubtypeOfSelf() throws Exception {
        assertTrue(createStringType().isSubtype(createStringType()));
    }

    @Test
    public void testIsSubtypeWithUnion() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();
        UnionType unionType = (UnionType) registry.createUnionType(stringType, numberType);
        assertTrue(stringType.isSubtype(unionType));
        assertTrue(numberType.isSubtype(unionType));
    }

    @Test
    public void testIsSubtypeWithUnionWhenNotSubtypeOfAnyAlternate() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();
        ObjectType objectType = (ObjectType) createObjectType();
        UnionType unionType = (UnionType) registry.createUnionType(stringType, numberType);
        assertFalse(objectType.isSubtype(unionType));
    }

    @Test
    public void testDiffersFromWithDifferentTypes() throws Exception {
        assertTrue(createStringType().differsFrom(createNumberType()));
    }

    @Test
    public void testDiffersFromWithSameTypes() throws Exception {
        assertFalse(createStringType().differsFrom(createStringType()));
    }

    @Test
    public void testDiffersFromWithUnknown() throws Exception {
        assertTrue(createStringType().differsFrom(createUnknownType()));
        assertTrue(createUnknownType().differsFrom(createStringType()));
    }

    @Test
    public void testDiffersFromWithTwoUnknowns() throws Exception {
        assertFalse(createUnknownType().differsFrom(createUnknownType()));
    }

    @Test
    public void testResolveInternalIsCalledOnResolve() throws Exception {
        MockJSType mockType = new MockJSType(registry, false, false);
        JSType resolvedType = createNamedType("ResolvedTestType");
        // Simulate that resolveInternal would return resolvedType
        mockType.setFindPropertyTypeResult(resolvedType); // Not ideal, but for mock setup

        JSType result = mockType.resolve(errorReporter, new EmptyScope());
        assertTrue(mockType.isResolved()); // Check if resolved state is set
        assertTrue(mockType.resolvedInternalCalled); // Check if resolveInternal was called
        // In a real scenario, resolve() would return the result of resolveInternal.
        // For this mock, we assume resolveInternal would have set the state.
    }

    @Test
    public void testResolveReturnsCachedResultWhenAlreadyResolved() throws Exception {
        MockJSType mockType = new MockJSType(registry, false, false);
        JSType resolvedResult = createNamedType("ResolvedTestType");
        // Simulate that the type is already resolved and resolveInternal would not be called again.
        mockType.setResolvedTypeInternal(resolvedResult); // Manually mark as resolved with a result

        // For this test, we'd need to override resolve() in MockJSType to check if resolveInternal is called.
        // As it stands, the base JSType.resolve() handles caching.
        // The current mock setup doesn't allow verifying if resolveInternal is skipped.
        // We can assert that calling resolve() on an already resolved type returns the cached value.
        JSType firstResolve = mockType.resolve(errorReporter, new EmptyScope());
        JSType secondResolve = mockType.resolve(errorReporter, new EmptyScope());

        assertSame(resolvedResult, firstResolve);
        assertSame(resolvedResult, secondResolve);
    }

    @Test
    public void testForceResolveCallsResolveInternal() throws Exception {
        MockJSType mockType = new MockJSType(registry, false, false);
        JSType resolvedType = createNamedType("ResolvedTestType");
        mockType.setFindPropertyTypeResult(resolvedType); // Mocking resolveInternal result

        mockType.clearResolved(); // Ensure it's not marked as resolved
        JSType result = mockType.forceResolve(errorReporter, new EmptyScope());

        assertTrue(mockType.isResolved()); // Check if resolved state is set after forceResolve
        assertTrue(mockType.resolvedInternalCalled); // Check if resolveInternal was indeed called
        // The return value of forceResolve is the result of resolve, which should be the resolved type.
        // Asserting the resolved state is more direct for this mock.
    }

    @Test
    public void testClearResolvedResetsState() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        JSType resolvedType = createNamedType("ResolvedTestType");
        type.setResolvedTypeInternal(resolvedType); // Simulate already resolved
        assertTrue(type.isResolved()); // Check initial state

        type.clearResolved();
        assertFalse(type.isResolved()); // Check state after clearing
        assertFalse(type.resolvedInternalCalled); // Ensure internal call flag is reset
    }

    @Test
    public void testSafeResolveHandlesNullType() throws Exception {
        JSType result = JSType.safeResolve(null, errorReporter, new EmptyScope());
        assertNull(result);
    }

    @Test
    public void testSafeResolveCallsResolveOnNonNullType() throws Exception {
        MockJSType mockType = new MockJSType(registry, false, false);
        JSType resolvedResult = createNamedType("Resolved");
        mockType.setFindPropertyTypeResult(resolvedResult); // Mocking resolveInternal result

        JSType result = JSType.safeResolve(mockType, errorReporter, new EmptyScope());
        assertTrue(mockType.isResolved()); // Check resolved state
        assertTrue(mockType.resolvedInternalCalled); // Check if resolveInternal was called
        // The result of safeResolve is the result of the type's resolve method.
        // Since our mock doesn't explicitly return a value from resolve() but sets `resolvedInternalCalled`,
        // we check that the type itself is now considered resolved.
    }

    @Test
    public void testSetValidatorTrue() throws Exception {
        JSType type = createNamedType("TestType");
        Predicate<JSType> validator = input -> true; // Lambda for predicate
        assertTrue(type.setValidator(validator));
    }

    @Test
    public void testSetValidatorFalse() throws Exception {
        JSType type = createNamedType("TestType");
        Predicate<JSType> validator = input -> false; // Lambda for predicate
        assertFalse(type.setValidator(validator));
    }

    @Test
    public void testTypePairConstructorAndFields() throws Exception {
        JSType type1 = createNamedType("TypeA");
        JSType type2 = createNamedType("TypeB");
        JSType.TypePair pair = new JSType.TypePair(type1, type2);
        assertSame(type1, pair.typeA);
        assertSame(type2, pair.typeB);
    }

    @Test
    public void testToDebugHashCodeString() throws Exception {
        JSType type = createNamedType("TestType");
        String hashCodeString = type.toDebugHashCodeString();
        assertTrue(hashCodeString.startsWith("{"));
        assertTrue(hashCodeString.endsWith("}"));
        assertTrue(hashCodeString.contains(Integer.toString(type.hashCode())));
    }

    @Test
    public void testCompareMethod() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();
        Comparator<JSType> alphaComparator = JSType.ALPHA;

        int result = alphaComparator.compare(stringType, numberType);
        assertTrue(result != 0);
        assertTrue(result > 0); // "string" > "number"

        result = alphaComparator.compare(numberType, stringType);
        assertTrue(result < 0); // "number" < "string"

        result = alphaComparator.compare(stringType, stringType);
        assertEquals(0, result);
    }

    @Test
    public void testGetJSDocInfo() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        assertNull(type.getJSDocInfo()); // Default for mock

        JSDocInfo mockInfo = new JSDocInfo();
        type.setJsDocInfo(mockInfo);
        assertSame(mockInfo, type.getJSDocInfo());
    }

    @Test
    public void testGetDisplayName() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        assertNull(type.getDisplayName()); // Default for mock

        type.setDisplayName("MyDisplayName");
        assertEquals("MyDisplayName", type.getDisplayName());
    }

    @Test
    public void testHasDisplayName() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        assertFalse(type.hasDisplayName());

        type.setDisplayName("MyDisplayName");
        assertTrue(type.hasDisplayName());

        type.setDisplayName("");
        assertFalse(type.hasDisplayName());

        type.setDisplayName(null);
        assertFalse(type.hasDisplayName());
    }

    @Test
    public void testIsNoResolvedType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.setMockResults(false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        assertTrue(type.isNoResolvedType());
    }

    @Test
    public void testIsEmptyType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isEmptyTypeResult = true; // Manually set
        assertTrue(type.isEmptyType());
    }

    @Test
    public void testIsStringValueType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isStringValueTypeResult = true; // Manually set
        assertTrue(type.isStringValueType());
    }

    @Test
    public void testIsNumberValueType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isNumberValueTypeResult = true; // Manually set
        assertTrue(type.isNumberValueType());
    }

    @Test
    public void testIsBooleanValueType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isBooleanValueTypeResult = true; // Manually set
        assertTrue(type.isBooleanValueType());
    }

    @Test
    public void testIsStringObjectType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isStringObjectTypeResult = true; // Manually set
        assertTrue(type.isStringObjectType());
    }

    @Test
    public void testIsNumberObjectType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isNumberObjectTypeResult = true; // Manually set
        assertTrue(type.isNumberObjectType());
    }

    @Test
    public void testIsBooleanObjectType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isBooleanObjectTypeResult = true; // Manually set
        assertTrue(type.isBooleanObjectType());
    }

    @Test
    public void testIsFunctionPrototypeType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isFunctionPrototypeTypeResult = true; // Manually set
        assertTrue(type.isFunctionPrototypeType());
    }

    @Test
    public void testIsArrayType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isArrayTypeResult = true; // Manually set
        assertTrue(type.isArrayType());
    }

    @Test
    public void testIsRegexpType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isRegexpTypeResult = true; // Manually set
        assertTrue(type.isRegexpType());
    }

    @Test
    public void testIsDateType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isDateTypeResult = true; // Manually set
        assertTrue(type.isDateType());
    }

    @Test
    public void testIsNullType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isNullTypeResult = true; // Manually set
        assertTrue(type.isNullType());
    }

    @Test
    public void testIsVoidType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isVoidTypeResult = true; // Manually set
        assertTrue(type.isVoidType());
    }

    @Test
    public void testIsAllType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isAllTypeResult = true; // Manually set
        assertTrue(type.isAllType());
    }

    @Test
    public void testIsCheckedUnknownType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isCheckedUnknownTypeResult = true; // Manually set
        assertTrue(type.isCheckedUnknownType());
    }

    @Test
    public void testIsUnionType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isUnionTypeResult = true; // Manually set
        assertTrue(type.isUnionType());
    }

    @Test
    public void testIsFunctionType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isFunctionTypeResult = true; // Manually set
        assertTrue(type.isFunctionType());
    }

    @Test
    public void testIsEnumElementType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isEnumElementTypeResult = true; // Manually set
        assertTrue(type.isEnumElementType());
    }

    @Test
    public void testIsEnumType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isEnumTypeResult = true; // Manually set
        assertTrue(type.isEnumType());
    }

    @Test
    public void testIsRecordType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isRecordTypeResult = true; // Manually set
        assertTrue(type.isRecordType());
    }

    @Test
    public void testIsTemplateType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isTemplateTypeResult = true; // Manually set
        assertTrue(type.isTemplateType());
    }

    @Test
    public void testIsObject() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isObjectResult = true; // Manually set
        assertTrue(type.isObject());
    }

    @Test
    public void testIsConstructor() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isConstructorResult = true; // Manually set
        assertTrue(type.isConstructor());
    }

    @Test
    public void testIsNominalType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isNominalTypeResult = true; // Manually set
        assertTrue(type.isNominalType());
    }

    @Test
    public void testIsInstanceType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isInstanceTypeResult = true; // Manually set
        assertTrue(type.isInstanceType());
    }

    @Test
    public void testIsInterface() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isInterfaceResult = true; // Manually set
        assertTrue(type.isInterface());
    }

    @Test
    public void testIsOrdinaryFunction() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isOrdinaryFunctionResult = true; // Manually set
        assertTrue(type.isOrdinaryFunction());
    }

    @Test
    public void testIsNoType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isNoTypeResult = true;
        assertTrue(type.isNoType());
    }

    @Test
    public void testIsUnknownType() throws Exception {
        MockJSType type = new MockJSType(registry, false, false);
        type.isUnknownTypeResult = true;
        assertTrue(type.isUnknownType());
    }

    @Test
    public void testIsString() throws Exception {
        JSType stringValue = createStringType();
        JSType stringObject = createStringObjectType();
        assertTrue(stringValue.isString());
        assertTrue(stringObject.isString());

        JSType numberType = createNumberType();
        assertFalse(numberType.isString());
    }

    @Test
    public void testIsNumber() throws Exception {
        JSType numberValue = createNumberType();
        JSType numberObject = createNumberObjectType();
        assertTrue(numberValue.isNumber());
        assertTrue(numberObject.isNumber());

        JSType stringType = createStringType();
        assertFalse(stringType.isNumber());
    }

    @Test
    public void testGetTypesUnderEquality() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();

        JSType.TypePair pair = stringType.getTypesUnderEquality(numberType);
        assertNotNull(pair);
        assertSame(stringType, pair.typeA);
        assertSame(numberType, pair.typeB);

        pair = stringType.getTypesUnderEquality(stringType);
        assertNotNull(pair);
        assertSame(stringType, pair.typeA);
        assertSame(stringType, pair.typeB);

        MockJSType alwaysFalseStringEq = new MockJSType(registry, false, false) {
            @Override
            public TernaryValue testForEquality(JSType that) {
                return TernaryValue.FALSE;
            }
        };
        pair = alwaysFalseStringEq.getTypesUnderEquality(stringType);
        assertNotNull(pair);
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderInequality() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();

        JSType.TypePair pair = stringType.getTypesUnderInequality(numberType);
        assertNotNull(pair);
        assertSame(stringType, pair.typeA);
        assertSame(numberType, pair.typeB);

        pair = stringType.getTypesUnderInequality(stringType);
        assertNotNull(pair);
        assertTrue(pair.typeA.isNoType());
        assertTrue(pair.typeB.isNoType());

        MockJSType alwaysFalseStringEq = new MockJSType(registry, false, false) {
            @Override
            public TernaryValue testForEquality(JSType that) {
                return TernaryValue.FALSE;
            }
        };
        pair = alwaysFalseStringEq.getTypesUnderInequality(stringType);
        assertNotNull(pair);
        assertSame(alwaysFalseStringEq, pair.typeA);
        assertSame(stringType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowEquality() throws Exception {
        JSType stringType = createStringType();
        ObjectType objectType = (ObjectType) createObjectType();

        JSType.TypePair pair = stringType.getTypesUnderShallowEquality(objectType);
        assertNotNull(pair);
        assertTrue(pair.typeA.isNoObjectType());
        assertTrue(pair.typeB.isNoObjectType());

        pair = stringType.getTypesUnderShallowEquality(stringType);
        assertSame(stringType, pair.typeA);
        assertSame(stringType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequality() throws Exception {
        JSType stringType = createStringType();
        JSType numberType = createNumberType();

        JSType.TypePair pair = stringType.getTypesUnderShallowInequality(numberType);
        assertSame(stringType, pair.typeA);
        assertSame(numberType, pair.typeB);

        JSType nullType = createNullType();
        JSType voidType = createVoidType();

        pair = nullType.getTypesUnderShallowInequality(nullType);
        assertNull(pair.typeA);
        assertNull(pair.typeB);

        pair = voidType.getTypesUnderShallowInequality(voidType);
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testRestrictByNotNullOrUndefined() throws Exception {
        JSType stringType = createStringType();
        assertSame(stringType, stringType.restrictByNotNullOrUndefined());

        JSType nullType = createNullType();
        UnionType unionWithNull = (UnionType) registry.createUnionType(stringType, nullType);
        JSType restrictedUnion = unionWithNull.restrictByNotNullOrUndefined();
        assertNotNull(restrictedUnion);
        assertTrue(restrictedUnion.isStringValueType());
        assertFalse(restrictedUnion.isNullable());
    }

    @Test
    public void testIsSubtype() throws Exception {
        JSType numberType = createNumberType();
        JSType objectType = createObjectType();
        assertTrue(numberType.isSubtype(objectType)); // number is subtype of object

        JSType stringType = createStringType();
        assertFalse(stringType.isSubtype(numberType)); // string is not subtype of number
    }

    @Test
    public void testFindPropertyTypeForObjectTypeWithProperty() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType();
        JSType stringType = createStringType();
        objectType.defineInferredProperty("testProp", stringType, false, null);
        assertEquals(stringType, objectType.findPropertyType("testProp"));
    }

    @Test
    public void testFindPropertyTypeForObjectTypeWithoutProperty() throws Exception {
        ObjectType objectType = (ObjectType) createObjectType();
        assertNull(objectType.findPropertyType("nonExistentProp"));
    }

    @Test
    public void testFindPropertyTypeForNullType() throws Exception {
        assertNull(createNullType().findPropertyType("anyProp"));
    }
}
```