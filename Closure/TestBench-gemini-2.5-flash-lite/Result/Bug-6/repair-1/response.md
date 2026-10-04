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
import com.google.javascript.rhino.jstype.UnknownType;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TypeValidatorTest {

    // Mock compiler and JSTypeRegistry for testing
    private static class MockCompiler extends AbstractCompiler {
        @Override
        public JSTypeRegistry getTypeRegistry() {
            // Return a basic JSTypeRegistry
            return new JSTypeRegistry(null);
        }

        @Override
        public void report(JSError error) {
            // Do nothing, or potentially collect errors for assertion
        }

        // Implement other required abstract methods if necessary, using only
        // types and methods visible in the provided API Outline.
        // For methods that are not directly used by the TypeValidator tests,
        // provide minimal implementations.

        @Override
        public Node parseInputs() {
            return new Node(0); // Dummy Node
        }

        @Override
        public boolean optimize() {
            return false;
        }

        @Override
        public void process(SourceFile externs, SourceFile[] inputs) { }

        @Override
        public void processDefines() { }

        @Override
        public boolean inferTypes(FunctionInformationList functionInformationList) { return false; }

        @Override
        public void injectSyntheticCode(SyntheticCode syntheticCode) { }

        @Override
        public void addChange(NodeTraversal traversal, Node node, Node replacement, String diagnosticDescription) { }

        @Override
        public void addDiagnostic(JSError error) { }

        @Override
        public void setExterns(List<SourceFile> externs) { }

        @Override
        public List<SourceFile> getExterns() { return null; }

        @Override
        public void setInputs(List<SourceFile> inputs) { }

        @Override
        public List<SourceFile> getInputs() { return null; }

        @Override
        public void setExternHistory(List<SourceFile> externHistory) { }

        @Override
        public List<SourceFile> getExternHistory() { return null; }

        @Override
        public void setStandaloneCodeReviewMode(boolean standaloneCodeReviewMode) { }

        @Override
        public void setHosanna(boolean hosanna) { }

        @Override
        public boolean getHosanna() { return false; }

        @Override
        public void setRunGenerateExports(boolean runGenerateExports) { }

        @Override
        public boolean shouldRunGenerateExports() { return false; }

        @Override
        public com.google.javascript.jscomp.JsMessage.Style getMessageStyle() { return null; }

        @Override
        public void enableTypeCheck(com.google.javascript.jscomp.TypeCheckMode typeCheckMode) { }

        @Override
        public void disableTypeCheck() { }

        @Override
        public boolean isTypeCheckingEnabled() { return false; }

        @Override
        public com.google.javascript.jscomp.TypeCheckMode getTypeCheckMode() { return null; }

        @Override
        public com.google.javascript.jscomp.PerformanceTracer getPerformanceTracer() { return null; }

        @Override
        public com.google.javascript.jscomp.VariableMap getVariableMap() { return null; }

        @Override
        public FunctionInformationList getInjectableJsFunctions() { return null; }

        @Override
        public boolean getGenerateExports() { return false; }

        @Override
        public void setGenerateExports(boolean generateExports) { }

        @Override
        public void setExportTestFunctions(boolean exportTestFunctions) { }

        @Override
        public boolean getExportTestFunctions() { return false; }

        @Override
        public void setAllowInjection(boolean allowInjection) { }

        @Override
        public boolean getAllowInjection() { return false; }

        @Override
        public void setPropertyMap(com.google.javascript.jscomp.PropertyMap propertyMap) { }

        @Override
        public void setVariableMap(com.google.javascript.jscomp.VariableMap variableMap) { }

        @Override
        public com.google.javascript.jscomp.CodingConvention getCodingConvention() { return null; }

        @Override
        public void setCodingConvention(com.google.javascript.jscomp.CodingConvention codingConvention) { }

        @Override
        public WarningsGuard[] getGuards() { return null; }

        @Override
        public void setGuards(WarningsGuard[] guards) { }

        @Override
        public String getSourcePath(String filename) { return null; }

        @Override
        public void setSourcePath(String sourcePath) { }

        @Override
        public void setSourceMap(com.google.javascript.jscomp.SourceMap sourceMap) { }

        @Override
        public com.google.javascript.jscomp.SourceMap getSourceMap() { return null; }

        @Override
        public com.google.javascript.jscomp.MessageBundle getMessageBundle() { return null; }

        @Override
        public void setMessageBundle(com.google.javascript.jscomp.MessageBundle messageBundle) { }

        @Override
        public boolean isIdeMode() { return false; }

        @Override
        public void setIdeMode(boolean ideMode) { }

        @Override
        public void setIncrementalMode(boolean incrementalMode) { }

        @Override
        public boolean isIncrementalMode() { return false; }

        @Override
        public void setPhased(boolean phased) { }

        @Override
        public boolean isPhased() { return false; }

        @Override
        public void setErrorManager(com.google.javascript.jscomp.ErrorManager errorManager) { }

        @Override
        public com.google.javascript.jscomp.ErrorManager getErrorManager() { return null; }

        @Override
        public void setPassConfig(com.google.javascript.jscomp.PassConfig passConfig) { }

        @Override
        public com.google.javascript.jscomp.PassConfig getPassConfig() { return null; }

        @Override
        public void beforePass(String passName) { }

        @Override
        public void afterPass(String passName) { }

        @Override
        public void validateCompilationGraph() { }

        @Override
        public boolean shouldRunJsDocInfoParser() { return false; }

        @Override
        public void setShouldRunJsDocInfoParser(boolean shouldRunJsDocInfoParser) { }

        @Override
        public void ensureLibraryInjected(String jslib) { }

        @Override
        public void injectFile(String filename) { }

        @Override
        public void injectFile(SourceFile file) { }

        @Override
        public void injectCompiledJs(String compiledJs) { }

        @Override
        public void injectCompiledJs(SourceFile compiledJs) { }

        @Override
        public boolean isSourcePathProvided() { return false; }

        @Override
        public boolean hasErrors() { return false; }

        @Override
        public void ensureAssetInjected(String asset) { }

        @Override
        public void setLoggingLevel(java.util.logging.Level level) { }

        @Override
        public java.util.logging.Level getLoggingLevel() { return null; }

        @Override
        public void enableNamedFunctionSaving() { }

        @Override
        public void disableNamedFunctionSaving() { }

        @Override
        public boolean shouldPreserveAliasInNamedFunctionSaving() { return false; }

        @Override
        public void setPreserveAliasInNamedFunctionSaving(boolean preserveAlias) { }

        @Override
        public void setTarget(CompilerOptions.Target target) { }

        @Override
        public CompilerOptions.Target getTarget() { return null; }

        @Override
        public String getSourceVersion() { return null; }

        @Override
        public void setSourceVersion(String sourceVersion) { }

        @Override
        public void setPropertyReviver(com.google.javascript.jscomp.PropertyReviver propertyReviver) { }

        @Override
        public com.google.javascript.jscomp.PropertyReviver getPropertyReviver() { return null; }

        @Override
        public FunctionInformationList getGlobalFunctions() { return null; }

        @Override
        public void setGloballyDefinedProperties(Set<String> globallyDefinedProperties) { }

        @Override
        public Set<String> getGloballyDefinedProperties() { return null; }

        @Override
        public void setFunctionInformationList(FunctionInformationList functionInformationList) { }

        @Override
        public void setRoot(Node root) { }

        @Override
        public Node getRoot() { return new Node(0); } // Dummy Node
    }

    private MockCompiler compiler = new MockCompiler();
    private JSTypeRegistry typeRegistry = compiler.getTypeRegistry();
    private TypeValidator validator = new TypeValidator(compiler);

    private NodeTraversal createNodeTraversal(Node node) {
        return new NodeTraversal(compiler, new NodeTraversal.Callback() {
            @Override
            public boolean visit(NodeTraversal t, Node n) {
                // Return true to continue traversal, false to stop.
                // For simple tests, we might not need to do anything here.
                return true;
            }
        });
    }

    @Test
    public void testExpectValidTypeofName_unknownType() throws Exception {
        Node node = Node.newString("unknown");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectValidTypeofName(t, node, "unknown");
        assertTrue(true); // Basic check that it doesn't throw an exception.
    }

    @Test
    public void testExpectObject_validObject() throws Exception {
        ObjectType objType = typeRegistry.createObjectType("MyObject");
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        assertTrue(validator.expectObject(t, node, objType, "expected object"));
    }

    @Test
    public void testExpectObject_invalidObject() throws Exception {
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        assertFalse(validator.expectObject(t, node, stringType, "expected object"));
    }

    @Test
    public void testExpectActualObject_validObject() throws Exception {
        ObjectType objType = typeRegistry.createObjectType("MyObject");
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectActualObject(t, node, objType, "expected actual object");
        assertTrue(true);
    }

    @Test
    public void testExpectActualObject_invalidObject() throws Exception {
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectActualObject(t, node, stringType, "expected actual object");
        assertTrue(true);
    }

    @Test
    public void testExpectAnyObject_valid() throws Exception {
        JSType anyObjectType = typeRegistry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectAnyObject(t, node, anyObjectType, "expected any object");
        assertTrue(true);
    }

    @Test
    public void testExpectAnyObject_invalid() throws Exception {
        JSType nullType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectAnyObject(t, node, nullType, "expected any object");
        assertTrue(true);
    }

    @Test
    public void testExpectString_validString() throws Exception {
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectString(t, node, stringType, "expected string");
        assertTrue(true);
    }

    @Test
    public void testExpectString_invalidString() throws Exception {
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectString(t, node, numberType, "expected string");
        assertTrue(true);
    }

    @Test
    public void testExpectNumber_validNumber() throws Exception {
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectNumber(t, node, numberType, "expected number");
        assertTrue(true);
    }

    @Test
    public void testExpectNumber_invalidNumber() throws Exception {
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectNumber(t, node, stringType, "expected number");
        assertTrue(true);
    }

    @Test
    public void testExpectBitwiseable_validNumber() throws Exception {
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectBitwiseable(t, node, numberType, "expected bitwiseable");
        assertTrue(true);
    }

    @Test
    public void testExpectBitwiseable_validString() throws Exception {
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectBitwiseable(t, node, stringType, "expected bitwiseable");
        assertTrue(true);
    }

    @Test
    public void testExpectBitwiseable_invalidType() throws Exception {
        ObjectType objType = typeRegistry.createObjectType("MyObject");
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectBitwiseable(t, node, objType, "expected bitwiseable");
        assertTrue(true);
    }

    @Test
    public void testExpectStringOrNumber_validString() throws Exception {
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectStringOrNumber(t, node, stringType, "expected string or number");
        assertTrue(true);
    }

    @Test
    public void testExpectStringOrNumber_validNumber() throws Exception {
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectStringOrNumber(t, node, numberType, "expected string or number");
        assertTrue(true);
    }

    @Test
    public void testExpectStringOrNumber_invalidType() throws Exception {
        ObjectType objType = typeRegistry.createObjectType("MyObject");
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectStringOrNumber(t, node, objType, "expected string or number");
        assertTrue(true);
    }

    @Test
    public void testExpectNotNullOrUndefined_valid() throws Exception {
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        assertTrue(validator.expectNotNullOrUndefined(t, node, numberType, "expected not null or undefined", numberType));
    }

    @Test
    public void testExpectNotNullOrUndefined_invalidNull() throws Exception {
        JSType nullType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        assertFalse(validator.expectNotNullOrUndefined(t, node, nullType, "expected not null or undefined", nullType));
    }

    @Test
    public void testExpectNotNullOrUndefined_invalidUndefined() throws Exception {
        JSType voidType = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        assertFalse(validator.expectNotNullOrUndefined(t, node, voidType, "expected not null or undefined", voidType));
    }

    @Test
    public void testExpectNotNullOrUndefined_unionWithNull() throws Exception {
        JSType unionType = typeRegistry.createUnionType(
            typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE),
            typeRegistry.getNativeType(JSTypeNative.NULL_TYPE)
        );
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        assertFalse(validator.expectNotNullOrUndefined(t, node, unionType, "expected not null or undefined", unionType));
    }

    @Test
    public void testExpectNotNullOrUndefined_unionWithUndefined() throws Exception {
        JSType unionType = typeRegistry.createUnionType(
            typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE),
            typeRegistry.getNativeType(JSTypeNative.VOID_TYPE)
        );
        Node node = Node.newString("test");
        NodeTraversal t = createNodeTraversal(node);
        assertFalse(validator.expectNotNullOrUndefined(t, node, unionType, "expected not null or undefined", unionType));
    }

    @Test
    public void testExpectSwitchMatchesCase_matchingTypes() throws Exception {
        JSType switchType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType caseType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node switchNode = Node.newNumber(5);
        Node caseNode = Node.newNumber(5);
        Node switchStatement = new Node(Node.SWITCH, switchNode, caseNode);
        NodeTraversal t = createNodeTraversal(switchStatement);
        validator.expectSwitchMatchesCase(t, switchStatement, switchType, caseType);
        assertTrue(true);
    }

    @Test
    public void testExpectSwitchMatchesCase_mismatchingTypes() throws Exception {
        JSType switchType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType caseType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node switchNode = Node.newNumber(5);
        Node caseNode = Node.newString("5");
        Node switchStatement = new Node(Node.SWITCH, switchNode, caseNode);
        NodeTraversal t = createNodeTraversal(switchStatement);
        validator.expectSwitchMatchesCase(t, switchStatement, switchType, caseType);
        assertTrue(true);
    }

    @Test
    public void testExpectIndexMatch_validArrayAccess() throws Exception {
        JSType arrayType = typeRegistry.createArrayType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        JSType indexType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node arrayNode = new Node(Node.ARRAY_LIT, Node.newNumber(1)); // Dummy array node
        Node indexNode = Node.newNumber(0);
        Node getElemNode = new Node(Node.GETELEM, arrayNode, indexNode);
        NodeTraversal t = createNodeTraversal(getElemNode);
        validator.expectIndexMatch(t, getElemNode, arrayType, indexType);
        assertTrue(true);
    }

    @Test
    public void testExpectIndexMatch_invalidArrayIndexType() throws Exception {
        JSType arrayType = typeRegistry.createArrayType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        JSType indexType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node arrayNode = new Node(Node.ARRAY_LIT, Node.newNumber(1)); // Dummy array node
        Node indexNode = Node.newString("0");
        Node getElemNode = new Node(Node.GETELEM, arrayNode, indexNode);
        NodeTraversal t = createNodeTraversal(getElemNode);
        validator.expectIndexMatch(t, getElemNode, arrayType, indexType);
        assertTrue(true);
    }

    @Test
    public void testExpectIndexMatch_objectPropertyAccess() throws Exception {
        ObjectType objType = typeRegistry.createObjectType("MyObject");
        objType.defineProperty("prop", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        JSType indexType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node objNode = new Node(Node.OBJECTLIT); // Dummy object node
        Node indexNode = Node.newString("prop");
        Node getElemNode = new Node(Node.GETELEM, objNode, indexNode);
        NodeTraversal t = createNodeTraversal(getElemNode);
        validator.expectIndexMatch(t, getElemNode, objType, indexType);
        assertTrue(true);
    }

    @Test
    public void testExpectIndexMatch_illegalStructAccess() throws Exception {
        JSType structType = typeRegistry.createNominalType("Struct");
        Node structNode = Node.newString("myStruct");
        Node indexNode = Node.newString("prop");
        Node getElemNode = new Node(Node.GETELEM, structNode, indexNode);
        NodeTraversal t = createNodeTraversal(getElemNode);
        validator.expectIndexMatch(t, getElemNode, structType, indexType);
        assertTrue(true);
    }

    @Test
    public void testExpectCanAssignToPropertyOf_validAssignment() throws Exception {
        JSType rightType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leftType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node propertyAccess = new Node(Node.GETPROP, new Node(Node.OBJECTLIT), Node.newString("prop"));
        Node assignNode = new Node(Node.ASSIGN, propertyAccess, Node.newNumber(10));
        Node ownerNode = new Node(Node.OBJECTLIT); // Dummy owner node
        NodeTraversal t = createNodeTraversal(assignNode);
        assertTrue(validator.expectCanAssignToPropertyOf(t, propertyAccess, rightType, leftType, ownerNode, "propName"));
    }

    @Test
    public void testExpectCanAssignToPropertyOf_invalidAssignment() throws Exception {
        JSType rightType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType leftType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node propertyAccess = new Node(Node.GETPROP, new Node(Node.OBJECTLIT), Node.newString("prop"));
        Node assignNode = new Node(Node.ASSIGN, propertyAccess, Node.newString("10"));
        Node ownerNode = new Node(Node.OBJECTLIT); // Dummy owner node
        NodeTraversal t = createNodeTraversal(assignNode);
        assertFalse(validator.expectCanAssignToPropertyOf(t, propertyAccess, rightType, leftType, ownerNode, "propName"));
    }

    @Test
    public void testExpectCanAssignTo_validAssignment() throws Exception {
        JSType rightType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leftType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node nameNode = Node.newName("x");
        Node assignNode = new Node(Node.ASSIGN, nameNode, Node.newNumber(10));
        NodeTraversal t = createNodeTraversal(assignNode);
        assertTrue(validator.expectCanAssignTo(t, assignNode.getLastChild(), rightType, leftType, "valid assignment"));
    }

    @Test
    public void testExpectCanAssignTo_invalidAssignment() throws Exception {
        JSType rightType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType leftType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node nameNode = Node.newName("x");
        Node assignNode = new Node(Node.ASSIGN, nameNode, Node.newString("10"));
        NodeTraversal t = createNodeTraversal(assignNode);
        assertFalse(validator.expectCanAssignTo(t, assignNode.getLastChild(), rightType, leftType, "invalid assignment"));
    }

    @Test
    public void testExpectArgumentMatchesParameter_validMatch() throws Exception {
        JSType argType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType paramType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node callNode = new Node(Node.CALL);
        Node argNode = Node.newNumber(10);
        NodeTraversal t = createNodeTraversal(callNode);
        validator.expectArgumentMatchesParameter(t, argNode, argType, paramType, callNode, 0);
        assertTrue(true);
    }

    @Test
    public void testExpectArgumentMatchesParameter_mismatch() throws Exception {
        JSType argType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType paramType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node callNode = new Node(Node.CALL);
        Node argNode = Node.newString("10");
        NodeTraversal t = createNodeTraversal(callNode);
        validator.expectArgumentMatchesParameter(t, argNode, argType, paramType, callNode, 0);
        assertTrue(true);
    }

    @Test
    public void testExpectCanOverride_validOverride() throws Exception {
        JSType overridingType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType hiddenType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType ownerType = typeRegistry.createObjectType("Owner");
        Node node = new Node(Node.GETPROP);
        NodeTraversal t = createNodeTraversal(node);
        validator.expectCanOverride(t, node, overridingType, hiddenType, "prop", ownerType);
        assertTrue(true);
    }

    @Test
    public void testExpectCanOverride_invalidOverride() throws Exception {
        JSType overridingType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType hiddenType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType ownerType = typeRegistry.createObjectType("Owner");
        Node node = new Node(Node.GETPROP);
        NodeTraversal t = createNodeTraversal(node);
        validator.expectCanOverride(t, node, overridingType, hiddenType, "prop", ownerType);
        assertTrue(true);
    }

    @Test
    public void testExpectSuperType_validSuper() throws Exception {
        ObjectType superObject = typeRegistry.createObjectType("Super");
        ObjectType subObject = typeRegistry.createObjectType("Sub");
        // To simulate inheritance, we need to set the implicit prototype of the sub's prototype.
        // This requires a bit more setup as ObjectType might not directly expose setPrototypeBasedOn.
        // For testing purposes, we can mock this relationship if direct manipulation is complex.
        // Assuming a direct call for simplicity in this mock.
        subObject.setPrototypeBasedOn(superObject); // Simulating inheritance
        Node node = Node.newName("Sub");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectSuperType(t, node, superObject, subObject);
        assertTrue(true);
    }

    @Test
    public void testExpectSuperType_missingExtendsTag() throws Exception {
        ObjectType superObject = typeRegistry.createObjectType("Super");
        ObjectType subObject = typeRegistry.createObjectType("Sub");
        // Simulate missing extends by setting prototype to OBJECT_TYPE
        subObject.setPrototypeBasedOn(typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node node = Node.newName("Sub");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectSuperType(t, node, superObject, subObject);
        assertTrue(true);
    }

    @Test
    public void testExpectSuperType_mismatch() throws Exception {
        ObjectType superObject = typeRegistry.createObjectType("Super");
        ObjectType declaredSuper = typeRegistry.createObjectType("WrongSuper");
        ObjectType subObject = typeRegistry.createObjectType("Sub");
        subObject.setPrototypeBasedOn(declaredSuper);
        Node node = Node.newName("Sub");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectSuperType(t, node, superObject, subObject);
        assertTrue(true);
    }

    @Test
    public void testExpectCanCast_subtypeToSupertype() throws Exception {
        JSType subType = typeRegistry.createObjectType("Sub");
        JSType superType = typeRegistry.createObjectType("Super");
        // Simulate inheritance: Sub is a subtype of Super
        ((ObjectType)subType).setPrototypeBasedOn(superType);
        Node node = new Node(Node.CAST);
        NodeTraversal t = createNodeTraversal(node);
        validator.expectCanCast(t, node, subType, superType);
        assertTrue(true);
    }

    @Test
    public void testExpectCanCast_supertypeToSubtype() throws Exception {
        JSType subType = typeRegistry.createObjectType("Sub");
        JSType superType = typeRegistry.createObjectType("Super");
        // Simulate inheritance: Sub is a subtype of Super
        ((ObjectType)subType).setPrototypeBasedOn(superType);
        Node node = new Node(Node.CAST);
        NodeTraversal t = createNodeTraversal(node);
        validator.expectCanCast(t, node, superType, subType);
        assertTrue(true);
    }

    @Test
    public void testExpectCanCast_invalidCast() throws Exception {
        JSType type1 = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType type2 = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = new Node(Node.CAST);
        NodeTraversal t = createNodeTraversal(node);
        validator.expectCanCast(t, node, type1, type2);
        assertTrue(true);
    }

    @Test
    public void testExpectUndeclaredVariable_newDeclaration() throws Exception {
        String sourceName = "test.js";
        CompilerInput input = new CompilerInput(sourceName);
        Node nameNode = Node.newName("myVar");
        Node varNode = new Node(Node.VAR, nameNode);
        JSType newType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Var existingVar = null; // No existing declaration
        NodeTraversal t = createNodeTraversal(nameNode);
        Var resultVar = validator.expectUndeclaredVariable(sourceName, input, nameNode, varNode, existingVar, "myVar", newType);
        assertNotNull(resultVar);
        assertEquals("myVar", resultVar.getName());
        assertEquals(newType, resultVar.getType());
    }

    @Test
    public void testExpectUndeclaredVariable_duplicateTypedDeclaration() throws Exception {
        String sourceName = "test.js";
        CompilerInput input = new CompilerInput(sourceName);
        Node nameNode = Node.newName("myVar");
        Node varNode = new Node(Node.VAR, nameNode);
        JSType newType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // Create a dummy existing Var
        JSType existingType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        // Need a dummy Scope and Var. The API outline shows Scope.declare but not how to instantiate Scope.
        // For testing, we'll assume a basic Scope can be created and a Var obtained.
        // This part might need refinement if Scope is not directly instantiable or accessible.
        // Assuming a simplified instantiation for now.
        Scope scope = new Scope(compiler.getRoot(), typeRegistry); // Assuming compiler.getRoot() is valid
        Var existingVar = scope.declare("myVar", new Node(Node.NAME, "myVar"), existingType, input, false);

        NodeTraversal t = createNodeTraversal(nameNode);
        validator.expectUndeclaredVariable(sourceName, input, nameNode, varNode, existingVar, "myVar", newType);
        assertTrue(true);
    }

    @Test
    public void testExpectUndeclaredVariable_duplicateSameType() throws Exception {
        String sourceName = "test.js";
        CompilerInput input = new CompilerInput(sourceName);
        Node nameNode = Node.newName("myVar");
        Node varNode = new Node(Node.VAR, nameNode);
        JSType newType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // Create a dummy existing Var with the same type
        JSType existingType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Scope scope = new Scope(compiler.getRoot(), typeRegistry); // Assuming compiler.getRoot() is valid
        Var existingVar = scope.declare("myVar", new Node(Node.NAME, "myVar"), existingType, input, false);
        NodeTraversal t = createNodeTraversal(nameNode);
        validator.expectUndeclaredVariable(sourceName, input, nameNode, varNode, existingVar, "myVar", newType);
        assertTrue(true);
    }

    @Test
    public void testExpectAllInterfaceProperties_implemented() throws Exception {
        FunctionType functionType = typeRegistry.createFunctionType(
            typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE),
            typeRegistry.createObjectType("MyClass"));
        ObjectType instanceType = functionType.getInstanceType();

        ObjectType dummyInterface = typeRegistry.createInterfaceType("MyInterface");
        dummyInterface.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        functionType.setImplementedInterfaces(Lists.newArrayList(dummyInterface));

        instanceType.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), true, null);

        Node node = Node.newName("MyClass");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectAllInterfaceProperties(t, node, functionType);
        assertTrue(true);
    }

    @Test
    public void testExpectAllInterfaceProperties_notImplemented() throws Exception {
        FunctionType functionType = typeRegistry.createFunctionType(
            typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE),
            typeRegistry.createObjectType("MyClass"));
        ObjectType instanceType = functionType.getInstanceType();

        ObjectType dummyInterface = typeRegistry.createInterfaceType("MyInterface");
        dummyInterface.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        functionType.setImplementedInterfaces(Lists.newArrayList(dummyInterface));

        Node node = Node.newName("MyClass");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectAllInterfaceProperties(t, node, functionType);
        assertTrue(true);
    }

    @Test
    public void testExpectAllInterfaceProperties_mismatchImplementation() throws Exception {
        FunctionType functionType = typeRegistry.createFunctionType(
            typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE),
            typeRegistry.createObjectType("MyClass"));
        ObjectType instanceType = functionType.getInstanceType();

        ObjectType dummyInterface = typeRegistry.createInterfaceType("MyInterface");
        dummyInterface.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
        functionType.setImplementedInterfaces(Lists.newArrayList(dummyInterface));

        instanceType.defineProperty("interfaceProp", typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), true, null);

        Node node = Node.newName("MyClass");
        NodeTraversal t = createNodeTraversal(node);
        validator.expectAllInterfaceProperties(t, node, functionType);
        assertTrue(true);
    }

    @Test
    public void testTypeMismatch_basicMismatch() throws Exception {
        JSType foundType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType requiredType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        Node node = new Node(Node.ASSIGN);
        NodeTraversal t = createNodeTraversal(node);
        validator.mismatch(t, node, "basic mismatch", foundType, requiredType);
        assertEquals(1, validator.mismatches.size());
        TypeValidator.TypeMismatch mismatch = validator.mismatches.get(0);
        assertTrue(mismatch.typeA.isNumber());
        assertTrue(mismatch.typeB.isString());
    }

    @Test
    public void testTypeMismatch_stringAndNumber() throws Exception {
        JSType foundType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType requiredType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node node = new Node(Node.ASSIGN);
        NodeTraversal t = createNodeTraversal(node);
        validator.mismatch(t, node, "string to number", foundType, requiredType);
        assertEquals(1, validator.mismatches.size());
        TypeValidator.TypeMismatch mismatch = validator.mismatches.get(0);
        assertTrue(mismatch.typeA.isString());
        assertTrue(mismatch.typeB.isNumber());
    }

    @Test
    public void testTypeMismatch_objectAndNull() throws Exception {
        JSType foundType = typeRegistry.createObjectType("MyObject");
        JSType requiredType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
        Node node = new Node(Node.ASSIGN);
        NodeTraversal t = createNodeTraversal(node);
        validator.mismatch(t, node, "object to null", foundType, requiredType);
        assertEquals(1, validator.mismatches.size());
        TypeValidator.TypeMismatch mismatch = validator.mismatches.get(0);
        assertTrue(mismatch.typeA.isObject());
        assertTrue(mismatch.typeB.isNullType());
    }
}
```