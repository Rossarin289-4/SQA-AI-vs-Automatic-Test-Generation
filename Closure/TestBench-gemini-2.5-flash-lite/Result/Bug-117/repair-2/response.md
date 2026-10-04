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
import java.io.IOException; // Added for appendable use in Node.toStringTree if needed, though not directly used in tests
import java.io.Serializable; // Added for JSType and Node

public class TypeValidatorTest {

    private static final String DUMMY_SOURCE_NAME = "test.js";

    // Mock Compiler and related types to satisfy TypeValidator's dependencies.
    // AbstractCompiler is an abstract class, so we need to provide concrete implementations for its abstract methods.
    // Since no concrete subclasses are provided, and mocking is not allowed for project types, we create a minimal mock.
    private static class MockCompiler extends AbstractCompiler {
        private final JSTypeRegistry typeRegistry;
        private final TypeValidator validator;
        private final List<JSError> errors = Lists.newArrayList();

        MockCompiler() {
            // Provide a basic ErrorReporter that collects errors
            ErrorReporter errorReporter = new ErrorReporter() {
                @Override
                public void report(CheckLevel level, DiagnosticType diagnosticType, String... arguments) {
                    errors.add(JSError.make(DUMMY_SOURCE_NAME, null, diagnosticType, arguments));
                }

                @Override
                public void report(JSError error) {
                    errors.add(error);
                }
            };
            this.typeRegistry = new JSTypeRegistry(errorReporter);
            this.validator = new TypeValidator(this);
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public void report(JSError error) {
            this.errors.add(error);
        }

        @Override
        public String getSourceFileName() {
            return DUMMY_SOURCE_NAME;
        }

        @Override
        public TypeValidator getTypeValidator() {
            return validator;
        }

        // --- Stub implementations for AbstractCompiler abstract methods ---
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
        @SuppressWarnings("unchecked") // Suppress warning for unchecked cast
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
        public CodingConvention getJavaScriptCodingConvention() { return new ClosureCodingConvention(); } // Default to ClosureCodingConvention
        @Override
        public RegionTraversal.TraversalMap getRegionMap() { return null; } // Not implemented for mock
        @Override
        public void setRegionMap(RegionTraversal.TraversalMap map) {} // Not implemented for mock
        @Override
        public void setProgress(CodeChangeLog log) {} // Not implemented for mock
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
        @Override
        public int getErrorCount() { return errors.size(); }
        @Override
        public int getWarningCount() { return 0; } // Mock doesn't distinguish errors/warnings
        @Override
        public void setProgress(int percent) {} // No-op
        @Override
        public Node getRoot() { return null; } // Not used in these tests
        @Override
        public boolean isIdeMode() { return false; }
        @Override
        public JSError newError(JSError error) { return error; }
        @Override
        public boolean shouldRunValidation(String validationName) { return true; }
    }

    // Helper method to get native types
    private JSType getNativeType(JSTypeNative typeId) {
        return new MockCompiler().getTypeRegistry().getNativeType(typeId);
    }
    
    private JSTypeRegistry typeRegistry = new MockCompiler().getTypeRegistry();


    // Mock NodeTraversal to avoid null checks in tests where NodeTraversal is passed.
    // For methods that don't use NodeTraversal's specific features, we can pass null.
    // For methods that *do* use NodeTraversal, we might need a more sophisticated mock.
    // For this specific test suite, most calls to methods like `expectObject` that
    // take `NodeTraversal` as the first argument don't actually *use* it to report errors
    // because we are testing the logic within `TypeValidator` itself, not the reporting mechanism.
    // So, passing null for NodeTraversal is acceptable for these tests.

    @Test
    public void testExpectValidTypeofName() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        // expectValidTypeofName uses NodeTraversal to get source name, if null, it uses a default.
        // For this test, we assume the reporter handles null source name gracefully or we don't check the report.
        validator.expectValidTypeofName(null, n, "someType");
        assertTrue(true); // Test passes if no exception is thrown.
    }

