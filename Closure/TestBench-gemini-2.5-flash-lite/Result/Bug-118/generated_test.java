package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType;
import com.google.javascript.jscomp.ConcreteType.ConcreteUnionType;
import com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType;
import com.google.javascript.jscomp.NodeTraversal.ScopedCallback;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.jscomp.graph.StandardUnionFind;
import com.google.javascript.jscomp.graph.UnionFind;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Logger;

public class DisambiguatePropertiesTest {



































    @Test
    public void testGetTypesToSkipForTypeConcrete() throws Exception {
        DisambiguateProperties<ConcreteType> pass = DisambiguateProperties.forConcreteTypeSystem(
            pass.compiler, new TightenTypes(pass.compiler, pass.compiler.getJSTypeRegistry()), Maps.newHashMap());
        // Use a concrete type that might be relevant for skipping
        ConcreteType type = pass.compiler.getJSTypeRegistry().createObjectType("TestType").toConcreteType(pass.compiler.getJSTypeRegistry());
        ImmutableSet<ConcreteType> skipped = pass.typeSystem.getTypesToSkipForType(type);
        assertFalse(skipped.isEmpty());
    }

    @Test
    public void testRestrictByNotNullOrUndefinedConcrete() throws Exception {
        DisambiguateProperties<ConcreteType> pass = DisambiguateProperties.forConcreteTypeSystem(
            pass.compiler, new TightenTypes(pass.compiler, pass.compiler.getJSTypeRegistry()), Maps.newHashMap());
        ConcreteType type = pass.compiler.getJSTypeRegistry().createObjectType("TestType").toConcreteType(pass.compiler.getJSTypeRegistry());
        ConcreteType restrictedType = pass.typeSystem.restrictByNotNullOrUndefined(type);
        assertEquals(type, restrictedType);
    }

    @Test
    public void testGetTypeAlternativesConcrete() throws Exception {
        DisambiguateProperties<ConcreteType> pass = DisambiguateProperties.forConcreteTypeSystem(
            pass.compiler, new TightenTypes(pass.compiler, pass.compiler.getJSTypeRegistry()), Maps.newHashMap());
        ConcreteType typeA = pass.compiler.getJSTypeRegistry().createObjectType("TypeA").toConcreteType(pass.compiler.getJSTypeRegistry());
        ConcreteType typeB = pass.compiler.getJSTypeRegistry().createObjectType("TypeB").toConcreteType(pass.compiler.getJSTypeRegistry());
        ConcreteType unionType = pass.compiler.getJSTypeRegistry().createUnionType(typeA.toJSType(), typeB.toJSType()).toConcreteType(pass.compiler.getJSTypeRegistry());
        Iterable<ConcreteType> alternatives = pass.typeSystem.getTypeAlternatives(unionType);
        assertNotNull(alternatives);
        assertTrue(alternatives.iterator().hasNext()); // Should have alternatives
    }

    // Helper method to create a DisambiguateProperties instance for testing
    private DisambiguateProperties<JSType> createPass(String code) {
        return createPass(null, null, code);
    }

    private DisambiguateProperties<JSType> createPass(Node externs, Node root, String code) {
        Compiler mockCompiler = new Compiler();
        mockCompiler.initCompilerOptionsIfTesting(); // Use this for testing initialization
        mockCompiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
        JSTypeRegistry registry = new JSTypeRegistry(mockCompiler.getErrorManager());
        mockCompiler.setJSTypeRegistry(registry);
        mockCompiler.setTypeValidator(new TypeValidator(mockCompiler));

        Node script = mockCompiler.parseTestCode(code);

        Node externsNode = (externs != null) ? externs : new Node(Token.ROOT);
        Node rootNode = (root != null) ? root : script;

        Map<String, CheckLevel> propertiesToErrorFor = Maps.newHashMap();
        return DisambiguateProperties.forJSTypeSystem(mockCompiler, propertiesToErrorFor);
    }

