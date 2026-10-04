package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.FunctionBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.FunctionPrototypeType; // Corrected import
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
import com.google.javascript.rhino.ErrorReporter; // Corrected import
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import com.google.javascript.jscomp.Compiler; // Corrected import
import com.google.javascript.jscomp.CompilerOptions; // Corrected import
import com.google.javascript.jscomp.ErrorManager; // Corrected import
import java.io.PrintStream; // Corrected import

public class FunctionTypeBuilderTest {

    // Helper to create a basic compiler and type registry for testing.

    private static JSTypeRegistry createRegistry(AbstractCompiler compiler) {
        return compiler.getTypeRegistry();
    }

    private static Scope createScope(AbstractCompiler compiler) {
        Node script = new Node(Token.SCRIPT); // Use Token.SCRIPT for script node
        return new TypedScopeCreator(compiler).createScope(script, null);
    }




    

















    





    

    
    


    // New tests for unexercised public methods


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
        assertNotNull(result.getImplementedInterfaces());
        assertEquals(1, Iterables.size(result.getImplementedInterfaces()));
        assertEquals("ImplementedIface", Iterables.get(result.getImplementedInterfaces(), 0).getReferenceName());
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

        // Cannot access private field 'baseType'. Testing the effect on the built FunctionType.
        // If inferInheritance does nothing for non-constructor/interface, the resulting type should reflect that.
        FunctionType result = builder.buildAndRegister();
        assertFalse(result.isConstructor());
        assertFalse(result.isInterface());
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
        // Check base type and implemented interfaces on the result.
        assertNotNull(result.getPrototype().getImplicitPrototype());
        assertEquals("Base", result.getPrototype().getImplicitPrototype().getReferenceName());
        assertNotNull(result.getImplementedInterfaces());
        assertEquals(1, Iterables.size(result.getImplementedInterfaces()));
        assertEquals("MyInterface", Iterables.get(result.getImplementedInterfaces(), 0).getReferenceName());
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

        FunctionTypeBuilder derivedBuilder = new FunctionTypeBuilder("MyDerived", compiler, errorRoot, sourceName, scope);
        derivedBuilder.isConstructor = true;
        
        // To simulate inheritance and trigger addSubType, we need to correctly set up the base type for the derived class.
        ObjectType baseTypeObj = registry.createObjectType(baseFunc);
        baseTypeObj.setReferenceName("MyBase");
        derivedBuilder.baseType = baseTypeObj;
        
        FunctionType derivedFunc = derivedBuilder.buildAndRegister();
        
        // The addSubType method is called internally by setPrototype.
        // We can indirectly test this by ensuring the base function has subtypes after the derived is built.
        // A more direct test would involve accessing internal methods if they were protected/package-private and public.
        // For now, we rely on the fact that `buildAndRegister` for derived calls `maybeSetBaseType` which calls `setPrototypeBasedOn`.

        List<FunctionType> subTypes = baseFunc.getSubTypes();
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