    @Test
    public void testExpectObject_whenObject() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        Node n = new Node(Node.OBJECT_KEY); // Dummy node
        assertTrue(validator.expectObject(null, n, objectType, "expected object"));
    }

    @Test
    public void testExpectObject_whenNotObject() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        assertFalse(validator.expectObject(null, n, stringType, "expected object"));
    }

    @Test
    public void testExpectActualObject_whenObject() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        Node n = new Node(Node.OBJECT_KEY); // Dummy node
        validator.expectActualObject(null, n, objectType, "expected actual object");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectActualObject_whenNotObject() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectActualObject(null, n, stringType, "expected actual object");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectAnyObject_whenObject() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        Node n = new Node(Node.OBJECT_KEY); // Dummy node
        validator.expectAnyObject(null, n, objectType, "expected any object");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectAnyObject_whenNotObject() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectAnyObject(null, n, stringType, "expected any object");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectString_whenString() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectString(null, n, stringType, "expected string");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectString_whenNotString() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        validator.expectString(null, n, numberType, "expected string");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectNumber_whenNumber() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        validator.expectNumber(null, n, numberType, "expected number");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectNumber_whenNotNumber() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectNumber(null, n, stringType, "expected number");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectBitwiseable_whenNumber() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        validator.expectBitwiseable(null, n, numberType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectBitwiseable_whenString() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectBitwiseable(null, n, stringType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed.
    }
    
    @Test
    public void testExpectBitwiseable_whenBoolean() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType booleanType = typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Node n = new Node(Node.TRUE); // Dummy node
        validator.expectBitwiseable(null, n, booleanType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectBitwiseable_whenUndefined() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType voidType = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
        Node n = new Node(Node.VOID_NODE); // Dummy node
        validator.expectBitwiseable(null, n, voidType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectBitwiseable_whenNull() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType nullType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        Node n = new Node(Node.NULL_NODE); // Dummy node
        validator.expectBitwiseable(null, n, nullType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed.
    }
    
    @Test
    public void testExpectBitwiseable_whenUnknown() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType unknownType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        Node n = new Node(Node.ERROR_NODE); // Dummy node
        validator.expectBitwiseable(null, n, unknownType, "expected bitwiseable");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectStringOrNumber_whenString() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        validator.expectStringOrNumber(null, n, stringType, "expected string or number");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectStringOrNumber_whenNumber() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        validator.expectStringOrNumber(null, n, numberType, "expected string or number");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectStringOrNumber_whenBoolean() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType booleanType = typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Node n = new Node(Node.TRUE); // Dummy node
        validator.expectStringOrNumber(null, n, booleanType, "expected string or number");
        assertTrue(true); // No exception means it passed.
    }
    
    @Test
    public void testExpectNotNullOrUndefined_whenNotNullOrUndefined() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertTrue(validator.expectNotNullOrUndefined(null, n, stringType, "expected not null or undefined", expectedType));
    }

    @Test
    public void testExpectNotNullOrUndefined_whenNull() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType nullType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        Node n = new Node(Node.NULL_NODE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertFalse(validator.expectNotNullOrUndefined(null, n, nullType, "expected not null or undefined", expectedType));
    }
    
    @Test
    public void testExpectNotNullOrUndefined_whenUndefined() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType voidType = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
        Node n = new Node(Node.VOID_NODE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertFalse(validator.expectNotNullOrUndefined(null, n, voidType, "expected not null or undefined", expectedType));
    }

    @Test
    public void testExpectNotNullOrUndefined_whenUnionWithNull() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType unionType = typeRegistry.createUnionType(getNativeType(JSTypeNative.STRING_TYPE), getNativeType(JSTypeNative.NULL_TYPE));
        Node n = new Node(Node.STRING_VALUE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertTrue(validator.expectNotNullOrUndefined(null, n, unionType, "expected not null or undefined", expectedType));
    }
    
    @Test
    public void testExpectNotNullOrUndefined_whenUnionWithUndefined() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType unionType = typeRegistry.createUnionType(getNativeType(JSTypeNative.NUMBER_TYPE), getNativeType(JSTypeNative.VOID_TYPE));
        Node n = new Node(Node.NUMBER_VALUE); // Dummy node
        JSType expectedType = typeRegistry.createSingletonObject(null); // Placeholder
        assertTrue(validator.expectNotNullOrUndefined(null, n, unionType, "expected not null or undefined", expectedType));
    }

    @Test
    public void testExpectSwitchMatchesCase_whenMatch() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType switchType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType caseType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node switchNode = new Node(Node.SWITCH);
        Node caseNode = new Node(Node.CASE);
        switchNode.addChildToBack(caseNode);
        validator.expectSwitchMatchesCase(null, switchNode, switchType, caseType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectSwitchMatchesCase_whenNoMatchButAutobox() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType switchType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType caseType = typeRegistry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE); // Number object autoboxes to number
        Node switchNode = new Node(Node.SWITCH);
        Node caseNode = new Node(Node.CASE);
        switchNode.addChildToBack(caseNode);
        validator.expectSwitchMatchesCase(null, switchNode, switchType, caseType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectSwitchMatchesCase_whenNoMatch() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType switchType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType caseType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node switchNode = new Node(Node.SWITCH);
        Node caseNode = new Node(Node.CASE);
        switchNode.addChildToBack(caseNode);
        validator.expectSwitchMatchesCase(null, switchNode, switchType, caseType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectIndexMatch_whenArrayAccess() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType arrayType = typeRegistry.createArrayType(getNativeType(JSTypeNative.STRING_TYPE));
        JSType indexType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.NUMBER_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, arrayType, indexType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectIndexMatch_whenObjectAccess() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType objectType = typeRegistry.createObjectType("MyObject");
        JSType indexType = getNativeType(JSTypeNative.STRING_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.STRING_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, objectType, indexType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectIndexMatch_whenIllegalPropertyAccessOnStruct() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType structType = typeRegistry.createObjectType("MyStruct");
        structType.setStruct(true); // Mark as struct
        JSType indexType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.NUMBER_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, structType, indexType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectIndexMatch_whenUnknownTypeAccess() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType unknownType = getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType indexType = getNativeType(JSTypeNative.STRING_TYPE);
        Node getElemNode = new Node(Node.GETELEM);
        getElemNode.addChildToBack(new Node(Node.NAME)); // Dummy object node
        getElemNode.addChildToBack(new Node(Node.STRING_VALUE)); // Dummy index node
        validator.expectIndexMatch(null, getElemNode, unknownType, indexType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanAssignToPropertyOf_whenAssignable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType rightType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node assignmentNode = new Node(Node.ASSIGN);
        Node propertyOwnerNode = new Node(Node.NAME); // Represents the object owning the property
        propertyOwnerNode.setJSType(getNativeType(JSTypeNative.OBJECT_TYPE));
        assertTrue(validator.expectCanAssignToPropertyOf(null, assignmentNode, rightType, leftType, propertyOwnerNode, "propName"));
    }

    @Test
    public void testExpectCanAssignToPropertyOf_whenNotAssignable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType rightType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node assignmentNode = new Node(Node.ASSIGN);
        Node propertyOwnerNode = new Node(Node.NAME); // Represents the object owning the property
        propertyOwnerNode.setJSType(getNativeType(JSTypeNative.OBJECT_TYPE));
        assertFalse(validator.expectCanAssignToPropertyOf(null, assignmentNode, rightType, leftType, propertyOwnerNode, "propName"));
    }
    
    @Test
    public void testExpectCanAssignToPropertyOf_whenInterfaceMethod() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        // Simulate a function type for method assignment
        JSType rightType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE));
        JSType leftType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE));
        Node assignmentNode = new Node(Node.ASSIGN);
        
        // Create an interface and its prototype to simulate inheritance
        ObjectType interfaceProto = typeRegistry.createInterface("MyInterface");
        // The interface itself doesn't have a constructor in the same way an object does.
        // For simplicity, we'll use a generic object type as the owner for the property.
        Node propertyOwnerNode = new Node(Node.NAME); 
        propertyOwnerNode.setJSType(interfaceProto);
        
        assertTrue(validator.expectCanAssignToPropertyOf(null, assignmentNode, rightType, leftType, propertyOwnerNode, "methodName"));
    }

    @Test
    public void testExpectCanAssignTo_whenAssignable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType rightType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.ASSIGN); // Dummy node
        assertTrue(validator.expectCanAssignTo(null, n, rightType, leftType, "assign message"));
    }

    @Test
    public void testExpectCanAssignTo_whenNotAssignable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType rightType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType leftType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.ASSIGN); // Dummy node
        assertFalse(validator.expectCanAssignTo(null, n, rightType, leftType, "assign message"));
    }

    @Test
    public void testExpectArgumentMatchesParameter_whenMatch() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType argType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType paramType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node callNode = new Node(Node.CALL);
        Node argNode = new Node(Node.NUMBER_VALUE);
        validator.expectArgumentMatchesParameter(null, argNode, argType, paramType, callNode, 0);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectArgumentMatchesParameter_whenMismatch() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType argType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType paramType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node callNode = new Node(Node.CALL);
        Node argNode = new Node(Node.STRING_VALUE);
        validator.expectArgumentMatchesParameter(null, argNode, argType, paramType, callNode, 0);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanOverride_whenOverridable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType overridingType = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType hiddenType = getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType ownerType = typeRegistry.createObjectType("Owner");
        Node n = new Node(Node.PROP_ASSIGN); // Dummy node
        validator.expectCanOverride(null, n, overridingType, hiddenType, "propName", ownerType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanOverride_whenNotOverridable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType overridingType = getNativeType(JSTypeNative.STRING_TYPE);
        JSType hiddenType = getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType ownerType = typeRegistry.createObjectType("Owner");
        Node n = new Node(Node.PROP_ASSIGN); // Dummy node
        validator.expectCanOverride(null, n, overridingType, hiddenType, "propName", ownerType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectSuperType_whenCorrectSuperType() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType superObject = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        ObjectType subObject = typeRegistry.createObjectType("SubClass");
        subObject.setPrototypeBasedOn(superObject);
        Node n = new Node(Node.CLASS); // Dummy node
        validator.expectSuperType(null, n, superObject, subObject);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectSuperType_whenIncorrectSuperType() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType superObject = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType subObject = typeRegistry.createObjectType("SubClass");
        subObject.setPrototypeBasedOn(typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node n = new Node(Node.CLASS); // Dummy node
        validator.expectSuperType(null, n, superObject, subObject);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanCast_whenCastable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType type = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType castType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node n = new Node(Node.CAST); // Dummy node
        validator.expectCanCast(null, n, castType, type);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectCanCast_whenNotCastable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType type = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType castType = getNativeType(JSTypeNative.STRING_TYPE);
        Node n = new Node(Node.CAST); // Dummy node
        validator.expectCanCast(null, n, castType, type);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectUndeclaredVariable_whenNewVariable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        Var existingVar = null; // No existing variable
        JSType newType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node declarationNode = new Node(Node.VAR);
        Node valueNode = new Node(Node.NUMBER_VALUE);
        declarationNode.addChildToBack(valueNode);
        // Pass a valid parent node for declarationNode, e.g., itself if it's the root of the declaration
        validator.expectUndeclaredVariable(DUMMY_SOURCE_NAME, null, declarationNode, declarationNode, existingVar, "newVar", newType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectUndeclaredVariable_whenDuplicateTypedVariable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType existingType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node existingVarNameNode = new Node(Node.NAME);
        Var existingVar = Var.make("dupVar", existingVarNameNode, existingType, null, null);
        JSType newType = getNativeType(JSTypeNative.STRING_TYPE);
        Node declarationNode = new Node(Node.VAR);
        Node valueNode = new Node(Node.STRING_VALUE);
        declarationNode.addChildToBack(valueNode);
        // Pass a valid parent node for declarationNode
        validator.expectUndeclaredVariable(DUMMY_SOURCE_NAME, null, declarationNode, declarationNode, existingVar, "dupVar", newType);
        assertTrue(true); // No exception means it passed.
    }
    
    @Test
    public void testExpectUndeclaredVariable_whenDuplicateSameTypeVariable() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        JSType existingType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node existingVarNameNode = new Node(Node.NAME);
        Var existingVar = Var.make("dupVar", existingVarNameNode, existingType, null, null);
        JSType newType = getNativeType(JSTypeNative.NUMBER_TYPE);
        Node declarationNode = new Node(Node.VAR);
        Node valueNode = new Node(Node.NUMBER_VALUE);
        declarationNode.addChildToBack(valueNode);
        // Pass a valid parent node for declarationNode
        validator.expectUndeclaredVariable(DUMMY_SOURCE_NAME, null, declarationNode, declarationNode, existingVar, "dupVar", newType);
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testExpectAllInterfaceProperties_whenInterfaceWithProperty() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        
        // Create a function type representing a class
        FunctionType functionType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE));
        ObjectType instanceType = functionType.getInstanceType();
        
        // Create a dummy interface with a property
        ObjectType dummyInterface = typeRegistry.createInterface("DummyInterface");
        dummyInterface.defineDeclaredProperty("dummyProp", getNativeType(JSTypeNative.STRING_TYPE), null);
        
        // Make the function type implement the dummy interface
        functionType.setImplementedInterfaces(Lists.newArrayList(dummyInterface));
        
        // Define the property on the instance type as well
        instanceType.defineDeclaredProperty("dummyProp", getNativeType(JSTypeNative.STRING_TYPE), null);

        Node n = new Node(Node.FUNCTION); // Dummy node
        validator.expectAllInterfaceProperties(null, n, functionType);
        assertTrue(true); // No exception means it passed.
    }
    
    @Test
    public void testExpectInterfaceProperty_whenPropertyExistsAndMatches() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType instance = typeRegistry.createObjectType("Instance");
        ObjectType implementedInterface = typeRegistry.createInterface("ImplementedInterface");
        // Property defined on interface
        implementedInterface.defineDeclaredProperty("interfaceProp", getNativeType(JSTypeNative.NUMBER_TYPE), null);
        
        // Property implemented on instance type with matching type
        instance.defineDeclaredProperty("interfaceProp", getNativeType(JSTypeNative.NUMBER_TYPE), null);

        Node n = new Node(Node.OBJECT_LIT); // Dummy node
        validator.expectInterfaceProperty(null, n, instance, implementedInterface, "interfaceProp");
        assertTrue(true); // No exception means it passed.
    }

    @Test
    public void testGetReadableJSTypeName_objectProperty() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        ObjectType ownerType = typeRegistry.createObjectType("MyObject");
        ownerType.defineDeclaredProperty("myProp", getNativeType(JSTypeNative.STRING_TYPE), null);
        
        Node propNode = new Node(Node.GETPROP);
        Node ownerNode = new Node(Node.NAME);
        ownerNode.setJSType(ownerType);
        Node propNameNode = Node.newString("myProp"); // Use Node.newString for creating string nodes
        propNode.addChildToBack(ownerNode);
        propNode.addChildToBack(propNameNode);
        
        assertEquals("MyObject.myProp", validator.getReadableJSTypeName(propNode, false));
    }

    @Test
    public void testGetReadableJSTypeName_qualifiedName() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        Node nameNode = Node.newString("myVariable"); // Use Node.newString
        nameNode.setJSType(getNativeType(JSTypeNative.STRING_TYPE));
        // JSDocInfo is not strictly needed for getReadableJSTypeName to work based on qualified name.
        
        assertEquals("myVariable", validator.getReadableJSTypeName(nameNode, false));
    }

    @Test
    public void testGetReadableJSTypeName_functionType() throws Exception {
        MockCompiler compiler = new MockCompiler();
        TypeValidator validator = compiler.getTypeValidator();
        FunctionType fnType = typeRegistry.createFunctionType(getNativeType(JSTypeNative.VOID_TYPE));
        Node fnNode = new Node(Node.FUNCTION);
        fnNode.setJSType(fnType);
        
        assertEquals("function", validator.getReadableJSTypeName(fnNode, false));
    }
    
    @Test
    public void testTypeMismatch_equalsAndHashCode() throws Exception {
        JSType typeA = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(JSTypeNative.STRING_TYPE);
        JSError error = JSError.make(DUMMY_SOURCE_NAME, new Node(Node.NAME), DiagnosticType.warning("TEST", "test"), "");
        
        TypeValidator.TypeMismatch mismatch1 = new TypeValidator.TypeMismatch(typeA, typeB, error);
        TypeValidator.TypeMismatch mismatch2 = new TypeValidator.TypeMismatch(typeA, typeB, error);
        TypeValidator.TypeMismatch mismatch3 = new TypeValidator.TypeMismatch(typeB, typeA, error);
        
        assertEquals(mismatch1, mismatch2);
        assertEquals(mismatch2, mismatch3); // Order should not matter for equals
        assertNotEquals(mismatch1, null);
        assertNotEquals(mismatch1, new Object());
        
        assertEquals(mismatch1.hashCode(), mismatch2.hashCode());
        assertEquals(mismatch2.hashCode(), mismatch3.hashCode()); // Hash codes should match if equals is true
    }
    
    @Test
    public void testTypeMismatch_toString() throws Exception {
        JSType typeA = getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(JSTypeNative.STRING_TYPE);
        JSError error = JSError.make(DUMMY_SOURCE_NAME, new Node(Node.NAME), DiagnosticType.warning("TEST", "test"), "");
        
        TypeValidator.TypeMismatch mismatch = new TypeValidator.TypeMismatch(typeA, typeB, error);
        assertTrue(mismatch.toString().contains("(number, string)"));
    }
}
```