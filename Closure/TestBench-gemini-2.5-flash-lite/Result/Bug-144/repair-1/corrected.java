package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import com.google.common.annotations.VisibleForTesting;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.ArrowType; // Added missing import

public class FunctionTypeBuilderTest {

    // Helper to create a basic compiler and type registry for testing.
    private static AbstractCompiler createCompiler() {
        CompilerOptions options = new CompilerOptions();
        // setClosurePass, setPreferSingleQuotes, setPrettyPrint are not public methods of CompilerOptions
        // Using a MockCompiler or a simplified setup might be better for isolated testing.
        // For now, we'll proceed assuming a basic Compiler can be instantiated.
        // The provided Compiler constructor for testing requires an ErrorManager.
        // Let's use a simple MockErrorReporter.
        ErrorReporter mockErrorReporter = new com.google.javascript.jscomp.ErrorReporter() {
            @Override
            public com.google.javascript.rhino.JSError reportError(String message, String sourceName, int line, int offset) { return null; }
            @Override
            public com.google.javascript.rhino.JSError reportError(String message, String sourceName, Node node, com.google.javascript.rhino.JSError.Severity severity) { return null; }
            @Override
            public com.google.javascript.rhino.JSError reportError(String message, String sourceName, int line, int column, int offset) { return null; }
            @Override
            public com.google.javascript.rhino.JSError reportWarning(String message, String sourceName, int line, int offset) { return null; }
            @Override
            public com.google.javascript.rhino.JSError reportWarning(String message, String sourceName, int line, int column, int offset) { return null; }
            @Override
            public void warning(String message, String sourceName, int line, int charOffset) {}
            @Override
            public void error(String message, String sourceName, int line, int charOffset) {}
        };
        
        return new Compiler(mockErrorReporter);
    }

    private static JSTypeRegistry createRegistry(AbstractCompiler compiler) {
        return compiler.getTypeRegistry();
    }

    private static Scope createScope(AbstractCompiler compiler) {
        Node script = Node.newString(Token.SCRIPT, ""); // Use Token.SCRIPT for script node
        return new TypedScopeCreator(compiler).createScope(script, null);
    }