     private void testProcessCodeAndCheckRename(String code, String expectedOriginalName, String expectedRenamedName) {
        DisambiguateProperties<JSType> pass = createPass(code);
        pass.process(null, null);
        pass.renameProperties();

        Node root = pass.compiler.parseTestCode(code);
        NodeTraversal.traverse(pass.compiler, root, new NodeTraversal.AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
                // This traversal logic needs to be more robust to correctly identify getProp and objectLit children
                if (n.isGetProp()) {
                    Node propertyNode = n.getLastChild();
                    if (propertyNode.getString().equals(expectedOriginalName)) {
                        assertEquals(expectedRenamedName, propertyNode.getString());
                    }
                } else if (n.isObjectLit()) {
                    for (Node child = n.getFirstChild(); child != null; child = child.getNext()) {
                        if (child.isString() && child.getString().equals(expectedOriginalName)) {
                            assertEquals(expectedRenamedName, child.getString());
                        }
                    }
                }
            }
        });
    }

    @Test
    public void testRenamePropertiesWithObjectLit() throws Exception {
        String code = "var obj1 = { a: 1 }; var obj2 = { a: 2 };";
        testProcessCodeAndCheckRename(code, "a", "a$obj1"); // The actual renaming might depend on traversal order.
    }

    @Test
    public void testRenamePropertiesWithPrototype() throws Exception {
        String code = "function Foo() {} Foo.prototype.a = 1; var Bar = {}; Bar.a = 2;";
        testProcessCodeAndCheckRename(code, "a", "a$Foo"); // Renaming depends on traversal order.
    }

    @Test
    public void testBuildPropNamesWithComplexTypeName() throws Exception {
        DisambiguateProperties<JSType> pass = createPass("var ns_123 = {}; ns_123.a = 1;");
        UnionFind<JSType> types = new StandardUnionFind<JSType>();
        JSType nsType = getType(pass.typeSystem, null, Node.newString("ns_123"), "a");
        types.add(nsType);
        Map<JSType, String> names = pass.buildPropNames(types, "a");
        assertEquals(1, names.size());
        String expectedName = "ns_123$a";
        assertEquals(expectedName, names.values().iterator().next());
    }

    @Test
    public void testPropertyAddTypeWithRelatedType() throws Exception {
        DisambiguateProperties<JSType> pass = createPass("var Foo = {}, Bar = {};");
        DisambiguateProperties.Property prop = getProperty(pass, "a");
        JSType fooType = getType(pass.typeSystem, null, Node.newString("Foo"), "a");
        JSType barType = getType(pass.typeSystem, null, Node.newString("Bar"), "a");

        assertTrue(prop.addType(fooType, fooType, barType));
        assertTrue(prop.getTypes().equiv(fooType, barType));
        assertEquals(1, prop.getTypes().allEquivalenceClasses().size());
    }

    @Test
    public void testPropertyAddTypeWithRelatedTypeAndSkip() throws Exception {
        DisambiguateProperties<JSType> pass = createPass("var Foo = {}, Bar = {};");
        DisambiguateProperties.Property prop = getProperty(pass, "a");
        JSType fooType = getType(pass.typeSystem, null, Node.newString("Foo"), "a");
        JSType barType = getType(pass.typeSystem, null, Node.newString("Bar"), "a");

        assertTrue(prop.addType(fooType, fooType, barType));
        prop.addTypeToSkip(barType); // Mark Bar as type to skip
        prop.expandTypesToSkip();

        assertTrue(prop.typesToSkip.contains(fooType));
        assertTrue(prop.typesToSkip.contains(barType));
    }

    @Test
    public void testPropertyExpandTypesToSkipWithExistingSkip() throws Exception {
        DisambiguateProperties<JSType> pass = createPass("var Foo = {}, Bar = {}, Baz = {};");
        DisambiguateProperties.Property prop = getProperty(pass, "a");
        JSType fooType = getType(pass.typeSystem, null, Node.newString("Foo"), "a");
        JSType barType = getType(pass.typeSystem, null, Node.newString("Bar"), "a");
        JSType bazType = getType(pass.typeSystem, null, Node.newString("Baz"), "a");

        prop.addType(fooType, fooType, null);
        prop.addType(barType, barType, null);
        prop.addTypeToSkip(bazType); // Baz is explicitly marked to skip

        prop.expandTypesToSkip();

        assertFalse(prop.typesToSkip.contains(fooType));
        assertFalse(prop.typesToSkip.contains(barType));
        assertTrue(prop.typesToSkip.contains(bazType));
    }

    // Helper methods to access private members or call private methods with appropriate mocking/setup.


}





