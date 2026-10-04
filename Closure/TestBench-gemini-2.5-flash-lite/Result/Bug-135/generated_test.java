package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.DefinitionsRemover.Definition;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.Collection;
import java.util.List;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Collections;
import java.util.Set;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.PassConfig;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.SimpleDefinitionFinder;
import com.google.javascript.jscomp.DefinitionSite;
import com.google.javascript.jscomp.UseSite;
import com.google.javascript.jscomp.JSModule;

public class DevirtualizePrototypeMethodsTest {

    // Mock AbstractCompiler for testing purposes

    // Mock classes for SimpleDefinitionFinder



    private static class MockSimpleDefinitionFinder extends SimpleDefinitionFinder {
        private final Collection<DefinitionSite> definitionSites = Lists.newArrayList();
        private final java.util.Map<Node, Collection<Definition>> definitionsReferencedAtMap = new java.util.HashMap<>();
        private final java.util.Map<Definition, Collection<UseSite>> definitionUseSitesMap = new java.util.HashMap<>();

        MockSimpleDefinitionFinder(AbstractCompiler compiler) {
            super(compiler);
        }

        void addDefinitionSite(DefinitionSite ds) { definitionSites.add(ds); }
        void addDefinitionReference(Node node, Definition def) { definitionsReferencedAtMap.computeIfAbsent(node, k -> new java.util.ArrayList<>()).add(def); }
        void addDefinitionUseSite(Definition def, UseSite us) { definitionUseSitesMap.computeIfAbsent(def, k -> new java.util.ArrayList<>()).add(us); }

        @Override public Collection<DefinitionSite> getDefinitionSites() { return definitionSites; }
        @Override public Collection<UseSite> getUseSites(Definition definition) { return definitionUseSitesMap.getOrDefault(definition, Collections.emptyList()); }
        @Override public Collection<Definition> getDefinitionsReferencedAt(Node node) { return definitionsReferencedAtMap.getOrDefault(node, Collections.emptyList()); }
    }


    private DevirtualizePrototypeMethods createPass(AbstractCompiler compiler) {
        return new DevirtualizePrototypeMethods(compiler);
    }


























