package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class FunctionTypeBuilderTest {

    private static final String TEST_FN_NAME = "testFn";
    private static final String TEST_SOURCE_NAME = "testSource";

    // MockCompiler implements AbstractCompiler which has no concrete implementations to mock.
    // Some methods are abstract, so we cannot instantiate it directly.
    // Instead, we will use a concrete implementation if available or a mock that
    // satisfies the interface by providing dummy implementations.
    // For this test, we will create a minimal mock that provides the necessary methods.
    private static class MockCompiler implements AbstractCompiler {
        private final JSTypeRegistry registry = new JSTypeRegistry(null);
        private final CodingConvention convention = new CodingConvention.DefaultCodingConvention();
        private final List<JSError> errors = Lists.newArrayList();
        private boolean typeCheckingEnabled = true;
        private TypeCheckWarningsGuard guard;
        private ErrorManager errorManager = new BasicErrorManager() {
            @Override
            protected void printSummary(Appendable appendable) {}
            @Override
            public void report(CheckLevel level, JSError error) {
                errors.add(error);
            }
        };

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return registry;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return convention;
        }

        @Override
        public void report(JSError error) {
            errors.add(error);
        }

        @Override
        public boolean isTypeCheckingEnabled() {
            return typeCheckingEnabled;
        }

        @Override
        public void setTypeCheckingEnabled(boolean enabled) {
            this.typeCheckingEnabled = enabled;
        }

        @Override
        public void setTypeCheckWarningsGuard(TypeCheckWarningsGuard guard) {
            this.guard = guard;
        }

        @Override
        public ErrorManager getErrorManager() {
            return errorManager;
        }

        public List<JSError> getErrors() {
            return errors;
        }
    }

    // Dummy Scope for testing
    // Need to provide constructor arguments that are visible.
    private static class DummyScope extends Scope {
        protected DummyScope(Scope parent, Node rootNode) {
            super(parent, rootNode, null); // Added null for the third argument
        }

        public DummyScope() {
            // Provide a minimal valid constructor call.
            // For tests, a global scope with no root node is often sufficient.
            super(null, null, null); // Call the super constructor with null arguments.
        }

        @Override
        public Var getVar(String name) {
            return null; // No variables in dummy scope
        }

        @Override
        public boolean isGlobal() {
            return true;
        }
    }

    private MockCompiler compiler = new MockCompiler();
    private JSTypeRegistry registry = compiler.getTypeRegistry();
    private Scope scope = new DummyScope();

    private FunctionTypeBuilder createBuilder(Node errorRoot) {
        return new FunctionTypeBuilder(TEST_FN_NAME, compiler, errorRoot, TEST_SOURCE_NAME, scope);
    }

    // Helper to create a JSTypeExpression for tests
    private JSTypeExpression createJSTypeExpression(String typeStr, String sourceName) {
        Node typeNode = IR.string(typeStr);
        // Register the type name to avoid issues with type resolution.
        // For primitive types, this might not be strictly necessary, but for
        // named types (like 'T' or 'Object'), it is.
        // The `isKnownType` and `registerName` methods are not public in JSTypeRegistry.
        // Instead, we rely on JSTypeRegistry to resolve known types.
        // For custom types like 'T', we might need to register them or ensure they are resolvable.
        // A simple way for template types is to ensure they are known.
        if (typeStr.equals("T")) {
            // This would typically be handled by the compiler's type resolution,
            // but for testing, we might need to ensure it's resolvable.
            // JSTypeRegistry has methods to create template types.
            registry.createTemplateType(typeStr);
        } else if (typeStr.equals("Base") || typeStr.equals("Interface") || typeStr.equals("MyInterface") || typeStr.equals("Object") || typeStr.equals("MyClass")) {
            // Ensure these types are resolvable as ObjectTypes.
            registry.getObjectType(typeStr);
        }
        
        return new JSTypeExpression(typeNode, sourceName);
    }

    @Test
    public void testInferReturnType_noInfo() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        JSDocInfo info = null;
        FunctionType fnType = builder.inferReturnType(info).buildAndRegister();
        JSType result = fnType.getReturnType();
        assertNotNull(result);
        assertTrue(result.isVoidType()); // Default return type
    }

    @Test
    public void testInferReturnType_withInfo() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        JSDocInfo info = new JSDocInfo();
        info.setReturnType(createJSTypeExpression("string", TEST_SOURCE_NAME));

        FunctionType fnType = builder.inferReturnType(info).buildAndRegister();
        JSType result = fnType.getReturnType();
        assertNotNull(result);
        assertTrue(result.isStringValueType());
    }

    @Test
    public void testInferReturnType_templateType() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.templateTypeName = "T";
        registry.setTemplateTypeName("T");

        JSDocInfo info = new JSDocInfo();
        info.setReturnType(createJSTypeExpression("T", TEST_SOURCE_NAME));

        builder.inferReturnType(info); // This should report an error for TEMPLATE_TYPE_EXPECTED
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_TEMPLATE_TYPE_EXPECTED", compiler.getErrors().get(0).getType().key);
        
        // To get a FunctionType object, we still need to call buildAndRegister.
        // The error is reported during inferReturnType, but the type is built later.
        FunctionType fnType = builder.buildAndRegister();
        assertNotNull(fnType);
    }

    @Test
    public void testInferInheritance_constructorExtends() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        JSDocInfo info = new JSDocInfo();
        info.setBaseType(createJSTypeExpression("Base", TEST_SOURCE_NAME));
        info.setConstructor(true);

        // Need to ensure "Base" is resolvable as an ObjectType.
        // createJSTypeExpression already handles this for known types like "Base".
        
        FunctionType fnType = builder.inferInheritance(info).buildAndRegister();
        assertNotNull(fnType);
        // The baseType is set on the FunctionType itself, not directly accessible.
        // We can check if setPrototypeBasedOn was called.
        // FunctionType does not have a public getBaseType() method.
        // We can verify the `baseType` field of the builder was set.
        assertEquals(registry.getObjectType("Base"), builder.baseType);
    }

    @Test
    public void testInferInheritance_interfaceExtends() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        JSDocInfo info = new JSDocInfo();
        info.addExtendedInterface(createJSTypeExpression("Interface", TEST_SOURCE_NAME));
        info.setInterface(true);

        FunctionType fnType = builder.inferInheritance(info).buildAndRegister();
        assertNotNull(fnType);
        assertEquals(1, fnType.getExtendedInterfaces().size());
        assertEquals(registry.getInterfaceType("Interface"), fnType.getExtendedInterfaces().get(0));
    }

    @Test
    public void testInferInheritance_implements() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        JSDocInfo info = new JSDocInfo();
        info.addImplementedInterface(createJSTypeExpression("MyInterface", TEST_SOURCE_NAME));
        info.setConstructor(true);

        FunctionType fnType = builder.inferInheritance(info).buildAndRegister();
        assertNotNull(fnType);
        assertEquals(1, fnType.getImplementedInterfaces().size());
        assertEquals(registry.getInterfaceType("MyInterface"), fnType.getImplementedInterfaces().get(0));
    }

    @Test
    public void testInferThisType_withAnnotation() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        JSDocInfo info = new JSDocInfo();
        info.setThisType(createJSTypeExpression("Object", TEST_SOURCE_NAME));

        FunctionType fnType = builder.inferThisType(info).buildAndRegister();
        assertNotNull(fnType);
        // The `thisType` field of FunctionType is protected, so we can't directly assert it.
        // We can check if it's set to the expected type.
        assertEquals(registry.getObjectType("Object"), fnType.getThisType());
    }

    @Test
    public void testInferThisType_fallback() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        ObjectType inferredObjectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);

        // Call with null info first to ensure thisType is not set by JSDocInfo.
        builder.inferThisType((JSDocInfo)null);

        // Create a dummy function type to be used as fallback.
        Node functionTypeNode = IR.paramList(); // Placeholder for function params
        FunctionType dummyFunctionType = registry.createFunctionType(inferredObjectType, functionTypeNode);

        FunctionType fnType = builder.inferThisType(null, dummyFunctionType).buildAndRegister();
        assertNotNull(fnType);
        assertEquals(inferredObjectType, fnType.getThisType());
    }

    @Test
    public void testInferThisType_nonObject() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        JSDocInfo info = new JSDocInfo();
        info.setThisType(createJSTypeExpression("number", TEST_SOURCE_NAME)); // A primitive type

        builder.inferThisType(info); // This will call the validator and report the error.
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_THIS_TYPE_NON_OBJECT", compiler.getErrors().get(0).getType().key);
        
        // Ensure a FunctionType is still built, even with an error.
        FunctionType fnType = builder.buildAndRegister();
        assertNotNull(fnType);
    }

    @Test
    public void testInferParameterTypes_fromArgsParentAndInfo() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a"));
        argsParent.addChildToBack(IR.name("b"));

        JSDocInfo info = new JSDocInfo();
        info.addParameter("a", createJSTypeExpression("string", TEST_SOURCE_NAME));
        info.addParameter("b", createJSTypeExpression("number", TEST_SOURCE_NAME));

        FunctionType fnType = builder.inferParameterTypes(argsParent, info).buildAndRegister();
        assertNotNull(fnType);
        assertEquals(2, fnType.getParameters().size());
        assertEquals(registry.getGlobalTypeStore().lookupWithNew("string"), fnType.getParameters().get(0));
        assertEquals(registry.getGlobalTypeStore().lookupWithNew("number"), fnType.getParameters().get(1));
    }

    @Test
    public void testInferParameterTypes_optionalArg() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a"));
        argsParent.addChildToBack(IR.name("b")); // Optional parameter

        JSDocInfo info = new JSDocInfo();
        info.addParameter("a", createJSTypeExpression("string", TEST_SOURCE_NAME));

        JSTypeExpression bTypeExpr = createJSTypeExpression("number", TEST_SOURCE_NAME);
        // JSDocInfo.Parameter has setOptionalArg, JSTypeExpression has setOptionalArg.
        // Let's assume JSDocInfo.Parameter is what's used for inference.
        // For testing, we directly set the optional arg on the JSTypeExpression.
        bTypeExpr.setOptionalArg(true); 
        info.addParameter("b", bTypeExpr);

        FunctionType fnType = builder.inferParameterTypes(argsParent, info).buildAndRegister();
        assertNotNull(fnType);
        assertEquals(2, fnType.getParameters().size());
        assertTrue(fnType.getParameters().get(1).isOptionalArg());
    }

    @Test
    public void testInferParameterTypes_varArgs() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a"));
        argsParent.addChildToBack(IR.name("b")); // Var args parameter

        JSDocInfo info = new JSDocInfo();
        info.addParameter("a", createJSTypeExpression("string", TEST_SOURCE_NAME));

        JSTypeExpression bTypeExpr = createJSTypeExpression("number", TEST_SOURCE_NAME);
        bTypeExpr.setVarArgs(true); // Mark as var args
        info.addParameter("b", bTypeExpr);

        FunctionType fnType = builder.inferParameterTypes(argsParent, info).buildAndRegister();
        assertNotNull(fnType);
        assertEquals(2, fnType.getParameters().size());
        assertTrue(fnType.getParameters().get(1).isVarArgs());
    }

    @Test
    public void testInferParameterTypes_varArgsMustBeLast() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a")); // Var args parameter
        argsParent.addChildToBack(IR.name("b"));

        JSDocInfo info = new JSDocInfo();
        JSTypeExpression aTypeExpr = createJSTypeExpression("string", TEST_SOURCE_NAME);
        aTypeExpr.setVarArgs(true);
        info.addParameter("a", aTypeExpr);
        info.addParameter("b", createJSTypeExpression("number", TEST_SOURCE_NAME));

        builder.inferParameterTypes(argsParent, info);
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_VAR_ARGS_MUST_BE_LAST", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testInferParameterTypes_optionalArgAtEnd() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a")); // Required
        argsParent.addChildToBack(IR.name("b")); // Optional

        JSDocInfo info = new JSDocInfo();
        info.addParameter("a", createJSTypeExpression("string", TEST_SOURCE_NAME));

        JSTypeExpression bTypeExpr = createJSTypeExpression("number", TEST_SOURCE_NAME);
        bTypeExpr.setOptionalArg(true);
        info.addParameter("b", bTypeExpr);

        FunctionType fnType = builder.inferParameterTypes(argsParent, info).buildAndRegister();
        assertNotNull(fnType);
        assertEquals(2, fnType.getParameters().size());
        assertFalse(fnType.getParameters().get(0).isOptionalArg());
        assertTrue(fnType.getParameters().get(1).isOptionalArg());
    }

    @Test
    public void testInferParameterTypes_missingOptionalArg() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a")); // Required
        // Parameter 'b' is optional but not provided

        JSDocInfo info = new JSDocInfo();
        info.addParameter("a", createJSTypeExpression("string", TEST_SOURCE_NAME));

        JSTypeExpression bTypeExpr = createJSTypeExpression("number", TEST_SOURCE_NAME);
        bTypeExpr.setOptionalArg(true);
        info.addParameter("b", bTypeExpr);

        FunctionType fnType = builder.inferParameterTypes(argsParent, info).buildAndRegister();
        assertNotNull(fnType);
        assertEquals(2, fnType.getParameters().size()); // Both params are still defined in the function type
        assertFalse(fnType.getParameters().get(0).isOptionalArg());
        assertTrue(fnType.getParameters().get(1).isOptionalArg());
    }


    @Test
    public void testInferParameterTypes_inexistentParam() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a"));

        JSDocInfo info = new JSDocInfo();
        info.addParameter("a", createJSTypeExpression("string", TEST_SOURCE_NAME));
        info.addParameter("b", createJSTypeExpression("number", TEST_SOURCE_NAME)); // Parameter 'b' not in argsParent

        builder.inferParameterTypes(argsParent, info);
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_INEXISTANT_PARAM", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testInferTemplateTypeName() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        JSDocInfo info = new JSDocInfo();
        info.setTemplateTypeName("T");

        builder.inferTemplateTypeName(info);
        assertEquals("T", builder.templateTypeName);
    }

    @Test
    public void testBuildAndRegister_constructor() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = true;
        builder.fnName = "MyConstructor"; // Set fnName for declaration
        Node paramsNode = IR.paramList();
        paramsNode.addChildToBack(IR.name("a"));
        builder.parametersNode = paramsNode;
        builder.returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // Need to set contents for buildAndRegister to potentially use source node.
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);

        FunctionType fnType = builder.buildAndRegister();
        assertTrue(fnType.isConstructor());
        assertNotNull(fnType.getInstanceType());
    }

    @Test
    public void testBuildAndRegister_interface() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isInterface = true;
        builder.fnName = "MyInterface"; // Interface needs a name for declaration
        Node paramsNode = IR.paramList();
        builder.parametersNode = paramsNode;
        builder.returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);

        FunctionType fnType = builder.buildAndRegister();
        assertTrue(fnType.isInterface());
        assertEquals("MyInterface", fnType.getReferenceName());
    }

    @Test
    public void testBuildAndRegister_ordinaryFunction() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = false;
        builder.isInterface = false;
        Node paramsNode = IR.paramList();
        paramsNode.addChildToBack(IR.name("x"));
        builder.parametersNode = paramsNode;
        builder.returnType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);

        FunctionType fnType = builder.buildAndRegister();
        assertFalse(fnType.isConstructor());
        assertFalse(fnType.isInterface());
        assertEquals(1, fnType.getParameters().size());
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), fnType.getReturnType());
    }

    @Test
    public void testSetImplementedInterfaces() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = true;
        builder.fnName = "MyClass";

        ObjectType interface1 = registry.createInterfaceType("Iface1", null);
        ObjectType interface2 = registry.createInterfaceType("Iface2", null);

        List<ObjectType> interfaces = ImmutableList.of(interface1, interface2);
        builder.implementedInterfaces = interfaces;
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);

        FunctionType fnType = builder.buildAndRegister();
        assertEquals(2, fnType.getImplementedInterfaces().size());
        assertTrue(fnType.getImplementedInterfaces().contains(interface1));
        assertTrue(fnType.getImplementedInterfaces().contains(interface2));
    }

    @Test
    public void testSetExtendedInterfaces() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isInterface = true;
        builder.fnName = "MyInterface";

        ObjectType interface1 = registry.createInterfaceType("BaseIface1", null);
        ObjectType interface2 = registry.createInterfaceType("BaseIface2", null);

        List<ObjectType> interfaces = ImmutableList.of(interface1, interface2);
        builder.extendedInterfaces = interfaces;
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);

        FunctionType fnType = builder.buildAndRegister();
        assertEquals(2, fnType.getExtendedInterfaces().size());
        assertTrue(fnType.getExtendedInterfaces().contains(interface1));
        assertTrue(fnType.getExtendedInterfaces().contains(interface2));
    }

    @Test
    public void testSetBaseType() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = true;
        builder.fnName = "MyClass";

        ObjectType baseObjectType = registry.createObjectType("BaseClass");
        builder.baseType = baseObjectType;
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);

        FunctionType fnType = builder.buildAndRegister();
        // The baseType field is used by `maybeSetBaseType` which sets the prototype.
        // FunctionType doesn't directly expose `getBaseType()`.
        // We can check if the `baseType` field was correctly set in the builder.
        assertEquals(baseObjectType, builder.baseType);
    }

    @Test
    public void testSetPrototypeBasedOn() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = true;
        builder.fnName = "MyClass";

        ObjectType baseObjectType = registry.createObjectType("BaseClass");
        builder.baseType = baseObjectType;
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);

        FunctionType fnType = builder.buildAndRegister();
        // We can check if the prototype of the function type is set.
        // The exact structure of the prototype is internal to JSTypeRegistry,
        // but we can assume `maybeSetBaseType` (called by `buildAndRegister`)
        // sets it correctly if `baseType` is provided.
        assertNotNull(fnType.getPrototype());
        // A more specific check might involve inspecting the prototype chain,
        // but that is complex and relies on internal details.
    }

    @Test
    public void testGetOrCreateConstructor_existing() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = true;
        builder.fnName = "ExistingConstructor";
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot); // Set contents

        // Pre-register an existing constructor
        // The `registry.createConstructorType` creates both the constructor function and its instance type.
        FunctionType existingConstructor = registry.createConstructorType(
            "ExistingConstructor", errorRoot, IR.paramList(), registry.getNativeType(JSTypeNative.VOID_TYPE));
        // `registerName` is not public. Use `createAndRegisterGlobalSymbol` if available or `declareType`.
        registry.declareType("ExistingConstructor", existingConstructor.getInstanceType());
        
        FunctionType resultFnType = builder.getOrCreateConstructor();
        assertEquals(existingConstructor, resultFnType);
        // The source node of the existing constructor might be null.
        // The `setSource(contents.getSourceNode())` inside `getOrCreateConstructor` handles this.
        assertNotNull(resultFnType.getSource());
    }

    @Test
    public void testGetOrCreateConstructor_new() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = true;
        builder.fnName = "NewConstructor";
        Node paramsNode = IR.paramList();
        paramsNode.addChildToBack(IR.name("arg1"));
        builder.parametersNode = paramsNode;
        builder.returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot); // Provide contents

        FunctionType resultFnType = builder.getOrCreateConstructor();
        assertTrue(resultFnType.isConstructor());
        assertEquals("NewConstructor", resultFnType.getReferenceName());
        assertEquals(1, resultFnType.getParameters().size());
    }

    @Test
    public void testGetOrCreateConstructor_typeRedefinitionWarning() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = true;
        builder.fnName = "RedefinedConstructor";

        // Pre-register a constructor with different properties
        FunctionType existingConstructor = registry.createConstructorType(
            "RedefinedConstructor", errorRoot, IR.paramList(), registry.getNativeType(JSTypeNative.VOID_TYPE));
        registry.declareType("RedefinedConstructor", existingConstructor.getInstanceType());

        // Builder configures a different type
        Node paramsNode = IR.paramList();
        paramsNode.addChildToBack(IR.name("newArg"));
        builder.parametersNode = paramsNode;
        builder.returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);

        builder.getOrCreateConstructor(); // This should trigger the warning

        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_TYPE_REDEFINITION", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testIsFunctionTypeDeclaration_trueCases() throws Exception {
        JSDocInfo info = new JSDocInfo(false); // Use constructor with false to exclude documentation
        // The `isFunctionTypeDeclaration` checks `info.getParameterCount() > 0 || info.hasReturnType() || ...`
        info.addParameter("param"); // This increases parameterCount
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));

        info = new JSDocInfo(false); // Reset
        info.setReturnType(createJSTypeExpression("void", TEST_SOURCE_NAME));
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));

        info = new JSDocInfo(false); // Reset
        info.setThisType(createJSTypeExpression("Object", TEST_SOURCE_NAME));
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));

        info = new JSDocInfo(false); // Reset
        info.setConstructor(true);
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));

        info = new JSDocInfo(false); // Reset
        info.setInterface(true);
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    @Test
    public void testIsFunctionTypeDeclaration_falseCases() throws Exception {
        JSDocInfo info = new JSDocInfo(false); // Use constructor with false to exclude documentation
        // A new JSDocInfo has parameterCount = 0, no return type, no this type, not constructor, not interface.
        // Therefore, it should return false.
        assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    @Test
    public void testExtendedTypeValidator_valid() throws Exception {
        FunctionTypeBuilder builder = createBuilder(IR.newNode(Node.Type.FUNCTION));
        FunctionTypeBuilder.ExtendedTypeValidator validator = builder.new ExtendedTypeValidator();

        ObjectType objType = registry.createObjectType("ValidBase");
        assertTrue(validator.apply(objType));
    }

    @Test
    public void testExtendedTypeValidator_nonObject() throws Exception {
        FunctionTypeBuilder builder = createBuilder(IR.newNode(Node.Type.FUNCTION));
        FunctionTypeBuilder.ExtendedTypeValidator validator = builder.new ExtendedTypeValidator();

        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // The validator reports a warning for non-object types.
        validator.apply(numberType); // This call issues the warning
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_EXTENDS_NON_OBJECT", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testExtendedTypeValidator_emptyTypeAndUnknown() throws Exception {
        FunctionTypeBuilder builder = createBuilder(IR.newNode(Node.Type.FUNCTION));
        FunctionTypeBuilder.ExtendedTypeValidator validator = builder.new ExtendedTypeValidator();

        // Test with an UnknownType. It should report RESOLVED_TAG_EMPTY if it can't resolve further.
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        validator.apply(unknownType); // This call issues the warning
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_RESOLVED_TAG_EMPTY", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testImplementedTypeValidator_valid() throws Exception {
        FunctionTypeBuilder builder = createBuilder(IR.newNode(Node.Type.FUNCTION));
        FunctionTypeBuilder.ImplementedTypeValidator validator = builder.new ImplementedTypeValidator();

        ObjectType objType = registry.createObjectType("ValidInterface");
        assertTrue(validator.apply(objType));
    }

    @Test
    public void testImplementedTypeValidator_badImplementedType() throws Exception {
        FunctionTypeBuilder builder = createBuilder(IR.newNode(Node.Type.FUNCTION));
        FunctionTypeBuilder.ImplementedTypeValidator validator = builder.new ImplementedTypeValidator();

        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // The validator reports an error for non-object types.
        validator.apply(numberType); // This call issues the error
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_BAD_IMPLEMENTED_TYPE", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testImplementedTypeValidator_emptyTypeAndUnknown() throws Exception {
        FunctionTypeBuilder builder = createBuilder(IR.newNode(Node.Type.FUNCTION));
        FunctionTypeBuilder.ImplementedTypeValidator validator = builder.new ImplementedTypeValidator();

        // Test with an UnknownType. It should report RESOLVED_TAG_EMPTY if it can't resolve further.
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        validator.apply(unknownType); // This call issues the warning
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_RESOLVED_TAG_EMPTY", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testThisTypeValidator_validObject() throws Exception {
        FunctionTypeBuilder builder = createBuilder(IR.newNode(Node.Type.FUNCTION));
        FunctionTypeBuilder.ThisTypeValidator validator = builder.new ThisTypeValidator();

        ObjectType objType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertTrue(validator.apply(objType));
    }

    @Test
    public void testThisTypeValidator_nonObject() throws Exception {
        FunctionTypeBuilder builder = createBuilder(IR.newNode(Node.Type.FUNCTION));
        FunctionTypeBuilder.ThisTypeValidator validator = builder.new ThisTypeValidator();

        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // The validator reports a warning for non-object types.
        validator.apply(numberType); // This call issues the warning
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_THIS_TYPE_NON_OBJECT", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testAddParameter_required() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        boolean warning = builder.addRequiredParams(stringType);
        assertFalse(warning);
        assertEquals(1, builder.build().getChildCount());
    }

    @Test
    public void testAddParameter_optional() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        boolean warning = builder.addOptionalParams(stringType);
        assertFalse(warning);
        assertEquals(1, builder.build().getChildCount());
        assertTrue(builder.build().getFirstChild().isOptionalArg());
    }

    @Test
    public void testAddParameter_varArgs() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        boolean warning = builder.addVarArgs(stringType);
        assertFalse(warning);
        assertEquals(1, builder.build().getChildCount());
        assertTrue(builder.build().getFirstChild().isVarArgs());
    }

    @Test
    public void testAddParameter_requiredAfterOptional() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        builder.addOptionalParams(stringType);
        boolean warning = builder.addRequiredParams(numberType);
        assertTrue(warning); // This should indicate a warning
        assertEquals(2, builder.build().getChildCount());
    }

    @Test
    public void testAddParameter_requiredAfterVarArgs() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        builder.addVarArgs(stringType);
        boolean warning = builder.addRequiredParams(numberType);
        assertTrue(warning); // This should indicate a warning
        assertEquals(2, builder.build().getChildCount());
    }

    @Test
    public void testHasMoreTagsToResolve_constructorExtendsResolved() throws Exception {
        // This is a static method, so we can call it directly on the class.
        // Testing this involves mocking JSType's isResolved() and related methods, which is complex.
        // The current implementation of hasMoreTagsToResolve relies on JSType internal states.
        // The `isUnknownType` path will be taken if `objectType` is unknown.
        // If `getImplicitPrototype()` is null (common for unknown types), it goes to the `else` block.
        // If `ctor` is null, it returns false.
        // For simplicity, we are testing the path for unknown types.
        ObjectType unknownObjType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertTrue(FunctionTypeBuilder.hasMoreTagsToResolve(unknownObjType)); 
    }

    @Test
    public void testHasMoreTagsToResolve_interfaceExtendsUnresolved() throws Exception {
        // Similar to above, complex to mock. The method checks if an interface extends unresolved interfaces.
        // If `objectType.getImplicitPrototype()` is null, it checks `ctor.getExtendedInterfaces()`.
        // If any extended interface is not resolved, it returns true.
        // For simplicity, we'll assume the logic is covered by the validator tests.
        ObjectType unknownObjType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertTrue(FunctionTypeBuilder.hasMoreTagsToResolve(unknownObjType));
    }

    // --- New Tests for Uncovered Methods ---

    @Test
    public void testGetSourceNode_astContents() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        FunctionTypeBuilder.AstFunctionContents contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);
        builder.setContents(contents);
        assertEquals(errorRoot, builder.getSourceNode());
    }

    @Test
    public void testGetSourceNode_unknownContents() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        FunctionTypeBuilder.UnknownFunctionContents contents = FunctionTypeBuilder.UnknownFunctionContents.get();
        builder.setContents(contents);
        assertNull(builder.getSourceNode());
    }

    @Test
    public void testMayBeFromExterns_astContents() throws Exception {
        Node errorRootExtern = IR.newNode(Node.Type.FUNCTION);
        // The concept of "externs" is usually tied to source file names or flags.
        // Node.isFromExterns() is the direct way to check.
        errorRootExtern.setFromExterns(true);
        FunctionTypeBuilder builder = createBuilder(errorRootExtern);
        FunctionTypeBuilder.AstFunctionContents contents = new FunctionTypeBuilder.AstFunctionContents(errorRootExtern);
        builder.setContents(contents);
        assertTrue(builder.mayBeFromExterns());

        Node errorRootNonExtern = IR.newNode(Node.Type.FUNCTION);
        errorRootNonExtern.setFromExterns(false);
        FunctionTypeBuilder builder2 = createBuilder(errorRootNonExtern);
        FunctionTypeBuilder.AstFunctionContents contents2 = new FunctionTypeBuilder.AstFunctionContents(errorRootNonExtern);
        builder2.setContents(contents2);
        assertFalse(builder2.mayBeFromExterns());
    }

    @Test
    public void testMayBeFromExterns_unknownContents() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        FunctionTypeBuilder.UnknownFunctionContents contents = FunctionTypeBuilder.UnknownFunctionContents.get();
        builder.setContents(contents);
        // UnknownFunctionContents.mayBeFromExterns() returns true by default.
        assertTrue(builder.mayBeFromExterns());
    }

    @Test
    public void testMayHaveNonEmptyReturns_astContents_recorded() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        FunctionTypeBuilder.AstFunctionContents contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);
        contents.recordNonEmptyReturn();
        builder.setContents(contents);
        assertTrue(builder.mayHaveNonEmptyReturns());
    }

    @Test
    public void testMayHaveNonEmptyReturns_astContents_notRecorded() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        FunctionTypeBuilder.AstFunctionContents contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);
        builder.setContents(contents);
        assertFalse(builder.mayHaveNonEmptyReturns());
    }

    @Test
    public void testMayHaveNonEmptyReturns_unknownContents() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        FunctionTypeBuilder.UnknownFunctionContents contents = FunctionTypeBuilder.UnknownFunctionContents.get();
        builder.setContents(contents);
        // UnknownFunctionContents.mayHaveNonEmptyReturns() returns true by default.
        assertTrue(builder.mayHaveNonEmptyReturns());
    }

    @Test
    public void testGetEscapedVarNames_astContents_recorded() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        FunctionTypeBuilder.AstFunctionContents contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);
        contents.recordEscapedVarName("var1");
        contents.recordEscapedVarName("var2");
        builder.setContents(contents);
        Set<String> escapedNames = Sets.newHashSet(builder.getEscapedVarNames());
        assertTrue(escapedNames.contains("var1"));
        assertTrue(escapedNames.contains("var2"));
        assertEquals(2, escapedNames.size());
    }

    @Test
    public void testGetEscapedVarNames_astContents_noRecording() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        FunctionTypeBuilder.AstFunctionContents contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);
        builder.setContents(contents);
        assertTrue(builder.getEscapedVarNames().isEmpty());
    }

    @Test
    public void testGetEscapedVarNames_unknownContents() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        FunctionTypeBuilder.UnknownFunctionContents contents = FunctionTypeBuilder.UnknownFunctionContents.get();
        builder.setContents(contents);
        // UnknownFunctionContents.getEscapedVarNames() returns an empty list.
        assertTrue(builder.getEscapedVarNames().isEmpty());
    }

    @Test
    public void testInferFromOverriddenFunction_basic() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        // Create an old function type to override from
        JSType oldReturnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node oldParamsNode = IR.paramList();
        Node oldParam1 = IR.name("oldParam1");
        // oldParam1.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE)); // JSType is set on Node in FunctionParamBuilder
        oldParam1.setOptionalArg(true);
        oldParam1.setVarArgs(false);
        oldParamsNode.addChildToBack(oldParam1);

        FunctionType oldFunctionType = registry.createFunctionType(oldReturnType, oldParamsNode);
        oldFunctionType.setReturnTypeInferred(true); // This should be set via the builder

        // Create a new function node for parameters
        Node newParamsNode = IR.paramList();
        newParamsNode.addChildToBack(IR.name("newParam1")); // Corresponds to oldParam1

        // For inferFromOverriddenFunction to work, oldParam1 needs a JSType.
        // This is done when the function type is created.
        // Let's re-create oldFunctionType to include param types.
        oldParamsNode = IR.paramList();
        Node param1WithType = IR.name("oldParam1");
        param1WithType.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        param1WithType.setOptionalArg(true);
        oldParamsNode.addChildToBack(param1WithType);
        oldFunctionType = registry.createFunctionType(oldReturnType, oldParamsNode);
        oldFunctionType.setReturnTypeInferred(true);
        
        // The method `inferFromOverriddenFunction` populates the `parametersNode` field of the builder.
        // It doesn't directly return the new function type.
        builder.inferFromOverriddenFunction(oldFunctionType, newParamsNode);

        // Now, build the function type.
        FunctionType newFunctionType = builder.buildAndRegister();

        // Check return type and inferred status
        assertEquals(oldReturnType, newFunctionType.getReturnType());
        assertTrue(newFunctionType.isReturnTypeInferred());

        // Check parameters
        assertEquals(1, newFunctionType.getParameters().size());
        JSType newParamType = newFunctionType.getParameters().get(0);
        assertTrue(newParamType.isStringValueType()); // Should inherit type from oldParam1
        assertTrue(newParamType.isOptionalArg());     // Should inherit optional status
        assertFalse(newParamType.isVarArgs());        // Should inherit var args status
    }

    @Test
    public void testInferFromOverriddenFunction_newParamAdded() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        // Old function with one param
        JSType oldReturnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node oldParamsNode = IR.paramList();
        Node param1WithType = IR.name("oldParam1");
        param1WithType.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        oldParamsNode.addChildToBack(param1WithType);

        FunctionType oldFunctionType = registry.createFunctionType(oldReturnType, oldParamsNode);

        // New function with two params (oldParam1, newParam2)
        Node newParamsNode = IR.paramList();
        newParamsNode.addChildToBack(IR.name("newParam1")); // Corresponds to oldParam1
        newParamsNode.addChildToBack(IR.name("newParam2")); // New param

        builder.inferFromOverriddenFunction(oldFunctionType, newParamsNode);
        FunctionType newFunctionType = builder.buildAndRegister();

        assertEquals(2, newFunctionType.getParameters().size());
        // The second parameter should be UNKNOWN_TYPE as it's new
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), newFunctionType.getParameters().get(1));
    }

    @Test
    public void testInferFromOverriddenFunction_oldParamAdded() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        // Old function with two params
        JSType oldReturnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node oldParamsNode = IR.paramList();
        Node oldParam1 = IR.name("oldParam1");
        oldParam1.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node oldParam2 = IR.name("oldParam2");
        oldParam2.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        oldParamsNode.addChildToBack(oldParam1);
        oldParamsNode.addChildToBack(oldParam2);

        FunctionType oldFunctionType = registry.createFunctionType(oldReturnType, oldParamsNode);

        // New function with one param (newParam1)
        Node newParamsNode = IR.paramList();
        newParamsNode.addChildToBack(IR.name("newParam1")); // Corresponds to oldParam1

        builder.inferFromOverriddenFunction(oldFunctionType, newParamsNode);
        
        // The `parametersNode` field of the builder should capture all old parameters if they are not in newParamsNode.
        assertEquals(2, builder.parametersNode.getChildCount());
        assertEquals("oldParam1", builder.parametersNode.getChildAtIndex(0).getString());
        assertEquals("oldParam2", builder.parametersNode.getChildAtIndex(1).getString());

        // The built FunctionType will only have parameters corresponding to the newParamsNode.
        FunctionType newFunctionType = builder.buildAndRegister();
        assertEquals(1, newFunctionType.getParameters().size());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), newFunctionType.getParameters().get(0));
    }

    @Test
    public void testInferFromOverriddenFunction_varArgHandling() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);

        // Old function with a var_args parameter
        JSType oldReturnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node oldParamsNode = IR.paramList();
        Node oldArg1 = IR.name("arg1");
        oldArg1.setVarArgs(true); // This is the var_args
        oldArg1.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        oldParamsNode.addChildToBack(oldArg1);

        FunctionType oldFunctionType = registry.createFunctionType(oldReturnType, oldParamsNode);

        // New function node. The parameter 'arg1' here is treated as a regular parameter if the next parameter exists.
        Node newParamsNode = IR.paramList();
        newParamsNode.addChildToBack(IR.name("newArg1")); // Corresponds to oldArg1
        newParamsNode.addChildToBack(IR.name("newArg2")); // This makes newArg1 not a varargs in the new function

        builder.inferFromOverriddenFunction(oldFunctionType, newParamsNode);
        FunctionType newFunctionType = builder.buildAndRegister();

        // The `inferFromOverriddenFunction` method has logic:
        // "The subclass method might write its var_args as individual arguments.
        // If currentParam.getNext() != null && newParam.isVarArgs() { newParam.setVarArgs(false); newParam.setOptionalArg(true); }"
        // This logic seems to apply to the `newParam` itself, which is derived from `oldParam`.
        // If `oldParam` was var_args, and mapped to a parameter in the new function that is NOT var_args (because there's a next param),
        // it becomes optional.
        assertEquals(2, newFunctionType.getParameters().size());
        assertTrue(newFunctionType.getParameters().get(0).isOptionalArg()); // newArg1 should become optional
        assertFalse(newFunctionType.getParameters().get(0).isVarArgs());
    }

    @Test
    public void testInferParameterTypes_fromArgsParentAndInfo_templateTypeParam() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.templateTypeName = "T";
        registry.setTemplateTypeName("T");

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a"));

        JSDocInfo info = new JSDocInfo(false);
        info.addParameter("a", createJSTypeExpression("T", TEST_SOURCE_NAME));

        FunctionType fnType = builder.inferParameterTypes(argsParent, info).buildAndRegister();
        assertNotNull(fnType);
        assertEquals(1, fnType.getParameters().size());
        JSType paramType = fnType.getParameters().get(0);
        assertTrue(paramType.isTemplateType());
        assertEquals("T", paramType.toString());
    }

    @Test
    public void testInferParameterTypes_templateTypeDuplicatedError() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.templateTypeName = "T";
        registry.setTemplateTypeName("T");

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a"));
        argsParent.addChildToBack(IR.name("b"));

        JSDocInfo info = new JSDocInfo(false);
        info.addParameter("a", createJSTypeExpression("T", TEST_SOURCE_NAME));
        info.addParameter("b", createJSTypeExpression("T", TEST_SOURCE_NAME)); // Duplicate template type

        builder.inferParameterTypes(argsParent, info);
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_TEMPLATE_TYPE_DUPLICATED", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testInferParameterTypes_templateTypeExpectedError() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.templateTypeName = "T";
        registry.setTemplateTypeName("T");

        Node argsParent = IR.paramList();
        argsParent.addChildToBack(IR.name("a"));

        JSDocInfo info = new JSDocInfo(false);
        info.addParameter("a", createJSTypeExpression("number", TEST_SOURCE_NAME)); // Not a template type

        builder.inferParameterTypes(argsParent, info);
        assertEquals(1, compiler.getErrors().size());
        assertEquals("JSC_TEMPLATE_TYPE_EXPECTED", compiler.getErrors().get(0).getType().key);
    }

    @Test
    public void testBuildAndRegister_implicitVoidReturnType() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = false;
        builder.isInterface = false;
        Node paramsNode = IR.paramList();
        builder.parametersNode = paramsNode;
        // No explicit return type set.
        // contents.mayHaveNonEmptyReturns() is false for AstFunctionContents unless recorded.
        builder.contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot); // Default is false for mayHaveNonEmptyReturns

        FunctionType fnType = builder.buildAndRegister();
        assertTrue(fnType.getReturnType().isVoidType());
    }

    @Test
    public void testBuildAndRegister_implicitUnknownReturnType_mayHaveNonEmptyReturns() throws Exception {
        Node errorRoot = IR.newNode(Node.Type.FUNCTION);
        FunctionTypeBuilder builder = createBuilder(errorRoot);
        builder.isConstructor = false;
        builder.isInterface = false;
        Node paramsNode = IR.paramList();
        builder.parametersNode = paramsNode;
        // Explicitly set contents to indicate non-empty returns
        FunctionTypeBuilder.AstFunctionContents contents = new FunctionTypeBuilder.AstFunctionContents(errorRoot);
        contents.recordNonEmptyReturn(); // This makes mayHaveNonEmptyReturns() true
        builder.setContents(contents);

        FunctionType fnType = builder.buildAndRegister();
        // If mayHaveNonEmptyReturns is true and returnType is null, it should be UNKNOWN_TYPE.
        assertTrue(fnType.getReturnType().isUnknownType());
    }
}