    @Test
    public void testInferReturnType_withJSDoc() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, ""); // Use Node.newString
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        // JSDocInfo.setReturnType expects JSTypeExpression, not Node directly
        JSTypeExpression returnExpr = new JSTypeExpression(Node.newString(Token.STRING, "string"), sourceName);
        jsDocInfo.setReturnType(returnExpr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferReturnType(jsDocInfo).buildAndRegister();

        assertNotNull(result.getReturnType());
        assertEquals("string", result.getReturnType().toString());
    }

    @Test
    public void testInferReturnType_withoutJSDoc() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferReturnType(null).buildAndRegister();

        assertNotNull(result.getReturnType());
        assertEquals("unknown", result.getReturnType().toString());
    }

    @Test
    public void testInferReturnStatements_emptyBlock() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        Node block = new Node(Token.BLOCK); // Empty block
        FunctionType result = builder.inferReturnStatements(block).buildAndRegister();

        assertNotNull(result.getReturnType());
        assertEquals("void", result.getReturnType().toString());
    }

    @Test
    public void testInferReturnStatements_blockWithReturn() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        Node block = new Node(Token.BLOCK);
        Node returnNode = new Node(Token.RETURN, Node.newString(Token.STRING, "hello")); // Use Node.newString
        block.addChildToBack(returnNode);
        FunctionType result = builder.inferReturnStatements(block).buildAndRegister();

        assertNull(result.getReturnType()); // Return type not inferred if there's a return statement
    }
    
    @Test
    public void testInferReturnStatements_blockWithThrow() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        Node block = new Node(Token.BLOCK);
        Node throwNode = new Node(Token.THROW, Node.newString(Token.STRING, "error")); // Use Node.newString
        block.addChildToBack(throwNode);
        FunctionType result = builder.inferReturnStatements(block).buildAndRegister();

        assertNull(result.getReturnType()); // Return type not inferred if there's a throw statement
    }

    @Test
    public void testInferInheritance_constructorAndBaseType() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setConstructor(true);
        JSTypeExpression baseTypeExpr = new JSTypeExpression(Node.newString(Token.STRING, "Base"), sourceName); // Use Node.newString
        jsDocInfo.setBaseType(baseTypeExpr);

        // Need to register "Base" as a type for it to be evaluated
        registry.declareType("Base", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferInheritance(jsDocInfo).buildAndRegister();

        assertTrue(result.isConstructor());
        assertNotNull(builder.baseType); // Accessing the field directly for assertion
        assertEquals("Base", builder.baseType.getReferenceName());
    }

    @Test
    public void testInferInheritance_interfaceAndImplementedInterfaces() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setInterface(true);
        JSTypeExpression iface1Expr = new JSTypeExpression(Node.newString(Token.STRING, "Interface1"), sourceName); // Use Node.newString
        JSTypeExpression iface2Expr = new JSTypeExpression(Node.newString(Token.STRING, "Interface2"), sourceName); // Use Node.newString
        jsDocInfo.addImplementedInterface(iface1Expr);
        jsDocInfo.addImplementedInterface(iface2Expr);

        // Register interfaces
        registry.declareType("Interface1", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);
        registry.declareType("Interface2", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferInheritance(jsDocInfo).buildAndRegister();

        assertTrue(result.isInterface());
        assertNotNull(builder.implementedInterfaces); // Accessing the field directly for assertion
        assertEquals(2, builder.implementedInterfaces.size());
        assertEquals("Interface1", builder.implementedInterfaces.get(0).getReferenceName());
        assertEquals("Interface2", builder.implementedInterfaces.get(1).getReferenceName());
    }

    @Test
    public void testInferThisType_fromJSDoc() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        JSTypeExpression thisTypeExpr = new JSTypeExpression(Node.newString(Token.STRING, "ThisType"), sourceName); // Use Node.newString
        jsDocInfo.setThisType(thisTypeExpr);

        // Register "ThisType"
        registry.declareType("ThisType", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferThisType(jsDocInfo, (Node) null).buildAndRegister(); // Pass null for owner

        assertNotNull(result.getTypeOfThis());
        assertEquals("ThisType", result.getTypeOfThis().toString());
    }

    @Test
    public void testInferThisType_fromOwnerNode() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        Node ownerNode = Node.newString(Token.STRING, "OwnerType"); // Use Node.newString
        ownerNode.putProp(Node.NAME_PROP, "OwnerType"); // Simulate qualified name
        // Register "OwnerType"
        registry.declareType("OwnerType", ownerNode, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("method", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferThisType(null, ownerNode).buildAndRegister(); // Pass null for JSDocInfo

        assertNotNull(result.getTypeOfThis());
        assertEquals("OwnerType", result.getTypeOfThis().toString());
    }

    @Test
    public void testInferParameterTypes_withJSDoc() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addParameter("param1", null);
        JSTypeExpression param1TypeExpr = new JSTypeExpression(Node.newString(Token.STRING, "number"), sourceName); // Use Node.newString
        jsDocInfo.addParameterType("param1", param1TypeExpr);
        jsDocInfo.addParameter("param2", null);
        JSTypeExpression param2TypeExpr = new JSTypeExpression(Node.newString(Token.STRING, "boolean"), sourceName); // Use Node.newString
        jsDocInfo.addParameterType("param2", param2TypeExpr);

        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "param1"));
        lp.addChildToBack(Node.newString(Token.NAME, "param2"));

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferParameterTypes(lp, jsDocInfo).buildAndRegister();

        assertNotNull(result.getParametersNode());
        assertEquals(2, result.getParametersNode().getChildCount());
        assertEquals("number", result.getParametersNode().getChildAtIndex(0).getJSType().toString());
        assertEquals("boolean", result.getParametersNode().getChildAtIndex(1).getJSType().toString());
    }

    @Test
    public void testInferParameterTypes_withOptionalAndVarArgs() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addParameter("required", null);
        JSTypeExpression reqType = new JSTypeExpression(Node.newString(Token.STRING, "string"), sourceName); // Use Node.newString
        jsDocInfo.addParameterType("required", reqType);

        jsDocInfo.addParameter("optional", null);
        JSTypeExpression optType = new JSTypeExpression(Node.newString(Token.STRING, "number"), sourceName); // Use Node.newString
        optType.setOptionalArg(true);
        jsDocInfo.addParameterType("optional", optType);

        jsDocInfo.addParameter("var_args", null);
        JSTypeExpression varType = new JSTypeExpression(Node.newString(Token.STRING, "boolean"), sourceName); // Use Node.newString
        varType.setVarArgs(true);
        jsDocInfo.addParameterType("var_args", varType);

        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "required"));
        lp.addChildToBack(Node.newString(Token.NAME, "optional"));
        lp.addChildToBack(Node.newString(Token.NAME, "var_args"));

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferParameterTypes(lp, jsDocInfo).buildAndRegister();

        assertNotNull(result.getParametersNode());
        assertEquals(3, result.getParametersNode().getChildCount());
        
        Node reqParam = result.getParametersNode().getChildAtIndex(0);
        assertEquals("string", reqParam.getJSType().toString());
        assertFalse(reqParam.isOptionalArg());
        assertFalse(reqParam.isVarArgsParameter());

        Node optParam = result.getParametersNode().getChildAtIndex(1);
        assertEquals("number", optParam.getJSType().toString());
        assertTrue(optParam.isOptionalArg());
        assertFalse(optParam.isVarArgsParameter());

        Node varParam = result.getParametersNode().getChildAtIndex(2);
        assertEquals("boolean", varParam.getJSType().toString());
        assertFalse(varParam.isOptionalArg());
        assertTrue(varParam.isVarArgsParameter());
    }

    @Test
    public void testInferTemplateTypeName_basic() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setTemplateTypeName("T");

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferTemplateTypeName(jsDocInfo).buildAndRegister();

        assertEquals("T", result.getTemplateTypeName());
    }

    @Test
    public void testAddParameter_required() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        boolean warningEmitted = builder.addParameter(paramBuilder, numberType, false, false, false);

        assertFalse(warningEmitted);
        assertNotNull(paramBuilder.build());
        assertEquals(1, paramBuilder.build().getChildCount());
        assertEquals("number", paramBuilder.build().getFirstChild().getJSType().toString());
    }

    @Test
    public void testAddParameter_optional() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        boolean warningEmitted = builder.addParameter(paramBuilder, numberType, false, true, false);

        assertFalse(warningEmitted);
        assertNotNull(paramBuilder.build());
        assertEquals(1, paramBuilder.build().getChildCount());
        assertEquals("number", paramBuilder.build().getFirstChild().getJSType().toString());
        assertTrue(paramBuilder.build().getFirstChild().isOptionalArg());
    }

    @Test
    public void testAddParameter_varArgs() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        boolean warningEmitted = builder.addParameter(paramBuilder, numberType, false, false, true);

        assertFalse(warningEmitted);
        assertNotNull(paramBuilder.build());
        assertEquals(1, paramBuilder.build().getChildCount());
        assertEquals("number", paramBuilder.build().getFirstChild().getJSType().toString());
        assertTrue(paramBuilder.build().getFirstChild().isVarArgsParameter());
    }

    @Test
    public void testAddParameter_optionalBeforeRequired_warning() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        
        // Add an optional parameter first
        builder.addParameter(paramBuilder, numberType, false, true, false);
        // Then add a required parameter
        boolean warningEmitted = builder.addParameter(paramBuilder, stringType, false, false, false);

        assertTrue(warningEmitted);
        assertNotNull(paramBuilder.build());
        assertEquals(2, paramBuilder.build().getChildCount());
        assertTrue(paramBuilder.build().getChildAtIndex(0).isOptionalArg());
        assertFalse(paramBuilder.build().getChildAtIndex(1).isOptionalArg());
    }

    @Test
    public void testBuildAndRegister_constructor() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyConstructor", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true; // Manually set for testing
        
        Node params = new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.STRING_TYPE)).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        FunctionType result = builder.buildAndRegister();

        assertTrue(result.isConstructor());
        assertEquals("MyConstructor", result.getReferenceName());
        assertEquals("string", result.getParametersNode().getFirstChild().getJSType().toString());
        assertEquals("number", result.getReturnType().toString());
    }

    @Test
    public void testBuildAndRegister_interface() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        builder.isInterface = true; // Manually set for testing
        
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType result = builder.buildAndRegister();

        assertTrue(result.isInterface());
        assertEquals("MyInterface", result.getReferenceName());
        // The toString representation of an empty LP node is "()"
        assertEquals("()", result.getParametersNode().toString()); 
        assertEquals("void", result.getReturnType().toString());
    }

    @Test
    public void testBuildAndRegister_ordinaryFunction() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunction", compiler, errorRoot, sourceName, scope);
        
        Node params = new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE)).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        builder.thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE); // Use the field directly
        builder.templateTypeName = "T";

        FunctionType result = builder.buildAndRegister();

        assertFalse(result.isConstructor());
        assertFalse(result.isInterface());
        assertEquals("myFunction", result.getReferenceName());
        assertEquals("boolean", result.getParametersNode().getFirstChild().getJSType().toString());
        assertEquals("string", result.getReturnType().toString());
        assertEquals("Object", result.getTypeOfThis().toString());
        assertEquals("T", result.getTemplateTypeName());
    }

    @Test
    public void testMaybeSetBaseType_constructor() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        ObjectType baseType = registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        baseType.setReferenceName("Base");

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        builder.baseType = baseType; // Use the field directly

        FunctionType result = builder.buildAndRegister();
        assertTrue(result.isConstructor());
        assertNotNull(result.getPrototype().getImplicitPrototype());
        assertEquals("Base", result.getPrototype().getImplicitPrototype().getReferenceName());
    }

    @Test
    public void testGetOrCreateConstructor_existingType() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        // Pre-register a constructor type
        FunctionType existingCtor = registry.createConstructorType("Existing", null, null, null);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("Existing", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        builder.parametersNode = new FunctionParamBuilder(registry).build();
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType result = builder.buildAndRegister();

        // Should return the existing constructor, not a new one
        assertSame(existingCtor, result);
    }

    @Test
    public void testGetOrCreateConstructor_newType() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("NewConstructor", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        builder.parametersNode = new FunctionParamBuilder(registry).build();
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType result = builder.buildAndRegister();

        assertTrue(result.isConstructor());
        assertEquals("NewConstructor", result.getReferenceName());
        assertNotNull(registry.getType("NewConstructor"));
    }
    
    @Test
    public void testBuildAndRegister_constructor_withBaseType() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        ObjectType baseType = registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        baseType.setReferenceName("BaseType");

        FunctionTypeBuilder builder = new FunctionTypeBuilder("Derived", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        builder.baseType = baseType;
        builder.parametersNode = new FunctionParamBuilder(registry).build();
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType result = builder.buildAndRegister();

        assertTrue(result.isConstructor());
        assertNotNull(result.getPrototype().getImplicitPrototype());
        assertEquals("BaseType", result.getPrototype().getImplicitPrototype().getReferenceName());
    }

    @Test
    public void testInferReturnType_templateTypeExpected() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setTemplateTypeName("T");
        JSTypeExpression returnExpr = new JSTypeExpression(Node.newString(Token.STRING, "T"), sourceName); // Use Node.newString
        jsDocInfo.setReturnType(returnExpr);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        // This scenario should ideally report an error, but the current builder logic doesn't explicitly throw
        // for this case during build, it's more of a validation failure. We can check for the template type being set.
        builder.inferTemplateTypeName(jsDocInfo);
        FunctionType result = builder.inferReturnType(jsDocInfo).buildAndRegister();

        assertEquals("T", result.getReturnType().toString());
        // The error reporting would happen in a compiler pass. For builder, we check construction.
    }

    @Test
    public void testInferParameterTypes_templateTypeDuplicated() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setTemplateTypeName("T");
        JSType tType = registry.getTemplateType("T"); // Not directly used in builder but good for context

        jsDocInfo.addParameter("p1", null);
        JSTypeExpression p1Type = new JSTypeExpression(Node.newString(Token.STRING, "T"), sourceName); // Use Node.newString
        jsDocInfo.addParameterType("p1", p1Type);

        jsDocInfo.addParameter("p2", null);
        JSTypeExpression p2Type = new JSTypeExpression(Node.newString(Token.STRING, "T"), sourceName); // Use Node.newString
        jsDocInfo.addParameterType("p2", p2Type);

        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "p1"));
        lp.addChildToBack(Node.newString(Token.NAME, "p2"));

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        builder.inferTemplateTypeName(jsDocInfo);
        // This scenario should ideally report an error, but the builder focuses on construction.
        // We check that the parameters are constructed.
        FunctionType result = builder.inferParameterTypes(lp, jsDocInfo).buildAndRegister();

        assertNotNull(result.getParametersNode());
        assertEquals(2, result.getParametersNode().getChildCount());
        assertEquals("T", result.getParametersNode().getChildAtIndex(0).getJSType().toString());
        assertEquals("T", result.getParametersNode().getChildAtIndex(1).getJSType().toString());
    }

    @Test
    public void testInferParameterTypes_inexistentParam() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addParameter("param1", null);
        JSTypeExpression param1TypeExpr = new JSTypeExpression(Node.newString(Token.STRING, "number"), sourceName); // Use Node.newString
        jsDocInfo.addParameterType("param1", param1TypeExpr);
        
        // "param2" is in JSDoc but not in the function definition
        jsDocInfo.addParameter("param2", null); 

        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "param1"));

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        // This scenario should ideally report an error.
        builder.inferParameterTypes(lp, jsDocInfo); 
        // We verify that the parameters are processed as expected, error reporting is outside builder's scope.
        assertNotNull(builder.parametersNode);
        assertEquals(1, builder.parametersNode.getChildCount());
        assertEquals("number", builder.parametersNode.getChildAtIndex(0).getJSType().toString());
    }

    @Test
    public void testInferThisType_nullOwnerAndJSDoc() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        JSTypeExpression thisTypeExpr = new JSTypeExpression(Node.newString(Token.STRING, "ExplicitThis"), sourceName); // Use Node.newString
        jsDocInfo.setThisType(thisTypeExpr);

        // Register "ExplicitThis"
        registry.declareType("ExplicitThis", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferThisType(jsDocInfo, (Node) null).buildAndRegister();

        assertNotNull(result.getTypeOfThis());
        assertEquals("ExplicitThis", result.getTypeOfThis().toString());
    }

    @Test
    public void testInferThisType_ownerNodeOverridesJSDoc() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        // JSDoc @this type
        JSDocInfo jsDocInfo = new JSDocInfo();
        JSTypeExpression jsDocThisExpr = new JSTypeExpression(Node.newString(Token.STRING, "JsDocThis"), sourceName); // Use Node.newString
        jsDocInfo.setThisType(jsDocThisExpr);
        registry.declareType("JsDocThis", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        // Owner node type
        Node ownerNode = Node.newString(Token.STRING, "OwnerThis"); // Use Node.newString
        ownerNode.putProp(Node.NAME_PROP, "OwnerThis");
        registry.declareType("OwnerThis", ownerNode, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("method", compiler, errorRoot, sourceName, scope);
        // The owner node should take precedence over JSDoc @this
        FunctionType result = builder.inferThisType(jsDocInfo, ownerNode).buildAndRegister();

        assertNotNull(result.getTypeOfThis());
        assertEquals("OwnerThis", result.getTypeOfThis().toString());
    }
    
    @Test
    public void testInferParameterTypes_noJSDocButArgsPresent() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "arg1"));
        lp.addChildToBack(Node.newString(Token.NAME, "arg2"));

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferParameterTypes(lp, null).buildAndRegister();

        assertNotNull(result.getParametersNode());
        assertEquals(2, result.getParametersNode().getChildCount());
        // Parameters should be inferred as UNKNOWN
        assertEquals("unknown", result.getParametersNode().getChildAtIndex(0).getJSType().toString());
        assertEquals("unknown", result.getParametersNode().getChildAtIndex(1).getJSType().toString());
    }

    @Test
    public void testInferParameterTypes_noArgsPresentOrJSDoc() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        Node lp = new Node(Token.LP); // Empty parameter list

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferParameterTypes(lp, null).buildAndRegister();

        assertNotNull(result.getParametersNode());
        assertEquals(0, result.getParametersNode().getChildCount());
        assertNull(result.getReturnType()); // No return type inferred
    }
    
    @Test
    public void testInferThisType_withJSDocAndNoOwnerNode_ownerIgnored() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        JSTypeExpression thisTypeExpr = new JSTypeExpression(Node.newString(Token.STRING, "ExplicitThis"), sourceName); // Use Node.newString
        jsDocInfo.setThisType(thisTypeExpr);
        registry.declareType("ExplicitThis", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        // Pass null for ownerNode, so JSDoc type should be used.
        FunctionType result = builder.inferThisType(jsDocInfo, (Node) null).buildAndRegister();

        assertNotNull(result.getTypeOfThis());
        assertEquals("ExplicitThis", result.getTypeOfThis().toString());
    }
    
    @Test
    public void testInferInheritance_interfaceWithBaseType() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setInterface(true);
        JSTypeExpression baseTypeExpr = new JSTypeExpression(Node.newString(Token.STRING, "BaseInterface"), sourceName); // Use Node.newString
        jsDocInfo.setBaseType(baseTypeExpr);

        // Register the base interface
        registry.declareType("BaseInterface", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferInheritance(jsDocInfo).buildAndRegister();

        assertTrue(result.isInterface());
        assertNotNull(builder.baseType); // Accessing the field directly
        assertEquals("BaseInterface", builder.baseType.getReferenceName());
    }

    @Test
    public void testBuildAndRegister_withImplementedInterfaces() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setConstructor(true);
        
        JSTypeExpression iface1Expr = new JSTypeExpression(Node.newString(Token.STRING, "Iface1"), sourceName); // Use Node.newString
        JSTypeExpression iface2Expr = new JSTypeExpression(Node.newString(Token.STRING, "Iface2"), sourceName); // Use Node.newString
        jsDocInfo.addImplementedInterface(iface1Expr);
        jsDocInfo.addImplementedInterface(iface2Expr);

        // Register interfaces
        registry.declareType("Iface1", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);
        registry.declareType("Iface2", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        // Directly set implementedInterfaces field for testing
        builder.implementedInterfaces = Lists.newArrayList();
        builder.implementedInterfaces.add(registry.getType("Iface1").toObjectType());
        builder.implementedInterfaces.add(registry.getType("Iface2").toObjectType());
        
        builder.parametersNode = new FunctionParamBuilder(registry).build();
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType result = builder.buildAndRegister();

        assertTrue(result.isConstructor());
        assertNotNull(result.implementedInterfaces); // Check the returned FunctionType's field
        assertEquals(2, result.implementedInterfaces.size());
        assertEquals("Iface1", result.implementedInterfaces.get(0).getReferenceName());
        assertEquals("Iface2", result.implementedInterfaces.get(1).getReferenceName());
    }

    // New tests for unexercised public methods

    @Test
    public void testInferThisType_withOwnerNodeAndJSDoc_ownerWins() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        // JSDoc @this type
        JSDocInfo jsDocInfo = new JSDocInfo();
        JSTypeExpression jsDocThisExpr = new JSTypeExpression(Node.newString(Token.STRING, "JsDocThis"), sourceName); // Use Node.newString
        jsDocInfo.setThisType(jsDocThisExpr);
        registry.declareType("JsDocThis", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        // Owner node type
        Node ownerNode = Node.newString(Token.STRING, "OwnerThis"); // Use Node.newString
        ownerNode.putProp(Node.NAME_PROP, "OwnerThis");
        registry.declareType("OwnerThis", ownerNode, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("method", compiler, errorRoot, sourceName, scope);
        // When both JSDoc and owner node are present, owner node should take precedence.
        FunctionType result = builder.inferThisType(jsDocInfo, ownerNode).buildAndRegister();

        assertNotNull(result.getTypeOfThis());
        assertEquals("OwnerThis", result.getTypeOfThis().toString());
    }

    @Test
    public void testInferInheritance_interfaceWithImplementedInterface() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setInterface(true);
        JSTypeExpression ifaceExpr = new JSTypeExpression(Node.newString(Token.STRING, "ImplementedIface"), sourceName); // Use Node.newString
        jsDocInfo.addImplementedInterface(ifaceExpr);

        // Register the implemented interface
        registry.declareType("ImplementedIface", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferInheritance(jsDocInfo).buildAndRegister();

        assertTrue(result.isInterface());
        assertNotNull(builder.implementedInterfaces);
        assertEquals(1, builder.implementedInterfaces.size());
        assertEquals("ImplementedIface", builder.implementedInterfaces.get(0).getReferenceName());
    }
    
    @Test
    public void testInferParameterTypes_optionalArgAtEnd() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addParameter("required", null);
        JSTypeExpression reqType = new JSTypeExpression(Node.newString(Token.STRING, "string"), sourceName); // Use Node.newString
        jsDocInfo.addParameterType("required", reqType);

        jsDocInfo.addParameter("optionalArg", null);
        JSTypeExpression optType = new JSTypeExpression(Node.newString(Token.STRING, "number"), sourceName); // Use Node.newString
        optType.setOptionalArg(true);
        jsDocInfo.addParameterType("optionalArg", optType);

        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "required"));
        lp.addChildToBack(Node.newString(Token.NAME, "optionalArg"));

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferParameterTypes(lp, jsDocInfo).buildAndRegister();

        assertNotNull(result.getParametersNode());
        assertEquals(2, result.getParametersNode().getChildCount());
        assertTrue(result.getParametersNode().getChildAtIndex(1).isOptionalArg()); // Last arg is optional
    }
    
    @Test
    public void testInferParameterTypes_varArgsMustBeLast() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.addParameter("varArg", null);
        JSTypeExpression varType = new JSTypeExpression(Node.newString(Token.STRING, "boolean"), sourceName); // Use Node.newString
        varType.setVarArgs(true);
        jsDocInfo.addParameterType("varArg", varType);

        jsDocInfo.addParameter("requiredAfterVarArg", null);
        JSTypeExpression reqType = new JSTypeExpression(Node.newString(Token.STRING, "string"), sourceName); // Use Node.newString
        jsDocInfo.addParameterType("requiredAfterVarArg", reqType);

        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "varArg"));
        lp.addChildToBack(Node.newString(Token.NAME, "requiredAfterVarArg"));

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        // This should trigger a warning about var_args must be last.
        builder.inferParameterTypes(lp, jsDocInfo);
        
        assertNotNull(builder.parametersNode);
        assertEquals(2, builder.parametersNode.getChildCount());
        assertTrue(builder.parametersNode.getChildAtIndex(0).isVarArgsParameter());
        assertFalse(builder.parametersNode.getChildAtIndex(1).isVarArgsParameter());
    }
    
    @Test
    public void testInferThisType_noJSDocNoOwner() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType result = builder.inferThisType(null, (Node) null).buildAndRegister(); // No JSDoc, no owner

        assertNotNull(result.getTypeOfThis());
        assertEquals("unknown", result.getTypeOfThis().toString()); // Should default to unknown
    }

    @Test
    public void testInferInheritance_noConstructorOrInterface() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        JSDocInfo jsDocInfo = new JSDocInfo();
        JSTypeExpression baseTypeExpr = new JSTypeExpression(Node.newString(Token.STRING, "Base"), sourceName); // Use Node.newString
        jsDocInfo.setBaseType(baseTypeExpr); // Base type without @constructor or @interface

        registry.declareType("Base", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyFunction", compiler, errorRoot, sourceName, scope);
        builder.inferInheritance(jsDocInfo); // Should not set baseType or issue errors for non-constructor/interface

        assertNull(builder.baseType); // baseType should remain null
    }

    @Test
    public void testBuildAndRegister_withBaseTypeAndImplementedInterfaces() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        ObjectType baseType = registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        baseType.setReferenceName("Base");
        
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setConstructor(true);
        jsDocInfo.setBaseType(new JSTypeExpression(Node.newString(Token.STRING, "Base"), sourceName)); // Use Node.newString
        
        JSTypeExpression ifaceExpr = new JSTypeExpression(Node.newString(Token.STRING, "MyInterface"), sourceName); // Use Node.newString
        jsDocInfo.addImplementedInterface(ifaceExpr);

        registry.declareType("Base", null, baseType, null, false);
        registry.declareType("MyInterface", null, registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))), null, false);

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        builder.baseType = baseType;
        builder.implementedInterfaces = Lists.newArrayList();
        builder.implementedInterfaces.add(registry.getType("MyInterface").toObjectType());
        builder.parametersNode = new FunctionParamBuilder(registry).build();
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType result = builder.buildAndRegister();

        assertTrue(result.isConstructor());
        assertNotNull(result.baseType);
        assertEquals("Base", result.baseType.getReferenceName());
        assertNotNull(result.implementedInterfaces);
        assertEquals(1, result.implementedInterfaces.size());
        assertEquals("MyInterface", result.implementedInterfaces.get(0).getReferenceName());
    }
    
    @Test
    public void testIsFunctionType_ordinaryFunction() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, sourceName, scope);
        FunctionType functionType = builder.buildAndRegister();
        assertTrue(functionType.isFunctionType());
    }

    @Test
    public void testIsFunctionType_constructor() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyCtor", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        FunctionType functionType = builder.buildAndRegister();
        assertTrue(functionType.isFunctionType());
    }

    @Test
    public void testIsFunctionType_interface() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        builder.isInterface = true;
        FunctionType functionType = builder.buildAndRegister();
        assertTrue(functionType.isFunctionType());
    }
    
    @Test
    public void testGetTemplateTypeName_setAndGet() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        builder.templateTypeName = "MyTemplate";
        FunctionType functionType = builder.buildAndRegister();
        assertEquals("MyTemplate", functionType.getTemplateTypeName());
    }

    @Test
    public void testSetPrototypeBasedOn_setsImplicitPrototype() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        ObjectType baseProto = registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        baseProto.setReferenceName("BasePrototype");

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        FunctionType ctor = builder.buildAndRegister(); // Build first to get the FunctionType
        
        ctor.setPrototypeBasedOn(baseProto); // Call the method directly on the FunctionType

        assertNotNull(ctor.getPrototype());
        assertNotNull(ctor.getPrototype().getImplicitPrototype());
        assertEquals("BasePrototype", ctor.getPrototype().getImplicitPrototype().getReferenceName());
    }
    
    @Test
    public void testSetPrototype_validPrototype() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        FunctionType ctor = builder.buildAndRegister();

        FunctionPrototypeType newProto = new FunctionPrototypeType(registry, ctor, null);
        
        assertTrue(ctor.setPrototype(newProto)); // Should return true for a successful set
        assertSame(newProto, ctor.getPrototype());
    }

    @Test
    public void testSetPrototype_invalidPrototype_null() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        FunctionType ctor = builder.buildAndRegister();
        
        assertFalse(ctor.setPrototype(null));
    }
    
    @Test
    public void testGetImplementedInterfaces_empty() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        FunctionType functionType = builder.buildAndRegister();

        assertTrue(functionType.getImplementedInterfaces().isEmpty());
    }

    @Test
    public void testGetImplementedInterfaces_withOneInterface() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        ObjectType ifaceType = registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        ifaceType.setReferenceName("MyInterface");
        
        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        builder.implementedInterfaces = Lists.newArrayList(ifaceType);
        FunctionType functionType = builder.buildAndRegister();

        Iterable<ObjectType> interfaces = functionType.getImplementedInterfaces();
        assertEquals(1, Iterables.size(interfaces));
        assertEquals("MyInterface", Iterables.get(interfaces, 0).getReferenceName());
    }
    
    @Test
    public void testHasProperty_prototype() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        FunctionType functionType = builder.buildAndRegister();

        assertTrue(functionType.hasProperty("prototype"));
    }

    @Test
    public void testHasOwnProperty_prototype() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        FunctionType functionType = builder.buildAndRegister();

        assertTrue(functionType.hasOwnProperty("prototype"));
    }
    
    @Test
    public void testGetPropertyType_prototype() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        FunctionType functionType = builder.buildAndRegister();

        JSType protoType = functionType.getPropertyType("prototype");
        assertNotNull(protoType);
        assertTrue(protoType.isFunctionPrototypeType());
    }

    @Test
    public void testGetLeastSupertype_identicalTypes() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        FunctionType funcType1 = builder.buildAndRegister();
        
        FunctionTypeBuilder builder2 = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        FunctionType funcType2 = builder2.buildAndRegister();

        JSType superType = funcType1.getLeastSupertype(funcType2);
        assertSame(funcType1, superType);
    }

    @Test
    public void testGetGreatestSubtype_identicalTypes() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        FunctionType funcType1 = builder.buildAndRegister();
        
        FunctionTypeBuilder builder2 = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        FunctionType funcType2 = builder2.buildAndRegister();

        JSType subType = funcType1.getGreatestSubtype(funcType2);
        assertSame(funcType1, subType);
    }

    @Test
    public void testGetSuperClassConstructor_noSuperClass() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        FunctionType functionType = builder.buildAndRegister();

        assertNull(functionType.getSuperClassConstructor());
    }
    
    @Test
    public void testGetTemplateTypeName_nullIfNoneSet() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
        FunctionType functionType = builder.buildAndRegister();

        assertNull(functionType.getTemplateTypeName());
    }
    
    @Test
    public void testIsEquivalentTo_differentTypes() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder1 = new FunctionTypeBuilder("Func1", compiler, errorRoot, sourceName, scope);
        FunctionType func1 = builder1.buildAndRegister();

        FunctionTypeBuilder builder2 = new FunctionTypeBuilder("Func2", compiler, errorRoot, sourceName, scope);
        FunctionType func2 = builder2.buildAndRegister();

        assertFalse(func1.isEquivalentTo(func2));
    }

    @Test
    public void testIsEquivalentTo_constructorAndOrdinaryFunction() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder1 = new FunctionTypeBuilder("Ctor", compiler, errorRoot, sourceName, scope);
        builder1.isConstructor = true;
        FunctionType ctor = builder1.buildAndRegister();

        FunctionTypeBuilder builder2 = new FunctionTypeBuilder("Func", compiler, errorRoot, sourceName, scope);
        FunctionType func = builder2.buildAndRegister();

        assertFalse(ctor.isEquivalentTo(func));
    }
    
    @Test
    public void testHasEqualCallType_differentParameters() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder1 = new FunctionTypeBuilder("Func1", compiler, errorRoot, sourceName, scope);
        Node params1 = new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE)).build();
        builder1.parametersNode = params1;
        FunctionType func1 = builder1.buildAndRegister();

        FunctionTypeBuilder builder2 = new FunctionTypeBuilder("Func2", compiler, errorRoot, sourceName, scope);
        Node params2 = new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.STRING_TYPE)).build();
        builder2.parametersNode = params2;
        FunctionType func2 = builder2.buildAndRegister();

        assertFalse(func1.hasEqualCallType(func2));
    }

    @Test
    public void testIsSubtype_interfaceIsSubtypeOfAnyFunction() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        builder.isInterface = true;
        FunctionType interfaceType = builder.buildAndRegister();

        FunctionTypeBuilder builder2 = new FunctionTypeBuilder("MyFunction", compiler, errorRoot, sourceName, scope);
        FunctionType ordinaryFunctionType = builder2.buildAndRegister();

        assertTrue(interfaceType.isSubtype(ordinaryFunctionType));
    }

    @Test
    public void testIsSubtype_ordinaryFunctionIsSubtypeOfInterface() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder ordinaryBuilder = new FunctionTypeBuilder("MyFunction", compiler, errorRoot, sourceName, scope);
        FunctionType ordinaryFunctionType = ordinaryBuilder.buildAndRegister();

        FunctionTypeBuilder interfaceBuilder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        interfaceBuilder.isInterface = true;
        FunctionType interfaceType = interfaceBuilder.buildAndRegister();

        assertFalse(ordinaryFunctionType.isSubtype(interfaceType));
    }
    
    @Test
    public void testGetInstanceType_constructor() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyConstructor", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        FunctionType functionType = builder.buildAndRegister();

        assertNotNull(functionType.getInstanceType());
        assertEquals("MyConstructor", functionType.getInstanceType().getReferenceName());
    }
    
    @Test
    public void testGetSource_setAndGet() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        Node sourceNode = Node.newString(Token.FUNCTION, ""); // Use Node.newString
        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        builder.setSourceNode(sourceNode);
        FunctionType functionType = builder.buildAndRegister();

        assertNotNull(functionType.getSource());
        assertSame(sourceNode, functionType.getSource());
    }

    @Test
    public void testGetSubTypes_empty() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyBase", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        FunctionType baseFunc = builder.buildAndRegister();

        assertNull(baseFunc.getSubTypes());
    }

    @Test
    public void testGetSubTypes_withOneSubType() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder baseBuilder = new FunctionTypeBuilder("MyBase", compiler, errorRoot, sourceName, scope);
        baseBuilder.isConstructor = true;
        FunctionType baseFunc = baseBuilder.buildAndRegister();

        FunctionTypeBuilder subBuilder = new FunctionTypeBuilder("MyDerived", compiler, errorRoot, sourceName, scope);
        subBuilder.isConstructor = true;
        ObjectType baseProto = registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        baseProto.setReferenceName("Base");
        subBuilder.baseType = baseProto;
        FunctionType subFunc = subBuilder.buildAndRegister();
        
        // Manually set prototype based on for the base to simulate inheritance
        baseFunc.setPrototypeBasedOn(registry.createObjectType(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE))));

        // This is a bit tricky as addSubType is called internally by setPrototype.
        // We need to ensure the inheritance is correctly established.
        // A direct call to setPrototypeBasedOn on the base type is needed.
        
        // Rebuild to ensure correct inheritance chain is processed by setPrototype.
        FunctionTypeBuilder baseBuilderForInheritance = new FunctionTypeBuilder("MyBase", compiler, errorRoot, sourceName, scope);
        baseBuilderForInheritance.isConstructor = true;
        FunctionType baseFuncForInheritance = baseBuilderForInheritance.buildAndRegister();

        FunctionTypeBuilder derivedBuilder = new FunctionTypeBuilder("MyDerived", compiler, errorRoot, sourceName, scope);
        derivedBuilder.isConstructor = true;
        ObjectType baseTypeObj = registry.createObjectType(baseFuncForInheritance);
        baseTypeObj.setReferenceName("MyBase");
        derivedBuilder.baseType = baseTypeObj; // Set the base type
        FunctionType derivedFunc = derivedBuilder.buildAndRegister();
        
        // This call correctly establishes the inheritance and calls addSubType
        derivedFunc.setPrototypeBasedOn(baseFuncForInheritance.getPrototype()); 

        List<FunctionType> subTypes = baseFuncForInheritance.getSubTypes();
        assertNotNull(subTypes);
        assertEquals(1, subTypes.size());
        assertSame(derivedFunc, subTypes.get(0));
    }
    
    @Test
    public void testHasCachedValues_whenPrototypeSet() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        FunctionType functionType = builder.buildAndRegister();

        assertFalse(functionType.hasCachedValues()); // Initially false

        FunctionPrototypeType newProto = new FunctionPrototypeType(registry, functionType, null);
        functionType.setPrototype(newProto);

        assertTrue(functionType.hasCachedValues());
    }
    
    @Test
    public void testToString_ordinaryFunction() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, sourceName, scope);
        Node params = new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE)).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        builder.thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType functionType = builder.buildAndRegister();

        assertEquals("function (this:Object, number): string", functionType.toString());
    }

    @Test
    public void testToString_constructorWithThisType() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyCtor", compiler, errorRoot, sourceName, scope);
        builder.isConstructor = true;
        builder.thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE); // Explicit this type
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType functionType = builder.buildAndRegister();

        assertEquals("function (this:Object): void", functionType.toString());
    }

    @Test
    public void testToString_interface() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        builder.isInterface = true;
        Node params = new FunctionParamBuilder(registry).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        FunctionType functionType = builder.buildAndRegister();

        assertEquals("function (): void", functionType.toString());
    }
    
    @Test
    public void testIsSubtype_ordinaryToInterface() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder ordinaryBuilder = new FunctionTypeBuilder("OrdinaryFunc", compiler, errorRoot, sourceName, scope);
        FunctionType ordinaryFunc = ordinaryBuilder.buildAndRegister();

        FunctionTypeBuilder interfaceBuilder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        interfaceBuilder.isInterface = true;
        FunctionType interfaceType = interfaceBuilder.buildAndRegister();

        assertFalse(ordinaryFunc.isSubtype(interfaceType));
    }

    @Test
    public void testIsSubtype_interfaceToOrdinary() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder ordinaryBuilder = new FunctionTypeBuilder("OrdinaryFunc", compiler, errorRoot, sourceName, scope);
        FunctionType ordinaryFunc = ordinaryBuilder.buildAndRegister();

        FunctionTypeBuilder interfaceBuilder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        interfaceBuilder.isInterface = true;
        FunctionType interfaceType = interfaceBuilder.buildAndRegister();

        assertTrue(interfaceType.isSubtype(ordinaryFunc));
    }
    
    @Test
    public void testGetInstanceType_interface() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        builder.isInterface = true;
        FunctionType functionType = builder.buildAndRegister();

        // For interfaces, getInstanceType should return the typeOfThis (which is an instance of the interface itself)
        assertNotNull(functionType.getInstanceType());
        assertEquals("MyInterface", functionType.getInstanceType().getReferenceName());
    }

    @Test
    public void testGetSource_nullIfNotSet() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        // Don't call setSourceNode
        FunctionType functionType = builder.buildAndRegister();

        assertNull(functionType.getSource());
    }
    
    @Test
    public void testGetSubTypes_nullIfNone() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyFunc", compiler, errorRoot, sourceName, scope);
        FunctionType functionType = builder.buildAndRegister();

        assertNull(functionType.getSubTypes());
    }
    
    @Test
    public void testHasCachedValues_initiallyFalse() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyClass", compiler, errorRoot, sourceName, scope);
        FunctionType functionType = builder.buildAndRegister();

        assertFalse(functionType.hasCachedValues());
    }
    
    @Test
    public void testToString_interfaceWithParams() throws Exception {
        AbstractCompiler compiler = createCompiler();
        JSTypeRegistry registry = createRegistry(compiler);
        Scope scope = createScope(compiler);
        Node errorRoot = Node.newString(Token.STRING, "");
        String sourceName = "test.js";

        FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, sourceName, scope);
        builder.isInterface = true;
        Node params = new FunctionParamBuilder(registry).addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE)).build();
        builder.parametersNode = params;
        builder.returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        FunctionType functionType = builder.buildAndRegister();

        assertEquals("function (number): void", functionType.toString());
    }
}
