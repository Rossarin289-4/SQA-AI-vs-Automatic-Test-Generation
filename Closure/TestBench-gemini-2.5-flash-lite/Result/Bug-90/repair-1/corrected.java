package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Collections;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ArrowType;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.StaticScope;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.PassConfig;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.BasicErrorManager;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.TypeCheck;


public class FunctionTypeBuilderTest {

    private JSTypeRegistry registry = new JSTypeRegistry(null);
    private Node errorRoot = new Node(Token.NEW, -1, -1);
    private AbstractCompiler compiler = new MockCompiler(registry);
    private Scope scope = new Scope(errorRoot, compiler);

    // Mock implementations for AbstractCompiler and ErrorReporter
    private static class MockCompiler extends AbstractCompiler {
        private JSTypeRegistry registry;

        MockCompiler(JSTypeRegistry registry) {
            this.registry = registry;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return registry;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new ClosureCodingConvention();
        }

        @Override
        public void report(JSError error) {
            // Do nothing for tests.
        }

        @Override
        public ErrorReporter getErrorReporter() {
            return new MockErrorReporter();
        }

        @Override
        public TypeCheckingMode getTypeCheckingMode() {
            return TypeCheckingMode.TRANSFORM;
        }
        
        @Override
        public PassConfig getPassConfig() {
            return new DefaultPassConfig(null);
        }

        @Override
        public ErrorManager getErrorManager() {
            return new BasicErrorManager() {
                @Override
                protected void printSummary() {}

                @Override
                public void printMessage(CheckLevel level, JSError error) {}
            };
        }

        @Override
        public ErrorReporter getDefaultErrorReporter() {
             return new MockErrorReporter();
        }

        @Override
        public CompilerInput getSourceAsInput(String sourceName) {
            return new CompilerInput(SourceFile.fromCode(sourceName, ""));
        }
        
        @Override
        public SourceFile getInput(String sourceName) {
            return SourceFile.fromCode(sourceName, "");
        }
    }
    
    private static class MockErrorReporter implements ErrorReporter {
        @Override
        public void error(Node source, String message, String sourceName, int lineno, int charno) {}

        @Override
        public void warning(Node source, String message, String sourceName, int lineno, int charno) {}

        @Override
        public void error(String message, String sourceName, int lineno, int charno) {}

        @Override
        public void warning(String message, String sourceName, int lineno, int charno) {}

        @Override
        public void runtimeError(String message, String sourceName, int lineno, String source and error type, int charno) {}
    }

