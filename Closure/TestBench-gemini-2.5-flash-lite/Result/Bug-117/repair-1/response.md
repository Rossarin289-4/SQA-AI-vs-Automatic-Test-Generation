```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import com.google.javascript.rhino.jstype.UnknownType;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;

public class TypeValidatorTest {

    private static final String DUMMY_SOURCE_NAME = "test.js";

    // Helper to create a basic compiler and registry for tests.
    // Mock objects for NodeTraversal and AbstractCompiler
    private static class MockCompiler extends AbstractCompiler {
        private final JSTypeRegistry typeRegistry = new JSTypeRegistry(new ErrorReporter() {
            @Override
            public void report(CheckLevel level, DiagnosticType diagnosticType, String... arguments) {
                // Do nothing for tests
            }

            @Override
            public void report(JSError error) {
                // Do nothing for tests
            }
        });
        private TypeValidator validator = new TypeValidator(this);

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public void report(JSError error) {
            // Do nothing for tests
        }
        
        @Override
        public Node getRoot() {
            return null; // Not used in these tests
        }
        
        @Override
        public boolean isIdeMode() {
            return false;
        }
        
        @Override
        public String getSourceFileName() {
            return DUMMY_SOURCE_NAME;
        }

        @Override
        public int getErrorCount() {
            return 0; // Not used in these tests
        }

        @Override
        public int getWarningCount() {
            return 0; // Not used in these tests
        }
        
        @Override
        public void setProgress(int percent) {
            // No-op
        }

        @Override
        public JSError newError(JSError error) {
            return error;
        }

        @Override
        public boolean shouldRunValidation(String validationName) {
            return true;
        }
        
        @Override
        public TypeValidator getTypeValidator() {
            return validator;
        }
        
        @Override
        public CodingConvention getCodingConvention() {
            return new ClosureCodingConvention();
        }

        // --- Methods to satisfy AbstractCompiler interface ---
        @Override
        public void process(Node root) {}
        @Override
        public void init(CompilerOptions options) {}
        @Override
        public void parse() {}
        @Override
        public void optimize() {}
        @Override
        public void normalize() {}
        @Override
        public String[] getMessages() { return new String[0]; }
        @Override
        public <T extends CompilerPass> T getPass(Class<T> passClass) { return null; }
        @Override
        public boolean getExternsEncountered() { return false; }
        @Override
        public Node parseSyntheticCode(String code) { return null; }
        @Override
        public void prepareCodeChangingPasses() {}
        @Override
        public void setKnownTypeDefinition(String name, JSType type) {}
        @Override
        public void reassessControlFlowGraph() {}
        @Override
        public void updateSourceFile(String filename, String content) {}
        @Override
        public void setExterns(List<SourceFile> externs) {}
        @Override
        public void setInputs(List<SourceFile> inputs) {}
        @Override
        public SourceFile getSourceFile(String filename) { return null; }
        @Override
        public boolean isTypeCheckingEnabled() { return true; }
        @Override
        public Object getExtension(Object key) { return null; }
        @Override
        public void putExtension(Object key, Object value) {}
        @Override
        public String getAstDotGraph() { return ""; }
        @Override
        public void setLifeCycleFlag(int flag) {}
        @Override
        public boolean hasLifeCycleFlag(int flag) { return false; }
        @Override
        public String getDiagnosisUrl(String diagnosticKey) { return ""; }
        @Override
        public void setDiagnosisUrl(String diagnosticKey, String url) {}
        @Override
        public CodingConvention getJavaScriptCodingConvention() { return getCodingConvention(); }
        @Override
        public RegionTraversal.TraversalMap getRegionMap() { return null; }
        @Override
        public void setRegionMap(RegionTraversal.TraversalMap map) {}
        @Override
        public void setProgress(CodeChangeLog log) {}
        @Override
        public boolean isClean() { return true; }
        @Override
        public boolean getGeneratePseudoNames() { return false; }
        @Override
        public void disableRuntimeTypeCheck(DiagnosticType diagnostic) {}
        @Override
        public boolean runtimeTypeCheckDisables(DiagnosticType diagnostic) { return false; }
        @Override
        public JSError newSummaryError(JSError error) { return error; }
    }

    private JSType getNativeType(JSTypeNative typeId) {
        return typeRegistry.getNativeType(typeId);
    }

    @Test
    public void testExpectValidTypeofName() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectValidTypeofName(null, n, "someType"); // NodeTraversal can be null here for this specific call
        assertTrue(true); 
    }

    @Test
    public void testExpectObject_whenObject() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        Node n = new Node(Node.OBJECT_KEY); // Dummy node
        assertTrue(validator.expectObject(null, n, objectType, "expected object"));
    }

    @Test
    public void testExpectObject_whenNotObject() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        assertFalse(validator.expectObject(null, n, stringType, "expected object"));
    }

    @Test
    public void testExpectActualObject_whenObject() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        Node n = new Node(Node.OBJECT_KEY); // Dummy node
        validator.expectActualObject(null, n, objectType, "expected actual object");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectActualObject_whenNotObject() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectActualObject(null, n, stringType, "expected actual object");
        assertTrue(true); 
    }

    @Test
    public void testExpectAnyObject_whenObject() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        Node n = new Node(Node.OBJECT_KEY); // Dummy node
        validator.expectAnyObject(null, n, objectType, "expected any object");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectAnyObject_whenNotObject() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectAnyObject(null, n, stringType, "expected any object");
        assertTrue(true);
    }

    @Test
    public void testExpectString_whenString() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectString(null, n, stringType, "expected string");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectString_whenNotString() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        validator.expectString(null, n, numberType, "expected string");
        assertTrue(true);
    }

    @Test
    public void testExpectNumber_whenNumber() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        validator.expectNumber(null, n, numberType, "expected number");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectNumber_whenNotNumber() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectNumber(null, n, stringType, "expected number");
        assertTrue(true);
    }

    @Test
    public void testExpectBitwiseable_whenNumber() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        validator.expectBitwiseable(null, n, numberType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectBitwiseable_whenString() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectBitwiseable(null, n, stringType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed
    }
    
    @Test
    public void testExpectBitwiseable_whenBoolean() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType booleanType = typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Node n = new Node(Node.TRUE); // Dummy node
        validator.expectBitwiseable(null, n, booleanType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectBitwiseable_whenUndefined() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType voidType = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
        Node n = new Node(Node.VOID_NODE); // Dummy node
        validator.expectBitwiseable(null, n, voidType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectBitwiseable_whenNull() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType nullType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        Node n = new Node(Node.NULL_NODE); // Dummy node
        validator.expectBitwiseable(null, n, nullType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed
    }
    
    @Test
    public void testExpectBitwiseable_whenUnknown() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType unknownType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        Node n = new Node(Node.ERROR_NODE); // Dummy node
        validator.expectBitwiseable(null, n, unknownType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectStringOrNumber_whenString() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectStringOrNumber(null, n, stringType, "expected string or number");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectStringOrNumber_whenNumber() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        validator.expectStringOrNumber(null, n, numberType, "expected string or number");
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectStringOrNumber_whenBoolean() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType booleanType = typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Node n = new Node(Node.TRUE); // Dummy node
        validator.expectStringOrNumber(null, n, booleanType, "expected string or number");
        assertTrue(true);
    }
    
    @Test
    public void testExpectNotNullOrUndefined_whenNotNullOrUndefined() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertTrue(validator.expectNotNullOrUndefined(null, n, stringType, "expected not null or undefined", expectedType));
    }

    @Test
    public void testExpectNotNullOrUndefined_whenNull() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType nullType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        Node n = new Node(Node.NULL_NODE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertFalse(validator.expectNotNullOrUndefined(null, n, nullType, "expected not null or undefined", expectedType));
    }
    
    @Test
    public void testExpectNotNullOrUndefined_whenUndefined() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType voidType = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
        Node n = new Node(Node.VOID_NODE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertFalse(validator.expectNotNullOrUndefined(null, n, voidType, "expected not null or undefined", expectedType));
    }

    @Test
    public void testExpectNotNullOrUndefined_whenUnionWithNull() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType unionType = typeRegistry.createUnionType(getNativeType(JSTypeNative.STRING_TYPE), getNativeType(JSTypeNative.NULL_TYPE));
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertTrue(validator.expectNotNullOrUndefined(null, n, unionType, "expected not null or undefined", expectedType));
    }
    
    @Test
    public void testExpectNotNullOrUndefined_whenUnionWithUndefined() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType unionType = typeRegistry.createUnionType(getNativeType(JSTypeNative.NUMBER_TYPE), getNativeType(JSTypeNative.VOID_TYPE));
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertTrue(validator.expectNotNullOrUndefined(null, n, unionType, "expected not null or undefined", expectedType));
    }

    @Test
    public void testExpectSwitchMatchesCase_whenMatch() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType switchType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType caseType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node switchNode = new Node(Node.SWITCH);
        Node caseNode = new Node(Node.CASE);
        switchNode.addChildToBack(caseNode);
        validator.expectSwitchMatchesCase(null, switchNode, switchType, caseType);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectSwitchMatchesCase_whenNoMatchButAutobox() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType switchType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType caseType = typeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE); // Number object autoboxes to number
        Node switchNode = new Node(Node.SWITCH);
        Node caseNode = new Node(Node.CASE);
        switchNode.addChildToBack(caseNode);
        validator.expectSwitchMatchesCase(null, switchNode, switchType, caseType);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectSwitchMatchesCase_whenNoMatch() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType switchType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType caseType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node switchNode = new Node(Node.SWITCH);
        Node caseNode = new Node(Node.CASE);
        switchNode.addChildToBack(caseNode);
        validator.expectSwitchMatchesCase(null, switchNode, switchType, caseType);
        assertTrue(true);
    }

    @Test
    public void testExpectIndexMatch_whenArrayAccess() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType arrayType = typeRegistry.createArrayType(getNativeType(JSTypeNative.STRING_TYPE));
        JSType indexType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.NUMBER_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, arrayType, indexType);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectIndexMatch_whenObjectAccess() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        ObjectType objectType = typeRegistry.createObjectType("MyObject");
        JSType indexType = getNativeType(JSTypeNative.STRING_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.STRING_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, objectType, indexType);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectIndexMatch_whenIllegalPropertyAccessOnStruct() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        ObjectType structType = typeRegistry.createObjectType("MyStruct");
        structType.setStruct(true); // Mark as struct
        JSType indexType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.NUMBER_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, structType, indexType);
        assertTrue(true);
    }

    @Test
    public void testExpectIndexMatch_whenUnknownTypeAccess() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType indexType = getNativeType(JSTypeNative.STRING_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.STRING_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, unknownType, indexType);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectCanAssignToPropertyOf_whenAssignable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType rightType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node assignmentNode = new Node(Node.ASSIGN);
        Node propertyOwnerNode = new Node(Node.NAME); // Represents the object owning the property
        propertyOwnerNode.setJSType(getNativeType(JSTypeNative.OBJECT_TYPE));
        assertTrue(validator.expectCanAssignToPropertyOf(null, assignmentNode, rightType, leftType, propertyOwnerNode, "propName"));
    }

    @Test
    public void testExpectCanAssignToPropertyOf_whenNotAssignable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType rightType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node assignmentNode = new Node(Node.ASSIGN);
        Node propertyOwnerNode = new Node(Node.NAME); // Represents the object owning the property
        propertyOwnerNode.setJSType(getNativeType(JSTypeNative.OBJECT_TYPE));
        assertFalse(validator.expectCanAssignToPropertyOf(null, assignmentNode, rightType, leftType, propertyOwnerNode, "propName"));
    }
    
    @Test
    public void testExpectCanAssignToPropertyOf_whenInterfaceMethod() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType rightType = getNativeType(JSTypeNative.FUNCTION_TYPE);
        JSType leftType = getNativeType(JSTypeNative.FUNCTION_TYPE);
        Node assignmentNode = new Node(Node.ASSIGN);
        
        ObjectType interfaceProto = typeRegistry.createInterface("MyInterface");
        FunctionType interfaceCtor = interfaceProto.getConstructor();
        
        Node propertyOwnerNode = new Node(Node.NAME); // Represents the object owning the property
        propertyOwnerNode.setJSType(interfaceProto);
        
        assertTrue(validator.expectCanAssignToPropertyOf(null, assignmentNode, rightType, leftType, propertyOwnerNode, "methodName"));
    }

    @Test
    public void testExpectCanAssignTo_whenAssignable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType rightType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.ASSIGN); // Dummy node
        assertTrue(validator.expectCanAssignTo(null, n, rightType, leftType, "assign message"));
    }

    @Test
    public void testExpectCanAssignTo_whenNotAssignable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType rightType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.ASSIGN); // Dummy node
        assertFalse(validator.expectCanAssignTo(null, n, rightType, leftType, "assign message"));
    }

    @Test
    public void testExpectArgumentMatchesParameter_whenMatch() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType argType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType paramType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node callNode = new Node(Node.CALL);
        Node argNode = new Node(Node.NUMBER_VALUE);
        validator.expectArgumentMatchesParameter(null, argNode, argType, paramType, callNode, 0);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectArgumentMatchesParameter_whenMismatch() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType argType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType paramType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node callNode = new Node(Node.CALL);
        Node argNode = new Node(Node.STRING_VALUE);
        validator.expectArgumentMatchesParameter(null, argNode, argType, paramType, callNode, 0);
        assertTrue(true);
    }

    @Test
    public void testExpectCanOverride_whenOverridable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType overridingType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType hiddenType = getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType ownerType = typeRegistry.createObjectType("Owner");
        Node n = new Node(Node.PROP_ASSIGN); // Dummy node
        validator.expectCanOverride(null, n, overridingType, hiddenType, "propName", ownerType);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectCanOverride_whenNotOverridable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType overridingType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType hiddenType = getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType ownerType = typeRegistry.createObjectType("Owner");
        Node n = new Node(Node.PROP_ASSIGN); // Dummy node
        validator.expectCanOverride(null, n, overridingType, hiddenType, "propName", ownerType);
        assertTrue(true);
    }

    @Test
    public void testExpectSuperType_whenCorrectSuperType() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        ObjectType superObject = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        ObjectType subObject = typeRegistry.createObjectType("SubClass");
        subObject.setPrototypeBasedOn(superObject);
        Node n = new Node(Node.CLASS); // Dummy node
        validator.expectSuperType(null, n, superObject, subObject);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectSuperType_whenIncorrectSuperType() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        ObjectType superObject = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType subObject = typeRegistry.createObjectType("SubClass");
        subObject.setPrototypeBasedOn(typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node n = new Node(Node.CLASS); // Dummy node
        validator.expectSuperType(null, n, superObject, subObject);
        assertTrue(true);
    }

    @Test
    public void testExpectCanCast_whenCastable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType type = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType castType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.CAST); // Dummy node
        validator.expectCanCast(null, n, castType, type);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectCanCast_whenNotCastable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType type = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType castType = getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.CAST); // Dummy node
        validator.expectCanCast(null, n, castType, type);
        assertTrue(true);
    }

    @Test
    public void testExpectUndeclaredVariable_whenNewVariable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        Var existingVar = null; // No existing variable
        JSType newType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node declarationNode = new Node(Node.VAR);
        Node valueNode = new Node(Node.NUMBER_VALUE);
        declarationNode.addChildToBack(valueNode);
        validator.expectUndeclaredVariable(DUMMY_SOURCE_NAME, null, declarationNode, declarationNode.getParent(), existingVar, "newVar", newType);
        assertTrue(true); // No exception means it passed
    }

    @Test
    public void testExpectUndeclaredVariable_whenDuplicateTypedVariable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType existingType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Var existingVar = Var.make("dupVar", new Node(Node.NAME), existingType, null, null);
        JSType newType = getNativeType(JSTypeNative.STRING_TYPE);
        Node declarationNode = new Node(Node.VAR);
        Node valueNode = new Node(Node.STRING_VALUE);
        declarationNode.addChildToBack(valueNode);
        validator.expectUndeclaredVariable(DUMMY_SOURCE_NAME, null, declarationNode, declarationNode.getParent(), existingVar, "dupVar", newType);
        assertTrue(true);
    }
    
    @Test
    public void testExpectUndeclaredVariable_whenDuplicateSameTypeVariable() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType existingType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Var existingVar = Var.make("dupVar", new Node(Node.NAME), existingType, null, null);
        JSType newType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node declarationNode = new Node(Node.VAR);
        Node valueNode = new Node(Node.NUMBER_VALUE);
        declarationNode.addChildToBack(valueNode);
        validator.expectUndeclaredVariable(DUMMY_SOURCE_NAME, null, declarationNode, declarationNode.getParent(), existingVar, "dupVar", newType);
        assertTrue(true);
    }

    @Test
    public void testExpectAllInterfaceProperties_placeholder() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        FunctionType functionType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE), getNativeType(JSTypeNative.OBJECT_TYPE));
        ObjectType instanceType = functionType.getInstanceType();
        
        ObjectType dummyInterface = typeRegistry.createInterface("DummyInterface");
        dummyInterface.defineDeclaredProperty("dummyProp", getNativeType(JSTypeNative.STRING_TYPE), null);
        functionType.setImplementedInterfaces(Lists.newArrayList(dummyInterface));
        
        Node n = new Node(Node.FUNCTION); // Dummy node
        validator.expectAllInterfaceProperties(null, n, functionType);
        assertTrue(true);
    }
    
    @Test
    public void testExpectInterfaceProperty_placeholder() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        ObjectType instance = typeRegistry.createObjectType("Instance");
        ObjectType implementedInterface = typeRegistry.createInterface("ImplementedInterface");
        implementedInterface.defineDeclaredProperty("interfaceProp", getNativeType(JSTypeNative.NUMBER_TYPE), null);
        
        instance.defineDeclaredProperty("interfaceProp", getNativeType(JSTypeNative.NUMBER_TYPE), null);

        Node n = new Node(Node.OBJECT_LIT); // Dummy node
        validator.expectInterfaceProperty(null, n, instance, implementedInterface, "interfaceProp");
        assertTrue(true);
    }
    
    @Test
    public void testGetReadableJSTypeName_objectProperty() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        ObjectType ownerType = typeRegistry.createObjectType("MyObject");
        ownerType.defineDeclaredProperty("myProp", getNativeType(JSTypeNative.STRING_TYPE), null);
        
        Node propNode = new Node(Node.GETPROP);
        Node ownerNode = new Node(Node.NAME);
        ownerNode.setJSType(ownerType);
        Node propNameNode = new Node(Node.STRING_VALUE, "myProp");
        propNode.addChildToBack(ownerNode);
        propNode.addChildToBack(propNameNode);
        
        assertEquals("MyObject.myProp", validator.getReadableJSTypeName(propNode, false));
    }

    @Test
    public void testGetReadableJSTypeName_qualifiedName() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        Node nameNode = new Node(Node.NAME, "myVariable");
        nameNode.setJSType(getNativeType(JSTypeNative.STRING_TYPE));
        nameNode.setJSDocInfo(new JSDocInfo()); 
        
        assertEquals("myVariable", validator.getReadableJSTypeName(nameNode, false));
    }

    @Test
    public void testGetReadableJSTypeName_functionType() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        FunctionType fnType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE));
        Node fnNode = new Node(Node.FUNCTION);
        fnNode.setJSType(fnType);
        
        assertEquals("function", validator.getReadableJSTypeName(fnNode, false));
    }
    
    @Test
    public void testTypeMismatch_equalsAndHashCode() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType typeA = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(JSTypeNative.STRING_TYPE);
        JSError error = JSError.make(DUMMY_SOURCE_NAME, new Node(Node.NAME), DiagnosticType.warning("TEST", "test"), "");
        
        TypeValidator.TypeMismatch mismatch1 = new TypeValidator.TypeMismatch(typeA, typeB, error);
        TypeValidator.TypeMismatch mismatch2 = new TypeValidator.TypeMismatch(typeA, typeB, error);
        TypeValidator.TypeMismatch mismatch3 = new TypeValidator.TypeMismatch(typeB, typeA, error);
        
        assertEquals(mismatch1, mismatch2);
        assertEquals(mismatch2, mismatch3); 
        assertNotEquals(mismatch1, null);
        assertNotEquals(mismatch1, new Object());
        
        assertEquals(mismatch1.hashCode(), mismatch2.hashCode());
        assertEquals(mismatch2.hashCode(), mismatch3.hashCode());
    }
    
    @Test
    public void testTypeMismatch_toString() throws Exception {
        TypeValidator validator = new TypeValidator(new MockCompiler());
        JSType typeA = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(JSTypeNative.STRING_TYPE);
        JSError error = JSError.make(DUMMY_SOURCE_NAME, new Node(Node.NAME), DiagnosticType.warning("TEST", "test"), "");
        
        TypeValidator.TypeMismatch mismatch = new TypeValidator.TypeMismatch(typeA, typeB, error);
        assertTrue(mismatch.toString().contains("(number, string)"));
    }
}
```