    @Test
    public void testFixFunctionType_nullThis() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        JSType returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);

        FunctionType originalType = new FunctionType(registry, "myFunc", null, null, returnType, null);

        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(originalType);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.fixFunctionType(functionNode);

        FunctionType rewrittenType = (FunctionType) functionNode.getJSType();

        Node paramsNode = rewrittenType.getParametersNode();
        assertEquals(1, paramsNode.getChildCount());
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), paramsNode.getFirstChild().getJSType());
    }

    @Test
    public void testFixFunctionType_constructorWithPrototype() throws Exception {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        ObjectType proto = registry.createObjectType("MyProto");

        FunctionType originalType = new FunctionType(registry, "MyConstructor", null, null, registry.getNativeType(JSTypeNative.VOID_TYPE), null, null, true, false);
        originalType.setPrototype(new FunctionPrototypeType(registry, originalType, proto));

        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(originalType);

        DevirtualizePrototypeMethods pass = createPass(compiler);
        pass.fixFunctionType(functionNode);

        FunctionType rewrittenType = (FunctionType) functionNode.getJSType();
        assertEquals(originalType.getInstanceType(), rewrittenType.getTypeOfThis());
        assertEquals(proto, rewrittenType.getPrototype());
    }

    @Test
    public void testIsInstanceType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        assertFalse(new FunctionType(registry, "test", null).isInstanceType());
        assertTrue(registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE).isInstanceType());
    }

    @Test
    public void testIsConstructor() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType constructorFunc = new FunctionType(registry, "test", null, null, null, null, null, true, false);
        assertTrue(constructorFunc.isConstructor());
        FunctionType ordinaryFunc = new FunctionType(registry, "test", null);
        assertTrue(ordinaryFunc.isOrdinaryFunction());
        assertFalse(ordinaryFunc.isConstructor());
    }

    @Test
    public void testIsInterface() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType interfaceFunc = new FunctionType(registry, "TestInterface", null);
        interfaceFunc.kind = FunctionType.Kind.INTERFACE;
        assertTrue(interfaceFunc.isInterface());
    }

    @Test
    public void testIsOrdinaryFunction() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ordinaryFunc = new FunctionType(registry, "test", null);
        assertTrue(ordinaryFunc.isOrdinaryFunction());
    }

    @Test
    public void testIsFunctionType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        assertTrue(new FunctionType(registry, "test", null).isFunctionType());
        assertFalse(registry.getNativeType(JSTypeNative.OBJECT_TYPE).isFunctionType());
    }

    @Test
    public void testCanBeCalled() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        assertTrue(new FunctionType(registry, "test", null).canBeCalled());
    }

    @Test
    public void testGetParameters() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node param1 = Node.newString("p1");
        Node lp = new Node(Token.LP, param1);
        FunctionType ft = new FunctionType(registry, "test", null, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(1, Iterables.size(ft.getParameters()));
        assertEquals(param1, Iterables.get(ft.getParameters(), 0));
    }

    @Test
    public void testGetParametersNode() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node param1 = Node.newString("p1");
        Node lp = new Node(Token.LP, param1);
        FunctionType ft = new FunctionType(registry, "test", null, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(lp, ft.getParametersNode());
    }

    @Test
    public void testGetMinArguments() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node p1 = Node.newString("p1");
        Node p2 = Node.newString("p2");
        p2.setOptionalArg(true);
        Node p3 = Node.newString("p3");
        Node lp = new Node(Token.LP, p1, p2, p3);
        FunctionType ft = new FunctionType(registry, "test", null, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(1, ft.getMinArguments());
    }

    @Test
    public void testGetMaxArguments() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node p1 = Node.newString("p1");
        Node p2 = Node.newString("p2");
        p2.setOptionalArg(true);
        Node lp = new Node(Token.LP, p1, p2);
        FunctionType ft = new FunctionType(registry, "test", null, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(2, ft.getMaxArguments());

        Node p3 = Node.newString("p3");
        p3.setVarArgs(true);
        Node lpVarArgs = new Node(Token.LP, p1, p3);
        FunctionType ftVarArgs = new FunctionType(registry, "testVarArgs", null, lpVarArgs, registry.getNativeType(JSTypeNative.VOID_TYPE));
        assertEquals(Integer.MAX_VALUE, ftVarArgs.getMaxArguments());
    }

    @Test
    public void testGetReturnType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        JSType expectedReturnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        FunctionType ft = new FunctionType(registry, "test", null, null, expectedReturnType);
        assertEquals(expectedReturnType, ft.getReturnType());
    }

    @Test
    public void testGetPrototype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertNotNull(ft.getPrototype());
        assertEquals(ft.getPrototype(), registry.getNativeType(JSTypeNative.FUNCTION_PROTOTYPE));
    }

    @Test
    public void testSetPrototypeBasedOn() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ObjectType baseProto = registry.createObjectType("BaseProto");
        ft.setPrototypeBasedOn(baseProto);
        assertEquals(baseProto, ft.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testSetPrototype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        FunctionPrototypeType newProto = new FunctionPrototypeType(registry, ft, null);
        assertTrue(ft.setPrototype(newProto));
        assertEquals(newProto, ft.getPrototype());
    }

    @Test
    public void testGetAllImplementedInterfaces() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertTrue(ft.getAllImplementedInterfaces().isEmpty());
    }

    @Test
    public void testGetImplementedInterfaces() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertTrue(ft.getImplementedInterfaces().isEmpty());
    }

    @Test
    public void testSetImplementedInterfaces() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ObjectType iface1 = registry.createObjectType("Iface1");
        ObjectType iface2 = registry.createObjectType("Iface2");
        List<ObjectType> interfaces = Lists.newArrayList(iface1, iface2);
        ft.setImplementedInterfaces(interfaces);
        assertEquals(2, Iterables.size(ft.getImplementedInterfaces()));
        assertTrue(Iterables.contains(ft.getImplementedInterfaces(), iface1));
        assertTrue(Iterables.contains(ft.getImplementedInterfaces(), iface2));
    }

    @Test
    public void testHasProperty() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.defineProperty("testProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, false);
        assertTrue(ft.hasProperty("testProp"));
        assertTrue(ft.hasProperty("prototype"));
        assertFalse(ft.hasProperty("nonExistent"));
    }

    @Test
    public void testHasOwnProperty() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.defineProperty("testProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, false);
        assertTrue(ft.hasOwnProperty("testProp"));
        assertTrue(ft.hasOwnProperty("prototype"));
        assertFalse(ft.hasOwnProperty("nonExistent"));
    }

    @Test
    public void testGetPropertyType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        JSType propType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ft.defineProperty("testProp", propType, false, false);
        assertEquals(propType, ft.getPropertyType("testProp"));
        assertEquals(ft.getPrototype(), ft.getPropertyType("prototype"));
    }

    @Test
    public void testIsPropertyTypeInferred() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.defineProperty("testProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, false);
        assertTrue(ft.isPropertyTypeInferred("testProp"));
        assertTrue(ft.isPropertyTypeInferred("prototype"));
        assertFalse(ft.isPropertyTypeInferred("nonExistent"));
    }

    @Test
    public void testGetLeastSupertype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "func1", null);
        FunctionType ft2 = new FunctionType(registry, "func2", null);
        assertEquals(registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE), ft1.getLeastSupertype(ft2));
    }

    @Test
    public void testGetGreatestSubtype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "func1", null);
        FunctionType ft2 = new FunctionType(registry, "func2", null);
        assertEquals(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), ft1.getGreatestSubtype(ft2));
    }

    @Test
    public void testGetSuperClassConstructor() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertNull(ft.getSuperClassConstructor());
    }

    @Test
    public void testHasUnknownSupertype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertFalse(ft.hasUnknownSupertype());
    }

    @Test
    public void testGetTopMostDefiningType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.defineProperty("testProp", registry.getNativeType(JSTypeNative.STRING_TYPE), false, false);
        assertEquals(ft, ft.getTopMostDefiningType("testProp"));
    }

    @Test
    public void testEquals() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "test1", null);
        FunctionType ft2 = new FunctionType(registry, "test2", null);
        FunctionType ft3 = new FunctionType(registry, "test1", null);
        assertEquals(ft1, ft1);
        assertNotEquals(ft1, ft2);
        assertEquals(ft1, ft3);
    }

    @Test
    public void testHashCode() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "test1", null);
        FunctionType ft2 = new FunctionType(registry, "test2", null);
        FunctionType ft3 = new FunctionType(registry, "test1", null);
        assertEquals(ft1.hashCode(), ft1.hashCode());
        assertNotEquals(ft1.hashCode(), ft2.hashCode());
        assertEquals(ft1.hashCode(), ft3.hashCode());
    }

    @Test
    public void testHasEqualCallType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "test1", null, null, registry.getNativeType(JSTypeNative.STRING_TYPE));
        FunctionType ft2 = new FunctionType(registry, "test2", null, null, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType ft3 = new FunctionType(registry, "test3", null, null, registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(ft1.hasEqualCallType(ft3));
        assertFalse(ft1.hasEqualCallType(ft2));
    }

    @Test
    public void testToString() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null, null, registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(ft.toString().contains("function ("));
        assertTrue(ft.toString().contains(": string"));
    }

    @Test
    public void testIsSubtype() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft1 = new FunctionType(registry, "func1", null);
        FunctionType ft2 = new FunctionType(registry, "func2", null);
        assertTrue(ft1.isSubtype(ft1));
        assertTrue(ft1.isSubtype(registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)));
    }

    @Test
    public void testVisit() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        class MockVisitor implements FunctionType.Visitor<Boolean> {
            @Override
            public Boolean caseFunctionType(FunctionType type) {
                return true;
            }
        }
        assertTrue(ft.visit(new MockVisitor()));
    }

    @Test
    public void testGetInstanceType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertEquals(ft.getTypeOfThis(), ft.getInstanceType());
    }

    @Test
    public void testHasInstanceType() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertTrue(ft.hasInstanceType());
    }

    @Test
    public void testGetTypeOfThis() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        ObjectType thisType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        FunctionType ft = new FunctionType(registry, "test", null, null, null, thisType);
        assertEquals(thisType, ft.getTypeOfThis());
    }

    @Test
    public void testGetSource() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node sourceNode = new Node(Token.FUNCTION);
        FunctionType ft = new FunctionType(registry, "test", sourceNode);
        assertEquals(sourceNode, ft.getSource());
    }

    @Test
    public void testSetSource() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        Node sourceNode = new Node(Token.FUNCTION);
        FunctionType ft = new FunctionType(registry, "test", null);
        ft.setSource(sourceNode);
        assertEquals(sourceNode, ft.getSource());
    }

    @Test
    public void testGetSubTypes() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertNull(ft.getSubTypes());
    }

    @Test
    public void testHasCachedValues() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null);
        assertFalse(ft.hasCachedValues());
        ft.getPrototype();
        assertTrue(ft.hasCachedValues());
    }

    @Test
    public void testGetTemplateTypeName() {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        FunctionType ft = new FunctionType(registry, "test", null, null, null, null, "T");
        assertEquals("T", ft.getTemplateTypeName());
    }

}