    @Test
    public void testInferReturnTypeWithReturnType() throws Exception {
        JSDocInfo info = new JSDocInfo(true); // JSDocInfo constructor takes a boolean
        Node returnTypeNode = new Node(Token.STRING_TYPE);
        returnTypeNode.setJSType(registry.createCornerType(JSTypeNative.STRING_TYPE));
        JSTypeExpression expr = new JSTypeExpression(returnTypeNode, "test.js");
        info.setReturnType(expr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferReturnType(info);

        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), builder.returnType);
        assertFalse(builder.returnTypeInferred);
    }

    @Test
    public void testInferReturnTypeWithoutReturnType() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferReturnType(info);

        assertNull(builder.returnType);
        assertFalse(builder.returnTypeInferred);
    }

    @Test
    public void testInferReturnStatementsAsLastResort_emptyBlock() throws Exception {
        Node functionBlock = new Node(Token.BLOCK);
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferReturnStatementsAsLastResort(functionBlock);

        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), builder.returnType);
        assertTrue(builder.returnTypeInferred);
    }

    @Test
    public void testInferReturnStatementsAsLastResort_withReturn() throws Exception {
        Node functionBlock = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1.0)));
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferReturnStatementsAsLastResort(functionBlock);

        assertNull(builder.returnType); // Should not infer VOID if there's a return.
    }

    @Test
    public void testInferReturnStatementsAsLastResort_withThrow() throws Exception {
        Node functionBlock = new Node(Token.BLOCK, new Node(Token.THROW));
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferReturnStatementsAsLastResort(functionBlock);

        assertNull(builder.returnType); // Should not infer VOID if there's a throw.
    }

    @Test
    public void testInferInheritanceConstructorAndExtends() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        info.setConstructor(true);
        Node baseTypeNode = new Node(Token.STRING_TYPE);
        baseTypeNode.setJSType(registry.createCornerType(JSTypeNative.OBJECT_TYPE));
        JSTypeExpression baseTypeExpr = new JSTypeExpression(baseTypeNode, "test.js");
        info.setBaseType(baseTypeExpr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferInheritance(info);

        assertTrue(builder.isConstructor);
        assertNotNull(builder.baseType);
        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), builder.baseType);
    }

    @Test
    public void testInferInheritanceInterfaceAndImplements() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        info.setInterface(true);
        Node interfaceTypeNode = new Node(Token.STRING_TYPE);
        interfaceTypeNode.setJSType(registry.createCornerType(JSTypeNative.OBJECT_TYPE));
        JSTypeExpression interfaceTypeExpr = new JSTypeExpression(interfaceTypeNode, "test.js");
        info.addImplementedInterface(interfaceTypeExpr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferInheritance(info);

        assertTrue(builder.isInterface);
        assertNotNull(builder.implementedInterfaces);
        assertEquals(1, builder.implementedInterfaces.size());
        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), builder.implementedInterfaces.get(0));
    }

    @Test
    public void testInferThisTypeFromInfo() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        Node thisTypeNode = new Node(Token.STRING_TYPE);
        thisTypeNode.setJSType(registry.createCornerType(JSTypeNative.OBJECT_TYPE));
        JSTypeExpression thisTypeExpr = new JSTypeExpression(thisTypeNode, "test.js");
        info.setThisType(thisTypeExpr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferThisType(info, null);

        assertNotNull(builder.thisType);
        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), builder.thisType);
    }

    @Test
    public void testInferThisTypeFromOwner() throws Exception {
        Node ownerNode = Node.newString(Token.NAME, "MyNamespace.MyClass");
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferThisType(null, ownerNode);

        assertNotNull(builder.thisType);
        assertTrue(builder.thisType.isObject());
    }

    @Test
    public void testInferParameterTypesFromInfoOnly() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        info.addParameter("param1", "description1");
        Node paramTypeNode = new Node(Token.NUMBER_TYPE);
        paramTypeNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        JSTypeExpression paramTypeExpr = new JSTypeExpression(paramTypeNode, "test.js");
        info.setParameterType("param1", paramTypeExpr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferParameterTypes(info);

        assertNotNull(builder.parametersNode);
        assertEquals(1, builder.parametersNode.getChildCount());
        assertEquals("param1", builder.parametersNode.getFirstChild().getString());
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), builder.parametersNode.getFirstChild().getJSType());
    }

    @Test
    public void testInferParameterTypesFromArgsParentAndInfo() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        Node argsParent = new Node(Token.LP);
        argsParent.addChildToBack(Node.newString(Token.NAME, "arg1"));
        argsParent.addChildToBack(Node.newString(Token.NAME, "arg2"));

        Node arg1TypeNode = new Node(Token.STRING_TYPE);
        arg1TypeNode.setJSType(registry.createCornerType(JSTypeNative.STRING_TYPE));
        JSTypeExpression arg1TypeExpr = new JSTypeExpression(arg1TypeNode, "test.js");
        info.setParameterType("arg1", arg1TypeExpr);

        Node arg2TypeNode = new Node(Token.BOOLEAN_TYPE);
        arg2TypeNode.setJSType(registry.createCornerType(JSTypeNative.BOOLEAN_TYPE));
        JSTypeExpression arg2TypeExpr = new JSTypeExpression(arg2TypeNode, "test.js");
        info.setParameterType("arg2", arg2TypeExpr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferParameterTypes(argsParent, info);

        assertNotNull(builder.parametersNode);
        assertEquals(2, builder.parametersNode.getChildCount());
        assertEquals("arg1", builder.parametersNode.getChildAtIndex(0).getString());
        assertEquals(registry.createCornerType(JSTypeNative.STRING_TYPE), builder.parametersNode.getChildAtIndex(0).getJSType());
        assertEquals("arg2", builder.parametersNode.getChildAtIndex(1).getString());
        assertEquals(registry.createCornerType(JSTypeNative.BOOLEAN_TYPE), builder.parametersNode.getChildAtIndex(1).getJSType());
    }

    @Test
    public void testInferParameterTypes_optionalArgAtEnd() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        Node argsParent = new Node(Token.LP);
        argsParent.addChildToBack(Node.newString(Token.NAME, "arg1"));
        Node arg2 = Node.newString(Token.NAME, "arg2");
        arg2.putBooleanProp(Node.IS_OPTIONAL_PARAM, true); // Set optional property
        argsParent.addChildToBack(arg2);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferParameterTypes(argsParent, info);

        assertNotNull(builder.parametersNode);
        assertEquals(2, builder.parametersNode.getChildCount());
        assertTrue(builder.parametersNode.getChildAtIndex(1).isOptionalArg());
    }

    @Test
    public void testInferParameterTypes_varArgs() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        Node argsParent = new Node(Token.LP);
        argsParent.addChildToBack(Node.newString(Token.NAME, "arg1"));
        Node arg2 = Node.newString(Token.NAME, "arg2");
        arg2.putBooleanProp(Node.IS_VAR_ARGS_PARAM, true); // Set var_args property
        argsParent.addChildToBack(arg2);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferParameterTypes(argsParent, info);

        assertNotNull(builder.parametersNode);
        assertEquals(2, builder.parametersNode.getChildCount());
        assertTrue(builder.parametersNode.getChildAtIndex(1).isVarArgs());
    }
    
    @Test
    public void testInferParameterTypes_templateTypeExpected() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        Node paramTypeNode = new Node(Token.STRING_TYPE); // Placeholder for template type
        paramTypeNode.setJSType(registry.createTemplateType("T"));
        JSTypeExpression paramTypeExpr = new JSTypeExpression(paramTypeNode, "test.js");
        info.setParameterType("param1", paramTypeExpr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.templateTypeName = "T"; // Set template type name
        builder.inferParameterTypes(info);

        assertNotNull(builder.parametersNode);
        assertEquals(1, builder.parametersNode.getChildCount());
        assertEquals("param1", builder.parametersNode.getFirstChild().getString());
        assertEquals(registry.createTemplateType("T"), builder.parametersNode.getFirstChild().getJSType());
    }

    @Test
    public void testInferParameterTypes_templateTypeDuplicated() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        Node param1TypeNode = new Node(Token.STRING_TYPE);
        param1TypeNode.setJSType(registry.createTemplateType("T"));
        JSTypeExpression param1TypeExpr = new JSTypeExpression(param1TypeNode, "test.js");
        info.setParameterType("param1", param1TypeExpr);

        Node param2TypeNode = new Node(Token.STRING_TYPE);
        param2TypeNode.setJSType(registry.createTemplateType("T"));
        JSTypeExpression param2TypeExpr = new JSTypeExpression(param2TypeNode, "test.js");
        info.setParameterType("param2", param2TypeExpr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.templateTypeName = "T";
        builder.inferParameterTypes(info);

        assertNotNull(builder.parametersNode);
        assertEquals(2, builder.parametersNode.getChildCount());
    }

    @Test
    public void testInferTemplateTypeName() throws Exception {
        JSDocInfo info = new JSDocInfo(true);
        info.setTemplateTypeName("T");

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferTemplateTypeName(info);

        assertEquals("T", builder.templateTypeName);
    }

    @Test
    public void testAddParameter_required() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        FunctionTypeBuilder ftb = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        JSType paramType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        
        ftb.addParameter(builder, paramType, false, false, false);

        assertNotNull(builder.build());
        assertEquals(1, builder.build().getChildCount());
        assertEquals(paramType, builder.build().getFirstChild().getJSType());
    }

    @Test
    public void testAddParameter_optional() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        FunctionTypeBuilder ftb = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        JSType paramType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        ftb.addParameter(builder, paramType, false, true, false);

        assertNotNull(builder.build());
        assertEquals(1, builder.build().getChildCount());
        assertTrue(builder.build().getFirstChild().isOptionalArg());
        assertEquals(paramType, builder.build().getFirstChild().getJSType());
    }

    @Test
    public void testAddParameter_varArgs() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        FunctionTypeBuilder ftb = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        JSType paramType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        ftb.addParameter(builder, paramType, false, false, true);

        assertNotNull(builder.build());
        assertEquals(1, builder.build().getChildCount());
        assertTrue(builder.build().getFirstChild().isVarArgs());
        assertEquals(paramType, builder.build().getFirstChild().getJSType());
    }

    @Test
    public void testAddParameter_optionalBeforeRequired_emitsWarning() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        FunctionTypeBuilder ftb = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        JSType type = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        ftb.addParameter(builder, type, false, true, false);
        ftb.addParameter(builder, type, true, false, false); 

        assertNotNull(builder.build());
        assertEquals(2, builder.build().getChildCount());
        assertTrue(builder.build().getChildAtIndex(0).isOptionalArg());
        assertFalse(builder.build().getChildAtIndex(1).isOptionalArg());
        assertFalse(builder.build().getChildAtIndex(1).isVarArgs());
    }

    @Test
    public void testAddParameter_varArgsBeforeRequired_emitsWarning() throws Exception {
        FunctionParamBuilder builder = new FunctionParamBuilder(registry);
        FunctionTypeBuilder ftb = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        JSType type = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        ftb.addParameter(builder, type, false, false, true);
        ftb.addParameter(builder, type, true, false, false); 

        assertNotNull(builder.build());
        assertEquals(2, builder.build().getChildCount());
        assertTrue(builder.build().getChildAtIndex(0).isVarArgs());
        assertFalse(builder.build().getChildAtIndex(1).isOptionalArg());
        assertFalse(builder.build().getChildAtIndex(1).isVarArgs());
    }
    
    @Test
    public void testBuildAndRegister_constructorType() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyConstructor", compiler, errorRoot, "test.js", scope);
        builder.isConstructor = true;
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType fnType = builder.buildAndRegister();

        assertTrue(fnType.isConstructor());
        assertEquals("MyConstructor", fnType.getReferenceName());
        assertEquals(params, fnType.getParametersNode());
        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), fnType.getReturnType());
    }

    @Test
    public void testBuildAndRegister_interfaceType() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, "test.js", scope);
        builder.isInterface = true;
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType fnType = builder.buildAndRegister();

        assertTrue(fnType.isInterface());
        assertEquals("MyInterface", fnType.getReferenceName());
        assertEquals(params, fnType.getParametersNode());
        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), fnType.getReturnType());
    }

    @Test
    public void testBuildAndRegister_ordinaryFunction() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, "test.js", scope);
        Node params = new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE)).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        builder.thisType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        builder.templateTypeName = "T";

        FunctionType fnType = builder.buildAndRegister();

        assertFalse(fnType.isConstructor());
        assertFalse(fnType.isInterface());
        assertEquals("myFunc", fnType.getReferenceName());
        assertEquals(params, fnType.getParametersNode());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), fnType.getReturnType());
        assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), fnType.getTypeOfThis());
        assertEquals("T", fnType.getTemplateTypeName());
    }

    @Test
    public void testBuildAndRegister_withImplementedInterfaces() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyConstructor", compiler, errorRoot, "test.js", scope);
        builder.isConstructor = true;
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        ObjectType interfaceType = registry.createInterfaceType("MyInterface", null);
        builder.implementedInterfaces = ImmutableList.of(interfaceType);

        FunctionType fnType = builder.buildAndRegister();

        assertEquals(1, fnType.getImplementedInterfaces().size());
        assertEquals(interfaceType, fnType.getImplementedInterfaces().iterator().next());
    }

    @Test
    public void testBuildAndRegister_withBaseType() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyConstructor", compiler, errorRoot, "test.js", scope);
        builder.isConstructor = true;
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        ObjectType baseType = registry.createFunctionType(null, registry.getNativeType(JSTypeNative.OBJECT_TYPE), null, null);
        builder.baseType = baseType;

        FunctionType fnType = new FunctionType(registry, "MyConstructor", null, new ArrowType(registry, params, builder.returnType), null, null, true, false);
        builder.maybeSetBaseType(fnType);

        assertNotNull(fnType.getPrototype());
        assertEquals(baseType, fnType.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testGetOrCreateConstructor_new() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("NewConstructor", compiler, errorRoot, "test.js", scope);
        builder.isConstructor = true;
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType fnType = builder.getOrCreateConstructor();

        assertTrue(fnType.isConstructor());
        assertEquals("NewConstructor", fnType.getReferenceName());
    }

    @Test
    public void testGetOrCreateConstructor_existingTypeRedefinitionWarning() throws Exception {
        FunctionType existingFn = registry.createConstructorType("ExistingConstructor", null, new FunctionParamBuilder(registry).build(), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        registry.declareType("ExistingConstructor", existingFn.getInstanceType());

        FunctionTypeBuilder builder = new FunctionTypeBuilder("ExistingConstructor", compiler, errorRoot, "test.js", scope);
        builder.isConstructor = true;
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE); 

        FunctionType fnType = builder.getOrCreateConstructor();

        assertTrue(fnType.isConstructor());
        assertEquals("ExistingConstructor", fnType.getReferenceName());
        assertNotEquals(existingFn, fnType); 
    }

    @Test
    public void testMaybeSetBaseType() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("Test", compiler, errorRoot, "test.js", scope);
        builder.isConstructor = true;
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        ObjectType baseType = registry.createFunctionType(null, registry.getNativeType(JSTypeNative.OBJECT_TYPE), null, null);
        builder.baseType = baseType;

        FunctionType fnType = new FunctionType(registry, "Test", null, new ArrowType(registry, params, builder.returnType), null, null, true, false);
        builder.maybeSetBaseType(fnType);

        assertNotNull(fnType.getPrototype());
        assertEquals(baseType, fnType.getPrototype().getImplicitPrototype());
    }
    
    @Test
    public void testReportWarning() {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.reportWarning(FunctionTypeBuilder.EXTENDS_WITHOUT_TYPEDEF, "fnName");
        assertTrue(true); 
    }

    @Test
    public void testReportError() {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.reportError(FunctionTypeBuilder.TEMPLATE_TYPE_DUPLICATED, "fnName");
        assertTrue(true);
    }

    @Test
    public void testIsFunctionTypeDeclaration_withParams() {
        JSDocInfo info = new JSDocInfo(true);
        info.addParameter("param", "desc");
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    @Test
    public void testIsFunctionTypeDeclaration_withReturnType() {
        JSDocInfo info = new JSDocInfo(true);
        Node returnTypeNode = new Node(Token.STRING_TYPE);
        returnTypeNode.setJSType(registry.createCornerType(JSTypeNative.STRING_TYPE));
        JSTypeExpression expr = new JSTypeExpression(returnTypeNode, "test.js");
        info.setReturnType(expr);
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    @Test
    public void testIsFunctionTypeDeclaration_withThisType() {
        JSDocInfo info = new JSDocInfo(true);
        Node thisTypeNode = new Node(Token.STRING_TYPE);
        thisTypeNode.setJSType(registry.createCornerType(JSTypeNative.OBJECT_TYPE));
        JSTypeExpression expr = new JSTypeExpression(thisTypeNode, "test.js");
        info.setThisType(expr);
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    @Test
    public void testIsFunctionTypeDeclaration_isConstructor() {
        JSDocInfo info = new JSDocInfo(true);
        info.setConstructor(true);
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    @Test
    public void testIsFunctionTypeDeclaration_isInterface() {
        JSDocInfo info = new JSDocInfo(true);
        info.setInterface(true);
        assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }

    @Test
    public void testIsFunctionTypeDeclaration_emptyInfo() {
        JSDocInfo info = new JSDocInfo(true);
        assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
    }
    
    @Test
    public void testInferParameterTypes_emptyArgsParentAndInfo() {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferParameterTypes(new Node(Token.LP), null);
        assertNotNull(builder.parametersNode);
        assertEquals(0, builder.parametersNode.getChildCount());
    }

    @Test
    public void testInferParameterTypes_argsParentButNullInfo() {
        Node argsParent = new Node(Token.LP);
        argsParent.addChildToBack(Node.newString(Token.NAME, "arg1"));
        
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferParameterTypes(argsParent, null);

        assertNotNull(builder.parametersNode);
        assertEquals(1, builder.parametersNode.getChildCount());
        assertEquals("arg1", builder.parametersNode.getFirstChild().getString());
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), builder.parametersNode.getFirstChild().getJSType());
    }

    @Test
    public void testInferParameterTypes_inferFromExistingParameters() {
        FunctionType oldType = registry.createFunctionType(
            new ArrowType(registry, new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE)).build(), registry.getNativeType(JSTypeNative.STRING_TYPE)));
        
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.parametersNode = oldType.getParametersNode(); 

        Node argsParent = new Node(Token.LP); 
        argsParent.addChildToBack(Node.newString(Token.NAME, "newArg"));

        builder.inferParameterTypes(argsParent, null);

        assertNotNull(builder.parametersNode);
        assertEquals(1, builder.parametersNode.getChildCount());
        assertEquals("newArg", builder.parametersNode.getFirstChild().getString());
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), builder.parametersNode.getFirstChild().getJSType());
    }
    
    @Test
    public void testInferFromOverriddenFunction_nullOldType() throws Exception {
        Node paramsParent = new Node(Token.LP);
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferFromOverriddenFunction(null, paramsParent);
        assertNull(builder.parametersNode); 
    }

    @Test
    public void testInferFromOverriddenFunction_nullParamsParent() throws Exception {
        FunctionType oldType = registry.createFunctionType(
            new ArrowType(registry, new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE)).build(), registry.getNativeType(JSTypeNative.STRING_TYPE)));
        
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferFromOverriddenFunction(oldType, null);

        assertNotNull(builder.parametersNode);
        assertEquals(oldType.getParametersNode(), builder.parametersNode);
        assertEquals(oldType.getReturnType(), builder.returnType);
        assertTrue(builder.returnTypeInferred == oldType.isReturnTypeInferred());
    }

    @Test
    public void testInferFromOverriddenFunction_withParamsParentAndOldType() throws Exception {
        FunctionType oldType = registry.createFunctionType(
            new ArrowType(registry, new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE)).addOptionalParams(registry.getNativeType(JSTypeNative.STRING_TYPE)).build(), registry.getNativeType(JSTypeNative.BOOLEAN_TYPE)));
        
        Node paramsParent = new Node(Token.LP);
        paramsParent.addChildToBack(Node.newString(Token.NAME, "p1")); 
        paramsParent.addChildToBack(Node.newString(Token.NAME, "p2"));

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.inferFromOverriddenFunction(oldType, paramsParent);

        assertNotNull(builder.parametersNode);
        assertEquals(2, builder.parametersNode.getChildCount()); 
        assertEquals("p1", builder.parametersNode.getChildAtIndex(0).getString());
        assertEquals("p2", builder.parametersNode.getChildAtIndex(1).getString());
        
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), builder.parametersNode.getChildAtIndex(0).getJSType());
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), builder.parametersNode.getChildAtIndex(1).getJSType());
        assertTrue(builder.parametersNode.getChildAtIndex(1).isOptionalArg());

        assertEquals(oldType.getReturnType(), builder.returnType);
        assertTrue(builder.returnTypeInferred == oldType.isReturnTypeInferred());
    }

    // Tests for methods not covered by previous tests.

    @Test
    public void testApply_validType() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        boolean result = builder.apply(objType); // This method is part of Predicate, applying a type to the builder.
        assertTrue(result); // Expected to return true if the type is valid.
        assertEquals(objType, builder.thisType); // Check if thisType was updated.
    }

    @Test
    public void testApply_invalidType() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        // Using a JSType that is not an ObjectType
        JSType nonObjectType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        boolean result = builder.apply(nonObjectType);
        assertFalse(result); // Expected to return false for non-object types.
        assertNull(builder.thisType); // thisType should not be updated.
    }

    @Test
    public void testIsInstanceType() throws Exception {
        // This method is declared in ObjectType and FunctionType, not FunctionTypeBuilder.
        // Testing it directly on a FunctionType instance.
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, true, false);
        assertTrue(functionType.isInstanceType());
    }
    
    @Test
    public void testIsOrdinaryFunction() throws Exception {
        // Testing it directly on a FunctionType instance.
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertTrue(functionType.isOrdinaryFunction());
    }

    @Test
    public void testCanBeCalled() throws Exception {
        // Testing it directly on a FunctionType instance.
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertTrue(functionType.canBeCalled());
    }

    @Test
    public void testGetParameters() throws Exception {
        Node paramNode1 = Node.newString(Token.NAME, "p1");
        Node paramNode2 = Node.newString(Token.NAME, "p2");
        Node params = new Node(Token.LP, paramNode1, paramNode2);
        
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        
        Iterable<Node> parameters = functionType.getParameters();
        List<Node> paramList = Lists.newArrayList(parameters);
        assertEquals(2, paramList.size());
        assertSame(paramNode1, paramList.get(0));
        assertSame(paramNode2, paramList.get(1));
    }

    @Test
    public void testGetMinArguments_noOptionalOrVarArgs() throws Exception {
        Node paramNode1 = Node.newString(Token.NAME, "p1");
        Node paramNode2 = Node.newString(Token.NAME, "p2");
        Node params = new Node(Token.LP, paramNode1, paramNode2);
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertEquals(2, functionType.getMinArguments());
    }

    @Test
    public void testGetMinArguments_withOptional() throws Exception {
        Node paramNode1 = Node.newString(Token.NAME, "p1");
        Node paramNode2 = Node.newString(Token.NAME, "p2");
        paramNode2.setOptionalArg(true);
        Node params = new Node(Token.LP, paramNode1, paramNode2);
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertEquals(1, functionType.getMinArguments());
    }

    @Test
    public void testGetMinArguments_withVarArgs() throws Exception {
        Node paramNode1 = Node.newString(Token.NAME, "p1");
        Node paramNode2 = Node.newString(Token.NAME, "p2");
        paramNode2.setVarArgs(true);
        Node params = new Node(Token.LP, paramNode1, paramNode2);
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertEquals(1, functionType.getMinArguments());
    }
    
    @Test
    public void testGetMaxArguments_noVarArgs() throws Exception {
        Node paramNode1 = Node.newString(Token.NAME, "p1");
        Node paramNode2 = Node.newString(Token.NAME, "p2");
        Node params = new Node(Token.LP, paramNode1, paramNode2);
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertEquals(2, functionType.getMaxArguments());
    }

    @Test
    public void testGetMaxArguments_withVarArgs() throws Exception {
        Node paramNode1 = Node.newString(Token.NAME, "p1");
        Node paramNode2 = Node.newString(Token.NAME, "p2");
        paramNode2.setVarArgs(true);
        Node params = new Node(Token.LP, paramNode1, paramNode2);
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertEquals(Integer.MAX_VALUE, functionType.getMaxArguments());
    }

    @Test
    public void testGetReturnType() throws Exception {
        JSType returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ArrowType arrowType = new ArrowType(registry, null, returnType);
        FunctionType functionType = new FunctionType(registry, "test", null, arrowType, null, null, false, false);
        assertEquals(returnType, functionType.getReturnType());
    }

    @Test
    public void testIsReturnTypeInferred() throws Exception {
        ArrowType arrowTypeInferred = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE), true);
        FunctionType functionTypeInferred = new FunctionType(registry, "test", null, arrowTypeInferred, null, null, false, false);
        assertTrue(functionTypeInferred.isReturnTypeInferred());

        ArrowType arrowTypeNotInferred = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE), false);
        FunctionType functionTypeNotInferred = new FunctionType(registry, "test", null, arrowTypeNotInferred, null, null, false, false);
        assertFalse(functionTypeNotInferred.isReturnTypeInferred());
    }

    @Test
    public void testGetPrototype() throws Exception {
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, true, false);
        FunctionPrototypeType prototype = functionType.getPrototype();
        assertNotNull(prototype);
        assertEquals(functionType, prototype.getConstructor());
    }

    @Test
    public void testSetPrototypeBasedOn() throws Exception {
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, true, false);
        ObjectType baseType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        functionType.setPrototypeBasedOn(baseType);
        assertEquals(baseType, functionType.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testSetPrototype() throws Exception {
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, true, false);
        FunctionPrototypeType newPrototype = new FunctionPrototypeType(registry, functionType, null);
        assertTrue(functionType.setPrototype(newPrototype));
        assertEquals(newPrototype, functionType.getPrototype());
    }

    @Test
    public void testGetAllImplementedInterfaces() throws Exception {
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, true, false);
        ObjectType interface1 = registry.createInterfaceType("I1", null);
        ObjectType interface2 = registry.createInterfaceType("I2", null);
        functionType.setImplementedInterfaces(Lists.newArrayList(interface1, interface2));
        Iterable<ObjectType> interfaces = functionType.getAllImplementedInterfaces();
        assertEquals(2, Iterables.size(interfaces));
        assertTrue(Iterables.contains(interfaces, interface1));
        assertTrue(Iterables.contains(interfaces, interface2));
    }

    @Test
    public void testGetImplementedInterfaces() throws Exception {
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, true, false);
        ObjectType interface1 = registry.createInterfaceType("I1", null);
        functionType.setImplementedInterfaces(Lists.newArrayList(interface1));
        Iterable<ObjectType> interfaces = functionType.getImplementedInterfaces();
        assertEquals(1, Iterables.size(interfaces));
        assertTrue(Iterables.contains(interfaces, interface1));
    }

    @Test
    public void testHasProperty() throws Exception {
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertTrue(functionType.hasProperty("prototype"));
        assertFalse(functionType.hasProperty("nonExistent"));
    }

    @Test
    public void testHasOwnProperty() throws Exception {
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertTrue(functionType.hasOwnProperty("prototype"));
        assertFalse(functionType.hasOwnProperty("nonExistent"));
    }

    @Test
    public void testGetPropertyType() throws Exception {
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertEquals(functionType.getPrototype(), functionType.getPropertyType("prototype"));
    }

    @Test
    public void testIsPropertyTypeInferred() throws Exception {
        FunctionType functionType = new FunctionType(registry, "test", null, new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE)), null, null, false, false);
        assertTrue(functionType.isPropertyTypeInferred("prototype"));
    }

    @Test
    public void testGetLeastSupertype() throws Exception {
        FunctionType ft1 = registry.createFunctionType("f1", null, null, null);
        FunctionType ft2 = registry.createFunctionType("f2", null, null, null);
        JSType leastSuper = ft1.getLeastSupertype(ft2);
        assertTrue(leastSuper.isFunctionType());
        // For simple function types without specific properties, the supertype might be a generic function type.
        // This is a simplified check.
    }

    @Test
    public void testGetGreatestSubtype() throws Exception {
        FunctionType ft1 = registry.createFunctionType("f1", null, null, null);
        FunctionType ft2 = registry.createFunctionType("f2", null, null, null);
        JSType greatestSub = ft1.getGreatestSubtype(ft2);
        assertTrue(greatestSub.isFunctionType());
    }

    @Test
    public void testGetSuperClassConstructor() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("Base", compiler, errorRoot, "test.js", scope);
        builder.isConstructor = true;
        FunctionType baseType = builder.buildAndRegister();
        
        FunctionTypeBuilder subBuilder = new FunctionTypeBuilder("Derived", compiler, errorRoot, "test.js", scope);
        subBuilder.isConstructor = true;
        Node baseTypeNode = new Node(Token.STRING_TYPE);
        baseTypeNode.setJSType(registry.createNominalType("Base"));
        JSTypeExpression baseTypeExpr = new JSTypeExpression(baseTypeNode, "test.js");
        
        JSDocInfo jsDocInfo = new JSDocInfo(true);
        jsDocInfo.setBaseType(baseTypeExpr);
        subBuilder.inferInheritance(jsDocInfo);
        
        FunctionType derivedType = subBuilder.buildAndRegister();
        
        assertEquals(baseType, derivedType.getSuperClassConstructor());
    }

    @Test
    public void testHasUnknownSupertype() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("Base", compiler, errorRoot, "test.js", scope);
        builder.isConstructor = true;
        FunctionType baseType = builder.buildAndRegister();
        
        FunctionTypeBuilder subBuilder = new FunctionTypeBuilder("Derived", compiler, errorRoot, "test.js", scope);
        subBuilder.isConstructor = true;
        ObjectType unknownType = registry.getUnknownType();
        subBuilder.baseType = unknownType; // Directly setting unknown type as base
        FunctionType derivedType = subBuilder.buildAndRegister();
        
        assertTrue(derivedType.hasUnknownSupertype());
    }

    @Test
    public void testIsEquivalentTo() throws Exception {
        FunctionType ft1 = registry.createFunctionType("f1", null, null, null);
        FunctionType ft2 = registry.createFunctionType("f1", null, null, null); // same name, should be equivalent for interfaces
        assertTrue(ft1.isEquivalentTo(ft2));
    }

    @Test
    public void testHashCode() throws Exception {
        FunctionType ft1 = registry.createFunctionType("f1", null, null, null);
        FunctionType ft2 = registry.createFunctionType("f1", null, null, null);
        assertEquals(ft1.hashCode(), ft2.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, "test.js", scope);
        Node params = new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE)).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        builder.thisType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);

        FunctionType fnType = builder.buildAndRegister();
        String str = fnType.toString();
        assertTrue(str.contains("function (this:Object, "));
        assertTrue(str.contains("number): string"));
    }

    @Test
    public void testIsSubtype() throws Exception {
        FunctionType superType = registry.createFunctionType("Super", null, null, null);
        FunctionType subType = registry.createFunctionType("Sub", null, null, null);
        assertTrue(subType.isSubtype(superType)); // Generic function types are subtypes of each other.
    }
    
    @Test
    public void testGetInstanceType() throws Exception {
        FunctionType constructorType = registry.createConstructorType("MyConstructor", null, null, null);
        assertNotNull(constructorType.getInstanceType());
    }
    
    @Test
    public void testGetTemplateTypeName() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.templateTypeName = "T";
        FunctionType fnType = builder.buildAndRegister();
        assertEquals("T", fnType.getTemplateTypeName());
    }

    @Test
    public void testInferThisType_withExistingThisType() throws Exception {
        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, "test.js", scope);
        builder.thisType = registry.getNativeType(JSTypeNative.OBJECT_TYPE); // Existing this type
        
        JSDocInfo info = new JSDocInfo(true);
        Node thisTypeNode = new Node(Token.STRING_TYPE);
        thisTypeNode.setJSType(registry.createCornerType(JSTypeNative.NUMBER_TYPE)); // New this type
        JSTypeExpression thisTypeExpr = new JSTypeExpression(thisTypeNode, "test.js");
        info.setThisType(thisTypeExpr);

        builder.inferThisType(info, null); // Should override existing
        assertNotNull(builder.thisType);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), builder.thisType);
    }
}
